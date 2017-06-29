
package com.searshc.hs.psc.partorderdirectservice.ws.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchPartOrderVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchPartOrderVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customerFirstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="npnOrderNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="orderRefNo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="customerZip" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="partOrderDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="partOrderNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="customerLastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="customerPhone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="customerCity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="customerState" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="orderType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="customerAddr1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="extClientOrderNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchPartOrderVO", propOrder = {
    "customerFirstName",
    "npnOrderNo",
    "orderRefNo",
    "customerZip",
    "partOrderDate",
    "partOrderNo",
    "customerLastName",
    "customerPhone",
    "customerCity",
    "customerState",
    "orderType",
    "customerAddr1",
    "extClientOrderNo"
})
public class SearchPartOrderVO {

    @XmlElement(required = true, nillable = true)
    protected String customerFirstName;
    @XmlElement(required = true, nillable = true)
    protected String npnOrderNo;
    protected long orderRefNo;
    @XmlElement(required = true, nillable = true)
    protected String customerZip;
    @XmlElement(required = true, nillable = true)
    protected String partOrderDate;
    @XmlElement(required = true, nillable = true)
    protected String partOrderNo;
    @XmlElement(required = true, nillable = true)
    protected String customerLastName;
    @XmlElement(required = true, nillable = true)
    protected String customerPhone;
    @XmlElement(required = true, nillable = true)
    protected String customerCity;
    @XmlElement(required = true, nillable = true)
    protected String customerState;
    @XmlElement(required = true, nillable = true)
    protected String orderType;
    @XmlElement(required = true, nillable = true)
    protected String customerAddr1;
    protected String extClientOrderNo;

    /**
     * Gets the value of the customerFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerFirstName() {
        return customerFirstName;
    }

    /**
     * Sets the value of the customerFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerFirstName(String value) {
        this.customerFirstName = value;
    }

    /**
     * Gets the value of the npnOrderNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNpnOrderNo() {
        return npnOrderNo;
    }

    /**
     * Sets the value of the npnOrderNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNpnOrderNo(String value) {
        this.npnOrderNo = value;
    }

    /**
     * Gets the value of the orderRefNo property.
     * 
     */
    public long getOrderRefNo() {
        return orderRefNo;
    }

    /**
     * Sets the value of the orderRefNo property.
     * 
     */
    public void setOrderRefNo(long value) {
        this.orderRefNo = value;
    }

    /**
     * Gets the value of the customerZip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerZip() {
        return customerZip;
    }

    /**
     * Sets the value of the customerZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerZip(String value) {
        this.customerZip = value;
    }

    /**
     * Gets the value of the partOrderDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartOrderDate() {
        return partOrderDate;
    }

    /**
     * Sets the value of the partOrderDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartOrderDate(String value) {
        this.partOrderDate = value;
    }

    /**
     * Gets the value of the partOrderNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartOrderNo() {
        return partOrderNo;
    }

    /**
     * Sets the value of the partOrderNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartOrderNo(String value) {
        this.partOrderNo = value;
    }

    /**
     * Gets the value of the customerLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerLastName() {
        return customerLastName;
    }

    /**
     * Sets the value of the customerLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerLastName(String value) {
        this.customerLastName = value;
    }

    /**
     * Gets the value of the customerPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerPhone() {
        return customerPhone;
    }

    /**
     * Sets the value of the customerPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerPhone(String value) {
        this.customerPhone = value;
    }

    /**
     * Gets the value of the customerCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerCity() {
        return customerCity;
    }

    /**
     * Sets the value of the customerCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerCity(String value) {
        this.customerCity = value;
    }

    /**
     * Gets the value of the customerState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerState() {
        return customerState;
    }

    /**
     * Sets the value of the customerState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerState(String value) {
        this.customerState = value;
    }

    /**
     * Gets the value of the orderType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderType() {
        return orderType;
    }

    /**
     * Sets the value of the orderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderType(String value) {
        this.orderType = value;
    }

    /**
     * Gets the value of the customerAddr1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerAddr1() {
        return customerAddr1;
    }

    /**
     * Sets the value of the customerAddr1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerAddr1(String value) {
        this.customerAddr1 = value;
    }

    /**
     * Gets the value of the extClientOrderNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtClientOrderNo() {
        return extClientOrderNo;
    }

    /**
     * Sets the value of the extClientOrderNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtClientOrderNo(String value) {
        this.extClientOrderNo = value;
    }

}
