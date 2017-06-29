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
package com.searshc.hs.som.thm.vo;


/**
 * VO class for AddCustomer object
 * This bean is populated when the corresponding
 * input reader is called from corresponding add/cancel
 * THM customer job
 * 
 * @author Ranjit Bhakta
 * @version 1.0, Mar 03, 2014
 *
 */
public class THMCustomerVO extends THMCustomerVOSellingInfo {
	private String contractNumber = "";
	private String customerKey = "";
	private String customerFirstName = "";
	private String customerLastName = "";
	private String customerAddress = "";
	private String customerCity = "";
	private String customerState = "";
	private String customerZip = "";
	private String customerPhoneType = "";
	private String customerPhoneNumber = "";
	private String customerAlternatePhoneType = "";
	private String customerAlternatePhoneNumber = "";
	private String customerEmailAddress = "";
	private String productId = "";
	private String productCode = "";
	private String startDate = "";
	private String endDate = "";
	private String premiumAmount = "";
	private String paymentType = "";
	private String reinstateFlag = "N";
	private String cancelCode = "";
	private String falloutMessage = "";
	private boolean isFalloutRecord = false;
	private String saleOrigination = "";
	
	public String getContractNumber() {
		return contractNumber;
	}

	public void setContractNumber(String contractNumber) {
		this.contractNumber = contractNumber;
	}

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

	public String getCustomerZip() {
		return customerZip;
	}

	public void setCustomerZip(String customerZip) {
		this.customerZip = customerZip;
	}

	public String getCustomerPhoneType() {
		return customerPhoneType;
	}

	public void setCustomerPhoneType(String customerPhoneType) {
		this.customerPhoneType = customerPhoneType;
	}

	public String getCustomerPhoneNumber() {
		return customerPhoneNumber;
	}

	public void setCustomerPhoneNumber(String customerPhoneNumber) {
		this.customerPhoneNumber = customerPhoneNumber;
	}

	public String getCustomerAlternatePhoneType() {
		return customerAlternatePhoneType;
	}

	public void setCustomerAlternatePhoneType(String customerAlternatePhoneType) {
		this.customerAlternatePhoneType = customerAlternatePhoneType;
	}

	public String getCustomerAlternatePhoneNumber() {
		return customerAlternatePhoneNumber;
	}

	public void setCustomerAlternatePhoneNumber(
			String customerAlternatePhoneNumber) {
		this.customerAlternatePhoneNumber = customerAlternatePhoneNumber;
	}

	public String getCustomerEmailAddress() {
		return customerEmailAddress;
	}

	public void setCustomerEmailAddress(String customerEmailAddress) {
		this.customerEmailAddress = customerEmailAddress;
	}
	
	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getPremiumAmount() {
		return premiumAmount;
	}

	public void setPremiumAmount(String premiumAmount) {
		this.premiumAmount = premiumAmount;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getReinstateFlag() {
		return reinstateFlag;
	}

	public void setReinstateFlag(String reinstateFlag) {
		this.reinstateFlag = reinstateFlag;
	}

	public String getCancelCode() {
		return cancelCode;
	}

	public void setCancelCode(String cancelCode) {
		this.cancelCode = cancelCode;
	}

	public String getFalloutMessage() {
		return falloutMessage;
	}

	public void setFalloutMessage(String falloutMessage) {
		this.falloutMessage = falloutMessage;
	}

	public boolean isFalloutRecord() {
		return isFalloutRecord;
	}

	public void setFalloutRecord(boolean isFalloutRecord) {
		this.isFalloutRecord = isFalloutRecord;
	}
	public String getSaleOrigination() {
		return saleOrigination;
	}

	public void setSaleOrigination(String saleOrigination) {
		this.saleOrigination = saleOrigination;
	}
}