
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
 *         &lt;element name="XROfferPointsAvailableFor" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="XROfferMultiplier" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="XROfferQualifier" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="XROfferConditions" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="XROfferExpiryDate" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="XRPointsExclusion" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
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
    "xrOfferPointsAvailableFor",
    "xrOfferMultiplier",
    "xrOfferQualifier",
    "xrOfferConditions",
    "xrOfferExpiryDate",
    "xrPointsExclusion"
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

}
