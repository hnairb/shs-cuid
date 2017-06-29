/* 
 * Copyright 2014 (C) Sears Holdings Corp  
 *  
 * Created on : 05-Mar-14
 * Author     : Ranjit Bhakta   
 * 
 *----------------------------------------------------------------------------- 
 * Revision History (Release 1.0.0.0) 
 *----------------------------------------------------------------------------- 
 * VERSION     AUTHOR/      DESCRIPTION OF CHANGE 
 * OLD/NEW     DATE                RFC NO 
 *----------------------------------------------------------------------------- 
 * --/1.0  | Ranjit Bhakta  | Initial Create. 
 *         | 05-Mar-14      | 
 *---------|--------------- |--------------------------------------------------- 
 */
package com.searshc.hs.som.thm.service;

import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.searshc.hs.som.thm.client.adapter.npj.ProfileDelegateAdapter;
import com.searshc.hs.som.thm.common.CommonConstants;
import com.searshc.hs.som.thm.domain.npj.AddressData;
import com.searshc.hs.som.thm.domain.npj.CustomerDetails;
import com.searshc.hs.som.thm.domain.npj.EmailData;
import com.searshc.hs.som.thm.domain.npj.EmailOptIns;
import com.searshc.hs.som.thm.domain.npj.NameData;
import com.searshc.hs.som.thm.domain.npj.NpjCustomer;
import com.searshc.hs.som.thm.domain.npj.PhoneData;
import com.searshc.hs.som.thm.exception.ServiceException;
import com.searshc.hs.som.thm.vo.THMCustomerWrapperVO;

/**
 * This class uses profileDelegateAdapter to find add/update
 * customer to NPJ
 * 
 * @author Ranjit Bhakta
 * @version 1.0, Mar 05, 2014
 *
 */
public class NPJCustomerAddUpdateService {
	private ProfileDelegateAdapter profileDelegateAdapter;
	
	/**
	 * This method add customer to the NPJ and
	 * update customer key for thmCustomerWrapperVO,
	 * 
	 * @param thmCustomerWrapperVO
	 */
	public boolean addAndSetCustomerKey(THMCustomerWrapperVO thmCustomerWrapperVO) throws ServiceException{
		boolean isCustomerAdded = false;
		
		CustomerDetails customerDetails = profileDelegateAdapter.addCustomer(buildAddCustomerDetails(thmCustomerWrapperVO));
		
		if(customerDetails != null && !StringUtils.isEmpty(customerDetails.getCustKey())){
			thmCustomerWrapperVO.setCustomerKey(customerDetails.getCustKey());
				
			isCustomerAdded = true;
		}
		
		return isCustomerAdded;
	}
	
	/**
	 * This method update customer in the NPJ
	 *
	 * @param sywrNumber
	 * @param customerDetails
	 * @return CustomerDetails new CustomerDetails object
	 * @throws ServiceException 
	 */
	public CustomerDetails updateCustomer(String sywrNumber, CustomerDetails customerDetails) throws ServiceException{
		CustomerDetails newCustomerDetails = profileDelegateAdapter.updateCustomer(buildUpdateCustomerDetails(sywrNumber, customerDetails));
		
		return newCustomerDetails;
	}
	
	/**
	 * This method creates add CustomerDetails request 
	 * object from thmCustomerWrapperVO object
	 * 
	 * @param thmCustomerWrapperVO customer vo wrapper object
	 * @return CustomerDetails object
	 */
	private CustomerDetails buildAddCustomerDetails(THMCustomerWrapperVO thmCustomerWrapperVO) {
		CustomerDetails customerDetails = new CustomerDetails();
		
		//set customer type
		customerDetails.setCustType(CommonConstants.CUSTOMER_TYPE);
		
		//set language code
		customerDetails.setLanguageCode(CommonConstants.LANGUAGE_CODE);
		
		//Set customer name date
		if(!StringUtils.isEmpty(thmCustomerWrapperVO.getCustomerFirstName())
				|| !StringUtils.isEmpty(thmCustomerWrapperVO.getCustomerLastName())){
			NameData nameData = new NameData();
			
			nameData.setFirstName(thmCustomerWrapperVO.getCustomerFirstName());
			nameData.setLastName(thmCustomerWrapperVO.getCustomerLastName());
			
			customerDetails.setNameData(nameData);
		}
		
		//Set address data
		if(!StringUtils.isEmpty(thmCustomerWrapperVO.getCustomerAddress())
				|| !StringUtils.isEmpty(thmCustomerWrapperVO.getCustomerCity())
				|| !StringUtils.isEmpty(thmCustomerWrapperVO.getCustomerZip())
				|| !StringUtils.isEmpty(thmCustomerWrapperVO.getCustomerState())){
			AddressData addressData = new AddressData();
			
			addressData.setAddressLine1(thmCustomerWrapperVO.getCustomerAddress());
			addressData.setCity(thmCustomerWrapperVO.getCustomerCity());
			addressData.setZipCode(thmCustomerWrapperVO.getCustomerZip());
			addressData.setState(thmCustomerWrapperVO.getCustomerState());
			
			customerDetails.getAddressDatas().add(addressData);
		}
		
		//Set primary phone data
		if(!StringUtils.isEmpty(thmCustomerWrapperVO.getCustomerPhoneNumber())){
			PhoneData primaryPhoneData = new PhoneData();
			
			primaryPhoneData.setPhoneNum(thmCustomerWrapperVO.getCustomerPhoneNumber());
			primaryPhoneData.setPhoneType(CommonConstants.PHONE_TYPE_PHONE);
			primaryPhoneData.setPhoneSubType(CommonConstants.PRIMARY_PHONE_TYPE);
			primaryPhoneData.setPreferredPrimaryCntFl(CommonConstants.YES_FL);
			
			customerDetails.getPhoneDatas().add(primaryPhoneData);
		}
		
		//Set alternate phone data
		if(!StringUtils.isEmpty(thmCustomerWrapperVO.getCustomerAlternatePhoneNumber())){
			PhoneData alternatePhoneData = new PhoneData();
			
			alternatePhoneData.setPhoneNum(thmCustomerWrapperVO.getCustomerAlternatePhoneNumber());
			alternatePhoneData.setPhoneType(CommonConstants.PHONE_TYPE_PHONE);
			alternatePhoneData.setPhoneSubType(CommonConstants.ALTERNATE_PHONE_TYPE);
			alternatePhoneData.setPreferredPrimaryCntFl(CommonConstants.NO_FL);
			
			customerDetails.getPhoneDatas().add(alternatePhoneData);
		}
		
		//Set email data
		if(!StringUtils.isEmpty(thmCustomerWrapperVO.getCustomerEmailAddress())){
			EmailData emailData = new EmailData();
		
			emailData.setEmailAddress(thmCustomerWrapperVO.getCustomerEmailAddress());
		
			customerDetails.getEmailDatas().add(emailData);
		}
		
		//create NPJ customer data
		NpjCustomer npjCustomer = new NpjCustomer();
		
		npjCustomer.setCustFlag(CommonConstants.YES_FL);
		npjCustomer.setCustInstructionsFlag(CommonConstants.YES_FL);
		npjCustomer.setEmailSourceCd(CommonConstants.EMAIL_SRC_CD);
		npjCustomer.setEmailSourceFunc(CommonConstants.EMAIL_SRC_FUNC);
		npjCustomer.setEmailSvcCd(CommonConstants.EMAIL_SVC_CD);
		npjCustomer.setEmailCaptureUnit(CommonConstants.EMAIL_CAP_UNIT);
		npjCustomer.setEmailCaptureEmpNo(CommonConstants.EMAIL_CAP_EMP_NO);
		
		//set email opt ins
		if(!StringUtils.isEmpty(thmCustomerWrapperVO.getCustomerEmailAddress())){
			EmailOptIns emailOptIns = new EmailOptIns();
			
			emailOptIns.setEmailAddress(thmCustomerWrapperVO.getCustomerEmailAddress());
			emailOptIns.setMMHOptInCd(CommonConstants.NO_FL);
			emailOptIns.setSRSOptInCd(CommonConstants.NO_FL);
			
			npjCustomer.getEmailOptIns().add(emailOptIns);
		}
		
		customerDetails.setNpjCustomer(npjCustomer);
		
		return customerDetails;
	}
	
	/**
	 * This method creates update CustomerDetails request 
	 * object from thmCustomerWrapperVO object
	 * 
	 * @param sywrNumber sywrNumber that need to be set
	 * @param customerDetails old customerDetails object
	 * @return modified CustomerDetails object
	 */
	private CustomerDetails buildUpdateCustomerDetails(String sywrNumber, CustomerDetails customerDetails) {
		if(customerDetails != null && !StringUtils.isEmpty(sywrNumber)){
			NpjCustomer npjCustomer = customerDetails.getNpjCustomer();
			
			if(npjCustomer != null){
				npjCustomer.setSywrMemID(sywrNumber);
				
				//Modify third party
				npjCustomer.setThirdParty(CommonConstants.EMPTY_DATA);
				
				//THMDEF-35: Remove leading '-' from address
				if(customerDetails.getAddressDatas() != null && !customerDetails.getAddressDatas().isEmpty()){
					AddressData addressData = customerDetails.getAddressDatas().get(0);
					
					if(addressData != null){
						String address = addressData.getAddressLine1();
						
						if(!StringUtils.isEmpty(address)){
							npjCustomer.setAddressFlag(CommonConstants.YES_FL);
							
							if(address.trim().startsWith(CommonConstants.DASH)){
								address = address.trim().substring(1);
								addressData.setAddressLine1(address);
							}
						}
					}
				}
				
			}
		}
		
		//Bug THMDEF-9 : If phone no of alternate phone data is empty or all zeros then remove that phone data
		List<PhoneData> phoneDataList =  customerDetails.getPhoneDatas();
		
		if(phoneDataList != null){
			Iterator<PhoneData> iter = phoneDataList.iterator();
			
			while(iter.hasNext()){
				PhoneData phoneData = iter.next();
				
				if(phoneData != null && CommonConstants.NO_FL.equals(phoneData.getPreferredPrimaryCntFl())
						&& (StringUtils.isEmpty(phoneData.getPhoneNum()) || CommonConstants.EMPTY_PHONE_NO.equals(phoneData.getPhoneNum()))){
					iter.remove();
				}
			}
		}
		
		return customerDetails;
	}
	
	public void setProfileDelegateAdapter(ProfileDelegateAdapter profileDelegateAdapter) {
		this.profileDelegateAdapter = profileDelegateAdapter;
	}
}