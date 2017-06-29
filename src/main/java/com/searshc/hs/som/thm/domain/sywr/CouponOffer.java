
package com.searshc.hs.som.thm.domain.sywr;

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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CouponOfferCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CouponOfferName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CouponPointsEarned" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="CouponItemLevelOffer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CouponPointsEarnedTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "couponOfferCode",
    "couponOfferName",
    "couponPointsEarned",
    "couponItemLevelOffer",
    "couponPointsEarnedTxt"
})
@XmlRootElement(name = "CouponOffer")
public class CouponOffer {

    @XmlElement(name = "CouponOfferCode")
    protected String couponOfferCode;
    @XmlElement(name = "CouponOfferName")
    protected String couponOfferName;
    @XmlElement(name = "CouponPointsEarned")
    protected BigInteger couponPointsEarned;
    @XmlElement(name = "CouponItemLevelOffer")
    protected String couponItemLevelOffer;
    @XmlElement(name = "CouponPointsEarnedTxt")
    protected String couponPointsEarnedTxt;

    /**
     * Gets the value of the couponOfferCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCouponOfferCode() {
        return couponOfferCode;
    }

    /**
     * Sets the value of the couponOfferCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCouponOfferCode(String value) {
        this.couponOfferCode = value;
    }

    /**
     * Gets the value of the couponOfferName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCouponOfferName() {
        return couponOfferName;
    }

    /**
     * Sets the value of the couponOfferName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCouponOfferName(String value) {
        this.couponOfferName = value;
    }

    /**
     * Gets the value of the couponPointsEarned property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCouponPointsEarned() {
        return couponPointsEarned;
    }

    /**
     * Sets the value of the couponPointsEarned property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCouponPointsEarned(BigInteger value) {
        this.couponPointsEarned = value;
    }

    /**
     * Gets the value of the couponItemLevelOffer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCouponItemLevelOffer() {
        return couponItemLevelOffer;
    }

    /**
     * Sets the value of the couponItemLevelOffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCouponItemLevelOffer(String value) {
        this.couponItemLevelOffer = value;
    }

    /**
     * Gets the value of the couponPointsEarnedTxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCouponPointsEarnedTxt() {
        return couponPointsEarnedTxt;
    }

    /**
     * Sets the value of the couponPointsEarnedTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCouponPointsEarnedTxt(String value) {
        this.couponPointsEarnedTxt = value;
    }

}