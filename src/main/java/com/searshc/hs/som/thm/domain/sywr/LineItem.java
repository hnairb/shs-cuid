
package com.searshc.hs.som.thm.domain.sywr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LineItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LineItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ItemType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Division" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ItemNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SKU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UPC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LineItemAmountTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CouponNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LineRequestorId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LineOrderStoreNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LinePickUpStoreNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DollarValuePreDisc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DollarValuePostDisc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PriceMatchAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PriceMatchBonusAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PointsRedeemed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DollarValueOfPointsRedeemed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RedemptionExclusionFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LayawayFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PickUpStoreNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PickupStoreFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OriginalLineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OriginalStoreNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OriginalRegisterNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OriginalTransactionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OriginalTransactionDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OriginalTransactionTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PostSalesAdjustmentAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NonMemberPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Coupons" type="{http://www.epsilon.com/webservices/}ArrayOfCoupon" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LineItem", propOrder = {
    "lineNumber",
    "itemType",
    "division",
    "itemNumber",
    "sku",
    "upc",
    "lineItemAmountTypeCode",
    "couponNumber",
    "lineRequestorId",
    "lineOrderStoreNumber",
    "linePickUpStoreNumber",
    "dollarValuePreDisc",
    "dollarValuePostDisc",
    "priceMatchAmount",
    "priceMatchBonusAmount",
    "quantity",
    "pointsRedeemed",
    "dollarValueOfPointsRedeemed",
    "redemptionExclusionFlag",
    "layawayFlag",
    "pickUpStoreNumber",
    "pickupStoreFormat",
    "originalLineNumber",
    "originalStoreNumber",
    "originalRegisterNumber",
    "originalTransactionNumber",
    "originalTransactionDate",
    "originalTransactionTime",
    "taxAmount",
    "postSalesAdjustmentAmount",
    "nonMemberPrice",
    "coupons"
})
public class LineItem {

    @XmlElement(name = "LineNumber")
    protected String lineNumber;
    @XmlElement(name = "ItemType")
    protected String itemType;
    @XmlElement(name = "Division")
    protected String division;
    @XmlElement(name = "ItemNumber")
    protected String itemNumber;
    @XmlElement(name = "SKU")
    protected String sku;
    @XmlElement(name = "UPC")
    protected String upc;
    @XmlElement(name = "LineItemAmountTypeCode")
    protected String lineItemAmountTypeCode;
    @XmlElement(name = "CouponNumber")
    protected String couponNumber;
    @XmlElement(name = "LineRequestorId")
    protected String lineRequestorId;
    @XmlElement(name = "LineOrderStoreNumber")
    protected String lineOrderStoreNumber;
    @XmlElement(name = "LinePickUpStoreNumber")
    protected String linePickUpStoreNumber;
    @XmlElement(name = "DollarValuePreDisc")
    protected String dollarValuePreDisc;
    @XmlElement(name = "DollarValuePostDisc")
    protected String dollarValuePostDisc;
    @XmlElement(name = "PriceMatchAmount")
    protected String priceMatchAmount;
    @XmlElement(name = "PriceMatchBonusAmount")
    protected String priceMatchBonusAmount;
    @XmlElement(name = "Quantity")
    protected String quantity;
    @XmlElement(name = "PointsRedeemed")
    protected String pointsRedeemed;
    @XmlElement(name = "DollarValueOfPointsRedeemed")
    protected String dollarValueOfPointsRedeemed;
    @XmlElement(name = "RedemptionExclusionFlag")
    protected String redemptionExclusionFlag;
    @XmlElement(name = "LayawayFlag")
    protected String layawayFlag;
    @XmlElement(name = "PickUpStoreNumber")
    protected String pickUpStoreNumber;
    @XmlElement(name = "PickupStoreFormat")
    protected String pickupStoreFormat;
    @XmlElement(name = "OriginalLineNumber")
    protected String originalLineNumber;
    @XmlElement(name = "OriginalStoreNumber")
    protected String originalStoreNumber;
    @XmlElement(name = "OriginalRegisterNumber")
    protected String originalRegisterNumber;
    @XmlElement(name = "OriginalTransactionNumber")
    protected String originalTransactionNumber;
    @XmlElement(name = "OriginalTransactionDate")
    protected String originalTransactionDate;
    @XmlElement(name = "OriginalTransactionTime")
    protected String originalTransactionTime;
    @XmlElement(name = "TaxAmount")
    protected String taxAmount;
    @XmlElement(name = "PostSalesAdjustmentAmount")
    protected String postSalesAdjustmentAmount;
    @XmlElement(name = "NonMemberPrice")
    protected String nonMemberPrice;
    @XmlElement(name = "Coupons")
    protected ArrayOfCoupon coupons;

    /**
     * Gets the value of the lineNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineNumber() {
        return lineNumber;
    }

    /**
     * Sets the value of the lineNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineNumber(String value) {
        this.lineNumber = value;
    }

    /**
     * Gets the value of the itemType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemType() {
        return itemType;
    }

    /**
     * Sets the value of the itemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemType(String value) {
        this.itemType = value;
    }

    /**
     * Gets the value of the division property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDivision() {
        return division;
    }

    /**
     * Sets the value of the division property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDivision(String value) {
        this.division = value;
    }

    /**
     * Gets the value of the itemNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemNumber() {
        return itemNumber;
    }

    /**
     * Sets the value of the itemNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemNumber(String value) {
        this.itemNumber = value;
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
     * Gets the value of the couponNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCouponNumber() {
        return couponNumber;
    }

    /**
     * Sets the value of the couponNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCouponNumber(String value) {
        this.couponNumber = value;
    }

    /**
     * Gets the value of the lineRequestorId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineRequestorId() {
        return lineRequestorId;
    }

    /**
     * Sets the value of the lineRequestorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineRequestorId(String value) {
        this.lineRequestorId = value;
    }

    /**
     * Gets the value of the lineOrderStoreNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineOrderStoreNumber() {
        return lineOrderStoreNumber;
    }

    /**
     * Sets the value of the lineOrderStoreNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineOrderStoreNumber(String value) {
        this.lineOrderStoreNumber = value;
    }

    /**
     * Gets the value of the linePickUpStoreNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinePickUpStoreNumber() {
        return linePickUpStoreNumber;
    }

    /**
     * Sets the value of the linePickUpStoreNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinePickUpStoreNumber(String value) {
        this.linePickUpStoreNumber = value;
    }

    /**
     * Gets the value of the dollarValuePreDisc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDollarValuePreDisc() {
        return dollarValuePreDisc;
    }

    /**
     * Sets the value of the dollarValuePreDisc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDollarValuePreDisc(String value) {
        this.dollarValuePreDisc = value;
    }

    /**
     * Gets the value of the dollarValuePostDisc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDollarValuePostDisc() {
        return dollarValuePostDisc;
    }

    /**
     * Sets the value of the dollarValuePostDisc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDollarValuePostDisc(String value) {
        this.dollarValuePostDisc = value;
    }

    /**
     * Gets the value of the priceMatchAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceMatchAmount() {
        return priceMatchAmount;
    }

    /**
     * Sets the value of the priceMatchAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceMatchAmount(String value) {
        this.priceMatchAmount = value;
    }

    /**
     * Gets the value of the priceMatchBonusAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceMatchBonusAmount() {
        return priceMatchBonusAmount;
    }

    /**
     * Sets the value of the priceMatchBonusAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceMatchBonusAmount(String value) {
        this.priceMatchBonusAmount = value;
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
     * Gets the value of the pointsRedeemed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPointsRedeemed() {
        return pointsRedeemed;
    }

    /**
     * Sets the value of the pointsRedeemed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPointsRedeemed(String value) {
        this.pointsRedeemed = value;
    }

    /**
     * Gets the value of the dollarValueOfPointsRedeemed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDollarValueOfPointsRedeemed() {
        return dollarValueOfPointsRedeemed;
    }

    /**
     * Sets the value of the dollarValueOfPointsRedeemed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDollarValueOfPointsRedeemed(String value) {
        this.dollarValueOfPointsRedeemed = value;
    }

    /**
     * Gets the value of the redemptionExclusionFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedemptionExclusionFlag() {
        return redemptionExclusionFlag;
    }

    /**
     * Sets the value of the redemptionExclusionFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedemptionExclusionFlag(String value) {
        this.redemptionExclusionFlag = value;
    }

    /**
     * Gets the value of the layawayFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLayawayFlag() {
        return layawayFlag;
    }

    /**
     * Sets the value of the layawayFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLayawayFlag(String value) {
        this.layawayFlag = value;
    }

    /**
     * Gets the value of the pickUpStoreNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickUpStoreNumber() {
        return pickUpStoreNumber;
    }

    /**
     * Sets the value of the pickUpStoreNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickUpStoreNumber(String value) {
        this.pickUpStoreNumber = value;
    }

    /**
     * Gets the value of the pickupStoreFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickupStoreFormat() {
        return pickupStoreFormat;
    }

    /**
     * Sets the value of the pickupStoreFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickupStoreFormat(String value) {
        this.pickupStoreFormat = value;
    }

    /**
     * Gets the value of the originalLineNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalLineNumber() {
        return originalLineNumber;
    }

    /**
     * Sets the value of the originalLineNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalLineNumber(String value) {
        this.originalLineNumber = value;
    }

    /**
     * Gets the value of the originalStoreNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalStoreNumber() {
        return originalStoreNumber;
    }

    /**
     * Sets the value of the originalStoreNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalStoreNumber(String value) {
        this.originalStoreNumber = value;
    }

    /**
     * Gets the value of the originalRegisterNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalRegisterNumber() {
        return originalRegisterNumber;
    }

    /**
     * Sets the value of the originalRegisterNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalRegisterNumber(String value) {
        this.originalRegisterNumber = value;
    }

    /**
     * Gets the value of the originalTransactionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalTransactionNumber() {
        return originalTransactionNumber;
    }

    /**
     * Sets the value of the originalTransactionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalTransactionNumber(String value) {
        this.originalTransactionNumber = value;
    }

    /**
     * Gets the value of the originalTransactionDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalTransactionDate() {
        return originalTransactionDate;
    }

    /**
     * Sets the value of the originalTransactionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalTransactionDate(String value) {
        this.originalTransactionDate = value;
    }

    /**
     * Gets the value of the originalTransactionTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalTransactionTime() {
        return originalTransactionTime;
    }

    /**
     * Sets the value of the originalTransactionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalTransactionTime(String value) {
        this.originalTransactionTime = value;
    }

    /**
     * Gets the value of the taxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxAmount() {
        return taxAmount;
    }

    /**
     * Sets the value of the taxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxAmount(String value) {
        this.taxAmount = value;
    }

    /**
     * Gets the value of the postSalesAdjustmentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostSalesAdjustmentAmount() {
        return postSalesAdjustmentAmount;
    }

    /**
     * Sets the value of the postSalesAdjustmentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostSalesAdjustmentAmount(String value) {
        this.postSalesAdjustmentAmount = value;
    }

    /**
     * Gets the value of the nonMemberPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonMemberPrice() {
        return nonMemberPrice;
    }

    /**
     * Sets the value of the nonMemberPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonMemberPrice(String value) {
        this.nonMemberPrice = value;
    }

    /**
     * Gets the value of the coupons property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCoupon }
     *     
     */
    public ArrayOfCoupon getCoupons() {
        return coupons;
    }

    /**
     * Sets the value of the coupons property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCoupon }
     *     
     */
    public void setCoupons(ArrayOfCoupon value) {
        this.coupons = value;
    }

}
