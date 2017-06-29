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
package com.searshc.hs.som.thm.client.adapter.npj;

import java.util.List;
import java.util.Map.Entry;

import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.searshc.hs.som.thm.client.npj.ProfileDelegateClient;
import com.searshc.hs.som.thm.common.CommonConstants;
import com.searshc.hs.som.thm.common.ServiceConstants;
import com.searshc.hs.som.thm.domain.npj.AddressData;
import com.searshc.hs.som.thm.domain.npj.CustomerDetails;
import com.searshc.hs.som.thm.domain.npj.NpjCustomer;
import com.searshc.hs.som.thm.exception.ServiceException;
import com.searshc.hs.som.thm.utils.CommonUtils;

/**
 * This class serves as the delegate for calling customer add/update service
 * to find the user
 * 
 * @author Ranjit Bhakta
 * @version 1.0, Mar 05, 2014
 *
 */
public class ProfileDelegateAdapter {
	private static final Logger logger = LoggerFactory.getLogger(ProfileDelegateAdapter.class);

	private ProfileDelegateClient profileDelegateClient;
	private String profileAddServiceName;
	private String profileUpdateServiceName;
	
	/**
	 * This method calls profile delegate service passing customer
	 * information to add customer data to NPJ 
	 * 
	 * @param CustomerDetails object
	 * @return CustomerDetails object
	 */
	public CustomerDetails addCustomer(CustomerDetails customerDetails) throws ServiceException{
		CustomerDetails newCustomerDetails = null;
		
		logger.info("Start calling profile add service for customer");
		
		if(customerDetails == null){
			logger.error("Finished calling profile add service with error for customer as customerDetails invalid");
			
			return newCustomerDetails;
		}
		
		if (logger.isDebugEnabled()) {
			logger.debug("Add npj customer request xml :\n" + CommonUtils.getXMLRepresentation(customerDetails, null));
		}
		
		try {
			Response response = profileDelegateClient.addNPJProfile(profileAddServiceName, customerDetails);

			// check HTTP status
			int status = response.getStatus();
			
			// retry on bad status
			if (status != Response.Status.OK.getStatusCode()) {
				logger.error("Got error calling profile add service retrying with new request");
				
				customerDetails = getChangedCustomerDetails(customerDetails);
				
				if (logger.isDebugEnabled()) {
					logger.debug("Add npj customer request xml for retry:\n" + CommonUtils.getXMLRepresentation(customerDetails, null));
				}
				
				response = profileDelegateClient.addNPJProfile(profileAddServiceName, customerDetails);

				// check HTTP status
				status = response.getStatus();
				
				// exit on bad status
				if (status != Response.Status.OK.getStatusCode()) {
					logger.error("Got error calling profile add service during retry. Finishing the call");
					
					return newCustomerDetails;
				}
			}

			// check application return code
			String code = getHeaderValue(response, ServiceConstants.RESPONSE_HEADER_CODE, ServiceConstants.SYSTEM_ERROR_RC);
			String msg = getHeaderValue(response, ServiceConstants.RESPONSE_HEADER_MESSAGES, ServiceConstants.SYSTEM_ERROR_MSG);
			
			// exit on bad code
			if (!code.equals(ServiceConstants.VALID_RC) && !code.equals(ServiceConstants.USER_ERROR_RC)) {
				logger.error("Finished calling profile add service with error for customer");
			} else if (!(msg.equalsIgnoreCase(ServiceConstants.VALID_MSG))) {
				logger.error("Got error message when calling profile add service retrying with new request");
				
				customerDetails = getChangedCustomerDetails(customerDetails);
				
				if (logger.isDebugEnabled()) {
					logger.debug("Add npj customer request xml for retry:\n" + CommonUtils.getXMLRepresentation(customerDetails, null));
				}
				
				response = profileDelegateClient.addNPJProfile(profileAddServiceName, customerDetails);
				
				// check HTTP status
				status = response.getStatus();
				
				// exit on bad status
				if (status != Response.Status.OK.getStatusCode()) {
					logger.error("Got error calling profile add service during retry. Finishing the call");
					
					return newCustomerDetails;
				} else {
					// check application return code
					code = getHeaderValue(response, ServiceConstants.RESPONSE_HEADER_CODE, ServiceConstants.SYSTEM_ERROR_RC);
					msg = getHeaderValue(response, ServiceConstants.RESPONSE_HEADER_MESSAGES, ServiceConstants.SYSTEM_ERROR_MSG);
					
					// exit on bad code
					if (!code.equals(ServiceConstants.VALID_RC) && !code.equals(ServiceConstants.USER_ERROR_RC)) {
						logger.error("Finished calling profile add service with error for customer");
						
						return newCustomerDetails;
					} else if (!(msg.equalsIgnoreCase(ServiceConstants.VALID_MSG))) {
						logger.error("Finished calling profile add service with error for customer - error message : " + msg);
						
						throw new ServiceException(msg);
					} else {
						newCustomerDetails = response.readEntity(CustomerDetails.class);
						
						if (logger.isDebugEnabled()) {
							logger.debug("Add npj customer response xml :\n" + CommonUtils.getXMLRepresentation(newCustomerDetails, null));
						}
						
						logger.info("Finished calling profile add service successfully for customer");
						
						return newCustomerDetails;
					}
				}
			} else{
				newCustomerDetails = response.readEntity(CustomerDetails.class);
			} 
		} catch(Exception excp) {
			logger.error("Got exception during profile add operation");
		}
		
		if(newCustomerDetails != null){
			if (logger.isDebugEnabled()) {
				logger.debug("Add npj customer response xml :\n" + CommonUtils.getXMLRepresentation(newCustomerDetails, null));
			}
			
			logger.info("Finished calling profile add service successfully for customer");
		}

		return newCustomerDetails;
	}
	
	/**
	 * This method calls profile delegate service passing customer
	 * information to update customer data of NPJ 
	 * 
	 * @param customerDetails customerDetails object
	 * @return CustomerDetails object
	 * @throws ServiceException 
	 */
	public CustomerDetails updateCustomer(CustomerDetails customerDetails) throws ServiceException{
		CustomerDetails newCustomerDetails = null;
		
		if(customerDetails == null){
			logger.error("Finished calling profile update service with error for customer as customerDetails invalid");
			
			return newCustomerDetails;
		}
		
		if (logger.isDebugEnabled()) {
			logger.debug("Update npj customer request xml :\n" + CommonUtils.getXMLRepresentation(customerDetails, null));
		}
		
		logger.info("Start calling profile update service for customer");
		
		try {
			Response response = profileDelegateClient.updateNPJProfile(profileUpdateServiceName, customerDetails);

			// check HTTP status
			int status = response.getStatus();
			
			// exit on bad status
			if (status != Response.Status.OK.getStatusCode()) {
				logger.error("Finished calling profile update service with error for customer");
				
				return newCustomerDetails;
			}

			// check application return code
			String code = getHeaderValue(response, ServiceConstants.RESPONSE_HEADER_CODE, ServiceConstants.SYSTEM_ERROR_RC);
			String msg = getHeaderValue(response, ServiceConstants.RESPONSE_HEADER_MESSAGES, ServiceConstants.SYSTEM_ERROR_MSG);
			
			// exit on bad code
			if (!code.equals(ServiceConstants.VALID_RC) && !code.equals(ServiceConstants.USER_ERROR_RC)) {
				logger.error("Finished calling profile update service with error for customer");
			}
			else if (!(msg.equalsIgnoreCase(ServiceConstants.VALID_MSG))) {
				logger.error("Finished calling profile update service with error for customer - error message : " + msg);
				
				throw new ServiceException(msg);
			} 
			else {
				newCustomerDetails = response.readEntity(CustomerDetails.class);
			}
		} catch(Exception excp) {
			logger.error("Got exception during profile update operation", excp);
		}
		
		if(newCustomerDetails != null){
			if (logger.isDebugEnabled()) {
				logger.debug("update npj customer response xml :\n" + CommonUtils.getXMLRepresentation(newCustomerDetails, null));
			}
			
			logger.info("Finished calling profile update service successfully for customer");
		}
		
		return newCustomerDetails;
	}
	
	private MultivaluedMap<String, Object> getResponseHeaderMap(Response response) {
		MultivaluedMap<String, Object> map = response.getHeaders();

		if (logger.isDebugEnabled()) {
			for (Entry<String, List<Object>> entry : map.entrySet()) {
				logger.debug("Client service response headers:{}={}", entry.getKey(), entry.getValue());
			}
		}

		return map;
	}

	private String getHeaderValue(Response response, String key, String deefault) {
		String value = null;

		try {
			MultivaluedMap<String, Object> map = getResponseHeaderMap(response);
			value = (String) map.get(key).get(0);
		} catch (Exception e) {
			logger.error("Error extracting header value:{}  error: {}", key, e.getMessage());
			value = deefault;
		}

		return value;
	}
	
	/**
	 * This method change customerDetails object
	 * to set the addressFlag 'Y' and remove leading '-' character
	 * from the address
	 * 
	 * @param customerDetails
	 * @return changed CustomerDetails
	 */
	private CustomerDetails getChangedCustomerDetails(CustomerDetails customerDetails){
		if(customerDetails.getAddressDatas() != null && !customerDetails.getAddressDatas().isEmpty()){
			AddressData addressData = customerDetails.getAddressDatas().get(0);
			
			if(addressData != null){
				String address = addressData.getAddressLine1();
				
				if(!StringUtils.isEmpty(address)){
					NpjCustomer npjCustomer = customerDetails.getNpjCustomer();
					
					if(npjCustomer != null){
						npjCustomer.setAddressFlag(CommonConstants.YES_FL);
						
						if(address.trim().startsWith(CommonConstants.DASH)){
							address = address.trim().substring(1);
							addressData.setAddressLine1(address);
						}
					}
				}
			}
		}
		
		return customerDetails;
	} 

	public void setProfileDelegateClient(ProfileDelegateClient profileDelegateClient) {
		this.profileDelegateClient = profileDelegateClient;
	}

	public void setProfileAddServiceName(String profileAddServiceName) {
		this.profileAddServiceName = profileAddServiceName;
	}

	public void setProfileUpdateServiceName(String profileUpdateServiceName) {
		this.profileUpdateServiceName = profileUpdateServiceName;
	}
}