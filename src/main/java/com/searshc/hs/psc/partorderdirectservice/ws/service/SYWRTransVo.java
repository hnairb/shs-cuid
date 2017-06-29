
package com.searshc.hs.psc.partorderdirectservice.ws.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SYWRTransVo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SYWRTransVo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sywrTransType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sywrPoints" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="sywrDollars" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="sywrTransDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SYWRTransVo", propOrder = {
    "sywrTransType",
    "sywrPoints",
    "sywrDollars",
    "sywrTransDate"
})
public class SYWRTransVo {

    protected String sywrTransType;
    protected long sywrPoints;
    protected double sywrDollars;
    protected String sywrTransDate;

    /**
     * Gets the value of the sywrTransType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSywrTransType() {
        return sywrTransType;
    }

    /**
     * Sets the value of the sywrTransType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSywrTransType(String value) {
        this.sywrTransType = value;
    }

    /**
     * Gets the value of the sywrPoints property.
     * 
     */
    public long getSywrPoints() {
        return sywrPoints;
    }

    /**
     * Sets the value of the sywrPoints property.
     * 
     */
    public void setSywrPoints(long value) {
        this.sywrPoints = value;
    }

    /**
     * Gets the value of the sywrDollars property.
     * 
     */
    public double getSywrDollars() {
        return sywrDollars;
    }

    /**
     * Sets the value of the sywrDollars property.
     * 
     */
    public void setSywrDollars(double value) {
        this.sywrDollars = value;
    }

    /**
     * Gets the value of the sywrTransDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSywrTransDate() {
        return sywrTransDate;
    }

    /**
     * Sets the value of the sywrTransDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSywrTransDate(String value) {
        this.sywrTransDate = value;
    }

}
