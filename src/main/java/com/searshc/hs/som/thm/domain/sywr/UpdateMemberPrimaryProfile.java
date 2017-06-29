
package com.searshc.hs.som.thm.domain.sywr;

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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MessageVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MemberNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequestorID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StoreNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Terminal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrentDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrentTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Prefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MiddleInitial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Suffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClubDNPStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClubMembershipUpdatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateUpdated" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DOB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TestAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SHCAssociateInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WirelessPermissionFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LanguagePreference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ZipCodeExtension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClubEmailOptStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TnCStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TnCVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Charity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProfileUpdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="POSPrompt" type="{http://www.epsilon.com/webservices/}ArrayOfPOSPrompt" minOccurs="0"/>
 *         &lt;element name="AdditionalAttributes" type="{http://www.epsilon.com/webservices/}AdditionalAttributes" minOccurs="0"/>
 *         &lt;element name="PhoneNumbers" type="{http://www.epsilon.com/webservices/}ArrayOfPhone" minOccurs="0"/>
 *         &lt;element name="Affinities" type="{http://www.epsilon.com/webservices/}ArrayOfAffinity" minOccurs="0"/>
 *         &lt;element name="Attributes" type="{http://www.epsilon.com/webservices/}ArrayOfAttr" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "messageVersion",
    "memberNumber",
    "requestorID",
    "storeNumber",
    "terminal",
    "currentDate",
    "currentTime",
    "prefix",
    "firstName",
    "lastName",
    "middleInitial",
    "suffix",
    "clubDNPStatus",
    "clubMembershipUpdatedBy",
    "dateUpdated",
    "dob",
    "testAccount",
    "accountStatus",
    "shcAssociateInd",
    "wirelessPermissionFlag",
    "languagePreference",
    "address1",
    "address2",
    "city",
    "state",
    "zipCode",
    "zipCodeExtension",
    "countryCode",
    "emailAddress",
    "clubEmailOptStatus",
    "tnCStatus",
    "tnCVersion",
    "charity",
    "profileUpdate",
    "posPrompt",
    "additionalAttributes",
    "phoneNumbers",
    "affinities",
    "attributes"
})
@XmlRootElement(name = "UpdateMemberPrimaryProfile")
public class UpdateMemberPrimaryProfile {

    @XmlElement(name = "MessageVersion")
    protected String messageVersion;
    @XmlElement(name = "MemberNumber")
    protected String memberNumber;
    @XmlElement(name = "RequestorID")
    protected String requestorID;
    @XmlElement(name = "StoreNumber")
    protected String storeNumber;
    @XmlElement(name = "Terminal")
    protected String terminal;
    @XmlElement(name = "CurrentDate")
    protected String currentDate;
    @XmlElement(name = "CurrentTime")
    protected String currentTime;
    @XmlElement(name = "Prefix")
    protected String prefix;
    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElement(name = "MiddleInitial")
    protected String middleInitial;
    @XmlElement(name = "Suffix")
    protected String suffix;
    @XmlElement(name = "ClubDNPStatus")
    protected String clubDNPStatus;
    @XmlElement(name = "ClubMembershipUpdatedBy")
    protected String clubMembershipUpdatedBy;
    @XmlElement(name = "DateUpdated")
    protected String dateUpdated;
    @XmlElement(name = "DOB")
    protected String dob;
    @XmlElement(name = "TestAccount")
    protected String testAccount;
    @XmlElement(name = "AccountStatus")
    protected String accountStatus;
    @XmlElement(name = "SHCAssociateInd")
    protected String shcAssociateInd;
    @XmlElement(name = "WirelessPermissionFlag")
    protected String wirelessPermissionFlag;
    @XmlElement(name = "LanguagePreference")
    protected String languagePreference;
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
    @XmlElement(name = "EmailAddress")
    protected String emailAddress;
    @XmlElement(name = "ClubEmailOptStatus")
    protected String clubEmailOptStatus;
    @XmlElement(name = "TnCStatus")
    protected String tnCStatus;
    @XmlElement(name = "TnCVersion")
    protected String tnCVersion;
    @XmlElement(name = "Charity")
    protected String charity;
    @XmlElement(name = "ProfileUpdate")
    protected String profileUpdate;
    @XmlElement(name = "POSPrompt")
    protected ArrayOfPOSPrompt posPrompt;
    @XmlElement(name = "AdditionalAttributes")
    protected AdditionalAttributes additionalAttributes;
    @XmlElement(name = "PhoneNumbers")
    protected ArrayOfPhone phoneNumbers;
    @XmlElement(name = "Affinities")
    protected ArrayOfAffinity affinities;
    @XmlElement(name = "Attributes")
    protected ArrayOfAttr attributes;

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
     * Gets the value of the clubMembershipUpdatedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClubMembershipUpdatedBy() {
        return clubMembershipUpdatedBy;
    }

    /**
     * Sets the value of the clubMembershipUpdatedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClubMembershipUpdatedBy(String value) {
        this.clubMembershipUpdatedBy = value;
    }

    /**
     * Gets the value of the dateUpdated property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateUpdated() {
        return dateUpdated;
    }

    /**
     * Sets the value of the dateUpdated property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateUpdated(String value) {
        this.dateUpdated = value;
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
     * Gets the value of the accountStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountStatus() {
        return accountStatus;
    }

    /**
     * Sets the value of the accountStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountStatus(String value) {
        this.accountStatus = value;
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
     * Gets the value of the languagePreference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguagePreference() {
        return languagePreference;
    }

    /**
     * Sets the value of the languagePreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguagePreference(String value) {
        this.languagePreference = value;
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
     * Gets the value of the charity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharity() {
        return charity;
    }

    /**
     * Sets the value of the charity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharity(String value) {
        this.charity = value;
    }

    /**
     * Gets the value of the profileUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileUpdate() {
        return profileUpdate;
    }

    /**
     * Sets the value of the profileUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileUpdate(String value) {
        this.profileUpdate = value;
    }

    /**
     * Gets the value of the posPrompt property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPOSPrompt }
     *     
     */
    public ArrayOfPOSPrompt getPOSPrompt() {
        return posPrompt;
    }

    /**
     * Sets the value of the posPrompt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPOSPrompt }
     *     
     */
    public void setPOSPrompt(ArrayOfPOSPrompt value) {
        this.posPrompt = value;
    }

    /**
     * Gets the value of the additionalAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalAttributes }
     *     
     */
    public AdditionalAttributes getAdditionalAttributes() {
        return additionalAttributes;
    }

    /**
     * Sets the value of the additionalAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalAttributes }
     *     
     */
    public void setAdditionalAttributes(AdditionalAttributes value) {
        this.additionalAttributes = value;
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
