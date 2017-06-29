
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
 *         &lt;element ref="{http://www.epsilon.com/webservices/}Cities" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.epsilon.com/webservices/}States" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.epsilon.com/webservices/}Zipcodes" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "cities",
    "states",
    "zipcodes"
})
@XmlRootElement(name = "AdditionalOptions")
public class AdditionalOptions {

    @XmlElement(name = "Cities")
    protected List<Cities> cities;
    @XmlElement(name = "States")
    protected List<States> states;
    @XmlElement(name = "Zipcodes")
    protected List<Zipcodes> zipcodes;

    /**
     * Gets the value of the cities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Cities }
     * 
     * 
     */
    public List<Cities> getCities() {
        if (cities == null) {
            cities = new ArrayList<Cities>();
        }
        return this.cities;
    }

    /**
     * Gets the value of the states property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the states property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link States }
     * 
     * 
     */
    public List<States> getStates() {
        if (states == null) {
            states = new ArrayList<States>();
        }
        return this.states;
    }

    /**
     * Gets the value of the zipcodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zipcodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZipcodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Zipcodes }
     * 
     * 
     */
    public List<Zipcodes> getZipcodes() {
        if (zipcodes == null) {
            zipcodes = new ArrayList<Zipcodes>();
        }
        return this.zipcodes;
    }

}
