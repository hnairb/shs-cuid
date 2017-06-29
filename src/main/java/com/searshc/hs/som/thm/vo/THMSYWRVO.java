/* 
 * Copyright 2014 (C) Sears Holdings Corp  
 *  
 * Created on : 09-Apr-14
 * Author     : Ranjit Bhakta   
 * 
 *----------------------------------------------------------------------------- 
 * Revision History (Release 1.0.0.0) 
 *----------------------------------------------------------------------------- 
 * VERSION     AUTHOR/      DESCRIPTION OF CHANGE 
 * OLD/NEW     DATE                RFC NO 
 *----------------------------------------------------------------------------- 
 * --/1.0  | Ranjit Bhakta  | Initial Create. 
 *         | 09-Apr-14      | 
 *---------|--------------- |--------------------------------------------------- 
 */
package com.searshc.hs.som.thm.vo;

import java.io.Serializable;


/**
 * VO class for SYWR object
 * This bean is populated when the corresponding
 * database query is run sywr job
 * 
 * @author Ranjit Bhakta
 * @version 1.0, Apr 09, 2014
 *
 */
public class THMSYWRVO implements Serializable {
	private static final long serialVersionUID = 1976640570325624731L;
	
	private String customerKey = "";
	private String customerFirstName = "";
	private String customerLastName = "";
	private String customerPhoneNumber = "";
	private String customerPhoneType = "";
	private String customerAddress = "";
	private String customerCity = "";
	private String customerState = "";
	private String customerZip = "";
	private String customerEmailAddress = "";
	private String customerAuthData = "";
	private String customerProductCode = "";
	private String sywrMemberId = "";
	private String regStartDate = "";
	private String falloutMessage = "";
	private boolean isEnrolled = false;
	
	public String getCustomerKey() {
		return customerKey;
	}

	public void setCustomerKey(String customerKey) {
		this.customerKey = customerKey;
	}

	public String getCustomerFirstName() {
		return customerFirstName;
	}

	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}

	public String getCustomerLastName() {
		return customerLastName;
	}

	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}

	public String getCustomerZip() {
		return customerZip;
	}

	public void setCustomerZip(String customerZip) {
		this.customerZip = customerZip;
	}
	
	public String getCustomerPhoneNumber() {
		return customerPhoneNumber;
	}

	public void setCustomerPhoneNumber(String customerPhoneNumber) {
		this.customerPhoneNumber = customerPhoneNumber;
	}
	
	public String getCustomerPhoneType() {
		return customerPhoneType;
	}

	public void setCustomerPhoneType(String customerPhoneType) {
		this.customerPhoneType = customerPhoneType;
	}
	
	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getCustomerCity() {
		return customerCity;
	}

	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}

	public String getCustomerState() {
		return customerState;
	}

	public void setCustomerState(String customerState) {
		this.customerState = customerState;
	}

	public String getCustomerEmailAddress() {
		return customerEmailAddress;
	}

	public void setCustomerEmailAddress(String customerEmailAddress) {
		this.customerEmailAddress = customerEmailAddress;
	}
	
	public String getCustomerAuthData() {
		return customerAuthData;
	}

	public void setCustomerAuthData(String customerAuthData) {
		this.customerAuthData = customerAuthData;
	}

	public String getCustomerProductCode() {
		return customerProductCode;
	}

	public void setCustomerProductCode(String customerProductCode) {
		this.customerProductCode = customerProductCode;
	}
	
	public String getSywrMemberId() {
		return sywrMemberId;
	}

	public void setSywrMemberId(String sywrMemberId) {
		this.sywrMemberId = sywrMemberId;
	}
	
	public String getRegStartDate() {
		return regStartDate;
	}

	public void setRegStartDate(String regStartDate) {
		this.regStartDate = regStartDate;
	}

	public String getFalloutMessage() {
		return falloutMessage;
	}

	public void setFalloutMessage(String falloutMessage) {
		this.falloutMessage = falloutMessage;
	}

	public boolean isEnrolled() {
		return isEnrolled;
	}

	public void setEnrolled(boolean isEnrolled) {
		this.isEnrolled = isEnrolled;
	}
}