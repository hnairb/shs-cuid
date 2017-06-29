
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
 *         &lt;element name="ExcludeIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TenderCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.epsilon.com/webservices/}TenderAttributes" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalAttributes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "excludeIndicator",
    "tenderCode",
    "tenderAttributes",
    "additionalAttributes"
})
@XmlRootElement(name = "TenderDetail")
public class TenderDetail {

    @XmlElement(name = "TenderType", required = true)
    protected String tenderType;
    @XmlElement(name = "TenderAmount", required = true)
    protected String tenderAmount;
    @XmlElement(name = "ExcludeIndicator")
    protected String excludeIndicator;
    @XmlElement(name = "TenderCode")
    protected String tenderCode;
    @XmlElement(name = "TenderAttributes")
    protected TenderAttributes tenderAttributes;
    @XmlElement(name = "AdditionalAttributes")
    protected String additionalAttributes;

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
     * Gets the value of the excludeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExcludeIndicator() {
        return excludeIndicator;
    }

    /**
     * Sets the value of the excludeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExcludeIndicator(String value) {
        this.excludeIndicator = value;
    }

    /**
     * Gets the value of the tenderCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTenderCode() {
        return tenderCode;
    }

    /**
     * Sets the value of the tenderCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTenderCode(String value) {
        this.tenderCode = value;
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

    /**
     * Gets the value of the additionalAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalAttributes() {
        return additionalAttributes;
    }

    /**
     * Sets the value of the additionalAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalAttributes(String value) {
        this.additionalAttributes = value;
    }

}
