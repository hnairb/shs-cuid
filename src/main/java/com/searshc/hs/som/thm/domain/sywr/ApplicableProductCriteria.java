
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
 *         &lt;element ref="{http://www.epsilon.com/webservices/}ProductInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}PriceFilter" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}Brands" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}ProductGroups" maxOccurs="unbounded" minOccurs="0"/>
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
    "productInfo",
    "priceFilter",
    "brands",
    "productGroups"
})
@XmlRootElement(name = "ApplicableProductCriteria")
public class ApplicableProductCriteria {

    @XmlElement(name = "ProductInfo")
    protected List<ProductInfo> productInfo;
    @XmlElement(name = "PriceFilter")
    protected List<PriceFilter> priceFilter;
    @XmlElement(name = "Brands")
    protected List<Brands> brands;
    @XmlElement(name = "ProductGroups")
    protected List<ProductGroups> productGroups;

    /**
     * Gets the value of the productInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductInfo }
     * 
     * 
     */
    public List<ProductInfo> getProductInfo() {
        if (productInfo == null) {
            productInfo = new ArrayList<ProductInfo>();
        }
        return this.productInfo;
    }

    /**
     * Gets the value of the priceFilter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priceFilter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriceFilter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceFilter }
     * 
     * 
     */
    public List<PriceFilter> getPriceFilter() {
        if (priceFilter == null) {
            priceFilter = new ArrayList<PriceFilter>();
        }
        return this.priceFilter;
    }

    /**
     * Gets the value of the brands property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the brands property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBrands().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Brands }
     * 
     * 
     */
    public List<Brands> getBrands() {
        if (brands == null) {
            brands = new ArrayList<Brands>();
        }
        return this.brands;
    }

    /**
     * Gets the value of the productGroups property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productGroups property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductGroups().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductGroups }
     * 
     * 
     */
    public List<ProductGroups> getProductGroups() {
        if (productGroups == null) {
            productGroups = new ArrayList<ProductGroups>();
        }
        return this.productGroups;
    }

}
