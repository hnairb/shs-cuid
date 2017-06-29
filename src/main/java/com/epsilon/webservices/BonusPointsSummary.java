
package com.epsilon.webservices;

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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.epsilon.com/webservices/}TxnProgramTypes" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.epsilon.com/webservices/}TxnEarnOffers" minOccurs="0"/&gt;
 *         &lt;element name="CouponBonusPointsEarned" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="CouponBonusPointsEarnedTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OtherBonusPointsEarned" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="OtherBonusPointsEarnedTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TotalBonusPointsEarned" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="TotalBonusPointsEarnedTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "txnProgramTypes",
    "txnEarnOffers",
    "couponBonusPointsEarned",
    "couponBonusPointsEarnedTxt",
    "otherBonusPointsEarned",
    "otherBonusPointsEarnedTxt",
    "totalBonusPointsEarned",
    "totalBonusPointsEarnedTxt"
})
@XmlRootElement(name = "BonusPointsSummary")
public class BonusPointsSummary {

    @XmlElement(name = "TxnProgramTypes")
    protected TxnProgramTypes txnProgramTypes;
    @XmlElement(name = "TxnEarnOffers")
    protected TxnEarnOffers txnEarnOffers;
    @XmlElement(name = "CouponBonusPointsEarned")
    protected BigInteger couponBonusPointsEarned;
    @XmlElement(name = "CouponBonusPointsEarnedTxt")
    protected String couponBonusPointsEarnedTxt;
    @XmlElement(name = "OtherBonusPointsEarned")
    protected BigInteger otherBonusPointsEarned;
    @XmlElement(name = "OtherBonusPointsEarnedTxt")
    protected String otherBonusPointsEarnedTxt;
    @XmlElement(name = "TotalBonusPointsEarned")
    protected BigInteger totalBonusPointsEarned;
    @XmlElement(name = "TotalBonusPointsEarnedTxt")
    protected String totalBonusPointsEarnedTxt;

    /**
     * Gets the value of the txnProgramTypes property.
     * 
     * @return
     *     possible object is
     *     {@link TxnProgramTypes }
     *     
     */
    public TxnProgramTypes getTxnProgramTypes() {
        return txnProgramTypes;
    }

    /**
     * Sets the value of the txnProgramTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link TxnProgramTypes }
     *     
     */
    public void setTxnProgramTypes(TxnProgramTypes value) {
        this.txnProgramTypes = value;
    }

    /**
     * Gets the value of the txnEarnOffers property.
     * 
     * @return
     *     possible object is
     *     {@link TxnEarnOffers }
     *     
     */
    public TxnEarnOffers getTxnEarnOffers() {
        return txnEarnOffers;
    }

    /**
     * Sets the value of the txnEarnOffers property.
     * 
     * @param value
     *     allowed object is
     *     {@link TxnEarnOffers }
     *     
     */
    public void setTxnEarnOffers(TxnEarnOffers value) {
        this.txnEarnOffers = value;
    }

    /**
     * Gets the value of the couponBonusPointsEarned property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCouponBonusPointsEarned() {
        return couponBonusPointsEarned;
    }

    /**
     * Sets the value of the couponBonusPointsEarned property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCouponBonusPointsEarned(BigInteger value) {
        this.couponBonusPointsEarned = value;
    }

    /**
     * Gets the value of the couponBonusPointsEarnedTxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCouponBonusPointsEarnedTxt() {
        return couponBonusPointsEarnedTxt;
    }

    /**
     * Sets the value of the couponBonusPointsEarnedTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCouponBonusPointsEarnedTxt(String value) {
        this.couponBonusPointsEarnedTxt = value;
    }

    /**
     * Gets the value of the otherBonusPointsEarned property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOtherBonusPointsEarned() {
        return otherBonusPointsEarned;
    }

    /**
     * Sets the value of the otherBonusPointsEarned property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOtherBonusPointsEarned(BigInteger value) {
        this.otherBonusPointsEarned = value;
    }

    /**
     * Gets the value of the otherBonusPointsEarnedTxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherBonusPointsEarnedTxt() {
        return otherBonusPointsEarnedTxt;
    }

    /**
     * Sets the value of the otherBonusPointsEarnedTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherBonusPointsEarnedTxt(String value) {
        this.otherBonusPointsEarnedTxt = value;
    }

    /**
     * Gets the value of the totalBonusPointsEarned property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalBonusPointsEarned() {
        return totalBonusPointsEarned;
    }

    /**
     * Sets the value of the totalBonusPointsEarned property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalBonusPointsEarned(BigInteger value) {
        this.totalBonusPointsEarned = value;
    }

    /**
     * Gets the value of the totalBonusPointsEarnedTxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalBonusPointsEarnedTxt() {
        return totalBonusPointsEarnedTxt;
    }

    /**
     * Sets the value of the totalBonusPointsEarnedTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalBonusPointsEarnedTxt(String value) {
        this.totalBonusPointsEarnedTxt = value;
    }

}
