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

import java.io.File;

/**
 * This interface contains all the required constants
 * 
 * @author Ranjit Bhakta
 * @version 1.0, Mar 03, 2014
 */
public interface CommonConstants {
	public static String THM_INPUT_RESOURCE = "THM_INPUT_RESOURCE";
	public static String THM_OUTPUT_RESOURCE = "THM_OUTPUT_RESOURCE";
	public static String THM_FALLOUT_RESOURCE = "THM_FALLOUT_RESOURCE";
	
	public static String FILE_PROTOCOL = File.separator.equals("\\") ? "file:/" : "file:";
	
	public static String EMPTY_DATA = "";
	public static String EMPTY_SPACE = " ";
	
	public static String YES_FL = "Y";
	public static String NO_FL = "N";
	
	public static String PHONE_TYPE_PHONE = "PHONE";
	public static String PHONE_TYPE_FAX = "FAX";
	
	public static String MOBILE_PHONE = "MOBILE";
	public static String HOME_PHONE = "HOME";
	public static String PRIMARY_PHONE = "PRIMARY";
	public static String ALTERNATE_PHONE = "ALT";
	public static String WORK_PHONE = "WORK";
	
	public static String MOBILE_PHONE_TYPE = "C";
	public static String HOME_PHONE_TYPE = "H";
	public static String PRIMARY_PHONE_TYPE = "P";
	public static String ALTERNATE_PHONE_TYPE = "O";
	public static String WORK_PHONE_TYPE = "W";
	
	public static String PAYMENT_TYPE_ACH = "ACH";
	
	public static String CUSTOMER_TYPE = "H";
	public static String CUSTOMER_LOCATION_KEY = "0001";
	public static String LANGUAGE_CODE = "E";
	public static String EMPTY_PHONE_NO = "0000000000";
	
	public static String EMAIL_SRC_CD = "Sears.com";
	public static String EMAIL_SRC_FUNC = "HWPBATCH";
	public static String EMAIL_SVC_CD = "CIB";
	public static String EMAIL_CAP_UNIT = "0000";
	public static String EMAIL_CAP_EMP_NO = "000000";
	
	public static String DATE_FORMAT = "MMddyyyy";
	public static String SYWR_REG_START_DATE_FORMAT = "yyyy-MM-dd";
	public static String JOB_INPUT_DATE_FORMAT = "yyyyMMdd";
	
	public static String THM_ADD_FALLOUT_MSG = "CUSTOMER ADD";
	public static String THM_CANCEL_FALLOUT_MSG = "CUSTOMER CANCEL";
	public static String THM_UPDATE_FALLOUT_MSG = "CUSTOMER UPDATE";
	public static String THM_SYWR_OFFER_MSG = "SYWR OFFER";
	public static String THM_SYWR_MEMBER_MSG = "SYWR MEMBER";
	public static String THM_SYWR_EMPTY_SYWR = "EMPTY SYWR";
	
	public static String JOB_STATUS = "JOB_STATUS";
	
	public static String SYWR_OFFER_CODE_MSG_PRE = "telluride.offer.code.";
	public static String SYWR_GRP_NAME_MSG_PRE = "telluride.group.name.";
	
	public static String SYWR_DATE_FORMAT = "yyyy-MM-dd'T'hh:mm:ss";
	public static int SYWR_REG_END_YEAR = 2035;
	
	public static String SYWR_CUSTOMER_LIST = "SYWR_CUSTOMER_LIST";
	
	public static String DEFAULT_OBU_UNIT="addCancel.default.OBU_UNIT";
	public static String DEFAULT_OBU_AGENTID="addCancel.default.OBU_AGENT_ID";
	public static String DEFAULT_CROSSCOUNTRY_UNIT="addCancel.default.CROSSCOUNTRY_UNIT";
	public static String DEFAULT_CROSSCOUNTRY_AGENTID="addCancel.default.CROSSCOUNTRY_AGENT_ID";
	
	public static String TECHPROTECT_UNIT ="addCancel.default.TECHPROTECT_UNIT";
	public static String TECHPROTECT_AGENT_ID ="addCancel.default.TECHPROTECT_AGENT_ID";
	
	public static String ADDTHM_FALLOUT_MSG_NOPRODUCTS = " : No product code can be found for the customer";
	public static String ADDTHM_FALLOUT_MSG_NOPRODUCTID = " : The customer record has no product id";
	public static String ADDTHM_FALLOUT_MSG_EMPTYPHONE = " : The customer record has empty phone no";
	public static String ADDTHM_FALLOUT_MSG_NOTADDED = " : The customer record could not be added in the NPJ";
	
	public static String ADDTHMNPJ_AUDIT_FALLOUT_MSG_OFFERFAILED = " : SYWR offer registration failed for the customer";
	public static String ADDTHMNPJ_AUDIT_FALLOUT_MSG_UPDATEFAILED = " : Could not update the customer as the customer is not present in NPJ";
	
	public static String CANCELTHM_FALLOUT_MSG_NOPRODUCTS = " : No product code can be found for the customer";
	public static String CANCELTHM_FALLOUT_MSG_NOPRODUCTID = " : The customer record has no product id";
	public static String CANCELTHM_FALLOUT_MSG_NOCUSTKEY = " : The customer record has no customer key";
	
	public static String CANCELTHMNPJ_AUDIT_FALLOUT_MSG_OFFERFAILED = " : SYWR offer de-registration failed for the customer";
	public static String CANCELTHMNPJ_AUDIT_FALLOUT_MSG_UPDATEFAILED = " : Could not update the customer as the customer is not present in NPJ";
	
	public static String SYWR_FALLOUT_MSG_MEMBERLOOKUP = " : Could not find the customer in SYWR member lookup";
	public static String SYWR_FALLOUT_MSG_MEMBERNOTFOUND = " : Could not get sywr member for the customer";
	public static String SYWR_FALLOUT_MSG_OFFERREGFAILED = " : SYWR offer registration failed for the customer";
	public static String SYWR_FALLOUT_MSG_OFFERDEREGFAILED = " : SYWR offer de-registration failed for the customer";
	public static String SYWR_FALLOUT_MSG_NOTUPDATECUST = " : Could not update the customer";
	public static String SYWR_FALLOUT_MSG_MULTIPLEMEMBERS = " : multiple members found";
	public static String SYWR_FALLOUT_MSG_MULTIPLEMEMBERS_MATCHED_ZIP_LN_EMAIL="SYW membership has NOT been applied – no match on last name. Multiple members with matched zip/last name/email address.";
	public static String SYWR_FALLOUT_MSG_MULTIPLEMEMBERS_MATCHED_ZIP_NOMATCH_ON_LASTNAME_OR_EMIL="SYW membership has NOT been applied – no match on last name/email address. Multiple members with matched zip/last name.";
	public static String SYWR_FALLOUT_MSG_MULTIPLEMEMBERS_MATCHED_ZIP_AND_EMAIL_NOMATCH_ON_LASTNAME="SYW membership has NOT been applied – no match on last name/last name. Multiple members with matched zip/email address.";
	public static String SYWR_FALLOUT_MSG_MULTIPLEMEMBERS_MATCHED_ZIP_NOMATCH_ON_LASTNAME_AND_EMAIL="SYW membership has NOT been applied – no match on last name/last name/email address. Multiple members with matched zip.";
	public static String SYWR_FALLOUT_MSG_MULTIPLEMEMBERS_MATCHED_LASTNAME_AND_EMAIL_NOMATCH_ON_ZIP="SYW membership has NOT been applied – no match on zip. Multiple members with matched last name and email address.";
	public static String SYWR_FALLOUT_MSG_MULTIPLEMEMBERS_MATCHED_LASTNAME_NOMATCH_ON_ZIP_AND_EMAIL="SYW membership has NOT been applied – no match on zip/email address. Multiple members with matched last name.";
	public static String SYWR_FALLOUT_MSG_MULTIPLEMEMBERS_MATCHED_EMAIL_NOMATCH_ON_ZIP_AND_LASTNAME="SYW membership has NOT been applied – no match on zip/last name. Multiple members with matched email address.";
	public static String SYWR_FALLOUT_MSG_MULTIPLEMEMBERS_NOMATCH_ON_ZIP_LASTNAME_AND_EMAIL="SYW membership has NOT been applied – no match on zip/last name/email address.";
	
	public static String DASH = "-";
	
	public static String THM_NPJ_FALLOUT_REASON = "CUSTOMER IS HAVING VALID THM AGREEMENT";
	
	public static String RETRY_FL = "1";
	public static String RETRY_FL_OFF = "0";
	
	public static String ADD_SALE_ORIGINATION_WHEN_SO_BLANK ="add.sale.origination.when.Service_Order.Blank";
	public static String ADD_SALE_ORIGINATION_WHEN_SO_NOT_BLANK="add.sale.origination.when.Service_Order.NotBlank";
	public static String ADD_SALE_ORIGINATION_WHEN_SAI_BLANK ="add.sale.origination.when.SellingAgentId.Blank";
	public static String ADD_SALE_ORIGINATION_WHEN_SAI_NOT_BLANK="add.sale.origination.when.SellingAgentId.NotBlank";
	public static String DEFAULT_ONLINE_AGENT="default.Online.Agent";
	public static String DEFAULT_ONLINE_UNIT="Online.Unit";
	
	public static String ADD_OPERATION = "ADD";
	public static String CANCEL_OPERATION = "CANCEL";
	public static String REACTIVATE_OPERATION = "REACTIVATE";
	public static String NPJCustomerNullRecord = "NULL";
	public static String TP_CLIENT = "TP";
	
	
}