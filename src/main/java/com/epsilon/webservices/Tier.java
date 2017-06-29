
package com.epsilon.webservices;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="ElevatedTier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TierThreshold" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="DollarsToThreshold" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{http://www.epsilon.com/webservices/}VIPThreshold" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "elevatedTier",
    "tierThreshold",
    "dollarsToThreshold",
    "description",
    "vipThreshold"
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
    @XmlElement(name = "VIPThreshold")
    protected List<VIPThreshold> vipThreshold;

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

    /**
     * Gets the value of the vipThreshold property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vipThreshold property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVIPThreshold().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VIPThreshold }
     * 
     * 
     */
    public List<VIPThreshold> getVIPThreshold() {
        if (vipThreshold == null) {
            vipThreshold = new ArrayList<VIPThreshold>();
        }
        return this.vipThreshold;
    }

}
