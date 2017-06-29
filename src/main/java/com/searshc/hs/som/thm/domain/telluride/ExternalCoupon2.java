
package com.searshc.hs.som.thm.domain.telluride;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExternalCoupon complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExternalCoupon">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExternalCouponNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="ExternalCouponDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="ExternalCouponStartDTTM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="ExternalCouponEndDTTM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="Pin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="RandValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExternalCoupon", propOrder = {
    "externalCouponNumber",
    "externalCouponDescription",
    "externalCouponStartDTTM",
    "externalCouponEndDTTM",
    "pin",
    "randValue"
})
public class ExternalCoupon2 {

    @XmlElement(name = "ExternalCouponNumber")
    protected String externalCouponNumber;
    @XmlElement(name = "ExternalCouponDescription")
    protected String externalCouponDescription;
    @XmlElement(name = "ExternalCouponStartDTTM")
    protected String externalCouponStartDTTM;
    @XmlElement(name = "ExternalCouponEndDTTM")
    protected String externalCouponEndDTTM;
    @XmlElement(name = "Pin")
    protected String pin;
    @XmlElement(name = "RandValue")
    protected String randValue;

    /**
     * Gets the value of the externalCouponNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalCouponNumber() {
        return externalCouponNumber;
    }

    /**
     * Sets the value of the externalCouponNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalCouponNumber(String value) {
        this.externalCouponNumber = value;
    }

    /**
     * Gets the value of the externalCouponDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalCouponDescription() {
        return externalCouponDescription;
    }

    /**
     * Sets the value of the externalCouponDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalCouponDescription(String value) {
        this.externalCouponDescription = value;
    }

    /**
     * Gets the value of the externalCouponStartDTTM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalCouponStartDTTM() {
        return externalCouponStartDTTM;
    }

    /**
     * Sets the value of the externalCouponStartDTTM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalCouponStartDTTM(String value) {
        this.externalCouponStartDTTM = value;
    }

    /**
     * Gets the value of the externalCouponEndDTTM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalCouponEndDTTM() {
        return externalCouponEndDTTM;
    }

    /**
     * Sets the value of the externalCouponEndDTTM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalCouponEndDTTM(String value) {
        this.externalCouponEndDTTM = value;
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
     * Gets the value of the randValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRandValue() {
        return randValue;
    }

    /**
     * Sets the value of the randValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRandValue(String value) {
        this.randValue = value;
    }

}
