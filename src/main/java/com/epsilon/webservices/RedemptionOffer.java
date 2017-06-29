
package com.epsilon.webservices;

import java.math.BigDecimal;
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
 *         &lt;element name="OfferCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RedemptionMultiplier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OfferPointsRedeemed" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="RedeemedPointsOriginalDollarValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="RedeemedPointsXRDollarValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="RedeemedXRPointsWorth" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="RedemptionCapDollarValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="OfferType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RedemptionOfferMultiplierAndCapTxt" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MemberOwnPointsRedeemed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DollarValueOfMemberOwnPointsRedeemed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SurprisePointsRedeemed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DollarValueOfSurprisePointsRedeemed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OfferDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OfferTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OfferEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LegalCopy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "offerCode",
    "redemptionMultiplier",
    "offerPointsRedeemed",
    "redeemedPointsOriginalDollarValue",
    "redeemedPointsXRDollarValue",
    "redeemedXRPointsWorth",
    "redemptionCapDollarValue",
    "offerType",
    "redemptionOfferMultiplierAndCapTxt",
    "memberOwnPointsRedeemed",
    "dollarValueOfMemberOwnPointsRedeemed",
    "surprisePointsRedeemed",
    "dollarValueOfSurprisePointsRedeemed",
    "offerDescription",
    "offerTitle",
    "offerEndDate",
    "legalCopy"
})
@XmlRootElement(name = "RedemptionOffer")
public class RedemptionOffer {

    @XmlElement(name = "OfferCode", required = true)
    protected String offerCode;
    @XmlElement(name = "RedemptionMultiplier", required = true)
    protected String redemptionMultiplier;
    @XmlElement(name = "OfferPointsRedeemed")
    protected BigInteger offerPointsRedeemed;
    @XmlElement(name = "RedeemedPointsOriginalDollarValue")
    protected BigDecimal redeemedPointsOriginalDollarValue;
    @XmlElement(name = "RedeemedPointsXRDollarValue")
    protected BigDecimal redeemedPointsXRDollarValue;
    @XmlElement(name = "RedeemedXRPointsWorth")
    protected BigInteger redeemedXRPointsWorth;
    @XmlElement(name = "RedemptionCapDollarValue")
    protected BigDecimal redemptionCapDollarValue;
    @XmlElement(name = "OfferType", required = true)
    protected String offerType;
    @XmlElement(name = "RedemptionOfferMultiplierAndCapTxt", required = true)
    protected String redemptionOfferMultiplierAndCapTxt;
    @XmlElement(name = "MemberOwnPointsRedeemed")
    protected String memberOwnPointsRedeemed;
    @XmlElement(name = "DollarValueOfMemberOwnPointsRedeemed")
    protected String dollarValueOfMemberOwnPointsRedeemed;
    @XmlElement(name = "SurprisePointsRedeemed")
    protected String surprisePointsRedeemed;
    @XmlElement(name = "DollarValueOfSurprisePointsRedeemed")
    protected String dollarValueOfSurprisePointsRedeemed;
    @XmlElement(name = "OfferDescription")
    protected String offerDescription;
    @XmlElement(name = "OfferTitle")
    protected String offerTitle;
    @XmlElement(name = "OfferEndDate")
    protected String offerEndDate;
    @XmlElement(name = "LegalCopy")
    protected String legalCopy;

    /**
     * Gets the value of the offerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferCode() {
        return offerCode;
    }

    /**
     * Sets the value of the offerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferCode(String value) {
        this.offerCode = value;
    }

    /**
     * Gets the value of the redemptionMultiplier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedemptionMultiplier() {
        return redemptionMultiplier;
    }

    /**
     * Sets the value of the redemptionMultiplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedemptionMultiplier(String value) {
        this.redemptionMultiplier = value;
    }

    /**
     * Gets the value of the offerPointsRedeemed property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOfferPointsRedeemed() {
        return offerPointsRedeemed;
    }

    /**
     * Sets the value of the offerPointsRedeemed property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOfferPointsRedeemed(BigInteger value) {
        this.offerPointsRedeemed = value;
    }

    /**
     * Gets the value of the redeemedPointsOriginalDollarValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRedeemedPointsOriginalDollarValue() {
        return redeemedPointsOriginalDollarValue;
    }

    /**
     * Sets the value of the redeemedPointsOriginalDollarValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRedeemedPointsOriginalDollarValue(BigDecimal value) {
        this.redeemedPointsOriginalDollarValue = value;
    }

    /**
     * Gets the value of the redeemedPointsXRDollarValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRedeemedPointsXRDollarValue() {
        return redeemedPointsXRDollarValue;
    }

    /**
     * Sets the value of the redeemedPointsXRDollarValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRedeemedPointsXRDollarValue(BigDecimal value) {
        this.redeemedPointsXRDollarValue = value;
    }

    /**
     * Gets the value of the redeemedXRPointsWorth property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRedeemedXRPointsWorth() {
        return redeemedXRPointsWorth;
    }

    /**
     * Sets the value of the redeemedXRPointsWorth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRedeemedXRPointsWorth(BigInteger value) {
        this.redeemedXRPointsWorth = value;
    }

    /**
     * Gets the value of the redemptionCapDollarValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRedemptionCapDollarValue() {
        return redemptionCapDollarValue;
    }

    /**
     * Sets the value of the redemptionCapDollarValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRedemptionCapDollarValue(BigDecimal value) {
        this.redemptionCapDollarValue = value;
    }

    /**
     * Gets the value of the offerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferType() {
        return offerType;
    }

    /**
     * Sets the value of the offerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferType(String value) {
        this.offerType = value;
    }

    /**
     * Gets the value of the redemptionOfferMultiplierAndCapTxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedemptionOfferMultiplierAndCapTxt() {
        return redemptionOfferMultiplierAndCapTxt;
    }

    /**
     * Sets the value of the redemptionOfferMultiplierAndCapTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedemptionOfferMultiplierAndCapTxt(String value) {
        this.redemptionOfferMultiplierAndCapTxt = value;
    }

    /**
     * Gets the value of the memberOwnPointsRedeemed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberOwnPointsRedeemed() {
        return memberOwnPointsRedeemed;
    }

    /**
     * Sets the value of the memberOwnPointsRedeemed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberOwnPointsRedeemed(String value) {
        this.memberOwnPointsRedeemed = value;
    }

    /**
     * Gets the value of the dollarValueOfMemberOwnPointsRedeemed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDollarValueOfMemberOwnPointsRedeemed() {
        return dollarValueOfMemberOwnPointsRedeemed;
    }

    /**
     * Sets the value of the dollarValueOfMemberOwnPointsRedeemed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDollarValueOfMemberOwnPointsRedeemed(String value) {
        this.dollarValueOfMemberOwnPointsRedeemed = value;
    }

    /**
     * Gets the value of the surprisePointsRedeemed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurprisePointsRedeemed() {
        return surprisePointsRedeemed;
    }

    /**
     * Sets the value of the surprisePointsRedeemed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurprisePointsRedeemed(String value) {
        this.surprisePointsRedeemed = value;
    }

    /**
     * Gets the value of the dollarValueOfSurprisePointsRedeemed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDollarValueOfSurprisePointsRedeemed() {
        return dollarValueOfSurprisePointsRedeemed;
    }

    /**
     * Sets the value of the dollarValueOfSurprisePointsRedeemed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDollarValueOfSurprisePointsRedeemed(String value) {
        this.dollarValueOfSurprisePointsRedeemed = value;
    }

    /**
     * Gets the value of the offerDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferDescription() {
        return offerDescription;
    }

    /**
     * Sets the value of the offerDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferDescription(String value) {
        this.offerDescription = value;
    }

    /**
     * Gets the value of the offerTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferTitle() {
        return offerTitle;
    }

    /**
     * Sets the value of the offerTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferTitle(String value) {
        this.offerTitle = value;
    }

    /**
     * Gets the value of the offerEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferEndDate() {
        return offerEndDate;
    }

    /**
     * Sets the value of the offerEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferEndDate(String value) {
        this.offerEndDate = value;
    }

    /**
     * Gets the value of the legalCopy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalCopy() {
        return legalCopy;
    }

    /**
     * Sets the value of the legalCopy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalCopy(String value) {
        this.legalCopy = value;
    }

}
