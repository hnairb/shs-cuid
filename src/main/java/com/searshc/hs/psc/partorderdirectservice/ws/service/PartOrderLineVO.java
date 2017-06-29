
package com.searshc.hs.psc.partorderdirectservice.ws.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PartOrderLineVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartOrderLineVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="partOrderMarkdownVO" type="{http://service.ws.partorderdirectservice.psc.hs.searshc.com}ArrayOf_tns5_PartOrderMarkdownVO"/>
 *         &lt;element name="sourceRouteCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="offerTypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="markdownTotAmt" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="lineTaxAmt" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="partDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bonusEarnAmt" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="autoReorder" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="partDivisionNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nonRetblePartFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nextFullfillment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="partOrderLineNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="orderLinePriceAmt" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="estimateArrDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="partNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="orderLineTotAmt" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="partOrderDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="orderLineCostAmt" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="sourceIDCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sourceOrderNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="itemMarkDownCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="partOrderNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="frequency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lastUpdate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="partOrderLineQty" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="partPriceListSrcNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartOrderLineVO", propOrder = {
    "partOrderMarkdownVO",
    "sourceRouteCode",
    "offerTypeCode",
    "markdownTotAmt",
    "lineTaxAmt",
    "partDesc",
    "bonusEarnAmt",
    "autoReorder",
    "partDivisionNo",
    "nonRetblePartFlag",
    "nextFullfillment",
    "partOrderLineNo",
    "orderLinePriceAmt",
    "estimateArrDate",
    "partNo",
    "orderLineTotAmt",
    "partOrderDate",
    "orderLineCostAmt",
    "sourceIDCode",
    "sourceOrderNo",
    "itemMarkDownCount",
    "partOrderNo",
    "frequency",
    "lastUpdate",
    "partOrderLineQty",
    "partPriceListSrcNo"
})
public class PartOrderLineVO {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfTns5PartOrderMarkdownVO partOrderMarkdownVO;
    @XmlElement(required = true, nillable = true)
    protected String sourceRouteCode;
    @XmlElement(required = true, nillable = true)
    protected String offerTypeCode;
    protected double markdownTotAmt;
    protected double lineTaxAmt;
    @XmlElement(required = true, nillable = true)
    protected String partDesc;
    protected double bonusEarnAmt;
    @XmlElement(required = true, nillable = true)
    protected String autoReorder;
    @XmlElement(required = true, nillable = true)
    protected String partDivisionNo;
    @XmlElement(required = true, nillable = true)
    protected String nonRetblePartFlag;
    @XmlElement(required = true, nillable = true)
    protected String nextFullfillment;
    protected int partOrderLineNo;
    protected double orderLinePriceAmt;
    @XmlElement(required = true, nillable = true)
    protected String estimateArrDate;
    @XmlElement(required = true, nillable = true)
    protected String partNo;
    protected double orderLineTotAmt;
    @XmlElement(required = true, nillable = true)
    protected String partOrderDate;
    protected double orderLineCostAmt;
    @XmlElement(required = true, nillable = true)
    protected String sourceIDCode;
    @XmlElement(required = true, nillable = true)
    protected String sourceOrderNo;
    protected int itemMarkDownCount;
    @XmlElement(required = true, nillable = true)
    protected String partOrderNo;
    @XmlElement(required = true, nillable = true)
    protected String frequency;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUpdate;
    protected int partOrderLineQty;
    @XmlElement(required = true, nillable = true)
    protected String partPriceListSrcNo;

    /**
     * Gets the value of the partOrderMarkdownVO property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTns5PartOrderMarkdownVO }
     *     
     */
    public ArrayOfTns5PartOrderMarkdownVO getPartOrderMarkdownVO() {
        return partOrderMarkdownVO;
    }

    /**
     * Sets the value of the partOrderMarkdownVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTns5PartOrderMarkdownVO }
     *     
     */
    public void setPartOrderMarkdownVO(ArrayOfTns5PartOrderMarkdownVO value) {
        this.partOrderMarkdownVO = value;
    }

    /**
     * Gets the value of the sourceRouteCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceRouteCode() {
        return sourceRouteCode;
    }

    /**
     * Sets the value of the sourceRouteCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceRouteCode(String value) {
        this.sourceRouteCode = value;
    }

    /**
     * Gets the value of the offerTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferTypeCode() {
        return offerTypeCode;
    }

    /**
     * Sets the value of the offerTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferTypeCode(String value) {
        this.offerTypeCode = value;
    }

    /**
     * Gets the value of the markdownTotAmt property.
     * 
     */
    public double getMarkdownTotAmt() {
        return markdownTotAmt;
    }

    /**
     * Sets the value of the markdownTotAmt property.
     * 
     */
    public void setMarkdownTotAmt(double value) {
        this.markdownTotAmt = value;
    }

    /**
     * Gets the value of the lineTaxAmt property.
     * 
     */
    public double getLineTaxAmt() {
        return lineTaxAmt;
    }

    /**
     * Sets the value of the lineTaxAmt property.
     * 
     */
    public void setLineTaxAmt(double value) {
        this.lineTaxAmt = value;
    }

    /**
     * Gets the value of the partDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartDesc() {
        return partDesc;
    }

    /**
     * Sets the value of the partDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartDesc(String value) {
        this.partDesc = value;
    }

    /**
     * Gets the value of the bonusEarnAmt property.
     * 
     */
    public double getBonusEarnAmt() {
        return bonusEarnAmt;
    }

    /**
     * Sets the value of the bonusEarnAmt property.
     * 
     */
    public void setBonusEarnAmt(double value) {
        this.bonusEarnAmt = value;
    }

    /**
     * Gets the value of the autoReorder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoReorder() {
        return autoReorder;
    }

    /**
     * Sets the value of the autoReorder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoReorder(String value) {
        this.autoReorder = value;
    }

    /**
     * Gets the value of the partDivisionNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartDivisionNo() {
        return partDivisionNo;
    }

    /**
     * Sets the value of the partDivisionNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartDivisionNo(String value) {
        this.partDivisionNo = value;
    }

    /**
     * Gets the value of the nonRetblePartFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonRetblePartFlag() {
        return nonRetblePartFlag;
    }

    /**
     * Sets the value of the nonRetblePartFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonRetblePartFlag(String value) {
        this.nonRetblePartFlag = value;
    }

    /**
     * Gets the value of the nextFullfillment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextFullfillment() {
        return nextFullfillment;
    }

    /**
     * Sets the value of the nextFullfillment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextFullfillment(String value) {
        this.nextFullfillment = value;
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
     * Gets the value of the orderLinePriceAmt property.
     * 
     */
    public double getOrderLinePriceAmt() {
        return orderLinePriceAmt;
    }

    /**
     * Sets the value of the orderLinePriceAmt property.
     * 
     */
    public void setOrderLinePriceAmt(double value) {
        this.orderLinePriceAmt = value;
    }

    /**
     * Gets the value of the estimateArrDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstimateArrDate() {
        return estimateArrDate;
    }

    /**
     * Sets the value of the estimateArrDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstimateArrDate(String value) {
        this.estimateArrDate = value;
    }

    /**
     * Gets the value of the partNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartNo() {
        return partNo;
    }

    /**
     * Sets the value of the partNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartNo(String value) {
        this.partNo = value;
    }

    /**
     * Gets the value of the orderLineTotAmt property.
     * 
     */
    public double getOrderLineTotAmt() {
        return orderLineTotAmt;
    }

    /**
     * Sets the value of the orderLineTotAmt property.
     * 
     */
    public void setOrderLineTotAmt(double value) {
        this.orderLineTotAmt = value;
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
     * Gets the value of the orderLineCostAmt property.
     * 
     */
    public double getOrderLineCostAmt() {
        return orderLineCostAmt;
    }

    /**
     * Sets the value of the orderLineCostAmt property.
     * 
     */
    public void setOrderLineCostAmt(double value) {
        this.orderLineCostAmt = value;
    }

    /**
     * Gets the value of the sourceIDCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceIDCode() {
        return sourceIDCode;
    }

    /**
     * Sets the value of the sourceIDCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceIDCode(String value) {
        this.sourceIDCode = value;
    }

    /**
     * Gets the value of the sourceOrderNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceOrderNo() {
        return sourceOrderNo;
    }

    /**
     * Sets the value of the sourceOrderNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceOrderNo(String value) {
        this.sourceOrderNo = value;
    }

    /**
     * Gets the value of the itemMarkDownCount property.
     * 
     */
    public int getItemMarkDownCount() {
        return itemMarkDownCount;
    }

    /**
     * Sets the value of the itemMarkDownCount property.
     * 
     */
    public void setItemMarkDownCount(int value) {
        this.itemMarkDownCount = value;
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
     * Gets the value of the frequency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrequency() {
        return frequency;
    }

    /**
     * Sets the value of the frequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrequency(String value) {
        this.frequency = value;
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
     * Gets the value of the partPriceListSrcNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartPriceListSrcNo() {
        return partPriceListSrcNo;
    }

    /**
     * Sets the value of the partPriceListSrcNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartPriceListSrcNo(String value) {
        this.partPriceListSrcNo = value;
    }

}
