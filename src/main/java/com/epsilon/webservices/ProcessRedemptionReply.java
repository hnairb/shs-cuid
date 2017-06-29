
package com.epsilon.webservices;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MemberNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PickUpStoreNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OrderStoreNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RegisterNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TransactionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TransactionDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="TransactionTime" type="{http://www.w3.org/2001/XMLSchema}time"/&gt;
 *         &lt;element name="TimeZone" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AssociateID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RedemptionPoints" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="RedemptionDollarValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MaxRedeemablePoints" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="MaxRedeemableDollarValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TotalAvailableRewardPoints" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="LayawayFlag" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AuthorizationCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MaxRedeemableMemberOwnPoints" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="MaxRedeemableMemberOwnPointsDollarValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MaxRedeemableSurprisePoints" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="MaxRedeemableSurprisePointsDollarValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TotalAvailableMemberOwnPoints" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="TotalAvailableMemberOwnPointsDollarValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TotalAvailableSurprisePoints" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="TotalAvailableSurprisePointsDollarValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.epsilon.com/webservices/}MaxRedeemableSurprisePointsList" minOccurs="0"/&gt;
 *         &lt;element name="TotalAvailableSurprisePointsList" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.epsilon.com/webservices/}AvailableSurprisePoints" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://www.epsilon.com/webservices/}MaxRedeemableXRPointsList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.epsilon.com/webservices/}TotalAvailableXRPointsList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.epsilon.com/webservices/}LineItems" minOccurs="0"/&gt;
 *         &lt;element name="ResponseText" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PointsToExpire" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="PointExpirationDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PointsRedeemedOnBaseOffer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DollarValueOfPointsRedeemedOnBaseOffer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PointsRedeemedOnBonusOffer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DollarValueOfPointsRedeemedOnBonusOffer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DuplicateResponse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "memberNumber",
    "pickUpStoreNumber",
    "orderStoreNumber",
    "registerNumber",
    "transactionNumber",
    "orderId",
    "transactionDate",
    "transactionTime",
    "timeZone",
    "associateID",
    "redemptionPoints",
    "redemptionDollarValue",
    "maxRedeemablePoints",
    "maxRedeemableDollarValue",
    "totalAvailableRewardPoints",
    "layawayFlag",
    "authorizationCode",
    "maxRedeemableMemberOwnPoints",
    "maxRedeemableMemberOwnPointsDollarValue",
    "maxRedeemableSurprisePoints",
    "maxRedeemableSurprisePointsDollarValue",
    "totalAvailableMemberOwnPoints",
    "totalAvailableMemberOwnPointsDollarValue",
    "totalAvailableSurprisePoints",
    "totalAvailableSurprisePointsDollarValue",
    "maxRedeemableSurprisePointsList",
    "totalAvailableSurprisePointsList",
    "maxRedeemableXRPointsList",
    "totalAvailableXRPointsList",
    "lineItems",
    "responseText",
    "pointsToExpire",
    "pointExpirationDate",
    "pointsRedeemedOnBaseOffer",
    "dollarValueOfPointsRedeemedOnBaseOffer",
    "pointsRedeemedOnBonusOffer",
    "dollarValueOfPointsRedeemedOnBonusOffer",
    "duplicateResponse"
})
@XmlRootElement(name = "ProcessRedemptionReply")
public class ProcessRedemptionReply {

    @XmlElement(name = "MemberNumber", required = true)
    protected String memberNumber;
    @XmlElement(name = "PickUpStoreNumber", required = true)
    protected String pickUpStoreNumber;
    @XmlElement(name = "OrderStoreNumber", required = true)
    protected String orderStoreNumber;
    @XmlElement(name = "RegisterNumber", required = true)
    protected String registerNumber;
    @XmlElement(name = "TransactionNumber")
    protected String transactionNumber;
    @XmlElement(name = "OrderId")
    protected String orderId;
    @XmlElement(name = "TransactionDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar transactionDate;
    @XmlElement(name = "TransactionTime", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar transactionTime;
    @XmlElement(name = "TimeZone", required = true)
    protected String timeZone;
    @XmlElement(name = "AssociateID", required = true)
    protected String associateID;
    @XmlElement(name = "RedemptionPoints", required = true)
    protected BigInteger redemptionPoints;
    @XmlElement(name = "RedemptionDollarValue", required = true)
    protected String redemptionDollarValue;
    @XmlElement(name = "MaxRedeemablePoints", required = true)
    protected BigInteger maxRedeemablePoints;
    @XmlElement(name = "MaxRedeemableDollarValue", required = true)
    protected String maxRedeemableDollarValue;
    @XmlElement(name = "TotalAvailableRewardPoints", required = true)
    protected BigInteger totalAvailableRewardPoints;
    @XmlElement(name = "LayawayFlag", required = true)
    protected String layawayFlag;
    @XmlElement(name = "AuthorizationCode", required = true)
    protected String authorizationCode;
    @XmlElement(name = "MaxRedeemableMemberOwnPoints")
    protected BigInteger maxRedeemableMemberOwnPoints;
    @XmlElement(name = "MaxRedeemableMemberOwnPointsDollarValue")
    protected String maxRedeemableMemberOwnPointsDollarValue;
    @XmlElement(name = "MaxRedeemableSurprisePoints")
    protected BigInteger maxRedeemableSurprisePoints;
    @XmlElement(name = "MaxRedeemableSurprisePointsDollarValue")
    protected String maxRedeemableSurprisePointsDollarValue;
    @XmlElement(name = "TotalAvailableMemberOwnPoints")
    protected BigInteger totalAvailableMemberOwnPoints;
    @XmlElement(name = "TotalAvailableMemberOwnPointsDollarValue")
    protected String totalAvailableMemberOwnPointsDollarValue;
    @XmlElement(name = "TotalAvailableSurprisePoints")
    protected BigInteger totalAvailableSurprisePoints;
    @XmlElement(name = "TotalAvailableSurprisePointsDollarValue")
    protected String totalAvailableSurprisePointsDollarValue;
    @XmlElement(name = "MaxRedeemableSurprisePointsList")
    protected MaxRedeemableSurprisePointsList maxRedeemableSurprisePointsList;
    @XmlElement(name = "TotalAvailableSurprisePointsList")
    protected ProcessRedemptionReply.TotalAvailableSurprisePointsList totalAvailableSurprisePointsList;
    @XmlElement(name = "MaxRedeemableXRPointsList")
    protected MaxRedeemableXRPointsList maxRedeemableXRPointsList;
    @XmlElement(name = "TotalAvailableXRPointsList")
    protected TotalAvailableXRPointsList totalAvailableXRPointsList;
    @XmlElement(name = "LineItems", nillable = true)
    protected Object lineItems;
    @XmlElement(name = "ResponseText", required = true)
    protected String responseText;
    @XmlElement(name = "PointsToExpire", required = true)
    protected BigInteger pointsToExpire;
    @XmlElement(name = "PointExpirationDate", required = true)
    protected String pointExpirationDate;
    @XmlElement(name = "PointsRedeemedOnBaseOffer")
    protected String pointsRedeemedOnBaseOffer;
    @XmlElement(name = "DollarValueOfPointsRedeemedOnBaseOffer")
    protected String dollarValueOfPointsRedeemedOnBaseOffer;
    @XmlElement(name = "PointsRedeemedOnBonusOffer")
    protected String pointsRedeemedOnBonusOffer;
    @XmlElement(name = "DollarValueOfPointsRedeemedOnBonusOffer")
    protected String dollarValueOfPointsRedeemedOnBonusOffer;
    @XmlElement(name = "DuplicateResponse")
    protected String duplicateResponse;

    /**
     * Gets the value of the memberNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberNumber() {
        return memberNumber;
    }

    /**
     * Sets the value of the memberNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberNumber(String value) {
        this.memberNumber = value;
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
     * Gets the value of the orderStoreNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderStoreNumber() {
        return orderStoreNumber;
    }

    /**
     * Sets the value of the orderStoreNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderStoreNumber(String value) {
        this.orderStoreNumber = value;
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
     * Gets the value of the transactionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransactionDate() {
        return transactionDate;
    }

    /**
     * Sets the value of the transactionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransactionDate(XMLGregorianCalendar value) {
        this.transactionDate = value;
    }

    /**
     * Gets the value of the transactionTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransactionTime() {
        return transactionTime;
    }

    /**
     * Sets the value of the transactionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransactionTime(XMLGregorianCalendar value) {
        this.transactionTime = value;
    }

    /**
     * Gets the value of the timeZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * Sets the value of the timeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZone(String value) {
        this.timeZone = value;
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
     * Gets the value of the redemptionPoints property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRedemptionPoints() {
        return redemptionPoints;
    }

    /**
     * Sets the value of the redemptionPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRedemptionPoints(BigInteger value) {
        this.redemptionPoints = value;
    }

    /**
     * Gets the value of the redemptionDollarValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedemptionDollarValue() {
        return redemptionDollarValue;
    }

    /**
     * Sets the value of the redemptionDollarValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedemptionDollarValue(String value) {
        this.redemptionDollarValue = value;
    }

    /**
     * Gets the value of the maxRedeemablePoints property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxRedeemablePoints() {
        return maxRedeemablePoints;
    }

    /**
     * Sets the value of the maxRedeemablePoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxRedeemablePoints(BigInteger value) {
        this.maxRedeemablePoints = value;
    }

    /**
     * Gets the value of the maxRedeemableDollarValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxRedeemableDollarValue() {
        return maxRedeemableDollarValue;
    }

    /**
     * Sets the value of the maxRedeemableDollarValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxRedeemableDollarValue(String value) {
        this.maxRedeemableDollarValue = value;
    }

    /**
     * Gets the value of the totalAvailableRewardPoints property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalAvailableRewardPoints() {
        return totalAvailableRewardPoints;
    }

    /**
     * Sets the value of the totalAvailableRewardPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalAvailableRewardPoints(BigInteger value) {
        this.totalAvailableRewardPoints = value;
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
     * Gets the value of the authorizationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizationCode() {
        return authorizationCode;
    }

    /**
     * Sets the value of the authorizationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationCode(String value) {
        this.authorizationCode = value;
    }

    /**
     * Gets the value of the maxRedeemableMemberOwnPoints property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxRedeemableMemberOwnPoints() {
        return maxRedeemableMemberOwnPoints;
    }

    /**
     * Sets the value of the maxRedeemableMemberOwnPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxRedeemableMemberOwnPoints(BigInteger value) {
        this.maxRedeemableMemberOwnPoints = value;
    }

    /**
     * Gets the value of the maxRedeemableMemberOwnPointsDollarValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxRedeemableMemberOwnPointsDollarValue() {
        return maxRedeemableMemberOwnPointsDollarValue;
    }

    /**
     * Sets the value of the maxRedeemableMemberOwnPointsDollarValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxRedeemableMemberOwnPointsDollarValue(String value) {
        this.maxRedeemableMemberOwnPointsDollarValue = value;
    }

    /**
     * Gets the value of the maxRedeemableSurprisePoints property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxRedeemableSurprisePoints() {
        return maxRedeemableSurprisePoints;
    }

    /**
     * Sets the value of the maxRedeemableSurprisePoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxRedeemableSurprisePoints(BigInteger value) {
        this.maxRedeemableSurprisePoints = value;
    }

    /**
     * Gets the value of the maxRedeemableSurprisePointsDollarValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxRedeemableSurprisePointsDollarValue() {
        return maxRedeemableSurprisePointsDollarValue;
    }

    /**
     * Sets the value of the maxRedeemableSurprisePointsDollarValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxRedeemableSurprisePointsDollarValue(String value) {
        this.maxRedeemableSurprisePointsDollarValue = value;
    }

    /**
     * Gets the value of the totalAvailableMemberOwnPoints property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalAvailableMemberOwnPoints() {
        return totalAvailableMemberOwnPoints;
    }

    /**
     * Sets the value of the totalAvailableMemberOwnPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalAvailableMemberOwnPoints(BigInteger value) {
        this.totalAvailableMemberOwnPoints = value;
    }

    /**
     * Gets the value of the totalAvailableMemberOwnPointsDollarValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalAvailableMemberOwnPointsDollarValue() {
        return totalAvailableMemberOwnPointsDollarValue;
    }

    /**
     * Sets the value of the totalAvailableMemberOwnPointsDollarValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalAvailableMemberOwnPointsDollarValue(String value) {
        this.totalAvailableMemberOwnPointsDollarValue = value;
    }

    /**
     * Gets the value of the totalAvailableSurprisePoints property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalAvailableSurprisePoints() {
        return totalAvailableSurprisePoints;
    }

    /**
     * Sets the value of the totalAvailableSurprisePoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalAvailableSurprisePoints(BigInteger value) {
        this.totalAvailableSurprisePoints = value;
    }

    /**
     * Gets the value of the totalAvailableSurprisePointsDollarValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalAvailableSurprisePointsDollarValue() {
        return totalAvailableSurprisePointsDollarValue;
    }

    /**
     * Sets the value of the totalAvailableSurprisePointsDollarValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalAvailableSurprisePointsDollarValue(String value) {
        this.totalAvailableSurprisePointsDollarValue = value;
    }

    /**
     * Gets the value of the maxRedeemableSurprisePointsList property.
     * 
     * @return
     *     possible object is
     *     {@link MaxRedeemableSurprisePointsList }
     *     
     */
    public MaxRedeemableSurprisePointsList getMaxRedeemableSurprisePointsList() {
        return maxRedeemableSurprisePointsList;
    }

    /**
     * Sets the value of the maxRedeemableSurprisePointsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaxRedeemableSurprisePointsList }
     *     
     */
    public void setMaxRedeemableSurprisePointsList(MaxRedeemableSurprisePointsList value) {
        this.maxRedeemableSurprisePointsList = value;
    }

    /**
     * Gets the value of the totalAvailableSurprisePointsList property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessRedemptionReply.TotalAvailableSurprisePointsList }
     *     
     */
    public ProcessRedemptionReply.TotalAvailableSurprisePointsList getTotalAvailableSurprisePointsList() {
        return totalAvailableSurprisePointsList;
    }

    /**
     * Sets the value of the totalAvailableSurprisePointsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessRedemptionReply.TotalAvailableSurprisePointsList }
     *     
     */
    public void setTotalAvailableSurprisePointsList(ProcessRedemptionReply.TotalAvailableSurprisePointsList value) {
        this.totalAvailableSurprisePointsList = value;
    }

    /**
     * Gets the value of the maxRedeemableXRPointsList property.
     * 
     * @return
     *     possible object is
     *     {@link MaxRedeemableXRPointsList }
     *     
     */
    public MaxRedeemableXRPointsList getMaxRedeemableXRPointsList() {
        return maxRedeemableXRPointsList;
    }

    /**
     * Sets the value of the maxRedeemableXRPointsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaxRedeemableXRPointsList }
     *     
     */
    public void setMaxRedeemableXRPointsList(MaxRedeemableXRPointsList value) {
        this.maxRedeemableXRPointsList = value;
    }

    /**
     * Gets the value of the totalAvailableXRPointsList property.
     * 
     * @return
     *     possible object is
     *     {@link TotalAvailableXRPointsList }
     *     
     */
    public TotalAvailableXRPointsList getTotalAvailableXRPointsList() {
        return totalAvailableXRPointsList;
    }

    /**
     * Sets the value of the totalAvailableXRPointsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalAvailableXRPointsList }
     *     
     */
    public void setTotalAvailableXRPointsList(TotalAvailableXRPointsList value) {
        this.totalAvailableXRPointsList = value;
    }

    /**
     * Gets the value of the lineItems property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLineItems() {
        return lineItems;
    }

    /**
     * Sets the value of the lineItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLineItems(Object value) {
        this.lineItems = value;
    }

    /**
     * Gets the value of the responseText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseText() {
        return responseText;
    }

    /**
     * Sets the value of the responseText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseText(String value) {
        this.responseText = value;
    }

    /**
     * Gets the value of the pointsToExpire property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPointsToExpire() {
        return pointsToExpire;
    }

    /**
     * Sets the value of the pointsToExpire property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPointsToExpire(BigInteger value) {
        this.pointsToExpire = value;
    }

    /**
     * Gets the value of the pointExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPointExpirationDate() {
        return pointExpirationDate;
    }

    /**
     * Sets the value of the pointExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPointExpirationDate(String value) {
        this.pointExpirationDate = value;
    }

    /**
     * Gets the value of the pointsRedeemedOnBaseOffer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPointsRedeemedOnBaseOffer() {
        return pointsRedeemedOnBaseOffer;
    }

    /**
     * Sets the value of the pointsRedeemedOnBaseOffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPointsRedeemedOnBaseOffer(String value) {
        this.pointsRedeemedOnBaseOffer = value;
    }

    /**
     * Gets the value of the dollarValueOfPointsRedeemedOnBaseOffer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDollarValueOfPointsRedeemedOnBaseOffer() {
        return dollarValueOfPointsRedeemedOnBaseOffer;
    }

    /**
     * Sets the value of the dollarValueOfPointsRedeemedOnBaseOffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDollarValueOfPointsRedeemedOnBaseOffer(String value) {
        this.dollarValueOfPointsRedeemedOnBaseOffer = value;
    }

    /**
     * Gets the value of the pointsRedeemedOnBonusOffer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPointsRedeemedOnBonusOffer() {
        return pointsRedeemedOnBonusOffer;
    }

    /**
     * Sets the value of the pointsRedeemedOnBonusOffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPointsRedeemedOnBonusOffer(String value) {
        this.pointsRedeemedOnBonusOffer = value;
    }

    /**
     * Gets the value of the dollarValueOfPointsRedeemedOnBonusOffer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDollarValueOfPointsRedeemedOnBonusOffer() {
        return dollarValueOfPointsRedeemedOnBonusOffer;
    }

    /**
     * Sets the value of the dollarValueOfPointsRedeemedOnBonusOffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDollarValueOfPointsRedeemedOnBonusOffer(String value) {
        this.dollarValueOfPointsRedeemedOnBonusOffer = value;
    }

    /**
     * Gets the value of the duplicateResponse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuplicateResponse() {
        return duplicateResponse;
    }

    /**
     * Sets the value of the duplicateResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuplicateResponse(String value) {
        this.duplicateResponse = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element ref="{http://www.epsilon.com/webservices/}AvailableSurprisePoints" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "availableSurprisePoints"
    })
    public static class TotalAvailableSurprisePointsList {

        @XmlElement(name = "AvailableSurprisePoints", required = true, nillable = true)
        protected List<Object> availableSurprisePoints;

        /**
         * Gets the value of the availableSurprisePoints property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the availableSurprisePoints property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAvailableSurprisePoints().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getAvailableSurprisePoints() {
            if (availableSurprisePoints == null) {
                availableSurprisePoints = new ArrayList<Object>();
            }
            return this.availableSurprisePoints;
        }

    }

}
