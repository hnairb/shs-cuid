
package com.searshc.hs.som.thm.domain.telluride;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TransactionDTTM" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" form="qualified"/>
 *         &lt;element name="TransactionID" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="TransactionDescription" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="TransactionType" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="TotalPoints" type="{http://www.w3.org/2001/XMLSchema}integer" form="qualified"/>
 *         &lt;element name="TotalBasePoints" type="{http://www.w3.org/2001/XMLSchema}integer" form="qualified"/>
 *         &lt;element name="TotalBonusPoints" type="{http://www.w3.org/2001/XMLSchema}integer" form="qualified"/>
 *         &lt;element name="TotalPointsRedeemed" type="{http://www.w3.org/2001/XMLSchema}integer" form="qualified"/>
 *         &lt;element name="DollarValueOfPointsRedeemed" type="{http://www.w3.org/2001/XMLSchema}decimal" form="qualified"/>
 *         &lt;element name="TotalExpired" type="{http://www.w3.org/2001/XMLSchema}integer" form="qualified"/>
 *         &lt;element name="StoreLocation" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="StoreFormat" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="EarnType" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="GrossSpend" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="ReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="PostTS" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" form="qualified"/>
 *         &lt;element name="PickUpStoreNumber" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="TotalTax" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="AssociateID" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="ProcessStatus" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="TransactionNumber" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="RegisterNumber" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="TotalDollarSaving" type="{http://www.w3.org/2001/XMLSchema}decimal" form="qualified"/>
 *         &lt;element name="OrderId" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="OrderSource" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="BenefitCode" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="BenefitName" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="BenefitStartDTTM" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="BenefitEndDTTM" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="BenefitType" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="BenefitCategory" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="RedemptionMode" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="ApproximateRetailValue" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="CostToBusiness" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="BenefitUsageDetails" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="ThirdPartyName" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="ThirdPartyURL" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="VIPTier" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="UserCoupon" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="UserCouponStartDate" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="UserCouponStartTime" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="UserCouponEndDate" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="UserCouponEndTime" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "transactionDTTM",
    "transactionID",
    "transactionDescription",
    "transactionType",
    "totalPoints",
    "totalBasePoints",
    "totalBonusPoints",
    "totalPointsRedeemed",
    "dollarValueOfPointsRedeemed",
    "totalExpired",
    "storeLocation",
    "storeFormat",
    "earnType",
    "grossSpend",
    "reasonCode",
    "postTS",
    "pickUpStoreNumber",
    "totalTax",
    "associateID",
    "processStatus",
    "transactionNumber",
    "registerNumber",
    "totalDollarSaving",
    "orderId",
    "orderSource",
    "benefitCode",
    "benefitName",
    "benefitStartDTTM",
    "benefitEndDTTM",
    "benefitType",
    "benefitCategory",
    "redemptionMode",
    "approximateRetailValue",
    "costToBusiness",
    "benefitUsageDetails",
    "thirdPartyName",
    "thirdPartyURL",
    "vipTier",
    "userCoupon",
    "userCouponStartDate",
    "userCouponStartTime",
    "userCouponEndDate",
    "userCouponEndTime"
})
@XmlRootElement(name = "TransactionDetail")
public class TransactionDetail {

    @XmlElement(name = "TransactionDTTM", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected Object transactionDTTM;
    @XmlElement(name = "TransactionID", required = true)
    protected String transactionID;
    @XmlElement(name = "TransactionDescription", required = true)
    protected String transactionDescription;
    @XmlElement(name = "TransactionType", required = true)
    protected String transactionType;
    @XmlElement(name = "TotalPoints", required = true)
    protected BigInteger totalPoints;
    @XmlElement(name = "TotalBasePoints", required = true)
    protected BigInteger totalBasePoints;
    @XmlElement(name = "TotalBonusPoints", required = true)
    protected BigInteger totalBonusPoints;
    @XmlElement(name = "TotalPointsRedeemed", required = true)
    protected BigInteger totalPointsRedeemed;
    @XmlElement(name = "DollarValueOfPointsRedeemed", required = true)
    protected BigDecimal dollarValueOfPointsRedeemed;
    @XmlElement(name = "TotalExpired", required = true)
    protected BigInteger totalExpired;
    @XmlElement(name = "StoreLocation", required = true)
    protected String storeLocation;
    @XmlElement(name = "StoreFormat", required = true)
    protected String storeFormat;
    @XmlElement(name = "EarnType", required = true)
    protected String earnType;
    @XmlElement(name = "GrossSpend", required = true)
    protected String grossSpend;
    @XmlElement(name = "ReasonCode", required = true)
    protected String reasonCode;
    @XmlElement(name = "PostTS", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected Object postTS;
    @XmlElement(name = "PickUpStoreNumber", required = true)
    protected String pickUpStoreNumber;
    @XmlElement(name = "TotalTax", required = true)
    protected String totalTax;
    @XmlElement(name = "AssociateID", required = true)
    protected String associateID;
    @XmlElement(name = "ProcessStatus", required = true)
    protected String processStatus;
    @XmlElement(name = "TransactionNumber", required = true)
    protected String transactionNumber;
    @XmlElement(name = "RegisterNumber", required = true)
    protected String registerNumber;
    @XmlElement(name = "TotalDollarSaving", required = true)
    protected BigDecimal totalDollarSaving;
    @XmlElement(name = "OrderId", required = true)
    protected String orderId;
    @XmlElement(name = "OrderSource", required = true)
    protected String orderSource;
    @XmlElement(name = "BenefitCode", required = true)
    protected String benefitCode;
    @XmlElement(name = "BenefitName", required = true)
    protected String benefitName;
    @XmlElement(name = "BenefitStartDTTM", required = true)
    protected String benefitStartDTTM;
    @XmlElement(name = "BenefitEndDTTM", required = true)
    protected String benefitEndDTTM;
    @XmlElement(name = "BenefitType", required = true)
    protected String benefitType;
    @XmlElement(name = "BenefitCategory", required = true)
    protected String benefitCategory;
    @XmlElement(name = "RedemptionMode", required = true)
    protected String redemptionMode;
    @XmlElement(name = "ApproximateRetailValue", required = true)
    protected String approximateRetailValue;
    @XmlElement(name = "CostToBusiness", required = true)
    protected String costToBusiness;
    @XmlElement(name = "BenefitUsageDetails", required = true)
    protected String benefitUsageDetails;
    @XmlElement(name = "ThirdPartyName", required = true)
    protected String thirdPartyName;
    @XmlElement(name = "ThirdPartyURL", required = true)
    protected String thirdPartyURL;
    @XmlElement(name = "VIPTier", required = true)
    protected String vipTier;
    @XmlElement(name = "UserCoupon", required = true)
    protected String userCoupon;
    @XmlElement(name = "UserCouponStartDate", required = true)
    protected String userCouponStartDate;
    @XmlElement(name = "UserCouponStartTime", required = true)
    protected String userCouponStartTime;
    @XmlElement(name = "UserCouponEndDate", required = true)
    protected String userCouponEndDate;
    @XmlElement(name = "UserCouponEndTime", required = true)
    protected String userCouponEndTime;

    /**
     * Gets the value of the transactionDTTM property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTransactionDTTM() {
        return transactionDTTM;
    }

    /**
     * Sets the value of the transactionDTTM property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTransactionDTTM(Object value) {
        this.transactionDTTM = value;
    }

    /**
     * Gets the value of the transactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionID() {
        return transactionID;
    }

    /**
     * Sets the value of the transactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionID(String value) {
        this.transactionID = value;
    }

    /**
     * Gets the value of the transactionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionDescription() {
        return transactionDescription;
    }

    /**
     * Sets the value of the transactionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionDescription(String value) {
        this.transactionDescription = value;
    }

    /**
     * Gets the value of the transactionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionType() {
        return transactionType;
    }

    /**
     * Sets the value of the transactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionType(String value) {
        this.transactionType = value;
    }

    /**
     * Gets the value of the totalPoints property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalPoints() {
        return totalPoints;
    }

    /**
     * Sets the value of the totalPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalPoints(BigInteger value) {
        this.totalPoints = value;
    }

    /**
     * Gets the value of the totalBasePoints property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalBasePoints() {
        return totalBasePoints;
    }

    /**
     * Sets the value of the totalBasePoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalBasePoints(BigInteger value) {
        this.totalBasePoints = value;
    }

    /**
     * Gets the value of the totalBonusPoints property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalBonusPoints() {
        return totalBonusPoints;
    }

    /**
     * Sets the value of the totalBonusPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalBonusPoints(BigInteger value) {
        this.totalBonusPoints = value;
    }

    /**
     * Gets the value of the totalPointsRedeemed property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalPointsRedeemed() {
        return totalPointsRedeemed;
    }

    /**
     * Sets the value of the totalPointsRedeemed property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalPointsRedeemed(BigInteger value) {
        this.totalPointsRedeemed = value;
    }

    /**
     * Gets the value of the dollarValueOfPointsRedeemed property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDollarValueOfPointsRedeemed() {
        return dollarValueOfPointsRedeemed;
    }

    /**
     * Sets the value of the dollarValueOfPointsRedeemed property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDollarValueOfPointsRedeemed(BigDecimal value) {
        this.dollarValueOfPointsRedeemed = value;
    }

    /**
     * Gets the value of the totalExpired property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalExpired() {
        return totalExpired;
    }

    /**
     * Sets the value of the totalExpired property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalExpired(BigInteger value) {
        this.totalExpired = value;
    }

    /**
     * Gets the value of the storeLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreLocation() {
        return storeLocation;
    }

    /**
     * Sets the value of the storeLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreLocation(String value) {
        this.storeLocation = value;
    }

    /**
     * Gets the value of the storeFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreFormat() {
        return storeFormat;
    }

    /**
     * Sets the value of the storeFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreFormat(String value) {
        this.storeFormat = value;
    }

    /**
     * Gets the value of the earnType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEarnType() {
        return earnType;
    }

    /**
     * Sets the value of the earnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEarnType(String value) {
        this.earnType = value;
    }

    /**
     * Gets the value of the grossSpend property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrossSpend() {
        return grossSpend;
    }

    /**
     * Sets the value of the grossSpend property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrossSpend(String value) {
        this.grossSpend = value;
    }

    /**
     * Gets the value of the reasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonCode() {
        return reasonCode;
    }

    /**
     * Sets the value of the reasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonCode(String value) {
        this.reasonCode = value;
    }

    /**
     * Gets the value of the postTS property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPostTS() {
        return postTS;
    }

    /**
     * Sets the value of the postTS property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPostTS(Object value) {
        this.postTS = value;
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
     * Gets the value of the totalTax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalTax() {
        return totalTax;
    }

    /**
     * Sets the value of the totalTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalTax(String value) {
        this.totalTax = value;
    }

    /**
     * Gets the value of the associateID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssociateID() {
        return associateID;
    }

    /**
     * Sets the value of the associateID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssociateID(String value) {
        this.associateID = value;
    }

    /**
     * Gets the value of the processStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessStatus() {
        return processStatus;
    }

    /**
     * Sets the value of the processStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessStatus(String value) {
        this.processStatus = value;
    }

    /**
     * Gets the value of the transactionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionNumber() {
        return transactionNumber;
    }

    /**
     * Sets the value of the transactionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionNumber(String value) {
        this.transactionNumber = value;
    }

    /**
     * Gets the value of the registerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisterNumber() {
        return registerNumber;
    }

    /**
     * Sets the value of the registerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisterNumber(String value) {
        this.registerNumber = value;
    }

    /**
     * Gets the value of the totalDollarSaving property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalDollarSaving() {
        return totalDollarSaving;
    }

    /**
     * Sets the value of the totalDollarSaving property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalDollarSaving(BigDecimal value) {
        this.totalDollarSaving = value;
    }

    /**
     * Gets the value of the orderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * Sets the value of the orderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderId(String value) {
        this.orderId = value;
    }

    /**
     * Gets the value of the orderSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderSource() {
        return orderSource;
    }

    /**
     * Sets the value of the orderSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderSource(String value) {
        this.orderSource = value;
    }

    /**
     * Gets the value of the benefitCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBenefitCode() {
        return benefitCode;
    }

    /**
     * Sets the value of the benefitCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBenefitCode(String value) {
        this.benefitCode = value;
    }

    /**
     * Gets the value of the benefitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBenefitName() {
        return benefitName;
    }

    /**
     * Sets the value of the benefitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBenefitName(String value) {
        this.benefitName = value;
    }

    /**
     * Gets the value of the benefitStartDTTM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBenefitStartDTTM() {
        return benefitStartDTTM;
    }

    /**
     * Sets the value of the benefitStartDTTM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBenefitStartDTTM(String value) {
        this.benefitStartDTTM = value;
    }

    /**
     * Gets the value of the benefitEndDTTM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBenefitEndDTTM() {
        return benefitEndDTTM;
    }

    /**
     * Sets the value of the benefitEndDTTM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBenefitEndDTTM(String value) {
        this.benefitEndDTTM = value;
    }

    /**
     * Gets the value of the benefitType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBenefitType() {
        return benefitType;
    }

    /**
     * Sets the value of the benefitType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBenefitType(String value) {
        this.benefitType = value;
    }

    /**
     * Gets the value of the benefitCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBenefitCategory() {
        return benefitCategory;
    }

    /**
     * Sets the value of the benefitCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBenefitCategory(String value) {
        this.benefitCategory = value;
    }

    /**
     * Gets the value of the redemptionMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedemptionMode() {
        return redemptionMode;
    }

    /**
     * Sets the value of the redemptionMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedemptionMode(String value) {
        this.redemptionMode = value;
    }

    /**
     * Gets the value of the approximateRetailValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproximateRetailValue() {
        return approximateRetailValue;
    }

    /**
     * Sets the value of the approximateRetailValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApproximateRetailValue(String value) {
        this.approximateRetailValue = value;
    }

    /**
     * Gets the value of the costToBusiness property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostToBusiness() {
        return costToBusiness;
    }

    /**
     * Sets the value of the costToBusiness property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostToBusiness(String value) {
        this.costToBusiness = value;
    }

    /**
     * Gets the value of the benefitUsageDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBenefitUsageDetails() {
        return benefitUsageDetails;
    }

    /**
     * Sets the value of the benefitUsageDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBenefitUsageDetails(String value) {
        this.benefitUsageDetails = value;
    }

    /**
     * Gets the value of the thirdPartyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdPartyName() {
        return thirdPartyName;
    }

    /**
     * Sets the value of the thirdPartyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdPartyName(String value) {
        this.thirdPartyName = value;
    }

    /**
     * Gets the value of the thirdPartyURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdPartyURL() {
        return thirdPartyURL;
    }

    /**
     * Sets the value of the thirdPartyURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdPartyURL(String value) {
        this.thirdPartyURL = value;
    }

    /**
     * Gets the value of the vipTier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVIPTier() {
        return vipTier;
    }

    /**
     * Sets the value of the vipTier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVIPTier(String value) {
        this.vipTier = value;
    }

    /**
     * Gets the value of the userCoupon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserCoupon() {
        return userCoupon;
    }

    /**
     * Sets the value of the userCoupon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserCoupon(String value) {
        this.userCoupon = value;
    }

    /**
     * Gets the value of the userCouponStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserCouponStartDate() {
        return userCouponStartDate;
    }

    /**
     * Sets the value of the userCouponStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserCouponStartDate(String value) {
        this.userCouponStartDate = value;
    }

    /**
     * Gets the value of the userCouponStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserCouponStartTime() {
        return userCouponStartTime;
    }

    /**
     * Sets the value of the userCouponStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserCouponStartTime(String value) {
        this.userCouponStartTime = value;
    }

    /**
     * Gets the value of the userCouponEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserCouponEndDate() {
        return userCouponEndDate;
    }

    /**
     * Sets the value of the userCouponEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserCouponEndDate(String value) {
        this.userCouponEndDate = value;
    }

    /**
     * Gets the value of the userCouponEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserCouponEndTime() {
        return userCouponEndTime;
    }

    /**
     * Sets the value of the userCouponEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserCouponEndTime(String value) {
        this.userCouponEndTime = value;
    }

}
