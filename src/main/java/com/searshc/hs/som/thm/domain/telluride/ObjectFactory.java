
package com.searshc.hs.som.thm.domain.telluride;

import java.math.BigDecimal;
import java.math.BigInteger;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.searshc.hs.som.thm.domain.sywr.CheckoutPrompt;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.searshc.hs.som.thm.domain.telluride package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _TransactionType_QNAME = new QName("http://www.epsilon.com/webservices/", "TransactionType");
    private final static QName _OriginalStoreNumber_QNAME = new QName("http://www.epsilon.com/webservices/", "OriginalStoreNumber");
    private final static QName _EndDTTM_QNAME = new QName("http://www.epsilon.com/webservices/", "EndDTTM");
    private final static QName _CouponNumber_QNAME = new QName("http://www.epsilon.com/webservices/", "CouponNumber");
    private final static QName _VIPTier_QNAME = new QName("http://www.epsilon.com/webservices/", "VIPTier");
    private final static QName _Member_QNAME = new QName("http://www.epsilon.com/webservices/", "Member");
    private final static QName _OfferRegistration_QNAME = new QName("http://www.epsilon.com/webservices/", "OfferRegistration");
    private final static QName _OrderStoreNumber_QNAME = new QName("http://www.epsilon.com/webservices/", "OrderStoreNumber");
    private final static QName _PointsDetails_QNAME = new QName("http://www.epsilon.com/webservices/", "PointsDetails");
    private final static QName _GetMemberTargetedOffersResponse_QNAME = new QName("http://www.epsilon.com/webservices/", "GetMemberTargetedOffersResponse");
    private final static QName _LayawayNumber_QNAME = new QName("http://www.epsilon.com/webservices/", "LayawayNumber");
    private final static QName _RedeemedPointsOriginalDollarValue_QNAME = new QName("http://www.epsilon.com/webservices/", "RedeemedPointsOriginalDollarValue");
    private final static QName _CountryCode_QNAME = new QName("http://www.epsilon.com/webservices/", "CountryCode");
    private final static QName _EnrollmentDTTM_QNAME = new QName("http://www.epsilon.com/webservices/", "EnrollmentDTTM");
    private final static QName _EnrollmentStoreFormat_QNAME = new QName("http://www.epsilon.com/webservices/", "EnrollmentStoreFormat");
    private final static QName _FirstName_QNAME = new QName("http://www.epsilon.com/webservices/", "FirstName");
    private final static QName _CouponItemLevelOffer_QNAME = new QName("http://www.epsilon.com/webservices/", "CouponItemLevelOffer");
    private final static QName _ItemDescription_QNAME = new QName("http://www.epsilon.com/webservices/", "ItemDescription");
    private final static QName _TxnEarnOfferName_QNAME = new QName("http://www.epsilon.com/webservices/", "TxnEarnOfferName");
    private final static QName _AlternateCouponOfferPoints_QNAME = new QName("http://www.epsilon.com/webservices/", "AlternateCouponOfferPoints");
    private final static QName _DollarValueOfPointsRedeemedOnBonusOffer_QNAME = new QName("http://www.epsilon.com/webservices/common", "DollarValueOfPointsRedeemedOnBonusOffer");
    private final static QName _OfferName_QNAME = new QName("http://www.epsilon.com/webservices/", "OfferName");
    private final static QName _RedemptionDollarValue_QNAME = new QName("http://www.epsilon.com/webservices/", "RedemptionDollarValue");
    private final static QName _PostPartnerPointsResponse_QNAME = new QName("http://www.epsilon.com/webservices/", "PostPartnerPointsResponse");
    private final static QName _City_QNAME = new QName("http://www.epsilon.com/webservices/", "City");
    private final static QName _StoreNumber_QNAME = new QName("http://www.epsilon.com/webservices/", "StoreNumber");
    private final static QName _ChallengeDesc_QNAME = new QName("http://www.epsilon.com/webservices/", "ChallengeDesc");
    private final static QName _CardNumber_QNAME = new QName("http://www.epsilon.com/webservices/", "CardNumber");
    private final static QName _SalesCheckNumber_QNAME = new QName("http://www.epsilon.com/webservices/", "SalesCheckNumber");
    private final static QName _AddMemberToGroup_QNAME = new QName("http://www.epsilon.com/webservices/", "AddMemberToGroup");
    private final static QName _FinalPaymentDate_QNAME = new QName("http://www.epsilon.com/webservices/", "FinalPaymentDate");
    private final static QName _MobileValid_QNAME = new QName("http://www.epsilon.com/webservices/", "MobileValid");
    private final static QName _Message_QNAME = new QName("http://www.epsilon.com/webservices/", "Message");
    private final static QName _DateUpdated_QNAME = new QName("http://www.epsilon.com/webservices/", "DateUpdated");
    private final static QName _TotalRedeemed_QNAME = new QName("http://www.epsilon.com/webservices/", "TotalRedeemed");
    private final static QName _OriginalTransactionTime_QNAME = new QName("http://www.epsilon.com/webservices/", "OriginalTransactionTime");
    private final static QName _TxnPointsEarnedTxt_QNAME = new QName("http://www.epsilon.com/webservices/", "TxnPointsEarnedTxt");
    private final static QName _TenderAmount_QNAME = new QName("http://www.epsilon.com/webservices/", "TenderAmount");
    private final static QName _PreferredLanguage_QNAME = new QName("http://www.epsilon.com/webservices/", "PreferredLanguage");
    private final static QName _RedeemedValue_QNAME = new QName("http://www.epsilon.com/webservices/", "RedeemedValue");
    private final static QName _DateTimeOnServer_QNAME = new QName("http://www.epsilon.com/webservices/", "DateTimeOnServer");
    private final static QName _PickUpStoreNumber_QNAME = new QName("http://www.epsilon.com/webservices/", "PickUpStoreNumber");
    private final static QName _MemberNumber_QNAME = new QName("http://www.epsilon.com/webservices/", "MemberNumber");
    private final static QName _BasePointsEarnedTxt_QNAME = new QName("http://www.epsilon.com/webservices/", "BasePointsEarnedTxt");
    private final static QName _OriginalTransactionDate_QNAME = new QName("http://www.epsilon.com/webservices/", "OriginalTransactionDate");
    private final static QName _ResponseDate_QNAME = new QName("http://www.epsilon.com/webservices/", "ResponseDate");
    private final static QName _RedemptionSystemCode_QNAME = new QName("http://www.epsilon.com/webservices/", "RedemptionSystemCode");
    private final static QName _LastName_QNAME = new QName("http://www.epsilon.com/webservices/", "LastName");
    private final static QName _TransactionTotal_QNAME = new QName("http://www.epsilon.com/webservices/", "TransactionTotal");
    private final static QName _CouponPointsEarned_QNAME = new QName("http://www.epsilon.com/webservices/", "CouponPointsEarned");
    private final static QName _EmailStatusReturn_QNAME = new QName("http://www.epsilon.com/webservices/", "EmailStatusReturn");
    private final static QName _MemberEarnType_QNAME = new QName("http://www.epsilon.com/webservices/", "MemberEarnType");
    private final static QName _OnlineValidationDate_QNAME = new QName("http://www.epsilon.com/webservices/", "OnlineValidationDate");
    private final static QName _Offer_QNAME = new QName("http://www.epsilon.com/webservices/common", "Offer");
    private final static QName _ClubStatus_QNAME = new QName("http://www.epsilon.com/webservices/", "ClubStatus");
    private final static QName _UPC_QNAME = new QName("http://www.epsilon.com/webservices/", "UPC");
    private final static QName _OfferEndDate_QNAME = new QName("http://www.epsilon.com/webservices/", "OfferEndDate");
    private final static QName _RedeemablePointsInd_QNAME = new QName("http://www.epsilon.com/webservices/", "RedeemablePointsInd");
    private final static QName _RedemptionOfferCode_QNAME = new QName("http://www.epsilon.com/webservices/", "RedemptionOfferCode");
    private final static QName _CurrencyDebit_QNAME = new QName("http://www.epsilon.com/webservices/", "CurrencyDebit");
    private final static QName _EarnOfferName_QNAME = new QName("http://www.epsilon.com/webservices/", "EarnOfferName");
    private final static QName _LanguagePreference_QNAME = new QName("http://www.epsilon.com/webservices/", "LanguagePreference");
    private final static QName _TaxAmount_QNAME = new QName("http://www.epsilon.com/webservices/", "TaxAmount");
    private final static QName _SearsEmailOptStatus_QNAME = new QName("http://www.epsilon.com/webservices/", "SearsEmailOptStatus");
    private final static QName _PostAdjustmentPointsResponse_QNAME = new QName("http://www.epsilon.com/webservices/", "PostAdjustmentPointsResponse");
    private final static QName _LineItemAmountTypeCode_QNAME = new QName("http://www.epsilon.com/webservices/", "LineItemAmountTypeCode");
    private final static QName _ClubDNPStatus_QNAME = new QName("http://www.epsilon.com/webservices/", "ClubDNPStatus");
    private final static QName _EndDTTMstr_QNAME = new QName("http://www.epsilon.com/webservices/", "EndDTTMstr");
    private final static QName _AlternateCouponFlag_QNAME = new QName("http://www.epsilon.com/webservices/", "AlternateCouponFlag");
    private final static QName _EmailConfirmed_QNAME = new QName("http://www.epsilon.com/webservices/", "EmailConfirmed");
    private final static QName _TotalRedeemablePoints_QNAME = new QName("http://www.epsilon.com/webservices/", "TotalRedeemablePoints");
    private final static QName _BonusID_QNAME = new QName("http://www.epsilon.com/webservices/", "BonusID");
    private final static QName _EnrollmentStoreNumber_QNAME = new QName("http://www.epsilon.com/webservices/", "EnrollmentStoreNumber");
    private final static QName _Msg5_QNAME = new QName("http://www.epsilon.com/webservices/", "msg5");
    private final static QName _Msg1_QNAME = new QName("http://www.epsilon.com/webservices/", "msg1");
    private final static QName _Msg2_QNAME = new QName("http://www.epsilon.com/webservices/", "msg2");
    private final static QName _MemberSavingsDollarValue_QNAME = new QName("http://www.epsilon.com/webservices/common", "MemberSavingsDollarValue");
    private final static QName _Msg3_QNAME = new QName("http://www.epsilon.com/webservices/", "msg3");
    private final static QName _Msg4_QNAME = new QName("http://www.epsilon.com/webservices/", "msg4");
    private final static QName _ContractNumber_QNAME = new QName("http://www.epsilon.com/webservices/", "ContractNumber");
    private final static QName _PointDebit_QNAME = new QName("http://www.epsilon.com/webservices/", "PointDebit");
    private final static QName _TestPostPointsResponse_QNAME = new QName("http://www.epsilon.com/webservices/", "TestPostPointsResponse");
    private final static QName _TransactionNumber_QNAME = new QName("http://www.epsilon.com/webservices/", "TransactionNumber");
    private final static QName _OfferType_QNAME = new QName("http://www.epsilon.com/webservices/", "OfferType");
    private final static QName _Multiplier_QNAME = new QName("http://www.epsilon.com/webservices/", "Multiplier");
    private final static QName _OriginalLineNumber_QNAME = new QName("http://www.epsilon.com/webservices/", "OriginalLineNumber");
    private final static QName _EnrollmentSourceCode_QNAME = new QName("http://www.epsilon.com/webservices/", "EnrollmentSourceCode");
    private final static QName _TenderType_QNAME = new QName("http://www.epsilon.com/webservices/", "TenderType");
    private final static QName _TotalBonusPointsEarnedTxt_QNAME = new QName("http://www.epsilon.com/webservices/", "TotalBonusPointsEarnedTxt");
    private final static QName _Deceased_QNAME = new QName("http://www.epsilon.com/webservices/", "Deceased");
    private final static QName _NewMemberNumber_QNAME = new QName("http://www.epsilon.com/webservices/", "NewMemberNumber");
    private final static QName _ResponseCode_QNAME = new QName("http://www.epsilon.com/webservices/", "ResponseCode");
    private final static QName _RedeemableSurprisePoints_QNAME = new QName("http://www.epsilon.com/webservices/", "RedeemableSurprisePoints");
    private final static QName _PointsToAdd_QNAME = new QName("http://www.epsilon.com/webservices/", "PointsToAdd");
    private final static QName _RedeemedDollarValue_QNAME = new QName("http://www.epsilon.com/webservices/", "RedeemedDollarValue");
    private final static QName _GrossDollarAmount_QNAME = new QName("http://www.epsilon.com/webservices/", "GrossDollarAmount");
    private final static QName _Quantity_QNAME = new QName("http://www.epsilon.com/webservices/", "Quantity");
    private final static QName _PointsEarned_QNAME = new QName("http://www.epsilon.com/webservices/", "PointsEarned");
    private final static QName _StatusText_QNAME = new QName("http://www.epsilon.com/webservices/", "StatusText");
    private final static QName _Completed_QNAME = new QName("http://www.epsilon.com/webservices/", "Completed");
    private final static QName _ItemNumber_QNAME = new QName("http://www.epsilon.com/webservices/", "ItemNumber");
    private final static QName _CurrentTier_QNAME = new QName("http://www.epsilon.com/webservices/", "CurrentTier");
    private final static QName _RegisterNumber_QNAME = new QName("http://www.epsilon.com/webservices/", "RegisterNumber");
    private final static QName _QuestionID_QNAME = new QName("http://www.epsilon.com/webservices/", "QuestionID");
    private final static QName _LineItem_QNAME = new QName("http://www.epsilon.com/webservices/", "LineItem");
    private final static QName _Name_QNAME = new QName("http://www.epsilon.com/webservices/", "Name");
    private final static QName _TotalEarned_QNAME = new QName("http://www.epsilon.com/webservices/", "TotalEarned");
    private final static QName _PointsRedeemedOnBonusOffer_QNAME = new QName("http://www.epsilon.com/webservices/", "PointsRedeemedOnBonusOffer");
    private final static QName _ItemLevelOffer_QNAME = new QName("http://www.epsilon.com/webservices/", "ItemLevelOffer");
    private final static QName _CashierID_QNAME = new QName("http://www.epsilon.com/webservices/", "CashierID");
    private final static QName _StartDTTMstr_QNAME = new QName("http://www.epsilon.com/webservices/", "StartDTTMstr");
    private final static QName _CouponOfferCode_QNAME = new QName("http://www.epsilon.com/webservices/", "CouponOfferCode");
    private final static QName _RedeemedPointsXRDollarValue_QNAME = new QName("http://www.epsilon.com/webservices/", "RedeemedPointsXRDollarValue");
    private final static QName _ChallengeStatusText_QNAME = new QName("http://www.epsilon.com/webservices/", "ChallengeStatusText");
    private final static QName _ZipCodeExtension_QNAME = new QName("http://www.epsilon.com/webservices/", "ZipCodeExtension");
    private final static QName _TotalPointsRedeemed_QNAME = new QName("http://www.epsilon.com/webservices/", "TotalPointsRedeemed");
    private final static QName _IncompleteProfileInd_QNAME = new QName("http://www.epsilon.com/webservices/", "IncompleteProfileInd");
    private final static QName _DOB_QNAME = new QName("http://www.epsilon.com/webservices/", "DOB");
    private final static QName _MiddleInitial_QNAME = new QName("http://www.epsilon.com/webservices/", "MiddleInitial");
    private final static QName _MemberSinceDate_QNAME = new QName("http://www.epsilon.com/webservices/", "MemberSinceDate");
    private final static QName _OfferPointsRedeemed_QNAME = new QName("http://www.epsilon.com/webservices/", "OfferPointsRedeemed");
    private final static QName _TransactionTime_QNAME = new QName("http://www.epsilon.com/webservices/", "TransactionTime");
    private final static QName _TransactionID_QNAME = new QName("http://www.epsilon.com/webservices/", "TransactionID");
    private final static QName _CreationChannel_QNAME = new QName("http://www.epsilon.com/webservices/", "CreationChannel");
    private final static QName _LineNumber_QNAME = new QName("http://www.epsilon.com/webservices/", "LineNumber");
    private final static QName _PreferenceValue_QNAME = new QName("http://www.epsilon.com/webservices/", "PreferenceValue");
    private final static QName _PreferenceResponseCode_QNAME = new QName("http://www.epsilon.com/webservices/", "PreferenceResponseCode");
    private final static QName _WirelessPermissionFlag_QNAME = new QName("http://www.epsilon.com/webservices/", "WirelessPermissionFlag");
    private final static QName _PointsEarnedTxt_QNAME = new QName("http://www.epsilon.com/webservices/", "PointsEarnedTxt");
    private final static QName _TotalPointsEarned_QNAME = new QName("http://www.epsilon.com/webservices/", "TotalPointsEarned");
    private final static QName _CardDesignType_QNAME = new QName("http://www.epsilon.com/webservices/", "CardDesignType");
    private final static QName _ClaimNumber_QNAME = new QName("http://www.epsilon.com/webservices/", "ClaimNumber");
    private final static QName _PostAdjustmentPoints_QNAME = new QName("http://www.epsilon.com/webservices/", "PostAdjustmentPoints");
    private final static QName _BonusPointsEarnedTxt_QNAME = new QName("http://www.epsilon.com/webservices/", "BonusPointsEarnedTxt");
    private final static QName _Suffix_QNAME = new QName("http://www.epsilon.com/webservices/", "Suffix");
    private final static QName _CouponBonusPointsEarned_QNAME = new QName("http://www.epsilon.com/webservices/", "CouponBonusPointsEarned");
    private final static QName _TransactionDescription_QNAME = new QName("http://www.epsilon.com/webservices/", "TransactionDescription");
    private final static QName _RequestorID_QNAME = new QName("http://www.epsilon.com/webservices/", "RequestorID");
    private final static QName _BonusPointsEarned_QNAME = new QName("http://www.epsilon.com/webservices/", "BonusPointsEarned");
    private final static QName _OfferRegistrationResponse_QNAME = new QName("http://www.epsilon.com/webservices/", "OfferRegistrationResponse");
    private final static QName _AvailablePoints_QNAME = new QName("http://www.epsilon.com/webservices/", "AvailablePoints");
    private final static QName _StartDTTM_QNAME = new QName("http://www.epsilon.com/webservices/", "StartDTTM");
    private final static QName _CouponOfferName_QNAME = new QName("http://www.epsilon.com/webservices/", "CouponOfferName");
    private final static QName _RewardDescription_QNAME = new QName("http://www.epsilon.com/webservices/", "RewardDescription");
    private final static QName _CardType_QNAME = new QName("http://www.epsilon.com/webservices/", "CardType");
    private final static QName _TxnEarnOfferType_QNAME = new QName("http://www.epsilon.com/webservices/", "TxnEarnOfferType");
    private final static QName _TotalAllocatedPoints_QNAME = new QName("http://www.epsilon.com/webservices/", "TotalAllocatedPoints");
    private final static QName _ItemType_QNAME = new QName("http://www.epsilon.com/webservices/", "ItemType");
    private final static QName _TotalPointsEarnedTxt_QNAME = new QName("http://www.epsilon.com/webservices/", "TotalPointsEarnedTxt");
    private final static QName _DollarValueOfPointsRedeemedOnBaseOffer_QNAME = new QName("http://www.epsilon.com/webservices/common", "DollarValueOfPointsRedeemedOnBaseOffer");
    private final static QName _OfferNumber_QNAME = new QName("http://www.epsilon.com/webservices/", "OfferNumber");
    private final static QName _NumRecordsReturned_QNAME = new QName("http://www.epsilon.com/webservices/", "NumRecordsReturned");
    private final static QName _PriceMatchBonusAmount_QNAME = new QName("http://www.epsilon.com/webservices/", "PriceMatchBonusAmount");
    private final static QName _MaxRecords_QNAME = new QName("http://www.epsilon.com/webservices/", "MaxRecords");
    private final static QName _OriginalTransactionNumber_QNAME = new QName("http://www.epsilon.com/webservices/", "OriginalTransactionNumber");
    private final static QName _DollarValuePreDisc_QNAME = new QName("http://www.epsilon.com/webservices/", "DollarValuePreDisc");
    private final static QName _ResponseTime_QNAME = new QName("http://www.epsilon.com/webservices/", "ResponseTime");
    private final static QName _Function_QNAME = new QName("http://www.epsilon.com/webservices/", "Function");
    private final static QName _PriceMatchAmount_QNAME = new QName("http://www.epsilon.com/webservices/", "PriceMatchAmount");
    private final static QName _AddMemberToGroupResponse_QNAME = new QName("http://www.epsilon.com/webservices/", "AddMemberToGroupResponse");
    private final static QName _RedemptionMultiplier_QNAME = new QName("http://www.epsilon.com/webservices/", "RedemptionMultiplier");
    private final static QName _CreatedBy_QNAME = new QName("http://www.epsilon.com/webservices/", "CreatedBy");
    private final static QName _ClubMembershipCreatedBy_QNAME = new QName("http://www.epsilon.com/webservices/", "ClubMembershipCreatedBy");
    private final static QName _CouponType_QNAME = new QName("http://www.epsilon.com/webservices/", "CouponType");
    private final static QName _PointsToThreshold_QNAME = new QName("http://www.epsilon.com/webservices/", "PointsToThreshold");
    private final static QName _AuthorizationCode_QNAME = new QName("http://www.epsilon.com/webservices/", "AuthorizationCode");
    private final static QName _StoreFlag_QNAME = new QName("http://www.epsilon.com/webservices/", "StoreFlag");
    private final static QName _DollarValuePostDisc_QNAME = new QName("http://www.epsilon.com/webservices/", "DollarValuePostDisc");
    private final static QName _RedemptionPoints_QNAME = new QName("http://www.epsilon.com/webservices/", "RedemptionPoints");
    private final static QName _TxnEarnOfferCode_QNAME = new QName("http://www.epsilon.com/webservices/", "TxnEarnOfferCode");
    private final static QName _DiscountAmount_QNAME = new QName("http://www.epsilon.com/webservices/", "DiscountAmount");
    private final static QName _StoreFormat_QNAME = new QName("http://www.epsilon.com/webservices/", "StoreFormat");
    private final static QName _TransactionTotalTax_QNAME = new QName("http://www.epsilon.com/webservices/", "TransactionTotalTax");
    private final static QName _OfferStartDate_QNAME = new QName("http://www.epsilon.com/webservices/", "OfferStartDate");
    private final static QName _CouponPointsEarnedTxt_QNAME = new QName("http://www.epsilon.com/webservices/", "CouponPointsEarnedTxt");
    private final static QName _ResponseText_QNAME = new QName("http://www.epsilon.com/webservices/", "ResponseText");
    private final static QName _TransactionDate_QNAME = new QName("http://www.epsilon.com/webservices/", "TransactionDate");
    private final static QName _TrackingID_QNAME = new QName("http://www.epsilon.com/webservices/", "TrackingID");
    private final static QName _CouponBonusPointsEarnedTxt_QNAME = new QName("http://www.epsilon.com/webservices/", "CouponBonusPointsEarnedTxt");
    private final static QName _EmailAddress_QNAME = new QName("http://www.epsilon.com/webservices/", "EmailAddress");
    private final static QName _EarnFlag_QNAME = new QName("http://www.epsilon.com/webservices/", "EarnFlag");
    private final static QName _ImageName_QNAME = new QName("http://www.epsilon.com/webservices/", "ImageName");
    private final static QName _TotalBonusPointsEarned_QNAME = new QName("http://www.epsilon.com/webservices/", "TotalBonusPointsEarned");
    private final static QName _Address1_QNAME = new QName("http://www.epsilon.com/webservices/", "Address1");
    private final static QName _SubCategory_QNAME = new QName("http://www.epsilon.com/webservices/", "SubCategory");
    private final static QName _AssociateID_QNAME = new QName("http://www.epsilon.com/webservices/", "AssociateID");
    private final static QName _EligibleDollarAmount_QNAME = new QName("http://www.epsilon.com/webservices/", "EligibleDollarAmount");
    private final static QName _Address2_QNAME = new QName("http://www.epsilon.com/webservices/", "Address2");
    private final static QName _QuestionText_QNAME = new QName("http://www.epsilon.com/webservices/", "QuestionText");
    private final static QName _SurveyID_QNAME = new QName("http://www.epsilon.com/webservices/", "SurveyID");
    private final static QName _PhoneNumber_QNAME = new QName("http://www.epsilon.com/webservices/", "PhoneNumber");
    private final static QName _AgeEligibleFlag_QNAME = new QName("http://www.epsilon.com/webservices/", "AgeEligibleFlag");
    private final static QName _DateTimeOnServerResponse_QNAME = new QName("http://www.epsilon.com/webservices/", "DateTimeOnServerResponse");
    private final static QName _BonusPoints_QNAME = new QName("http://www.epsilon.com/webservices/", "BonusPoints");
    private final static QName _StoreLocation_QNAME = new QName("http://www.epsilon.com/webservices/", "StoreLocation");
    private final static QName _EarnOfferType_QNAME = new QName("http://www.epsilon.com/webservices/", "EarnOfferType");
    private final static QName _MessageVersion_QNAME = new QName("http://www.epsilon.com/webservices/", "MessageVersion");
    private final static QName _RedeemedXRPointsWorth_QNAME = new QName("http://www.epsilon.com/webservices/", "RedeemedXRPointsWorth");
    private final static QName _EarnOfferCode_QNAME = new QName("http://www.epsilon.com/webservices/", "EarnOfferCode");
    private final static QName _OtherBonusPointsEarnedTxt_QNAME = new QName("http://www.epsilon.com/webservices/", "OtherBonusPointsEarnedTxt");
    private final static QName _OnlineValidationFlag_QNAME = new QName("http://www.epsilon.com/webservices/", "OnlineValidationFlag");
    private final static QName _EnrollmentOfferCode_QNAME = new QName("http://www.epsilon.com/webservices/", "EnrollmentOfferCode");
    private final static QName _AddressLine2_QNAME = new QName("http://www.epsilon.com/webservices/", "AddressLine2");
    private final static QName _AddressLine1_QNAME = new QName("http://www.epsilon.com/webservices/", "AddressLine1");
    private final static QName _OfferId_QNAME = new QName("http://www.epsilon.com/webservices/", "OfferId");
    private final static QName _CurrentBalance_QNAME = new QName("http://www.epsilon.com/webservices/", "CurrentBalance");
    private final static QName _CategoryID_QNAME = new QName("http://www.epsilon.com/webservices/", "CategoryID");
    private final static QName _TotalPoints_QNAME = new QName("http://www.epsilon.com/webservices/", "TotalPoints");
    private final static QName _ElevatedTier_QNAME = new QName("http://www.epsilon.com/webservices/", "ElevatedTier");
    private final static QName _OtherBonusPointsEarned_QNAME = new QName("http://www.epsilon.com/webservices/", "OtherBonusPointsEarned");
    private final static QName _PhoneType_QNAME = new QName("http://www.epsilon.com/webservices/", "PhoneType");
    private final static QName _AlternateCouponDecision_QNAME = new QName("http://www.epsilon.com/webservices/", "AlternateCouponDecision");
    private final static QName _Exception_QNAME = new QName("http://www.epsilon.com/webservices/", "Exception");
    private final static QName _ReturnCode_QNAME = new QName("http://www.epsilon.com/webservices/", "ReturnCode");
    private final static QName _SysPulse_QNAME = new QName("http://www.epsilon.com/webservices/", "SysPulse");
    private final static QName _NumberOfPhoneEntries_QNAME = new QName("http://www.epsilon.com/webservices/", "NumberOfPhoneEntries");
    private final static QName _BonusDescription_QNAME = new QName("http://www.epsilon.com/webservices/", "BonusDescription");
    private final static QName _DateIssued_QNAME = new QName("http://www.epsilon.com/webservices/", "DateIssued");
    private final static QName _SHCAssociateInd_QNAME = new QName("http://www.epsilon.com/webservices/", "SHCAssociateInd");
    private final static QName _RedemptionCapDollarValue_QNAME = new QName("http://www.epsilon.com/webservices/", "RedemptionCapDollarValue");
    private final static QName _PostSalesAdjustmentAmount_QNAME = new QName("http://www.epsilon.com/webservices/", "PostSalesAdjustmentAmount");
    private final static QName _LastUpdateChannel_QNAME = new QName("http://www.epsilon.com/webservices/", "LastUpdateChannel");
    private final static QName _ZipCode_QNAME = new QName("http://www.epsilon.com/webservices/", "ZipCode");
    private final static QName _TotalExpired_QNAME = new QName("http://www.epsilon.com/webservices/", "TotalExpired");
    private final static QName _Description_QNAME = new QName("http://www.epsilon.com/webservices/", "Description");
    private final static QName _PreferenceCode_QNAME = new QName("http://www.epsilon.com/webservices/", "PreferenceCode");
    private final static QName _RedemptionOfferMultiplierAndCapTxt_QNAME = new QName("http://www.epsilon.com/webservices/", "RedemptionOfferMultiplierAndCapTxt");
    private final static QName _TxnItemLevelOffer_QNAME = new QName("http://www.epsilon.com/webservices/", "TxnItemLevelOffer");
    private final static QName _CurrentValue_QNAME = new QName("http://www.epsilon.com/webservices/", "CurrentValue");
    private final static QName _AgeEligible_QNAME = new QName("http://www.epsilon.com/webservices/", "AgeEligible");
    private final static QName _BonusName_QNAME = new QName("http://www.epsilon.com/webservices/", "BonusName");
    private final static QName _RedeemedPoints_QNAME = new QName("http://www.epsilon.com/webservices/", "RedeemedPoints");
    private final static QName _AvailableDollars_QNAME = new QName("http://www.epsilon.com/webservices/", "AvailableDollars");
    private final static QName _QuestionGroupID_QNAME = new QName("http://www.epsilon.com/webservices/", "QuestionGroupID");
    private final static QName _TierThreshold_QNAME = new QName("http://www.epsilon.com/webservices/", "TierThreshold");
    private final static QName _Category_QNAME = new QName("http://www.epsilon.com/webservices/", "Category");
    private final static QName _PointsRedeemedOnBaseOffer_QNAME = new QName("http://www.epsilon.com/webservices/", "PointsRedeemedOnBaseOffer");
    private final static QName _Status_QNAME = new QName("http://www.epsilon.com/webservices/", "Status");
    private final static QName _TxnPointsEarned_QNAME = new QName("http://www.epsilon.com/webservices/", "TxnPointsEarned");
    private final static QName _Division_QNAME = new QName("http://www.epsilon.com/webservices/", "Division");
    private final static QName _State_QNAME = new QName("http://www.epsilon.com/webservices/", "State");
    private final static QName _PointBalance_QNAME = new QName("http://www.epsilon.com/webservices/", "PointBalance");
    private final static QName _CurrentTime_QNAME = new QName("http://www.epsilon.com/webservices/", "CurrentTime");
    private final static QName _ClubEmailOptStatus_QNAME = new QName("http://www.epsilon.com/webservices/", "ClubEmailOptStatus");
    private final static QName _SurveyDescription_QNAME = new QName("http://www.epsilon.com/webservices/", "SurveyDescription");
    private final static QName _AvailableSurprisePoints_QNAME = new QName("http://www.epsilon.com/webservices/", "AvailableSurprisePoints");
    private final static QName _TenderStoreNumber_QNAME = new QName("http://www.epsilon.com/webservices/", "TenderStoreNumber");
    private final static QName _RewardID_QNAME = new QName("http://www.epsilon.com/webservices/", "RewardID");
    private final static QName _OriginalRegisterNumber_QNAME = new QName("http://www.epsilon.com/webservices/", "OriginalRegisterNumber");
    private final static QName _TotalAvailableXROfferList_QNAME = new QName("http://www.epsilon.com/webservices/", "TotalAvailableXROfferList");
    private final static QName _DollarsToThreshold_QNAME = new QName("http://www.epsilon.com/webservices/", "DollarsToThreshold");
    private final static QName _LineItems_QNAME = new QName("http://www.epsilon.com/webservices/", "LineItems");
    private final static QName _CurrentDate_QNAME = new QName("http://www.epsilon.com/webservices/", "CurrentDate");
    private final static QName _TotalBonusPoints_QNAME = new QName("http://www.epsilon.com/webservices/", "TotalBonusPoints");
    private final static QName _TotalSpentYTD_QNAME = new QName("http://www.epsilon.com/webservices/", "TotalSpentYTD");
    private final static QName _MemberOwnPointsToExpire_QNAME = new QName("http://www.epsilon.com/webservices/", "MemberOwnPointsToExpire");
    private final static QName _LastUpdateDate_QNAME = new QName("http://www.epsilon.com/webservices/", "LastUpdateDate");
    private final static QName _EndingBalance_QNAME = new QName("http://www.epsilon.com/webservices/", "EndingBalance");
    private final static QName _Prefix_QNAME = new QName("http://www.epsilon.com/webservices/", "Prefix");
    private final static QName _Terms_QNAME = new QName("http://www.epsilon.com/webservices/", "Terms");
    private final static QName _CampaignControlID_QNAME = new QName("http://www.epsilon.com/webservices/", "CampaignControlID");
    private final static QName _SpendNextTierLevel_QNAME = new QName("http://www.epsilon.com/webservices/", "SpendNextTierLevel");
    private final static QName _MTServerName_QNAME = new QName("http://www.epsilon.com/webservices/", "MTServerName");
    private final static QName _ClubMembershipUpdatedBy_QNAME = new QName("http://www.epsilon.com/webservices/", "ClubMembershipUpdatedBy");
    private final static QName _TestPostPoints_QNAME = new QName("http://www.epsilon.com/webservices/", "testPostPoints");
    private final static QName _Terminal_QNAME = new QName("http://www.epsilon.com/webservices/", "Terminal");
    private final static QName _TestCardIndicator_QNAME = new QName("http://www.epsilon.com/webservices/", "TestCardIndicator");
    private final static QName _OriginalMemberNumber_QNAME = new QName("http://www.epsilon.com/webservices/", "OriginalMemberNumber");
    private final static QName _StartingBalance_QNAME = new QName("http://www.epsilon.com/webservices/", "StartingBalance");
    private final static QName _TotalBasePoints_QNAME = new QName("http://www.epsilon.com/webservices/", "TotalBasePoints");
    private final static QName _BasePointsEarned_QNAME = new QName("http://www.epsilon.com/webservices/", "BasePointsEarned");
    private final static QName _PinNumber_QNAME = new QName("http://www.epsilon.com/webservices/", "PinNumber");
    private final static QName _TotalAllocatedBasePoints_QNAME = new QName("http://www.epsilon.com/webservices/", "TotalAllocatedBasePoints");
    private final static QName _TransactionDTTM_QNAME = new QName("http://www.epsilon.com/webservices/", "TransactionDTTM");
    private final static QName _SearchType_QNAME = new QName("http://www.epsilon.com/webservices/", "SearchType");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.searshc.hs.som.thm.domain.telluride
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ApplicableOfferTier }
     * 
     */
    public ApplicableOfferTier createApplicableOfferTier() {
        return new ApplicableOfferTier();
    }

    /**
     * Create an instance of {@link RedemptionResponse.RedemptionResult }
     * 
     */
    public RedemptionResponse.RedemptionResult createRedemptionResponseRedemptionResult() {
        return new RedemptionResponse.RedemptionResult();
    }

    /**
     * Create an instance of {@link Zipcodes }
     * 
     */
    public Zipcodes createZipcodes() {
        return new Zipcodes();
    }

    /**
     * Create an instance of {@link PointsDetails.PointsToExpiry }
     * 
     */
    public PointsDetails.PointsToExpiry createPointsDetailsPointsToExpiry() {
        return new PointsDetails.PointsToExpiry();
    }

    /**
     * Create an instance of {@link GetLineItemDetailResponse.GetLineItemDetailResult }
     * 
     */
    public GetLineItemDetailResponse.GetLineItemDetailResult createGetLineItemDetailResponseGetLineItemDetailResult() {
        return new GetLineItemDetailResponse.GetLineItemDetailResult();
    }

    /**
     * Create an instance of {@link ApplicableStoreNumber }
     * 
     */
    public ApplicableStoreNumber createApplicableStoreNumber() {
        return new ApplicableStoreNumber();
    }

    /**
     * Create an instance of {@link XRSpend }
     * 
     */
    public XRSpend createXRSpend() {
        return new XRSpend();
    }

    /**
     * Create an instance of {@link Tiers }
     * 
     */
    public Tiers createTiers() {
        return new Tiers();
    }

    /**
     * Create an instance of {@link PostPartnerPointsResponse.PostPartnerPointsResult }
     * 
     */
    public PostPartnerPointsResponse.PostPartnerPointsResult createPostPartnerPointsResponsePostPartnerPointsResult() {
        return new PostPartnerPointsResponse.PostPartnerPointsResult();
    }

    /**
     * Create an instance of {@link OrderDetails }
     * 
     */
    public OrderDetails createOrderDetails() {
        return new OrderDetails();
    }

    /**
     * Create an instance of {@link CheckoutPromptQuestions.AnswerChoices.AnswerOption }
     * 
     */
    public CheckoutPromptQuestions.AnswerChoices.AnswerOption createCheckoutPromptQuestionsAnswerChoicesAnswerOption() {
        return new CheckoutPromptQuestions.AnswerChoices.AnswerOption();
    }

    /**
     * Create an instance of {@link AvailableXRPoints }
     * 
     */
    public AvailableXRPoints createAvailableXRPoints() {
        return new AvailableXRPoints();
    }

    /**
     * Create an instance of {@link OfferMemberGroupResponse }
     * 
     */
    public OfferMemberGroupResponse createOfferMemberGroupResponse() {
        return new OfferMemberGroupResponse();
    }

    /**
     * Create an instance of {@link PostAdjustmentPointsReply }
     * 
     */
    public PostAdjustmentPointsReply createPostAdjustmentPointsReply() {
        return new PostAdjustmentPointsReply();
    }

    /**
     * Create an instance of {@link AvailCouponResponse }
     * 
     */
    public AvailCouponResponse createAvailCouponResponse() {
        return new AvailCouponResponse();
    }

    /**
     * Create an instance of {@link GetMemberPrimaryProfileReply }
     * 
     */
    public GetMemberPrimaryProfileReply createGetMemberPrimaryProfileReply() {
        return new GetMemberPrimaryProfileReply();
    }

    /**
     * Create an instance of {@link UpdateMemberEmailResponse }
     * 
     */
    public UpdateMemberEmailResponse createUpdateMemberEmailResponse() {
        return new UpdateMemberEmailResponse();
    }

    /**
     * Create an instance of {@link MemberAdditionalOptions }
     * 
     */
    public MemberAdditionalOptions createMemberAdditionalOptions() {
        return new MemberAdditionalOptions();
    }

    /**
     * Create an instance of {@link ApplicableMemberCriteria }
     * 
     */
    public ApplicableMemberCriteria createApplicableMemberCriteria() {
        return new ApplicableMemberCriteria();
    }

    /**
     * Create an instance of {@link MemberGroups }
     * 
     */
    public MemberGroups createMemberGroups() {
        return new MemberGroups();
    }

    /**
     * Create an instance of {@link RewardPotential }
     * 
     */
    public RewardPotential createRewardPotential() {
        return new RewardPotential();
    }

    /**
     * Create an instance of {@link SubClub }
     * 
     */
    public SubClub createSubClub() {
        return new SubClub();
    }

    /**
     * Create an instance of {@link CheckoutPromptQuestions.FollowupQuestions.FollowupQuestion }
     * 
     */
    public CheckoutPromptQuestions.FollowupQuestions.FollowupQuestion createCheckoutPromptQuestionsFollowupQuestionsFollowupQuestion() {
        return new CheckoutPromptQuestions.FollowupQuestions.FollowupQuestion();
    }

    /**
     * Create an instance of {@link Coupon }
     * 
     */
    public Coupon createCoupon() {
        return new Coupon();
    }

    /**
     * Create an instance of {@link GetMemberAuditLookupReply.ProfileEmailAuditList }
     * 
     */
    public GetMemberAuditLookupReply.ProfileEmailAuditList createGetMemberAuditLookupReplyProfileEmailAuditList() {
        return new GetMemberAuditLookupReply.ProfileEmailAuditList();
    }

    /**
     * Create an instance of {@link ValidateMemberResponse }
     * 
     */
    public ValidateMemberResponse createValidateMemberResponse() {
        return new ValidateMemberResponse();
    }

    /**
     * Create an instance of {@link CloseDate }
     * 
     */
    public CloseDate createCloseDate() {
        return new CloseDate();
    }

    /**
     * Create an instance of {@link Transaction.TenderDetailList }
     * 
     */
    public Transaction.TenderDetailList createTransactionTenderDetailList() {
        return new Transaction.TenderDetailList();
    }

    /**
     * Create an instance of {@link GetRewardBalanceReply }
     * 
     */
    public GetRewardBalanceReply createGetRewardBalanceReply() {
        return new GetRewardBalanceReply();
    }

    /**
     * Create an instance of {@link GetTransactionBonusDetailsResponse.GetTransactionBonusDetailsResult }
     * 
     */
    public GetTransactionBonusDetailsResponse.GetTransactionBonusDetailsResult createGetTransactionBonusDetailsResponseGetTransactionBonusDetailsResult() {
        return new GetTransactionBonusDetailsResponse.GetTransactionBonusDetailsResult();
    }

    /**
     * Create an instance of {@link Tenders }
     * 
     */
    public Tenders createTenders() {
        return new Tenders();
    }

    /**
     * Create an instance of {@link LineItem }
     * 
     */
    public LineItem createLineItem() {
        return new LineItem();
    }

    /**
     * Create an instance of {@link FasttrackChallenge }
     * 
     */
    public FasttrackChallenge createFasttrackChallenge() {
        return new FasttrackChallenge();
    }

    /**
     * Create an instance of {@link ArrayOfTender }
     * 
     */
    public ArrayOfTender createArrayOfTender() {
        return new ArrayOfTender();
    }

    /**
     * Create an instance of {@link CardTypes }
     * 
     */
    public CardTypes createCardTypes() {
        return new CardTypes();
    }

    /**
     * Create an instance of {@link PostAdjustmentPointsResponse.PostAdjustmentPointsResult }
     * 
     */
    public PostAdjustmentPointsResponse.PostAdjustmentPointsResult createPostAdjustmentPointsResponsePostAdjustmentPointsResult() {
        return new PostAdjustmentPointsResponse.PostAdjustmentPointsResult();
    }

    /**
     * Create an instance of {@link GetMemberExtendedProfileReply }
     * 
     */
    public GetMemberExtendedProfileReply createGetMemberExtendedProfileReply() {
        return new GetMemberExtendedProfileReply();
    }

    /**
     * Create an instance of {@link RegisterMemberCardDetailsResponse }
     * 
     */
    public RegisterMemberCardDetailsResponse createRegisterMemberCardDetailsResponse() {
        return new RegisterMemberCardDetailsResponse();
    }

    /**
     * Create an instance of {@link EarnOffer }
     * 
     */
    public EarnOffer createEarnOffer() {
        return new EarnOffer();
    }

    /**
     * Create an instance of {@link AffinityExtended }
     * 
     */
    public AffinityExtended createAffinityExtended() {
        return new AffinityExtended();
    }

    /**
     * Create an instance of {@link EarnOffers }
     * 
     */
    public EarnOffers createEarnOffers() {
        return new EarnOffers();
    }

    /**
     * Create an instance of {@link ProductLevel }
     * 
     */
    public ProductLevel createProductLevel() {
        return new ProductLevel();
    }

    /**
     * Create an instance of {@link StoreNumbers }
     * 
     */
    public StoreNumbers createStoreNumbers() {
        return new StoreNumbers();
    }

    /**
     * Create an instance of {@link Members }
     * 
     */
    public Members createMembers() {
        return new Members();
    }

    /**
     * Create an instance of {@link MemberReplaceCardReply }
     * 
     */
    public MemberReplaceCardReply createMemberReplaceCardReply() {
        return new MemberReplaceCardReply();
    }

    /**
     * Create an instance of {@link Response.GetMemberTargetedOffersReply }
     * 
     */
    public Response.GetMemberTargetedOffersReply createResponseGetMemberTargetedOffersReply() {
        return new Response.GetMemberTargetedOffersReply();
    }

    /**
     * Create an instance of {@link Redemption }
     * 
     */
    public Redemption createRedemption() {
        return new Redemption();
    }

    /**
     * Create an instance of {@link GetAvailableOffersReply }
     * 
     */
    public GetAvailableOffersReply createGetAvailableOffersReply() {
        return new GetAvailableOffersReply();
    }

    /**
     * Create an instance of {@link MaxRedeemableSurprisePointsList }
     * 
     */
    public MaxRedeemableSurprisePointsList createMaxRedeemableSurprisePointsList() {
        return new MaxRedeemableSurprisePointsList();
    }

    /**
     * Create an instance of {@link LayAway }
     * 
     */
    public LayAway createLayAway() {
        return new LayAway();
    }

    /**
     * Create an instance of {@link TxnEarnOffer }
     * 
     */
    public TxnEarnOffer createTxnEarnOffer() {
        return new TxnEarnOffer();
    }

    /**
     * Create an instance of {@link ProcessAlternateCouponResponse.ProcessAlternateCouponResult }
     * 
     */
    public ProcessAlternateCouponResponse.ProcessAlternateCouponResult createProcessAlternateCouponResponseProcessAlternateCouponResult() {
        return new ProcessAlternateCouponResponse.ProcessAlternateCouponResult();
    }

    /**
     * Create an instance of {@link ProcessTransactionReply }
     * 
     */
    public ProcessTransactionReply createProcessTransactionReply() {
        return new ProcessTransactionReply();
    }

    /**
     * Create an instance of {@link PostAdjustmentPoints }
     * 
     */
    public PostAdjustmentPoints createPostAdjustmentPoints() {
        return new PostAdjustmentPoints();
    }

    /**
     * Create an instance of {@link SystemRewards }
     * 
     */
    public SystemRewards createSystemRewards() {
        return new SystemRewards();
    }

    /**
     * Create an instance of {@link GetAvailableOffersResponse.GetAvailableOffersResult }
     * 
     */
    public GetAvailableOffersResponse.GetAvailableOffersResult createGetAvailableOffersResponseGetAvailableOffersResult() {
        return new GetAvailableOffersResponse.GetAvailableOffersResult();
    }

    /**
     * Create an instance of {@link ProductGroup }
     * 
     */
    public ProductGroup createProductGroup() {
        return new ProductGroup();
    }

    /**
     * Create an instance of {@link OfferRegistrationResponse.OfferRegistrationResult }
     * 
     */
    public OfferRegistrationResponse.OfferRegistrationResult createOfferRegistrationResponseOfferRegistrationResult() {
        return new OfferRegistrationResponse.OfferRegistrationResult();
    }

    /**
     * Create an instance of {@link OffersSet }
     * 
     */
    public OffersSet createOffersSet() {
        return new OffersSet();
    }

    /**
     * Create an instance of {@link GetMemberLevelReply }
     * 
     */
    public GetMemberLevelReply createGetMemberLevelReply() {
        return new GetMemberLevelReply();
    }

    /**
     * Create an instance of {@link UpdateEmailConfirmedResponse }
     * 
     */
    public UpdateEmailConfirmedResponse createUpdateEmailConfirmedResponse() {
        return new UpdateEmailConfirmedResponse();
    }

    /**
     * Create an instance of {@link SystemReward }
     * 
     */
    public SystemReward createSystemReward() {
        return new SystemReward();
    }

    /**
     * Create an instance of {@link BirthMonth }
     * 
     */
    public BirthMonth createBirthMonth() {
        return new BirthMonth();
    }

    /**
     * Create an instance of {@link ApplicableMemberNumber }
     * 
     */
    public ApplicableMemberNumber createApplicableMemberNumber() {
        return new ApplicableMemberNumber();
    }

    /**
     * Create an instance of {@link ProcessRedemptionReply.TotalAvailableSurprisePointsList }
     * 
     */
    public ProcessRedemptionReply.TotalAvailableSurprisePointsList createProcessRedemptionReplyTotalAvailableSurprisePointsList() {
        return new ProcessRedemptionReply.TotalAvailableSurprisePointsList();
    }

    /**
     * Create an instance of {@link TotalAvailableXROfferList.TotalAvailableXROffers }
     * 
     */
    public TotalAvailableXROfferList.TotalAvailableXROffers createTotalAvailableXROfferListTotalAvailableXROffers() {
        return new TotalAvailableXROfferList.TotalAvailableXROffers();
    }

    /**
     * Create an instance of {@link ExternalCoupon }
     * 
     */
    public ExternalCoupon createExternalCoupon() {
        return new ExternalCoupon();
    }

    /**
     * Create an instance of {@link LevelInfo }
     * 
     */
    public LevelInfo createLevelInfo() {
        return new LevelInfo();
    }

    /**
     * Create an instance of {@link PostPartnerPointsResponse }
     * 
     */
    public PostPartnerPointsResponse createPostPartnerPointsResponse() {
        return new PostPartnerPointsResponse();
    }

    /**
     * Create an instance of {@link MemberExtended }
     * 
     */
    public MemberExtended createMemberExtended() {
        return new MemberExtended();
    }

    /**
     * Create an instance of {@link ApplicableQuantity }
     * 
     */
    public ApplicableQuantity createApplicableQuantity() {
        return new ApplicableQuantity();
    }

    /**
     * Create an instance of {@link com.searshc.hs.som.thm.domain.telluride.OfferMemberGroupList }
     * 
     */
    public com.searshc.hs.som.thm.domain.telluride.OfferMemberGroupList createOfferMemberGroupList() {
        return new com.searshc.hs.som.thm.domain.telluride.OfferMemberGroupList();
    }

    /**
     * Create an instance of {@link AffinityForMemberPricing }
     * 
     */
    public AffinityForMemberPricing createAffinityForMemberPricing() {
        return new AffinityForMemberPricing();
    }

    /**
     * Create an instance of {@link UpdateMemberPrimaryProfileResponse.UpdateMemberPrimaryProfileResult }
     * 
     */
    public UpdateMemberPrimaryProfileResponse.UpdateMemberPrimaryProfileResult createUpdateMemberPrimaryProfileResponseUpdateMemberPrimaryProfileResult() {
        return new UpdateMemberPrimaryProfileResponse.UpdateMemberPrimaryProfileResult();
    }

    /**
     * Create an instance of {@link ArrayOfOffer }
     * 
     */
    public ArrayOfOffer createArrayOfOffer() {
        return new ArrayOfOffer();
    }

    /**
     * Create an instance of {@link SurveyAnswer }
     * 
     */
    public SurveyAnswer createSurveyAnswer() {
        return new SurveyAnswer();
    }

    /**
     * Create an instance of {@link LineItemList }
     * 
     */
    public LineItemList createLineItemList() {
        return new LineItemList();
    }

    /**
     * Create an instance of {@link Offers }
     * 
     */
    public Offers createOffers() {
        return new Offers();
    }

    /**
     * Create an instance of {@link TransactionDetail }
     * 
     */
    public TransactionDetail createTransactionDetail() {
        return new TransactionDetail();
    }

    /**
     * Create an instance of {@link CreatePartnerEnrollmentDetailsResponse }
     * 
     */
    public CreatePartnerEnrollmentDetailsResponse createCreatePartnerEnrollmentDetailsResponse() {
        return new CreatePartnerEnrollmentDetailsResponse();
    }

    /**
     * Create an instance of {@link ProcessRedemptionReply }
     * 
     */
    public ProcessRedemptionReply createProcessRedemptionReply() {
        return new ProcessRedemptionReply();
    }

    /**
     * Create an instance of {@link UpdateEmailConfirmedResponse.UpdateEmailConfirmedResult }
     * 
     */
    public UpdateEmailConfirmedResponse.UpdateEmailConfirmedResult createUpdateEmailConfirmedResponseUpdateEmailConfirmedResult() {
        return new UpdateEmailConfirmedResponse.UpdateEmailConfirmedResult();
    }

    /**
     * Create an instance of {@link ExternalCoupons }
     * 
     */
    public ExternalCoupons createExternalCoupons() {
        return new ExternalCoupons();
    }

    /**
     * Create an instance of {@link Bonus }
     * 
     */
    public Bonus createBonus() {
        return new Bonus();
    }

    /**
     * Create an instance of {@link Store }
     * 
     */
    public Store createStore() {
        return new Store();
    }

    /**
     * Create an instance of {@link GetRewardBalanceResponse }
     * 
     */
    public GetRewardBalanceResponse createGetRewardBalanceResponse() {
        return new GetRewardBalanceResponse();
    }

    /**
     * Create an instance of {@link CheckoutPromptQuestions.FollowupQuestions.FollowupQuestion.FollowupAnswerChoices.FollowupAnswerChoice }
     * 
     */
    public CheckoutPromptQuestions.FollowupQuestions.FollowupQuestion.FollowupAnswerChoices.FollowupAnswerChoice createCheckoutPromptQuestionsFollowupQuestionsFollowupQuestionFollowupAnswerChoicesFollowupAnswerChoice() {
        return new CheckoutPromptQuestions.FollowupQuestions.FollowupQuestion.FollowupAnswerChoices.FollowupAnswerChoice();
    }

    /**
     * Create an instance of {@link UpdateMemberAffinitySubscriptionsResponse.UpdateMemberAffinitySubscriptionsResult }
     * 
     */
    public UpdateMemberAffinitySubscriptionsResponse.UpdateMemberAffinitySubscriptionsResult createUpdateMemberAffinitySubscriptionsResponseUpdateMemberAffinitySubscriptionsResult() {
        return new UpdateMemberAffinitySubscriptionsResponse.UpdateMemberAffinitySubscriptionsResult();
    }

    /**
     * Create an instance of {@link GetApplicableOffersResponse.GetApplicableOffersResult }
     * 
     */
    public GetApplicableOffersResponse.GetApplicableOffersResult createGetApplicableOffersResponseGetApplicableOffersResult() {
        return new GetApplicableOffersResponse.GetApplicableOffersResult();
    }

    /**
     * Create an instance of {@link GetMemberAffinitySubscriptionsResponse }
     * 
     */
    public GetMemberAffinitySubscriptionsResponse createGetMemberAffinitySubscriptionsResponse() {
        return new GetMemberAffinitySubscriptionsResponse();
    }

    /**
     * Create an instance of {@link CouponOffers }
     * 
     */
    public CouponOffers createCouponOffers() {
        return new CouponOffers();
    }

    /**
     * Create an instance of {@link GetAvailableOffersResponse }
     * 
     */
    public GetAvailableOffersResponse createGetAvailableOffersResponse() {
        return new GetAvailableOffersResponse();
    }

    /**
     * Create an instance of {@link ProcessAlternateCouponResponse }
     * 
     */
    public ProcessAlternateCouponResponse createProcessAlternateCouponResponse() {
        return new ProcessAlternateCouponResponse();
    }

    /**
     * Create an instance of {@link ValidatePinResponse }
     * 
     */
    public ValidatePinResponse createValidatePinResponse() {
        return new ValidatePinResponse();
    }

    /**
     * Create an instance of {@link Affinities }
     * 
     */
    public Affinities createAffinities() {
        return new Affinities();
    }

    /**
     * Create an instance of {@link ProcessSuspendedMembersResponse }
     * 
     */
    public ProcessSuspendedMembersResponse createProcessSuspendedMembersResponse() {
        return new ProcessSuspendedMembersResponse();
    }

    /**
     * Create an instance of {@link UpdateMemberEmailResponse.UpdateMemberEmailResult }
     * 
     */
    public UpdateMemberEmailResponse.UpdateMemberEmailResult createUpdateMemberEmailResponseUpdateMemberEmailResult() {
        return new UpdateMemberEmailResponse.UpdateMemberEmailResult();
    }

    /**
     * Create an instance of {@link GetMemberAffinitySubscriptionsResponse.GetMemberAffinitySubscriptionsResult }
     * 
     */
    public GetMemberAffinitySubscriptionsResponse.GetMemberAffinitySubscriptionsResult createGetMemberAffinitySubscriptionsResponseGetMemberAffinitySubscriptionsResult() {
        return new GetMemberAffinitySubscriptionsResponse.GetMemberAffinitySubscriptionsResult();
    }

    /**
     * Create an instance of {@link ProductCriteria }
     * 
     */
    public ProductCriteria createProductCriteria() {
        return new ProductCriteria();
    }

    /**
     * Create an instance of {@link Brands }
     * 
     */
    public Brands createBrands() {
        return new Brands();
    }

    /**
     * Create an instance of {@link GetCouponOfferDetailsResponse }
     * 
     */
    public GetCouponOfferDetailsResponse createGetCouponOfferDetailsResponse() {
        return new GetCouponOfferDetailsResponse();
    }

    /**
     * Create an instance of {@link Offer }
     * 
     */
    public Offer createOffer() {
        return new Offer();
    }

    /**
     * Create an instance of {@link LevelMetaData }
     * 
     */
    public LevelMetaData createLevelMetaData() {
        return new LevelMetaData();
    }

    /**
     * Create an instance of {@link PointsDetails }
     * 
     */
    public PointsDetails createPointsDetails() {
        return new PointsDetails();
    }

    /**
     * Create an instance of {@link ExtendedProfilePreferences }
     * 
     */
    public ExtendedProfilePreferences createExtendedProfilePreferences() {
        return new ExtendedProfilePreferences();
    }

    /**
     * Create an instance of {@link GetMemberActivityDetail }
     * 
     */
    public GetMemberActivityDetail createGetMemberActivityDetail() {
        return new GetMemberActivityDetail();
    }

    /**
     * Create an instance of {@link CouponOfferDetail }
     * 
     */
    public CouponOfferDetail createCouponOfferDetail() {
        return new CouponOfferDetail();
    }

    /**
     * Create an instance of {@link CreateMemberResponse }
     * 
     */
    public CreateMemberResponse createCreateMemberResponse() {
        return new CreateMemberResponse();
    }

    /**
     * Create an instance of {@link AdditionalOptions }
     * 
     */
    public AdditionalOptions createAdditionalOptions() {
        return new AdditionalOptions();
    }

    /**
     * Create an instance of {@link SurveyQuestion }
     * 
     */
    public SurveyQuestion createSurveyQuestion() {
        return new SurveyQuestion();
    }

    /**
     * Create an instance of {@link TierHistory }
     * 
     */
    public TierHistory createTierHistory() {
        return new TierHistory();
    }

    /**
     * Create an instance of {@link PostPartnerPoints }
     * 
     */
    public PostPartnerPoints createPostPartnerPoints() {
        return new PostPartnerPoints();
    }

    /**
     * Create an instance of {@link GetMemberAuditLookupResponse.GetMemberAuditResult }
     * 
     */
    public GetMemberAuditLookupResponse.GetMemberAuditResult createGetMemberAuditLookupResponseGetMemberAuditResult() {
        return new GetMemberAuditLookupResponse.GetMemberAuditResult();
    }

    /**
     * Create an instance of {@link TenderList }
     * 
     */
    public TenderList createTenderList() {
        return new TenderList();
    }

    /**
     * Create an instance of {@link AddMemberToGroupReply }
     * 
     */
    public AddMemberToGroupReply createAddMemberToGroupReply() {
        return new AddMemberToGroupReply();
    }

    /**
     * Create an instance of {@link TermAndCondition }
     * 
     */
    public TermAndCondition createTermAndCondition() {
        return new TermAndCondition();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link GetLineItemDetail }
     * 
     */
    public GetLineItemDetail createGetLineItemDetail() {
        return new GetLineItemDetail();
    }

    /**
     * Create an instance of {@link RedemptionOffersList }
     * 
     */
    public RedemptionOffersList createRedemptionOffersList() {
        return new RedemptionOffersList();
    }

    /**
     * Create an instance of {@link TierData }
     * 
     */
    public TierData createTierData() {
        return new TierData();
    }

    /**
     * Create an instance of {@link TenderGroups }
     * 
     */
    public TenderGroups createTenderGroups() {
        return new TenderGroups();
    }

    /**
     * Create an instance of {@link com.searshc.hs.som.thm.domain.telluride.TenderDetailList }
     * 
     */
    public com.searshc.hs.som.thm.domain.telluride.TenderDetailList createTenderDetailList() {
        return new com.searshc.hs.som.thm.domain.telluride.TenderDetailList();
    }

    /**
     * Create an instance of {@link Affinity }
     * 
     */
    public Affinity createAffinity() {
        return new Affinity();
    }

    /**
     * Create an instance of {@link TxnEarnOffers }
     * 
     */
    public TxnEarnOffers createTxnEarnOffers() {
        return new TxnEarnOffers();
    }

    /**
     * Create an instance of {@link OfferRegistrationReply }
     * 
     */
    public OfferRegistrationReply createOfferRegistrationReply() {
        return new OfferRegistrationReply();
    }

    /**
     * Create an instance of {@link GetPartnerEnrollmentDetailsResponse }
     * 
     */
    public GetPartnerEnrollmentDetailsResponse createGetPartnerEnrollmentDetailsResponse() {
        return new GetPartnerEnrollmentDetailsResponse();
    }

    /**
     * Create an instance of {@link States }
     * 
     */
    public States createStates() {
        return new States();
    }

    /**
     * Create an instance of {@link GetMemberAuditLookupReply }
     * 
     */
    public GetMemberAuditLookupReply createGetMemberAuditLookupReply() {
        return new GetMemberAuditLookupReply();
    }

    /**
     * Create an instance of {@link GetSystemRewardsResponse }
     * 
     */
    public GetSystemRewardsResponse createGetSystemRewardsResponse() {
        return new GetSystemRewardsResponse();
    }

    /**
     * Create an instance of {@link TestPostPointsResponse.TestBankResult }
     * 
     */
    public TestPostPointsResponse.TestBankResult createTestPostPointsResponseTestBankResult() {
        return new TestPostPointsResponse.TestBankResult();
    }

    /**
     * Create an instance of {@link UpdateMemberPinResponse.UpdateMemberPinResult }
     * 
     */
    public UpdateMemberPinResponse.UpdateMemberPinResult createUpdateMemberPinResponseUpdateMemberPinResult() {
        return new UpdateMemberPinResponse.UpdateMemberPinResult();
    }

    /**
     * Create an instance of {@link PostExternalBonus }
     * 
     */
    public PostExternalBonus createPostExternalBonus() {
        return new PostExternalBonus();
    }

    /**
     * Create an instance of {@link GetPartnerEnrollmentDetailsResponse.GetPartnerEnrollmentDetailsResult }
     * 
     */
    public GetPartnerEnrollmentDetailsResponse.GetPartnerEnrollmentDetailsResult createGetPartnerEnrollmentDetailsResponseGetPartnerEnrollmentDetailsResult() {
        return new GetPartnerEnrollmentDetailsResponse.GetPartnerEnrollmentDetailsResult();
    }

    /**
     * Create an instance of {@link FinalPayment }
     * 
     */
    public FinalPayment createFinalPayment() {
        return new FinalPayment();
    }

    /**
     * Create an instance of {@link YearToDate }
     * 
     */
    public YearToDate createYearToDate() {
        return new YearToDate();
    }

    /**
     * Create an instance of {@link AvailCoupon }
     * 
     */
    public AvailCoupon createAvailCoupon() {
        return new AvailCoupon();
    }

    /**
     * Create an instance of {@link GetMemberAuditLookupReply.ProfileStatusAuditList }
     * 
     */
    public GetMemberAuditLookupReply.ProfileStatusAuditList createGetMemberAuditLookupReplyProfileStatusAuditList() {
        return new GetMemberAuditLookupReply.ProfileStatusAuditList();
    }

    /**
     * Create an instance of {@link GetMemberPrimaryProfileResponse.GetMemberPrimaryProfileResult }
     * 
     */
    public GetMemberPrimaryProfileResponse.GetMemberPrimaryProfileResult createGetMemberPrimaryProfileResponseGetMemberPrimaryProfileResult() {
        return new GetMemberPrimaryProfileResponse.GetMemberPrimaryProfileResult();
    }

    /**
     * Create an instance of {@link CardDetail }
     * 
     */
    public CardDetail createCardDetail() {
        return new CardDetail();
    }

    /**
     * Create an instance of {@link GetMemberAuditLookupReply.ProfilePhoneAuditList }
     * 
     */
    public GetMemberAuditLookupReply.ProfilePhoneAuditList createGetMemberAuditLookupReplyProfilePhoneAuditList() {
        return new GetMemberAuditLookupReply.ProfilePhoneAuditList();
    }

    /**
     * Create an instance of {@link GetMemberActivitySummaryResponse.GetMemberActivitySummaryResult }
     * 
     */
    public GetMemberActivitySummaryResponse.GetMemberActivitySummaryResult createGetMemberActivitySummaryResponseGetMemberActivitySummaryResult() {
        return new GetMemberActivitySummaryResponse.GetMemberActivitySummaryResult();
    }

    /**
     * Create an instance of {@link ProcessAlternateCouponReply }
     * 
     */
    public ProcessAlternateCouponReply createProcessAlternateCouponReply() {
        return new ProcessAlternateCouponReply();
    }

    /**
     * Create an instance of {@link RequestMissingTransactionReply }
     * 
     */
    public RequestMissingTransactionReply createRequestMissingTransactionReply() {
        return new RequestMissingTransactionReply();
    }

    /**
     * Create an instance of {@link CheckoutPromptQuestions.FollowupQuestions.FollowupQuestion.FollowupAnswerChoices }
     * 
     */
    public CheckoutPromptQuestions.FollowupQuestions.FollowupQuestion.FollowupAnswerChoices createCheckoutPromptQuestionsFollowupQuestionsFollowupQuestionFollowupAnswerChoices() {
        return new CheckoutPromptQuestions.FollowupQuestions.FollowupQuestion.FollowupAnswerChoices();
    }

    /**
     * Create an instance of {@link Coupons }
     * 
     */
    public Coupons createCoupons() {
        return new Coupons();
    }

    /**
     * Create an instance of {@link UpdateMemberExtendedProfileResponse.UpdateMemberExtendedProfileResult }
     * 
     */
    public UpdateMemberExtendedProfileResponse.UpdateMemberExtendedProfileResult createUpdateMemberExtendedProfileResponseUpdateMemberExtendedProfileResult() {
        return new UpdateMemberExtendedProfileResponse.UpdateMemberExtendedProfileResult();
    }

    /**
     * Create an instance of {@link Spend }
     * 
     */
    public Spend createSpend() {
        return new Spend();
    }

    /**
     * Create an instance of {@link HierarchyLevels }
     * 
     */
    public HierarchyLevels createHierarchyLevels() {
        return new HierarchyLevels();
    }

    /**
     * Create an instance of {@link SpendTier }
     * 
     */
    public SpendTier createSpendTier() {
        return new SpendTier();
    }

    /**
     * Create an instance of {@link UnitPriceBeforeDiscount }
     * 
     */
    public UnitPriceBeforeDiscount createUnitPriceBeforeDiscount() {
        return new UnitPriceBeforeDiscount();
    }

    /**
     * Create an instance of {@link GetMemberActivityDetailResponse }
     * 
     */
    public GetMemberActivityDetailResponse createGetMemberActivityDetailResponse() {
        return new GetMemberActivityDetailResponse();
    }

    /**
     * Create an instance of {@link GetTransactionBonusDetailsResponse }
     * 
     */
    public GetTransactionBonusDetailsResponse createGetTransactionBonusDetailsResponse() {
        return new GetTransactionBonusDetailsResponse();
    }

    /**
     * Create an instance of {@link ProcessTransaction }
     * 
     */
    public ProcessTransaction createProcessTransaction() {
        return new ProcessTransaction();
    }

    /**
     * Create an instance of {@link GetApplicableOffersReply }
     * 
     */
    public GetApplicableOffersReply createGetApplicableOffersReply() {
        return new GetApplicableOffersReply();
    }

    /**
     * Create an instance of {@link GetMemberAuditLookupReply.ProfileTnCAuditList }
     * 
     */
    public GetMemberAuditLookupReply.ProfileTnCAuditList createGetMemberAuditLookupReplyProfileTnCAuditList() {
        return new GetMemberAuditLookupReply.ProfileTnCAuditList();
    }

    /**
     * Create an instance of {@link GetApplicableOffersResponse }
     * 
     */
    public GetApplicableOffersResponse createGetApplicableOffersResponse() {
        return new GetApplicableOffersResponse();
    }

    /**
     * Create an instance of {@link SendEmailResponse }
     * 
     */
    public SendEmailResponse createSendEmailResponse() {
        return new SendEmailResponse();
    }

    /**
     * Create an instance of {@link Epsilon }
     * 
     */
    public Epsilon createEpsilon() {
        return new Epsilon();
    }

    /**
     * Create an instance of {@link Attr }
     * 
     */
    public Attr createAttr() {
        return new Attr();
    }

    /**
     * Create an instance of {@link Member.CheckoutPrompt }
     * 
     */
    public CheckoutPrompt createMemberCheckoutPrompt() {
        return new CheckoutPrompt();
    }

    /**
     * Create an instance of {@link LineDetailsGroup }
     * 
     */
    public LineDetailsGroup createLineDetailsGroup() {
        return new LineDetailsGroup();
    }

    /**
     * Create an instance of {@link GetCouponOfferDetailsResponse.GetCouponOfferDetailsResult }
     * 
     */
    public GetCouponOfferDetailsResponse.GetCouponOfferDetailsResult createGetCouponOfferDetailsResponseGetCouponOfferDetailsResult() {
        return new GetCouponOfferDetailsResponse.GetCouponOfferDetailsResult();
    }

    /**
     * Create an instance of {@link GetMemberExtendedProfileResponse.GetMemberExtendedProfileResult }
     * 
     */
    public GetMemberExtendedProfileResponse.GetMemberExtendedProfileResult createGetMemberExtendedProfileResponseGetMemberExtendedProfileResult() {
        return new GetMemberExtendedProfileResponse.GetMemberExtendedProfileResult();
    }

    /**
     * Create an instance of {@link RequestMissingTransaction }
     * 
     */
    public RequestMissingTransaction createRequestMissingTransaction() {
        return new RequestMissingTransaction();
    }

    /**
     * Create an instance of {@link GetSystemRewards }
     * 
     */
    public GetSystemRewards createGetSystemRewards() {
        return new GetSystemRewards();
    }

    /**
     * Create an instance of {@link GetAvailableOffers }
     * 
     */
    public GetAvailableOffers createGetAvailableOffers() {
        return new GetAvailableOffers();
    }

    /**
     * Create an instance of {@link UnitPriceAfterDiscount }
     * 
     */
    public UnitPriceAfterDiscount createUnitPriceAfterDiscount() {
        return new UnitPriceAfterDiscount();
    }

    /**
     * Create an instance of {@link LocationGroups }
     * 
     */
    public LocationGroups createLocationGroups() {
        return new LocationGroups();
    }

    /**
     * Create an instance of {@link ArrayList }
     * 
     */
    public ArrayList createArrayList() {
        return new ArrayList();
    }

    /**
     * Create an instance of {@link VIPStatus }
     * 
     */
    public VIPStatus createVIPStatus() {
        return new VIPStatus();
    }

    /**
     * Create an instance of {@link StoreCriteria }
     * 
     */
    public StoreCriteria createStoreCriteria() {
        return new StoreCriteria();
    }

    /**
     * Create an instance of {@link ApplicableCardType }
     * 
     */
    public ApplicableCardType createApplicableCardType() {
        return new ApplicableCardType();
    }

    /**
     * Create an instance of {@link GetMemberAffinitySubscriptionsReply }
     * 
     */
    public GetMemberAffinitySubscriptionsReply createGetMemberAffinitySubscriptionsReply() {
        return new GetMemberAffinitySubscriptionsReply();
    }

    /**
     * Create an instance of {@link GetMemberLevelResponse }
     * 
     */
    public GetMemberLevelResponse createGetMemberLevelResponse() {
        return new GetMemberLevelResponse();
    }

    /**
     * Create an instance of {@link UpdateMemberExtendedProfileResponse }
     * 
     */
    public UpdateMemberExtendedProfileResponse createUpdateMemberExtendedProfileResponse() {
        return new UpdateMemberExtendedProfileResponse();
    }

    /**
     * Create an instance of {@link Tier }
     * 
     */
    public Tier createTier() {
        return new Tier();
    }

    /**
     * Create an instance of {@link GetCouponOfferDetailsReply }
     * 
     */
    public GetCouponOfferDetailsReply createGetCouponOfferDetailsReply() {
        return new GetCouponOfferDetailsReply();
    }

    /**
     * Create an instance of {@link CheckoutPromptQuestions.FollowupQuestions }
     * 
     */
    public CheckoutPromptQuestions.FollowupQuestions createCheckoutPromptQuestionsFollowupQuestions() {
        return new CheckoutPromptQuestions.FollowupQuestions();
    }

    /**
     * Create an instance of {@link MaxRedeemableXRPointsList }
     * 
     */
    public MaxRedeemableXRPointsList createMaxRedeemableXRPointsList() {
        return new MaxRedeemableXRPointsList();
    }

    /**
     * Create an instance of {@link CheckoutPromptQuestions.FollowupQuestions.FollowupQuestion.AnswerstoFollowup.Answer }
     * 
     */
    public CheckoutPromptQuestions.FollowupQuestions.FollowupQuestion.AnswerstoFollowup.Answer createCheckoutPromptQuestionsFollowupQuestionsFollowupQuestionAnswerstoFollowupAnswer() {
        return new CheckoutPromptQuestions.FollowupQuestions.FollowupQuestion.AnswerstoFollowup.Answer();
    }

    /**
     * Create an instance of {@link ProcessRedemptionResponse }
     * 
     */
    public ProcessRedemptionResponse createProcessRedemptionResponse() {
        return new ProcessRedemptionResponse();
    }

    /**
     * Create an instance of {@link Brand }
     * 
     */
    public Brand createBrand() {
        return new Brand();
    }

    /**
     * Create an instance of {@link MemberEarnTypes }
     * 
     */
    public MemberEarnTypes createMemberEarnTypes() {
        return new MemberEarnTypes();
    }

    /**
     * Create an instance of {@link MemberCriteria }
     * 
     */
    public MemberCriteria createMemberCriteria() {
        return new MemberCriteria();
    }

    /**
     * Create an instance of {@link StoreTypes }
     * 
     */
    public StoreTypes createStoreTypes() {
        return new StoreTypes();
    }

    /**
     * Create an instance of {@link ProcessRedemptionResponse.ProcessRedemptionResult }
     * 
     */
    public ProcessRedemptionResponse.ProcessRedemptionResult createProcessRedemptionResponseProcessRedemptionResult() {
        return new ProcessRedemptionResponse.ProcessRedemptionResult();
    }

    /**
     * Create an instance of {@link GetMemberPrimaryProfileResponse }
     * 
     */
    public GetMemberPrimaryProfileResponse createGetMemberPrimaryProfileResponse() {
        return new GetMemberPrimaryProfileResponse();
    }

    /**
     * Create an instance of {@link BirthDate }
     * 
     */
    public BirthDate createBirthDate() {
        return new BirthDate();
    }

    /**
     * Create an instance of {@link TransactionList }
     * 
     */
    public TransactionList createTransactionList() {
        return new TransactionList();
    }

    /**
     * Create an instance of {@link UpdateMemberPrimaryProfileResponse }
     * 
     */
    public UpdateMemberPrimaryProfileResponse createUpdateMemberPrimaryProfileResponse() {
        return new UpdateMemberPrimaryProfileResponse();
    }

    /**
     * Create an instance of {@link ProductGroups }
     * 
     */
    public ProductGroups createProductGroups() {
        return new ProductGroups();
    }

    /**
     * Create an instance of {@link Rules }
     * 
     */
    public Rules createRules() {
        return new Rules();
    }

    /**
     * Create an instance of {@link GetMemberAuditLookup }
     * 
     */
    public GetMemberAuditLookup createGetMemberAuditLookup() {
        return new GetMemberAuditLookup();
    }

    /**
     * Create an instance of {@link CurrentPointBalance }
     * 
     */
    public CurrentPointBalance createCurrentPointBalance() {
        return new CurrentPointBalance();
    }

    /**
     * Create an instance of {@link HierarchyLevel }
     * 
     */
    public HierarchyLevel createHierarchyLevel() {
        return new HierarchyLevel();
    }

    /**
     * Create an instance of {@link VIPTiers }
     * 
     */
    public VIPTiers createVIPTiers() {
        return new VIPTiers();
    }

    /**
     * Create an instance of {@link ApplicableXRQuantity }
     * 
     */
    public ApplicableXRQuantity createApplicableXRQuantity() {
        return new ApplicableXRQuantity();
    }

    /**
     * Create an instance of {@link AvailCouponResponse.AvailCouponResult }
     * 
     */
    public AvailCouponResponse.AvailCouponResult createAvailCouponResponseAvailCouponResult() {
        return new AvailCouponResponse.AvailCouponResult();
    }

    /**
     * Create an instance of {@link Survey }
     * 
     */
    public Survey createSurvey() {
        return new Survey();
    }

    /**
     * Create an instance of {@link Attributes }
     * 
     */
    public Attributes createAttributes() {
        return new Attributes();
    }

    /**
     * Create an instance of {@link RegisterMemberResponse.RegisterMemberResult }
     * 
     */
    public RegisterMemberResponse.RegisterMemberResult createRegisterMemberResponseRegisterMemberResult() {
        return new RegisterMemberResponse.RegisterMemberResult();
    }

    /**
     * Create an instance of {@link RewardPotentialDetails }
     * 
     */
    public RewardPotentialDetails createRewardPotentialDetails() {
        return new RewardPotentialDetails();
    }

    /**
     * Create an instance of {@link LevelData }
     * 
     */
    public LevelData createLevelData() {
        return new LevelData();
    }

    /**
     * Create an instance of {@link CheckoutPromptQuestions.AnswerChoices }
     * 
     */
    public CheckoutPromptQuestions.AnswerChoices createCheckoutPromptQuestionsAnswerChoices() {
        return new CheckoutPromptQuestions.AnswerChoices();
    }

    /**
     * Create an instance of {@link CreateMemberResponse.CreateMemberResult }
     * 
     */
    public CreateMemberResponse.CreateMemberResult createCreateMemberResponseCreateMemberResult() {
        return new CreateMemberResponse.CreateMemberResult();
    }

    /**
     * Create an instance of {@link MemberGroup }
     * 
     */
    public MemberGroup createMemberGroup() {
        return new MemberGroup();
    }

    /**
     * Create an instance of {@link VIPStatusList }
     * 
     */
    public VIPStatusList createVIPStatusList() {
        return new VIPStatusList();
    }

    /**
     * Create an instance of {@link GetLineItemDetailReply.TenderDetailList }
     * 
     */
    public GetLineItemDetailReply.TenderDetailList createGetLineItemDetailReplyTenderDetailList() {
        return new GetLineItemDetailReply.TenderDetailList();
    }

    /**
     * Create an instance of {@link RedemptionDetails }
     * 
     */
    public RedemptionDetails createRedemptionDetails() {
        return new RedemptionDetails();
    }

    /**
     * Create an instance of {@link GetMemberLevelResponse.GetMemberLevelResult }
     * 
     */
    public GetMemberLevelResponse.GetMemberLevelResult createGetMemberLevelResponseGetMemberLevelResult() {
        return new GetMemberLevelResponse.GetMemberLevelResult();
    }

    /**
     * Create an instance of {@link RedemptionOffer }
     * 
     */
    public RedemptionOffer createRedemptionOffer() {
        return new RedemptionOffer();
    }

    /**
     * Create an instance of {@link GetMemberAuditLookupReply.ProfileReceiptAuditList }
     * 
     */
    public GetMemberAuditLookupReply.ProfileReceiptAuditList createGetMemberAuditLookupReplyProfileReceiptAuditList() {
        return new GetMemberAuditLookupReply.ProfileReceiptAuditList();
    }

    /**
     * Create an instance of {@link Response }
     * 
     */
    public Response createResponse() {
        return new Response();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link GetMemberActivityDetailReply }
     * 
     */
    public GetMemberActivityDetailReply createGetMemberActivityDetailReply() {
        return new GetMemberActivityDetailReply();
    }

    /**
     * Create an instance of {@link ProductLevelSets }
     * 
     */
    public ProductLevelSets createProductLevelSets() {
        return new ProductLevelSets();
    }

    /**
     * Create an instance of {@link PriceFilter }
     * 
     */
    public PriceFilter createPriceFilter() {
        return new PriceFilter();
    }

    /**
     * Create an instance of {@link GetLineItemDetailResponse }
     * 
     */
    public GetLineItemDetailResponse createGetLineItemDetailResponse() {
        return new GetLineItemDetailResponse();
    }

    /**
     * Create an instance of {@link AddMemberToGroupResponse }
     * 
     */
    public AddMemberToGroupResponse createAddMemberToGroupResponse() {
        return new AddMemberToGroupResponse();
    }

    /**
     * Create an instance of {@link ExternalCoupon2 }
     * 
     */
    public ExternalCoupon2 createExternalCoupon2() {
        return new ExternalCoupon2();
    }

    /**
     * Create an instance of {@link GetMemberActivitySummaryResponse }
     * 
     */
    public GetMemberActivitySummaryResponse createGetMemberActivitySummaryResponse() {
        return new GetMemberActivitySummaryResponse();
    }

    /**
     * Create an instance of {@link OfferRegistrationReply.OfferMemberGroupList }
     * 
     */
    public OfferRegistrationReply.OfferMemberGroupList createOfferRegistrationReplyOfferMemberGroupList() {
        return new OfferRegistrationReply.OfferMemberGroupList();
    }

    /**
     * Create an instance of {@link XRCriteria }
     * 
     */
    public XRCriteria createXRCriteria() {
        return new XRCriteria();
    }

    /**
     * Create an instance of {@link CheckoutPromptQuestions.FollowupQuestions.FollowupQuestion.AnswerstoFollowup }
     * 
     */
    public CheckoutPromptQuestions.FollowupQuestions.FollowupQuestion.AnswerstoFollowup createCheckoutPromptQuestionsFollowupQuestionsFollowupQuestionAnswerstoFollowup() {
        return new CheckoutPromptQuestions.FollowupQuestions.FollowupQuestion.AnswerstoFollowup();
    }

    /**
     * Create an instance of {@link CheckoutPromptQuestions }
     * 
     */
    public CheckoutPromptQuestions createCheckoutPromptQuestions() {
        return new CheckoutPromptQuestions();
    }

    /**
     * Create an instance of {@link TotalAvailablePointsSummary.TotalAvailableSurprisePointsList }
     * 
     */
    public TotalAvailablePointsSummary.TotalAvailableSurprisePointsList createTotalAvailablePointsSummaryTotalAvailableSurprisePointsList() {
        return new TotalAvailablePointsSummary.TotalAvailableSurprisePointsList();
    }

    /**
     * Create an instance of {@link GetTransactionBonusDetails }
     * 
     */
    public GetTransactionBonusDetails createGetTransactionBonusDetails() {
        return new GetTransactionBonusDetails();
    }

    /**
     * Create an instance of {@link ExternalCoupons2 }
     * 
     */
    public ExternalCoupons2 createExternalCoupons2() {
        return new ExternalCoupons2();
    }

    /**
     * Create an instance of {@link ApplicableStoreFormats }
     * 
     */
    public ApplicableStoreFormats createApplicableStoreFormats() {
        return new ApplicableStoreFormats();
    }

    /**
     * Create an instance of {@link PostAdjustmentPointsResponse }
     * 
     */
    public PostAdjustmentPointsResponse createPostAdjustmentPointsResponse() {
        return new PostAdjustmentPointsResponse();
    }

    /**
     * Create an instance of {@link ChallengeOffer }
     * 
     */
    public ChallengeOffer createChallengeOffer() {
        return new ChallengeOffer();
    }

    /**
     * Create an instance of {@link Transaction }
     * 
     */
    public Transaction createTransaction() {
        return new Transaction();
    }

    /**
     * Create an instance of {@link GetTransactionBonusDetailsReply }
     * 
     */
    public GetTransactionBonusDetailsReply createGetTransactionBonusDetailsReply() {
        return new GetTransactionBonusDetailsReply();
    }

    /**
     * Create an instance of {@link XRTier }
     * 
     */
    public XRTier createXRTier() {
        return new XRTier();
    }

    /**
     * Create an instance of {@link Cities }
     * 
     */
    public Cities createCities() {
        return new Cities();
    }

    /**
     * Create an instance of {@link EnrolmentDate }
     * 
     */
    public EnrolmentDate createEnrolmentDate() {
        return new EnrolmentDate();
    }

    /**
     * Create an instance of {@link MemberMergeReplaceReply }
     * 
     */
    public MemberMergeReplaceReply createMemberMergeReplaceReply() {
        return new MemberMergeReplaceReply();
    }

    /**
     * Create an instance of {@link RewardsSummary }
     * 
     */
    public RewardsSummary createRewardsSummary() {
        return new RewardsSummary();
    }

    /**
     * Create an instance of {@link GetLineItemDetailReply }
     * 
     */
    public GetLineItemDetailReply createGetLineItemDetailReply() {
        return new GetLineItemDetailReply();
    }

    /**
     * Create an instance of {@link TestPostPointsResponse }
     * 
     */
    public TestPostPointsResponse createTestPostPointsResponse() {
        return new TestPostPointsResponse();
    }

    /**
     * Create an instance of {@link ProductLevels }
     * 
     */
    public ProductLevels createProductLevels() {
        return new ProductLevels();
    }

    /**
     * Create an instance of {@link XRTiers }
     * 
     */
    public XRTiers createXRTiers() {
        return new XRTiers();
    }

    /**
     * Create an instance of {@link TenderDetail }
     * 
     */
    public TenderDetail createTenderDetail() {
        return new TenderDetail();
    }

    /**
     * Create an instance of {@link GetMemberAuditLookupReply.ProfileAddressAuditList }
     * 
     */
    public GetMemberAuditLookupReply.ProfileAddressAuditList createGetMemberAuditLookupReplyProfileAddressAuditList() {
        return new GetMemberAuditLookupReply.ProfileAddressAuditList();
    }

    /**
     * Create an instance of {@link ApplicableOffer }
     * 
     */
    public ApplicableOffer createApplicableOffer() {
        return new ApplicableOffer();
    }

    /**
     * Create an instance of {@link ApplicableProductCriteria }
     * 
     */
    public ApplicableProductCriteria createApplicableProductCriteria() {
        return new ApplicableProductCriteria();
    }

    /**
     * Create an instance of {@link GetMemberActivitySummary }
     * 
     */
    public GetMemberActivitySummary createGetMemberActivitySummary() {
        return new GetMemberActivitySummary();
    }

    /**
     * Create an instance of {@link GetOrderTransactionsDetailResponse }
     * 
     */
    public GetOrderTransactionsDetailResponse createGetOrderTransactionsDetailResponse() {
        return new GetOrderTransactionsDetailResponse();
    }

    /**
     * Create an instance of {@link ArrayOfLineItem }
     * 
     */
    public ArrayOfLineItem createArrayOfLineItem() {
        return new ArrayOfLineItem();
    }

    /**
     * Create an instance of {@link GetRewardBalanceResponse.GetRewardBalanceResult }
     * 
     */
    public GetRewardBalanceResponse.GetRewardBalanceResult createGetRewardBalanceResponseGetRewardBalanceResult() {
        return new GetRewardBalanceResponse.GetRewardBalanceResult();
    }

    /**
     * Create an instance of {@link ErrorDesc }
     * 
     */
    public ErrorDesc createErrorDesc() {
        return new ErrorDesc();
    }

    /**
     * Create an instance of {@link PostExternalBonusResponse }
     * 
     */
    public PostExternalBonusResponse createPostExternalBonusResponse() {
        return new PostExternalBonusResponse();
    }

    /**
     * Create an instance of {@link OfferRegistrationResponse }
     * 
     */
    public OfferRegistrationResponse createOfferRegistrationResponse() {
        return new OfferRegistrationResponse();
    }

    /**
     * Create an instance of {@link PriceTypes }
     * 
     */
    public PriceTypes createPriceTypes() {
        return new PriceTypes();
    }

    /**
     * Create an instance of {@link ArrayOfOfferMemberGroupList }
     * 
     */
    public ArrayOfOfferMemberGroupList createArrayOfOfferMemberGroupList() {
        return new ArrayOfOfferMemberGroupList();
    }

    /**
     * Create an instance of {@link StoreFormats }
     * 
     */
    public StoreFormats createStoreFormats() {
        return new StoreFormats();
    }

    /**
     * Create an instance of {@link MemberOwnPointsList.MemberOwnPointsToExpire }
     * 
     */
    public MemberOwnPointsList.MemberOwnPointsToExpire createMemberOwnPointsListMemberOwnPointsToExpire() {
        return new MemberOwnPointsList.MemberOwnPointsToExpire();
    }

    /**
     * Create an instance of {@link BonusPointsSummary }
     * 
     */
    public BonusPointsSummary createBonusPointsSummary() {
        return new BonusPointsSummary();
    }

    /**
     * Create an instance of {@link MemberReplaceCardResponse.MemberReplaceCardResult }
     * 
     */
    public MemberReplaceCardResponse.MemberReplaceCardResult createMemberReplaceCardResponseMemberReplaceCardResult() {
        return new MemberReplaceCardResponse.MemberReplaceCardResult();
    }

    /**
     * Create an instance of {@link ApplicableCoupons }
     * 
     */
    public ApplicableCoupons createApplicableCoupons() {
        return new ApplicableCoupons();
    }

    /**
     * Create an instance of {@link ApplicableStoreCriteria }
     * 
     */
    public ApplicableStoreCriteria createApplicableStoreCriteria() {
        return new ApplicableStoreCriteria();
    }

    /**
     * Create an instance of {@link RedemptionDetail }
     * 
     */
    public RedemptionDetail createRedemptionDetail() {
        return new RedemptionDetail();
    }

    /**
     * Create an instance of {@link FasttrackChallenges }
     * 
     */
    public FasttrackChallenges createFasttrackChallenges() {
        return new FasttrackChallenges();
    }

    /**
     * Create an instance of {@link Response.PartnerEnrollmentDetailsResponse }
     * 
     */
    public Response.PartnerEnrollmentDetailsResponse createResponsePartnerEnrollmentDetailsResponse() {
        return new Response.PartnerEnrollmentDetailsResponse();
    }

    /**
     * Create an instance of {@link TransactionDetails }
     * 
     */
    public TransactionDetails createTransactionDetails() {
        return new TransactionDetails();
    }

    /**
     * Create an instance of {@link OfferExtended }
     * 
     */
    public OfferExtended createOfferExtended() {
        return new OfferExtended();
    }

    /**
     * Create an instance of {@link Member }
     * 
     */
    public Member createMember() {
        return new Member();
    }

    /**
     * Create an instance of {@link Additional }
     * 
     */
    public Additional createAdditional() {
        return new Additional();
    }

    /**
     * Create an instance of {@link Tender }
     * 
     */
    public Tender createTender() {
        return new Tender();
    }

    /**
     * Create an instance of {@link SpendTiers }
     * 
     */
    public SpendTiers createSpendTiers() {
        return new SpendTiers();
    }

    /**
     * Create an instance of {@link MemberOwnPointsList }
     * 
     */
    public MemberOwnPointsList createMemberOwnPointsList() {
        return new MemberOwnPointsList();
    }

    /**
     * Create an instance of {@link PostPartnerPointsReply }
     * 
     */
    public PostPartnerPointsReply createPostPartnerPointsReply() {
        return new PostPartnerPointsReply();
    }

    /**
     * Create an instance of {@link RequestMissingTransactionResponse.RequestMissingTransactionResult }
     * 
     */
    public RequestMissingTransactionResponse.RequestMissingTransactionResult createRequestMissingTransactionResponseRequestMissingTransactionResult() {
        return new RequestMissingTransactionResponse.RequestMissingTransactionResult();
    }

    /**
     * Create an instance of {@link GetMemberExtendedProfileResponse }
     * 
     */
    public GetMemberExtendedProfileResponse createGetMemberExtendedProfileResponse() {
        return new GetMemberExtendedProfileResponse();
    }

    /**
     * Create an instance of {@link MemberNumbers }
     * 
     */
    public MemberNumbers createMemberNumbers() {
        return new MemberNumbers();
    }

    /**
     * Create an instance of {@link RegisterMemberResponse }
     * 
     */
    public RegisterMemberResponse createRegisterMemberResponse() {
        return new RegisterMemberResponse();
    }

    /**
     * Create an instance of {@link CreatePartnerEnrollmentDetailsResponse.CreatePartnerEnrollmentDetailsResult }
     * 
     */
    public CreatePartnerEnrollmentDetailsResponse.CreatePartnerEnrollmentDetailsResult createCreatePartnerEnrollmentDetailsResponseCreatePartnerEnrollmentDetailsResult() {
        return new CreatePartnerEnrollmentDetailsResponse.CreatePartnerEnrollmentDetailsResult();
    }

    /**
     * Create an instance of {@link AddMemberToGroup }
     * 
     */
    public AddMemberToGroup createAddMemberToGroup() {
        return new AddMemberToGroup();
    }

    /**
     * Create an instance of {@link PostExternalBonusReply }
     * 
     */
    public PostExternalBonusReply createPostExternalBonusReply() {
        return new PostExternalBonusReply();
    }

    /**
     * Create an instance of {@link SubClubs }
     * 
     */
    public SubClubs createSubClubs() {
        return new SubClubs();
    }

    /**
     * Create an instance of {@link GetMemberAuditLookupReply.ProfileMergeAuditList }
     * 
     */
    public GetMemberAuditLookupReply.ProfileMergeAuditList createGetMemberAuditLookupReplyProfileMergeAuditList() {
        return new GetMemberAuditLookupReply.ProfileMergeAuditList();
    }

    /**
     * Create an instance of {@link AddMemberToGroupResponse.AddMemberToGroupResult }
     * 
     */
    public AddMemberToGroupResponse.AddMemberToGroupResult createAddMemberToGroupResponseAddMemberToGroupResult() {
        return new AddMemberToGroupResponse.AddMemberToGroupResult();
    }

    /**
     * Create an instance of {@link TestPostPoints }
     * 
     */
    public TestPostPoints createTestPostPoints() {
        return new TestPostPoints();
    }

    /**
     * Create an instance of {@link UpdateMemberPinResponse }
     * 
     */
    public UpdateMemberPinResponse createUpdateMemberPinResponse() {
        return new UpdateMemberPinResponse();
    }

    /**
     * Create an instance of {@link TimeLeft }
     * 
     */
    public TimeLeft createTimeLeft() {
        return new TimeLeft();
    }

    /**
     * Create an instance of {@link Caps }
     * 
     */
    public Caps createCaps() {
        return new Caps();
    }

    /**
     * Create an instance of {@link Phone }
     * 
     */
    public Phone createPhone() {
        return new Phone();
    }

    /**
     * Create an instance of {@link OfferMemberGroup }
     * 
     */
    public OfferMemberGroup createOfferMemberGroup() {
        return new OfferMemberGroup();
    }

    /**
     * Create an instance of {@link ArrayOfCoupon }
     * 
     */
    public ArrayOfCoupon createArrayOfCoupon() {
        return new ArrayOfCoupon();
    }

    /**
     * Create an instance of {@link BonusExtended }
     * 
     */
    public BonusExtended createBonusExtended() {
        return new BonusExtended();
    }

    /**
     * Create an instance of {@link SearsPriceType }
     * 
     */
    public SearsPriceType createSearsPriceType() {
        return new SearsPriceType();
    }

    /**
     * Create an instance of {@link GetMemberLookupResponse.GetMemberLookupResult }
     * 
     */
    public GetMemberLookupResponse.GetMemberLookupResult createGetMemberLookupResponseGetMemberLookupResult() {
        return new GetMemberLookupResponse.GetMemberLookupResult();
    }

    /**
     * Create an instance of {@link OfferRegistration }
     * 
     */
    public OfferRegistration createOfferRegistration() {
        return new OfferRegistration();
    }

    /**
     * Create an instance of {@link ApplicableOfferTiers }
     * 
     */
    public ApplicableOfferTiers createApplicableOfferTiers() {
        return new ApplicableOfferTiers();
    }

    /**
     * Create an instance of {@link GetSystemRewardsResponse.GetSystemRewardsResult }
     * 
     */
    public GetSystemRewardsResponse.GetSystemRewardsResult createGetSystemRewardsResponseGetSystemRewardsResult() {
        return new GetSystemRewardsResponse.GetSystemRewardsResult();
    }

    /**
     * Create an instance of {@link CouponOffer }
     * 
     */
    public CouponOffer createCouponOffer() {
        return new CouponOffer();
    }

    /**
     * Create an instance of {@link PhoneNumbers }
     * 
     */
    public PhoneNumbers createPhoneNumbers() {
        return new PhoneNumbers();
    }

    /**
     * Create an instance of {@link TenderGroup }
     * 
     */
    public TenderGroup createTenderGroup() {
        return new TenderGroup();
    }

    /**
     * Create an instance of {@link MemberReplaceCardResponse }
     * 
     */
    public MemberReplaceCardResponse createMemberReplaceCardResponse() {
        return new MemberReplaceCardResponse();
    }

    /**
     * Create an instance of {@link GetMemberLookupReply }
     * 
     */
    public GetMemberLookupReply createGetMemberLookupReply() {
        return new GetMemberLookupReply();
    }

    /**
     * Create an instance of {@link RedemptionResponse }
     * 
     */
    public RedemptionResponse createRedemptionResponse() {
        return new RedemptionResponse();
    }

    /**
     * Create an instance of {@link AvailCouponReply }
     * 
     */
    public AvailCouponReply createAvailCouponReply() {
        return new AvailCouponReply();
    }

    /**
     * Create an instance of {@link UpdateMemberAffinitySubscriptionsResponse }
     * 
     */
    public UpdateMemberAffinitySubscriptionsResponse createUpdateMemberAffinitySubscriptionsResponse() {
        return new UpdateMemberAffinitySubscriptionsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfProductList }
     * 
     */
    public ArrayOfProductList createArrayOfProductList() {
        return new ArrayOfProductList();
    }

    /**
     * Create an instance of {@link TransactionCriteria }
     * 
     */
    public TransactionCriteria createTransactionCriteria() {
        return new TransactionCriteria();
    }

    /**
     * Create an instance of {@link ValidateMemberResponse.ValidateMemberResult }
     * 
     */
    public ValidateMemberResponse.ValidateMemberResult createValidateMemberResponseValidateMemberResult() {
        return new ValidateMemberResponse.ValidateMemberResult();
    }

    /**
     * Create an instance of {@link ProcessTransactionResponse.ProcessTransactionResult }
     * 
     */
    public ProcessTransactionResponse.ProcessTransactionResult createProcessTransactionResponseProcessTransactionResult() {
        return new ProcessTransactionResponse.ProcessTransactionResult();
    }

    /**
     * Create an instance of {@link TermsAndConditions }
     * 
     */
    public TermsAndConditions createTermsAndConditions() {
        return new TermsAndConditions();
    }

    /**
     * Create an instance of {@link GetOrderTransactionsDetailReply }
     * 
     */
    public GetOrderTransactionsDetailReply createGetOrderTransactionsDetailReply() {
        return new GetOrderTransactionsDetailReply();
    }

    /**
     * Create an instance of {@link GetMemberAuditLookupReply.ProfileNameAuditList }
     * 
     */
    public GetMemberAuditLookupReply.ProfileNameAuditList createGetMemberAuditLookupReplyProfileNameAuditList() {
        return new GetMemberAuditLookupReply.ProfileNameAuditList();
    }

    /**
     * Create an instance of {@link RequestMissingTransactionResponse }
     * 
     */
    public RequestMissingTransactionResponse createRequestMissingTransactionResponse() {
        return new RequestMissingTransactionResponse();
    }

    /**
     * Create an instance of {@link GetMemberActivityDetailResponse.GetMemberActivityDetailResult }
     * 
     */
    public GetMemberActivityDetailResponse.GetMemberActivityDetailResult createGetMemberActivityDetailResponseGetMemberActivityDetailResult() {
        return new GetMemberActivityDetailResponse.GetMemberActivityDetailResult();
    }

    /**
     * Create an instance of {@link CouponOfferDetails }
     * 
     */
    public CouponOfferDetails createCouponOfferDetails() {
        return new CouponOfferDetails();
    }

    /**
     * Create an instance of {@link ValidatePinResponse.ValidatePinResult }
     * 
     */
    public ValidatePinResponse.ValidatePinResult createValidatePinResponseValidatePinResult() {
        return new ValidatePinResponse.ValidatePinResult();
    }

    /**
     * Create an instance of {@link Bonuses }
     * 
     */
    public Bonuses createBonuses() {
        return new Bonuses();
    }

    /**
     * Create an instance of {@link Messages }
     * 
     */
    public Messages createMessages() {
        return new Messages();
    }

    /**
     * Create an instance of {@link OpenDate }
     * 
     */
    public OpenDate createOpenDate() {
        return new OpenDate();
    }

    /**
     * Create an instance of {@link SendEmailResponse.SendEmailResult }
     * 
     */
    public SendEmailResponse.SendEmailResult createSendEmailResponseSendEmailResult() {
        return new SendEmailResponse.SendEmailResult();
    }

    /**
     * Create an instance of {@link SendEmailReply }
     * 
     */
    public SendEmailReply createSendEmailReply() {
        return new SendEmailReply();
    }

    /**
     * Create an instance of {@link ProductLevelSet }
     * 
     */
    public ProductLevelSet createProductLevelSet() {
        return new ProductLevelSet();
    }

    /**
     * Create an instance of {@link ExtendedProfilePreference }
     * 
     */
    public ExtendedProfilePreference createExtendedProfilePreference() {
        return new ExtendedProfilePreference();
    }

    /**
     * Create an instance of {@link EarnCriteria }
     * 
     */
    public EarnCriteria createEarnCriteria() {
        return new EarnCriteria();
    }

    /**
     * Create an instance of {@link GetOrderTransactionsDetailResponse.GetOrderTransactionsDetailResult }
     * 
     */
    public GetOrderTransactionsDetailResponse.GetOrderTransactionsDetailResult createGetOrderTransactionsDetailResponseGetOrderTransactionsDetailResult() {
        return new GetOrderTransactionsDetailResponse.GetOrderTransactionsDetailResult();
    }

    /**
     * Create an instance of {@link GetPartnerEnrollmentDetailsReply }
     * 
     */
    public GetPartnerEnrollmentDetailsReply createGetPartnerEnrollmentDetailsReply() {
        return new GetPartnerEnrollmentDetailsReply();
    }

    /**
     * Create an instance of {@link OfferDetails }
     * 
     */
    public OfferDetails createOfferDetails() {
        return new OfferDetails();
    }

    /**
     * Create an instance of {@link Coupon2 }
     * 
     */
    public Coupon2 createCoupon2() {
        return new Coupon2();
    }

    /**
     * Create an instance of {@link VIPTierInfo }
     * 
     */
    public VIPTierInfo createVIPTierInfo() {
        return new VIPTierInfo();
    }

    /**
     * Create an instance of {@link TotalAvailableXROfferList }
     * 
     */
    public TotalAvailableXROfferList createTotalAvailableXROfferList() {
        return new TotalAvailableXROfferList();
    }

    /**
     * Create an instance of {@link GetMemberAuditLookupResponse }
     * 
     */
    public GetMemberAuditLookupResponse createGetMemberAuditLookupResponse() {
        return new GetMemberAuditLookupResponse();
    }

    /**
     * Create an instance of {@link CardDetails }
     * 
     */
    public CardDetails createCardDetails() {
        return new CardDetails();
    }

    /**
     * Create an instance of {@link GetApplicableOffers }
     * 
     */
    public GetApplicableOffers createGetApplicableOffers() {
        return new GetApplicableOffers();
    }

    /**
     * Create an instance of {@link TotalAvailableXRPointsList }
     * 
     */
    public TotalAvailableXRPointsList createTotalAvailableXRPointsList() {
        return new TotalAvailableXRPointsList();
    }

    /**
     * Create an instance of {@link TotalAvailablePointsSummary }
     * 
     */
    public TotalAvailablePointsSummary createTotalAvailablePointsSummary() {
        return new TotalAvailablePointsSummary();
    }

    /**
     * Create an instance of {@link ProductInfo }
     * 
     */
    public ProductInfo createProductInfo() {
        return new ProductInfo();
    }

    /**
     * Create an instance of {@link RedemptionReply }
     * 
     */
    public RedemptionReply createRedemptionReply() {
        return new RedemptionReply();
    }

    /**
     * Create an instance of {@link SendEmail }
     * 
     */
    public SendEmail createSendEmail() {
        return new SendEmail();
    }

    /**
     * Create an instance of {@link KmartPriceType }
     * 
     */
    public KmartPriceType createKmartPriceType() {
        return new KmartPriceType();
    }

    /**
     * Create an instance of {@link ProcessSuspendedMembersResponse.ProcessSuspendedMembersResult }
     * 
     */
    public ProcessSuspendedMembersResponse.ProcessSuspendedMembersResult createProcessSuspendedMembersResponseProcessSuspendedMembersResult() {
        return new ProcessSuspendedMembersResponse.ProcessSuspendedMembersResult();
    }

    /**
     * Create an instance of {@link ProcessTransactionResponse }
     * 
     */
    public ProcessTransactionResponse createProcessTransactionResponse() {
        return new ProcessTransactionResponse();
    }

    /**
     * Create an instance of {@link GetMemberLookupResponse }
     * 
     */
    public GetMemberLookupResponse createGetMemberLookupResponse() {
        return new GetMemberLookupResponse();
    }

    /**
     * Create an instance of {@link GetSystemRewardsReply }
     * 
     */
    public GetSystemRewardsReply createGetSystemRewardsReply() {
        return new GetSystemRewardsReply();
    }

    /**
     * Create an instance of {@link PostExternalBonusResponse.PostExternalBonusResult }
     * 
     */
    public PostExternalBonusResponse.PostExternalBonusResult createPostExternalBonusResponsePostExternalBonusResult() {
        return new PostExternalBonusResponse.PostExternalBonusResult();
    }

    /**
     * Create an instance of {@link Tender2 }
     * 
     */
    public Tender2 createTender2() {
        return new Tender2();
    }

    /**
     * Create an instance of {@link MaxRedeemableXRPointsList.RedeemableXRPoints }
     * 
     */
    public MaxRedeemableXRPointsList.RedeemableXRPoints createMaxRedeemableXRPointsListRedeemableXRPoints() {
        return new MaxRedeemableXRPointsList.RedeemableXRPoints();
    }

    /**
     * Create an instance of {@link GetMemberActivityReply }
     * 
     */
    public GetMemberActivityReply createGetMemberActivityReply() {
        return new GetMemberActivityReply();
    }

    /**
     * Create an instance of {@link TargetValue }
     * 
     */
    public TargetValue createTargetValue() {
        return new TargetValue();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "TransactionType")
    public JAXBElement<String> createTransactionType(String value) {
        return new JAXBElement<String>(_TransactionType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "OriginalStoreNumber")
    public JAXBElement<String> createOriginalStoreNumber(String value) {
        return new JAXBElement<String>(_OriginalStoreNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "EndDTTM")
    public JAXBElement<Object> createEndDTTM(Object value) {
        return new JAXBElement<Object>(_EndDTTM_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "CouponNumber")
    public JAXBElement<String> createCouponNumber(String value) {
        return new JAXBElement<String>(_CouponNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "VIPTier")
    public JAXBElement<String> createVIPTier(String value) {
        return new JAXBElement<String>(_VIPTier_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Member }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "Member")
    public JAXBElement<Member> createMember(Member value) {
        return new JAXBElement<Member>(_Member_QNAME, Member.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OfferRegistration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "OfferRegistration")
    public JAXBElement<OfferRegistration> createOfferRegistration(OfferRegistration value) {
        return new JAXBElement<OfferRegistration>(_OfferRegistration_QNAME, OfferRegistration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "OrderStoreNumber")
    public JAXBElement<String> createOrderStoreNumber(String value) {
        return new JAXBElement<String>(_OrderStoreNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PointsDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "PointsDetails")
    public JAXBElement<PointsDetails> createPointsDetails(PointsDetails value) {
        return new JAXBElement<PointsDetails>(_PointsDetails_QNAME, PointsDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "GetMemberTargetedOffersResponse")
    public JAXBElement<Object> createGetMemberTargetedOffersResponse(Object value) {
        return new JAXBElement<Object>(_GetMemberTargetedOffersResponse_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "LayawayNumber")
    public JAXBElement<String> createLayawayNumber(String value) {
        return new JAXBElement<String>(_LayawayNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "RedeemedPointsOriginalDollarValue")
    public JAXBElement<BigDecimal> createRedeemedPointsOriginalDollarValue(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RedeemedPointsOriginalDollarValue_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "CountryCode")
    public JAXBElement<String> createCountryCode(String value) {
        return new JAXBElement<String>(_CountryCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "EnrollmentDTTM")
    public JAXBElement<Object> createEnrollmentDTTM(Object value) {
        return new JAXBElement<Object>(_EnrollmentDTTM_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "EnrollmentStoreFormat")
    public JAXBElement<String> createEnrollmentStoreFormat(String value) {
        return new JAXBElement<String>(_EnrollmentStoreFormat_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "FirstName")
    public JAXBElement<String> createFirstName(String value) {
        return new JAXBElement<String>(_FirstName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "CouponItemLevelOffer")
    public JAXBElement<String> createCouponItemLevelOffer(String value) {
        return new JAXBElement<String>(_CouponItemLevelOffer_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "ItemDescription")
    public JAXBElement<String> createItemDescription(String value) {
        return new JAXBElement<String>(_ItemDescription_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "TxnEarnOfferName")
    public JAXBElement<String> createTxnEarnOfferName(String value) {
        return new JAXBElement<String>(_TxnEarnOfferName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "AlternateCouponOfferPoints")
    public JAXBElement<BigInteger> createAlternateCouponOfferPoints(BigInteger value) {
        return new JAXBElement<BigInteger>(_AlternateCouponOfferPoints_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/common", name = "DollarValueOfPointsRedeemedOnBonusOffer")
    public JAXBElement<String> createDollarValueOfPointsRedeemedOnBonusOffer(String value) {
        return new JAXBElement<String>(_DollarValueOfPointsRedeemedOnBonusOffer_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "OfferName")
    public JAXBElement<String> createOfferName(String value) {
        return new JAXBElement<String>(_OfferName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "RedemptionDollarValue")
    public JAXBElement<BigDecimal> createRedemptionDollarValue(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RedemptionDollarValue_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "PostPartnerPointsResponse")
    public JAXBElement<Object> createPostPartnerPointsResponse(Object value) {
        return new JAXBElement<Object>(_PostPartnerPointsResponse_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "City")
    public JAXBElement<String> createCity(String value) {
        return new JAXBElement<String>(_City_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "StoreNumber")
    public JAXBElement<String> createStoreNumber(String value) {
        return new JAXBElement<String>(_StoreNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "ChallengeDesc")
    public JAXBElement<String> createChallengeDesc(String value) {
        return new JAXBElement<String>(_ChallengeDesc_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "CardNumber")
    public JAXBElement<String> createCardNumber(String value) {
        return new JAXBElement<String>(_CardNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "SalesCheckNumber")
    public JAXBElement<String> createSalesCheckNumber(String value) {
        return new JAXBElement<String>(_SalesCheckNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMemberToGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "AddMemberToGroup")
    public JAXBElement<AddMemberToGroup> createAddMemberToGroup(AddMemberToGroup value) {
        return new JAXBElement<AddMemberToGroup>(_AddMemberToGroup_QNAME, AddMemberToGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "FinalPaymentDate")
    public JAXBElement<Object> createFinalPaymentDate(Object value) {
        return new JAXBElement<Object>(_FinalPaymentDate_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "MobileValid")
    public JAXBElement<String> createMobileValid(String value) {
        return new JAXBElement<String>(_MobileValid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "Message")
    public JAXBElement<String> createMessage(String value) {
        return new JAXBElement<String>(_Message_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "DateUpdated")
    public JAXBElement<Object> createDateUpdated(Object value) {
        return new JAXBElement<Object>(_DateUpdated_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "TotalRedeemed")
    public JAXBElement<BigInteger> createTotalRedeemed(BigInteger value) {
        return new JAXBElement<BigInteger>(_TotalRedeemed_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "OriginalTransactionTime")
    public JAXBElement<String> createOriginalTransactionTime(String value) {
        return new JAXBElement<String>(_OriginalTransactionTime_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "TxnPointsEarnedTxt")
    public JAXBElement<String> createTxnPointsEarnedTxt(String value) {
        return new JAXBElement<String>(_TxnPointsEarnedTxt_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "TenderAmount")
    public JAXBElement<String> createTenderAmount(String value) {
        return new JAXBElement<String>(_TenderAmount_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "PreferredLanguage")
    public JAXBElement<String> createPreferredLanguage(String value) {
        return new JAXBElement<String>(_PreferredLanguage_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "RedeemedValue")
    public JAXBElement<BigDecimal> createRedeemedValue(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RedeemedValue_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "DateTimeOnServer")
    public JAXBElement<Object> createDateTimeOnServer(Object value) {
        return new JAXBElement<Object>(_DateTimeOnServer_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "PickUpStoreNumber")
    public JAXBElement<String> createPickUpStoreNumber(String value) {
        return new JAXBElement<String>(_PickUpStoreNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "MemberNumber")
    public JAXBElement<String> createMemberNumber(String value) {
        return new JAXBElement<String>(_MemberNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "BasePointsEarnedTxt")
    public JAXBElement<String> createBasePointsEarnedTxt(String value) {
        return new JAXBElement<String>(_BasePointsEarnedTxt_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "OriginalTransactionDate")
    public JAXBElement<String> createOriginalTransactionDate(String value) {
        return new JAXBElement<String>(_OriginalTransactionDate_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "ResponseDate")
    public JAXBElement<Object> createResponseDate(Object value) {
        return new JAXBElement<Object>(_ResponseDate_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "RedemptionSystemCode")
    public JAXBElement<String> createRedemptionSystemCode(String value) {
        return new JAXBElement<String>(_RedemptionSystemCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "LastName")
    public JAXBElement<String> createLastName(String value) {
        return new JAXBElement<String>(_LastName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "TransactionTotal")
    public JAXBElement<String> createTransactionTotal(String value) {
        return new JAXBElement<String>(_TransactionTotal_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "CouponPointsEarned")
    public JAXBElement<BigInteger> createCouponPointsEarned(BigInteger value) {
        return new JAXBElement<BigInteger>(_CouponPointsEarned_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "EmailStatusReturn")
    public JAXBElement<String> createEmailStatusReturn(String value) {
        return new JAXBElement<String>(_EmailStatusReturn_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "MemberEarnType")
    public JAXBElement<String> createMemberEarnType(String value) {
        return new JAXBElement<String>(_MemberEarnType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "OnlineValidationDate")
    public JAXBElement<Object> createOnlineValidationDate(Object value) {
        return new JAXBElement<Object>(_OnlineValidationDate_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Offer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/common", name = "Offer")
    public JAXBElement<Offer> createOffer(Offer value) {
        return new JAXBElement<Offer>(_Offer_QNAME, Offer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "ClubStatus")
    public JAXBElement<String> createClubStatus(String value) {
        return new JAXBElement<String>(_ClubStatus_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "UPC")
    public JAXBElement<String> createUPC(String value) {
        return new JAXBElement<String>(_UPC_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "OfferEndDate")
    public JAXBElement<Object> createOfferEndDate(Object value) {
        return new JAXBElement<Object>(_OfferEndDate_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "RedeemablePointsInd")
    public JAXBElement<String> createRedeemablePointsInd(String value) {
        return new JAXBElement<String>(_RedeemablePointsInd_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "RedemptionOfferCode")
    public JAXBElement<String> createRedemptionOfferCode(String value) {
        return new JAXBElement<String>(_RedemptionOfferCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "CurrencyDebit")
    public JAXBElement<String> createCurrencyDebit(String value) {
        return new JAXBElement<String>(_CurrencyDebit_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "EarnOfferName")
    public JAXBElement<String> createEarnOfferName(String value) {
        return new JAXBElement<String>(_EarnOfferName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "LanguagePreference")
    public JAXBElement<String> createLanguagePreference(String value) {
        return new JAXBElement<String>(_LanguagePreference_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "TaxAmount")
    public JAXBElement<String> createTaxAmount(String value) {
        return new JAXBElement<String>(_TaxAmount_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "SearsEmailOptStatus")
    public JAXBElement<String> createSearsEmailOptStatus(String value) {
        return new JAXBElement<String>(_SearsEmailOptStatus_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "PostAdjustmentPointsResponse")
    public JAXBElement<Object> createPostAdjustmentPointsResponse(Object value) {
        return new JAXBElement<Object>(_PostAdjustmentPointsResponse_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "LineItemAmountTypeCode")
    public JAXBElement<String> createLineItemAmountTypeCode(String value) {
        return new JAXBElement<String>(_LineItemAmountTypeCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "ClubDNPStatus")
    public JAXBElement<String> createClubDNPStatus(String value) {
        return new JAXBElement<String>(_ClubDNPStatus_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "EndDTTMstr")
    public JAXBElement<String> createEndDTTMstr(String value) {
        return new JAXBElement<String>(_EndDTTMstr_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "AlternateCouponFlag")
    public JAXBElement<String> createAlternateCouponFlag(String value) {
        return new JAXBElement<String>(_AlternateCouponFlag_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "EmailConfirmed")
    public JAXBElement<String> createEmailConfirmed(String value) {
        return new JAXBElement<String>(_EmailConfirmed_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "TotalRedeemablePoints")
    public JAXBElement<BigInteger> createTotalRedeemablePoints(BigInteger value) {
        return new JAXBElement<BigInteger>(_TotalRedeemablePoints_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "BonusID")
    public JAXBElement<String> createBonusID(String value) {
        return new JAXBElement<String>(_BonusID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "EnrollmentStoreNumber")
    public JAXBElement<String> createEnrollmentStoreNumber(String value) {
        return new JAXBElement<String>(_EnrollmentStoreNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "msg5")
    public JAXBElement<String> createMsg5(String value) {
        return new JAXBElement<String>(_Msg5_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "msg1")
    public JAXBElement<String> createMsg1(String value) {
        return new JAXBElement<String>(_Msg1_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "msg2")
    public JAXBElement<String> createMsg2(String value) {
        return new JAXBElement<String>(_Msg2_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/common", name = "MemberSavingsDollarValue")
    public JAXBElement<String> createMemberSavingsDollarValue(String value) {
        return new JAXBElement<String>(_MemberSavingsDollarValue_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "msg3")
    public JAXBElement<String> createMsg3(String value) {
        return new JAXBElement<String>(_Msg3_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "msg4")
    public JAXBElement<String> createMsg4(String value) {
        return new JAXBElement<String>(_Msg4_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "ContractNumber")
    public JAXBElement<String> createContractNumber(String value) {
        return new JAXBElement<String>(_ContractNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "PointDebit")
    public JAXBElement<String> createPointDebit(String value) {
        return new JAXBElement<String>(_PointDebit_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestPostPointsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "TestPostPointsResponse")
    public JAXBElement<TestPostPointsResponse> createTestPostPointsResponse(TestPostPointsResponse value) {
        return new JAXBElement<TestPostPointsResponse>(_TestPostPointsResponse_QNAME, TestPostPointsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "TransactionNumber")
    public JAXBElement<String> createTransactionNumber(String value) {
        return new JAXBElement<String>(_TransactionNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "OfferType")
    public JAXBElement<String> createOfferType(String value) {
        return new JAXBElement<String>(_OfferType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "Multiplier")
    public JAXBElement<BigDecimal> createMultiplier(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Multiplier_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "OriginalLineNumber")
    public JAXBElement<String> createOriginalLineNumber(String value) {
        return new JAXBElement<String>(_OriginalLineNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "EnrollmentSourceCode")
    public JAXBElement<String> createEnrollmentSourceCode(String value) {
        return new JAXBElement<String>(_EnrollmentSourceCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "TenderType")
    public JAXBElement<String> createTenderType(String value) {
        return new JAXBElement<String>(_TenderType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "TotalBonusPointsEarnedTxt")
    public JAXBElement<String> createTotalBonusPointsEarnedTxt(String value) {
        return new JAXBElement<String>(_TotalBonusPointsEarnedTxt_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "Deceased")
    public JAXBElement<Boolean> createDeceased(Boolean value) {
        return new JAXBElement<Boolean>(_Deceased_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "NewMemberNumber")
    public JAXBElement<String> createNewMemberNumber(String value) {
        return new JAXBElement<String>(_NewMemberNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "ResponseCode")
    public JAXBElement<String> createResponseCode(String value) {
        return new JAXBElement<String>(_ResponseCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "RedeemableSurprisePoints")
    public JAXBElement<Object> createRedeemableSurprisePoints(Object value) {
        return new JAXBElement<Object>(_RedeemableSurprisePoints_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "PointsToAdd")
    public JAXBElement<BigInteger> createPointsToAdd(BigInteger value) {
        return new JAXBElement<BigInteger>(_PointsToAdd_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "RedeemedDollarValue")
    public JAXBElement<String> createRedeemedDollarValue(String value) {
        return new JAXBElement<String>(_RedeemedDollarValue_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "GrossDollarAmount")
    public JAXBElement<BigDecimal> createGrossDollarAmount(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GrossDollarAmount_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "Quantity")
    public JAXBElement<String> createQuantity(String value) {
        return new JAXBElement<String>(_Quantity_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "PointsEarned")
    public JAXBElement<BigInteger> createPointsEarned(BigInteger value) {
        return new JAXBElement<BigInteger>(_PointsEarned_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "StatusText")
    public JAXBElement<String> createStatusText(String value) {
        return new JAXBElement<String>(_StatusText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "Completed")
    public JAXBElement<String> createCompleted(String value) {
        return new JAXBElement<String>(_Completed_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "ItemNumber")
    public JAXBElement<String> createItemNumber(String value) {
        return new JAXBElement<String>(_ItemNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "CurrentTier")
    public JAXBElement<String> createCurrentTier(String value) {
        return new JAXBElement<String>(_CurrentTier_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "RegisterNumber")
    public JAXBElement<String> createRegisterNumber(String value) {
        return new JAXBElement<String>(_RegisterNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "QuestionID")
    public JAXBElement<Object> createQuestionID(Object value) {
        return new JAXBElement<Object>(_QuestionID_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "LineItem")
    public JAXBElement<Object> createLineItem(Object value) {
        return new JAXBElement<Object>(_LineItem_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "Name")
    public JAXBElement<String> createName(String value) {
        return new JAXBElement<String>(_Name_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "TotalEarned")
    public JAXBElement<BigInteger> createTotalEarned(BigInteger value) {
        return new JAXBElement<BigInteger>(_TotalEarned_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "PointsRedeemedOnBonusOffer")
    public JAXBElement<String> createPointsRedeemedOnBonusOffer(String value) {
        return new JAXBElement<String>(_PointsRedeemedOnBonusOffer_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "ItemLevelOffer")
    public JAXBElement<String> createItemLevelOffer(String value) {
        return new JAXBElement<String>(_ItemLevelOffer_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "CashierID")
    public JAXBElement<String> createCashierID(String value) {
        return new JAXBElement<String>(_CashierID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "StartDTTMstr")
    public JAXBElement<String> createStartDTTMstr(String value) {
        return new JAXBElement<String>(_StartDTTMstr_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "CouponOfferCode")
    public JAXBElement<String> createCouponOfferCode(String value) {
        return new JAXBElement<String>(_CouponOfferCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "RedeemedPointsXRDollarValue")
    public JAXBElement<BigDecimal> createRedeemedPointsXRDollarValue(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RedeemedPointsXRDollarValue_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "ChallengeStatusText")
    public JAXBElement<String> createChallengeStatusText(String value) {
        return new JAXBElement<String>(_ChallengeStatusText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "ZipCodeExtension")
    public JAXBElement<String> createZipCodeExtension(String value) {
        return new JAXBElement<String>(_ZipCodeExtension_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "TotalPointsRedeemed")
    public JAXBElement<BigInteger> createTotalPointsRedeemed(BigInteger value) {
        return new JAXBElement<BigInteger>(_TotalPointsRedeemed_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "IncompleteProfileInd")
    public JAXBElement<String> createIncompleteProfileInd(String value) {
        return new JAXBElement<String>(_IncompleteProfileInd_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "DOB")
    public JAXBElement<Object> createDOB(Object value) {
        return new JAXBElement<Object>(_DOB_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "MiddleInitial")
    public JAXBElement<String> createMiddleInitial(String value) {
        return new JAXBElement<String>(_MiddleInitial_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "MemberSinceDate")
    public JAXBElement<Object> createMemberSinceDate(Object value) {
        return new JAXBElement<Object>(_MemberSinceDate_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "OfferPointsRedeemed")
    public JAXBElement<BigInteger> createOfferPointsRedeemed(BigInteger value) {
        return new JAXBElement<BigInteger>(_OfferPointsRedeemed_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "TransactionTime")
    public JAXBElement<Object> createTransactionTime(Object value) {
        return new JAXBElement<Object>(_TransactionTime_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "TransactionID")
    public JAXBElement<String> createTransactionID(String value) {
        return new JAXBElement<String>(_TransactionID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "CreationChannel")
    public JAXBElement<String> createCreationChannel(String value) {
        return new JAXBElement<String>(_CreationChannel_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "LineNumber")
    public JAXBElement<String> createLineNumber(String value) {
        return new JAXBElement<String>(_LineNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "PreferenceValue")
    public JAXBElement<String> createPreferenceValue(String value) {
        return new JAXBElement<String>(_PreferenceValue_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "PreferenceResponseCode")
    public JAXBElement<String> createPreferenceResponseCode(String value) {
        return new JAXBElement<String>(_PreferenceResponseCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "WirelessPermissionFlag")
    public JAXBElement<String> createWirelessPermissionFlag(String value) {
        return new JAXBElement<String>(_WirelessPermissionFlag_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "PointsEarnedTxt")
    public JAXBElement<String> createPointsEarnedTxt(String value) {
        return new JAXBElement<String>(_PointsEarnedTxt_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "TotalPointsEarned")
    public JAXBElement<String> createTotalPointsEarned(String value) {
        return new JAXBElement<String>(_TotalPointsEarned_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "CardDesignType")
    public JAXBElement<String> createCardDesignType(String value) {
        return new JAXBElement<String>(_CardDesignType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "ClaimNumber")
    public JAXBElement<String> createClaimNumber(String value) {
        return new JAXBElement<String>(_ClaimNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostAdjustmentPoints }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "PostAdjustmentPoints")
    public JAXBElement<PostAdjustmentPoints> createPostAdjustmentPoints(PostAdjustmentPoints value) {
        return new JAXBElement<PostAdjustmentPoints>(_PostAdjustmentPoints_QNAME, PostAdjustmentPoints.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "BonusPointsEarnedTxt")
    public JAXBElement<String> createBonusPointsEarnedTxt(String value) {
        return new JAXBElement<String>(_BonusPointsEarnedTxt_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "Suffix")
    public JAXBElement<String> createSuffix(String value) {
        return new JAXBElement<String>(_Suffix_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "CouponBonusPointsEarned")
    public JAXBElement<BigInteger> createCouponBonusPointsEarned(BigInteger value) {
        return new JAXBElement<BigInteger>(_CouponBonusPointsEarned_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "TransactionDescription")
    public JAXBElement<String> createTransactionDescription(String value) {
        return new JAXBElement<String>(_TransactionDescription_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "RequestorID")
    public JAXBElement<String> createRequestorID(String value) {
        return new JAXBElement<String>(_RequestorID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "BonusPointsEarned")
    public JAXBElement<BigInteger> createBonusPointsEarned(BigInteger value) {
        return new JAXBElement<BigInteger>(_BonusPointsEarned_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "OfferRegistrationResponse")
    public JAXBElement<Object> createOfferRegistrationResponse(Object value) {
        return new JAXBElement<Object>(_OfferRegistrationResponse_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "AvailablePoints")
    public JAXBElement<BigInteger> createAvailablePoints(BigInteger value) {
        return new JAXBElement<BigInteger>(_AvailablePoints_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "StartDTTM")
    public JAXBElement<Object> createStartDTTM(Object value) {
        return new JAXBElement<Object>(_StartDTTM_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "CouponOfferName")
    public JAXBElement<String> createCouponOfferName(String value) {
        return new JAXBElement<String>(_CouponOfferName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "RewardDescription")
    public JAXBElement<String> createRewardDescription(String value) {
        return new JAXBElement<String>(_RewardDescription_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "CardType")
    public JAXBElement<String> createCardType(String value) {
        return new JAXBElement<String>(_CardType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "TxnEarnOfferType")
    public JAXBElement<String> createTxnEarnOfferType(String value) {
        return new JAXBElement<String>(_TxnEarnOfferType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "TotalAllocatedPoints")
    public JAXBElement<BigInteger> createTotalAllocatedPoints(BigInteger value) {
        return new JAXBElement<BigInteger>(_TotalAllocatedPoints_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "ItemType")
    public JAXBElement<String> createItemType(String value) {
        return new JAXBElement<String>(_ItemType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "TotalPointsEarnedTxt")
    public JAXBElement<String> createTotalPointsEarnedTxt(String value) {
        return new JAXBElement<String>(_TotalPointsEarnedTxt_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/common", name = "DollarValueOfPointsRedeemedOnBaseOffer")
    public JAXBElement<String> createDollarValueOfPointsRedeemedOnBaseOffer(String value) {
        return new JAXBElement<String>(_DollarValueOfPointsRedeemedOnBaseOffer_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "OfferNumber")
    public JAXBElement<String> createOfferNumber(String value) {
        return new JAXBElement<String>(_OfferNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "NumRecordsReturned")
    public JAXBElement<BigInteger> createNumRecordsReturned(BigInteger value) {
        return new JAXBElement<BigInteger>(_NumRecordsReturned_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "PriceMatchBonusAmount")
    public JAXBElement<String> createPriceMatchBonusAmount(String value) {
        return new JAXBElement<String>(_PriceMatchBonusAmount_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "MaxRecords")
    public JAXBElement<BigInteger> createMaxRecords(BigInteger value) {
        return new JAXBElement<BigInteger>(_MaxRecords_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "OriginalTransactionNumber")
    public JAXBElement<String> createOriginalTransactionNumber(String value) {
        return new JAXBElement<String>(_OriginalTransactionNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "DollarValuePreDisc")
    public JAXBElement<String> createDollarValuePreDisc(String value) {
        return new JAXBElement<String>(_DollarValuePreDisc_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "ResponseTime")
    public JAXBElement<Object> createResponseTime(Object value) {
        return new JAXBElement<Object>(_ResponseTime_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "Function")
    public JAXBElement<String> createFunction(String value) {
        return new JAXBElement<String>(_Function_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "PriceMatchAmount")
    public JAXBElement<String> createPriceMatchAmount(String value) {
        return new JAXBElement<String>(_PriceMatchAmount_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "AddMemberToGroupResponse")
    public JAXBElement<Object> createAddMemberToGroupResponse(Object value) {
        return new JAXBElement<Object>(_AddMemberToGroupResponse_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "RedemptionMultiplier")
    public JAXBElement<String> createRedemptionMultiplier(String value) {
        return new JAXBElement<String>(_RedemptionMultiplier_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "CreatedBy")
    public JAXBElement<String> createCreatedBy(String value) {
        return new JAXBElement<String>(_CreatedBy_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "ClubMembershipCreatedBy")
    public JAXBElement<String> createClubMembershipCreatedBy(String value) {
        return new JAXBElement<String>(_ClubMembershipCreatedBy_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "CouponType")
    public JAXBElement<String> createCouponType(String value) {
        return new JAXBElement<String>(_CouponType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "PointsToThreshold")
    public JAXBElement<BigInteger> createPointsToThreshold(BigInteger value) {
        return new JAXBElement<BigInteger>(_PointsToThreshold_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "AuthorizationCode")
    public JAXBElement<String> createAuthorizationCode(String value) {
        return new JAXBElement<String>(_AuthorizationCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "StoreFlag")
    public JAXBElement<String> createStoreFlag(String value) {
        return new JAXBElement<String>(_StoreFlag_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "DollarValuePostDisc")
    public JAXBElement<String> createDollarValuePostDisc(String value) {
        return new JAXBElement<String>(_DollarValuePostDisc_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "RedemptionPoints")
    public JAXBElement<BigInteger> createRedemptionPoints(BigInteger value) {
        return new JAXBElement<BigInteger>(_RedemptionPoints_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "TxnEarnOfferCode")
    public JAXBElement<String> createTxnEarnOfferCode(String value) {
        return new JAXBElement<String>(_TxnEarnOfferCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "DiscountAmount")
    public JAXBElement<String> createDiscountAmount(String value) {
        return new JAXBElement<String>(_DiscountAmount_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "StoreFormat")
    public JAXBElement<String> createStoreFormat(String value) {
        return new JAXBElement<String>(_StoreFormat_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "TransactionTotalTax")
    public JAXBElement<String> createTransactionTotalTax(String value) {
        return new JAXBElement<String>(_TransactionTotalTax_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "OfferStartDate")
    public JAXBElement<Object> createOfferStartDate(Object value) {
        return new JAXBElement<Object>(_OfferStartDate_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "CouponPointsEarnedTxt")
    public JAXBElement<String> createCouponPointsEarnedTxt(String value) {
        return new JAXBElement<String>(_CouponPointsEarnedTxt_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "ResponseText")
    public JAXBElement<String> createResponseText(String value) {
        return new JAXBElement<String>(_ResponseText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "TransactionDate")
    public JAXBElement<Object> createTransactionDate(Object value) {
        return new JAXBElement<Object>(_TransactionDate_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "TrackingID")
    public JAXBElement<String> createTrackingID(String value) {
        return new JAXBElement<String>(_TrackingID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "CouponBonusPointsEarnedTxt")
    public JAXBElement<String> createCouponBonusPointsEarnedTxt(String value) {
        return new JAXBElement<String>(_CouponBonusPointsEarnedTxt_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "EmailAddress")
    public JAXBElement<String> createEmailAddress(String value) {
        return new JAXBElement<String>(_EmailAddress_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "EarnFlag")
    public JAXBElement<String> createEarnFlag(String value) {
        return new JAXBElement<String>(_EarnFlag_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "ImageName")
    public JAXBElement<String> createImageName(String value) {
        return new JAXBElement<String>(_ImageName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "TotalBonusPointsEarned")
    public JAXBElement<BigInteger> createTotalBonusPointsEarned(BigInteger value) {
        return new JAXBElement<BigInteger>(_TotalBonusPointsEarned_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "Address1")
    public JAXBElement<String> createAddress1(String value) {
        return new JAXBElement<String>(_Address1_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "SubCategory")
    public JAXBElement<String> createSubCategory(String value) {
        return new JAXBElement<String>(_SubCategory_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "AssociateID")
    public JAXBElement<String> createAssociateID(String value) {
        return new JAXBElement<String>(_AssociateID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "EligibleDollarAmount")
    public JAXBElement<BigDecimal> createEligibleDollarAmount(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_EligibleDollarAmount_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "Address2")
    public JAXBElement<String> createAddress2(String value) {
        return new JAXBElement<String>(_Address2_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "QuestionText")
    public JAXBElement<String> createQuestionText(String value) {
        return new JAXBElement<String>(_QuestionText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "SurveyID")
    public JAXBElement<BigInteger> createSurveyID(BigInteger value) {
        return new JAXBElement<BigInteger>(_SurveyID_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "PhoneNumber")
    public JAXBElement<String> createPhoneNumber(String value) {
        return new JAXBElement<String>(_PhoneNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "AgeEligibleFlag")
    public JAXBElement<String> createAgeEligibleFlag(String value) {
        return new JAXBElement<String>(_AgeEligibleFlag_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "DateTimeOnServerResponse")
    public JAXBElement<Object> createDateTimeOnServerResponse(Object value) {
        return new JAXBElement<Object>(_DateTimeOnServerResponse_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "BonusPoints")
    public JAXBElement<BigInteger> createBonusPoints(BigInteger value) {
        return new JAXBElement<BigInteger>(_BonusPoints_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "StoreLocation")
    public JAXBElement<String> createStoreLocation(String value) {
        return new JAXBElement<String>(_StoreLocation_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "EarnOfferType")
    public JAXBElement<String> createEarnOfferType(String value) {
        return new JAXBElement<String>(_EarnOfferType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "MessageVersion")
    public JAXBElement<String> createMessageVersion(String value) {
        return new JAXBElement<String>(_MessageVersion_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "RedeemedXRPointsWorth")
    public JAXBElement<BigInteger> createRedeemedXRPointsWorth(BigInteger value) {
        return new JAXBElement<BigInteger>(_RedeemedXRPointsWorth_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "EarnOfferCode")
    public JAXBElement<String> createEarnOfferCode(String value) {
        return new JAXBElement<String>(_EarnOfferCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "OtherBonusPointsEarnedTxt")
    public JAXBElement<String> createOtherBonusPointsEarnedTxt(String value) {
        return new JAXBElement<String>(_OtherBonusPointsEarnedTxt_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "OnlineValidationFlag")
    public JAXBElement<String> createOnlineValidationFlag(String value) {
        return new JAXBElement<String>(_OnlineValidationFlag_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "EnrollmentOfferCode")
    public JAXBElement<String> createEnrollmentOfferCode(String value) {
        return new JAXBElement<String>(_EnrollmentOfferCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "AddressLine2")
    public JAXBElement<String> createAddressLine2(String value) {
        return new JAXBElement<String>(_AddressLine2_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "AddressLine1")
    public JAXBElement<String> createAddressLine1(String value) {
        return new JAXBElement<String>(_AddressLine1_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "OfferId")
    public JAXBElement<String> createOfferId(String value) {
        return new JAXBElement<String>(_OfferId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "CurrentBalance")
    public JAXBElement<BigInteger> createCurrentBalance(BigInteger value) {
        return new JAXBElement<BigInteger>(_CurrentBalance_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "CategoryID")
    public JAXBElement<BigInteger> createCategoryID(BigInteger value) {
        return new JAXBElement<BigInteger>(_CategoryID_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "TotalPoints")
    public JAXBElement<BigInteger> createTotalPoints(BigInteger value) {
        return new JAXBElement<BigInteger>(_TotalPoints_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "ElevatedTier")
    public JAXBElement<String> createElevatedTier(String value) {
        return new JAXBElement<String>(_ElevatedTier_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "OtherBonusPointsEarned")
    public JAXBElement<BigInteger> createOtherBonusPointsEarned(BigInteger value) {
        return new JAXBElement<BigInteger>(_OtherBonusPointsEarned_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "PhoneType")
    public JAXBElement<String> createPhoneType(String value) {
        return new JAXBElement<String>(_PhoneType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "AlternateCouponDecision")
    public JAXBElement<String> createAlternateCouponDecision(String value) {
        return new JAXBElement<String>(_AlternateCouponDecision_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "ReturnCode")
    public JAXBElement<String> createReturnCode(String value) {
        return new JAXBElement<String>(_ReturnCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "SysPulse")
    public JAXBElement<String> createSysPulse(String value) {
        return new JAXBElement<String>(_SysPulse_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "NumberOfPhoneEntries")
    public JAXBElement<BigInteger> createNumberOfPhoneEntries(BigInteger value) {
        return new JAXBElement<BigInteger>(_NumberOfPhoneEntries_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "BonusDescription")
    public JAXBElement<String> createBonusDescription(String value) {
        return new JAXBElement<String>(_BonusDescription_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "DateIssued")
    public JAXBElement<Object> createDateIssued(Object value) {
        return new JAXBElement<Object>(_DateIssued_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "SHCAssociateInd")
    public JAXBElement<String> createSHCAssociateInd(String value) {
        return new JAXBElement<String>(_SHCAssociateInd_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "RedemptionCapDollarValue")
    public JAXBElement<BigDecimal> createRedemptionCapDollarValue(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RedemptionCapDollarValue_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "PostSalesAdjustmentAmount")
    public JAXBElement<String> createPostSalesAdjustmentAmount(String value) {
        return new JAXBElement<String>(_PostSalesAdjustmentAmount_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "LastUpdateChannel")
    public JAXBElement<String> createLastUpdateChannel(String value) {
        return new JAXBElement<String>(_LastUpdateChannel_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "ZipCode")
    public JAXBElement<String> createZipCode(String value) {
        return new JAXBElement<String>(_ZipCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "TotalExpired")
    public JAXBElement<BigInteger> createTotalExpired(BigInteger value) {
        return new JAXBElement<BigInteger>(_TotalExpired_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "Description")
    public JAXBElement<String> createDescription(String value) {
        return new JAXBElement<String>(_Description_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "PreferenceCode")
    public JAXBElement<String> createPreferenceCode(String value) {
        return new JAXBElement<String>(_PreferenceCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "RedemptionOfferMultiplierAndCapTxt")
    public JAXBElement<String> createRedemptionOfferMultiplierAndCapTxt(String value) {
        return new JAXBElement<String>(_RedemptionOfferMultiplierAndCapTxt_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "TxnItemLevelOffer")
    public JAXBElement<String> createTxnItemLevelOffer(String value) {
        return new JAXBElement<String>(_TxnItemLevelOffer_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "CurrentValue")
    public JAXBElement<BigInteger> createCurrentValue(BigInteger value) {
        return new JAXBElement<BigInteger>(_CurrentValue_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "AgeEligible")
    public JAXBElement<String> createAgeEligible(String value) {
        return new JAXBElement<String>(_AgeEligible_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "BonusName")
    public JAXBElement<String> createBonusName(String value) {
        return new JAXBElement<String>(_BonusName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "RedeemedPoints")
    public JAXBElement<BigInteger> createRedeemedPoints(BigInteger value) {
        return new JAXBElement<BigInteger>(_RedeemedPoints_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "AvailableDollars")
    public JAXBElement<BigDecimal> createAvailableDollars(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AvailableDollars_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "QuestionGroupID")
    public JAXBElement<Object> createQuestionGroupID(Object value) {
        return new JAXBElement<Object>(_QuestionGroupID_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "TierThreshold")
    public JAXBElement<BigDecimal> createTierThreshold(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_TierThreshold_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "Category")
    public JAXBElement<String> createCategory(String value) {
        return new JAXBElement<String>(_Category_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "PointsRedeemedOnBaseOffer")
    public JAXBElement<String> createPointsRedeemedOnBaseOffer(String value) {
        return new JAXBElement<String>(_PointsRedeemedOnBaseOffer_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "Status")
    public JAXBElement<String> createStatus(String value) {
        return new JAXBElement<String>(_Status_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "TxnPointsEarned")
    public JAXBElement<BigInteger> createTxnPointsEarned(BigInteger value) {
        return new JAXBElement<BigInteger>(_TxnPointsEarned_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "Division")
    public JAXBElement<String> createDivision(String value) {
        return new JAXBElement<String>(_Division_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "State")
    public JAXBElement<String> createState(String value) {
        return new JAXBElement<String>(_State_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "PointBalance")
    public JAXBElement<BigInteger> createPointBalance(BigInteger value) {
        return new JAXBElement<BigInteger>(_PointBalance_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "CurrentTime")
    public JAXBElement<String> createCurrentTime(String value) {
        return new JAXBElement<String>(_CurrentTime_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "ClubEmailOptStatus")
    public JAXBElement<String> createClubEmailOptStatus(String value) {
        return new JAXBElement<String>(_ClubEmailOptStatus_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "SurveyDescription")
    public JAXBElement<String> createSurveyDescription(String value) {
        return new JAXBElement<String>(_SurveyDescription_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "AvailableSurprisePoints")
    public JAXBElement<Object> createAvailableSurprisePoints(Object value) {
        return new JAXBElement<Object>(_AvailableSurprisePoints_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "TenderStoreNumber")
    public JAXBElement<String> createTenderStoreNumber(String value) {
        return new JAXBElement<String>(_TenderStoreNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "RewardID")
    public JAXBElement<String> createRewardID(String value) {
        return new JAXBElement<String>(_RewardID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "OriginalRegisterNumber")
    public JAXBElement<String> createOriginalRegisterNumber(String value) {
        return new JAXBElement<String>(_OriginalRegisterNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TotalAvailableXROfferList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "TotalAvailableXROfferList")
    public JAXBElement<TotalAvailableXROfferList> createTotalAvailableXROfferList(TotalAvailableXROfferList value) {
        return new JAXBElement<TotalAvailableXROfferList>(_TotalAvailableXROfferList_QNAME, TotalAvailableXROfferList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "DollarsToThreshold")
    public JAXBElement<BigDecimal> createDollarsToThreshold(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_DollarsToThreshold_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "LineItems")
    public JAXBElement<Object> createLineItems(Object value) {
        return new JAXBElement<Object>(_LineItems_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "CurrentDate")
    public JAXBElement<Object> createCurrentDate(Object value) {
        return new JAXBElement<Object>(_CurrentDate_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "TotalBonusPoints")
    public JAXBElement<BigInteger> createTotalBonusPoints(BigInteger value) {
        return new JAXBElement<BigInteger>(_TotalBonusPoints_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "TotalSpentYTD")
    public JAXBElement<BigDecimal> createTotalSpentYTD(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_TotalSpentYTD_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MemberOwnPointsList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "MemberOwnPointsToExpire")
    public JAXBElement<MemberOwnPointsList> createMemberOwnPointsToExpire(MemberOwnPointsList value) {
        return new JAXBElement<MemberOwnPointsList>(_MemberOwnPointsToExpire_QNAME, MemberOwnPointsList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "LastUpdateDate")
    public JAXBElement<Object> createLastUpdateDate(Object value) {
        return new JAXBElement<Object>(_LastUpdateDate_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "EndingBalance")
    public JAXBElement<BigInteger> createEndingBalance(BigInteger value) {
        return new JAXBElement<BigInteger>(_EndingBalance_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "Prefix")
    public JAXBElement<String> createPrefix(String value) {
        return new JAXBElement<String>(_Prefix_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "Terms")
    public JAXBElement<String> createTerms(String value) {
        return new JAXBElement<String>(_Terms_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "CampaignControlID")
    public JAXBElement<BigInteger> createCampaignControlID(BigInteger value) {
        return new JAXBElement<BigInteger>(_CampaignControlID_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "SpendNextTierLevel")
    public JAXBElement<String> createSpendNextTierLevel(String value) {
        return new JAXBElement<String>(_SpendNextTierLevel_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "MTServerName")
    public JAXBElement<String> createMTServerName(String value) {
        return new JAXBElement<String>(_MTServerName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "ClubMembershipUpdatedBy")
    public JAXBElement<String> createClubMembershipUpdatedBy(String value) {
        return new JAXBElement<String>(_ClubMembershipUpdatedBy_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestPostPoints }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "testPostPoints")
    public JAXBElement<TestPostPoints> createTestPostPoints(TestPostPoints value) {
        return new JAXBElement<TestPostPoints>(_TestPostPoints_QNAME, TestPostPoints.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "Terminal")
    public JAXBElement<String> createTerminal(String value) {
        return new JAXBElement<String>(_Terminal_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "TestCardIndicator")
    public JAXBElement<String> createTestCardIndicator(String value) {
        return new JAXBElement<String>(_TestCardIndicator_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "OriginalMemberNumber")
    public JAXBElement<String> createOriginalMemberNumber(String value) {
        return new JAXBElement<String>(_OriginalMemberNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "StartingBalance")
    public JAXBElement<BigInteger> createStartingBalance(BigInteger value) {
        return new JAXBElement<BigInteger>(_StartingBalance_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "TotalBasePoints")
    public JAXBElement<BigInteger> createTotalBasePoints(BigInteger value) {
        return new JAXBElement<BigInteger>(_TotalBasePoints_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "BasePointsEarned")
    public JAXBElement<String> createBasePointsEarned(String value) {
        return new JAXBElement<String>(_BasePointsEarned_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "PinNumber")
    public JAXBElement<String> createPinNumber(String value) {
        return new JAXBElement<String>(_PinNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "TotalAllocatedBasePoints")
    public JAXBElement<BigInteger> createTotalAllocatedBasePoints(BigInteger value) {
        return new JAXBElement<BigInteger>(_TotalAllocatedBasePoints_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "TransactionDTTM")
    public JAXBElement<Object> createTransactionDTTM(Object value) {
        return new JAXBElement<Object>(_TransactionDTTM_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "SearchType")
    public JAXBElement<String> createSearchType(String value) {
        return new JAXBElement<String>(_SearchType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epsilon.com/webservices/", name = "MTServerName", scope = Epsilon.class)
    public JAXBElement<String> createEpsilonMTServerName(String value) {
        return new JAXBElement<String>(_MTServerName_QNAME, String.class, Epsilon.class, value);
    }

}
