
package com.searshc.hs.psc.partorderdirectservice.ws.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PartOrderMarkdownVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartOrderMarkdownVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="discountPercent" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="markdownSeqNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="partOrderDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lastUpdate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="partOrderLineNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="couponNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="markdownAmt" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="markdownTypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "PartOrderMarkdownVO", propOrder = {
    "discountPercent",
    "markdownSeqNo",
    "partOrderDate",
    "lastUpdate",
    "partOrderLineNo",
    "couponNo",
    "markdownAmt",
    "markdownTypeCode",
    "partOrderNo"
})
public class PartOrderMarkdownVO {

    protected double discountPercent;
    protected int markdownSeqNo;
    @XmlElement(required = true, nillable = true)
    protected String partOrderDate;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUpdate;
    protected int partOrderLineNo;
    @XmlElement(required = true, nillable = true)
    protected String couponNo;
    protected double markdownAmt;
    @XmlElement(required = true, nillable = true)
    protected String markdownTypeCode;
    @XmlElement(required = true, nillable = true)
    protected String partOrderNo;

    /**
     * Gets the value of the discountPercent property.
     * 
     */
    public double getDiscountPercent() {
        return discountPercent;
    }

    /**
     * Sets the value of the discountPercent property.
     * 
     */
    public void setDiscountPercent(double value) {
        this.discountPercent = value;
    }

    /**
     * Gets the value of the markdownSeqNo property.
     * 
     */
    public int getMarkdownSeqNo() {
        return markdownSeqNo;
    }

    /**
     * Sets the value of the markdownSeqNo property.
     * 
     */
    public void setMarkdownSeqNo(int value) {
        this.markdownSeqNo = value;
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
     * Gets the value of the couponNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCouponNo() {
        return couponNo;
    }

    /**
     * Sets the value of the couponNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCouponNo(String value) {
        this.couponNo = value;
    }

    /**
     * Gets the value of the markdownAmt property.
     * 
     */
    public double getMarkdownAmt() {
        return markdownAmt;
    }

    /**
     * Sets the value of the markdownAmt property.
     * 
     */
    public void setMarkdownAmt(double value) {
        this.markdownAmt = value;
    }

    /**
     * Gets the value of the markdownTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarkdownTypeCode() {
        return markdownTypeCode;
    }

    /**
     * Sets the value of the markdownTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarkdownTypeCode(String value) {
        this.markdownTypeCode = value;
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
