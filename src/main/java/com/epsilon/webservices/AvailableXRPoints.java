
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
 *         &lt;element name="XROfferPointsAvailableFor" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="XROfferMultiplier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="XROfferQualifier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="XROfferConditions" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="XROfferExpiryDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="XRPointsExclusion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OfferDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OfferTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OfferEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LegalCopy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "xrOfferPointsAvailableFor",
    "xrOfferMultiplier",
    "xrOfferQualifier",
    "xrOfferConditions",
    "xrOfferExpiryDate",
    "xrPointsExclusion",
    "offerDescription",
    "offerTitle",
    "offerEndDate",
    "legalCopy"
})
@XmlRootElement(name = "AvailableXRPoints")
public class AvailableXRPoints {

    @XmlElement(name = "XROfferPointsAvailableFor", required = true)
    protected String xrOfferPointsAvailableFor;
    @XmlElement(name = "XROfferMultiplier", required = true)
    protected String xrOfferMultiplier;
    @XmlElement(name = "XROfferQualifier", required = true)
    protected String xrOfferQualifier;
    @XmlElement(name = "XROfferConditions", required = true)
    protected String xrOfferConditions;
    @XmlElement(name = "XROfferExpiryDate", required = true)
    protected String xrOfferExpiryDate;
    @XmlElement(name = "XRPointsExclusion", required = true)
    protected String xrPointsExclusion;
    @XmlElement(name = "OfferDescription")
    protected String offerDescription;
    @XmlElement(name = "OfferTitle")
    protected String offerTitle;
    @XmlElement(name = "OfferEndDate")
    protected String offerEndDate;
    @XmlElement(name = "LegalCopy")
    protected String legalCopy;

    /**
     * Gets the value of the xrOfferPointsAvailableFor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXROfferPointsAvailableFor() {
        return xrOfferPointsAvailableFor;
    }

    /**
     * Sets the value of the xrOfferPointsAvailableFor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXROfferPointsAvailableFor(String value) {
        this.xrOfferPointsAvailableFor = value;
    }

    /**
     * Gets the value of the xrOfferMultiplier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXROfferMultiplier() {
        return xrOfferMultiplier;
    }

    /**
     * Sets the value of the xrOfferMultiplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXROfferMultiplier(String value) {
        this.xrOfferMultiplier = value;
    }

    /**
     * Gets the value of the xrOfferQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXROfferQualifier() {
        return xrOfferQualifier;
    }

    /**
     * Sets the value of the xrOfferQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXROfferQualifier(String value) {
        this.xrOfferQualifier = value;
    }

    /**
     * Gets the value of the xrOfferConditions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXROfferConditions() {
        return xrOfferConditions;
    }

    /**
     * Sets the value of the xrOfferConditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXROfferConditions(String value) {
        this.xrOfferConditions = value;
    }

    /**
     * Gets the value of the xrOfferExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXROfferExpiryDate() {
        return xrOfferExpiryDate;
    }

    /**
     * Sets the value of the xrOfferExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXROfferExpiryDate(String value) {
        this.xrOfferExpiryDate = value;
    }

    /**
     * Gets the value of the xrPointsExclusion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXRPointsExclusion() {
        return xrPointsExclusion;
    }

    /**
     * Sets the value of the xrPointsExclusion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXRPointsExclusion(String value) {
        this.xrPointsExclusion = value;
    }

    /**
     * Gets the value of the offerDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferDescription() {
        return offerDescription;
    }

    /**
     * Sets the value of the offerDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferDescription(String value) {
        this.offerDescription = value;
    }

    /**
     * Gets the value of the offerTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferTitle() {
        return offerTitle;
    }

    /**
     * Sets the value of the offerTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferTitle(String value) {
        this.offerTitle = value;
    }

    /**
     * Gets the value of the offerEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferEndDate() {
        return offerEndDate;
    }

    /**
     * Sets the value of the offerEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferEndDate(String value) {
        this.offerEndDate = value;
    }

    /**
     * Gets the value of the legalCopy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalCopy() {
        return legalCopy;
    }

    /**
     * Sets the value of the legalCopy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalCopy(String value) {
        this.legalCopy = value;
    }

}
