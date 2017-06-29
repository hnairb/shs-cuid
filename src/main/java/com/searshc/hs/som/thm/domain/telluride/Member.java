package com.searshc.hs.som.thm.domain.telluride;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import com.searshc.hs.som.thm.domain.sywr.CheckoutPrompt;
import com.epsilon.webservices.VIPNextLevel;


/**
 * <p>Java class for Member complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Member">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}EmailAddress"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}Prefix" minOccurs="0"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}FirstName" minOccurs="0"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}LastName" minOccurs="0"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}MiddleInitial" minOccurs="0"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}Address1" minOccurs="0"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}Address2" minOccurs="0"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}City" minOccurs="0"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}State" minOccurs="0"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}ZipCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}ZipCodeExtension" minOccurs="0"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}Suffix" minOccurs="0"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}MemberNumber"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}ClubStatus"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}authFirstName"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}authLastName"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}StatusChangeReasonCode"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}StatusChangeReasonDesc"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}CreatedBy"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}DateIssued"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}MemberSinceDate"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}ClubDNPStatus"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}AgeEligible"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}DOB" minOccurs="0"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}OnlineValidationFlag"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}OnlineValidationDate"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}WirelessPermissionFlag" minOccurs="0"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}LanguagePreference"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}VIPTier"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}TotalSpentYTD"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}TotalTripYTD"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}SpendNextTierLevel"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}VIPNextLevel" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}CardDesignType"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}SHCAssociateInd"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}TotalRedeemablePoints"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}EmailStatusReturn" minOccurs="0"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}RedemptionSystemCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}ClubEmailOptStatus"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}SearchType"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}Deceased"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}CountryCode"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}msg1"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}msg2"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}msg3"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}msg4"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}msg5"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}PhoneNumbers"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}IncompleteProfileInd"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}EmailConfirmed" minOccurs="0"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}MemberEarnType" minOccurs="0"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}TestCardIndicator" minOccurs="0"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}MobileValid" minOccurs="0"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}Affinities" minOccurs="0"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}Attributes" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Member", propOrder = {
    "emailAddress",
    "commentCode",
    "comment",
    "prefix",
    "firstName",
    "lastName",
    "middleInitial",
    "address1",
    "address2",
    "city",
    "state",
    "zipCode",
    "zipCodeExtension",
    "suffix",
    "memberNumber",
    "clubStatus",
    //TELL - 19234 Start : adding new fields for Authorized user
       "authFirstName",
        "authLastName",
      //TELL - 19234 End : adding new fields for Authorized user
    "statusChangeReasonCode",
    "statusChangeReasonDesc",    
    "clubStatusChangeDate",
    "createdBy",
    "dateIssued",
    "memberSinceDate",
    "clubDNPStatus",
    "ageEligible",
    "dob",
    "onlineValidationFlag",
    "onlineValidationDate",
    "wirelessPermissionFlag",
    "languagePreference",
    "vipTier",
    "totalSpentYTD",
    "totalTripYTD",
    "spendNextTierLevel",
    "vipNextLevel",
    "cardDesignType",
    "shcAssociateInd",
    "totalRedeemablePoints",
    "emailStatusReturn",
    "redemptionSystemCode",
    "clubEmailOptStatus",
    "searchType",
    "deceased",
    "countryCode",
    "msg1",
    "msg2",
    "msg3",
    "msg4",
    "msg5",
    "emailConfirmed",
    "memberEarnType",
    "testCardIndicator",
    "mobileValid",
    "phoneNumbers",
    "incompleteProfileInd",
    "affinities",
    "attributes",
    "termsAndConditions",
    "checkoutPrompt",
    "enrollmentSourceCode",
    "enrollmentStoreNumber",
    "charity",
    "survivorMemberNumber"
  
    
})
@XmlSeeAlso({
    MemberExtended.class
})
public class Member {

    @XmlElement(name = "EmailAddress", required = true)
    protected String emailAddress;
    @XmlElement(name = "Prefix")
    protected String prefix;
    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElement(name = "MiddleInitial")
    protected String middleInitial;
    @XmlElement(name = "Address1")
    protected String address1;
    @XmlElement(name = "Address2")
    protected String address2;
    @XmlElement(name = "City")
    protected String city;
    @XmlElement(name = "State")
    protected String state;
    @XmlElement(name = "ZipCode")
    protected String zipCode;
    @XmlElement(name = "ZipCodeExtension")
    protected String zipCodeExtension;
    @XmlElement(name = "Suffix")
    protected String suffix;
    @XmlElement(name = "MemberNumber", required = true)
    protected String memberNumber;
    @XmlElement(name = "ClubStatus", required = true)
    protected String clubStatus;
    //TELL - 19234 Start : adding new fields for Authorized user
        @XmlElement(name = "AuthFirstName")
        protected String authFirstName;
        @XmlElement(name = "AuthLastName")
        protected String authLastName;
      //TELL - 19234 Start : adding new fields for Authorized user
    @XmlElement(name = "StatusChangeReasonCode")
    protected String statusChangeReasonCode;
    @XmlElement(name = "StatusChangeReasonDesc")
    protected String statusChangeReasonDesc;    
    @XmlElement(name = "ClubStatusChangeDate", required = true)
    protected XMLGregorianCalendar clubStatusChangeDate;
    @XmlElement(name = "CreatedBy", required = true)
    protected String createdBy;
    @XmlElement(name = "DateIssued", required = true)
    protected XMLGregorianCalendar dateIssued;
    @XmlElement(name = "MemberSinceDate", required = true)
    protected XMLGregorianCalendar memberSinceDate;
    @XmlElement(name = "ClubDNPStatus", required = true)
    protected String clubDNPStatus;
    @XmlElement(name = "AgeEligible", required = true)
    protected String ageEligible;
    @XmlElement(name = "DOB")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dob;
    @XmlElement(name = "OnlineValidationFlag", required = true)
    protected String onlineValidationFlag;
    @XmlElement(name = "OnlineValidationDate", required = true)
    protected XMLGregorianCalendar onlineValidationDate;
    @XmlElement(name = "WirelessPermissionFlag")
    protected String wirelessPermissionFlag;
    @XmlElement(name = "LanguagePreference", required = true)
    protected String languagePreference;
    @XmlElement(name = "VIPTier", required = true)
    protected String vipTier;
    @XmlElement(name = "TotalSpentYTD", required = true)
    protected BigDecimal totalSpentYTD;
    @XmlElement(name = "TotalTripYTD", required = true)
    protected BigInteger totalTripYTD;
    @XmlElement(name = "SpendNextTierLevel", required = true)
    protected String spendNextTierLevel;
    @XmlElement(name = "VIPNextLevel")
    protected List<VIPNextLevel> vipNextLevel;
    @XmlElement(name = "CardDesignType", required = true)
    protected String cardDesignType;
    @XmlElement(name = "SHCAssociateInd", required = true)
    protected String shcAssociateInd;
    @XmlElement(name = "TotalRedeemablePoints", required = true)
    protected BigInteger totalRedeemablePoints;
    @XmlElement(name = "EmailStatusReturn")
    protected String emailStatusReturn;
    @XmlElement(name = "RedemptionSystemCode", defaultValue = "M")
    protected String redemptionSystemCode;
    @XmlElement(name = "ClubEmailOptStatus", required = true)
    protected String clubEmailOptStatus;
    @XmlElement(name = "SearchType", required = true)
    protected String searchType;
    @XmlElement(name = "Deceased")
    protected Boolean deceased;
    @XmlElement(name = "CountryCode", required = true, defaultValue = "US")
    protected String countryCode;
    @XmlElement(required = true)
    protected String msg1;
    @XmlElement(required = true)
    protected String msg2;
    @XmlElement(required = true)
    protected String msg3;
    @XmlElement(required = true)
    protected String msg4;
    @XmlElement(required = true)
    protected String msg5;
    @XmlElement(name = "EmailConfirmed")
    protected String emailConfirmed;
    @XmlElement(name = "MemberEarnType")
    protected String memberEarnType;
    @XmlElement(name = "TestCardIndicator")
    protected String testCardIndicator;
    @XmlElement(name = "MobileValid")
    protected String mobileValid;
    @XmlElement(name = "PhoneNumbers", required = true)
    protected PhoneNumbers phoneNumbers;
    @XmlElement(name = "IncompleteProfileInd", required = true)
    protected String incompleteProfileInd;
    @XmlElement(name = "Affinities")
    protected Affinities affinities;
    @XmlElement(name = "Attributes")
    protected Attributes attributes;
    @XmlElement(name = "TermsAndConditions")
    protected TermsAndConditions termsAndConditions;
   /* @XmlElement(name = "POSPrompt")
    protected ArrayOfPOSPrompt pOSPrompt;*/
    @XmlElement(name = "CheckoutPrompt")
    protected CheckoutPrompt checkoutPrompt;
    @XmlElement(name = "EnrollmentSourceCode", required = true)
    protected String enrollmentSourceCode;
    @XmlElement(name = "EnrollmentStoreNumber", required = true)
    protected String enrollmentStoreNumber;
    @XmlElement(name = "Charity", required = true)
    protected String charity;
    @XmlElement(name = "SurvivorMemberNumber", required = true)
    protected String survivorMemberNumber;
    @XmlElement(name = "CommentCode", required = true)
    protected String commentCode;
    @XmlElement(name = "Comment", required = true)
    protected String comment;

    public String getAuthFirstName() {
    			return authFirstName;
    		}
    	
    		public void setAuthFirstName(String authFirstName) {
    			this.authFirstName = authFirstName;
    		}
    	
    		public String getAuthLastName() {
    			return authLastName;
    		}
    	
    		public void setAuthLastName(String authLastName) {
    			this.authLastName = authLastName;
    	}
	public String getCommentCode() {
		return commentCode;
	}

	public void setCommentCode(String commentCode) {
		this.commentCode = commentCode;
	}

    public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}


	/**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * Gets the value of the prefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * Sets the value of the prefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefix(String value) {
        this.prefix = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the middleInitial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleInitial() {
        return middleInitial;
    }

    /**
     * Sets the value of the middleInitial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleInitial(String value) {
        this.middleInitial = value;
    }

    /**
     * Gets the value of the address1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress1() {
        return address1;
    }

    /**
     * Sets the value of the address1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress1(String value) {
        this.address1 = value;
    }

    /**
     * Gets the value of the address2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress2() {
        return address2;
    }

    /**
     * Sets the value of the address2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress2(String value) {
        this.address2 = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the zipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * Sets the value of the zipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipCode(String value) {
        this.zipCode = value;
    }

    /**
     * Gets the value of the zipCodeExtension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipCodeExtension() {
        return zipCodeExtension;
    }

    /**
     * Sets the value of the zipCodeExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipCodeExtension(String value) {
        this.zipCodeExtension = value;
    }

    /**
     * Gets the value of the suffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuffix() {
        return suffix;
    }

    /**
     * Sets the value of the suffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuffix(String value) {
        this.suffix = value;
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
     * Gets the value of the clubStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClubStatus() {
        return clubStatus;
    }

    /**
     * Sets the value of the clubStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClubStatus(String value) {
        this.clubStatus = value;
    }

    
    public XMLGregorianCalendar getClubStatusChangeDate() {
		return clubStatusChangeDate;
	}

	public void setClubStatusChangeDate(XMLGregorianCalendar clubStatusChangeDate) {
		this.clubStatusChangeDate = clubStatusChangeDate;
	}

	/**
     * Gets the value of the createdBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the value of the createdBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedBy(String value) {
        this.createdBy = value;
    }

    /**
     * Gets the value of the dateIssued property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateIssued() {
        return dateIssued;
    }

    /**
     * Sets the value of the dateIssued property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateIssued(XMLGregorianCalendar value) {
        this.dateIssued = value;
    }

    /**
     * Gets the value of the memberSinceDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMemberSinceDate() {
        return memberSinceDate;
    }

    /**
     * Sets the value of the memberSinceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMemberSinceDate(XMLGregorianCalendar value) {
        this.memberSinceDate = value;
    }

    /**
     * Gets the value of the clubDNPStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClubDNPStatus() {
        return clubDNPStatus;
    }

    /**
     * Sets the value of the clubDNPStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClubDNPStatus(String value) {
        this.clubDNPStatus = value;
    }

    /**
     * Gets the value of the ageEligible property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgeEligible() {
        return ageEligible;
    }

    /**
     * Sets the value of the ageEligible property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgeEligible(String value) {
        this.ageEligible = value;
    }

    /**
     * Gets the value of the dob property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDOB() {
        return dob;
    }

    /**
     * Sets the value of the dob property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDOB(XMLGregorianCalendar value) {
        this.dob = value;
    }

    /**
     * Gets the value of the onlineValidationFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnlineValidationFlag() {
        return onlineValidationFlag;
    }

    /**
     * Sets the value of the onlineValidationFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnlineValidationFlag(String value) {
        this.onlineValidationFlag = value;
    }

    /**
     * Gets the value of the onlineValidationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOnlineValidationDate() {
        return onlineValidationDate;
    }

    /**
     * Sets the value of the onlineValidationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOnlineValidationDate(XMLGregorianCalendar value) {
        this.onlineValidationDate = value;
    }

    /**
     * Gets the value of the wirelessPermissionFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWirelessPermissionFlag() {
        return wirelessPermissionFlag;
    }

    /**
     * Sets the value of the wirelessPermissionFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWirelessPermissionFlag(String value) {
        this.wirelessPermissionFlag = value;
    }

    /**
     * Gets the value of the languagePreference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguagePreference() {
        return languagePreference;
    }

    /**
     * Sets the value of the languagePreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguagePreference(String value) {
        this.languagePreference = value;
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
     * Gets the value of the totalSpentYTD property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalSpentYTD() {
        return totalSpentYTD;
    }

    /**
     * Sets the value of the totalSpentYTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalSpentYTD(BigDecimal value) {
        this.totalSpentYTD = value;
    }

    /**
     * Gets the value of the totalTripYTD property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalTripYTD() {
        return totalTripYTD;
    }

    /**
     * Sets the value of the totalTripYTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalTripYTD(BigInteger value) {
        this.totalTripYTD = value;
    }

    /**
     * Gets the value of the spendNextTierLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpendNextTierLevel() {
        return spendNextTierLevel;
    }

    /**
     * Sets the value of the spendNextTierLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpendNextTierLevel(String value) {
        this.spendNextTierLevel = value;
    }

    /**
     * Gets the value of the vipNextLevel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vipNextLevel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVIPNextLevel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VIPNextLevel }
     * 
     * 
     */
    public List<VIPNextLevel> getVIPNextLevel() {
        if (vipNextLevel == null) {
            vipNextLevel = new ArrayList<VIPNextLevel>();
        }
        return this.vipNextLevel;
    }

    /**
     * Gets the value of the cardDesignType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardDesignType() {
        return cardDesignType;
    }

    /**
     * Sets the value of the cardDesignType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardDesignType(String value) {
        this.cardDesignType = value;
    }

    /**
     * Gets the value of the shcAssociateInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSHCAssociateInd() {
        return shcAssociateInd;
    }

    /**
     * Sets the value of the shcAssociateInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSHCAssociateInd(String value) {
        this.shcAssociateInd = value;
    }

    /**
     * Gets the value of the totalRedeemablePoints property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalRedeemablePoints() {
        return totalRedeemablePoints;
    }

    /**
     * Sets the value of the totalRedeemablePoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalRedeemablePoints(BigInteger value) {
        this.totalRedeemablePoints = value;
    }

    /**
     * Gets the value of the emailStatusReturn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailStatusReturn() {
        return emailStatusReturn;
    }

    /**
     * Sets the value of the emailStatusReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailStatusReturn(String value) {
        this.emailStatusReturn = value;
    }

    /**
     * Gets the value of the redemptionSystemCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedemptionSystemCode() {
        return redemptionSystemCode;
    }

    /**
     * Sets the value of the redemptionSystemCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedemptionSystemCode(String value) {
        this.redemptionSystemCode = value;
    }

    /**
     * Gets the value of the clubEmailOptStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClubEmailOptStatus() {
        return clubEmailOptStatus;
    }

    /**
     * Sets the value of the clubEmailOptStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClubEmailOptStatus(String value) {
        this.clubEmailOptStatus = value;
    }

    /**
     * Gets the value of the searchType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchType() {
        return searchType;
    }

    /**
     * Sets the value of the searchType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchType(String value) {
        this.searchType = value;
    }

    /**
     * Gets the value of the deceased property.
     * 
     */
    public Boolean isDeceased() {
        return deceased;
    }

    /**
     * Sets the value of the deceased property.
     * 
     */
    public void setDeceased(Boolean value) {
        this.deceased = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the msg1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsg1() {
        return msg1;
    }

    /**
     * Sets the value of the msg1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsg1(String value) {
        this.msg1 = value;
    }

    /**
     * Gets the value of the msg2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsg2() {
        return msg2;
    }

    /**
     * Sets the value of the msg2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsg2(String value) {
        this.msg2 = value;
    }

    /**
     * Gets the value of the msg3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsg3() {
        return msg3;
    }

    /**
     * Sets the value of the msg3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsg3(String value) {
        this.msg3 = value;
    }

    /**
     * Gets the value of the msg4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsg4() {
        return msg4;
    }

    /**
     * Sets the value of the msg4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsg4(String value) {
        this.msg4 = value;
    }

    /**
     * Gets the value of the msg5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsg5() {
        return msg5;
    }

    /**
     * Sets the value of the msg5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsg5(String value) {
        this.msg5 = value;
    }

    /**
     * Gets the value of the phoneNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneNumbers }
     *     
     */
    public PhoneNumbers getPhoneNumbers() {
        return phoneNumbers;
    }

    /**
     * Sets the value of the phoneNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneNumbers }
     *     
     */
    public void setPhoneNumbers(PhoneNumbers value) {
        this.phoneNumbers = value;
    }

    /**
     * Gets the value of the incompleteProfileInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncompleteProfileInd() {
        return incompleteProfileInd;
    }

    /**
     * Sets the value of the incompleteProfileInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncompleteProfileInd(String value) {
        this.incompleteProfileInd = value;
    }

    /**
     * Gets the value of the emailConfirmed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailConfirmed() {
        return emailConfirmed;
    }

    /**
     * Sets the value of the emailConfirmed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailConfirmed(String value) {
        this.emailConfirmed = value;
    }

    /**
     * Gets the value of the memberEarnType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberEarnType() {
        return memberEarnType;
    }

    /**
     * Sets the value of the memberEarnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberEarnType(String value) {
        this.memberEarnType = value;
    }

    /**
     * Gets the value of the testCardIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestCardIndicator() {
        return testCardIndicator;
    }

    /**
     * Sets the value of the testCardIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestCardIndicator(String value) {
        this.testCardIndicator = value;
    }

    /**
     * Gets the value of the mobileValid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileValid() {
        return mobileValid;
    }

    /**
     * Sets the value of the mobileValid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileValid(String value) {
        this.mobileValid = value;
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
     * Gets the value of the attributes property.
     * 
     * @return
     *     possible object is
     *     {@link Attributes }
     *     
     */
    public Attributes getAttributes() {
        return attributes;
    }

    /**
     * Sets the value of the attributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Attributes }
     *     
     */
    public void setAttributes(Attributes value) {
        this.attributes = value;
    }

	public TermsAndConditions getTermsAndConditions() {
		return termsAndConditions;
	}

	public void setTermsAndConditions(TermsAndConditions termsAndConditions) {
		this.termsAndConditions = termsAndConditions;
	}

    
	 public CheckoutPrompt getCheckoutPrompt() {
		return checkoutPrompt;
	}

	public void setCheckoutPrompt(CheckoutPrompt checkoutPrompt) {
		this.checkoutPrompt = checkoutPrompt;
	}

	public String getEnrollmentSourceCode() {
		return enrollmentSourceCode;
	}

	public void setEnrollmentSourceCode(String enrollmentSourceCode) {
		this.enrollmentSourceCode = enrollmentSourceCode;
	}

	public String getEnrollmentStoreNumber() {
		return enrollmentStoreNumber;
	}

	public void setEnrollmentStoreNumber(String enrollmentStoreNumber) {
		this.enrollmentStoreNumber = enrollmentStoreNumber;
	}

	public String getCharity() {
		return charity;
	}

	public void setCharity(String charity) {
		this.charity = charity;
	}
	
	public String getSurvivorMemberNumber() {
		return survivorMemberNumber;
	}

	public void setSurvivorMemberNumber(String survivorMemberNumber) {
		this.survivorMemberNumber = survivorMemberNumber;
	}
	//Start: TELL-15197 Ethoca
	/**
	 * @return the statusChangeReasonCode
	 */
	public String getStatusChangeReasonCode() {
		return statusChangeReasonCode;
	}

	/**
	 * @param statusChangeReasonCode the statusChangeReasonCode to set
	 */
	public void setStatusChangeReasonCode(String statusChangeReasonCode) {
		this.statusChangeReasonCode = statusChangeReasonCode;
	}

	/**
	 * @return the statusChangeReasonDesc
	 */
	public String getStatusChangeReasonDesc() {
		return statusChangeReasonDesc;
	}

	/**
	 * @param statusChangeReasonDesc the statusChangeReasonDesc to set
	 */
	public void setStatusChangeReasonDesc(String statusChangeReasonDesc) {
		this.statusChangeReasonDesc = statusChangeReasonDesc;
	}
	
	
	//End: TELL-15197 Ethoca
	/**
     * Gets the value of the enrollmentSourceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
  /*  public String getEnrollmentSourceCode() {
        return enrollmentSourceCode;
    }

    *//**
     * Sets the value of the enrollmentSourceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     *//*
    public void setEnrollmentSourceCode(String value) {
        this.enrollmentSourceCode = value;
    }

    *//**
     * Gets the value of the enrollmentStoreNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     *//*
    public String getEnrollmentStoreNumber() {
        return enrollmentStoreNumber;
    }

    *//**
     * Sets the value of the enrollmentStoreNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     *//*
    public void setEnrollmentStoreNumber(String value) {
        this.enrollmentStoreNumber = value;
    }*/
	
	
	
	
	
}
