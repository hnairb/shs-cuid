
package com.epsilon.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Affinity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Affinity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AffinityID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AffinityStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AffiliationCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OfferCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AffinityAdditionalAttributes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AffinityNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AffinityStartTS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AffinityEndTS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Affinity", propOrder = {
    "affinityID",
    "affinityStatus",
    "affiliationCode",
    "offerCode",
    "affinityAdditionalAttributes",
    "affinityNumber",
    "affinityStartTS",
    "affinityEndTS"
})
@XmlSeeAlso({
    AffinityForMemberPricing.class,
    AffinityExtended.class
})
public class Affinity {

    @XmlElement(name = "AffinityID")
    protected String affinityID;
    @XmlElement(name = "AffinityStatus", required = true)
    protected String affinityStatus;
    @XmlElement(name = "AffiliationCode", required = true)
    protected String affiliationCode;
    @XmlElement(name = "OfferCode")
    protected String offerCode;
    @XmlElement(name = "AffinityAdditionalAttributes")
    protected String affinityAdditionalAttributes;
    @XmlElement(name = "AffinityNumber")
    protected String affinityNumber;
    @XmlElement(name = "AffinityStartTS")
    protected String affinityStartTS;
    @XmlElement(name = "AffinityEndTS")
    protected String affinityEndTS;

    /**
     * Gets the value of the affinityID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAffinityID() {
        return affinityID;
    }

    /**
     * Sets the value of the affinityID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAffinityID(String value) {
        this.affinityID = value;
    }

    /**
     * Gets the value of the affinityStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAffinityStatus() {
        return affinityStatus;
    }

    /**
     * Sets the value of the affinityStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAffinityStatus(String value) {
        this.affinityStatus = value;
    }

    /**
     * Gets the value of the affiliationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAffiliationCode() {
        return affiliationCode;
    }

    /**
     * Sets the value of the affiliationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAffiliationCode(String value) {
        this.affiliationCode = value;
    }

    /**
     * Gets the value of the offerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferCode() {
        return offerCode;
    }

    /**
     * Sets the value of the offerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferCode(String value) {
        this.offerCode = value;
    }

    /**
     * Gets the value of the affinityAdditionalAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAffinityAdditionalAttributes() {
        return affinityAdditionalAttributes;
    }

    /**
     * Sets the value of the affinityAdditionalAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAffinityAdditionalAttributes(String value) {
        this.affinityAdditionalAttributes = value;
    }

    /**
     * Gets the value of the affinityNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAffinityNumber() {
        return affinityNumber;
    }

    /**
     * Sets the value of the affinityNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAffinityNumber(String value) {
        this.affinityNumber = value;
    }

    /**
     * Gets the value of the affinityStartTS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAffinityStartTS() {
        return affinityStartTS;
    }

    /**
     * Sets the value of the affinityStartTS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAffinityStartTS(String value) {
        this.affinityStartTS = value;
    }

    /**
     * Gets the value of the affinityEndTS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAffinityEndTS() {
        return affinityEndTS;
    }

    /**
     * Sets the value of the affinityEndTS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAffinityEndTS(String value) {
        this.affinityEndTS = value;
    }

}
