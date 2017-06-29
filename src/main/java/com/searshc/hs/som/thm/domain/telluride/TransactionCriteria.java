
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
 *         &lt;element ref="{http://www.epsilon.com/webservices/}ApplicableCoupons" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}LayAway" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}Tenders" maxOccurs="unbounded" minOccurs="0"/>
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
    "applicableCoupons",
    "layAway",
    "tenders"
})
@XmlRootElement(name = "TransactionCriteria")
public class TransactionCriteria {

    @XmlElement(name = "ApplicableCoupons")
    protected List<ApplicableCoupons> applicableCoupons;
    @XmlElement(name = "LayAway")
    protected List<LayAway> layAway;
    @XmlElement(name = "Tenders")
    protected List<Tenders> tenders;

    /**
     * Gets the value of the applicableCoupons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicableCoupons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicableCoupons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApplicableCoupons }
     * 
     * 
     */
    public List<ApplicableCoupons> getApplicableCoupons() {
        if (applicableCoupons == null) {
            applicableCoupons = new ArrayList<ApplicableCoupons>();
        }
        return this.applicableCoupons;
    }

    /**
     * Gets the value of the layAway property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the layAway property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLayAway().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LayAway }
     * 
     * 
     */
    public List<LayAway> getLayAway() {
        if (layAway == null) {
            layAway = new ArrayList<LayAway>();
        }
        return this.layAway;
    }

    /**
     * Gets the value of the tenders property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tenders property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTenders().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tenders }
     * 
     * 
     */
    public List<Tenders> getTenders() {
        if (tenders == null) {
            tenders = new ArrayList<Tenders>();
        }
        return this.tenders;
    }

}
