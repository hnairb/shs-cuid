
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
 *         &lt;element name="MessageVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RequestorID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CurrentDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CurrentTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StoreNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Terminal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="POSPrompt" type="{http://www.epsilon.com/webservices/}ArrayOfPOSPromptQuestions" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalAttributes" type="{http://www.epsilon.com/webservices/}ArrayOfAdditionalAttribute" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.epsilon.com/webservices/}AdditionalResponseInfo" minOccurs="0"/&gt;
 *         &lt;element name="GetMemberPrompt" type="{http://www.epsilon.com/webservices/}GetMemberPrompt" minOccurs="0"/&gt;
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
    "messageVersion",
    "requestorID",
    "currentDate",
    "currentTime",
    "storeNumber",
    "terminal",
    "posPrompt",
    "additionalAttributes",
    "additionalResponseInfo",
    "getMemberPrompt"
})
@XmlRootElement(name = "UpdateMemberPrompts")
public class UpdateMemberPrompts {

    @XmlElement(name = "MemberNumber")
    protected String memberNumber;
    @XmlElement(name = "MessageVersion")
    protected String messageVersion;
    @XmlElement(name = "RequestorID")
    protected String requestorID;
    @XmlElement(name = "CurrentDate")
    protected String currentDate;
    @XmlElement(name = "CurrentTime")
    protected String currentTime;
    @XmlElement(name = "StoreNumber")
    protected String storeNumber;
    @XmlElement(name = "Terminal")
    protected String terminal;
    @XmlElement(name = "POSPrompt")
    protected ArrayOfPOSPromptQuestions posPrompt;
    @XmlElement(name = "AdditionalAttributes")
    protected ArrayOfAdditionalAttribute additionalAttributes;
    @XmlElement(name = "AdditionalResponseInfo")
    protected AdditionalResponseInfo additionalResponseInfo;
    @XmlElement(name = "GetMemberPrompt")
    protected GetMemberPrompt getMemberPrompt;

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
     * Gets the value of the posPrompt property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPOSPromptQuestions }
     *     
     */
    public ArrayOfPOSPromptQuestions getPOSPrompt() {
        return posPrompt;
    }

    /**
     * Sets the value of the posPrompt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPOSPromptQuestions }
     *     
     */
    public void setPOSPrompt(ArrayOfPOSPromptQuestions value) {
        this.posPrompt = value;
    }

    /**
     * Gets the value of the additionalAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAdditionalAttribute }
     *     
     */
    public ArrayOfAdditionalAttribute getAdditionalAttributes() {
        return additionalAttributes;
    }

    /**
     * Sets the value of the additionalAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAdditionalAttribute }
     *     
     */
    public void setAdditionalAttributes(ArrayOfAdditionalAttribute value) {
        this.additionalAttributes = value;
    }

    /**
     * Gets the value of the additionalResponseInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalResponseInfo }
     *     
     */
    public AdditionalResponseInfo getAdditionalResponseInfo() {
        return additionalResponseInfo;
    }

    /**
     * Sets the value of the additionalResponseInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalResponseInfo }
     *     
     */
    public void setAdditionalResponseInfo(AdditionalResponseInfo value) {
        this.additionalResponseInfo = value;
    }

    /**
     * Gets the value of the getMemberPrompt property.
     * 
     * @return
     *     possible object is
     *     {@link GetMemberPrompt }
     *     
     */
    public GetMemberPrompt getGetMemberPrompt() {
        return getMemberPrompt;
    }

    /**
     * Sets the value of the getMemberPrompt property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetMemberPrompt }
     *     
     */
    public void setGetMemberPrompt(GetMemberPrompt value) {
        this.getMemberPrompt = value;
    }

}
