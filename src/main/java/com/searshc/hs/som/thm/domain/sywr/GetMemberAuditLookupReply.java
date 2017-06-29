
package com.searshc.hs.som.thm.domain.sywr;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="profileNameAuditList" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="NamePrefix" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="MiddleInitial" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="NameSuffix" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="BirthDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="AssocIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Deceased" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="EarnType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="NameStatusUpdateDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="NameStatusUpdateUser" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="profileStatusAuditList" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="statusUpdateDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="statusUpdateUser" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="profileEmailAuditList" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="emailAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="emailDeliveryStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="emailUpdateDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="emailUpdateUser" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="emailConfirmed" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="profilePhoneAuditList" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="phoneNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="prefferedFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="phoneType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="mobileValid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="phoneUpdateDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="phoneUpdateUser" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="profileAddressAuditList" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="address1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="address2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="zipCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="updateDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="updateUser" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="addressType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="profileMergeAuditList" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="dateMerged" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="mergedMemberNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="mergeUpdateDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="mergeUpdateUser" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="postedStoreNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ProfileReceiptAuditList" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="recieptStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="recieptUpdateDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="recieptUpdateUser" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ProfileTnCAuditList" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="tncStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="tncVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="tncStoreNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="tncRegisterNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="tncUpdateUser" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="tncUpdateDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "profileNameAuditList",
    "profileStatusAuditList",
    "profileEmailAuditList",
    "profilePhoneAuditList",
    "profileAddressAuditList",
    "profileMergeAuditList",
    "profileReceiptAuditList",
    "profileTnCAuditList"
})
@XmlRootElement(name = "GetMemberAuditLookupReply")
public class GetMemberAuditLookupReply {

    @XmlElement(nillable = true)
    protected List<GetMemberAuditLookupReply.ProfileNameAuditList> profileNameAuditList;
    @XmlElement(nillable = true)
    protected List<GetMemberAuditLookupReply.ProfileStatusAuditList> profileStatusAuditList;
    @XmlElement(nillable = true)
    protected List<GetMemberAuditLookupReply.ProfileEmailAuditList> profileEmailAuditList;
    @XmlElement(nillable = true)
    protected List<GetMemberAuditLookupReply.ProfilePhoneAuditList> profilePhoneAuditList;
    @XmlElement(nillable = true)
    protected List<GetMemberAuditLookupReply.ProfileAddressAuditList> profileAddressAuditList;
    @XmlElement(nillable = true)
    protected List<GetMemberAuditLookupReply.ProfileMergeAuditList> profileMergeAuditList;
    @XmlElement(name = "ProfileReceiptAuditList", nillable = true)
    protected List<GetMemberAuditLookupReply.ProfileReceiptAuditList> profileReceiptAuditList;
    @XmlElement(name = "ProfileTnCAuditList", nillable = true)
    protected List<GetMemberAuditLookupReply.ProfileTnCAuditList> profileTnCAuditList;

    /**
     * Gets the value of the profileNameAuditList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the profileNameAuditList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProfileNameAuditList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GetMemberAuditLookupReply.ProfileNameAuditList }
     * 
     * 
     */
    public List<GetMemberAuditLookupReply.ProfileNameAuditList> getProfileNameAuditList() {
        if (profileNameAuditList == null) {
            profileNameAuditList = new ArrayList<GetMemberAuditLookupReply.ProfileNameAuditList>();
        }
        return this.profileNameAuditList;
    }

    /**
     * Gets the value of the profileStatusAuditList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the profileStatusAuditList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProfileStatusAuditList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GetMemberAuditLookupReply.ProfileStatusAuditList }
     * 
     * 
     */
    public List<GetMemberAuditLookupReply.ProfileStatusAuditList> getProfileStatusAuditList() {
        if (profileStatusAuditList == null) {
            profileStatusAuditList = new ArrayList<GetMemberAuditLookupReply.ProfileStatusAuditList>();
        }
        return this.profileStatusAuditList;
    }

    /**
     * Gets the value of the profileEmailAuditList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the profileEmailAuditList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProfileEmailAuditList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GetMemberAuditLookupReply.ProfileEmailAuditList }
     * 
     * 
     */
    public List<GetMemberAuditLookupReply.ProfileEmailAuditList> getProfileEmailAuditList() {
        if (profileEmailAuditList == null) {
            profileEmailAuditList = new ArrayList<GetMemberAuditLookupReply.ProfileEmailAuditList>();
        }
        return this.profileEmailAuditList;
    }

    /**
     * Gets the value of the profilePhoneAuditList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the profilePhoneAuditList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProfilePhoneAuditList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GetMemberAuditLookupReply.ProfilePhoneAuditList }
     * 
     * 
     */
    public List<GetMemberAuditLookupReply.ProfilePhoneAuditList> getProfilePhoneAuditList() {
        if (profilePhoneAuditList == null) {
            profilePhoneAuditList = new ArrayList<GetMemberAuditLookupReply.ProfilePhoneAuditList>();
        }
        return this.profilePhoneAuditList;
    }

    /**
     * Gets the value of the profileAddressAuditList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the profileAddressAuditList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProfileAddressAuditList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GetMemberAuditLookupReply.ProfileAddressAuditList }
     * 
     * 
     */
    public List<GetMemberAuditLookupReply.ProfileAddressAuditList> getProfileAddressAuditList() {
        if (profileAddressAuditList == null) {
            profileAddressAuditList = new ArrayList<GetMemberAuditLookupReply.ProfileAddressAuditList>();
        }
        return this.profileAddressAuditList;
    }

    /**
     * Gets the value of the profileMergeAuditList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the profileMergeAuditList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProfileMergeAuditList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GetMemberAuditLookupReply.ProfileMergeAuditList }
     * 
     * 
     */
    public List<GetMemberAuditLookupReply.ProfileMergeAuditList> getProfileMergeAuditList() {
        if (profileMergeAuditList == null) {
            profileMergeAuditList = new ArrayList<GetMemberAuditLookupReply.ProfileMergeAuditList>();
        }
        return this.profileMergeAuditList;
    }

    /**
     * Gets the value of the profileReceiptAuditList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the profileReceiptAuditList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProfileReceiptAuditList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GetMemberAuditLookupReply.ProfileReceiptAuditList }
     * 
     * 
     */
    public List<GetMemberAuditLookupReply.ProfileReceiptAuditList> getProfileReceiptAuditList() {
        if (profileReceiptAuditList == null) {
            profileReceiptAuditList = new ArrayList<GetMemberAuditLookupReply.ProfileReceiptAuditList>();
        }
        return this.profileReceiptAuditList;
    }

    /**
     * Gets the value of the profileTnCAuditList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the profileTnCAuditList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProfileTnCAuditList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GetMemberAuditLookupReply.ProfileTnCAuditList }
     * 
     * 
     */
    public List<GetMemberAuditLookupReply.ProfileTnCAuditList> getProfileTnCAuditList() {
        if (profileTnCAuditList == null) {
            profileTnCAuditList = new ArrayList<GetMemberAuditLookupReply.ProfileTnCAuditList>();
        }
        return this.profileTnCAuditList;
    }


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
     *         &lt;element name="address1" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="address2" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="zipCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="updateDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="updateUser" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="addressType" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "address1",
        "address2",
        "city",
        "zipCode",
        "updateDate",
        "updateUser",
        "addressType"
    })
    public static class ProfileAddressAuditList {

        @XmlElement(required = true)
        protected String address1;
        @XmlElement(required = true)
        protected String address2;
        @XmlElement(required = true)
        protected String city;
        @XmlElement(required = true)
        protected String zipCode;
        @XmlElement(required = true)
        protected String updateDate;
        @XmlElement(required = true)
        protected String updateUser;
        @XmlElement(required = true)
        protected String addressType;

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
         * Gets the value of the updateDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUpdateDate() {
            return updateDate;
        }

        /**
         * Sets the value of the updateDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUpdateDate(String value) {
            this.updateDate = value;
        }

        /**
         * Gets the value of the updateUser property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUpdateUser() {
            return updateUser;
        }

        /**
         * Sets the value of the updateUser property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUpdateUser(String value) {
            this.updateUser = value;
        }

        /**
         * Gets the value of the addressType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAddressType() {
            return addressType;
        }

        /**
         * Sets the value of the addressType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAddressType(String value) {
            this.addressType = value;
        }

    }


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
     *         &lt;element name="emailAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="emailDeliveryStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="emailUpdateDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="emailUpdateUser" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="emailConfirmed" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "emailAddress",
        "emailDeliveryStatus",
        "emailUpdateDate",
        "emailUpdateUser",
        "emailConfirmed"
    })
    public static class ProfileEmailAuditList {

        @XmlElement(required = true)
        protected String emailAddress;
        @XmlElement(required = true)
        protected String emailDeliveryStatus;
        @XmlElement(required = true)
        protected String emailUpdateDate;
        @XmlElement(required = true)
        protected String emailUpdateUser;
        @XmlElement(required = true)
        protected String emailConfirmed;

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
         * Gets the value of the emailDeliveryStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmailDeliveryStatus() {
            return emailDeliveryStatus;
        }

        /**
         * Sets the value of the emailDeliveryStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmailDeliveryStatus(String value) {
            this.emailDeliveryStatus = value;
        }

        /**
         * Gets the value of the emailUpdateDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmailUpdateDate() {
            return emailUpdateDate;
        }

        /**
         * Sets the value of the emailUpdateDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmailUpdateDate(String value) {
            this.emailUpdateDate = value;
        }

        /**
         * Gets the value of the emailUpdateUser property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmailUpdateUser() {
            return emailUpdateUser;
        }

        /**
         * Sets the value of the emailUpdateUser property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmailUpdateUser(String value) {
            this.emailUpdateUser = value;
        }

        /**
         * Gets the value of the emailConfirmed property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmailConfirmed() {
            return emailConfirmed;
        }

        /**
         * Sets the value of the emailConfirmed property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmailConfirmed(String value) {
            this.emailConfirmed = value;
        }

    }


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
     *         &lt;element name="dateMerged" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="mergedMemberNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="mergeUpdateDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="mergeUpdateUser" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="postedStoreNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "dateMerged",
        "mergedMemberNumber",
        "mergeUpdateDate",
        "mergeUpdateUser",
        "postedStoreNumber"
    })
    public static class ProfileMergeAuditList {

        @XmlElement(required = true)
        protected String dateMerged;
        @XmlElement(required = true)
        protected String mergedMemberNumber;
        @XmlElement(required = true)
        protected String mergeUpdateDate;
        @XmlElement(required = true)
        protected String mergeUpdateUser;
        @XmlElement(required = true)
        protected String postedStoreNumber;

        /**
         * Gets the value of the dateMerged property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDateMerged() {
            return dateMerged;
        }

        /**
         * Sets the value of the dateMerged property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDateMerged(String value) {
            this.dateMerged = value;
        }

        /**
         * Gets the value of the mergedMemberNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMergedMemberNumber() {
            return mergedMemberNumber;
        }

        /**
         * Sets the value of the mergedMemberNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMergedMemberNumber(String value) {
            this.mergedMemberNumber = value;
        }

        /**
         * Gets the value of the mergeUpdateDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMergeUpdateDate() {
            return mergeUpdateDate;
        }

        /**
         * Sets the value of the mergeUpdateDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMergeUpdateDate(String value) {
            this.mergeUpdateDate = value;
        }

        /**
         * Gets the value of the mergeUpdateUser property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMergeUpdateUser() {
            return mergeUpdateUser;
        }

        /**
         * Sets the value of the mergeUpdateUser property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMergeUpdateUser(String value) {
            this.mergeUpdateUser = value;
        }

        /**
         * Gets the value of the postedStoreNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPostedStoreNumber() {
            return postedStoreNumber;
        }

        /**
         * Sets the value of the postedStoreNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPostedStoreNumber(String value) {
            this.postedStoreNumber = value;
        }

    }


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
     *         &lt;element name="NamePrefix" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="MiddleInitial" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="NameSuffix" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="BirthDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="AssocIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Deceased" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="EarnType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="NameStatusUpdateDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="NameStatusUpdateUser" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "namePrefix",
        "firstName",
        "middleInitial",
        "lastName",
        "nameSuffix",
        "birthDate",
        "assocIndicator",
        "deceased",
        "earnType",
        "nameStatusUpdateDate",
        "nameStatusUpdateUser"
    })
    public static class ProfileNameAuditList {

        @XmlElement(name = "NamePrefix", required = true)
        protected String namePrefix;
        @XmlElement(name = "FirstName", required = true)
        protected String firstName;
        @XmlElement(name = "MiddleInitial", required = true)
        protected String middleInitial;
        @XmlElement(name = "LastName", required = true)
        protected String lastName;
        @XmlElement(name = "NameSuffix", required = true)
        protected String nameSuffix;
        @XmlElement(name = "BirthDate", required = true)
        protected String birthDate;
        @XmlElement(name = "AssocIndicator", required = true)
        protected String assocIndicator;
        @XmlElement(name = "Deceased", required = true)
        protected String deceased;
        @XmlElement(name = "EarnType", required = true)
        protected String earnType;
        @XmlElement(name = "NameStatusUpdateDate", required = true)
        protected String nameStatusUpdateDate;
        @XmlElement(name = "NameStatusUpdateUser", required = true)
        protected String nameStatusUpdateUser;

        /**
         * Gets the value of the namePrefix property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNamePrefix() {
            return namePrefix;
        }

        /**
         * Sets the value of the namePrefix property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNamePrefix(String value) {
            this.namePrefix = value;
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
         * Gets the value of the nameSuffix property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNameSuffix() {
            return nameSuffix;
        }

        /**
         * Sets the value of the nameSuffix property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNameSuffix(String value) {
            this.nameSuffix = value;
        }

        /**
         * Gets the value of the birthDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBirthDate() {
            return birthDate;
        }

        /**
         * Sets the value of the birthDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBirthDate(String value) {
            this.birthDate = value;
        }

        /**
         * Gets the value of the assocIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssocIndicator() {
            return assocIndicator;
        }

        /**
         * Sets the value of the assocIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssocIndicator(String value) {
            this.assocIndicator = value;
        }

        /**
         * Gets the value of the deceased property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDeceased() {
            return deceased;
        }

        /**
         * Sets the value of the deceased property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDeceased(String value) {
            this.deceased = value;
        }

        /**
         * Gets the value of the earnType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEarnType() {
            return earnType;
        }

        /**
         * Sets the value of the earnType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEarnType(String value) {
            this.earnType = value;
        }

        /**
         * Gets the value of the nameStatusUpdateDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNameStatusUpdateDate() {
            return nameStatusUpdateDate;
        }

        /**
         * Sets the value of the nameStatusUpdateDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNameStatusUpdateDate(String value) {
            this.nameStatusUpdateDate = value;
        }

        /**
         * Gets the value of the nameStatusUpdateUser property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNameStatusUpdateUser() {
            return nameStatusUpdateUser;
        }

        /**
         * Sets the value of the nameStatusUpdateUser property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNameStatusUpdateUser(String value) {
            this.nameStatusUpdateUser = value;
        }

    }


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
     *         &lt;element name="phoneNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="prefferedFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="phoneType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="mobileValid" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="phoneUpdateDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="phoneUpdateUser" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "phoneNumber",
        "prefferedFlag",
        "phoneType",
        "mobileValid",
        "phoneUpdateDate",
        "phoneUpdateUser"
    })
    public static class ProfilePhoneAuditList {

        @XmlElement(required = true)
        protected String phoneNumber;
        @XmlElement(required = true)
        protected String prefferedFlag;
        @XmlElement(required = true)
        protected String phoneType;
        @XmlElement(required = true)
        protected String mobileValid;
        @XmlElement(required = true)
        protected String phoneUpdateDate;
        @XmlElement(required = true)
        protected String phoneUpdateUser;

        /**
         * Gets the value of the phoneNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPhoneNumber() {
            return phoneNumber;
        }

        /**
         * Sets the value of the phoneNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPhoneNumber(String value) {
            this.phoneNumber = value;
        }

        /**
         * Gets the value of the prefferedFlag property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPrefferedFlag() {
            return prefferedFlag;
        }

        /**
         * Sets the value of the prefferedFlag property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPrefferedFlag(String value) {
            this.prefferedFlag = value;
        }

        /**
         * Gets the value of the phoneType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPhoneType() {
            return phoneType;
        }

        /**
         * Sets the value of the phoneType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPhoneType(String value) {
            this.phoneType = value;
        }

        /**
         * Gets the value of the mobileValid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMobileValid() {
            return mobileValid;
        }

        /**
         * Sets the value of the mobileValid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMobileValid(String value) {
            this.mobileValid = value;
        }

        /**
         * Gets the value of the phoneUpdateDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPhoneUpdateDate() {
            return phoneUpdateDate;
        }

        /**
         * Sets the value of the phoneUpdateDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPhoneUpdateDate(String value) {
            this.phoneUpdateDate = value;
        }

        /**
         * Gets the value of the phoneUpdateUser property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPhoneUpdateUser() {
            return phoneUpdateUser;
        }

        /**
         * Sets the value of the phoneUpdateUser property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPhoneUpdateUser(String value) {
            this.phoneUpdateUser = value;
        }

    }


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
     *         &lt;element name="recieptStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="recieptUpdateDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="recieptUpdateUser" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "recieptStatus",
        "recieptUpdateDate",
        "recieptUpdateUser"
    })
    public static class ProfileReceiptAuditList {

        @XmlElement(required = true)
        protected String recieptStatus;
        @XmlElement(required = true)
        protected String recieptUpdateDate;
        @XmlElement(required = true)
        protected String recieptUpdateUser;

        /**
         * Gets the value of the recieptStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRecieptStatus() {
            return recieptStatus;
        }

        /**
         * Sets the value of the recieptStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRecieptStatus(String value) {
            this.recieptStatus = value;
        }

        /**
         * Gets the value of the recieptUpdateDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRecieptUpdateDate() {
            return recieptUpdateDate;
        }

        /**
         * Sets the value of the recieptUpdateDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRecieptUpdateDate(String value) {
            this.recieptUpdateDate = value;
        }

        /**
         * Gets the value of the recieptUpdateUser property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRecieptUpdateUser() {
            return recieptUpdateUser;
        }

        /**
         * Sets the value of the recieptUpdateUser property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRecieptUpdateUser(String value) {
            this.recieptUpdateUser = value;
        }

    }


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
     *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="statusUpdateDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="statusUpdateUser" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "status",
        "statusUpdateDate",
        "statusUpdateUser"
    })
    public static class ProfileStatusAuditList {

        @XmlElement(required = true)
        protected String status;
        @XmlElement(required = true)
        protected String statusUpdateDate;
        @XmlElement(required = true)
        protected String statusUpdateUser;

        /**
         * Gets the value of the status property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatus() {
            return status;
        }

        /**
         * Sets the value of the status property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStatus(String value) {
            this.status = value;
        }

        /**
         * Gets the value of the statusUpdateDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatusUpdateDate() {
            return statusUpdateDate;
        }

        /**
         * Sets the value of the statusUpdateDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStatusUpdateDate(String value) {
            this.statusUpdateDate = value;
        }

        /**
         * Gets the value of the statusUpdateUser property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatusUpdateUser() {
            return statusUpdateUser;
        }

        /**
         * Sets the value of the statusUpdateUser property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStatusUpdateUser(String value) {
            this.statusUpdateUser = value;
        }

    }


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
     *         &lt;element name="tncStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="tncVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="tncStoreNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="tncRegisterNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="tncUpdateUser" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="tncUpdateDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "tncStatus",
        "tncVersion",
        "tncStoreNumber",
        "tncRegisterNumber",
        "tncUpdateUser",
        "tncUpdateDate"
    })
    public static class ProfileTnCAuditList {

        @XmlElement(required = true)
        protected String tncStatus;
        @XmlElement(required = true)
        protected String tncVersion;
        @XmlElement(required = true)
        protected String tncStoreNumber;
        @XmlElement(required = true)
        protected String tncRegisterNumber;
        @XmlElement(required = true)
        protected String tncUpdateUser;
        @XmlElement(required = true)
        protected String tncUpdateDate;

        /**
         * Gets the value of the tncStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTncStatus() {
            return tncStatus;
        }

        /**
         * Sets the value of the tncStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTncStatus(String value) {
            this.tncStatus = value;
        }

        /**
         * Gets the value of the tncVersion property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTncVersion() {
            return tncVersion;
        }

        /**
         * Sets the value of the tncVersion property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTncVersion(String value) {
            this.tncVersion = value;
        }

        /**
         * Gets the value of the tncStoreNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTncStoreNumber() {
            return tncStoreNumber;
        }

        /**
         * Sets the value of the tncStoreNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTncStoreNumber(String value) {
            this.tncStoreNumber = value;
        }

        /**
         * Gets the value of the tncRegisterNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTncRegisterNumber() {
            return tncRegisterNumber;
        }

        /**
         * Sets the value of the tncRegisterNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTncRegisterNumber(String value) {
            this.tncRegisterNumber = value;
        }

        /**
         * Gets the value of the tncUpdateUser property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTncUpdateUser() {
            return tncUpdateUser;
        }

        /**
         * Sets the value of the tncUpdateUser property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTncUpdateUser(String value) {
            this.tncUpdateUser = value;
        }

        /**
         * Gets the value of the tncUpdateDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTncUpdateDate() {
            return tncUpdateDate;
        }

        /**
         * Sets the value of the tncUpdateDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTncUpdateDate(String value) {
            this.tncUpdateDate = value;
        }

    }

}
