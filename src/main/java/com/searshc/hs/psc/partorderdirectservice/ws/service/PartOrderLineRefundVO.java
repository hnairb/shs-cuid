
package com.searshc.hs.psc.partorderdirectservice.ws.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PartOrderLineRefundVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartOrderLineRefundVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="partOrderDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="refundSeqNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="partOrderLineNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="lastUpdate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="partOrderLineQty" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="partOrderLineAmt" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="partOrderNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartOrderLineRefundVO", propOrder = {
    "partOrderDate",
    "refundSeqNo",
    "partOrderLineNo",
    "lastUpdate",
    "partOrderLineQty",
    "partOrderLineAmt",
    "partOrderNo"
})
public class PartOrderLineRefundVO {

    @XmlElement(required = true, nillable = true)
    protected String partOrderDate;
    protected int refundSeqNo;
    protected int partOrderLineNo;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUpdate;
    protected int partOrderLineQty;
    protected double partOrderLineAmt;
    @XmlElement(required = true, nillable = true)
    protected String partOrderNo;

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
     * Gets the value of the refundSeqNo property.
     * 
     */
    public int getRefundSeqNo() {
        return refundSeqNo;
    }

    /**
     * Sets the value of the refundSeqNo property.
     * 
     */
    public void setRefundSeqNo(int value) {
        this.refundSeqNo = value;
    }

    /**
     * Gets the value of the partOrderLineNo property.
     * 
     */
    public int getPartOrderLineNo() {
        return partOrderLineNo;
    }

    /**
     * Sets the value of the partOrderLineNo property.
     * 
     */
    public void setPartOrderLineNo(int value) {
        this.partOrderLineNo = value;
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
     * Gets the value of the partOrderLineQty property.
     * 
     */
    public int getPartOrderLineQty() {
        return partOrderLineQty;
    }

    /**
     * Sets the value of the partOrderLineQty property.
     * 
     */
    public void setPartOrderLineQty(int value) {
        this.partOrderLineQty = value;
    }

    /**
     * Gets the value of the partOrderLineAmt property.
     * 
     */
    public double getPartOrderLineAmt() {
        return partOrderLineAmt;
    }

    /**
     * Sets the value of the partOrderLineAmt property.
     * 
     */
    public void setPartOrderLineAmt(double value) {
        this.partOrderLineAmt = value;
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

}
