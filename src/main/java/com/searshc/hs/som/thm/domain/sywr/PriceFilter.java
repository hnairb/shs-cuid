
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
 *         &lt;element ref="{http://www.epsilon.com/webservices/}UnitPriceBeforeDiscount" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}UnitPriceAfterDiscount" maxOccurs="unbounded" minOccurs="0"/>
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
    "unitPriceBeforeDiscount",
    "unitPriceAfterDiscount"
})
@XmlRootElement(name = "PriceFilter")
public class PriceFilter {

    @XmlElement(name = "UnitPriceBeforeDiscount")
    protected List<UnitPriceBeforeDiscount> unitPriceBeforeDiscount;
    @XmlElement(name = "UnitPriceAfterDiscount")
    protected List<UnitPriceAfterDiscount> unitPriceAfterDiscount;

    /**
     * Gets the value of the unitPriceBeforeDiscount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unitPriceBeforeDiscount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnitPriceBeforeDiscount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnitPriceBeforeDiscount }
     * 
     * 
     */
    public List<UnitPriceBeforeDiscount> getUnitPriceBeforeDiscount() {
        if (unitPriceBeforeDiscount == null) {
            unitPriceBeforeDiscount = new ArrayList<UnitPriceBeforeDiscount>();
        }
        return this.unitPriceBeforeDiscount;
    }

    /**
     * Gets the value of the unitPriceAfterDiscount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unitPriceAfterDiscount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnitPriceAfterDiscount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnitPriceAfterDiscount }
     * 
     * 
     */
    public List<UnitPriceAfterDiscount> getUnitPriceAfterDiscount() {
        if (unitPriceAfterDiscount == null) {
            unitPriceAfterDiscount = new ArrayList<UnitPriceAfterDiscount>();
        }
        return this.unitPriceAfterDiscount;
    }

}
