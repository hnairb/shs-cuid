
package com.searshc.hs.som.thm.domain.telluride;

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
 * &lt;complexType name="Affinity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AffinityID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="AffinityStatus" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="AffiliationCode" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="OfferCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Affinity", propOrder = {
    "affinityID",
    "affinityStatus",
    "affiliationCode",
    "offerCode"
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

}
