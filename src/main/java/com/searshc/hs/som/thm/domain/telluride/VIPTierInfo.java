
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
 *         &lt;element name="VIPTier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="VIPTierCap" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="SelectedBenefits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="RemainingBenefits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
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
    "vipTier",
    "vipTierCap",
    "selectedBenefits",
    "remainingBenefits"
})
@XmlRootElement(name = "VIPTierInfo")
public class VIPTierInfo {

    @XmlElement(name = "VIPTier")
    protected String vipTier;
    @XmlElement(name = "VIPTierCap")
    protected String vipTierCap;
    @XmlElement(name = "SelectedBenefits")
    protected String selectedBenefits;
    @XmlElement(name = "RemainingBenefits")
    protected String remainingBenefits;

    /**
     * Gets the value of the vipTier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVIPTier() {
        return vipTier;
    }

    /**
     * Sets the value of the vipTier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVIPTier(String value) {
        this.vipTier = value;
    }

    /**
     * Gets the value of the vipTierCap property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVIPTierCap() {
        return vipTierCap;
    }

    /**
     * Sets the value of the vipTierCap property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVIPTierCap(String value) {
        this.vipTierCap = value;
    }

    /**
     * Gets the value of the selectedBenefits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelectedBenefits() {
        return selectedBenefits;
    }

    /**
     * Sets the value of the selectedBenefits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelectedBenefits(String value) {
        this.selectedBenefits = value;
    }

    /**
     * Gets the value of the remainingBenefits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemainingBenefits() {
        return remainingBenefits;
    }

    /**
     * Sets the value of the remainingBenefits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemainingBenefits(String value) {
        this.remainingBenefits = value;
    }

}
