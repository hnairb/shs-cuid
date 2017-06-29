
package com.searshc.hs.psc.partorderdirectservice.ws.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderReferenceVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderReferenceVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sourceOfOrder" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="purchaserMidInl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="jurisdictCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="commCustFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sllUnitNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="commId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="eml_ad" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="purchaserLastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="busCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="parentCommId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="totalPromotionAmt" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="authSupervisorDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sllGateNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="geoCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="taxCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="purchaseOrderNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tpcPartOrderNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="shipOptionCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="purchaserFirstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sllEmpidNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="npnOrderNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sywrMemberId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="acctMgrId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="modelNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="empidTaxNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="authSupervisorID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="shipOverrideFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="customerNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="taxExemptNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="productTypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tpcPartOrderDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="orderType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sywrUsePoints" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="sywrUseDollars" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="extClientOrderNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="extClientOrderDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="extClientOrderItemAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="extClientOrderPaymentAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="extClientTaxAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="extClientShippingAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="salesCheckNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lstUpdIdCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="thirdPartyStoreNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="invoiceTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="custId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="custIdType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pickupUnitNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="notifyFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderReferenceVO", propOrder = {
    "sourceOfOrder",
    "purchaserMidInl",
    "jurisdictCode",
    "commCustFlag",
    "sllUnitNo",
    "commId",
    "emlAd",
    "purchaserLastName",
    "busCode",
    "parentCommId",
    "totalPromotionAmt",
    "authSupervisorDate",
    "sllGateNo",
    "geoCode",
    "taxCountryCode",
    "purchaseOrderNo",
    "tpcPartOrderNumber",
    "shipOptionCode",
    "purchaserFirstName",
    "sllEmpidNo",
    "npnOrderNo",
    "sywrMemberId",
    "acctMgrId",
    "modelNo",
    "empidTaxNo",
    "authSupervisorID",
    "shipOverrideFlag",
    "customerNo",
    "taxExemptNo",
    "productTypeCode",
    "tpcPartOrderDate",
    "orderType",
    "sywrUsePoints",
    "sywrUseDollars",
    "extClientOrderNo",
    "extClientOrderDate",
    "extClientOrderItemAmount",
    "extClientOrderPaymentAmount",
    "extClientTaxAmount",
    "extClientShippingAmount",
    "salesCheckNo",
    "lstUpdIdCd",
    "thirdPartyStoreNo",
    "invoiceTypeCode",
    "custId",
    "custIdType",
    "pickupUnitNo",
    "notifyFlag"
})
public class OrderReferenceVO {

    @XmlElement(required = true, nillable = true)
    protected String sourceOfOrder;
    @XmlElement(required = true, nillable = true)
    protected String purchaserMidInl;
    @XmlElement(required = true, nillable = true)
    protected String jurisdictCode;
    @XmlElement(required = true, nillable = true)
    protected String commCustFlag;
    @XmlElement(required = true, nillable = true)
    protected String sllUnitNo;
    @XmlElement(required = true, nillable = true)
    protected String commId;
    @XmlElement(name = "eml_ad", required = true, nillable = true)
    protected String emlAd;
    @XmlElement(required = true, nillable = true)
    protected String purchaserLastName;
    @XmlElement(required = true, nillable = true)
    protected String busCode;
    @XmlElement(required = true, nillable = true)
    protected String parentCommId;
    protected double totalPromotionAmt;
    @XmlElement(required = true, nillable = true)
    protected String authSupervisorDate;
    @XmlElement(required = true, nillable = true)
    protected String sllGateNo;
    @XmlElement(required = true, nillable = true)
    protected String geoCode;
    @XmlElement(required = true, nillable = true)
    protected String taxCountryCode;
    @XmlElement(required = true, nillable = true)
    protected String purchaseOrderNo;
    @XmlElement(required = true, nillable = true)
    protected String tpcPartOrderNumber;
    @XmlElement(required = true, nillable = true)
    protected String shipOptionCode;
    @XmlElement(required = true, nillable = true)
    protected String purchaserFirstName;
    @XmlElement(required = true, nillable = true)
    protected String sllEmpidNo;
    @XmlElement(required = true, nillable = true)
    protected String npnOrderNo;
    @XmlElement(required = true, nillable = true)
    protected String sywrMemberId;
    @XmlElement(required = true, nillable = true)
    protected String acctMgrId;
    @XmlElement(required = true, nillable = true)
    protected String modelNo;
    @XmlElement(required = true, nillable = true)
    protected String empidTaxNo;
    @XmlElement(required = true, nillable = true)
    protected String authSupervisorID;
    @XmlElement(required = true, nillable = true)
    protected String shipOverrideFlag;
    protected int customerNo;
    @XmlElement(required = true, nillable = true)
    protected String taxExemptNo;
    @XmlElement(required = true, nillable = true)
    protected String productTypeCode;
    @XmlElement(required = true, nillable = true)
    protected String tpcPartOrderDate;
    protected String orderType;
    protected Long sywrUsePoints;
    protected Double sywrUseDollars;
    protected String extClientOrderNo;
    protected String extClientOrderDate;
    protected double extClientOrderItemAmount;
    protected double extClientOrderPaymentAmount;
    protected double extClientTaxAmount;
    protected double extClientShippingAmount;
    protected String salesCheckNo;
    protected String lstUpdIdCd;
    protected String thirdPartyStoreNo;
    protected String invoiceTypeCode;
    protected String custId;
    protected String custIdType;
    protected String pickupUnitNo;
    protected String notifyFlag;

    /**
     * Gets the value of the sourceOfOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceOfOrder() {
        return sourceOfOrder;
    }

    /**
     * Sets the value of the sourceOfOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceOfOrder(String value) {
        this.sourceOfOrder = value;
    }

    /**
     * Gets the value of the purchaserMidInl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaserMidInl() {
        return purchaserMidInl;
    }

    /**
     * Sets the value of the purchaserMidInl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaserMidInl(String value) {
        this.purchaserMidInl = value;
    }

    /**
     * Gets the value of the jurisdictCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJurisdictCode() {
        return jurisdictCode;
    }

    /**
     * Sets the value of the jurisdictCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJurisdictCode(String value) {
        this.jurisdictCode = value;
    }

    /**
     * Gets the value of the commCustFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommCustFlag() {
        return commCustFlag;
    }

    /**
     * Sets the value of the commCustFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommCustFlag(String value) {
        this.commCustFlag = value;
    }

    /**
     * Gets the value of the sllUnitNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSllUnitNo() {
        return sllUnitNo;
    }

    /**
     * Sets the value of the sllUnitNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSllUnitNo(String value) {
        this.sllUnitNo = value;
    }

    /**
     * Gets the value of the commId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommId() {
        return commId;
    }

    /**
     * Sets the value of the commId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommId(String value) {
        this.commId = value;
    }

    /**
     * Gets the value of the emlAd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmlAd() {
        return emlAd;
    }

    /**
     * Sets the value of the emlAd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmlAd(String value) {
        this.emlAd = value;
    }

    /**
     * Gets the value of the purchaserLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaserLastName() {
        return purchaserLastName;
    }

    /**
     * Sets the value of the purchaserLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaserLastName(String value) {
        this.purchaserLastName = value;
    }

    /**
     * Gets the value of the busCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusCode() {
        return busCode;
    }

    /**
     * Sets the value of the busCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusCode(String value) {
        this.busCode = value;
    }

    /**
     * Gets the value of the parentCommId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentCommId() {
        return parentCommId;
    }

    /**
     * Sets the value of the parentCommId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentCommId(String value) {
        this.parentCommId = value;
    }

    /**
     * Gets the value of the totalPromotionAmt property.
     * 
     */
    public double getTotalPromotionAmt() {
        return totalPromotionAmt;
    }

    /**
     * Sets the value of the totalPromotionAmt property.
     * 
     */
    public void setTotalPromotionAmt(double value) {
        this.totalPromotionAmt = value;
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
     * Gets the value of the sllGateNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSllGateNo() {
        return sllGateNo;
    }

    /**
     * Sets the value of the sllGateNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSllGateNo(String value) {
        this.sllGateNo = value;
    }

    /**
     * Gets the value of the geoCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeoCode() {
        return geoCode;
    }

    /**
     * Sets the value of the geoCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeoCode(String value) {
        this.geoCode = value;
    }

    /**
     * Gets the value of the taxCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxCountryCode() {
        return taxCountryCode;
    }

    /**
     * Sets the value of the taxCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxCountryCode(String value) {
        this.taxCountryCode = value;
    }

    /**
     * Gets the value of the purchaseOrderNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseOrderNo() {
        return purchaseOrderNo;
    }

    /**
     * Sets the value of the purchaseOrderNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseOrderNo(String value) {
        this.purchaseOrderNo = value;
    }

    /**
     * Gets the value of the tpcPartOrderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpcPartOrderNumber() {
        return tpcPartOrderNumber;
    }

    /**
     * Sets the value of the tpcPartOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpcPartOrderNumber(String value) {
        this.tpcPartOrderNumber = value;
    }

    /**
     * Gets the value of the shipOptionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipOptionCode() {
        return shipOptionCode;
    }

    /**
     * Sets the value of the shipOptionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipOptionCode(String value) {
        this.shipOptionCode = value;
    }

    /**
     * Gets the value of the purchaserFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaserFirstName() {
        return purchaserFirstName;
    }

    /**
     * Sets the value of the purchaserFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaserFirstName(String value) {
        this.purchaserFirstName = value;
    }

    /**
     * Gets the value of the sllEmpidNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSllEmpidNo() {
        return sllEmpidNo;
    }

    /**
     * Sets the value of the sllEmpidNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSllEmpidNo(String value) {
        this.sllEmpidNo = value;
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
     * Gets the value of the sywrMemberId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSywrMemberId() {
        return sywrMemberId;
    }

    /**
     * Sets the value of the sywrMemberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSywrMemberId(String value) {
        this.sywrMemberId = value;
    }

    /**
     * Gets the value of the acctMgrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctMgrId() {
        return acctMgrId;
    }

    /**
     * Sets the value of the acctMgrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctMgrId(String value) {
        this.acctMgrId = value;
    }

    /**
     * Gets the value of the modelNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelNo() {
        return modelNo;
    }

    /**
     * Sets the value of the modelNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelNo(String value) {
        this.modelNo = value;
    }

    /**
     * Gets the value of the empidTaxNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpidTaxNo() {
        return empidTaxNo;
    }

    /**
     * Sets the value of the empidTaxNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpidTaxNo(String value) {
        this.empidTaxNo = value;
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
     * Gets the value of the shipOverrideFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipOverrideFlag() {
        return shipOverrideFlag;
    }

    /**
     * Sets the value of the shipOverrideFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipOverrideFlag(String value) {
        this.shipOverrideFlag = value;
    }

    /**
     * Gets the value of the customerNo property.
     * 
     */
    public int getCustomerNo() {
        return customerNo;
    }

    /**
     * Sets the value of the customerNo property.
     * 
     */
    public void setCustomerNo(int value) {
        this.customerNo = value;
    }

    /**
     * Gets the value of the taxExemptNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxExemptNo() {
        return taxExemptNo;
    }

    /**
     * Sets the value of the taxExemptNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxExemptNo(String value) {
        this.taxExemptNo = value;
    }

    /**
     * Gets the value of the productTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductTypeCode() {
        return productTypeCode;
    }

    /**
     * Sets the value of the productTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductTypeCode(String value) {
        this.productTypeCode = value;
    }

    /**
     * Gets the value of the tpcPartOrderDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpcPartOrderDate() {
        return tpcPartOrderDate;
    }

    /**
     * Sets the value of the tpcPartOrderDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpcPartOrderDate(String value) {
        this.tpcPartOrderDate = value;
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
     * Gets the value of the sywrUsePoints property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSywrUsePoints() {
        return sywrUsePoints;
    }

    /**
     * Sets the value of the sywrUsePoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSywrUsePoints(Long value) {
        this.sywrUsePoints = value;
    }

    /**
     * Gets the value of the sywrUseDollars property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSywrUseDollars() {
        return sywrUseDollars;
    }

    /**
     * Sets the value of the sywrUseDollars property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSywrUseDollars(Double value) {
        this.sywrUseDollars = value;
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

    /**
     * Gets the value of the extClientOrderDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtClientOrderDate() {
        return extClientOrderDate;
    }

    /**
     * Sets the value of the extClientOrderDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtClientOrderDate(String value) {
        this.extClientOrderDate = value;
    }

    /**
     * Gets the value of the extClientOrderItemAmount property.
     * 
     */
    public double getExtClientOrderItemAmount() {
        return extClientOrderItemAmount;
    }

    /**
     * Sets the value of the extClientOrderItemAmount property.
     * 
     */
    public void setExtClientOrderItemAmount(double value) {
        this.extClientOrderItemAmount = value;
    }

    /**
     * Gets the value of the extClientOrderPaymentAmount property.
     * 
     */
    public double getExtClientOrderPaymentAmount() {
        return extClientOrderPaymentAmount;
    }

    /**
     * Sets the value of the extClientOrderPaymentAmount property.
     * 
     */
    public void setExtClientOrderPaymentAmount(double value) {
        this.extClientOrderPaymentAmount = value;
    }

    /**
     * Gets the value of the extClientTaxAmount property.
     * 
     */
    public double getExtClientTaxAmount() {
        return extClientTaxAmount;
    }

    /**
     * Sets the value of the extClientTaxAmount property.
     * 
     */
    public void setExtClientTaxAmount(double value) {
        this.extClientTaxAmount = value;
    }

    /**
     * Gets the value of the extClientShippingAmount property.
     * 
     */
    public double getExtClientShippingAmount() {
        return extClientShippingAmount;
    }

    /**
     * Sets the value of the extClientShippingAmount property.
     * 
     */
    public void setExtClientShippingAmount(double value) {
        this.extClientShippingAmount = value;
    }

    /**
     * Gets the value of the salesCheckNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesCheckNo() {
        return salesCheckNo;
    }

    /**
     * Sets the value of the salesCheckNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesCheckNo(String value) {
        this.salesCheckNo = value;
    }

    /**
     * Gets the value of the lstUpdIdCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLstUpdIdCd() {
        return lstUpdIdCd;
    }

    /**
     * Sets the value of the lstUpdIdCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLstUpdIdCd(String value) {
        this.lstUpdIdCd = value;
    }

    /**
     * Gets the value of the thirdPartyStoreNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdPartyStoreNo() {
        return thirdPartyStoreNo;
    }

    /**
     * Sets the value of the thirdPartyStoreNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdPartyStoreNo(String value) {
        this.thirdPartyStoreNo = value;
    }

    /**
     * Gets the value of the invoiceTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceTypeCode() {
        return invoiceTypeCode;
    }

    /**
     * Sets the value of the invoiceTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceTypeCode(String value) {
        this.invoiceTypeCode = value;
    }

    /**
     * Gets the value of the custId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustId() {
        return custId;
    }

    /**
     * Sets the value of the custId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustId(String value) {
        this.custId = value;
    }

    /**
     * Gets the value of the custIdType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustIdType() {
        return custIdType;
    }

    /**
     * Sets the value of the custIdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustIdType(String value) {
        this.custIdType = value;
    }

    /**
     * Gets the value of the pickupUnitNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickupUnitNo() {
        return pickupUnitNo;
    }

    /**
     * Sets the value of the pickupUnitNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickupUnitNo(String value) {
        this.pickupUnitNo = value;
    }

    /**
     * Gets the value of the notifyFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotifyFlag() {
        return notifyFlag;
    }

    /**
     * Sets the value of the notifyFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotifyFlag(String value) {
        this.notifyFlag = value;
    }

}
