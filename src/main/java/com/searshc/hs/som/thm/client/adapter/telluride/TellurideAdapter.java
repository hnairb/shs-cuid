/* 
 * Copyright 2014 (C) Sears Holdings Corp  
 *  
 * Created on : 13-Mar-14
 * Author     : Ranjit Bhakta   
 * 
 *----------------------------------------------------------------------------- 
 * Revision History (Release 1.0.0.0) 
 *----------------------------------------------------------------------------- 
 * VERSION     AUTHOR/      DESCRIPTION OF CHANGE 
 * OLD/NEW     DATE                RFC NO 
 *----------------------------------------------------------------------------- 
 * --/1.0  | Ranjit Bhakta  | Initial Create. 
 *         | 13-Mar-14      | 
 *---------|--------------- |--------------------------------------------------- 
 */
package com.searshc.hs.som.thm.client.adapter.telluride;

import java.net.ConnectException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.soap.SOAPFaultException;

import org.apache.axis2.java.security.TrustAllTrustManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.searshc.hs.som.thm.client.security.SecurityUtils;
import com.searshc.hs.som.thm.common.ServiceConstants;
import com.searshc.hs.som.thm.domain.telluride.Bank;
import com.searshc.hs.som.thm.domain.telluride.BankSoap;
import com.searshc.hs.som.thm.domain.telluride.OfferRegistration;
import com.searshc.hs.som.thm.domain.telluride.OfferRegistrationResponse;
import com.searshc.hs.som.thm.utils.CommonUtils;

/**
 * This class serves as the delegate for calling telluride service to register
 * offer for user
 * 
 * @author Ranjit Bhakta
 * @version 1.0, Mar 13, 2014
 * 
 */
public class TellurideAdapter {
	private static final Logger logger = LoggerFactory
			.getLogger(TellurideAdapter.class);

	private static Bank bank = new Bank();

	private static BankSoap bankSoap = bank.getBankSoap();

	private String tellurideEndPoint;
	
	private SecurityUtils securityUtils;
	/**
	 * This method enrolls the customer for SYWR
	 * 
	 * @param offerRegistration
	 *            object of the customer
	 * @return OfferRegistrationResponse object
	 */
	public OfferRegistrationResponse enroll(OfferRegistration offerRegistration) {
		OfferRegistrationResponse offerRegistrationResponse = null;

		if (offerRegistration != null) {
			if (logger.isDebugEnabled()) {
				logger.debug("Offer registration request xml :\n"
						+ CommonUtils.getXMLRepresentation(offerRegistration,
								null));
			}

			try {
				if (bankSoap instanceof BindingProvider) {
					BindingProvider bindingProvider = (BindingProvider) bankSoap;

					configureBindingProvider(bindingProvider, tellurideEndPoint);
				}

				offerRegistrationResponse = bankSoap
						.offerRegistration(offerRegistration);

				if (logger.isDebugEnabled()) {
					logger.debug("Offer registration response xml :\n"
							+ CommonUtils.getXMLRepresentation(
									offerRegistrationResponse,
									OfferRegistrationResponse.class));
				}
			} catch (ConnectException e) {
				logger.error("Could not setup telluride connection", e);
			} catch (SOAPFaultException e) {
				logger.error("Got error during response", e);
			}
		}

		return offerRegistrationResponse;
	}

	/**
	 * Method to handle https connection and adding headers.
	 * 
	 * @param bindingProvider
	 *            BindingProvider object
	 * @throws ConnectException
	 */
	private void configureBindingProvider(BindingProvider bindingProvider, String url) throws ConnectException {
		// setting service end point
		bindingProvider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, url);
		
		if(url.startsWith("https://")){
			try {
				bindingProvider.getRequestContext().put(ServiceConstants.SOCKET_FACTORY, buildSocketFactory());
			} catch (Exception ex) {
				throw new ConnectException("Exception occured while trying to connect web service securely : "
								+ ex.getMessage());
			}
		}
		
		Map<String, List<String>> headers = new HashMap<String, List<String>>();
	   
		headers.put(ServiceConstants.ESBSVCNAME, Collections.singletonList(ServiceConstants.OFFERREGISTRATION));
	    headers.put(ServiceConstants.ESBREQUESTORTYPE, Collections.singletonList(ServiceConstants.HOMESERVICES));
	    headers.put(ServiceConstants.ESBREQUESTORID, Collections.singletonList(ServiceConstants.THMELIG));
	    //bsingh4 : Added to provide client id and access token as part of request header.
	    String accessToken = securityUtils.fetchAccessToken();
	    if(accessToken != null) 
	    {
	    	headers.put(ServiceConstants.CLIENT_ID, Collections.singletonList(securityUtils.getClientID()));
	    	headers.put(ServiceConstants.ACCESS_TOKEN, Collections.singletonList(accessToken));
	    }

	    //setting headers.
	    bindingProvider.getRequestContext().put(MessageContext.HTTP_REQUEST_HEADERS, headers);
	}

	/**
	 * Getting default trust-all ssl socket factory
	 * 
	 * @throws KeyManagementException
	 * @throws NoSuchAlgorithmException
	 * @return SSLSocketFactory
	 */
	private static SSLSocketFactory buildSocketFactory()
			throws KeyManagementException, NoSuchAlgorithmException {
		SSLContext ctx = SSLContext.getInstance(ServiceConstants.SSL);

		ctx.init(null, new TrustManager[] { new TrustAllTrustManager() }, null);

		return ctx.getSocketFactory();
	}

	public void setTellurideEndPoint(String tellurideEndPoint) {
		this.tellurideEndPoint = tellurideEndPoint;
	}

	public void setSecurityUtils(SecurityUtils securityUtils) {
		this.securityUtils = securityUtils;
	}

}