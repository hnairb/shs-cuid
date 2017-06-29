
package com.searshc.hs.som.thm.domain.telluride;

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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MessageVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="Source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="Mode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="OfferCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="AvailDTTM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="MemberNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="AuthorizationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="CouponNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="CouponDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="VendorId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="CouponStartDTTM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="CouponEndDTTM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="Usage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="UsageStartDTTM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="UsageEndDTTM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="RedemptionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="ExternalCoupons" type="{http://www.epsilon.com/webservices/}ExternalCoupons" minOccurs="0" form="qualified"/>
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
    "messageVersion",
    "source",
    "mode",
    "offerCode",
    "availDTTM",
    "memberNumber",
    "authorizationCode",
    "couponNumber",
    "couponDescription",
    "vendorId",
    "couponStartDTTM",
    "couponEndDTTM",
    "usage",
    "usageStartDTTM",
    "usageEndDTTM",
    "redemptionType",
    "externalCoupons"
})
@XmlRootElement(name = "AvailCoupon")
public class AvailCoupon {

    @XmlElement(name = "MessageVersion")
    protected String messageVersion;
    @XmlElement(name = "Source")
    protected String source;
    @XmlElement(name = "Mode")
    protected String mode;
    @XmlElement(name = "OfferCode")
    protected String offerCode;
    @XmlElement(name = "AvailDTTM")
    protected String availDTTM;
    @XmlElement(name = "MemberNumber")
    protected String memberNumber;
    @XmlElement(name = "AuthorizationCode")
    protected String authorizationCode;
    @XmlElement(name = "CouponNumber")
    protected String couponNumber;
    @XmlElement(name = "CouponDescription")
    protected String couponDescription;
    @XmlElement(name = "VendorId")
    protected String vendorId;
    @XmlElement(name = "CouponStartDTTM")
    protected String couponStartDTTM;
    @XmlElement(name = "CouponEndDTTM")
    protected String couponEndDTTM;
    @XmlElement(name = "Usage")
    protected String usage;
    @XmlElement(name = "UsageStartDTTM")
    protected String usageStartDTTM;
    @XmlElement(name = "UsageEndDTTM")
    protected String usageEndDTTM;
    @XmlElement(name = "RedemptionType")
    protected String redemptionType;
    @XmlElement(name = "ExternalCoupons")
    protected ExternalCoupons2 externalCoupons;

    /**
     * Gets the value of the messageVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageVersion() {
        return messageVersion;
    }

    /**
     * Sets the value of the messageVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageVersion(String value) {
        this.messageVersion = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMode(String value) {
        this.mode = value;
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
     * Gets the value of the availDTTM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvailDTTM() {
        return availDTTM;
    }

    /**
     * Sets the value of the availDTTM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvailDTTM(String value) {
        this.availDTTM = value;
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
     * Gets the value of the couponDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCouponDescription() {
        return couponDescription;
    }

    /**
     * Sets the value of the couponDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCouponDescription(String value) {
        this.couponDescription = value;
    }

    /**
     * Gets the value of the vendorId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorId() {
        return vendorId;
    }

    /**
     * Sets the value of the vendorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorId(String value) {
        this.vendorId = value;
    }

    /**
     * Gets the value of the couponStartDTTM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCouponStartDTTM() {
        return couponStartDTTM;
    }

    /**
     * Sets the value of the couponStartDTTM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCouponStartDTTM(String value) {
        this.couponStartDTTM = value;
    }

    /**
     * Gets the value of the couponEndDTTM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCouponEndDTTM() {
        return couponEndDTTM;
    }

    /**
     * Sets the value of the couponEndDTTM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCouponEndDTTM(String value) {
        this.couponEndDTTM = value;
    }

    /**
     * Gets the value of the usage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsage() {
        return usage;
    }

    /**
     * Sets the value of the usage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsage(String value) {
        this.usage = value;
    }

    /**
     * Gets the value of the usageStartDTTM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsageStartDTTM() {
        return usageStartDTTM;
    }

    /**
     * Sets the value of the usageStartDTTM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsageStartDTTM(String value) {
        this.usageStartDTTM = value;
    }

    /**
     * Gets the value of the usageEndDTTM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsageEndDTTM() {
        return usageEndDTTM;
    }

    /**
     * Sets the value of the usageEndDTTM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsageEndDTTM(String value) {
        this.usageEndDTTM = value;
    }

    /**
     * Gets the value of the redemptionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedemptionType() {
        return redemptionType;
    }

    /**
     * Sets the value of the redemptionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedemptionType(String value) {
        this.redemptionType = value;
    }

    /**
     * Gets the value of the externalCoupons property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalCoupons2 }
     *     
     */
    public ExternalCoupons2 getExternalCoupons() {
        return externalCoupons;
    }

    /**
     * Sets the value of the externalCoupons property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalCoupons2 }
     *     
     */
    public void setExternalCoupons(ExternalCoupons2 value) {
        this.externalCoupons = value;
    }

}
