package com.searshc.cuid.cuidservice.java.orderresponse;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Customer {
	private int key;

	private String specialInstructions;

	private String locationSuffix;

	private Name name;

	private Address address;

	private PrimaryPhone primaryPhone;

	private SecondaryPhone secondaryPhone;

	private Email email;

	private String custType;

	private String preferredLanguage;

	private String promoteMa;

	private String promoteOther;

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public String getSpecialInstructions() {
		return specialInstructions;
	}

	public void setSpecialInstructions(String specialInstructions) {
		this.specialInstructions = specialInstructions;
	}

	public String getLocationSuffix() {
		return locationSuffix;
	}

	public void setLocationSuffix(String locationSuffix) {
		this.locationSuffix = locationSuffix;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public PrimaryPhone getPrimaryPhone() {
		return primaryPhone;
	}

	public void setPrimaryPhone(PrimaryPhone primaryPhone) {
		this.primaryPhone = primaryPhone;
	}

	public SecondaryPhone getSecondaryPhone() {
		return secondaryPhone;
	}

	public void setSecondaryPhone(SecondaryPhone secondaryPhone) {
		this.secondaryPhone = secondaryPhone;
	}

	public Email getEmail() {
		return email;
	}

	public void setEmail(Email email) {
		this.email = email;
	}

	public String getCustType() {
		return custType;
	}

	public void setCustType(String custType) {
		this.custType = custType;
	}

	public String getPreferredLanguage() {
		return preferredLanguage;
	}

	public void setPreferredLanguage(String preferredLanguage) {
		this.preferredLanguage = preferredLanguage;
	}

	public String getPromoteMa() {
		return promoteMa;
	}

	public void setPromoteMa(String promoteMa) {
		this.promoteMa = promoteMa;
	}

	public String getPromoteOther() {
		return promoteOther;
	}

	public void setPromoteOther(String promoteOther) {
		this.promoteOther = promoteOther;
	}
	
}
