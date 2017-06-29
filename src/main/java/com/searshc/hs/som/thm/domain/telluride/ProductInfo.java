
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
 *         &lt;element ref="{http://www.epsilon.com/webservices/}ProductLevelSets" minOccurs="0"/>
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
    "productLevelSets"
})
@XmlRootElement(name = "ProductInfo")
public class ProductInfo {

    @XmlElement(name = "ProductLevelSets")
    protected ProductLevelSets productLevelSets;

    /**
     * Gets the value of the productLevelSets property.
     * 
     * @return
     *     possible object is
     *     {@link ProductLevelSets }
     *     
     */
    public ProductLevelSets getProductLevelSets() {
        return productLevelSets;
    }

    /**
     * Sets the value of the productLevelSets property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductLevelSets }
     *     
     */
    public void setProductLevelSets(ProductLevelSets value) {
        this.productLevelSets = value;
    }

}
