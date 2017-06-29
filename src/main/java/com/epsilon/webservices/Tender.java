
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
 *         &lt;element name="TenderType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TenderAmount" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AuthorizationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.epsilon.com/webservices/}TenderAttributes" minOccurs="0"/&gt;
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
    "tenderType",
    "tenderAmount",
    "authorizationCode",
    "tenderAttributes"
})
@XmlRootElement(name = "Tender")
public class Tender {

    @XmlElement(name = "TenderType", required = true)
    protected String tenderType;
    @XmlElement(name = "TenderAmount", required = true)
    protected String tenderAmount;
    @XmlElement(name = "AuthorizationCode")
    protected String authorizationCode;
    @XmlElement(name = "TenderAttributes")
    protected TenderAttributes tenderAttributes;

    /**
     * Gets the value of the tenderType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTenderType() {
        return tenderType;
    }

    /**
     * Sets the value of the tenderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTenderType(String value) {
        this.tenderType = value;
    }

    /**
     * Gets the value of the tenderAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTenderAmount() {
        return tenderAmount;
    }

    /**
     * Sets the value of the tenderAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTenderAmount(String value) {
        this.tenderAmount = value;
    }

    /**
     * Gets the value of the authorizationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizationCode() {
        return authorizationCode;
    }

    /**
     * Sets the value of the authorizationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationCode(String value) {
        this.authorizationCode = value;
    }

    /**
     * Gets the value of the tenderAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link TenderAttributes }
     *     
     */
    public TenderAttributes getTenderAttributes() {
        return tenderAttributes;
    }

    /**
     * Sets the value of the tenderAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link TenderAttributes }
     *     
     */
    public void setTenderAttributes(TenderAttributes value) {
        this.tenderAttributes = value;
    }

}
