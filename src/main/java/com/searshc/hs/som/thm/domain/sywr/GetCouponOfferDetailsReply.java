
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
 *         &lt;element ref="{http://www.epsilon.com/webservices/}CouponOfferDetails"/>
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
    "couponOfferDetails"
})
@XmlRootElement(name = "GetCouponOfferDetailsReply")
public class GetCouponOfferDetailsReply {

    @XmlElement(name = "CouponOfferDetails", required = true)
    protected CouponOfferDetails couponOfferDetails;

    /**
     * Gets the value of the couponOfferDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CouponOfferDetails }
     *     
     */
    public CouponOfferDetails getCouponOfferDetails() {
        return couponOfferDetails;
    }

    /**
     * Sets the value of the couponOfferDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CouponOfferDetails }
     *     
     */
    public void setCouponOfferDetails(CouponOfferDetails value) {
        this.couponOfferDetails = value;
    }

}
