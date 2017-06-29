
package com.searshc.hs.som.thm.domain.sywr;

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
 *         &lt;element name="CouponNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DiscountAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CouponType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AlternateCouponDecision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AlternateCouponFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AlternateCouponOfferPoints" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}CouponOffers" minOccurs="0"/>
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
    "couponNumber",
    "discountAmount",
    "couponType",
    "alternateCouponDecision",
    "alternateCouponFlag",
    "alternateCouponOfferPoints",
    "couponOffers"
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
    @XmlElement(name = "CouponOffers")
    protected CouponOffers couponOffers;

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

}
