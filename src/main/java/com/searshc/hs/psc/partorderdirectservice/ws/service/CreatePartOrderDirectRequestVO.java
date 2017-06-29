
package com.searshc.hs.psc.partorderdirectservice.ws.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreatePartOrderDirectRequestVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreatePartOrderDirectRequestVO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://service.ws.partorderdirectservice.psc.hs.searshc.com}ABaseServiceRequestVO">
 *       &lt;sequence>
 *         &lt;element name="partsDirectStatusCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="orderReferenceVO" type="{http://service.ws.partorderdirectservice.psc.hs.searshc.com}OrderReferenceVO"/>
 *         &lt;element name="emalTemplateId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="autoOrderNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="serviceFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="orderMarkdownVO" type="{http://service.ws.partorderdirectservice.psc.hs.searshc.com}ArrayOf_tns5_PartOrderMarkdownVO"/>
 *         &lt;element name="autoReorderDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="taxAmt" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="specDiscAmt" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="partsDirectQueueReasonCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="promotionalMailFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="shippingAmt" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="partOrderLineVO" type="{http://service.ws.partorderdirectservice.psc.hs.searshc.com}ArrayOf_tns3_PartOrderLineVO"/>
 *         &lt;element name="emailParam" type="{http://service.ws.partorderdirectservice.psc.hs.searshc.com}ArrayOf_tns5_EmailParam"/>
 *         &lt;element name="partsDirectQueueCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="shippingTaxAmt" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="orderNameAddressVO" type="{http://service.ws.partorderdirectservice.psc.hs.searshc.com}ArrayOf_tns3_OrderNameAddressVO"/>
 *         &lt;element name="couponAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="posFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="totAmt" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="orderPaymentVO" type="{http://service.ws.partorderdirectservice.psc.hs.searshc.com}ArrayOf_tns3_OrderPaymentVO"/>
 *         &lt;element name="discAmt" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreatePartOrderDirectRequestVO", propOrder = {
    "partsDirectStatusCode",
    "orderReferenceVO",
    "emalTemplateId",
    "autoOrderNo",
    "serviceFlag",
    "orderMarkdownVO",
    "autoReorderDate",
    "taxAmt",
    "specDiscAmt",
    "partsDirectQueueReasonCode",
    "promotionalMailFlag",
    "shippingAmt",
    "partOrderLineVO",
    "emailParam",
    "partsDirectQueueCode",
    "shippingTaxAmt",
    "orderNameAddressVO",
    "couponAmount",
    "posFlag",
    "totAmt",
    "orderPaymentVO",
    "discAmt"
})
public class CreatePartOrderDirectRequestVO
    extends ABaseServiceRequestVO
{

    @XmlElement(required = true, nillable = true)
    protected String partsDirectStatusCode;
    @XmlElement(required = true, nillable = true)
    protected OrderReferenceVO orderReferenceVO;
    @XmlElement(required = true, nillable = true)
    protected String emalTemplateId;
    @XmlElement(required = true, nillable = true)
    protected String autoOrderNo;
    @XmlElement(required = true, nillable = true)
    protected String serviceFlag;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfTns5PartOrderMarkdownVO orderMarkdownVO;
    @XmlElement(required = true, nillable = true)
    protected String autoReorderDate;
    protected double taxAmt;
    protected double specDiscAmt;
    @XmlElement(required = true, nillable = true)
    protected String partsDirectQueueReasonCode;
    @XmlElement(required = true, nillable = true)
    protected String promotionalMailFlag;
    protected double shippingAmt;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfTns3PartOrderLineVO partOrderLineVO;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfTns5EmailParam emailParam;
    @XmlElement(required = true, nillable = true)
    protected String partsDirectQueueCode;
    protected double shippingTaxAmt;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfTns3OrderNameAddressVO orderNameAddressVO;
    protected double couponAmount;
    @XmlElement(required = true, nillable = true)
    protected String posFlag;
    protected double totAmt;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfTns3OrderPaymentVO orderPaymentVO;
    protected double discAmt;

    /**
     * Gets the value of the partsDirectStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartsDirectStatusCode() {
        return partsDirectStatusCode;
    }

    /**
     * Sets the value of the partsDirectStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartsDirectStatusCode(String value) {
        this.partsDirectStatusCode = value;
    }

    /**
     * Gets the value of the orderReferenceVO property.
     * 
     * @return
     *     possible object is
     *     {@link OrderReferenceVO }
     *     
     */
    public OrderReferenceVO getOrderReferenceVO() {
        return orderReferenceVO;
    }

    /**
     * Sets the value of the orderReferenceVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderReferenceVO }
     *     
     */
    public void setOrderReferenceVO(OrderReferenceVO value) {
        this.orderReferenceVO = value;
    }

    /**
     * Gets the value of the emalTemplateId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmalTemplateId() {
        return emalTemplateId;
    }

    /**
     * Sets the value of the emalTemplateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmalTemplateId(String value) {
        this.emalTemplateId = value;
    }

    /**
     * Gets the value of the autoOrderNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoOrderNo() {
        return autoOrderNo;
    }

    /**
     * Sets the value of the autoOrderNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoOrderNo(String value) {
        this.autoOrderNo = value;
    }

    /**
     * Gets the value of the serviceFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceFlag() {
        return serviceFlag;
    }

    /**
     * Sets the value of the serviceFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceFlag(String value) {
        this.serviceFlag = value;
    }

    /**
     * Gets the value of the orderMarkdownVO property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTns5PartOrderMarkdownVO }
     *     
     */
    public ArrayOfTns5PartOrderMarkdownVO getOrderMarkdownVO() {
        return orderMarkdownVO;
    }

    /**
     * Sets the value of the orderMarkdownVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTns5PartOrderMarkdownVO }
     *     
     */
    public void setOrderMarkdownVO(ArrayOfTns5PartOrderMarkdownVO value) {
        this.orderMarkdownVO = value;
    }

    /**
     * Gets the value of the autoReorderDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoReorderDate() {
        return autoReorderDate;
    }

    /**
     * Sets the value of the autoReorderDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoReorderDate(String value) {
        this.autoReorderDate = value;
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
     * Gets the value of the specDiscAmt property.
     * 
     */
    public double getSpecDiscAmt() {
        return specDiscAmt;
    }

    /**
     * Sets the value of the specDiscAmt property.
     * 
     */
    public void setSpecDiscAmt(double value) {
        this.specDiscAmt = value;
    }

    /**
     * Gets the value of the partsDirectQueueReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartsDirectQueueReasonCode() {
        return partsDirectQueueReasonCode;
    }

    /**
     * Sets the value of the partsDirectQueueReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartsDirectQueueReasonCode(String value) {
        this.partsDirectQueueReasonCode = value;
    }

    /**
     * Gets the value of the promotionalMailFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionalMailFlag() {
        return promotionalMailFlag;
    }

    /**
     * Sets the value of the promotionalMailFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionalMailFlag(String value) {
        this.promotionalMailFlag = value;
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
     * Gets the value of the partOrderLineVO property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTns3PartOrderLineVO }
     *     
     */
    public ArrayOfTns3PartOrderLineVO getPartOrderLineVO() {
        return partOrderLineVO;
    }

    /**
     * Sets the value of the partOrderLineVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTns3PartOrderLineVO }
     *     
     */
    public void setPartOrderLineVO(ArrayOfTns3PartOrderLineVO value) {
        this.partOrderLineVO = value;
    }

    /**
     * Gets the value of the emailParam property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTns5EmailParam }
     *     
     */
    public ArrayOfTns5EmailParam getEmailParam() {
        return emailParam;
    }

    /**
     * Sets the value of the emailParam property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTns5EmailParam }
     *     
     */
    public void setEmailParam(ArrayOfTns5EmailParam value) {
        this.emailParam = value;
    }

    /**
     * Gets the value of the partsDirectQueueCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartsDirectQueueCode() {
        return partsDirectQueueCode;
    }

    /**
     * Sets the value of the partsDirectQueueCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartsDirectQueueCode(String value) {
        this.partsDirectQueueCode = value;
    }

    /**
     * Gets the value of the shippingTaxAmt property.
     * 
     */
    public double getShippingTaxAmt() {
        return shippingTaxAmt;
    }

    /**
     * Sets the value of the shippingTaxAmt property.
     * 
     */
    public void setShippingTaxAmt(double value) {
        this.shippingTaxAmt = value;
    }

    /**
     * Gets the value of the orderNameAddressVO property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTns3OrderNameAddressVO }
     *     
     */
    public ArrayOfTns3OrderNameAddressVO getOrderNameAddressVO() {
        return orderNameAddressVO;
    }

    /**
     * Sets the value of the orderNameAddressVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTns3OrderNameAddressVO }
     *     
     */
    public void setOrderNameAddressVO(ArrayOfTns3OrderNameAddressVO value) {
        this.orderNameAddressVO = value;
    }

    /**
     * Gets the value of the couponAmount property.
     * 
     */
    public double getCouponAmount() {
        return couponAmount;
    }

    /**
     * Sets the value of the couponAmount property.
     * 
     */
    public void setCouponAmount(double value) {
        this.couponAmount = value;
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
     * Gets the value of the totAmt property.
     * 
     */
    public double getTotAmt() {
        return totAmt;
    }

    /**
     * Sets the value of the totAmt property.
     * 
     */
    public void setTotAmt(double value) {
        this.totAmt = value;
    }

    /**
     * Gets the value of the orderPaymentVO property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTns3OrderPaymentVO }
     *     
     */
    public ArrayOfTns3OrderPaymentVO getOrderPaymentVO() {
        return orderPaymentVO;
    }

    /**
     * Sets the value of the orderPaymentVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTns3OrderPaymentVO }
     *     
     */
    public void setOrderPaymentVO(ArrayOfTns3OrderPaymentVO value) {
        this.orderPaymentVO = value;
    }

    /**
     * Gets the value of the discAmt property.
     * 
     */
    public double getDiscAmt() {
        return discAmt;
    }

    /**
     * Sets the value of the discAmt property.
     * 
     */
    public void setDiscAmt(double value) {
        this.discAmt = value;
    }

}
