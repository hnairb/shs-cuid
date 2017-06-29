
package com.searshc.hs.som.thm.domain.telluride;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Product complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Product">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HierarchyLevels" type="{http://www.epsilon.com/webservices/}HierarchyLevels" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *         &lt;element name="SKU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="UPC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="LineItemAmountTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="ItemPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="MapCompliance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Product", propOrder = {
    "hierarchyLevels",
    "sku",
    "upc",
    "lineItemAmountTypeCode",
    "itemPrice",
    "quantity",
    "mapCompliance"
})
public class Product {

    @XmlElement(name = "HierarchyLevels", nillable = true)
    protected List<HierarchyLevels> hierarchyLevels;
    @XmlElement(name = "SKU")
    protected String sku;
    @XmlElement(name = "UPC")
    protected String upc;
    @XmlElement(name = "LineItemAmountTypeCode")
    protected String lineItemAmountTypeCode;
    @XmlElement(name = "ItemPrice")
    protected String itemPrice;
    @XmlElement(name = "Quantity")
    protected String quantity;
    @XmlElement(name = "MapCompliance")
    protected String mapCompliance;

    /**
     * Gets the value of the hierarchyLevels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hierarchyLevels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHierarchyLevels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HierarchyLevels }
     * 
     * 
     */
    public List<HierarchyLevels> getHierarchyLevels() {
        if (hierarchyLevels == null) {
            hierarchyLevels = new ArrayList<HierarchyLevels>();
        }
        return this.hierarchyLevels;
    }

    /**
     * Gets the value of the sku property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSKU() {
        return sku;
    }

    /**
     * Sets the value of the sku property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSKU(String value) {
        this.sku = value;
    }

    /**
     * Gets the value of the upc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUPC() {
        return upc;
    }

    /**
     * Sets the value of the upc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUPC(String value) {
        this.upc = value;
    }

    /**
     * Gets the value of the lineItemAmountTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineItemAmountTypeCode() {
        return lineItemAmountTypeCode;
    }

    /**
     * Sets the value of the lineItemAmountTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineItemAmountTypeCode(String value) {
        this.lineItemAmountTypeCode = value;
    }

    /**
     * Gets the value of the itemPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemPrice() {
        return itemPrice;
    }

    /**
     * Sets the value of the itemPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemPrice(String value) {
        this.itemPrice = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantity(String value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the mapCompliance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMapCompliance() {
        return mapCompliance;
    }

    /**
     * Sets the value of the mapCompliance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMapCompliance(String value) {
        this.mapCompliance = value;
    }

}
