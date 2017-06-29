
package com.epsilon.webservices;

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
 *         &lt;element name="Multiplier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SpendThreshold" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{http://www.epsilon.com/webservices/}XRTiers" maxOccurs="unbounded"/&gt;
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
    "multiplier",
    "spendThreshold",
    "xrTiers"
})
@XmlRootElement(name = "XRSpend")
public class XRSpend {

    @XmlElement(name = "Multiplier", required = true)
    protected String multiplier;
    @XmlElement(name = "SpendThreshold", required = true)
    protected String spendThreshold;
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
     * Gets the value of the spendThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpendThreshold() {
        return spendThreshold;
    }

    /**
     * Sets the value of the spendThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpendThreshold(String value) {
        this.spendThreshold = value;
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
