
package com.epsilon.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MemberNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EmailValidation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Prefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Suffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MiddleInitial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TestAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Address1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Address2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ZipCodeExtension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DOB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CurrentDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CurrentTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ClubMembershipCreatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ClubDNPStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SHCAssociateInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CardDesignType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WirelessPermissionFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ClubEmailOptStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PreferredLanguage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StoreNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Terminal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RequestorID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MessageVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EnrollmentOfferCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PinNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TnCStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TnCVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PhoneNumbers" type="{http://www.epsilon.com/webservices/}ArrayOfPhone" minOccurs="0"/&gt;
 *         &lt;element name="Affinities" type="{http://www.epsilon.com/webservices/}ArrayOfAffinity" minOccurs="0"/&gt;
 *         &lt;element name="Attributes" type="{http://www.epsilon.com/webservices/}ArrayOfAttr" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "memberNumber",
    "emailAddress",
    "emailValidation",
    "prefix",
    "suffix",
    "firstName",
    "middleInitial",
    "testAccount",
    "lastName",
    "address1",
    "address2",
    "city",
    "state",
    "zipCode",
    "zipCodeExtension",
    "countryCode",
    "dob",
    "currentDate",
    "currentTime",
    "clubMembershipCreatedBy",
    "clubDNPStatus",
    "shcAssociateInd",
    "cardDesignType",
    "wirelessPermissionFlag",
    "clubEmailOptStatus",
    "preferredLanguage",
    "storeNumber",
    "terminal",
    "requestorID",
    "messageVersion",
    "enrollmentOfferCode",
    "pinNumber",
    "tnCStatus",
    "tnCVersion",
    "phoneNumbers",
    "affinities",
    "attributes"
})
@XmlRootElement(name = "CreateMember")
public class CreateMember {

    @XmlElement(name = "MemberNumber")
    protected String memberNumber;
    @XmlElement(name = "EmailAddress")
    protected String emailAddress;
    @XmlElement(name = "EmailValidation")
    protected String emailValidation;
    @XmlElement(name = "Prefix")
    protected String prefix;
    @XmlElement(name = "Suffix")
    protected String suffix;
    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "MiddleInitial")
    protected String middleInitial;
    @XmlElement(name = "TestAccount")
    protected String testAccount;
    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElement(name = "Address1")
    protected String address1;
    @XmlElement(name = "Address2")
    protected String address2;
    @XmlElement(name = "City")
    protected String city;
    @XmlElement(name = "State")
    protected String state;
    @XmlElement(name = "ZipCode")
    protected String zipCode;
    @XmlElement(name = "ZipCodeExtension")
    protected String zipCodeExtension;
    @XmlElement(name = "CountryCode")
    protected String countryCode;
    @XmlElement(name = "DOB")
    protected String dob;
    @XmlElement(name = "CurrentDate")
    protected String currentDate;
    @XmlElement(name = "CurrentTime")
    protected String currentTime;
    @XmlElement(name = "ClubMembershipCreatedBy")
    protected String clubMembershipCreatedBy;
    @XmlElement(name = "ClubDNPStatus")
    protected String clubDNPStatus;
    @XmlElement(name = "SHCAssociateInd")
    protected String shcAssociateInd;
    @XmlElement(name = "CardDesignType")
    protected String cardDesignType;
    @XmlElement(name = "WirelessPermissionFlag")
    protected String wirelessPermissionFlag;
    @XmlElement(name = "ClubEmailOptStatus")
    protected String clubEmailOptStatus;
    @XmlElement(name = "PreferredLanguage")
    protected String preferredLanguage;
    @XmlElement(name = "StoreNumber")
    protected String storeNumber;
    @XmlElement(name = "Terminal")
    protected String terminal;
    @XmlElement(name = "RequestorID")
    protected String requestorID;
    @XmlElement(name = "MessageVersion")
    protected String messageVersion;
    @XmlElement(name = "EnrollmentOfferCode")
    protected String enrollmentOfferCode;
    @XmlElement(name = "PinNumber")
    protected String pinNumber;
    @XmlElement(name = "TnCStatus")
    protected String tnCStatus;
    @XmlElement(name = "TnCVersion")
    protected String tnCVersion;
    @XmlElement(name = "PhoneNumbers")
    protected ArrayOfPhone phoneNumbers;
    @XmlElement(name = "Affinities")
    protected ArrayOfAffinity affinities;
    @XmlElement(name = "Attributes")
    protected ArrayOfAttr attributes;

    /**
     * Gets the value of the memberNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberNumber() {
        return memberNumber;
    }

    /**
     * Sets the value of the memberNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberNumber(String value) {
        this.memberNumber = value;
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * Gets the value of the emailValidation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailValidation() {
        return emailValidation;
    }

    /**
     * Sets the value of the emailValidation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailValidation(String value) {
        this.emailValidation = value;
    }

    /**
     * Gets the value of the prefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * Sets the value of the prefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefix(String value) {
        this.prefix = value;
    }

    /**
     * Gets the value of the suffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuffix() {
        return suffix;
    }

    /**
     * Sets the value of the suffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuffix(String value) {
        this.suffix = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the middleInitial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleInitial() {
        return middleInitial;
    }

    /**
     * Sets the value of the middleInitial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleInitial(String value) {
        this.middleInitial = value;
    }

    /**
     * Gets the value of the testAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestAccount() {
        return testAccount;
    }

    /**
     * Sets the value of the testAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestAccount(String value) {
        this.testAccount = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the address1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress1() {
        return address1;
    }

    /**
     * Sets the value of the address1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress1(String value) {
        this.address1 = value;
    }

    /**
     * Gets the value of the address2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress2() {
        return address2;
    }

    /**
     * Sets the value of the address2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress2(String value) {
        this.address2 = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the zipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * Sets the value of the zipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipCode(String value) {
        this.zipCode = value;
    }

    /**
     * Gets the value of the zipCodeExtension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipCodeExtension() {
        return zipCodeExtension;
    }

    /**
     * Sets the value of the zipCodeExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipCodeExtension(String value) {
        this.zipCodeExtension = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the dob property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOB() {
        return dob;
    }

    /**
     * Sets the value of the dob property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOB(String value) {
        this.dob = value;
    }

    /**
     * Gets the value of the currentDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentDate() {
        return currentDate;
    }

    /**
     * Sets the value of the currentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentDate(String value) {
        this.currentDate = value;
    }

    /**
     * Gets the value of the currentTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentTime() {
        return currentTime;
    }

    /**
     * Sets the value of the currentTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentTime(String value) {
        this.currentTime = value;
    }

    /**
     * Gets the value of the clubMembershipCreatedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClubMembershipCreatedBy() {
        return clubMembershipCreatedBy;
    }

    /**
     * Sets the value of the clubMembershipCreatedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClubMembershipCreatedBy(String value) {
        this.clubMembershipCreatedBy = value;
    }

    /**
     * Gets the value of the clubDNPStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClubDNPStatus() {
        return clubDNPStatus;
    }

    /**
     * Sets the value of the clubDNPStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClubDNPStatus(String value) {
        this.clubDNPStatus = value;
    }

    /**
     * Gets the value of the shcAssociateInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSHCAssociateInd() {
        return shcAssociateInd;
    }

    /**
     * Sets the value of the shcAssociateInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSHCAssociateInd(String value) {
        this.shcAssociateInd = value;
    }

    /**
     * Gets the value of the cardDesignType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardDesignType() {
        return cardDesignType;
    }

    /**
     * Sets the value of the cardDesignType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardDesignType(String value) {
        this.cardDesignType = value;
    }

    /**
     * Gets the value of the wirelessPermissionFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWirelessPermissionFlag() {
        return wirelessPermissionFlag;
    }

    /**
     * Sets the value of the wirelessPermissionFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWirelessPermissionFlag(String value) {
        this.wirelessPermissionFlag = value;
    }

    /**
     * Gets the value of the clubEmailOptStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClubEmailOptStatus() {
        return clubEmailOptStatus;
    }

    /**
     * Sets the value of the clubEmailOptStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClubEmailOptStatus(String value) {
        this.clubEmailOptStatus = value;
    }

    /**
     * Gets the value of the preferredLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferredLanguage() {
        return preferredLanguage;
    }

    /**
     * Sets the value of the preferredLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferredLanguage(String value) {
        this.preferredLanguage = value;
    }

    /**
     * Gets the value of the storeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreNumber() {
        return storeNumber;
    }

    /**
     * Sets the value of the storeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreNumber(String value) {
        this.storeNumber = value;
    }

    /**
     * Gets the value of the terminal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminal() {
        return terminal;
    }

    /**
     * Sets the value of the terminal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminal(String value) {
        this.terminal = value;
    }

    /**
     * Gets the value of the requestorID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestorID() {
        return requestorID;
    }

    /**
     * Sets the value of the requestorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestorID(String value) {
        this.requestorID = value;
    }

    /**
     * Gets the value of the messageVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageVersion() {
        return messageVersion;
    }

    /**
     * Sets the value of the messageVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageVersion(String value) {
        this.messageVersion = value;
    }

    /**
     * Gets the value of the enrollmentOfferCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnrollmentOfferCode() {
        return enrollmentOfferCode;
    }

    /**
     * Sets the value of the enrollmentOfferCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnrollmentOfferCode(String value) {
        this.enrollmentOfferCode = value;
    }

    /**
     * Gets the value of the pinNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPinNumber() {
        return pinNumber;
    }

    /**
     * Sets the value of the pinNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPinNumber(String value) {
        this.pinNumber = value;
    }

    /**
     * Gets the value of the tnCStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTnCStatus() {
        return tnCStatus;
    }

    /**
     * Sets the value of the tnCStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTnCStatus(String value) {
        this.tnCStatus = value;
    }

    /**
     * Gets the value of the tnCVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTnCVersion() {
        return tnCVersion;
    }

    /**
     * Sets the value of the tnCVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTnCVersion(String value) {
        this.tnCVersion = value;
    }

    /**
     * Gets the value of the phoneNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPhone }
     *     
     */
    public ArrayOfPhone getPhoneNumbers() {
        return phoneNumbers;
    }

    /**
     * Sets the value of the phoneNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPhone }
     *     
     */
    public void setPhoneNumbers(ArrayOfPhone value) {
        this.phoneNumbers = value;
    }

    /**
     * Gets the value of the affinities property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAffinity }
     *     
     */
    public ArrayOfAffinity getAffinities() {
        return affinities;
    }

    /**
     * Sets the value of the affinities property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAffinity }
     *     
     */
    public void setAffinities(ArrayOfAffinity value) {
        this.affinities = value;
    }

    /**
     * Gets the value of the attributes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAttr }
     *     
     */
    public ArrayOfAttr getAttributes() {
        return attributes;
    }

    /**
     * Sets the value of the attributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAttr }
     *     
     */
    public void setAttributes(ArrayOfAttr value) {
        this.attributes = value;
    }

}
