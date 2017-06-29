
package com.searshc.hs.som.thm.domain.telluride;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OfferRegistration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferRegistration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MessageVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="ActionTag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="MemberNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="RequestorID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="AssociateID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="RegisterNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="StoreNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="RegistrationStartDTTM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="RegistrationEndDTTM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="OfferMemberGroupList" type="{http://www.epsilon.com/webservices/}ArrayOfOfferMemberGroupList" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferRegistration", propOrder = {
    "messageVersion",
    "actionTag",
    "memberNumber",
    "requestorID",
    "associateID",
    "registerNumber",
    "storeNumber",
    "registrationStartDTTM",
    "registrationEndDTTM",
    "offerMemberGroupList"
})
@XmlRootElement
public class OfferRegistration {

    @XmlElement(name = "MessageVersion")
    protected String messageVersion;
    @XmlElement(name = "ActionTag")
    protected String actionTag;
    @XmlElement(name = "MemberNumber")
    protected String memberNumber;
    @XmlElement(name = "RequestorID")
    protected String requestorID;
    @XmlElement(name = "AssociateID")
    protected String associateID;
    @XmlElement(name = "RegisterNumber")
    protected String registerNumber;
    @XmlElement(name = "StoreNumber")
    protected String storeNumber;
    @XmlElement(name = "RegistrationStartDTTM")
    protected String registrationStartDTTM;
    @XmlElement(name = "RegistrationEndDTTM")
    protected String registrationEndDTTM;
    @XmlElement(name = "OfferMemberGroupList")
    protected ArrayOfOfferMemberGroupList offerMemberGroupList;

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
     * Gets the value of the actionTag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionTag() {
        return actionTag;
    }

    /**
     * Sets the value of the actionTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionTag(String value) {
        this.actionTag = value;
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
     * Gets the value of the associateID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssociateID() {
        return associateID;
    }

    /**
     * Sets the value of the associateID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssociateID(String value) {
        this.associateID = value;
    }

    /**
     * Gets the value of the registerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisterNumber() {
        return registerNumber;
    }

    /**
     * Sets the value of the registerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisterNumber(String value) {
        this.registerNumber = value;
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
     * Gets the value of the registrationStartDTTM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationStartDTTM() {
        return registrationStartDTTM;
    }

    /**
     * Sets the value of the registrationStartDTTM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationStartDTTM(String value) {
        this.registrationStartDTTM = value;
    }

    /**
     * Gets the value of the registrationEndDTTM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationEndDTTM() {
        return registrationEndDTTM;
    }

    /**
     * Sets the value of the registrationEndDTTM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationEndDTTM(String value) {
        this.registrationEndDTTM = value;
    }

    /**
     * Gets the value of the offerMemberGroupList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOfferMemberGroupList }
     *     
     */
    public ArrayOfOfferMemberGroupList getOfferMemberGroupList() {
        return offerMemberGroupList;
    }

    /**
     * Sets the value of the offerMemberGroupList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOfferMemberGroupList }
     *     
     */
    public void setOfferMemberGroupList(ArrayOfOfferMemberGroupList value) {
        this.offerMemberGroupList = value;
    }

}
