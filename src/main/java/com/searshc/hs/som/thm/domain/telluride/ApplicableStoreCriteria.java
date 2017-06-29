
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
 *         &lt;element ref="{http://www.epsilon.com/webservices/}StoreNumbers" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}StoreTypes" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}ApplicableStoreFormats" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}AdditionalOptions" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}LocationGroups" maxOccurs="unbounded"/>
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
    "storeNumbers",
    "storeTypes",
    "applicableStoreFormats",
    "additionalOptions",
    "locationGroups"
})
@XmlRootElement(name = "ApplicableStoreCriteria")
public class ApplicableStoreCriteria {

    @XmlElement(name = "StoreNumbers", required = true)
    protected List<StoreNumbers> storeNumbers;
    @XmlElement(name = "StoreTypes", required = true)
    protected List<StoreTypes> storeTypes;
    @XmlElement(name = "ApplicableStoreFormats", required = true)
    protected List<ApplicableStoreFormats> applicableStoreFormats;
    @XmlElement(name = "AdditionalOptions", required = true)
    protected List<AdditionalOptions> additionalOptions;
    @XmlElement(name = "LocationGroups", required = true)
    protected List<LocationGroups> locationGroups;

    /**
     * Gets the value of the storeNumbers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the storeNumbers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStoreNumbers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StoreNumbers }
     * 
     * 
     */
    public List<StoreNumbers> getStoreNumbers() {
        if (storeNumbers == null) {
            storeNumbers = new ArrayList<StoreNumbers>();
        }
        return this.storeNumbers;
    }

    /**
     * Gets the value of the storeTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the storeTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStoreTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StoreTypes }
     * 
     * 
     */
    public List<StoreTypes> getStoreTypes() {
        if (storeTypes == null) {
            storeTypes = new ArrayList<StoreTypes>();
        }
        return this.storeTypes;
    }

    /**
     * Gets the value of the applicableStoreFormats property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicableStoreFormats property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicableStoreFormats().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApplicableStoreFormats }
     * 
     * 
     */
    public List<ApplicableStoreFormats> getApplicableStoreFormats() {
        if (applicableStoreFormats == null) {
            applicableStoreFormats = new ArrayList<ApplicableStoreFormats>();
        }
        return this.applicableStoreFormats;
    }

    /**
     * Gets the value of the additionalOptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalOptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalOptions }
     * 
     * 
     */
    public List<AdditionalOptions> getAdditionalOptions() {
        if (additionalOptions == null) {
            additionalOptions = new ArrayList<AdditionalOptions>();
        }
        return this.additionalOptions;
    }

    /**
     * Gets the value of the locationGroups property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationGroups property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationGroups().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationGroups }
     * 
     * 
     */
    public List<LocationGroups> getLocationGroups() {
        if (locationGroups == null) {
            locationGroups = new ArrayList<LocationGroups>();
        }
        return this.locationGroups;
    }

}
