
package com.searshc.hs.som.thm.domain.telluride;

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
 *         &lt;element name="MemberNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="StartDTTM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="EndDTTM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="StoreFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="StoreLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="MessageVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="BenefitOnly" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
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
    "memberNumber",
    "startDTTM",
    "endDTTM",
    "storeFormat",
    "storeLocation",
    "messageVersion",
    "benefitOnly"
})
@XmlRootElement(name = "GetMemberActivityDetail")
public class GetMemberActivityDetail {

    @XmlElement(name = "MemberNumber")
    protected String memberNumber;
    @XmlElement(name = "StartDTTM")
    protected String startDTTM;
    @XmlElement(name = "EndDTTM")
    protected String endDTTM;
    @XmlElement(name = "StoreFormat")
    protected String storeFormat;
    @XmlElement(name = "StoreLocation")
    protected String storeLocation;
    @XmlElement(name = "MessageVersion")
    protected String messageVersion;
    @XmlElement(name = "BenefitOnly")
    protected String benefitOnly;

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
     * Gets the value of the startDTTM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDTTM() {
        return startDTTM;
    }

    /**
     * Sets the value of the startDTTM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDTTM(String value) {
        this.startDTTM = value;
    }

    /**
     * Gets the value of the endDTTM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDTTM() {
        return endDTTM;
    }

    /**
     * Sets the value of the endDTTM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDTTM(String value) {
        this.endDTTM = value;
    }

    /**
     * Gets the value of the storeFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreFormat() {
        return storeFormat;
    }

    /**
     * Sets the value of the storeFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreFormat(String value) {
        this.storeFormat = value;
    }

    /**
     * Gets the value of the storeLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreLocation() {
        return storeLocation;
    }

    /**
     * Sets the value of the storeLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreLocation(String value) {
        this.storeLocation = value;
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
     * Gets the value of the benefitOnly property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBenefitOnly() {
        return benefitOnly;
    }

    /**
     * Sets the value of the benefitOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBenefitOnly(String value) {
        this.benefitOnly = value;
    }

}
