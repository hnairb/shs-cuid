
package com.searshc.hs.som.thm.domain.sywr;

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
 *         &lt;element name="TransactionDTTM" type="{http://www.w3.org/2001/XMLSchema}anySimpleType"/>
 *         &lt;element name="TransactionID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TransactionDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TransactionType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TotalPoints" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="TotalBasePoints" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="TotalBonusPoints" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="TotalPointsRedeemed" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="DollarValueOfPointsRedeemed" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="TotalExpired" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="StoreLocation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StoreFormat" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EarnType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="GrossSpend" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ReasonCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PostTS" type="{http://www.w3.org/2001/XMLSchema}anySimpleType"/>
 *         &lt;element name="PickUpStoreNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TotalTax" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AssociateID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ProcessStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TransactionNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RegisterNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TotalDollarSaving" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OrderId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OrderSource" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "orderSource"
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

}
