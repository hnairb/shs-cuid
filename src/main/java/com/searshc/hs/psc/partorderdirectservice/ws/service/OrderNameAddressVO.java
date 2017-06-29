
package com.searshc.hs.psc.partorderdirectservice.ws.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OrderNameAddressVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderNameAddressVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customerFirstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="orderRefNo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="custMiddleInitial" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="zipCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="custAddLine1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="customerLastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="orderAddressCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="zipPlus4Code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="stateCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="custAddLine2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cityName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lastUpdate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="orderPhone" type="{http://service.ws.partorderdirectservice.psc.hs.searshc.com}ArrayOf_tns3_OrderPhoneVO"/>
 *         &lt;element name="phoneCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderNameAddressVO", propOrder = {
    "customerFirstName",
    "orderRefNo",
    "custMiddleInitial",
    "zipCode",
    "custAddLine1",
    "customerLastName",
    "orderAddressCode",
    "zipPlus4Code",
    "stateCode",
    "custAddLine2",
    "cityName",
    "lastUpdate",
    "orderPhone",
    "phoneCount"
})
public class OrderNameAddressVO {

    @XmlElement(required = true, nillable = true)
    protected String customerFirstName;
    protected long orderRefNo;
    @XmlElement(required = true, nillable = true)
    protected String custMiddleInitial;
    @XmlElement(required = true, nillable = true)
    protected String zipCode;
    @XmlElement(required = true, nillable = true)
    protected String custAddLine1;
    @XmlElement(required = true, nillable = true)
    protected String customerLastName;
    @XmlElement(required = true, nillable = true)
    protected String orderAddressCode;
    @XmlElement(required = true, nillable = true)
    protected String zipPlus4Code;
    @XmlElement(required = true, nillable = true)
    protected String stateCode;
    @XmlElement(required = true, nillable = true)
    protected String custAddLine2;
    @XmlElement(required = true, nillable = true)
    protected String cityName;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUpdate;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfTns3OrderPhoneVO orderPhone;
    protected int phoneCount;

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
     * Gets the value of the custMiddleInitial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustMiddleInitial() {
        return custMiddleInitial;
    }

    /**
     * Sets the value of the custMiddleInitial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustMiddleInitial(String value) {
        this.custMiddleInitial = value;
    }

    /**
     * Gets the value of the zipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * Sets the value of the zipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipCode(String value) {
        this.zipCode = value;
    }

    /**
     * Gets the value of the custAddLine1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustAddLine1() {
        return custAddLine1;
    }

    /**
     * Sets the value of the custAddLine1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustAddLine1(String value) {
        this.custAddLine1 = value;
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
     * Gets the value of the zipPlus4Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipPlus4Code() {
        return zipPlus4Code;
    }

    /**
     * Sets the value of the zipPlus4Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipPlus4Code(String value) {
        this.zipPlus4Code = value;
    }

    /**
     * Gets the value of the stateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateCode() {
        return stateCode;
    }

    /**
     * Sets the value of the stateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateCode(String value) {
        this.stateCode = value;
    }

    /**
     * Gets the value of the custAddLine2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustAddLine2() {
        return custAddLine2;
    }

    /**
     * Sets the value of the custAddLine2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustAddLine2(String value) {
        this.custAddLine2 = value;
    }

    /**
     * Gets the value of the cityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * Sets the value of the cityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityName(String value) {
        this.cityName = value;
    }

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
     * Gets the value of the orderPhone property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTns3OrderPhoneVO }
     *     
     */
    public ArrayOfTns3OrderPhoneVO getOrderPhone() {
        return orderPhone;
    }

    /**
     * Sets the value of the orderPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTns3OrderPhoneVO }
     *     
     */
    public void setOrderPhone(ArrayOfTns3OrderPhoneVO value) {
        this.orderPhone = value;
    }

    /**
     * Gets the value of the phoneCount property.
     * 
     */
    public int getPhoneCount() {
        return phoneCount;
    }

    /**
     * Sets the value of the phoneCount property.
     * 
     */
    public void setPhoneCount(int value) {
        this.phoneCount = value;
    }

}
