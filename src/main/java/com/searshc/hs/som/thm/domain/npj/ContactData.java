//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.04 at 10:15:02 PM IST 
//


package com.searshc.hs.som.thm.domain.npj;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for contactData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contactData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dnSlcFl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="preferredPrimaryCntFl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contactData", propOrder = {
    "dnSlcFl",
    "preferredPrimaryCntFl"
})
@XmlSeeAlso({
    PhoneData.class,
    EmailData.class
})
public class ContactData {

    protected String dnSlcFl;
    protected String preferredPrimaryCntFl;

    /**
     * Gets the value of the dnSlcFl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDnSlcFl() {
        return dnSlcFl;
    }

    /**
     * Sets the value of the dnSlcFl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDnSlcFl(String value) {
        this.dnSlcFl = value;
    }

    /**
     * Gets the value of the preferredPrimaryCntFl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferredPrimaryCntFl() {
        return preferredPrimaryCntFl;
    }

    /**
     * Sets the value of the preferredPrimaryCntFl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferredPrimaryCntFl(String value) {
        this.preferredPrimaryCntFl = value;
    }

}
