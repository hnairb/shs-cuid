
package com.searshc.hs.psc.partorderdirectservice.ws.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PartOrderRefundVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartOrderRefundVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="refundTypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="orgSellUnit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="partOrderDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="refundSeqNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="orgSellAssociateNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="refundTimestamp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="markdownAmt" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="taxAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="authSupervisorDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="partOrderNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="authSupervisorID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="allowanceFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="partOrderLineRefund" type="{http://service.ws.partorderdirectservice.psc.hs.searshc.com}ArrayOf_tns3_PartOrderLineRefundVO"/>
 *         &lt;element name="shippingAmt" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="totalRefundAmt" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="refShipTaxFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lastUpdate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="promotionAmt" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="refundReasonCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="partOrderPaymentRefund" type="{http://service.ws.partorderdirectservice.psc.hs.searshc.com}ArrayOf_tns3_PartOrderPaymentRefundVO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartOrderRefundVO", propOrder = {
    "refundTypeCode",
    "orgSellUnit",
    "partOrderDate",
    "refundSeqNo",
    "orgSellAssociateNo",
    "refundTimestamp",
    "markdownAmt",
    "taxAmount",
    "authSupervisorDate",
    "partOrderNo",
    "authSupervisorID",
    "allowanceFlag",
    "partOrderLineRefund",
    "shippingAmt",
    "totalRefundAmt",
    "refShipTaxFlag",
    "lastUpdate",
    "promotionAmt",
    "refundReasonCode",
    "partOrderPaymentRefund"
})
public class PartOrderRefundVO {

    @XmlElement(required = true, nillable = true)
    protected String refundTypeCode;
    @XmlElement(required = true, nillable = true)
    protected String orgSellUnit;
    @XmlElement(required = true, nillable = true)
    protected String partOrderDate;
    protected int refundSeqNo;
    @XmlElement(required = true, nillable = true)
    protected String orgSellAssociateNo;
    @XmlElement(required = true, nillable = true)
    protected String refundTimestamp;
    protected double markdownAmt;
    protected double taxAmount;
    @XmlElement(required = true, nillable = true)
    protected String authSupervisorDate;
    @XmlElement(required = true, nillable = true)
    protected String partOrderNo;
    @XmlElement(required = true, nillable = true)
    protected String authSupervisorID;
    @XmlElement(required = true, nillable = true)
    protected String allowanceFlag;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfTns3PartOrderLineRefundVO partOrderLineRefund;
    protected double shippingAmt;
    protected double totalRefundAmt;
    @XmlElement(required = true, nillable = true)
    protected String refShipTaxFlag;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUpdate;
    protected double promotionAmt;
    @XmlElement(required = true, nillable = true)
    protected String refundReasonCode;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfTns3PartOrderPaymentRefundVO partOrderPaymentRefund;

    /**
     * Gets the value of the refundTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundTypeCode() {
        return refundTypeCode;
    }

    /**
     * Sets the value of the refundTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundTypeCode(String value) {
        this.refundTypeCode = value;
    }

    /**
     * Gets the value of the orgSellUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgSellUnit() {
        return orgSellUnit;
    }

    /**
     * Sets the value of the orgSellUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgSellUnit(String value) {
        this.orgSellUnit = value;
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
     * Gets the value of the orgSellAssociateNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgSellAssociateNo() {
        return orgSellAssociateNo;
    }

    /**
     * Sets the value of the orgSellAssociateNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgSellAssociateNo(String value) {
        this.orgSellAssociateNo = value;
    }

    /**
     * Gets the value of the refundTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundTimestamp() {
        return refundTimestamp;
    }

    /**
     * Sets the value of the refundTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundTimestamp(String value) {
        this.refundTimestamp = value;
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
     * Gets the value of the taxAmount property.
     * 
     */
    public double getTaxAmount() {
        return taxAmount;
    }

    /**
     * Sets the value of the taxAmount property.
     * 
     */
    public void setTaxAmount(double value) {
        this.taxAmount = value;
    }

    /**
     * Gets the value of the authSupervisorDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthSupervisorDate() {
        return authSupervisorDate;
    }

    /**
     * Sets the value of the authSupervisorDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthSupervisorDate(String value) {
        this.authSupervisorDate = value;
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
     * Gets the value of the authSupervisorID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthSupervisorID() {
        return authSupervisorID;
    }

    /**
     * Sets the value of the authSupervisorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthSupervisorID(String value) {
        this.authSupervisorID = value;
    }

    /**
     * Gets the value of the allowanceFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowanceFlag() {
        return allowanceFlag;
    }

    /**
     * Sets the value of the allowanceFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowanceFlag(String value) {
        this.allowanceFlag = value;
    }

    /**
     * Gets the value of the partOrderLineRefund property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTns3PartOrderLineRefundVO }
     *     
     */
    public ArrayOfTns3PartOrderLineRefundVO getPartOrderLineRefund() {
        return partOrderLineRefund;
    }

    /**
     * Sets the value of the partOrderLineRefund property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTns3PartOrderLineRefundVO }
     *     
     */
    public void setPartOrderLineRefund(ArrayOfTns3PartOrderLineRefundVO value) {
        this.partOrderLineRefund = value;
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
     * Gets the value of the totalRefundAmt property.
     * 
     */
    public double getTotalRefundAmt() {
        return totalRefundAmt;
    }

    /**
     * Sets the value of the totalRefundAmt property.
     * 
     */
    public void setTotalRefundAmt(double value) {
        this.totalRefundAmt = value;
    }

    /**
     * Gets the value of the refShipTaxFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefShipTaxFlag() {
        return refShipTaxFlag;
    }

    /**
     * Sets the value of the refShipTaxFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefShipTaxFlag(String value) {
        this.refShipTaxFlag = value;
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
     * Gets the value of the promotionAmt property.
     * 
     */
    public double getPromotionAmt() {
        return promotionAmt;
    }

    /**
     * Sets the value of the promotionAmt property.
     * 
     */
    public void setPromotionAmt(double value) {
        this.promotionAmt = value;
    }

    /**
     * Gets the value of the refundReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundReasonCode() {
        return refundReasonCode;
    }

    /**
     * Sets the value of the refundReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundReasonCode(String value) {
        this.refundReasonCode = value;
    }

    /**
     * Gets the value of the partOrderPaymentRefund property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTns3PartOrderPaymentRefundVO }
     *     
     */
    public ArrayOfTns3PartOrderPaymentRefundVO getPartOrderPaymentRefund() {
        return partOrderPaymentRefund;
    }

    /**
     * Sets the value of the partOrderPaymentRefund property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTns3PartOrderPaymentRefundVO }
     *     
     */
    public void setPartOrderPaymentRefund(ArrayOfTns3PartOrderPaymentRefundVO value) {
        this.partOrderPaymentRefund = value;
    }

}
