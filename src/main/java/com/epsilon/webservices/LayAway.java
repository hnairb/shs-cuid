
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
 *         &lt;element ref="{http://www.epsilon.com/webservices/}OpenDate" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.epsilon.com/webservices/}CloseDate" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.epsilon.com/webservices/}FinalPayment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.epsilon.com/webservices/}PriceTypes" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "openDate",
    "closeDate",
    "finalPayment",
    "priceTypes"
})
@XmlRootElement(name = "LayAway")
public class LayAway {

    @XmlElement(name = "OpenDate")
    protected List<OpenDate> openDate;
    @XmlElement(name = "CloseDate")
    protected List<CloseDate> closeDate;
    @XmlElement(name = "FinalPayment")
    protected List<FinalPayment> finalPayment;
    @XmlElement(name = "PriceTypes")
    protected List<PriceTypes> priceTypes;

    /**
     * Gets the value of the openDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the openDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOpenDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpenDate }
     * 
     * 
     */
    public List<OpenDate> getOpenDate() {
        if (openDate == null) {
            openDate = new ArrayList<OpenDate>();
        }
        return this.openDate;
    }

    /**
     * Gets the value of the closeDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the closeDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCloseDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CloseDate }
     * 
     * 
     */
    public List<CloseDate> getCloseDate() {
        if (closeDate == null) {
            closeDate = new ArrayList<CloseDate>();
        }
        return this.closeDate;
    }

    /**
     * Gets the value of the finalPayment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the finalPayment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinalPayment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinalPayment }
     * 
     * 
     */
    public List<FinalPayment> getFinalPayment() {
        if (finalPayment == null) {
            finalPayment = new ArrayList<FinalPayment>();
        }
        return this.finalPayment;
    }

    /**
     * Gets the value of the priceTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priceTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriceTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceTypes }
     * 
     * 
     */
    public List<PriceTypes> getPriceTypes() {
        if (priceTypes == null) {
            priceTypes = new ArrayList<PriceTypes>();
        }
        return this.priceTypes;
    }

}
