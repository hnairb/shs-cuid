
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
 *         &lt;element ref="{http://www.epsilon.com/webservices/}ExternalCoupons" minOccurs="0"/>
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
    "externalCoupons"
})
@XmlRootElement(name = "AvailCouponReply")
public class AvailCouponReply {

    @XmlElement(name = "ExternalCoupons")
    protected ExternalCoupons externalCoupons;

    /**
     * Gets the value of the externalCoupons property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalCoupons }
     *     
     */
    public ExternalCoupons getExternalCoupons() {
        return externalCoupons;
    }

    /**
     * Sets the value of the externalCoupons property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalCoupons }
     *     
     */
    public void setExternalCoupons(ExternalCoupons value) {
        this.externalCoupons = value;
    }

}
