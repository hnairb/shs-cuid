
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
 *         &lt;element name="SpendCondition" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SpendAmount" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "spendCondition",
    "spendAmount"
})
@XmlRootElement(name = "YearToDate")
public class YearToDate {

    @XmlElement(name = "SpendCondition", required = true)
    protected String spendCondition;
    @XmlElement(name = "SpendAmount", required = true)
    protected String spendAmount;

    /**
     * Gets the value of the spendCondition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpendCondition() {
        return spendCondition;
    }

    /**
     * Sets the value of the spendCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpendCondition(String value) {
        this.spendCondition = value;
    }

    /**
     * Gets the value of the spendAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpendAmount() {
        return spendAmount;
    }

    /**
     * Sets the value of the spendAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpendAmount(String value) {
        this.spendAmount = value;
    }

}