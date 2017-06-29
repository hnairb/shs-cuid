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

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;

import com.searshc.hs.som.thm.client.adapter.npj.CustomerDelegateAdapter;
import com.searshc.hs.som.thm.common.CommonConstants;
import com.searshc.hs.som.thm.common.ServiceConstants;
import com.searshc.hs.som.thm.domain.npj.AddressData;
import com.searshc.hs.som.thm.domain.npj.CustomerData;
import com.searshc.hs.som.thm.domain.npj.CustomerDetails;
import com.searshc.hs.som.thm.domain.npj.CustomerSearchCriteria;
import com.searshc.hs.som.thm.domain.npj.PhoneData;
import com.searshc.hs.som.thm.domain.npj.PrimarySearch;
import com.searshc.hs.som.thm.domain.npj.SearchCriteria;
import com.searshc.hs.som.thm.vo.HWSywrSyncVO;
import com.searshc.hs.som.thm.vo.THMCustomerWrapperVO;
import com.searshc.hs.som.thm.vo.THMNPJVO;
import com.searshc.hs.som.thm.vo.THMSYWRVO;

/**
 * This class uses customerDelegateAdapter to search
 * customer from NPJ
 * 
 * @author Ranjit Bhakta
 * @version 1.0, Mar 05, 2014
 *
 */
public class NPJCustomerSearchService {
	private CustomerDelegateAdapter customerDelegateAdapter;
	
	/**
	 * This method find customer key for thmCustomerWrapperVO,
	 * if the key is found then it is set in the object
	 * 
	 * @param thmCustomerWrapperVO
	 */
	public void findAndSetCustomerKey(THMCustomerWrapperVO thmCustomerWrapperVO){
		CustomerData customerData = customerDelegateAdapter.searchCustomer(buildCustomerSearchCriteria(thmCustomerWrapperVO.getCustomerPhoneNumber()));
		
		if(customerData != null && customerData.getCustomerInfos() != null 
				&& !customerData.getCustomerInfos().isEmpty()){
			List<CustomerDetails> customerDetailsList = customerData.getCustomerInfos();
			
			if(customerDetailsList != null && !customerDetailsList.isEmpty()){
				for(CustomerDetails customerDetails : customerDetailsList){
					boolean recordMatched = false;
					
					if(customerDetails != null){
						List<AddressData> addressDataList = customerDetails.getAddressDatas();
						List<PhoneData> phoneDataList = customerDetails.getPhoneDatas();
						
						//compare phone no
						recordMatched = comparePhone(phoneDataList, thmCustomerWrapperVO);
						
						//compare last name 
						if(recordMatched && !StringUtils.isEmpty(thmCustomerWrapperVO.getCustomerLastName())
								&& customerDetails.getNameData() != null
								&& thmCustomerWrapperVO.getCustomerLastName().toUpperCase().equals(customerDetails.getNameData().getLastName().toUpperCase())){
							recordMatched = true;
						} else {
							recordMatched = false;
						}
						
						//compare address
						if(recordMatched){
							recordMatched = compareAddress(addressDataList, thmCustomerWrapperVO);
						}
						
						if(recordMatched){
							if(!StringUtils.isEmpty(customerDetails.getCustKey())){
								thmCustomerWrapperVO.setCustomerKey(customerDetails.getCustKey());
							}
							
							break;
						}
					}
				}
			}
		}
	}
	
	/**
	 * This method find customer key for thmNPJVO,
	 * if the key is found then it is set in the object
	 * 
	 * @param thmNPJVO
	 * @return CustomerDetails object
	 */
	public CustomerDetails findCustomer(THMNPJVO thmNPJVO){
		CustomerDetails customerDetails = customerDelegateAdapter.searchCustomer(buildSearchCriteria(thmNPJVO.getCustomerKey()));
		
		return customerDetails;
	}
	
	/**
	 * This method find customer key for thmSYWRVO,
	 * if the key is found then it is set in the object
	 * 
	 * @param thmSYWRVO
	 * @return CustomerDetails object
	 */
	public CustomerDetails findCustomer(THMSYWRVO thmSYWRVO){
		CustomerDetails customerDetails = customerDelegateAdapter.searchCustomer(buildSearchCriteria(thmSYWRVO.getCustomerKey()));
		
		return customerDetails;
	}
	/**
	 * This method find customer key for hwSywrSyncVO,
	 * if the key is found then it is set in the object
	 * 
	 * @param hwSywrSyncVO
	 * @return CustomerDetails object
	 */
	public CustomerDetails findCustomer(HWSywrSyncVO hwSywrSyncVO){
		CustomerDetails customerDetails = customerDelegateAdapter.searchCustomer(buildSearchCriteria(hwSywrSyncVO.getNpjCustomerNumber()));
		
		return customerDetails;
	}
	/**
	 * Compare customer address with address found in search
	 * 
	 * @param addressDataList
	 * @param addTHMCustomerWrapperVO
	 * @return true if address matched otherwise false
	 */
	private boolean compareAddress(List<AddressData> addressDataList, THMCustomerWrapperVO addTHMCustomerWrapperVO) {
		boolean recordMatched = false;
		
		String address = addTHMCustomerWrapperVO.getCustomerAddress();
		String zipCode = addTHMCustomerWrapperVO.getCustomerZip();
		String removeStr1= "#";
		String removeStr2 = "-";
		if(!StringUtils.isEmpty(address)){
			int indexOfFirstSpaceOfAddress = address.trim().indexOf(CommonConstants.EMPTY_SPACE);
			
			/*Changed the condition from "!=0" to ">0" to fix job abend due to single word in address line *Done on 6.5.2015 by TCS team* */
			if(indexOfFirstSpaceOfAddress >0){
				address = address.trim().substring(0, indexOfFirstSpaceOfAddress);
			}
			
			for(AddressData addressData : addressDataList){
				if(addressData != null && !StringUtils.isEmpty(addressData.getAddressLine1())){
					String npjAdress = addressData.getAddressLine1().trim();
					
					if(npjAdress!= null) 
					{
						npjAdress= npjAdress.trim();
						if(npjAdress.startsWith(removeStr1))
						{
							//We need to check for the # and then strip starting with the first space after the # all the way through the second space after the #. 
							//so '# 1 ' and '# NONE ' both will get removed from string if it's at the start
							Pattern whitespace = Pattern.compile("#\\s.*?\\s");
							Matcher m = whitespace.matcher(npjAdress);
							if(m.find())
							{
								npjAdress= m.replaceFirst(CommonConstants.EMPTY_DATA); //we are replacing only first matched string
							}						
						}
						npjAdress =npjAdress.trim();
						if(npjAdress.startsWith(removeStr2))
						{
							npjAdress = npjAdress.replace(removeStr2, CommonConstants.EMPTY_DATA);	
						}
						npjAdress = npjAdress.trim();
					}
					
					int indexOfFirstSpaceOfNpjAddress = npjAdress.indexOf(CommonConstants.EMPTY_SPACE);
					
					/*Added the complete condition "if(indexOfFirstSpaceOfNpjAddress > 0)" *Done on 6.5.2015 by TCS team* */
					if(indexOfFirstSpaceOfNpjAddress > 0){
					npjAdress = npjAdress.substring(0, indexOfFirstSpaceOfNpjAddress);
					}
					
					String numericAddress = address.replaceAll("[^\\d.]", CommonConstants.EMPTY_DATA);
					String numericNpjAddress = npjAdress.replaceAll("[^\\d.]", CommonConstants.EMPTY_DATA);
					
					if(!StringUtils.isEmpty(numericAddress) && !StringUtils.isEmpty(numericNpjAddress)){
						if(numericAddress.equals(numericNpjAddress)){
							recordMatched = true;
						}
					} else if(addTHMCustomerWrapperVO.getCustomerAddress().trim().toUpperCase()
							.equals(addressData.getAddressLine1().trim().toUpperCase())){
						recordMatched = true;
					} 
					 
					
					if(recordMatched && !StringUtils.isEmpty(zipCode) 
							&& zipCode.equals(addressData.getZipCode())){
						recordMatched = true;						
						
						break;
					}
				}
			}
		}
	   
	   return recordMatched;
   }

	/**
	 * Compare customer phone no with phone found in search
	 * 
	 * @param phoneDataList
	 * @param addTHMCustomerWrapperVO
	 * @return true if phone no otherwise false
	 */
	private boolean comparePhone(List<PhoneData> phoneDataList, THMCustomerWrapperVO addTHMCustomerWrapperVO) {
	   boolean recordMatched = false;
	   
	   String primaryPhoneNumber = addTHMCustomerWrapperVO.getCustomerPhoneNumber();
	   
	   //Match primary phone number
	   if(!StringUtils.isEmpty(primaryPhoneNumber)){
		   	for(PhoneData phoneData : phoneDataList){
		   		if(phoneData != null 
		   				&& CommonConstants.YES_FL.equals(phoneData.getPreferredPrimaryCntFl())
		   				&& primaryPhoneNumber.equals(phoneData.getPhoneNum())){
		   			recordMatched = true;
		   			
		   			break;
		   		}
		   	}
	   }
	   
	   return recordMatched;
   }
	
	/**
	 * This method creates CustomerSearchCriteria request object
	 * from phoneNumber
	 * 
	 * @param phoneNumber customer phone no
	 * @return CustomerSearchCriteria object
	 */
	private CustomerSearchCriteria buildCustomerSearchCriteria(String phoneNumber) {
		CustomerSearchCriteria customerSearchCriteria = null;
		PrimarySearch primarySearch = null;
		
		if(!StringUtils.isEmpty(phoneNumber)){
			customerSearchCriteria = new CustomerSearchCriteria();
			primarySearch = new PrimarySearch();
			
			primarySearch.setPhoneNumber(phoneNumber);
			customerSearchCriteria.setSystemId(ServiceConstants.NPJ_ID);
			customerSearchCriteria.setPrimarySearch(primarySearch);
		}
		
		return customerSearchCriteria;
	}
	
	/**
	 * This method creates SearchCriteria request object
	 * from customerKey
	 * 
	 * @param customerKey npj customer key of the customer
	 * @return SearchCriteria object
	 */
	private SearchCriteria buildSearchCriteria(String customerKey) {
		SearchCriteria searchCriteria = null;
		
		if(!StringUtils.isEmpty(customerKey)){
			searchCriteria = new SearchCriteria();
			
			searchCriteria.setSystemId(ServiceConstants.NPJ_ID);
			searchCriteria.setCustKey(customerKey);
		}
		
		return searchCriteria;
	}

	public void setCustomerDelegateAdapter(CustomerDelegateAdapter customerDelegateAdapter) {
		this.customerDelegateAdapter = customerDelegateAdapter;
	}
}