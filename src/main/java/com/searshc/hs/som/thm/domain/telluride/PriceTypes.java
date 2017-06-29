
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
 *         &lt;element ref="{http://www.epsilon.com/webservices/}SearsPriceType" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}KmartPriceType" maxOccurs="unbounded"/>
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
    "searsPriceType",
    "kmartPriceType"
})
@XmlRootElement(name = "PriceTypes")
public class PriceTypes {

    @XmlElement(name = "SearsPriceType", required = true)
    protected List<SearsPriceType> searsPriceType;
    @XmlElement(name = "KmartPriceType", required = true)
    protected List<KmartPriceType> kmartPriceType;

    /**
     * Gets the value of the searsPriceType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searsPriceType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearsPriceType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearsPriceType }
     * 
     * 
     */
    public List<SearsPriceType> getSearsPriceType() {
        if (searsPriceType == null) {
            searsPriceType = new ArrayList<SearsPriceType>();
        }
        return this.searsPriceType;
    }

    /**
     * Gets the value of the kmartPriceType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kmartPriceType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKmartPriceType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KmartPriceType }
     * 
     * 
     */
    public List<KmartPriceType> getKmartPriceType() {
        if (kmartPriceType == null) {
            kmartPriceType = new ArrayList<KmartPriceType>();
        }
        return this.kmartPriceType;
    }

}
