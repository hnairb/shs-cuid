
package com.epsilon.webservices;

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
 *         &lt;element name="CouponNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DiscountAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CouponType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AlternateCouponDecision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AlternateCouponFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AlternateCouponOfferPoints" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OfferCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="StatusText" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RedemptionMode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="UserCoupon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UserCouponStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UserCouponStartTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UserCouponEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UserCouponEndTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.epsilon.com/webservices/}CouponOffers" minOccurs="0"/&gt;
 *         &lt;element name="Pin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RedemptionURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "couponNumber",
    "discountAmount",
    "couponType",
    "alternateCouponDecision",
    "alternateCouponFlag",
    "alternateCouponOfferPoints",
    "offerCode",
    "status",
    "statusText",
    "redemptionMode",
    "userCoupon",
    "userCouponStartDate",
    "userCouponStartTime",
    "userCouponEndDate",
    "userCouponEndTime",
    "couponOffers",
    "pin",
    "redemptionURL"
})
@XmlRootElement(name = "Coupon")
public class Coupon {

    @XmlElement(name = "CouponNumber", required = true)
    protected String couponNumber;
    @XmlElement(name = "DiscountAmount")
    protected String discountAmount;
    @XmlElement(name = "CouponType")
    protected String couponType;
    @XmlElement(name = "AlternateCouponDecision")
    protected String alternateCouponDecision;
    @XmlElement(name = "AlternateCouponFlag")
    protected String alternateCouponFlag;
    @XmlElement(name = "AlternateCouponOfferPoints")
    protected String alternateCouponOfferPoints;
    @XmlElement(name = "OfferCode")
    protected String offerCode;
    @XmlElement(name = "Status", required = true)
    protected String status;
    @XmlElement(name = "StatusText", required = true)
    protected String statusText;
    @XmlElement(name = "RedemptionMode", required = true)
    protected String redemptionMode;
    @XmlElement(name = "UserCoupon")
    protected String userCoupon;
    @XmlElement(name = "UserCouponStartDate")
    protected String userCouponStartDate;
    @XmlElement(name = "UserCouponStartTime")
    protected String userCouponStartTime;
    @XmlElement(name = "UserCouponEndDate")
    protected String userCouponEndDate;
    @XmlElement(name = "UserCouponEndTime")
    protected String userCouponEndTime;
    @XmlElement(name = "CouponOffers")
    protected CouponOffers couponOffers;
    @XmlElement(name = "Pin")
    protected String pin;
    @XmlElement(name = "RedemptionURL")
    protected String redemptionURL;

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
     * Gets the value of the discountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountAmount() {
        return discountAmount;
    }

    /**
     * Sets the value of the discountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountAmount(String value) {
        this.discountAmount = value;
    }

    /**
     * Gets the value of the couponType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCouponType() {
        return couponType;
    }

    /**
     * Sets the value of the couponType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCouponType(String value) {
        this.couponType = value;
    }

    /**
     * Gets the value of the alternateCouponDecision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateCouponDecision() {
        return alternateCouponDecision;
    }

    /**
     * Sets the value of the alternateCouponDecision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateCouponDecision(String value) {
        this.alternateCouponDecision = value;
    }

    /**
     * Gets the value of the alternateCouponFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateCouponFlag() {
        return alternateCouponFlag;
    }

    /**
     * Sets the value of the alternateCouponFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateCouponFlag(String value) {
        this.alternateCouponFlag = value;
    }

    /**
     * Gets the value of the alternateCouponOfferPoints property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateCouponOfferPoints() {
        return alternateCouponOfferPoints;
    }

    /**
     * Sets the value of the alternateCouponOfferPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateCouponOfferPoints(String value) {
        this.alternateCouponOfferPoints = value;
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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
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

    /**
     * Gets the value of the couponOffers property.
     * 
     * @return
     *     possible object is
     *     {@link CouponOffers }
     *     
     */
    public CouponOffers getCouponOffers() {
        return couponOffers;
    }

    /**
     * Sets the value of the couponOffers property.
     * 
     * @param value
     *     allowed object is
     *     {@link CouponOffers }
     *     
     */
    public void setCouponOffers(CouponOffers value) {
        this.couponOffers = value;
    }

    /**
     * Gets the value of the pin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPin() {
        return pin;
    }

    /**
     * Sets the value of the pin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPin(String value) {
        this.pin = value;
    }

    /**
     * Gets the value of the redemptionURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedemptionURL() {
        return redemptionURL;
    }

    /**
     * Sets the value of the redemptionURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedemptionURL(String value) {
        this.redemptionURL = value;
    }

}
