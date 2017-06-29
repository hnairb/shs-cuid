package com.searshc.hs.agreement.agreementservice.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for Customer complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="Customer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addrType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="customerNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="emailType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="namePrefix" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nameSuffix" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="phnAreaCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="phnExch" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="phnNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="phnType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="prefLang" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="street" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="svcUnitId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="zip" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="zipPls4" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="customerLocSuffix" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

@XmlRootElement(name = "Customer", namespace = "http://domain.agreementservice.agreement.hs.searshc.com")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Customer", propOrder = { "addrType", "city", "customerNo",
		"email", "emailType", "firstName", "lastName", "middleName",
		"namePrefix", "nameSuffix", "phnAreaCode", "phnExch", "phnNo",
		"phnType", "prefLang", "state", "street", "svcUnitId", "zip",
		"zipPls4", "customerLocSuffix" })
public class Customer {

	@XmlElement(required = true, nillable = true)
	protected String addrType;
	@XmlElement(required = true, nillable = true)
	protected String city;
	protected int customerNo;
	@XmlElement(required = true, nillable = true)
	protected String email;
	@XmlElement(required = true, nillable = true)
	protected String emailType;
	@XmlElement(required = true, nillable = true)
	protected String firstName;
	@XmlElement(required = true, nillable = true)
	protected String lastName;
	@XmlElement(required = true, nillable = true)
	protected String middleName;
	@XmlElement(required = true, nillable = true)
	protected String namePrefix;
	@XmlElement(required = true, nillable = true)
	protected String nameSuffix;
	@XmlElement(required = true, nillable = true)
	protected String phnAreaCode;
	@XmlElement(required = true, nillable = true)
	protected String phnExch;
	@XmlElement(required = true, nillable = true)
	protected String phnNo;
	@XmlElement(required = true, nillable = true)
	protected String phnType;
	@XmlElement(required = true, nillable = true)
	protected String prefLang;
	@XmlElement(required = true, nillable = true)
	protected String state;
	@XmlElement(required = true, nillable = true)
	protected String street;
	@XmlElement(required = true, nillable = true)
	protected String svcUnitId;
	@XmlElement(required = true, nillable = true)
	protected String zip;
	@XmlElement(required = true, nillable = true)
	protected String zipPls4;
	protected int customerLocSuffix;

	/**
	 * Gets the value of the addrType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAddrType() {
		return addrType;
	}

	/**
	 * Sets the value of the addrType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAddrType(String value) {
		this.addrType = value;
	}

	/**
	 * Gets the value of the city property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Sets the value of the city property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCity(String value) {
		this.city = value;
	}

	/**
	 * Gets the value of the customerNo property.
	 * 
	 */
	public int getCustomerNo() {
		return customerNo;
	}

	/**
	 * Sets the value of the customerNo property.
	 * 
	 */
	public void setCustomerNo(int value) {
		this.customerNo = value;
	}

	/**
	 * Gets the value of the email property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets the value of the email property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setEmail(String value) {
		this.email = value;
	}

	/**
	 * Gets the value of the emailType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEmailType() {
		return emailType;
	}

	/**
	 * Sets the value of the emailType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setEmailType(String value) {
		this.emailType = value;
	}

	/**
	 * Gets the value of the firstName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets the value of the firstName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFirstName(String value) {
		this.firstName = value;
	}

	/**
	 * Gets the value of the lastName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets the value of the lastName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setLastName(String value) {
		this.lastName = value;
	}

	/**
	 * Gets the value of the middleName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMiddleName() {
		return middleName;
	}

	/**
	 * Sets the value of the middleName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMiddleName(String value) {
		this.middleName = value;
	}

	/**
	 * Gets the value of the namePrefix property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNamePrefix() {
		return namePrefix;
	}

	/**
	 * Sets the value of the namePrefix property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setNamePrefix(String value) {
		this.namePrefix = value;
	}

	/**
	 * Gets the value of the nameSuffix property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNameSuffix() {
		return nameSuffix;
	}

	/**
	 * Sets the value of the nameSuffix property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setNameSuffix(String value) {
		this.nameSuffix = value;
	}

	/**
	 * Gets the value of the phnAreaCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPhnAreaCode() {
		return phnAreaCode;
	}

	/**
	 * Sets the value of the phnAreaCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPhnAreaCode(String value) {
		this.phnAreaCode = value;
	}

	/**
	 * Gets the value of the phnExch property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPhnExch() {
		return phnExch;
	}

	/**
	 * Sets the value of the phnExch property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPhnExch(String value) {
		this.phnExch = value;
	}

	/**
	 * Gets the value of the phnNo property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPhnNo() {
		return phnNo;
	}

	/**
	 * Sets the value of the phnNo property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPhnNo(String value) {
		this.phnNo = value;
	}

	/**
	 * Gets the value of the phnType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPhnType() {
		return phnType;
	}

	/**
	 * Sets the value of the phnType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPhnType(String value) {
		this.phnType = value;
	}

	/**
	 * Gets the value of the prefLang property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPrefLang() {
		return prefLang;
	}

	/**
	 * Sets the value of the prefLang property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPrefLang(String value) {
		this.prefLang = value;
	}

	/**
	 * Gets the value of the state property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getState() {
		return state;
	}

	/**
	 * Sets the value of the state property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setState(String value) {
		this.state = value;
	}

	/**
	 * Gets the value of the street property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * Sets the value of the street property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setStreet(String value) {
		this.street = value;
	}

	/**
	 * Gets the value of the svcUnitId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSvcUnitId() {
		return svcUnitId;
	}

	/**
	 * Sets the value of the svcUnitId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSvcUnitId(String value) {
		this.svcUnitId = value;
	}

	/**
	 * Gets the value of the zip property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getZip() {
		return zip;
	}

	/**
	 * Sets the value of the zip property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setZip(String value) {
		this.zip = value;
	}

	/**
	 * Gets the value of the zipPls4 property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getZipPls4() {
		return zipPls4;
	}

	/**
	 * Sets the value of the zipPls4 property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setZipPls4(String value) {
		this.zipPls4 = value;
	}

	/**
	 * Gets the value of the customerLocSuffix property.
	 * 
	 */
	public int getCustomerLocSuffix() {
		return customerLocSuffix;
	}

	/**
	 * Sets the value of the customerLocSuffix property.
	 * 
	 */
	public void setCustomerLocSuffix(int value) {
		this.customerLocSuffix = value;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Customer [addrType=");
		builder.append(addrType);
		builder.append(", city=");
		builder.append(city);
		builder.append(", customerNo=");
		builder.append(customerNo);
		builder.append(", email=");
		builder.append(email);
		builder.append(", emailType=");
		builder.append(emailType);
		builder.append(", firstName=");
		builder.append(firstName);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", middleName=");
		builder.append(middleName);
		builder.append(", namePrefix=");
		builder.append(namePrefix);
		builder.append(", nameSuffix=");
		builder.append(nameSuffix);
		builder.append(", phnAreaCode=");
		builder.append(phnAreaCode);
		builder.append(", phnExch=");
		builder.append(phnExch);
		builder.append(", phnNo=");
		builder.append(phnNo);
		builder.append(", phnType=");
		builder.append(phnType);
		builder.append(", prefLang=");
		builder.append(prefLang);
		builder.append(", state=");
		builder.append(state);
		builder.append(", street=");
		builder.append(street);
		builder.append(", svcUnitId=");
		builder.append(svcUnitId);
		builder.append(", zip=");
		builder.append(zip);
		builder.append(", zipPls4=");
		builder.append(zipPls4);
		builder.append(", customerLocSuffix=");
		builder.append(customerLocSuffix);
		builder.append("]");
		return builder.toString();
	}

}
