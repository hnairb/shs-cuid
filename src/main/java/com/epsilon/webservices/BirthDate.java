
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
 *         &lt;element name="BirthDateCondition" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "birthDateCondition",
    "date"
})
@XmlRootElement(name = "BirthDate")
public class BirthDate {

    @XmlElement(name = "BirthDateCondition", required = true)
    protected String birthDateCondition;
    @XmlElement(name = "Date", required = true)
    protected String date;

    /**
     * Gets the value of the birthDateCondition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthDateCondition() {
        return birthDateCondition;
    }

    /**
     * Sets the value of the birthDateCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthDateCondition(String value) {
        this.birthDateCondition = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
    }

}