package com.searshc.hs.agreement.agreementservice.domain;


public class CustomerAddressVO {
	
	private String custLastNm;
	private String custFirstNm; 
	private String addressNo;
	private String addressStreetPrefix;
	private String addressStreet; 
	private String addressStreetSuffix;
	private String addressStreetSuffixMd;
	private String addressPOBox; 
	private String addressApartmentNo;
	private String city;
	private String stateCd; 
	private String zipCode;
	private String zipCodePlus4;
	
	
	public String getCustLastNm() {
		return custLastNm;
	}
	public void setCustLastNm(String custLastNm) {
		this.custLastNm = custLastNm;
	}
	public String getCustFirstNm() {
		return custFirstNm;
	}
	public void setCustFirstNm(String custFirstNm) {
		this.custFirstNm = custFirstNm;
	}
	public String getAddressNo() {
		return addressNo;
	}
	public void setAddressNo(String addressNo) {
		this.addressNo = addressNo;
	}
	public String getAddressStreetPrefix() {
		return addressStreetPrefix;
	}
	public void setAddressStreetPrefix(String addressStreetPrefix) {
		this.addressStreetPrefix = addressStreetPrefix;
	}
	public String getAddressStreet() {
		return addressStreet;
	}
	public void setAddressStreet(String addressStreet) {
		this.addressStreet = addressStreet;
	}
	public String getAddressStreetSuffix() {
		return addressStreetSuffix;
	}
	public void setAddressStreetSuffix(String addressStreetSuffix) {
		this.addressStreetSuffix = addressStreetSuffix;
	}
	public String getAddressStreetSuffixMd() {
		return addressStreetSuffixMd;
	}
	public void setAddressStreetSuffixMd(String addressStreetSuffixMd) {
		this.addressStreetSuffixMd = addressStreetSuffixMd;
	}
	public String getAddressPOBox() {
		return addressPOBox;
	}
	public void setAddressPOBox(String addressPOBox) {
		this.addressPOBox = addressPOBox;
	}
	public String getAddressApartmentNo() {
		return addressApartmentNo;
	}
	public void setAddressApartmentNo(String addressApartmentNo) {
		this.addressApartmentNo = addressApartmentNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStateCd() {
		return stateCd;
	}
	public void setStateCd(String stateCd) {
		this.stateCd = stateCd;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getZipCodePlus4() {
		return zipCodePlus4;
	}
	public void setZipCodePlus4(String zipCodePlus4) {
		this.zipCodePlus4 = zipCodePlus4;
	}
	
	@Override
	public String toString() {
		return "CustomerAddressVO [addressApartmentNo=" + addressApartmentNo
				+ ", addressNo=" + addressNo + ", addressPOBox=" + addressPOBox
				+ ", addressStreet=" + addressStreet + ", addressStreetPrefix="
				+ addressStreetPrefix + ", addressStreetSuffix="
				+ addressStreetSuffix + ", addressStreetSuffixMd="
				+ addressStreetSuffixMd + ", city=" + city + ", custFirstNm="
				+ custFirstNm + ", custLastNm=" + custLastNm + ", stateCd="
				+ stateCd + ", zipCode=" + zipCode + ", zipCodePlus4="
				+ zipCodePlus4 + "]";
	}
	

}
