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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.searshc.hs.som.thm.client.npj.CustomerDelegateClient;
import com.searshc.hs.som.thm.common.ServiceConstants;
import com.searshc.hs.som.thm.domain.npj.CustomerData;
import com.searshc.hs.som.thm.domain.npj.CustomerDetails;
import com.searshc.hs.som.thm.domain.npj.CustomerSearchCriteria;
import com.searshc.hs.som.thm.domain.npj.SearchCriteria;
import com.searshc.hs.som.thm.utils.CommonUtils;

/**
 * This class serves as the delegate for calling customer search service
 * to find the user
 * 
 * @author Ranjit Bhakta
 * @version 1.0, Mar 05, 2014
 *
 */
public class CustomerDelegateAdapter {
	private static final Logger logger = LoggerFactory.getLogger(CustomerDelegateAdapter.class);

	private CustomerDelegateClient customerDelegateClient;
	private String searchCustomerServiceName;
	private String customerDetailsServiceName;
	
	/**
	 * This method calls actual delegate service passing search criteria 
	 * 
	 * @param customerSearchCriteria object
	 * @return CustomerData data of found customer(s)
	 */
	public CustomerData searchCustomer(CustomerSearchCriteria customerSearchCriteria){
		CustomerData customerData = null;
		
		logger.info("Start calling customer search service for customer");
		
		if(customerSearchCriteria == null){
			logger.error("Finished calling customer search service with error for customer as customer search criteria invalid");
			
			return customerData;
		}
		
		if (logger.isDebugEnabled()) {
			logger.debug("Search npj customer request xml :\n" + CommonUtils.getXMLRepresentation(customerSearchCriteria, null));
		}
		
		try {
			Response response = customerDelegateClient.searchCustomer(searchCustomerServiceName, customerSearchCriteria);
			
			// check HTTP status
			int status = response.getStatus();
			
			// exit on bad status
			if (status != Response.Status.OK.getStatusCode()) {
				logger.error("Finished calling customer search service with error for customer");
				
				return customerData;
			}

			// check application return code
			String code = getHeaderValue(response, ServiceConstants.RESPONSE_HEADER_CODE, ServiceConstants.SYSTEM_ERROR_RC);
			String msg = getHeaderValue(response, ServiceConstants.RESPONSE_HEADER_MESSAGES, ServiceConstants.SYSTEM_ERROR_MSG);
			
			// exit on bad code
			if (!code.equals(ServiceConstants.VALID_RC) && !code.equals(ServiceConstants.USER_ERROR_RC)) {
				logger.error("Finished calling customer search service with error for customer");
				
				return customerData;
			}
			else if (!(msg.equalsIgnoreCase(ServiceConstants.VALID_MSG))) {
				logger.error("Finished calling customer search service with error for customer - error message : " + msg);
				
				return customerData;
			} else{
				customerData = response.readEntity(CustomerData.class);
			}

		} catch(Exception excp) {
			logger.error("Got exception during customer search operation", excp);
		}
		
		if(customerData != null){
			if (logger.isDebugEnabled()) {
				logger.debug("Search npj customer reponse xml :\n" + CommonUtils.getXMLRepresentation(customerData, null));
			}
			
			logger.info("Finished calling customer search service successfully for customer");
		}

		return customerData;
	}
	
	/**
	 * This method calls actual delegate service passing search criteria 
	 * 
	 * @param searchCriteria object
	 * @return CustomerDetails data of found customer(s)
	 */
	public CustomerDetails searchCustomer(SearchCriteria searchCriteria){
		CustomerDetails customerDetails = null;
		
		logger.info("Start calling customer search service for customer");
		
		if(searchCriteria == null){
			logger.error("Finished calling customer search service with error for customer as customer search criteria invalid");
			
			return customerDetails;
		}
		
		if (logger.isDebugEnabled()) {
			logger.debug("Search npj customer request xml :\n" + CommonUtils.getXMLRepresentation(searchCriteria, null));
		}
		
		try {
			Response response = customerDelegateClient.getCustomerDetails(customerDetailsServiceName, searchCriteria);
			
			// check HTTP status
			int status = response.getStatus();
			
			// exit on bad status
			if (status != Response.Status.OK.getStatusCode()) {
				logger.error("Finished calling customer search service with error for customer");
				
				return customerDetails;
			}

			// check application return code
			String code = getHeaderValue(response, ServiceConstants.RESPONSE_HEADER_CODE, ServiceConstants.SYSTEM_ERROR_RC);
			String msg = getHeaderValue(response, ServiceConstants.RESPONSE_HEADER_MESSAGES, ServiceConstants.SYSTEM_ERROR_MSG);
			
			// exit on bad code
			if (!code.equals(ServiceConstants.VALID_RC) && !code.equals(ServiceConstants.USER_ERROR_RC)) {
				logger.error("Finished calling customer search service with error for customer");
				
				return customerDetails;
			}
			else if (!(msg.equalsIgnoreCase(ServiceConstants.VALID_MSG))) {
				logger.error("Finished calling customer search service with error for customer");
				
				return customerDetails;
			} else{
				customerDetails = response.readEntity(CustomerDetails.class);
			}

		} catch(Exception excp) {
			logger.error("Got exception during customer search operation", excp);
		}
		
		if(customerDetails != null){
			if (logger.isDebugEnabled()) {
				logger.debug("Search npj customer reponse xml :\n" + CommonUtils.getXMLRepresentation(customerDetails, null));
			}
			
			logger.info("Finished calling customer search service successfully for customer");
		}

		return customerDetails;
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
			logger.error("Error extracting header value:{}  error:{}", key, e.getMessage());
			value = deefault;
		}

		return value;
	}

	public void setCustomerDelegateClient(CustomerDelegateClient customerDelegateClient) {
		this.customerDelegateClient = customerDelegateClient;
	}

	public void setSearchCustomerServiceName(String searchCustomerServiceName) {
		this.searchCustomerServiceName = searchCustomerServiceName;
	}

	public void setCustomerDetailsServiceName(String customerDetailsServiceName) {
		this.customerDetailsServiceName = customerDetailsServiceName;
	}
}