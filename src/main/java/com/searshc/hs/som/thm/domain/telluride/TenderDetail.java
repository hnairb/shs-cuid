
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
 *         &lt;element name="TenderType" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="TenderAmount" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="ExcludeIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="TenderCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
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
    "tenderType",
    "tenderAmount",
    "excludeIndicator",
    "tenderCode"
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

}
