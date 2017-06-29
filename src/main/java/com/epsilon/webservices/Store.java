
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
 *         &lt;element name="StoreType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TenderCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Min" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Max" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "storeType",
    "tenderCode",
    "min",
    "max"
})
@XmlRootElement(name = "Store")
public class Store {

    @XmlElement(name = "StoreType", required = true)
    protected String storeType;
    @XmlElement(name = "TenderCode", required = true)
    protected String tenderCode;
    @XmlElement(name = "Min", required = true)
    protected String min;
    @XmlElement(name = "Max", required = true)
    protected String max;

    /**
     * Gets the value of the storeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreType() {
        return storeType;
    }

    /**
     * Sets the value of the storeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreType(String value) {
        this.storeType = value;
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
     * Gets the value of the min property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMin() {
        return min;
    }

    /**
     * Sets the value of the min property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMin(String value) {
        this.min = value;
    }

    /**
     * Gets the value of the max property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMax() {
        return max;
    }

    /**
     * Sets the value of the max property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMax(String value) {
        this.max = value;
    }

}
