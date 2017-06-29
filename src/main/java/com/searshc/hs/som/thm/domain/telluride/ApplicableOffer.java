
package com.searshc.hs.som.thm.domain.telluride;

import java.math.BigDecimal;
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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Conditional" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="Stackable" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="OfferRewardType" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="RewardBasis" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="RewardCalculationType" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="OfferCode" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="OfferName" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="StartDTTM" type="{http://www.w3.org/2001/XMLSchema}dateTime" form="qualified"/>
 *         &lt;element name="EndDTTM" type="{http://www.w3.org/2001/XMLSchema}dateTime" form="qualified"/>
 *         &lt;element name="BenefitType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="BenefitCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="RedemptionMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="ApproximateRetailValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="CostToBusiness" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="BenefitUsageDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="ThirdPartyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="ThirdPartyURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="OnlineContent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="ImageURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="CouponNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="AlreadySelected" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="AvailableForRedeem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="MemberTimesRedeemed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="MemberTimesAvailable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="OfferCap" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="OfferTimesRedeemed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="OfferTimesAvailable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}VIPTiers" minOccurs="0"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}RedemptionDetails" minOccurs="0"/>
 *         &lt;element name="OfferRewardPotential" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="XRFlatOffer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="XRMultiplier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}Rules" maxOccurs="unbounded" minOccurs="0"/>
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
    "rules"
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

}
