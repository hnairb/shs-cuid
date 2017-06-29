
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
 *         &lt;element name="AuthorizationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RedemptionDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RedemptionTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RedemptionURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Pin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UserCoupon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UserCouponStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UserCouponStartTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UserCouponEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UserCouponEndTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "authorizationCode",
    "redemptionDate",
    "redemptionTime",
    "redemptionURL",
    "pin",
    "userCoupon",
    "userCouponStartDate",
    "userCouponStartTime",
    "userCouponEndDate",
    "userCouponEndTime"
})
@XmlRootElement(name = "RedemptionDetail")
public class RedemptionDetail {

    @XmlElement(name = "AuthorizationCode")
    protected String authorizationCode;
    @XmlElement(name = "RedemptionDate")
    protected String redemptionDate;
    @XmlElement(name = "RedemptionTime")
    protected String redemptionTime;
    @XmlElement(name = "RedemptionURL")
    protected String redemptionURL;
    @XmlElement(name = "Pin")
    protected String pin;
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
     * Gets the value of the redemptionDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedemptionDate() {
        return redemptionDate;
    }

    /**
     * Sets the value of the redemptionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedemptionDate(String value) {
        this.redemptionDate = value;
    }

    /**
     * Gets the value of the redemptionTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedemptionTime() {
        return redemptionTime;
    }

    /**
     * Sets the value of the redemptionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedemptionTime(String value) {
        this.redemptionTime = value;
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

}