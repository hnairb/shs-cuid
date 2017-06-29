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
package com.searshc.hs.som.thm.client.adapter.sywr;

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
import javax.xml.ws.soap.SOAPFaultException;

import org.apache.axis2.java.security.TrustAllTrustManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.searshc.hs.som.thm.client.security.SecurityUtils;
import com.searshc.hs.som.thm.common.ServiceConstants;
import com.searshc.hs.som.thm.domain.sywr.GetMemberLookupResponse.GetMemberLookupResult;
import com.searshc.hs.som.thm.domain.sywr.Profile;
import com.searshc.hs.som.thm.domain.sywr.ProfileSoap;
import com.searshc.hs.som.thm.utils.CommonUtils;

/**
 * This class serves as the delegate for calling sywr getMember service to get
 * sywr member details
 * 
 * @author Ranjit Bhakta
 * @version 1.0, Apr 18, 2014
 * 
 */
@Component
public class SYWRProfileAdapter {
	private static final Logger logger = LoggerFactory.getLogger(SYWRProfileAdapter.class);

	private static Profile profile = new Profile();

	private static ProfileSoap profileSoap = profile.getProfileSoap12();

	private String sywrProfileEndPoint;
	
	private SecurityUtils securityUtils;

	/**
	 * This method searches the sywr member using provided search parameters and
	 * search criteria
	 * 
	 * @param messageVersion
	 * @param memberNumber
	 * @param emailAddress
	 * @param phoneNumber
	 * @param requestorID
	 * @param searchType
	 * @param currentDate
	 * @param currentTime
	 * @param maxRecords
	 * @param firstName
	 * @param lastName
	 * @param zipCode
	 * @return GetMemberLookupResult
	 */
	public GetMemberLookupResult getMemberLookup(String messageVersion,
			String memberNumber, String emailAddress, String phoneNumber,
			String requestorID, String searchType, String currentDate,
			String currentTime, String maxRecords, String firstName,
			String lastName, String zipCode) throws Exception {

		GetMemberLookupResult result = null;

		logger.info("Calling getMemberLookup service with "
							+ "messageVersion = " + messageVersion + " memberNumber = " + memberNumber
							+ " emailAddress = " + emailAddress + " phoneNumber = " + phoneNumber
							+ " requestorID = "	+ requestorID + " searchType = " + searchType
							+ " currentDate = "	+ currentDate + " currentTime = " + currentTime
							+ " maxRecords = " + maxRecords + " firstName = " + firstName
							+ " lastName = " + lastName	+ " zipCode = " + zipCode);

		try {
			if (profileSoap instanceof BindingProvider) {
				BindingProvider bindingProvider = (BindingProvider) profileSoap;

				configureBindingProvider(bindingProvider, "http://tellurideas-uat.intra.searshc.com/tellurideAS/Profile");
			}

			result = profileSoap.getMemberLookup("13", memberNumber, emailAddress, 
					phoneNumber, null, null, "SYWC", "6", currentDate, 
					currentTime, maxRecords, null, firstName, lastName, zipCode);

			if (logger.isDebugEnabled()) {
				logger.debug("GetMeberLookup registration response xml :\n"
						+ CommonUtils.getXMLRepresentation(result,
								GetMemberLookupResult.class));
			}
		} catch (ConnectException e) {
			logger.error("Could not setup sywr getMeberLookup connection", e);
		} catch (SOAPFaultException e) {
			logger.error("Got error during response", e);
			e.printStackTrace();
		}

		return result;
	}

	/**
	 * Method to handle https connection and adding headers.
	 * 
	 * @param bindingProvider BindingProvider object
	 * @throws ConnectException 
	 */
	private void configureBindingProvider(BindingProvider bindingProvider, String url) throws ConnectException {
		// setting service end point
		bindingProvider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, url);
		securityUtils = new SecurityUtils();
		if(url.startsWith("https://")){
			try {
				bindingProvider.getRequestContext().put(ServiceConstants.SOCKET_FACTORY, buildSocketFactory());
			} catch (Exception ex) {
				throw new ConnectException("Exception occured while trying to connect web service securely : "
								+ ex.getMessage());
			}
		}
		
		Map<String, List<String>> headers = new HashMap<String, List<String>>();
	   
		headers.put(ServiceConstants.ESBSVCNAME, Collections.singletonList(ServiceConstants.GETMEMBERLOOKUP));
	    headers.put(ServiceConstants.ESBREQUESTORTYPE, Collections.singletonList(ServiceConstants.HOMESERVICES));
	    headers.put(ServiceConstants.ESBREQUESTORID, Collections.singletonList(ServiceConstants.SYWR_REQUESTOR_ID));
//	    bsingh4 : Added to provide client id and access token as part of request header.
	    /*String accessToken = securityUtils.fetchAccessToken();
	    if(accessToken != null) 
	    {
	    	headers.put(ServiceConstants.CLIENT_ID, Collections.singletonList(securityUtils.getClientID()));
	    	headers.put(ServiceConstants.ACCESS_TOKEN, Collections.singletonList(accessToken));
	    }*/
	    //setting headers.
//	    bindingProvider.getRequestContext().put(MessageContext.HTTP_REQUEST_HEADERS, headers);
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

	public void setSywrProfileEndPoint(String sywrProfileEndPoint) {
		this.sywrProfileEndPoint = sywrProfileEndPoint;
	}

	public void setSecurityUtils(SecurityUtils securityUtils) {
		this.securityUtils = securityUtils;
	}
}