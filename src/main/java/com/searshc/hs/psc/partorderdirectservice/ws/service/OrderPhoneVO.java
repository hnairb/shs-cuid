
package com.searshc.hs.psc.partorderdirectservice.ws.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OrderPhoneVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderPhoneVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lastUpdate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="orderPhoneCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="orderAddressCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="orderRefNo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="customerPhoneNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderPhoneVO", propOrder = {
    "lastUpdate",
    "orderPhoneCode",
    "orderAddressCode",
    "orderRefNo",
    "customerPhoneNo"
})
public class OrderPhoneVO {

    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUpdate;
    @XmlElement(required = true, nillable = true)
    protected String orderPhoneCode;
    @XmlElement(required = true, nillable = true)
    protected String orderAddressCode;
    protected long orderRefNo;
    @XmlElement(required = true, nillable = true)
    protected String customerPhoneNo;

    /**
     * Gets the value of the lastUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdate() {
        return lastUpdate;
    }

    /**
     * Sets the value of the lastUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdate(XMLGregorianCalendar value) {
        this.lastUpdate = value;
    }

    /**
     * Gets the value of the orderPhoneCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderPhoneCode() {
        return orderPhoneCode;
    }

    /**
     * Sets the value of the orderPhoneCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderPhoneCode(String value) {
        this.orderPhoneCode = value;
    }

    /**
     * Gets the value of the orderAddressCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderAddressCode() {
        return orderAddressCode;
    }

    /**
     * Sets the value of the orderAddressCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderAddressCode(String value) {
        this.orderAddressCode = value;
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
     * Gets the value of the customerPhoneNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerPhoneNo() {
        return customerPhoneNo;
    }

    /**
     * Sets the value of the customerPhoneNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerPhoneNo(String value) {
        this.customerPhoneNo = value;
    }

}
