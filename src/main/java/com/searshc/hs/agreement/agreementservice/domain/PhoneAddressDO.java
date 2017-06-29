package com.searshc.hs.agreement.agreementservice.domain;


public class PhoneAddressDO extends BaseLeadDO {

	private String phoneAreaCd;
	private String phoneExchange;
	private String phoneNumber;
	private String streetAddress;
	private String cityName;
	private String stateCd;
	private String zipCd;
	private String zipExtCd;
	private String serviceFacUnitNo;

	/*
	 * protected PhoneAddressDO(String phoneAreaCd, String phoneExchange, String
	 * phoneNumber, String streetAddress, String cityName, String stateCd,
	 * String zipCd, String zipExtCd, String serviceFacUnitNo) { super();
	 * this.phoneAreaCd = phoneAreaCd; this.phoneExchange = phoneExchange;
	 * this.phoneNumber = phoneNumber; this.streetAddress = streetAddress;
	 * this.cityName = cityName; this.stateCd = stateCd; this.zipCd = zipCd;
	 * this.zipExtCd = zipExtCd; this.serviceFacUnitNo = serviceFacUnitNo; }
	 */

	public PhoneAddressDO(LeadKeyDO key) {
		super(key);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the cityName
	 */
	public String getCityName() {
		return cityName;
	}

	/**
	 * @return the phoneAreaCd
	 */
	public String getPhoneAreaCd() {
		return phoneAreaCd;
	}

	/**
	 * @return the phoneExchange
	 */
	public String getPhoneExchange() {
		return phoneExchange;
	}

	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @return the serviceFacUnitNo
	 */
	public String getServiceFacUnitNo() {
		return serviceFacUnitNo;
	}

	/**
	 * @return the stateCd
	 */
	public String getStateCd() {
		return stateCd;
	}

	/**
	 * @return the streetAddress
	 */
	public String getStreetAddress() {
		return streetAddress;
	}

	/**
	 * @return the zipCd
	 */
	public String getZipCd() {
		return zipCd;
	}

	/**
	 * @return the zipExtCd
	 */
	public String getZipExtCd() {
		return zipExtCd;
	}

	/**
	 * @param cityName
	 *            the cityName to set
	 */
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	/**
	 * @param phoneAreaCd
	 *            the phoneAreaCd to set
	 */
	public void setPhoneAreaCd(String phoneAreaCd) {
		this.phoneAreaCd = phoneAreaCd;
	}

	/**
	 * @param phoneExchange
	 *            the phoneExchange to set
	 */
	public void setPhoneExchange(String phoneExchange) {
		this.phoneExchange = phoneExchange;
	}

	/**
	 * @param phoneNumber
	 *            the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * @param serviceFacUnitNo
	 *            the serviceFacUnitNo to set
	 */
	public void setServiceFacUnitNo(String serviceFacUnitNo) {
		this.serviceFacUnitNo = serviceFacUnitNo;
	}

	/**
	 * @param stateCd
	 *            the stateCd to set
	 */
	public void setStateCd(String stateCd) {
		this.stateCd = stateCd;
	}

	/**
	 * @param streetAddress
	 *            the streetAddress to set
	 */
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	/**
	 * @param zipCd
	 *            the zipCd to set
	 */
	public void setZipCd(String zipCd) {
		this.zipCd = zipCd;
	}

	/**
	 * @param zipExtCd
	 *            the zipExtCd to set
	 */
	public void setZipExtCd(String zipExtCd) {
		this.zipExtCd = zipExtCd;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PhoneAddressDO [phoneAreaCd=");
		builder.append(phoneAreaCd);
		builder.append(", phoneExchange=");
		builder.append(phoneExchange);
		builder.append(", phoneNumber=");
		builder.append(phoneNumber);
		builder.append(", streetAddress=");
		builder.append(streetAddress);
		builder.append(", cityName=");
		builder.append(cityName);
		builder.append(", stateCd=");
		builder.append(stateCd);
		builder.append(", zipCd=");
		builder.append(zipCd);
		builder.append(", zipExtCd=");
		builder.append(zipExtCd);
		builder.append(", serviceFacUnitNo=");
		builder.append(serviceFacUnitNo);
		builder.append("]");
		return builder.toString();
	}

}
