
package com.epsilon.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element ref="{http://www.epsilon.com/webservices/}GetMemberPrimaryProfileReply"/&gt;
 *         &lt;element ref="{http://www.epsilon.com/webservices/}GetMemberExtendedProfileReply"/&gt;
 *         &lt;element ref="{http://www.epsilon.com/webservices/}GetMemberAffinitySubscriptionsReply"/&gt;
 *         &lt;element ref="{http://www.epsilon.com/webservices/}GetMemberLookupReply"/&gt;
 *         &lt;element name="GetMemberTargetedOffersReply"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CardNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="StartDTTM" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="EndDTTM" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element ref="{http://www.epsilon.com/webservices/}Offers"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://www.epsilon.com/webservices/}GetRewardBalanceReply"/&gt;
 *         &lt;element ref="{http://www.epsilon.com/webservices/}GetPartnerEnrollmentDetailsReply"/&gt;
 *         &lt;element ref="{http://www.epsilon.com/webservices/}MemberReplaceCardReply"/&gt;
 *         &lt;element ref="{http://www.epsilon.com/webservices/}MemberMergeReplaceReply"/&gt;
 *         &lt;element ref="{http://www.epsilon.com/webservices/}GetMemberLevelReply"/&gt;
 *         &lt;element ref="{http://www.epsilon.com/webservices/}GetSystemRewardsReply"/&gt;
 *         &lt;element ref="{http://www.epsilon.com/webservices/}GetAvailableOffersReply"/&gt;
 *         &lt;element ref="{http://www.epsilon.com/webservices/}GetTransactionBonusDetailsReply"/&gt;
 *         &lt;element ref="{http://www.epsilon.com/webservices/}GetLineItemDetailReply"/&gt;
 *         &lt;element ref="{http://www.epsilon.com/webservices/}GetMemberActivityReply"/&gt;
 *         &lt;element ref="{http://www.epsilon.com/webservices/}GetMemberActivityDetailReply"/&gt;
 *         &lt;element ref="{http://www.epsilon.com/webservices/}PostExternalBonusReply"/&gt;
 *         &lt;element ref="{http://www.epsilon.com/webservices/}ProcessTransactionReply"/&gt;
 *         &lt;element ref="{http://www.epsilon.com/webservices/}ProcessRedemptionReply"/&gt;
 *         &lt;element ref="{http://www.epsilon.com/webservices/}RedemptionReply" minOccurs="0"/&gt;
 *         &lt;element name="PartnerEnrollmentDetailsResponse"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="StatusCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="StatusText" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://www.epsilon.com/webservices/}RequestMissingTransactionReply"/&gt;
 *         &lt;element ref="{http://www.epsilon.com/webservices/}PostAdjustmentPointsReply"/&gt;
 *         &lt;element ref="{http://www.epsilon.com/webservices/}PostPartnerPointsReply"/&gt;
 *         &lt;element name="MemberNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{http://www.epsilon.com/webservices/}ProcessAlternateCouponReply"/&gt;
 *         &lt;element ref="{http://www.epsilon.com/webservices/}ErrorDesc"/&gt;
 *         &lt;element ref="{http://www.epsilon.com/webservices/}Affinities"/&gt;
 *         &lt;element ref="{http://www.epsilon.com/webservices/}AddMemberToGroupReply"/&gt;
 *         &lt;element ref="{http://www.epsilon.com/webservices/}OfferRegistrationReply"/&gt;
 *         &lt;element ref="{http://www.epsilon.com/webservices/}GetMemberAuditLookupReply"/&gt;
 *         &lt;element ref="{http://www.epsilon.com/webservices/}GetCouponOfferDetailsReply"/&gt;
 *         &lt;element ref="{http://www.epsilon.com/webservices/}GetOrderTransactionsDetailReply"/&gt;
 *         &lt;element ref="{http://www.epsilon.com/webservices/}GetApplicableOffersReply"/&gt;
 *         &lt;element ref="{http://www.epsilon.com/webservices/}AvailCouponReply"/&gt;
 *         &lt;element ref="{http://www.epsilon.com/webservices/}SendEmailReply"/&gt;
 *         &lt;element ref="{http://www.epsilon.com/webservices/}GetMemberPromptsReply"/&gt;
 *         &lt;element ref="{http://www.epsilon.com/webservices/}UpdateMemberPromptsReply"/&gt;
 *         &lt;element ref="{http://www.epsilon.com/webservices/}RealtimeEmailValReply"/&gt;
 *         &lt;element name="RealTimeEmailVald" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{http://www.epsilon.com/webservices/}OfferIssuanceReply"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ErrorType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getMemberPrimaryProfileReply",
    "getMemberExtendedProfileReply",
    "getMemberAffinitySubscriptionsReply",
    "getMemberLookupReply",
    "getMemberTargetedOffersReply",
    "getRewardBalanceReply",
    "getPartnerEnrollmentDetailsReply",
    "memberReplaceCardReply",
    "memberMergeReplaceReply",
    "getMemberLevelReply",
    "getSystemRewardsReply",
    "getAvailableOffersReply",
    "getTransactionBonusDetailsReply",
    "getLineItemDetailReply",
    "getMemberActivityReply",
    "getMemberActivityDetailReply",
    "postExternalBonusReply",
    "processTransactionReply",
    "processRedemptionReply",
    "redemptionReply",
    "partnerEnrollmentDetailsResponse",
    "requestMissingTransactionReply",
    "postAdjustmentPointsReply",
    "postPartnerPointsReply",
    "memberNumber",
    "processAlternateCouponReply",
    "errorDesc",
    "affinities",
    "addMemberToGroupReply",
    "offerRegistrationReply",
    "getMemberAuditLookupReply",
    "getCouponOfferDetailsReply",
    "getOrderTransactionsDetailReply",
    "getApplicableOffersReply",
    "availCouponReply",
    "sendEmailReply",
    "getMemberPromptsReply",
    "updateMemberPromptsReply",
    "realtimeEmailValReply",
    "realTimeEmailVald",
    "offerIssuanceReply"
})
@XmlRootElement(name = "Response")
public class Response {

    @XmlElement(name = "GetMemberPrimaryProfileReply", required = true)
    protected GetMemberPrimaryProfileReply getMemberPrimaryProfileReply;
    @XmlElement(name = "GetMemberExtendedProfileReply", required = true)
    protected GetMemberExtendedProfileReply getMemberExtendedProfileReply;
    @XmlElement(name = "GetMemberAffinitySubscriptionsReply", required = true)
    protected GetMemberAffinitySubscriptionsReply getMemberAffinitySubscriptionsReply;
    @XmlElement(name = "GetMemberLookupReply", required = true)
    protected GetMemberLookupReply getMemberLookupReply;
    @XmlElement(name = "GetMemberTargetedOffersReply", required = true)
    protected Response.GetMemberTargetedOffersReply getMemberTargetedOffersReply;
    @XmlElement(name = "GetRewardBalanceReply", required = true)
    protected GetRewardBalanceReply getRewardBalanceReply;
    @XmlElement(name = "GetPartnerEnrollmentDetailsReply", required = true)
    protected GetPartnerEnrollmentDetailsReply getPartnerEnrollmentDetailsReply;
    @XmlElement(name = "MemberReplaceCardReply", required = true)
    protected MemberReplaceCardReply memberReplaceCardReply;
    @XmlElement(name = "MemberMergeReplaceReply", required = true)
    protected MemberMergeReplaceReply memberMergeReplaceReply;
    @XmlElement(name = "GetMemberLevelReply", required = true)
    protected GetMemberLevelReply getMemberLevelReply;
    @XmlElement(name = "GetSystemRewardsReply", required = true)
    protected GetSystemRewardsReply getSystemRewardsReply;
    @XmlElement(name = "GetAvailableOffersReply", required = true)
    protected GetAvailableOffersReply getAvailableOffersReply;
    @XmlElement(name = "GetTransactionBonusDetailsReply", required = true)
    protected GetTransactionBonusDetailsReply getTransactionBonusDetailsReply;
    @XmlElement(name = "GetLineItemDetailReply", required = true)
    protected GetLineItemDetailReply getLineItemDetailReply;
    @XmlElement(name = "GetMemberActivityReply", required = true)
    protected GetMemberActivityReply getMemberActivityReply;
    @XmlElement(name = "GetMemberActivityDetailReply", required = true)
    protected GetMemberActivityDetailReply getMemberActivityDetailReply;
    @XmlElement(name = "PostExternalBonusReply", required = true)
    protected PostExternalBonusReply postExternalBonusReply;
    @XmlElement(name = "ProcessTransactionReply", required = true)
    protected ProcessTransactionReply processTransactionReply;
    @XmlElement(name = "ProcessRedemptionReply", required = true)
    protected ProcessRedemptionReply processRedemptionReply;
    @XmlElement(name = "RedemptionReply")
    protected RedemptionReply redemptionReply;
    @XmlElement(name = "PartnerEnrollmentDetailsResponse", required = true)
    protected Response.PartnerEnrollmentDetailsResponse partnerEnrollmentDetailsResponse;
    @XmlElement(name = "RequestMissingTransactionReply", required = true)
    protected RequestMissingTransactionReply requestMissingTransactionReply;
    @XmlElement(name = "PostAdjustmentPointsReply", required = true)
    protected PostAdjustmentPointsReply postAdjustmentPointsReply;
    @XmlElement(name = "PostPartnerPointsReply", required = true)
    protected PostPartnerPointsReply postPartnerPointsReply;
    @XmlElement(name = "MemberNumber", required = true)
    protected String memberNumber;
    @XmlElement(name = "ProcessAlternateCouponReply", required = true)
    protected ProcessAlternateCouponReply processAlternateCouponReply;
    @XmlElement(name = "ErrorDesc", required = true)
    protected ErrorDesc errorDesc;
    @XmlElement(name = "Affinities", required = true)
    protected Affinities affinities;
    @XmlElement(name = "AddMemberToGroupReply", required = true)
    protected AddMemberToGroupReply addMemberToGroupReply;
    @XmlElement(name = "OfferRegistrationReply", required = true)
    protected OfferRegistrationReply offerRegistrationReply;
    @XmlElement(name = "GetMemberAuditLookupReply", required = true)
    protected GetMemberAuditLookupReply getMemberAuditLookupReply;
    @XmlElement(name = "GetCouponOfferDetailsReply", required = true)
    protected GetCouponOfferDetailsReply getCouponOfferDetailsReply;
    @XmlElement(name = "GetOrderTransactionsDetailReply", required = true)
    protected GetOrderTransactionsDetailReply getOrderTransactionsDetailReply;
    @XmlElement(name = "GetApplicableOffersReply", required = true)
    protected GetApplicableOffersReply getApplicableOffersReply;
    @XmlElement(name = "AvailCouponReply", required = true)
    protected AvailCouponReply availCouponReply;
    @XmlElement(name = "SendEmailReply", required = true)
    protected SendEmailReply sendEmailReply;
    @XmlElement(name = "GetMemberPromptsReply", required = true)
    protected GetMemberPromptsReply getMemberPromptsReply;
    @XmlElement(name = "UpdateMemberPromptsReply", required = true)
    protected UpdateMemberPromptsReply updateMemberPromptsReply;
    @XmlElement(name = "RealtimeEmailValReply", required = true)
    protected RealtimeEmailValReply realtimeEmailValReply;
    @XmlElement(name = "RealTimeEmailVald", required = true)
    protected String realTimeEmailVald;
    @XmlElement(name = "OfferIssuanceReply", required = true)
    protected OfferIssuanceReply offerIssuanceReply;
    @XmlAttribute(name = "Type", required = true)
    protected String type;
    @XmlAttribute(name = "ErrorType", required = true)
    protected String errorType;

    /**
     * Gets the value of the getMemberPrimaryProfileReply property.
     * 
     * @return
     *     possible object is
     *     {@link GetMemberPrimaryProfileReply }
     *     
     */
    public GetMemberPrimaryProfileReply getGetMemberPrimaryProfileReply() {
        return getMemberPrimaryProfileReply;
    }

    /**
     * Sets the value of the getMemberPrimaryProfileReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetMemberPrimaryProfileReply }
     *     
     */
    public void setGetMemberPrimaryProfileReply(GetMemberPrimaryProfileReply value) {
        this.getMemberPrimaryProfileReply = value;
    }

    /**
     * Gets the value of the getMemberExtendedProfileReply property.
     * 
     * @return
     *     possible object is
     *     {@link GetMemberExtendedProfileReply }
     *     
     */
    public GetMemberExtendedProfileReply getGetMemberExtendedProfileReply() {
        return getMemberExtendedProfileReply;
    }

    /**
     * Sets the value of the getMemberExtendedProfileReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetMemberExtendedProfileReply }
     *     
     */
    public void setGetMemberExtendedProfileReply(GetMemberExtendedProfileReply value) {
        this.getMemberExtendedProfileReply = value;
    }

    /**
     * Gets the value of the getMemberAffinitySubscriptionsReply property.
     * 
     * @return
     *     possible object is
     *     {@link GetMemberAffinitySubscriptionsReply }
     *     
     */
    public GetMemberAffinitySubscriptionsReply getGetMemberAffinitySubscriptionsReply() {
        return getMemberAffinitySubscriptionsReply;
    }

    /**
     * Sets the value of the getMemberAffinitySubscriptionsReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetMemberAffinitySubscriptionsReply }
     *     
     */
    public void setGetMemberAffinitySubscriptionsReply(GetMemberAffinitySubscriptionsReply value) {
        this.getMemberAffinitySubscriptionsReply = value;
    }

    /**
     * Gets the value of the getMemberLookupReply property.
     * 
     * @return
     *     possible object is
     *     {@link GetMemberLookupReply }
     *     
     */
    public GetMemberLookupReply getGetMemberLookupReply() {
        return getMemberLookupReply;
    }

    /**
     * Sets the value of the getMemberLookupReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetMemberLookupReply }
     *     
     */
    public void setGetMemberLookupReply(GetMemberLookupReply value) {
        this.getMemberLookupReply = value;
    }

    /**
     * Gets the value of the getMemberTargetedOffersReply property.
     * 
     * @return
     *     possible object is
     *     {@link Response.GetMemberTargetedOffersReply }
     *     
     */
    public Response.GetMemberTargetedOffersReply getGetMemberTargetedOffersReply() {
        return getMemberTargetedOffersReply;
    }

    /**
     * Sets the value of the getMemberTargetedOffersReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link Response.GetMemberTargetedOffersReply }
     *     
     */
    public void setGetMemberTargetedOffersReply(Response.GetMemberTargetedOffersReply value) {
        this.getMemberTargetedOffersReply = value;
    }

    /**
     * Gets the value of the getRewardBalanceReply property.
     * 
     * @return
     *     possible object is
     *     {@link GetRewardBalanceReply }
     *     
     */
    public GetRewardBalanceReply getGetRewardBalanceReply() {
        return getRewardBalanceReply;
    }

    /**
     * Sets the value of the getRewardBalanceReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetRewardBalanceReply }
     *     
     */
    public void setGetRewardBalanceReply(GetRewardBalanceReply value) {
        this.getRewardBalanceReply = value;
    }

    /**
     * Gets the value of the getPartnerEnrollmentDetailsReply property.
     * 
     * @return
     *     possible object is
     *     {@link GetPartnerEnrollmentDetailsReply }
     *     
     */
    public GetPartnerEnrollmentDetailsReply getGetPartnerEnrollmentDetailsReply() {
        return getPartnerEnrollmentDetailsReply;
    }

    /**
     * Sets the value of the getPartnerEnrollmentDetailsReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetPartnerEnrollmentDetailsReply }
     *     
     */
    public void setGetPartnerEnrollmentDetailsReply(GetPartnerEnrollmentDetailsReply value) {
        this.getPartnerEnrollmentDetailsReply = value;
    }

    /**
     * Gets the value of the memberReplaceCardReply property.
     * 
     * @return
     *     possible object is
     *     {@link MemberReplaceCardReply }
     *     
     */
    public MemberReplaceCardReply getMemberReplaceCardReply() {
        return memberReplaceCardReply;
    }

    /**
     * Sets the value of the memberReplaceCardReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link MemberReplaceCardReply }
     *     
     */
    public void setMemberReplaceCardReply(MemberReplaceCardReply value) {
        this.memberReplaceCardReply = value;
    }

    /**
     * Gets the value of the memberMergeReplaceReply property.
     * 
     * @return
     *     possible object is
     *     {@link MemberMergeReplaceReply }
     *     
     */
    public MemberMergeReplaceReply getMemberMergeReplaceReply() {
        return memberMergeReplaceReply;
    }

    /**
     * Sets the value of the memberMergeReplaceReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link MemberMergeReplaceReply }
     *     
     */
    public void setMemberMergeReplaceReply(MemberMergeReplaceReply value) {
        this.memberMergeReplaceReply = value;
    }

    /**
     * Gets the value of the getMemberLevelReply property.
     * 
     * @return
     *     possible object is
     *     {@link GetMemberLevelReply }
     *     
     */
    public GetMemberLevelReply getGetMemberLevelReply() {
        return getMemberLevelReply;
    }

    /**
     * Sets the value of the getMemberLevelReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetMemberLevelReply }
     *     
     */
    public void setGetMemberLevelReply(GetMemberLevelReply value) {
        this.getMemberLevelReply = value;
    }

    /**
     * Gets the value of the getSystemRewardsReply property.
     * 
     * @return
     *     possible object is
     *     {@link GetSystemRewardsReply }
     *     
     */
    public GetSystemRewardsReply getGetSystemRewardsReply() {
        return getSystemRewardsReply;
    }

    /**
     * Sets the value of the getSystemRewardsReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSystemRewardsReply }
     *     
     */
    public void setGetSystemRewardsReply(GetSystemRewardsReply value) {
        this.getSystemRewardsReply = value;
    }

    /**
     * Gets the value of the getAvailableOffersReply property.
     * 
     * @return
     *     possible object is
     *     {@link GetAvailableOffersReply }
     *     
     */
    public GetAvailableOffersReply getGetAvailableOffersReply() {
        return getAvailableOffersReply;
    }

    /**
     * Sets the value of the getAvailableOffersReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetAvailableOffersReply }
     *     
     */
    public void setGetAvailableOffersReply(GetAvailableOffersReply value) {
        this.getAvailableOffersReply = value;
    }

    /**
     * Gets the value of the getTransactionBonusDetailsReply property.
     * 
     * @return
     *     possible object is
     *     {@link GetTransactionBonusDetailsReply }
     *     
     */
    public GetTransactionBonusDetailsReply getGetTransactionBonusDetailsReply() {
        return getTransactionBonusDetailsReply;
    }

    /**
     * Sets the value of the getTransactionBonusDetailsReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetTransactionBonusDetailsReply }
     *     
     */
    public void setGetTransactionBonusDetailsReply(GetTransactionBonusDetailsReply value) {
        this.getTransactionBonusDetailsReply = value;
    }

    /**
     * Gets the value of the getLineItemDetailReply property.
     * 
     * @return
     *     possible object is
     *     {@link GetLineItemDetailReply }
     *     
     */
    public GetLineItemDetailReply getGetLineItemDetailReply() {
        return getLineItemDetailReply;
    }

    /**
     * Sets the value of the getLineItemDetailReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetLineItemDetailReply }
     *     
     */
    public void setGetLineItemDetailReply(GetLineItemDetailReply value) {
        this.getLineItemDetailReply = value;
    }

    /**
     * Gets the value of the getMemberActivityReply property.
     * 
     * @return
     *     possible object is
     *     {@link GetMemberActivityReply }
     *     
     */
    public GetMemberActivityReply getGetMemberActivityReply() {
        return getMemberActivityReply;
    }

    /**
     * Sets the value of the getMemberActivityReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetMemberActivityReply }
     *     
     */
    public void setGetMemberActivityReply(GetMemberActivityReply value) {
        this.getMemberActivityReply = value;
    }

    /**
     * Gets the value of the getMemberActivityDetailReply property.
     * 
     * @return
     *     possible object is
     *     {@link GetMemberActivityDetailReply }
     *     
     */
    public GetMemberActivityDetailReply getGetMemberActivityDetailReply() {
        return getMemberActivityDetailReply;
    }

    /**
     * Sets the value of the getMemberActivityDetailReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetMemberActivityDetailReply }
     *     
     */
    public void setGetMemberActivityDetailReply(GetMemberActivityDetailReply value) {
        this.getMemberActivityDetailReply = value;
    }

    /**
     * Gets the value of the postExternalBonusReply property.
     * 
     * @return
     *     possible object is
     *     {@link PostExternalBonusReply }
     *     
     */
    public PostExternalBonusReply getPostExternalBonusReply() {
        return postExternalBonusReply;
    }

    /**
     * Sets the value of the postExternalBonusReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostExternalBonusReply }
     *     
     */
    public void setPostExternalBonusReply(PostExternalBonusReply value) {
        this.postExternalBonusReply = value;
    }

    /**
     * Gets the value of the processTransactionReply property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessTransactionReply }
     *     
     */
    public ProcessTransactionReply getProcessTransactionReply() {
        return processTransactionReply;
    }

    /**
     * Sets the value of the processTransactionReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessTransactionReply }
     *     
     */
    public void setProcessTransactionReply(ProcessTransactionReply value) {
        this.processTransactionReply = value;
    }

    /**
     * Gets the value of the processRedemptionReply property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessRedemptionReply }
     *     
     */
    public ProcessRedemptionReply getProcessRedemptionReply() {
        return processRedemptionReply;
    }

    /**
     * Sets the value of the processRedemptionReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessRedemptionReply }
     *     
     */
    public void setProcessRedemptionReply(ProcessRedemptionReply value) {
        this.processRedemptionReply = value;
    }

    /**
     * Gets the value of the redemptionReply property.
     * 
     * @return
     *     possible object is
     *     {@link RedemptionReply }
     *     
     */
    public RedemptionReply getRedemptionReply() {
        return redemptionReply;
    }

    /**
     * Sets the value of the redemptionReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link RedemptionReply }
     *     
     */
    public void setRedemptionReply(RedemptionReply value) {
        this.redemptionReply = value;
    }

    /**
     * Gets the value of the partnerEnrollmentDetailsResponse property.
     * 
     * @return
     *     possible object is
     *     {@link Response.PartnerEnrollmentDetailsResponse }
     *     
     */
    public Response.PartnerEnrollmentDetailsResponse getPartnerEnrollmentDetailsResponse() {
        return partnerEnrollmentDetailsResponse;
    }

    /**
     * Sets the value of the partnerEnrollmentDetailsResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Response.PartnerEnrollmentDetailsResponse }
     *     
     */
    public void setPartnerEnrollmentDetailsResponse(Response.PartnerEnrollmentDetailsResponse value) {
        this.partnerEnrollmentDetailsResponse = value;
    }

    /**
     * Gets the value of the requestMissingTransactionReply property.
     * 
     * @return
     *     possible object is
     *     {@link RequestMissingTransactionReply }
     *     
     */
    public RequestMissingTransactionReply getRequestMissingTransactionReply() {
        return requestMissingTransactionReply;
    }

    /**
     * Sets the value of the requestMissingTransactionReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestMissingTransactionReply }
     *     
     */
    public void setRequestMissingTransactionReply(RequestMissingTransactionReply value) {
        this.requestMissingTransactionReply = value;
    }

    /**
     * Gets the value of the postAdjustmentPointsReply property.
     * 
     * @return
     *     possible object is
     *     {@link PostAdjustmentPointsReply }
     *     
     */
    public PostAdjustmentPointsReply getPostAdjustmentPointsReply() {
        return postAdjustmentPointsReply;
    }

    /**
     * Sets the value of the postAdjustmentPointsReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostAdjustmentPointsReply }
     *     
     */
    public void setPostAdjustmentPointsReply(PostAdjustmentPointsReply value) {
        this.postAdjustmentPointsReply = value;
    }

    /**
     * Gets the value of the postPartnerPointsReply property.
     * 
     * @return
     *     possible object is
     *     {@link PostPartnerPointsReply }
     *     
     */
    public PostPartnerPointsReply getPostPartnerPointsReply() {
        return postPartnerPointsReply;
    }

    /**
     * Sets the value of the postPartnerPointsReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostPartnerPointsReply }
     *     
     */
    public void setPostPartnerPointsReply(PostPartnerPointsReply value) {
        this.postPartnerPointsReply = value;
    }

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
     * Gets the value of the processAlternateCouponReply property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessAlternateCouponReply }
     *     
     */
    public ProcessAlternateCouponReply getProcessAlternateCouponReply() {
        return processAlternateCouponReply;
    }

    /**
     * Sets the value of the processAlternateCouponReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessAlternateCouponReply }
     *     
     */
    public void setProcessAlternateCouponReply(ProcessAlternateCouponReply value) {
        this.processAlternateCouponReply = value;
    }

    /**
     * Gets the value of the errorDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorDesc }
     *     
     */
    public ErrorDesc getErrorDesc() {
        return errorDesc;
    }

    /**
     * Sets the value of the errorDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorDesc }
     *     
     */
    public void setErrorDesc(ErrorDesc value) {
        this.errorDesc = value;
    }

    /**
     * Gets the value of the affinities property.
     * 
     * @return
     *     possible object is
     *     {@link Affinities }
     *     
     */
    public Affinities getAffinities() {
        return affinities;
    }

    /**
     * Sets the value of the affinities property.
     * 
     * @param value
     *     allowed object is
     *     {@link Affinities }
     *     
     */
    public void setAffinities(Affinities value) {
        this.affinities = value;
    }

    /**
     * Gets the value of the addMemberToGroupReply property.
     * 
     * @return
     *     possible object is
     *     {@link AddMemberToGroupReply }
     *     
     */
    public AddMemberToGroupReply getAddMemberToGroupReply() {
        return addMemberToGroupReply;
    }

    /**
     * Sets the value of the addMemberToGroupReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddMemberToGroupReply }
     *     
     */
    public void setAddMemberToGroupReply(AddMemberToGroupReply value) {
        this.addMemberToGroupReply = value;
    }

    /**
     * Gets the value of the offerRegistrationReply property.
     * 
     * @return
     *     possible object is
     *     {@link OfferRegistrationReply }
     *     
     */
    public OfferRegistrationReply getOfferRegistrationReply() {
        return offerRegistrationReply;
    }

    /**
     * Sets the value of the offerRegistrationReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferRegistrationReply }
     *     
     */
    public void setOfferRegistrationReply(OfferRegistrationReply value) {
        this.offerRegistrationReply = value;
    }

    /**
     * Gets the value of the getMemberAuditLookupReply property.
     * 
     * @return
     *     possible object is
     *     {@link GetMemberAuditLookupReply }
     *     
     */
    public GetMemberAuditLookupReply getGetMemberAuditLookupReply() {
        return getMemberAuditLookupReply;
    }

    /**
     * Sets the value of the getMemberAuditLookupReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetMemberAuditLookupReply }
     *     
     */
    public void setGetMemberAuditLookupReply(GetMemberAuditLookupReply value) {
        this.getMemberAuditLookupReply = value;
    }

    /**
     * Gets the value of the getCouponOfferDetailsReply property.
     * 
     * @return
     *     possible object is
     *     {@link GetCouponOfferDetailsReply }
     *     
     */
    public GetCouponOfferDetailsReply getGetCouponOfferDetailsReply() {
        return getCouponOfferDetailsReply;
    }

    /**
     * Sets the value of the getCouponOfferDetailsReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCouponOfferDetailsReply }
     *     
     */
    public void setGetCouponOfferDetailsReply(GetCouponOfferDetailsReply value) {
        this.getCouponOfferDetailsReply = value;
    }

    /**
     * Gets the value of the getOrderTransactionsDetailReply property.
     * 
     * @return
     *     possible object is
     *     {@link GetOrderTransactionsDetailReply }
     *     
     */
    public GetOrderTransactionsDetailReply getGetOrderTransactionsDetailReply() {
        return getOrderTransactionsDetailReply;
    }

    /**
     * Sets the value of the getOrderTransactionsDetailReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetOrderTransactionsDetailReply }
     *     
     */
    public void setGetOrderTransactionsDetailReply(GetOrderTransactionsDetailReply value) {
        this.getOrderTransactionsDetailReply = value;
    }

    /**
     * Gets the value of the getApplicableOffersReply property.
     * 
     * @return
     *     possible object is
     *     {@link GetApplicableOffersReply }
     *     
     */
    public GetApplicableOffersReply getGetApplicableOffersReply() {
        return getApplicableOffersReply;
    }

    /**
     * Sets the value of the getApplicableOffersReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetApplicableOffersReply }
     *     
     */
    public void setGetApplicableOffersReply(GetApplicableOffersReply value) {
        this.getApplicableOffersReply = value;
    }

    /**
     * Gets the value of the availCouponReply property.
     * 
     * @return
     *     possible object is
     *     {@link AvailCouponReply }
     *     
     */
    public AvailCouponReply getAvailCouponReply() {
        return availCouponReply;
    }

    /**
     * Sets the value of the availCouponReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailCouponReply }
     *     
     */
    public void setAvailCouponReply(AvailCouponReply value) {
        this.availCouponReply = value;
    }

    /**
     * Gets the value of the sendEmailReply property.
     * 
     * @return
     *     possible object is
     *     {@link SendEmailReply }
     *     
     */
    public SendEmailReply getSendEmailReply() {
        return sendEmailReply;
    }

    /**
     * Sets the value of the sendEmailReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link SendEmailReply }
     *     
     */
    public void setSendEmailReply(SendEmailReply value) {
        this.sendEmailReply = value;
    }

    /**
     * Gets the value of the getMemberPromptsReply property.
     * 
     * @return
     *     possible object is
     *     {@link GetMemberPromptsReply }
     *     
     */
    public GetMemberPromptsReply getGetMemberPromptsReply() {
        return getMemberPromptsReply;
    }

    /**
     * Sets the value of the getMemberPromptsReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetMemberPromptsReply }
     *     
     */
    public void setGetMemberPromptsReply(GetMemberPromptsReply value) {
        this.getMemberPromptsReply = value;
    }

    /**
     * Gets the value of the updateMemberPromptsReply property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateMemberPromptsReply }
     *     
     */
    public UpdateMemberPromptsReply getUpdateMemberPromptsReply() {
        return updateMemberPromptsReply;
    }

    /**
     * Sets the value of the updateMemberPromptsReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateMemberPromptsReply }
     *     
     */
    public void setUpdateMemberPromptsReply(UpdateMemberPromptsReply value) {
        this.updateMemberPromptsReply = value;
    }

    /**
     * Gets the value of the realtimeEmailValReply property.
     * 
     * @return
     *     possible object is
     *     {@link RealtimeEmailValReply }
     *     
     */
    public RealtimeEmailValReply getRealtimeEmailValReply() {
        return realtimeEmailValReply;
    }

    /**
     * Sets the value of the realtimeEmailValReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealtimeEmailValReply }
     *     
     */
    public void setRealtimeEmailValReply(RealtimeEmailValReply value) {
        this.realtimeEmailValReply = value;
    }

    /**
     * Gets the value of the realTimeEmailVald property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRealTimeEmailVald() {
        return realTimeEmailVald;
    }

    /**
     * Sets the value of the realTimeEmailVald property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRealTimeEmailVald(String value) {
        this.realTimeEmailVald = value;
    }

    /**
     * Gets the value of the offerIssuanceReply property.
     * 
     * @return
     *     possible object is
     *     {@link OfferIssuanceReply }
     *     
     */
    public OfferIssuanceReply getOfferIssuanceReply() {
        return offerIssuanceReply;
    }

    /**
     * Sets the value of the offerIssuanceReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferIssuanceReply }
     *     
     */
    public void setOfferIssuanceReply(OfferIssuanceReply value) {
        this.offerIssuanceReply = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the errorType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorType() {
        return errorType;
    }

    /**
     * Sets the value of the errorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorType(String value) {
        this.errorType = value;
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
     *         &lt;element name="CardNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="StartDTTM" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="EndDTTM" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element ref="{http://www.epsilon.com/webservices/}Offers"/&gt;
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
        "cardNumber",
        "startDTTM",
        "endDTTM",
        "offers"
    })
    public static class GetMemberTargetedOffersReply {

        @XmlElement(name = "CardNumber", required = true)
        protected String cardNumber;
        @XmlElement(name = "StartDTTM", required = true)
        protected String startDTTM;
        @XmlElement(name = "EndDTTM", required = true)
        protected String endDTTM;
        @XmlElement(name = "Offers", required = true)
        protected Offers offers;

        /**
         * Gets the value of the cardNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCardNumber() {
            return cardNumber;
        }

        /**
         * Sets the value of the cardNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCardNumber(String value) {
            this.cardNumber = value;
        }

        /**
         * Gets the value of the startDTTM property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStartDTTM() {
            return startDTTM;
        }

        /**
         * Sets the value of the startDTTM property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStartDTTM(String value) {
            this.startDTTM = value;
        }

        /**
         * Gets the value of the endDTTM property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEndDTTM() {
            return endDTTM;
        }

        /**
         * Sets the value of the endDTTM property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEndDTTM(String value) {
            this.endDTTM = value;
        }

        /**
         * Gets the value of the offers property.
         * 
         * @return
         *     possible object is
         *     {@link Offers }
         *     
         */
        public Offers getOffers() {
            return offers;
        }

        /**
         * Sets the value of the offers property.
         * 
         * @param value
         *     allowed object is
         *     {@link Offers }
         *     
         */
        public void setOffers(Offers value) {
            this.offers = value;
        }

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
     *         &lt;element name="StatusCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="StatusText" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "statusCode",
        "statusText"
    })
    public static class PartnerEnrollmentDetailsResponse {

        @XmlElement(name = "StatusCode", required = true)
        protected String statusCode;
        @XmlElement(name = "StatusText", required = true)
        protected String statusText;

        /**
         * Gets the value of the statusCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatusCode() {
            return statusCode;
        }

        /**
         * Sets the value of the statusCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStatusCode(String value) {
            this.statusCode = value;
        }

        /**
         * Gets the value of the statusText property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatusText() {
            return statusText;
        }

        /**
         * Sets the value of the statusText property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStatusText(String value) {
            this.statusText = value;
        }

    }

}
