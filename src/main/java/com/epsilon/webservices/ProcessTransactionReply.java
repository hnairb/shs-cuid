
package com.epsilon.webservices;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="MemberNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BasePointsEarned" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BasePointsEarnedTxt" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BonusPointsEarned" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="BonusPointsEarnedTxt" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PointsRedeemedOnBaseOffer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DollarValueOfPointsRedeemedOnBaseOffer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PointsRedeemedOnBonusOffer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DollarValueOfPointsRedeemedOnBonusOffer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TotalPointsEarned" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TotalPointsEarnedTxt" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PointDebit" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CurrencyDebit" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MemberSavingsDollarValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TimeZone" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LayawayContractNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LayawayOpeningDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LayawayScheduledClosingDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LayawayFinalPaymentDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{http://www.epsilon.com/webservices/}BonusPointsSummary" minOccurs="0"/&gt;
 *         &lt;element name="PointsToExpire" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PointExpirationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.epsilon.com/webservices/}Messages" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.epsilon.com/webservices/}TenderList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.epsilon.com/webservices/}LineItems" minOccurs="0"/&gt;
 *         &lt;element name="ResponseText" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "basePointsEarned",
    "basePointsEarnedTxt",
    "bonusPointsEarned",
    "bonusPointsEarnedTxt",
    "pointsRedeemedOnBaseOffer",
    "dollarValueOfPointsRedeemedOnBaseOffer",
    "pointsRedeemedOnBonusOffer",
    "dollarValueOfPointsRedeemedOnBonusOffer",
    "totalPointsEarned",
    "totalPointsEarnedTxt",
    "pointDebit",
    "currencyDebit",
    "memberSavingsDollarValue",
    "timeZone",
    "layawayContractNumber",
    "layawayOpeningDate",
    "layawayScheduledClosingDate",
    "layawayFinalPaymentDate",
    "bonusPointsSummary",
    "pointsToExpire",
    "pointExpirationDate",
    "messages",
    "tenderList",
    "lineItems",
    "responseText"
})
@XmlRootElement(name = "ProcessTransactionReply")
public class ProcessTransactionReply {

    @XmlElement(name = "MemberNumber")
    protected String memberNumber;
    @XmlElement(name = "BasePointsEarned", required = true)
    protected String basePointsEarned;
    @XmlElement(name = "BasePointsEarnedTxt", required = true)
    protected String basePointsEarnedTxt;
    @XmlElement(name = "BonusPointsEarned", required = true)
    protected BigInteger bonusPointsEarned;
    @XmlElement(name = "BonusPointsEarnedTxt", required = true)
    protected String bonusPointsEarnedTxt;
    @XmlElement(name = "PointsRedeemedOnBaseOffer")
    protected String pointsRedeemedOnBaseOffer;
    @XmlElement(name = "DollarValueOfPointsRedeemedOnBaseOffer")
    protected String dollarValueOfPointsRedeemedOnBaseOffer;
    @XmlElement(name = "PointsRedeemedOnBonusOffer")
    protected String pointsRedeemedOnBonusOffer;
    @XmlElement(name = "DollarValueOfPointsRedeemedOnBonusOffer")
    protected String dollarValueOfPointsRedeemedOnBonusOffer;
    @XmlElement(name = "TotalPointsEarned", required = true)
    protected String totalPointsEarned;
    @XmlElement(name = "TotalPointsEarnedTxt", required = true)
    protected String totalPointsEarnedTxt;
    @XmlElement(name = "PointDebit", required = true)
    protected String pointDebit;
    @XmlElement(name = "CurrencyDebit", required = true)
    protected String currencyDebit;
    @XmlElement(name = "MemberSavingsDollarValue", required = true)
    protected String memberSavingsDollarValue;
    @XmlElement(name = "TimeZone", required = true)
    protected String timeZone;
    @XmlElement(name = "LayawayContractNumber", required = true)
    protected String layawayContractNumber;
    @XmlElement(name = "LayawayOpeningDate", required = true)
    protected String layawayOpeningDate;
    @XmlElement(name = "LayawayScheduledClosingDate", required = true)
    protected String layawayScheduledClosingDate;
    @XmlElement(name = "LayawayFinalPaymentDate", required = true)
    protected String layawayFinalPaymentDate;
    @XmlElement(name = "BonusPointsSummary")
    protected BonusPointsSummary bonusPointsSummary;
    @XmlElement(name = "PointsToExpire")
    protected String pointsToExpire;
    @XmlElement(name = "PointExpirationDate")
    protected String pointExpirationDate;
    @XmlElement(name = "Messages")
    protected Messages messages;
    @XmlElement(name = "TenderList")
    protected TenderList tenderList;
    @XmlElement(name = "LineItems", nillable = true)
    protected Object lineItems;
    @XmlElement(name = "ResponseText", required = true)
    protected String responseText;

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
     * Gets the value of the basePointsEarned property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasePointsEarned() {
        return basePointsEarned;
    }

    /**
     * Sets the value of the basePointsEarned property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBasePointsEarned(String value) {
        this.basePointsEarned = value;
    }

    /**
     * Gets the value of the basePointsEarnedTxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasePointsEarnedTxt() {
        return basePointsEarnedTxt;
    }

    /**
     * Sets the value of the basePointsEarnedTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBasePointsEarnedTxt(String value) {
        this.basePointsEarnedTxt = value;
    }

    /**
     * Gets the value of the bonusPointsEarned property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBonusPointsEarned() {
        return bonusPointsEarned;
    }

    /**
     * Sets the value of the bonusPointsEarned property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBonusPointsEarned(BigInteger value) {
        this.bonusPointsEarned = value;
    }

    /**
     * Gets the value of the bonusPointsEarnedTxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBonusPointsEarnedTxt() {
        return bonusPointsEarnedTxt;
    }

    /**
     * Sets the value of the bonusPointsEarnedTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBonusPointsEarnedTxt(String value) {
        this.bonusPointsEarnedTxt = value;
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
     * Gets the value of the totalPointsEarned property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalPointsEarned() {
        return totalPointsEarned;
    }

    /**
     * Sets the value of the totalPointsEarned property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalPointsEarned(String value) {
        this.totalPointsEarned = value;
    }

    /**
     * Gets the value of the totalPointsEarnedTxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalPointsEarnedTxt() {
        return totalPointsEarnedTxt;
    }

    /**
     * Sets the value of the totalPointsEarnedTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalPointsEarnedTxt(String value) {
        this.totalPointsEarnedTxt = value;
    }

    /**
     * Gets the value of the pointDebit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPointDebit() {
        return pointDebit;
    }

    /**
     * Sets the value of the pointDebit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPointDebit(String value) {
        this.pointDebit = value;
    }

    /**
     * Gets the value of the currencyDebit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyDebit() {
        return currencyDebit;
    }

    /**
     * Sets the value of the currencyDebit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyDebit(String value) {
        this.currencyDebit = value;
    }

    /**
     * Gets the value of the memberSavingsDollarValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberSavingsDollarValue() {
        return memberSavingsDollarValue;
    }

    /**
     * Sets the value of the memberSavingsDollarValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberSavingsDollarValue(String value) {
        this.memberSavingsDollarValue = value;
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
     * Gets the value of the layawayContractNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLayawayContractNumber() {
        return layawayContractNumber;
    }

    /**
     * Sets the value of the layawayContractNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLayawayContractNumber(String value) {
        this.layawayContractNumber = value;
    }

    /**
     * Gets the value of the layawayOpeningDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLayawayOpeningDate() {
        return layawayOpeningDate;
    }

    /**
     * Sets the value of the layawayOpeningDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLayawayOpeningDate(String value) {
        this.layawayOpeningDate = value;
    }

    /**
     * Gets the value of the layawayScheduledClosingDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLayawayScheduledClosingDate() {
        return layawayScheduledClosingDate;
    }

    /**
     * Sets the value of the layawayScheduledClosingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLayawayScheduledClosingDate(String value) {
        this.layawayScheduledClosingDate = value;
    }

    /**
     * Gets the value of the layawayFinalPaymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLayawayFinalPaymentDate() {
        return layawayFinalPaymentDate;
    }

    /**
     * Sets the value of the layawayFinalPaymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLayawayFinalPaymentDate(String value) {
        this.layawayFinalPaymentDate = value;
    }

    /**
     * Gets the value of the bonusPointsSummary property.
     * 
     * @return
     *     possible object is
     *     {@link BonusPointsSummary }
     *     
     */
    public BonusPointsSummary getBonusPointsSummary() {
        return bonusPointsSummary;
    }

    /**
     * Sets the value of the bonusPointsSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link BonusPointsSummary }
     *     
     */
    public void setBonusPointsSummary(BonusPointsSummary value) {
        this.bonusPointsSummary = value;
    }

    /**
     * Gets the value of the pointsToExpire property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPointsToExpire() {
        return pointsToExpire;
    }

    /**
     * Sets the value of the pointsToExpire property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPointsToExpire(String value) {
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
     * Gets the value of the messages property.
     * 
     * @return
     *     possible object is
     *     {@link Messages }
     *     
     */
    public Messages getMessages() {
        return messages;
    }

    /**
     * Sets the value of the messages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Messages }
     *     
     */
    public void setMessages(Messages value) {
        this.messages = value;
    }

    /**
     * Gets the value of the tenderList property.
     * 
     * @return
     *     possible object is
     *     {@link TenderList }
     *     
     */
    public TenderList getTenderList() {
        return tenderList;
    }

    /**
     * Sets the value of the tenderList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TenderList }
     *     
     */
    public void setTenderList(TenderList value) {
        this.tenderList = value;
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

}
