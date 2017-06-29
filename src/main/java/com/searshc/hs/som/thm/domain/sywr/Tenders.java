
package com.searshc.hs.som.thm.domain.sywr;

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
 *         &lt;element ref="{http://www.epsilon.com/webservices/}Store" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}TenderGroups" maxOccurs="unbounded" minOccurs="0"/>
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
    "store",
    "tenderGroups"
})
@XmlRootElement(name = "Tenders")
public class Tenders {

    @XmlElement(name = "Store")
    protected List<Store> store;
    @XmlElement(name = "TenderGroups")
    protected List<TenderGroups> tenderGroups;

    /**
     * Gets the value of the store property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the store property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStore().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Store }
     * 
     * 
     */
    public List<Store> getStore() {
        if (store == null) {
            store = new ArrayList<Store>();
        }
        return this.store;
    }

    /**
     * Gets the value of the tenderGroups property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tenderGroups property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTenderGroups().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TenderGroups }
     * 
     * 
     */
    public List<TenderGroups> getTenderGroups() {
        if (tenderGroups == null) {
            tenderGroups = new ArrayList<TenderGroups>();
        }
        return this.tenderGroups;
    }

}
