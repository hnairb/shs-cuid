/* 
 * Copyright 2014 (C) Sears Holdings Corp  
 *  
 * Created on : 14-Mar-14
 * Author     : Ranjit Bhakta   
 * 
 *----------------------------------------------------------------------------- 
 * Revision History (Release 1.0.0.0) 
 *----------------------------------------------------------------------------- 
 * VERSION     AUTHOR/      DESCRIPTION OF CHANGE 
 * OLD/NEW     DATE                RFC NO 
 *----------------------------------------------------------------------------- 
 * --/1.0  | Ranjit Bhakta  | Initial Create. 
 *         | 14-Mar-14      | 
 *---------|--------------- |--------------------------------------------------- 
 */
package com.searshc.hs.som.thm.service;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.searshc.hs.som.thm.client.adapter.telluride.TellurideAdapter;
import com.searshc.hs.som.thm.common.CommonConstants;
import com.searshc.hs.som.thm.common.ServiceConstants;
import com.searshc.hs.som.thm.domain.telluride.Additional;
import com.searshc.hs.som.thm.domain.telluride.ArrayOfOfferMemberGroupList;
import com.searshc.hs.som.thm.domain.telluride.Epsilon;
import com.searshc.hs.som.thm.domain.telluride.OfferMemberGroup;
import com.searshc.hs.som.thm.domain.telluride.OfferMemberGroupResponse;
import com.searshc.hs.som.thm.domain.telluride.OfferRegistration;
import com.searshc.hs.som.thm.domain.telluride.OfferRegistrationReply;
import com.searshc.hs.som.thm.domain.telluride.OfferRegistrationResponse;
import com.searshc.hs.som.thm.domain.telluride.Response;
import com.searshc.hs.som.thm.domain.telluride.OfferRegistrationReply.OfferMemberGroupList;
import com.searshc.hs.som.thm.domain.telluride.OfferRegistrationResponse.OfferRegistrationResult;
import com.searshc.hs.som.thm.utils.CommonUtils;
import com.searshc.hs.som.thm.vo.THMNPJVO;
import com.searshc.hs.som.thm.vo.THMSYWRVO;

/**
 * This class registers customer for SYWR offers
 * 
 * @author Ranjit Bhakta
 * @version 1.0, Mar 14, 2014
 *
 */
public class SYWROffersService {
	private static final Logger logger = LoggerFactory.getLogger(SYWROffersService.class);
	
	private TellurideAdapter tellurideAdapter;
	
	private Properties messageReader;
	
	/**
	 * This method enrolls the customer for SYWR
	 * 
	 * @param thmNPJVO THMNPJVO object of the customer
	 * @return true if customer successfully enrolled otherwise false
	 */
	public boolean addToSYWR(THMNPJVO thmNPJVO){
		String sywrMemberId = thmNPJVO.getSywrMemberId();
		String regStartDate = null;
		String regEndDate = null;
		String productCode = thmNPJVO.getProductCode();
		
		Calendar calendar = Calendar.getInstance();
		
		if(!StringUtils.isEmpty(thmNPJVO.getStartDate())){
			Date date = CommonUtils.getStringAsDate(thmNPJVO.getStartDate(), CommonConstants.DATE_FORMAT);
			
			if(date != null){
				calendar.setTime(date);
				
				regStartDate = CommonUtils.getDateAsString(date, CommonConstants.SYWR_DATE_FORMAT);
			}
		}
		
		if(!StringUtils.isEmpty(regStartDate)){
			calendar.set(Calendar.YEAR, CommonConstants.SYWR_REG_END_YEAR);
			
			regEndDate = CommonUtils.getDateAsString(calendar.getTime(), CommonConstants.SYWR_DATE_FORMAT);
		}
		
		OfferRegistrationResponse offerRegistrationResponse = tellurideAdapter.enroll(buildOfferRegistration(sywrMemberId, regStartDate, 
				regEndDate, productCode));
		
		return getStatus(offerRegistrationResponse, thmNPJVO);
	}
	
	/**
	 * This method enrolls the customer for SYWR
	 * 
	 * @param thmSYWRVO THMSYWRVO object of the customer
	 * @return true if customer successfully enrolled otherwise false
	 */
	public boolean addToSYWR(THMSYWRVO thmSYWRVO){
		String sywrMemberId = thmSYWRVO.getSywrMemberId();
		String productCode = thmSYWRVO.getCustomerProductCode();
		String regStartDate = null;
		String regEndDate = null;
		
		Calendar calendar = Calendar.getInstance();
		
		if(!StringUtils.isEmpty(thmSYWRVO.getRegStartDate())){
			Date date = CommonUtils.getStringAsDate(thmSYWRVO.getRegStartDate(), CommonConstants.SYWR_REG_START_DATE_FORMAT);
			
			if(date != null){
				calendar.setTime(date);
				
				regStartDate = CommonUtils.getDateAsString(date, CommonConstants.SYWR_DATE_FORMAT);
			}
		}
		
		if(!StringUtils.isEmpty(regStartDate)){
			calendar.set(Calendar.YEAR, CommonConstants.SYWR_REG_END_YEAR);
			
			regEndDate = CommonUtils.getDateAsString(calendar.getTime(), CommonConstants.SYWR_DATE_FORMAT);
		}
		
		OfferRegistrationResponse offerRegistrationResponse = tellurideAdapter.enroll(buildOfferRegistration(sywrMemberId, regStartDate, 
				regEndDate, productCode));
		
		return getStatus(offerRegistrationResponse, thmSYWRVO);
	}
	
	/**
	 * This method de-enrolls the customer for SYWR
	 * 
	 * @param thmNPJVO THMNPJVO object of the customer
	 * @return true if customer successfully enrolled otherwise false
	 */
	public boolean removeFromSYWR(THMNPJVO thmNPJVO){
		String sywrMemberId = thmNPJVO.getSywrMemberId();
		String regStartDate = null;
		String regEndDate = null;
		String productCode = thmNPJVO.getProductCode();
		
		if(!StringUtils.isEmpty(thmNPJVO.getStartDate())){
			Date date = CommonUtils.getStringAsDate(thmNPJVO.getStartDate(), CommonConstants.DATE_FORMAT);
			
			if(date != null){
				regStartDate = CommonUtils.getDateAsString(date, CommonConstants.SYWR_DATE_FORMAT);
			}
		}
		
		if(!StringUtils.isEmpty(thmNPJVO.getEndDate())){
			Date date = CommonUtils.getStringAsDate(thmNPJVO.getEndDate(), CommonConstants.DATE_FORMAT);
			
			if(date != null){
				regEndDate = CommonUtils.getDateAsString(date, CommonConstants.SYWR_DATE_FORMAT);
			}
		}
		
		OfferRegistrationResponse offerRegistrationResponse = tellurideAdapter.enroll(buildOfferRegistration(sywrMemberId, regStartDate, 
				regEndDate, productCode));
		
		return getStatus(offerRegistrationResponse, thmNPJVO);
	}
	
	/**
	 * Build OfferRegistration from customer
	 * information
	 * 
	 * @param sywrMemberId
	 * @param regStartDate
	 * @param regEndDate
	 * @param productCode
	 * @return OfferRegistration objectrRegistration
	 */
	private OfferRegistration buildOfferRegistration(String sywrMemberId, String regStartDate, String regEndDate,String productCode){
		OfferRegistration offerRegistration = null;
		
		
		if(!StringUtils.isEmpty(sywrMemberId) && !StringUtils.isEmpty(regStartDate) 
				&& !StringUtils.isEmpty(regEndDate) && !StringUtils.isEmpty(productCode)){
			offerRegistration = new OfferRegistration();
			
			offerRegistration.setMessageVersion(ServiceConstants.SYWR_MSG_VER);
			offerRegistration.setActionTag(ServiceConstants.SYWR_ACTION_TAG);
			offerRegistration.setRequestorID(ServiceConstants.SYWR_REQUESTOR_ID);
			offerRegistration.setMemberNumber(sywrMemberId);
			offerRegistration.setRegistrationStartDTTM(regStartDate);
			offerRegistration.setRegistrationEndDTTM(regEndDate);
			
			String offerCode = messageReader.getProperty(CommonConstants.SYWR_OFFER_CODE_MSG_PRE 
					+ productCode);
			
			String groupName = messageReader.getProperty(CommonConstants.SYWR_GRP_NAME_MSG_PRE 
					+ productCode);
			
			if(StringUtils.isEmpty(offerCode) || StringUtils.isEmpty(groupName)){
				return null;
			}
			
			ArrayOfOfferMemberGroupList arrayOfOfferMemberGroupList = new ArrayOfOfferMemberGroupList();
			OfferMemberGroup offerMemberGroup = new OfferMemberGroup();
			
			offerMemberGroup.setOfferCode(offerCode);
			offerMemberGroup.setGroupName(groupName);
			
			arrayOfOfferMemberGroupList.getOfferMemberGroup().add(offerMemberGroup);
			
			offerRegistration.setOfferMemberGroupList(arrayOfOfferMemberGroupList);
		}else {
			return null;
		}
		
		return offerRegistration;
	}
	
	/**
	 * Get status of the response and attached new syswr no to the
	 * THMNPJVO object
	 * 
	 * @param offerRegistrationResponse
	 * @param thmNPJVO THMNPJVO object
	 * @return success if success response returned otherwise false
	 */
	private boolean getStatus(OfferRegistrationResponse offerRegistrationResponse, THMNPJVO thmNPJVO){ 
		boolean isSucces = false;
		
		if(offerRegistrationResponse != null){
			OfferRegistrationResult offerRegistrationResult = offerRegistrationResponse.getOfferRegistrationResult();
			
			if(offerRegistrationResult != null){
				List<Object> content = offerRegistrationResult.getContent();
				
				if(content != null && !content.isEmpty()){
					Epsilon epsilon = (Epsilon)content.get(0);
					
					if(epsilon != null){
						Additional additional = epsilon.getAdditional();
						
						if(additional != null){
							String statusText = additional.getStatusText();
							
							if(!StringUtils.isEmpty(statusText) && statusText.equalsIgnoreCase(ServiceConstants.VALID_MSG)){
								isSucces = true;
								
								//Modify sywr no
								Response response = epsilon.getResponse();
								
								if(response != null){
									OfferRegistrationReply offerRegistrationReply = response.getOfferRegistrationReply();
									
									if(offerRegistrationReply != null){
										String syrwrNumber = offerRegistrationReply.getMemberNumber();
										
										if(!StringUtils.isEmpty(syrwrNumber)){
											thmNPJVO.setSywrMemberId(syrwrNumber);
										}
									}
									
									logger.info("Telluride offers webservice called successfully");
								}
							} else {
								Response response = epsilon.getResponse();
								
								if(response != null){
									OfferRegistrationReply offerRegistrationReply = response.getOfferRegistrationReply();
									
									if(offerRegistrationReply != null){
										OfferMemberGroupList offerMemberGroupList = offerRegistrationReply.getOfferMemberGroupList();
										
										if(offerMemberGroupList != null){
											List<OfferMemberGroupResponse> resp = offerMemberGroupList.getOfferMemberGroupResponse();
											
											if(resp != null & !resp.isEmpty() 
													&& resp.get(0) != null 
													&& resp.get(0).getStatusText() != null){
												logger.error("Telluride offers webservice call got error response : " + resp.get(0).getStatusText());
												thmNPJVO.setFalloutMessage(resp.get(0).getStatusText());
											} else {
												logger.error("Telluride offers webservice call got error response : " + statusText);
												thmNPJVO.setFalloutMessage(statusText);
											}
										} else {
											logger.error("Telluride offers webservice call got error response : " + statusText);
											thmNPJVO.setFalloutMessage(statusText);
										}
									}
								}
							}
						}
					}
				}
			 }
		 }
		
		return isSucces;
	}
	
	/**
	 * Get status of the response and attached new syswr no to the
	 * THMSYWRVO object
	 * 
	 * @param offerRegistrationResponse
	 * @param thmSYWRVO THMSYWRVO object
	 * @return success if success response returned otherwise false
	 */
	private boolean getStatus(OfferRegistrationResponse offerRegistrationResponse, THMSYWRVO thmSYWRVO){ 
		boolean isSucces = false;
		
		if(offerRegistrationResponse != null){
			OfferRegistrationResult offerRegistrationResult = offerRegistrationResponse.getOfferRegistrationResult();
			
			if(offerRegistrationResult != null){
				List<Object> content = offerRegistrationResult.getContent();
				
				if(content != null && !content.isEmpty()){
					Epsilon epsilon = (Epsilon)content.get(0);
					
					if(epsilon != null){
						Additional additional = epsilon.getAdditional();
						
						if(additional != null){
							String statusText = additional.getStatusText();
							
							if(!StringUtils.isEmpty(statusText) && statusText.equalsIgnoreCase(ServiceConstants.VALID_MSG)){
								isSucces = true;
								
								//Modify sywr no
								Response response = epsilon.getResponse();
								
								if(response != null){
									OfferRegistrationReply offerRegistrationReply = response.getOfferRegistrationReply();
									
									if(offerRegistrationReply != null){
										String syrwrNumber = offerRegistrationReply.getMemberNumber();
										
										if(!StringUtils.isEmpty(syrwrNumber)){
											thmSYWRVO.setSywrMemberId(syrwrNumber);
										}
									}
									
									logger.info("Telluride offers webservice called successfully");
								}
							} else {
								Response response = epsilon.getResponse();
								
								if(response != null){
									OfferRegistrationReply offerRegistrationReply = response.getOfferRegistrationReply();
									
									if(offerRegistrationReply != null){
										OfferMemberGroupList offerMemberGroupList = offerRegistrationReply.getOfferMemberGroupList();
										
										if(offerMemberGroupList != null){
											List<OfferMemberGroupResponse> resp = offerMemberGroupList.getOfferMemberGroupResponse();
											
											if(resp != null & !resp.isEmpty() 
													&& resp.get(0) != null 
													&& resp.get(0).getStatusText() != null){
												logger.error("Telluride offers webservice call got error response : " + resp.get(0).getStatusText());
												thmSYWRVO.setFalloutMessage(resp.get(0).getStatusText());
											} else {
												logger.error("Telluride offers webservice call got error response : " + statusText);
												thmSYWRVO.setFalloutMessage(statusText);
											}
										} else {
											logger.error("Telluride offers webservice call got error response : " + statusText);
											thmSYWRVO.setFalloutMessage(statusText);
										}
									}
								}
							}
						}
					}
				}
			 }
		 }
		
		return isSucces;
	}
	
	public void setTellurideAdapter(TellurideAdapter tellurideAdapter) {
		this.tellurideAdapter = tellurideAdapter;
	}
	
	public void setMessageReader(Properties messageReader) {
		this.messageReader = messageReader;
	}
}