package com.searshc.hs.som.thm.visitor;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.searshc.hs.som.thm.domain.sywr.Member;
import com.searshc.hs.som.thm.vo.THMSYWRVO;

public class MembersVisitor implements Visitor<Member> {
	private THMSYWRVO thmSYWRVO;
	private List<Member> sameZipcodeInNPJAndSYWR = new ArrayList<Member>();
	private List<Member> sameEamilAddressForNonMatchZipAndLastName = new ArrayList<Member>();
	private List<Member> sameEamilAddressAndLastNameForNonMatchZip = new ArrayList<Member>();
	private List<Member> sameLastNameForNonMatchZip = new ArrayList<Member>();
	private List<Member> sameEamilAddressAndZipCodeForMatchLastName = new ArrayList<Member>();
	private List<Member> sameEamilAddressAndLastNameForMatchZip = new ArrayList<Member>();
	private List<Member> sameLastNameForMatchZip = new ArrayList<Member>();

	@Override
   public void visit(Member member) {
		if(StringUtils.isNotBlank(member.getZipCode()) && StringUtils.isNotBlank(thmSYWRVO.getCustomerZip())){
			if(thmSYWRVO.getCustomerZip().equalsIgnoreCase(member.getZipCode())){
				sameZipcodeInNPJAndSYWR.add(member);
				checkSameLastNameAndEamilForMatchZipCodes(member);
			}else if(!(thmSYWRVO.getCustomerZip().equalsIgnoreCase(member.getZipCode()))){
				checkSameLastNameAndEamilForNonMatchZipCodes(member);			
			}
		}
   }



	private void checkSameLastNameAndEamilForNonMatchZipCodes(Member member) {
		if(StringUtils.isNotBlank(member.getLastName()) && StringUtils.isNotBlank(thmSYWRVO.getCustomerLastName())){
		   if(!(member.getLastName().equalsIgnoreCase(thmSYWRVO.getCustomerLastName()))){
		   	if((StringUtils.isNotBlank(member.getEmailAddress()) && StringUtils.isNotBlank(thmSYWRVO.getCustomerEmailAddress()))
		   			&& (member.getEmailAddress().equalsIgnoreCase(thmSYWRVO.getCustomerEmailAddress()))){
		   		sameEamilAddressForNonMatchZipAndLastName.add(member);
		   	}													
		   }else if(member.getLastName().equalsIgnoreCase(thmSYWRVO.getCustomerLastName())){
		   	sameLastNameForNonMatchZip.add(member);
		   	if((StringUtils.isNotBlank(member.getEmailAddress()) && StringUtils.isNotBlank(thmSYWRVO.getCustomerEmailAddress()))
		   			&& (member.getEmailAddress().equalsIgnoreCase(thmSYWRVO.getCustomerEmailAddress()))){
		   		sameEamilAddressAndLastNameForNonMatchZip.add(member);
		   	}	
		   }
		}
   }	
	
	
	private void checkSameLastNameAndEamilForMatchZipCodes(Member member) {
		if(StringUtils.isNotBlank(member.getLastName()) && StringUtils.isNotBlank(thmSYWRVO.getCustomerLastName())){
		   if(!(member.getLastName().equalsIgnoreCase(thmSYWRVO.getCustomerLastName()))){
		   	if((StringUtils.isNotBlank(member.getEmailAddress()) && StringUtils.isNotBlank(thmSYWRVO.getCustomerEmailAddress()))
		   			&& (member.getEmailAddress().equalsIgnoreCase(thmSYWRVO.getCustomerEmailAddress()))){
		   		sameEamilAddressAndZipCodeForMatchLastName.add(member);
		   	}													
		   }else if(member.getLastName().equalsIgnoreCase(thmSYWRVO.getCustomerLastName())){
		   	sameLastNameForMatchZip.add(member);
		   	if((StringUtils.isNotBlank(member.getEmailAddress()) && StringUtils.isNotBlank(thmSYWRVO.getCustomerEmailAddress()))
		   			&& (member.getEmailAddress().equalsIgnoreCase(thmSYWRVO.getCustomerEmailAddress()))){
		   		sameEamilAddressAndLastNameForMatchZip.add(member);
		   	}
		   }
		}
   }
	
	
	
	public THMSYWRVO getThmSYWRVO() {
   	return thmSYWRVO;
   }

	public void setThmSYWRVO(THMSYWRVO thmSYWRVO) {
   	this.thmSYWRVO = thmSYWRVO;
   }



	public List<Member> getSameZipcodeInNPJAndSYWR() {
   	return sameZipcodeInNPJAndSYWR;
   }



	public List<Member> getSameEamilAddressForNonMatchZipAndLastName() {
   	return sameEamilAddressForNonMatchZipAndLastName;
   }



	public List<Member> getSameEamilAddressAndLastNameForNonMatchZip() {
   	return sameEamilAddressAndLastNameForNonMatchZip;
   }



	public List<Member> getSameLastNameForNonMatchZip() {
   	return sameLastNameForNonMatchZip;
   }



	public List<Member> getSameEamilAddressAndZipCodeForMatchLastName() {
   	return sameEamilAddressAndZipCodeForMatchLastName;
   }



	public List<Member> getSameEamilAddressAndLastNameForMatchZip() {
   	return sameEamilAddressAndLastNameForMatchZip;
   }



	public List<Member> getSameLastNameForMatchZip() {
   	return sameLastNameForMatchZip;
   }
	

}
