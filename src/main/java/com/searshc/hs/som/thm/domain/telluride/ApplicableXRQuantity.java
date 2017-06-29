
package com.searshc.hs.som.thm.domain.telluride;

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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Multiplier" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="ItemThreshold" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}XRTiers" maxOccurs="unbounded"/>
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
    "multiplier",
    "itemThreshold",
    "xrTiers"
})
@XmlRootElement(name = "ApplicableXRQuantity")
public class ApplicableXRQuantity {

    @XmlElement(name = "Multiplier", required = true)
    protected String multiplier;
    @XmlElement(name = "ItemThreshold", required = true)
    protected String itemThreshold;
    @XmlElement(name = "XRTiers", required = true)
    protected List<XRTiers> xrTiers;

    /**
     * Gets the value of the multiplier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMultiplier() {
        return multiplier;
    }

    /**
     * Sets the value of the multiplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMultiplier(String value) {
        this.multiplier = value;
    }

    /**
     * Gets the value of the itemThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemThreshold() {
        return itemThreshold;
    }

    /**
     * Sets the value of the itemThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemThreshold(String value) {
        this.itemThreshold = value;
    }

    /**
     * Gets the value of the xrTiers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xrTiers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXRTiers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XRTiers }
     * 
     * 
     */
    public List<XRTiers> getXRTiers() {
        if (xrTiers == null) {
            xrTiers = new ArrayList<XRTiers>();
        }
        return this.xrTiers;
    }

}