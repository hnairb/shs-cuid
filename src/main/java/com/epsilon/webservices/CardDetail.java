
package com.epsilon.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MemberUniqueId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RegistrationUniqueId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ServiceRegistrationNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LastUpdatedTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CardType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PartnerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EnrollmentSourceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardDetail", propOrder = {
    "memberUniqueId",
    "registrationUniqueId",
    "serviceRegistrationNumber",
    "lastUpdatedTime",
    "cardType",
    "partnerType",
    "enrollmentSourceCode"
})
public class CardDetail {

    @XmlElement(name = "MemberUniqueId", required = true)
    protected String memberUniqueId;
    @XmlElement(name = "RegistrationUniqueId", required = true)
    protected String registrationUniqueId;
    @XmlElement(name = "ServiceRegistrationNumber", required = true)
    protected String serviceRegistrationNumber;
    @XmlElement(name = "LastUpdatedTime", required = true)
    protected String lastUpdatedTime;
    @XmlElement(name = "CardType", required = true)
    protected String cardType;
    @XmlElement(name = "PartnerType")
    protected String partnerType;
    @XmlElement(name = "EnrollmentSourceCode")
    protected String enrollmentSourceCode;

    /**
     * Gets the value of the memberUniqueId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberUniqueId() {
        return memberUniqueId;
    }

    /**
     * Sets the value of the memberUniqueId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberUniqueId(String value) {
        this.memberUniqueId = value;
    }

    /**
     * Gets the value of the registrationUniqueId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationUniqueId() {
        return registrationUniqueId;
    }

    /**
     * Sets the value of the registrationUniqueId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationUniqueId(String value) {
        this.registrationUniqueId = value;
    }

    /**
     * Gets the value of the serviceRegistrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceRegistrationNumber() {
        return serviceRegistrationNumber;
    }

    /**
     * Sets the value of the serviceRegistrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceRegistrationNumber(String value) {
        this.serviceRegistrationNumber = value;
    }

    /**
     * Gets the value of the lastUpdatedTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    /**
     * Sets the value of the lastUpdatedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUpdatedTime(String value) {
        this.lastUpdatedTime = value;
    }

    /**
     * Gets the value of the cardType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardType() {
        return cardType;
    }

    /**
     * Sets the value of the cardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardType(String value) {
        this.cardType = value;
    }

    /**
     * Gets the value of the partnerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerType() {
        return partnerType;
    }

    /**
     * Sets the value of the partnerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerType(String value) {
        this.partnerType = value;
    }

    /**
     * Gets the value of the enrollmentSourceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnrollmentSourceCode() {
        return enrollmentSourceCode;
    }

    /**
     * Sets the value of the enrollmentSourceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnrollmentSourceCode(String value) {
        this.enrollmentSourceCode = value;
    }

}
