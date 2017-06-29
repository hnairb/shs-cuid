
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
 *         &lt;element name="EnrolmentDateCondition" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
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
    "enrolmentDateCondition",
    "date"
})
@XmlRootElement(name = "EnrolmentDate")
public class EnrolmentDate {

    @XmlElement(name = "EnrolmentDateCondition", required = true)
    protected String enrolmentDateCondition;
    @XmlElement(name = "Date", required = true)
    protected String date;

    /**
     * Gets the value of the enrolmentDateCondition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnrolmentDateCondition() {
        return enrolmentDateCondition;
    }

    /**
     * Sets the value of the enrolmentDateCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnrolmentDateCondition(String value) {
        this.enrolmentDateCondition = value;
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
