
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
 *         &lt;element name="BirthMonthCondition" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Month" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "birthMonthCondition",
    "month"
})
@XmlRootElement(name = "BirthMonth")
public class BirthMonth {

    @XmlElement(name = "BirthMonthCondition", required = true)
    protected String birthMonthCondition;
    @XmlElement(name = "Month", required = true)
    protected String month;

    /**
     * Gets the value of the birthMonthCondition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthMonthCondition() {
        return birthMonthCondition;
    }

    /**
     * Sets the value of the birthMonthCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthMonthCondition(String value) {
        this.birthMonthCondition = value;
    }

    /**
     * Gets the value of the month property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonth() {
        return month;
    }

    /**
     * Sets the value of the month property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonth(String value) {
        this.month = value;
    }

}
