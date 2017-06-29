
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
 *         &lt;element name="TenderAttributeKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TenderAttributeValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "tenderAttributeKey",
    "tenderAttributeValue"
})
@XmlRootElement(name = "TenderAttribute")
public class TenderAttribute {

    @XmlElement(name = "TenderAttributeKey", required = true)
    protected String tenderAttributeKey;
    @XmlElement(name = "TenderAttributeValue", required = true)
    protected String tenderAttributeValue;

    /**
     * Gets the value of the tenderAttributeKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTenderAttributeKey() {
        return tenderAttributeKey;
    }

    /**
     * Sets the value of the tenderAttributeKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTenderAttributeKey(String value) {
        this.tenderAttributeKey = value;
    }

    /**
     * Gets the value of the tenderAttributeValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTenderAttributeValue() {
        return tenderAttributeValue;
    }

    /**
     * Sets the value of the tenderAttributeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTenderAttributeValue(String value) {
        this.tenderAttributeValue = value;
    }

}
