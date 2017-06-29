
package com.searshc.hs.psc.partorderdirectservice.ws.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PartOrderVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartOrderVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="totOrderAmt" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="orderRefNo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="npnOrderNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="partOrderDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="shippingTax" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="taxAmt" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="queueLockFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="partOrderNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="partsStatusCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="shippingAmt" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="lastUpdate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="partsQueueCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="taxRate" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="partsQueRsnCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="posFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="partsQueueDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartOrderVO", propOrder = {
    "totOrderAmt",
    "orderRefNo",
    "npnOrderNo",
    "partOrderDate",
    "shippingTax",
    "taxAmt",
    "queueLockFlag",
    "partOrderNo",
    "partsStatusCode",
    "shippingAmt",
    "lastUpdate",
    "partsQueueCode",
    "taxRate",
    "partsQueRsnCode",
    "posFlag",
    "partsQueueDate"
})
public class PartOrderVO {

    protected double totOrderAmt;
    protected long orderRefNo;
    @XmlElement(required = true, nillable = true)
    protected String npnOrderNo;
    @XmlElement(required = true, nillable = true)
    protected String partOrderDate;
    protected double shippingTax;
    protected double taxAmt;
    @XmlElement(required = true, nillable = true)
    protected String queueLockFlag;
    @XmlElement(required = true, nillable = true)
    protected String partOrderNo;
    @XmlElement(required = true, nillable = true)
    protected String partsStatusCode;
    protected double shippingAmt;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUpdate;
    @XmlElement(required = true, nillable = true)
    protected String partsQueueCode;
    protected double taxRate;
    @XmlElement(required = true, nillable = true)
    protected String partsQueRsnCode;
    @XmlElement(required = true, nillable = true)
    protected String posFlag;
    @XmlElement(required = true, nillable = true)
    protected String partsQueueDate;

    /**
     * Gets the value of the totOrderAmt property.
     * 
     */
    public double getTotOrderAmt() {
        return totOrderAmt;
    }

    /**
     * Sets the value of the totOrderAmt property.
     * 
     */
    public void setTotOrderAmt(double value) {
        this.totOrderAmt = value;
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
     * Gets the value of the shippingTax property.
     * 
     */
    public double getShippingTax() {
        return shippingTax;
    }

    /**
     * Sets the value of the shippingTax property.
     * 
     */
    public void setShippingTax(double value) {
        this.shippingTax = value;
    }

    /**
     * Gets the value of the taxAmt property.
     * 
     */
    public double getTaxAmt() {
        return taxAmt;
    }

    /**
     * Sets the value of the taxAmt property.
     * 
     */
    public void setTaxAmt(double value) {
        this.taxAmt = value;
    }

    /**
     * Gets the value of the queueLockFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueueLockFlag() {
        return queueLockFlag;
    }

    /**
     * Sets the value of the queueLockFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueueLockFlag(String value) {
        this.queueLockFlag = value;
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
     * Gets the value of the partsStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartsStatusCode() {
        return partsStatusCode;
    }

    /**
     * Sets the value of the partsStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartsStatusCode(String value) {
        this.partsStatusCode = value;
    }

    /**
     * Gets the value of the shippingAmt property.
     * 
     */
    public double getShippingAmt() {
        return shippingAmt;
    }

    /**
     * Sets the value of the shippingAmt property.
     * 
     */
    public void setShippingAmt(double value) {
        this.shippingAmt = value;
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
     * Gets the value of the partsQueueCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartsQueueCode() {
        return partsQueueCode;
    }

    /**
     * Sets the value of the partsQueueCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartsQueueCode(String value) {
        this.partsQueueCode = value;
    }

    /**
     * Gets the value of the taxRate property.
     * 
     */
    public double getTaxRate() {
        return taxRate;
    }

    /**
     * Sets the value of the taxRate property.
     * 
     */
    public void setTaxRate(double value) {
        this.taxRate = value;
    }

    /**
     * Gets the value of the partsQueRsnCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartsQueRsnCode() {
        return partsQueRsnCode;
    }

    /**
     * Sets the value of the partsQueRsnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartsQueRsnCode(String value) {
        this.partsQueRsnCode = value;
    }

    /**
     * Gets the value of the posFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosFlag() {
        return posFlag;
    }

    /**
     * Sets the value of the posFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosFlag(String value) {
        this.posFlag = value;
    }

    /**
     * Gets the value of the partsQueueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartsQueueDate() {
        return partsQueueDate;
    }

    /**
     * Sets the value of the partsQueueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartsQueueDate(String value) {
        this.partsQueueDate = value;
    }

}
