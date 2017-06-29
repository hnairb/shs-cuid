
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
 *         &lt;element ref="{http://www.epsilon.com/webservices/}ProductLevel" maxOccurs="unbounded" minOccurs="0"/>
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
    "productLevel"
})
@XmlRootElement(name = "ProductLevels")
public class ProductLevels {

    @XmlElement(name = "ProductLevel")
    protected List<ProductLevel> productLevel;

    /**
     * Gets the value of the productLevel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productLevel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductLevel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductLevel }
     * 
     * 
     */
    public List<ProductLevel> getProductLevel() {
        if (productLevel == null) {
            productLevel = new ArrayList<ProductLevel>();
        }
        return this.productLevel;
    }

}
