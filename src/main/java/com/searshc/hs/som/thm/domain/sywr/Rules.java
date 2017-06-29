
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
 *         &lt;element ref="{http://www.epsilon.com/webservices/}StoreCriteria" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}MemberCriteria" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}ProductCriteria" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}TransactionCriteria" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}EarnCriteria" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}XRCriteria" maxOccurs="unbounded" minOccurs="0"/>
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
    "storeCriteria",
    "memberCriteria",
    "productCriteria",
    "transactionCriteria",
    "earnCriteria",
    "xrCriteria"
})
@XmlRootElement(name = "Rules")
public class Rules {

    @XmlElement(name = "StoreCriteria")
    protected List<StoreCriteria> storeCriteria;
    @XmlElement(name = "MemberCriteria")
    protected List<MemberCriteria> memberCriteria;
    @XmlElement(name = "ProductCriteria")
    protected List<ProductCriteria> productCriteria;
    @XmlElement(name = "TransactionCriteria")
    protected List<TransactionCriteria> transactionCriteria;
    @XmlElement(name = "EarnCriteria")
    protected List<EarnCriteria> earnCriteria;
    @XmlElement(name = "XRCriteria")
    protected List<XRCriteria> xrCriteria;

    /**
     * Gets the value of the storeCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the storeCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStoreCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StoreCriteria }
     * 
     * 
     */
    public List<StoreCriteria> getStoreCriteria() {
        if (storeCriteria == null) {
            storeCriteria = new ArrayList<StoreCriteria>();
        }
        return this.storeCriteria;
    }

    /**
     * Gets the value of the memberCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the memberCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMemberCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MemberCriteria }
     * 
     * 
     */
    public List<MemberCriteria> getMemberCriteria() {
        if (memberCriteria == null) {
            memberCriteria = new ArrayList<MemberCriteria>();
        }
        return this.memberCriteria;
    }

    /**
     * Gets the value of the productCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductCriteria }
     * 
     * 
     */
    public List<ProductCriteria> getProductCriteria() {
        if (productCriteria == null) {
            productCriteria = new ArrayList<ProductCriteria>();
        }
        return this.productCriteria;
    }

    /**
     * Gets the value of the transactionCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transactionCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransactionCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionCriteria }
     * 
     * 
     */
    public List<TransactionCriteria> getTransactionCriteria() {
        if (transactionCriteria == null) {
            transactionCriteria = new ArrayList<TransactionCriteria>();
        }
        return this.transactionCriteria;
    }

    /**
     * Gets the value of the earnCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the earnCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEarnCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EarnCriteria }
     * 
     * 
     */
    public List<EarnCriteria> getEarnCriteria() {
        if (earnCriteria == null) {
            earnCriteria = new ArrayList<EarnCriteria>();
        }
        return this.earnCriteria;
    }

    /**
     * Gets the value of the xrCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xrCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXRCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XRCriteria }
     * 
     * 
     */
    public List<XRCriteria> getXRCriteria() {
        if (xrCriteria == null) {
            xrCriteria = new ArrayList<XRCriteria>();
        }
        return this.xrCriteria;
    }

}
