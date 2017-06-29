/* 
 * Copyright 2016 (C) Sears Holdings Corp  
 *  
 * Created on : 13-Apr-16
 * Author     : Avinash Kumar
 * 
 *----------------------------------------------------------------------------- 
 * Revision History (Release 1.0.0.0) 
 *----------------------------------------------------------------------------- 
 * VERSION     AUTHOR/      DESCRIPTION OF CHANGE 
 * OLD/NEW     DATE                RFC NO 
 *----------------------------------------------------------------------------- 
 * --/1.0  | Avinash Kumar	| Initial Create. 
 *         | 13-Apr-16    	| 
 *---------|--------------- |--------------------------------------------------- 
 */
package com.searshc.hs.som.thm.vo;


/**
 * VO class for HomeWarrentySYWRSync object
 * This bean is populated when the corresponding
 * after reading input file
 * 
 * @author akuma53
 * @version 1.0, Apr 13, 2016
 *
 */
public class HWSywrSyncVO {
		
	private String inputFileDate = "";
	private String npjCustomerNumber = "";
	private String sywrMemberId = "";
	private String prodCode = "";
	private String agreeMntSaleDate = "";
	private String existingOfferCode = "";
	private String existingRegBgDate = "";
	private String existingRegEdDate = "";
	private String operationCode = "";
	private String newOfferCode = "";
	private String newRegBgDate = "";
	private String newRegEdDate = "";
	private String errorDate = "";
	private String errorCode = "";
	private boolean isEnrolled;
	
	/**
	 * @return the inputFileDate
	 */
	public String getInputFileDate() {
		return inputFileDate;
	}
	/**
	 * @param inputFileDate the inputFileDate to set
	 */
	public void setInputFileDate(String inputFileDate) {
		this.inputFileDate = inputFileDate;
	}
	/**
	 * @return the npjCustomerNumber
	 */
	public String getNpjCustomerNumber() {
		return npjCustomerNumber;
	}
	/**
	 * @param npjCustomerNumber the npjCustomerNumber to set
	 */
	public void setNpjCustomerNumber(String npjCustomerNumber) {
		this.npjCustomerNumber = npjCustomerNumber;
	}
	/**
	 * @return the sywrMemberId
	 */
	public String getSywrMemberId() {
		return sywrMemberId;
	}
	/**
	 * @param sywrMemberId the sywrMemberId to set
	 */
	public void setSywrMemberId(String sywrMemberId) {
		this.sywrMemberId = sywrMemberId;
	}
	/**
	 * @return the prodCode
	 */
	public String getProdCode() {
		return prodCode;
	}
	/**
	 * @param prodCode the prodCode to set
	 */
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}
	/**
	 * @return the agreeMntSaleDate
	 */
	public String getAgreeMntSaleDate() {
		return agreeMntSaleDate;
	}
	/**
	 * @param agreeMntSaleDate the agreeMntSaleDate to set
	 */
	public void setAgreeMntSaleDate(String agreeMntSaleDate) {
		this.agreeMntSaleDate = agreeMntSaleDate;
	}
	/**
	 * @return the existingOfferCode
	 */
	public String getExistingOfferCode() {
		return existingOfferCode;
	}
	/**
	 * @param existingOfferCode the existingOfferCode to set
	 */
	public void setExistingOfferCode(String existingOfferCode) {
		this.existingOfferCode = existingOfferCode;
	}
	/**
	 * @return the existingRegBgDate
	 */
	public String getExistingRegBgDate() {
		return existingRegBgDate;
	}
	/**
	 * @param existingRegBgDate the existingRegBgDate to set
	 */
	public void setExistingRegBgDate(String existingRegBgDate) {
		this.existingRegBgDate = existingRegBgDate;
	}
	/**
	 * @return the existingRegEdDate
	 */
	public String getExistingRegEdDate() {
		return existingRegEdDate;
	}
	/**
	 * @param existingRegEdDate the existingRegEdDate to set
	 */
	public void setExistingRegEdDate(String existingRegEdDate) {
		this.existingRegEdDate = existingRegEdDate;
	}
	/**
	 * @return the operationCode
	 */
	public String getOperationCode() {
		return operationCode;
	}
	/**
	 * @param operationCode the operationCode to set
	 */
	public void setOperationCode(String operationCode) {
		this.operationCode = operationCode;
	}
	/**
	 * @return the newOfferCode
	 */
	public String getNewOfferCode() {
		return newOfferCode;
	}
	/**
	 * @param newOfferCode the newOfferCode to set
	 */
	public void setNewOfferCode(String newOfferCode) {
		this.newOfferCode = newOfferCode;
	}
	/**
	 * @return the newRegBgDate
	 */
	public String getNewRegBgDate() {
		return newRegBgDate;
	}
	/**
	 * @param newRegBgDate the newRegBgDate to set
	 */
	public void setNewRegBgDate(String newRegBgDate) {
		this.newRegBgDate = newRegBgDate;
	}
	/**
	 * @return the newRegEdDate
	 */
	public String getNewRegEdDate() {
		return newRegEdDate;
	}
	/**
	 * @param newRegEdDate the newRegEdDate to set
	 */
	public void setNewRegEdDate(String newRegEdDate) {
		this.newRegEdDate = newRegEdDate;
	}
	/**
	 * @return the errorDate
	 */
	public String getErrorDate() {
		return errorDate;
	}
	/**
	 * @param errorDate the errorDate to set
	 */
	public void setErrorDate(String errorDate) {
		this.errorDate = errorDate;
	}
	/**
	 * @return the errorCode
	 */
	public String getErrorCode() {
		return errorCode;
	}
	/**
	 * @param errorCode the errorCode to set
	 */
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	/**
	 * @return the isEnrolled
	 */
	public boolean isEnrolled() {
		return isEnrolled;
	}
	/**
	 * @param isEnrolled the isEnrolled to set
	 */
	public void setEnrolled(boolean isEnrolled) {
		this.isEnrolled = isEnrolled;
	}
	
	
	
}