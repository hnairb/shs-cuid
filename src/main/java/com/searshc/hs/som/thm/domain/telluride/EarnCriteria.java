
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
 *         &lt;element ref="{http://www.epsilon.com/webservices/}ApplicableQuantity" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}Spend" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}Caps" maxOccurs="unbounded" minOccurs="0"/>
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
    "applicableQuantity",
    "spend",
    "caps"
})
@XmlRootElement(name = "EarnCriteria")
public class EarnCriteria {

    @XmlElement(name = "ApplicableQuantity")
    protected List<ApplicableQuantity> applicableQuantity;
    @XmlElement(name = "Spend")
    protected List<Spend> spend;
    @XmlElement(name = "Caps")
    protected List<Caps> caps;

    /**
     * Gets the value of the applicableQuantity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicableQuantity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicableQuantity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApplicableQuantity }
     * 
     * 
     */
    public List<ApplicableQuantity> getApplicableQuantity() {
        if (applicableQuantity == null) {
            applicableQuantity = new ArrayList<ApplicableQuantity>();
        }
        return this.applicableQuantity;
    }

    /**
     * Gets the value of the spend property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the spend property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpend().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Spend }
     * 
     * 
     */
    public List<Spend> getSpend() {
        if (spend == null) {
            spend = new ArrayList<Spend>();
        }
        return this.spend;
    }

    /**
     * Gets the value of the caps property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the caps property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCaps().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Caps }
     * 
     * 
     */
    public List<Caps> getCaps() {
        if (caps == null) {
            caps = new ArrayList<Caps>();
        }
        return this.caps;
    }

}
