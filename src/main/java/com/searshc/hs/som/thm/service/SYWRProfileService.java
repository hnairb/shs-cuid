/* 
 * Copyright 2014 (C) Sears Holdings Corp  
 *  
 * Created on : 18-Apr-14
 * Author     : Ranjit Bhakta   
 * 
 *----------------------------------------------------------------------------- 
 * Revision History (Release 1.0.0.0) 
 *----------------------------------------------------------------------------- 
 * VERSION     AUTHOR/      DESCRIPTION OF CHANGE 
 * OLD/NEW     DATE                RFC NO 
 *----------------------------------------------------------------------------- 
 * --/1.0  | Ranjit Bhakta  | Initial Create. 
 *         | 18-Apr-14      | 
 *---------|--------------- |--------------------------------------------------- 
 */
package com.searshc.hs.som.thm.service;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.searshc.hs.som.thm.client.adapter.sywr.SYWRProfileAdapter;
import com.searshc.hs.som.thm.common.CommonConstants;
import com.searshc.hs.som.thm.common.ServiceConstants;
import com.searshc.hs.som.thm.domain.sywr.Additional;
import com.searshc.hs.som.thm.domain.sywr.Epsilon;
import com.searshc.hs.som.thm.domain.sywr.GetMemberLookupReply;
import com.searshc.hs.som.thm.domain.sywr.GetMemberLookupResponse.GetMemberLookupResult;
import com.searshc.hs.som.thm.domain.sywr.Member;
import com.searshc.hs.som.thm.domain.sywr.Members;
import com.searshc.hs.som.thm.domain.sywr.Response;
import com.searshc.hs.som.thm.visitor.CollectionHelper;
import com.searshc.hs.som.thm.visitor.CollectionHelperFactory;
import com.searshc.hs.som.thm.visitor.MembersVisitor;
import com.searshc.hs.som.thm.vo.THMSYWRVO;

/**
 * This get information of sywr member
 * 
 * @author Ranjit Bhakta
 * @version 1.0, Apr 18, 2014
 *
 */
public class SYWRProfileService {
	private static final Logger logger = LoggerFactory.getLogger(SYWRProfileService.class);
	
	private SYWRProfileAdapter sywrProfileAdapter;
	
	private static String SEARCH_TYPE_7 = "7";
	private static String SEARCH_TYPE_6 = "6";
	private static String SEARCH_TYPE_4 = "4";
	private static String SEARCH_TYPE_2 = "2";
	private static String SEARCH_TYPE_1 = "1";
	
	/**
	 * This method will search the sywr member in sywr getMember service
	 * and if found it will set the sywr member id for the customer from
	 * response
	 * 
	 * @param thmSYWRVO
	 * @return true if succeed otherwise false
	 * @throws Exception 
	 */
	public boolean findAndSetSYWRMemberId(THMSYWRVO thmSYWRVO) throws Exception{
		boolean isSucess = false;
		
		String messageVersion = ServiceConstants.SYWR_MESSAGE_VERSION;
		String emailAddress = thmSYWRVO.getCustomerEmailAddress(); 
		String phoneNumber = thmSYWRVO.getCustomerPhoneNumber();
		String firstName = thmSYWRVO.getCustomerFirstName();
		String lastName = thmSYWRVO.getCustomerLastName();
		String zipCode = thmSYWRVO.getCustomerZip();
		String requestorId = ServiceConstants.SYWR_REQUESTOR_ID;
		String searchType = null;
		
		if(!StringUtils.isEmpty(phoneNumber)){
			searchType = SEARCH_TYPE_4;
		}
		
		if(!StringUtils.isEmpty(searchType)){
			GetMemberLookupResult  result = sywrProfileAdapter.getMemberLookup(messageVersion, null, emailAddress, phoneNumber,
					requestorId, searchType, null, null, null, firstName, lastName, zipCode);
			
			if(result != null){
				isSucess = getStatus(result, thmSYWRVO);
			}
		}
		
		return isSucess;
	}
	
	/**
	 * Get status of the response and attached new syswr no to the
	 * THMSYWRVO object
	 * 
	 * @param result GetMemberLookupResult object
	 * @param thmSYWRVO THMSYWRVO object
	 * @return success if success response returned otherwise false
	 */
	private boolean getStatus(GetMemberLookupResult result, THMSYWRVO thmSYWRVO){ 
		boolean isSucces = false;

		if (result != null) {
			List<Object> content = result.getContent();

			if (content != null && !content.isEmpty()) {
				Epsilon epsilon = (Epsilon) content.get(0);

				if (epsilon != null) {
					Additional additional = epsilon.getAdditional();

					if (additional != null) {
						String statusText = additional.getStatusText();

						if (!StringUtils.isEmpty(statusText)
								&& statusText
										.equalsIgnoreCase(ServiceConstants.VALID_MSG)) {
							// Modify sywr no
							Response response = epsilon.getResponse();

							if (response != null) {
								GetMemberLookupReply reply = response
										.getGetMemberLookupReply();

								if (reply != null) {
									Members members = reply.getMembers();

									if (members != null
											&& members.getMember() != null
											&& members.getMember().size() == 1) {
										Member member = members.getMember()
												.get(0);

										isSucces = applySYWNumberOnNPJandEnroll(thmSYWRVO, isSucces, member);
									} else if(members != null
											&& members.getMember() != null
											&& members.getMember().size() > 1){
										
										isSucces = applyLogicForMultipleMembers(thmSYWRVO, isSucces, members);	
										
									}
								}
							}
						} else {
							logger.error("SYWR profile webservice call got error response : " + statusText);
							thmSYWRVO.setFalloutMessage(statusText);
						}
					}
				}
			}
		}

		return isSucces;
	}

	private boolean applyLogicForMultipleMembers(THMSYWRVO thmSYWRVO, boolean isSucces, Members members) {
	   CollectionHelper<Member> collectionHelper =CollectionHelperFactory.createCollectionHelper(members.getMember());
	   MembersVisitor visitor = new MembersVisitor();
	   visitor.setThmSYWRVO(thmSYWRVO);
	   collectionHelper.visitCollection(visitor);	
	   return applyLogicForMultipleOrOneOrNoZipcodes(thmSYWRVO, isSucces, visitor);
   }

	private boolean applyLogicForMultipleOrOneOrNoZipcodes(THMSYWRVO thmSYWRVO, boolean isSucces, MembersVisitor visitor) {
	   //3.If MULTIPLE syw members have the same zipcode as NPJ
	   if(visitor.getSameZipcodeInNPJAndSYWR().size()>1){
	   	isSucces = multipleSYWMembersHaveTheSameZipcodeAsNPJ(thmSYWRVO, isSucces, visitor);
	   }
	   //2.If ONE syw member has the same zipcode as NPJ, then apply the SYW number on NPJ and enroll that SYW member in HW
	   else if(visitor.getSameZipcodeInNPJAndSYWR().size()==1){
	   	isSucces = oneSYWMembersHaveTheSameZipcodeAsNPJ(thmSYWRVO, isSucces, visitor);
	   }
	   //1. If NO syw member has the same zipcode as NPJ, then
	   else{
	   	isSucces = noSYWMembersHaveTheSameZipcodeAsNPJ(thmSYWRVO, isSucces, visitor);
	   }
	   return isSucces;
   }

	private boolean noSYWMembersHaveTheSameZipcodeAsNPJ(THMSYWRVO thmSYWRVO, boolean isSucces, MembersVisitor visitor) {
	   if(visitor.getSameLastNameForNonMatchZip().size()>1){
	   	if(visitor.getSameEamilAddressAndLastNameForNonMatchZip().size()>1){
	   		logger.error("SYW membership has NOT been applied – no match on zip. Multiple members with matched last name and email address.");
	   		thmSYWRVO.setFalloutMessage(CommonConstants.SYWR_FALLOUT_MSG_MULTIPLEMEMBERS_MATCHED_LASTNAME_AND_EMAIL_NOMATCH_ON_ZIP);													
	   	}else if(visitor.getSameEamilAddressAndLastNameForNonMatchZip().size()==1){
	   		Member member = visitor.getSameEamilAddressAndLastNameForNonMatchZip().get(0);
	   		isSucces = applySYWNumberOnNPJandEnroll(thmSYWRVO, isSucces, member);													
	   	}else{
	   		logger.error("SYW membership has NOT been applied – no match on zip/email address. Multiple members with matched last name.");
	   		thmSYWRVO.setFalloutMessage(CommonConstants.SYWR_FALLOUT_MSG_MULTIPLEMEMBERS_MATCHED_LASTNAME_NOMATCH_ON_ZIP_AND_EMAIL);	
	   	}
	   }
	   //ii. If one syw member has the same last name as npj, then apply SYW number on NPJ and enroll in HW
	   else if(visitor.getSameLastNameForNonMatchZip().size()==1){
	   	Member member = visitor.getSameLastNameForNonMatchZip().get(0);
	   	isSucces = applySYWNumberOnNPJandEnroll(thmSYWRVO, isSucces, member);	
	   }
	   //i. If NO syw member has the same last name as npj,
	   else{
	   	if(visitor.getSameEamilAddressForNonMatchZipAndLastName().size()>1){
	   		logger.error("SYW membership has NOT been applied – no match on zip/last name. Multiple members with matched email address.");
	   		thmSYWRVO.setFalloutMessage(CommonConstants.SYWR_FALLOUT_MSG_MULTIPLEMEMBERS_MATCHED_EMAIL_NOMATCH_ON_ZIP_AND_LASTNAME);													
	   	}else if(visitor.getSameEamilAddressForNonMatchZipAndLastName().size()==1){
	   		Member member = visitor.getSameEamilAddressForNonMatchZipAndLastName().get(0);
	   		isSucces = applySYWNumberOnNPJandEnroll(thmSYWRVO, isSucces, member);													
	   	}else{
	   		logger.error("SYW membership has NOT been applied – no match on zip/last name/email address.");
	   		thmSYWRVO.setFalloutMessage(CommonConstants.SYWR_FALLOUT_MSG_MULTIPLEMEMBERS_NOMATCH_ON_ZIP_LASTNAME_AND_EMAIL);	
	   	}
	   }
	   return isSucces;
   }

	private boolean oneSYWMembersHaveTheSameZipcodeAsNPJ(THMSYWRVO thmSYWRVO, boolean isSucces, MembersVisitor visitor) {
	   Member member = visitor.getSameZipcodeInNPJAndSYWR().get(0);
	   isSucces = applySYWNumberOnNPJandEnroll(thmSYWRVO, isSucces, member);
	   return isSucces;
   }

	private boolean multipleSYWMembersHaveTheSameZipcodeAsNPJ(THMSYWRVO thmSYWRVO, boolean isSucces,
         MembersVisitor visitor) {
	   //iii. If MULTIPLE syw members have same last name as npj,
	   //1.Compare NPJ email address to SYW email address.
	   if(visitor.getSameLastNameForMatchZip().size()>1){
	   	if(visitor.getSameEamilAddressAndLastNameForMatchZip().size()>1){
	   		logger.error("SYW membership has NOT been applied – no match on last name. Multiple members with matched zip/last name/email address.");
	   		thmSYWRVO.setFalloutMessage(CommonConstants.SYWR_FALLOUT_MSG_MULTIPLEMEMBERS_MATCHED_ZIP_LN_EMAIL);													
	   	}else if(visitor.getSameEamilAddressAndLastNameForMatchZip().size()==1){
	   		Member member = visitor.getSameEamilAddressAndLastNameForMatchZip().get(0);
	   		isSucces = applySYWNumberOnNPJandEnroll(thmSYWRVO, isSucces, member);													
	   	}else{
	   		logger.error("SYW membership has NOT been applied – no match on last name/email address. Multiple members with matched zip/last name.");
	   		thmSYWRVO.setFalloutMessage(CommonConstants.SYWR_FALLOUT_MSG_MULTIPLEMEMBERS_MATCHED_ZIP_NOMATCH_ON_LASTNAME_OR_EMIL);	
	   	}
	   }
	   //ii. If one syw member has the same last name as npj, then apply SYW number on NPJ and enroll in HW
	   else if(visitor.getSameLastNameForMatchZip().size()==1){
	   	Member member = visitor.getSameLastNameForMatchZip().get(0);
	   	isSucces = applySYWNumberOnNPJandEnroll(thmSYWRVO, isSucces, member);	
	   }
	   //i. If NO syw member has the same last name as npj,
	   else{
	   	if(visitor.getSameEamilAddressAndZipCodeForMatchLastName().size()>1){
	   		logger.error("SYW membership has NOT been applied – no match on last name/last name. Multiple members with matched zip/email address.");
	   		thmSYWRVO.setFalloutMessage(CommonConstants.SYWR_FALLOUT_MSG_MULTIPLEMEMBERS_MATCHED_ZIP_AND_EMAIL_NOMATCH_ON_LASTNAME);													
	   	}else if(visitor.getSameEamilAddressAndZipCodeForMatchLastName().size()==1){
	   		Member member = visitor.getSameEamilAddressAndZipCodeForMatchLastName().get(0);
	   		isSucces = applySYWNumberOnNPJandEnroll(thmSYWRVO, isSucces, member);													
	   	}else{
	   		logger.error("SYW membership has NOT been applied – no match on last name/last name/email address. Multiple members with matched zip.");
	   		thmSYWRVO.setFalloutMessage(CommonConstants.SYWR_FALLOUT_MSG_MULTIPLEMEMBERS_MATCHED_ZIP_NOMATCH_ON_LASTNAME_AND_EMAIL);	
	   	}
	   }
	   return isSucces;
   }

	private boolean applySYWNumberOnNPJandEnroll(THMSYWRVO thmSYWRVO, boolean isSucces, Member member) {
	   if (member != null) {
	   	if(!StringUtils.isEmpty(member.getMemberNumber())){
	   		thmSYWRVO.setSywrMemberId(member.getMemberNumber());
	   	}
	   	
	   	if(!StringUtils.isEmpty(member.getCity())){
	   		thmSYWRVO.setCustomerCity(member.getCity());
	   	}
	   	
	   	if(!StringUtils.isEmpty(member.getState())){
	   		thmSYWRVO.setCustomerCity(member.getState());
	   	}
	   	
	   	isSucces = true;
	   	
	   	logger.info("SYWR profile webservice called successfully");
	   }
	   return isSucces;
   }
	
	public void setSywrProfileAdapter(SYWRProfileAdapter sywrProfileAdapter) {
		this.sywrProfileAdapter = sywrProfileAdapter;
	}
}