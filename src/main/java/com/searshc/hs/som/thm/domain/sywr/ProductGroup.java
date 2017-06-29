
package com.searshc.hs.som.thm.domain.sywr;

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
 *         &lt;element name="ProductGroupName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Include" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "productGroupName",
    "include"
})
@XmlRootElement(name = "ProductGroup")
public class ProductGroup {

    @XmlElement(name = "ProductGroupName", required = true)
    protected String productGroupName;
    @XmlElement(name = "Include", required = true)
    protected String include;

    /**
     * Gets the value of the productGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductGroupName() {
        return productGroupName;
    }

    /**
     * Sets the value of the productGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductGroupName(String value) {
        this.productGroupName = value;
    }

    /**
     * Gets the value of the include property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInclude() {
        return include;
    }

    /**
     * Sets the value of the include property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInclude(String value) {
        this.include = value;
    }

}
