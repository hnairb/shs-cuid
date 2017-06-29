
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
 *         &lt;element name="CouponDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="VendorId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CouponStartDTTM" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CouponEndDTTM" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Usage" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="UsageStartDTTM" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="UsageEndDTTM" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "couponDescription",
    "vendorId",
    "couponStartDTTM",
    "couponEndDTTM",
    "usage",
    "usageStartDTTM",
    "usageEndDTTM"
})
@XmlRootElement(name = "ExternalCoupon")
public class ExternalCoupon {

    @XmlElement(name = "CouponNumber", required = true)
    protected String couponNumber;
    @XmlElement(name = "CouponDescription", required = true)
    protected String couponDescription;
    @XmlElement(name = "VendorId", required = true)
    protected String vendorId;
    @XmlElement(name = "CouponStartDTTM", required = true)
    protected String couponStartDTTM;
    @XmlElement(name = "CouponEndDTTM", required = true)
    protected String couponEndDTTM;
    @XmlElement(name = "Usage", required = true)
    protected String usage;
    @XmlElement(name = "UsageStartDTTM", required = true)
    protected String usageStartDTTM;
    @XmlElement(name = "UsageEndDTTM", required = true)
    protected String usageEndDTTM;

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

}
