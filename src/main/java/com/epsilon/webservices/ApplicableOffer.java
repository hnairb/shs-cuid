
package com.epsilon.webservices;

import java.math.BigDecimal;
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
 *         &lt;element name="Conditional" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Stackable" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OfferRewardType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RewardBasis" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RewardCalculationType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OfferCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OfferName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="StartDTTM" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="EndDTTM" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element ref="{http://www.epsilon.com/webservices/}AdditionalOfferAttributes" minOccurs="0"/&gt;
 *         &lt;element name="BenefitType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BenefitCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RedemptionMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ApproximateRetailValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="CostToBusiness" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="BenefitUsageDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ThirdPartyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ThirdPartyURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OnlineContent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ImageURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CouponNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CouponPointValue" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="ItemNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Division" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PartnerCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AlreadySelected" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AvailableForRedeem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MemberTimesRedeemed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MemberTimesAvailable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OfferCap" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OfferTimesRedeemed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OfferTimesAvailable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.epsilon.com/webservices/}VIPTiers" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.epsilon.com/webservices/}RedemptionDetails" minOccurs="0"/&gt;
 *         &lt;element name="OfferRewardPotential" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="XRFlatOffer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="XRMultiplier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.epsilon.com/webservices/}Rules" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.epsilon.com/webservices/}Codes" minOccurs="0"/&gt;
 *         &lt;element name="SywActionUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Eligibility" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BenefitSubType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BenefitLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CouponImageUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PrdCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PrdSubCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ActionURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "conditional",
    "stackable",
    "offerRewardType",
    "rewardBasis",
    "rewardCalculationType",
    "offerCode",
    "offerName",
    "description",
    "startDTTM",
    "endDTTM",
    "additionalOfferAttributes",
    "benefitType",
    "benefitCategory",
    "redemptionMode",
    "approximateRetailValue",
    "costToBusiness",
    "benefitUsageDetails",
    "thirdPartyName",
    "thirdPartyURL",
    "onlineContent",
    "imageURL",
    "couponNumber",
    "couponPointValue",
    "itemNumber",
    "division",
    "partnerCode",
    "alreadySelected",
    "availableForRedeem",
    "memberTimesRedeemed",
    "memberTimesAvailable",
    "offerCap",
    "offerTimesRedeemed",
    "offerTimesAvailable",
    "vipTiers",
    "redemptionDetails",
    "offerRewardPotential",
    "xrFlatOffer",
    "xrMultiplier",
    "rules",
    "codes",
    "sywActionUrl",
    "eligibility",
    "benefitSubType",
    "benefitLabel",
    "couponImageUrl",
    "prdCategory",
    "prdSubCategory",
    "actionURL",
    "offerDescription",
    "offerTitle",
    "offerEndDate",
    "legalCopy"
})
@XmlRootElement(name = "ApplicableOffer")
public class ApplicableOffer {

    @XmlElement(name = "Conditional", required = true)
    protected String conditional;
    @XmlElement(name = "Stackable", required = true)
    protected String stackable;
    @XmlElement(name = "OfferRewardType", required = true)
    protected String offerRewardType;
    @XmlElement(name = "RewardBasis", required = true)
    protected String rewardBasis;
    @XmlElement(name = "RewardCalculationType", required = true)
    protected String rewardCalculationType;
    @XmlElement(name = "OfferCode", required = true)
    protected String offerCode;
    @XmlElement(name = "OfferName", required = true)
    protected String offerName;
    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(name = "StartDTTM", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDTTM;
    @XmlElement(name = "EndDTTM", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDTTM;
    @XmlElement(name = "AdditionalOfferAttributes")
    protected AdditionalOfferAttributes additionalOfferAttributes;
    @XmlElement(name = "BenefitType")
    protected String benefitType;
    @XmlElement(name = "BenefitCategory")
    protected String benefitCategory;
    @XmlElement(name = "RedemptionMode")
    protected String redemptionMode;
    @XmlElement(name = "ApproximateRetailValue")
    protected BigDecimal approximateRetailValue;
    @XmlElement(name = "CostToBusiness")
    protected BigDecimal costToBusiness;
    @XmlElement(name = "BenefitUsageDetails")
    protected String benefitUsageDetails;
    @XmlElement(name = "ThirdPartyName")
    protected String thirdPartyName;
    @XmlElement(name = "ThirdPartyURL")
    protected String thirdPartyURL;
    @XmlElement(name = "OnlineContent")
    protected String onlineContent;
    @XmlElement(name = "ImageURL")
    protected String imageURL;
    @XmlElement(name = "CouponNumber")
    protected String couponNumber;
    @XmlElement(name = "CouponPointValue")
    protected BigInteger couponPointValue;
    @XmlElement(name = "ItemNumber")
    protected String itemNumber;
    @XmlElement(name = "Division")
    protected String division;
    @XmlElement(name = "PartnerCode")
    protected String partnerCode;
    @XmlElement(name = "AlreadySelected")
    protected String alreadySelected;
    @XmlElement(name = "AvailableForRedeem")
    protected String availableForRedeem;
    @XmlElement(name = "MemberTimesRedeemed")
    protected String memberTimesRedeemed;
    @XmlElement(name = "MemberTimesAvailable")
    protected String memberTimesAvailable;
    @XmlElement(name = "OfferCap")
    protected String offerCap;
    @XmlElement(name = "OfferTimesRedeemed")
    protected String offerTimesRedeemed;
    @XmlElement(name = "OfferTimesAvailable")
    protected String offerTimesAvailable;
    @XmlElement(name = "VIPTiers")
    protected VIPTiers vipTiers;
    @XmlElement(name = "RedemptionDetails")
    protected RedemptionDetails redemptionDetails;
    @XmlElement(name = "OfferRewardPotential")
    protected String offerRewardPotential;
    @XmlElement(name = "XRFlatOffer")
    protected String xrFlatOffer;
    @XmlElement(name = "XRMultiplier")
    protected String xrMultiplier;
    @XmlElement(name = "Rules")
    protected List<Rules> rules;
    @XmlElement(name = "Codes")
    protected Codes codes;
    @XmlElement(name = "SywActionUrl")
    protected String sywActionUrl;
    @XmlElement(name = "Eligibility")
    protected String eligibility;
    @XmlElement(name = "BenefitSubType")
    protected String benefitSubType;
    @XmlElement(name = "BenefitLabel")
    protected String benefitLabel;
    @XmlElement(name = "CouponImageUrl")
    protected String couponImageUrl;
    @XmlElement(name = "PrdCategory")
    protected String prdCategory;
    @XmlElement(name = "PrdSubCategory")
    protected String prdSubCategory;
    @XmlElement(name = "ActionURL")
    protected String actionURL;
    @XmlElement(name = "OfferDescription")
    protected String offerDescription;
    @XmlElement(name = "OfferTitle")
    protected String offerTitle;
    @XmlElement(name = "OfferEndDate")
    protected String offerEndDate;
    @XmlElement(name = "LegalCopy")
    protected String legalCopy;

    /**
     * Gets the value of the conditional property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConditional() {
        return conditional;
    }

    /**
     * Sets the value of the conditional property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConditional(String value) {
        this.conditional = value;
    }

    /**
     * Gets the value of the stackable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStackable() {
        return stackable;
    }

    /**
     * Sets the value of the stackable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStackable(String value) {
        this.stackable = value;
    }

    /**
     * Gets the value of the offerRewardType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferRewardType() {
        return offerRewardType;
    }

    /**
     * Sets the value of the offerRewardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferRewardType(String value) {
        this.offerRewardType = value;
    }

    /**
     * Gets the value of the rewardBasis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRewardBasis() {
        return rewardBasis;
    }

    /**
     * Sets the value of the rewardBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRewardBasis(String value) {
        this.rewardBasis = value;
    }

    /**
     * Gets the value of the rewardCalculationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRewardCalculationType() {
        return rewardCalculationType;
    }

    /**
     * Sets the value of the rewardCalculationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRewardCalculationType(String value) {
        this.rewardCalculationType = value;
    }

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
     * Gets the value of the offerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferName() {
        return offerName;
    }

    /**
     * Sets the value of the offerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferName(String value) {
        this.offerName = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the startDTTM property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDTTM() {
        return startDTTM;
    }

    /**
     * Sets the value of the startDTTM property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDTTM(XMLGregorianCalendar value) {
        this.startDTTM = value;
    }

    /**
     * Gets the value of the endDTTM property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDTTM() {
        return endDTTM;
    }

    /**
     * Sets the value of the endDTTM property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDTTM(XMLGregorianCalendar value) {
        this.endDTTM = value;
    }

    /**
     * Gets the value of the additionalOfferAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalOfferAttributes }
     *     
     */
    public AdditionalOfferAttributes getAdditionalOfferAttributes() {
        return additionalOfferAttributes;
    }

    /**
     * Sets the value of the additionalOfferAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalOfferAttributes }
     *     
     */
    public void setAdditionalOfferAttributes(AdditionalOfferAttributes value) {
        this.additionalOfferAttributes = value;
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
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getApproximateRetailValue() {
        return approximateRetailValue;
    }

    /**
     * Sets the value of the approximateRetailValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setApproximateRetailValue(BigDecimal value) {
        this.approximateRetailValue = value;
    }

    /**
     * Gets the value of the costToBusiness property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCostToBusiness() {
        return costToBusiness;
    }

    /**
     * Sets the value of the costToBusiness property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCostToBusiness(BigDecimal value) {
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
     * Gets the value of the onlineContent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnlineContent() {
        return onlineContent;
    }

    /**
     * Sets the value of the onlineContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnlineContent(String value) {
        this.onlineContent = value;
    }

    /**
     * Gets the value of the imageURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageURL() {
        return imageURL;
    }

    /**
     * Sets the value of the imageURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageURL(String value) {
        this.imageURL = value;
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
     * Gets the value of the couponPointValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCouponPointValue() {
        return couponPointValue;
    }

    /**
     * Sets the value of the couponPointValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCouponPointValue(BigInteger value) {
        this.couponPointValue = value;
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
     * Gets the value of the partnerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerCode() {
        return partnerCode;
    }

    /**
     * Sets the value of the partnerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerCode(String value) {
        this.partnerCode = value;
    }

    /**
     * Gets the value of the alreadySelected property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlreadySelected() {
        return alreadySelected;
    }

    /**
     * Sets the value of the alreadySelected property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlreadySelected(String value) {
        this.alreadySelected = value;
    }

    /**
     * Gets the value of the availableForRedeem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvailableForRedeem() {
        return availableForRedeem;
    }

    /**
     * Sets the value of the availableForRedeem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvailableForRedeem(String value) {
        this.availableForRedeem = value;
    }

    /**
     * Gets the value of the memberTimesRedeemed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberTimesRedeemed() {
        return memberTimesRedeemed;
    }

    /**
     * Sets the value of the memberTimesRedeemed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberTimesRedeemed(String value) {
        this.memberTimesRedeemed = value;
    }

    /**
     * Gets the value of the memberTimesAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberTimesAvailable() {
        return memberTimesAvailable;
    }

    /**
     * Sets the value of the memberTimesAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberTimesAvailable(String value) {
        this.memberTimesAvailable = value;
    }

    /**
     * Gets the value of the offerCap property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferCap() {
        return offerCap;
    }

    /**
     * Sets the value of the offerCap property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferCap(String value) {
        this.offerCap = value;
    }

    /**
     * Gets the value of the offerTimesRedeemed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferTimesRedeemed() {
        return offerTimesRedeemed;
    }

    /**
     * Sets the value of the offerTimesRedeemed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferTimesRedeemed(String value) {
        this.offerTimesRedeemed = value;
    }

    /**
     * Gets the value of the offerTimesAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferTimesAvailable() {
        return offerTimesAvailable;
    }

    /**
     * Sets the value of the offerTimesAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferTimesAvailable(String value) {
        this.offerTimesAvailable = value;
    }

    /**
     * Gets the value of the vipTiers property.
     * 
     * @return
     *     possible object is
     *     {@link VIPTiers }
     *     
     */
    public VIPTiers getVIPTiers() {
        return vipTiers;
    }

    /**
     * Sets the value of the vipTiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link VIPTiers }
     *     
     */
    public void setVIPTiers(VIPTiers value) {
        this.vipTiers = value;
    }

    /**
     * Gets the value of the redemptionDetails property.
     * 
     * @return
     *     possible object is
     *     {@link RedemptionDetails }
     *     
     */
    public RedemptionDetails getRedemptionDetails() {
        return redemptionDetails;
    }

    /**
     * Sets the value of the redemptionDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link RedemptionDetails }
     *     
     */
    public void setRedemptionDetails(RedemptionDetails value) {
        this.redemptionDetails = value;
    }

    /**
     * Gets the value of the offerRewardPotential property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferRewardPotential() {
        return offerRewardPotential;
    }

    /**
     * Sets the value of the offerRewardPotential property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferRewardPotential(String value) {
        this.offerRewardPotential = value;
    }

    /**
     * Gets the value of the xrFlatOffer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXRFlatOffer() {
        return xrFlatOffer;
    }

    /**
     * Sets the value of the xrFlatOffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXRFlatOffer(String value) {
        this.xrFlatOffer = value;
    }

    /**
     * Gets the value of the xrMultiplier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXRMultiplier() {
        return xrMultiplier;
    }

    /**
     * Sets the value of the xrMultiplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXRMultiplier(String value) {
        this.xrMultiplier = value;
    }

    /**
     * Gets the value of the rules property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rules property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRules().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Rules }
     * 
     * 
     */
    public List<Rules> getRules() {
        if (rules == null) {
            rules = new ArrayList<Rules>();
        }
        return this.rules;
    }

    /**
     * Gets the value of the codes property.
     * 
     * @return
     *     possible object is
     *     {@link Codes }
     *     
     */
    public Codes getCodes() {
        return codes;
    }

    /**
     * Sets the value of the codes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Codes }
     *     
     */
    public void setCodes(Codes value) {
        this.codes = value;
    }

    /**
     * Gets the value of the sywActionUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSywActionUrl() {
        return sywActionUrl;
    }

    /**
     * Sets the value of the sywActionUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSywActionUrl(String value) {
        this.sywActionUrl = value;
    }

    /**
     * Gets the value of the eligibility property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEligibility() {
        return eligibility;
    }

    /**
     * Sets the value of the eligibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEligibility(String value) {
        this.eligibility = value;
    }

    /**
     * Gets the value of the benefitSubType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBenefitSubType() {
        return benefitSubType;
    }

    /**
     * Sets the value of the benefitSubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBenefitSubType(String value) {
        this.benefitSubType = value;
    }

    /**
     * Gets the value of the benefitLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBenefitLabel() {
        return benefitLabel;
    }

    /**
     * Sets the value of the benefitLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBenefitLabel(String value) {
        this.benefitLabel = value;
    }

    /**
     * Gets the value of the couponImageUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCouponImageUrl() {
        return couponImageUrl;
    }

    /**
     * Sets the value of the couponImageUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCouponImageUrl(String value) {
        this.couponImageUrl = value;
    }

    /**
     * Gets the value of the prdCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrdCategory() {
        return prdCategory;
    }

    /**
     * Sets the value of the prdCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrdCategory(String value) {
        this.prdCategory = value;
    }

    /**
     * Gets the value of the prdSubCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrdSubCategory() {
        return prdSubCategory;
    }

    /**
     * Sets the value of the prdSubCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrdSubCategory(String value) {
        this.prdSubCategory = value;
    }

    /**
     * Gets the value of the actionURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionURL() {
        return actionURL;
    }

    /**
     * Sets the value of the actionURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionURL(String value) {
        this.actionURL = value;
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
