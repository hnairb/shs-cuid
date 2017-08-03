package com.searshc.cuid.cuidservice.java.orderresponse;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Merchandise {
	private String itemSuffix;

	private String merchCode;

	private String div;

	private String line;

	private String modelNumber;

	private Brand brand;

	private String serialNumber;

	private String purchaseDate;

	private String searsPurchaseFlag;

	private String purchaseStoreNo;

	private String description;

	private String deliveryDate;

	private Specialty specialty;

	private String productAgreementNo;

	private String productAgreementExpDt;

	private String laborWarrantyExp;

	private String laborWarrantyLength;

	private String partWarrantyExp;

	private String partWarrantyLength;

	private String exceptionPartWarrantyExp;

	private String exceptionPartWarrantyLength;

	private String planExp;

	//private ArrayList<object> history;

	public String getItemSuffix() {
		return itemSuffix;
	}

	public void setItemSuffix(String itemSuffix) {
		this.itemSuffix = itemSuffix;
	}

	public String getMerchCode() {
		return merchCode;
	}

	public void setMerchCode(String merchCode) {
		this.merchCode = merchCode;
	}

	public String getDiv() {
		return div;
	}

	public void setDiv(String div) {
		this.div = div;
	}

	public String getLine() {
		return line;
	}

	public void setLine(String line) {
		this.line = line;
	}

	public String getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public String getSearsPurchaseFlag() {
		return searsPurchaseFlag;
	}

	public void setSearsPurchaseFlag(String searsPurchaseFlag) {
		this.searsPurchaseFlag = searsPurchaseFlag;
	}

	public String getPurchaseStoreNo() {
		return purchaseStoreNo;
	}

	public void setPurchaseStoreNo(String purchaseStoreNo) {
		this.purchaseStoreNo = purchaseStoreNo;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public Specialty getSpecialty() {
		return specialty;
	}

	public void setSpecialty(Specialty specialty) {
		this.specialty = specialty;
	}

	public String getProductAgreementNo() {
		return productAgreementNo;
	}

	public void setProductAgreementNo(String productAgreementNo) {
		this.productAgreementNo = productAgreementNo;
	}

	public String getProductAgreementExpDt() {
		return productAgreementExpDt;
	}

	public void setProductAgreementExpDt(String productAgreementExpDt) {
		this.productAgreementExpDt = productAgreementExpDt;
	}

	public String getLaborWarrantyExp() {
		return laborWarrantyExp;
	}

	public void setLaborWarrantyExp(String laborWarrantyExp) {
		this.laborWarrantyExp = laborWarrantyExp;
	}

	public String getLaborWarrantyLength() {
		return laborWarrantyLength;
	}

	public void setLaborWarrantyLength(String laborWarrantyLength) {
		this.laborWarrantyLength = laborWarrantyLength;
	}

	public String getPartWarrantyExp() {
		return partWarrantyExp;
	}

	public void setPartWarrantyExp(String partWarrantyExp) {
		this.partWarrantyExp = partWarrantyExp;
	}

	public String getPartWarrantyLength() {
		return partWarrantyLength;
	}

	public void setPartWarrantyLength(String partWarrantyLength) {
		this.partWarrantyLength = partWarrantyLength;
	}

	public String getExceptionPartWarrantyExp() {
		return exceptionPartWarrantyExp;
	}

	public void setExceptionPartWarrantyExp(String exceptionPartWarrantyExp) {
		this.exceptionPartWarrantyExp = exceptionPartWarrantyExp;
	}

	public String getExceptionPartWarrantyLength() {
		return exceptionPartWarrantyLength;
	}

	public void setExceptionPartWarrantyLength(String exceptionPartWarrantyLength) {
		this.exceptionPartWarrantyLength = exceptionPartWarrantyLength;
	}

	public String getPlanExp() {
		return planExp;
	}

	public void setPlanExp(String planExp) {
		this.planExp = planExp;
	}

	/*public ArrayList<object> getHistory() {
		return history;
	}

	public void setHistory(ArrayList<object> history) {
		this.history = history;
	}*/
}
