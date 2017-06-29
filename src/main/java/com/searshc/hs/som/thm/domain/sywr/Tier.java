
package com.searshc.hs.som.thm.domain.sywr;

import java.math.BigDecimal;
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
 *         &lt;element name="ElevatedTier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TierThreshold" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="DollarsToThreshold" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "elevatedTier",
    "tierThreshold",
    "dollarsToThreshold",
    "description"
})
@XmlRootElement(name = "Tier")
public class Tier {

    @XmlElement(name = "ElevatedTier", required = true)
    protected String elevatedTier;
    @XmlElement(name = "TierThreshold", required = true)
    protected BigDecimal tierThreshold;
    @XmlElement(name = "DollarsToThreshold", required = true)
    protected BigDecimal dollarsToThreshold;
    @XmlElement(name = "Description", required = true)
    protected String description;

    /**
     * Gets the value of the elevatedTier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElevatedTier() {
        return elevatedTier;
    }

    /**
     * Sets the value of the elevatedTier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElevatedTier(String value) {
        this.elevatedTier = value;
    }

    /**
     * Gets the value of the tierThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTierThreshold() {
        return tierThreshold;
    }

    /**
     * Sets the value of the tierThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTierThreshold(BigDecimal value) {
        this.tierThreshold = value;
    }

    /**
     * Gets the value of the dollarsToThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDollarsToThreshold() {
        return dollarsToThreshold;
    }

    /**
     * Sets the value of the dollarsToThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDollarsToThreshold(BigDecimal value) {
        this.dollarsToThreshold = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
