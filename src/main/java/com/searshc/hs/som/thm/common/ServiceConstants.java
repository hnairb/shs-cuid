/* 
 * Copyright 2014 (C) Sears Holdings Corp  
 *  
 * Created on : 03-Mar-14
 * Author     : Ranjit Bhakta   
 * 
 *----------------------------------------------------------------------------- 
 * Revision History (Release 1.0.0.0) 
 *----------------------------------------------------------------------------- 
 * VERSION     AUTHOR/      DESCRIPTION OF CHANGE 
 * OLD/NEW     DATE                RFC NO 
 *----------------------------------------------------------------------------- 
 * --/1.0  | Ranjit Bhakta  | Initial Create. 
 *         | 03-Mar-14      | 
 *---------|--------------- |--------------------------------------------------- 
 */
package com.searshc.hs.som.thm.common;

/**
 * Constants for web service calls
 * 
 * @author Ranjit Bhakta
 * @version 1.0, Mar 03, 2014
 */
public interface ServiceConstants {
	//THM Security header  
	public static final String SERVICE_NAME_HEADER = "servicename";
	public static final String NPJ_ID = "NPJ";
	
	public static final String VALID_RC = "00";
	public static final String INFO_RC = "01";
	public static final String WARNING_RC = "04";
	public static final String USER_ERROR_RC = "08";
	public static final String SYSTEM_ERROR_RC = "12";

	public static final String VALID_MSG = "SUCCESS";
	public static final String INFO_MSG = "INFORMATIONAL";
	public static final String WARNIG_ERROR_MSG = "WARNING";
	public static final String USER_ERROR_MSG = "USER ERROR";
	public static final String SYSTEM_ERROR_MSG = "SYSTEM ERROR";
	public static final String SYSTEM_ERROR = "ERROR";
	
	//Header tags
	public final String RESPONSE_HEADER_CODE = "code";
	public final String RESPONSE_HEADER_PROCESSID = "processId";
	public final String RESPONSE_HEADER_SUBCODE = "subcode";
	public final String RESPONSE_HEADER_MESSAGES = "messages";
	public final String RESPONSE_HEADER_MESSAGE_DELIMITER = "|";
	
	public final String SYWR_MSG_VER = "01";
	public final String SYWR_ACTION_TAG = "A";
	public final String SYWR_REQUESTOR_ID = "SYWR";
	public final String SYWR_MESSAGE_VERSION = "15";
	
	public final String SOCKET_FACTORY = "com.sun.xml.internal.ws.transport.https.client.SSLSocketFactory";
	public final String SSL = "SSL";
	
	public final String ESBSVCNAME = "ESBSVCNAME";
	public final String ESBREQUESTORTYPE = "ESBREQUESTORTYPE";
	public final String ESBREQUESTORID = "ESBREQUESTORID";
	public final String CLIENT_ID = "client_id";
	public final String ACCESS_TOKEN = "access_token";
	
	public final String OFFERREGISTRATION = "OfferRegistration";
	public final String GETMEMBERLOOKUP = "GMLOOKUP";
	public final String HOMESERVICES = "HomeServices";
	public final String THMELIG = "THMELIG";
} 