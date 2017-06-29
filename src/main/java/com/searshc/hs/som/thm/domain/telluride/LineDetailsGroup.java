
package com.searshc.hs.som.thm.domain.telluride;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LineDetailsGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LineDetailsGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OfferCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="offerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="adjustCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="points" type="{http://www.w3.org/2001/XMLSchema}int" form="qualified"/>
 *         &lt;element name="earnRedeemFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="redeemStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="pointsExprnDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="originalTxnId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="authorizationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="dollarValue" type="{http://www.w3.org/2001/XMLSchema}double" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LineDetailsGroup", propOrder = {
    "offerCode",
    "offerId",
    "adjustCode",
    "points",
    "earnRedeemFlag",
    "redeemStartDate",
    "pointsExprnDate",
    "originalTxnId",
    "authorizationCode",
    "dollarValue"
})
public class LineDetailsGroup {

    @XmlElement(name = "OfferCode")
    protected String offerCode;
    protected String offerId;
    protected String adjustCode;
    protected int points;
    protected String earnRedeemFlag;
    protected String redeemStartDate;
    protected String pointsExprnDate;
    protected String originalTxnId;
    protected String authorizationCode;
    protected double dollarValue;

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
     * Gets the value of the offerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferId() {
        return offerId;
    }

    /**
     * Sets the value of the offerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferId(String value) {
        this.offerId = value;
    }

    /**
     * Gets the value of the adjustCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjustCode() {
        return adjustCode;
    }

    /**
     * Sets the value of the adjustCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjustCode(String value) {
        this.adjustCode = value;
    }

    /**
     * Gets the value of the points property.
     * 
     */
    public int getPoints() {
        return points;
    }

    /**
     * Sets the value of the points property.
     * 
     */
    public void setPoints(int value) {
        this.points = value;
    }

    /**
     * Gets the value of the earnRedeemFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEarnRedeemFlag() {
        return earnRedeemFlag;
    }

    /**
     * Sets the value of the earnRedeemFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEarnRedeemFlag(String value) {
        this.earnRedeemFlag = value;
    }

    /**
     * Gets the value of the redeemStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedeemStartDate() {
        return redeemStartDate;
    }

    /**
     * Sets the value of the redeemStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedeemStartDate(String value) {
        this.redeemStartDate = value;
    }

    /**
     * Gets the value of the pointsExprnDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPointsExprnDate() {
        return pointsExprnDate;
    }

    /**
     * Sets the value of the pointsExprnDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPointsExprnDate(String value) {
        this.pointsExprnDate = value;
    }

    /**
     * Gets the value of the originalTxnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalTxnId() {
        return originalTxnId;
    }

    /**
     * Sets the value of the originalTxnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalTxnId(String value) {
        this.originalTxnId = value;
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
     * Gets the value of the dollarValue property.
     * 
     */
    public double getDollarValue() {
        return dollarValue;
    }

    /**
     * Sets the value of the dollarValue property.
     * 
     */
    public void setDollarValue(double value) {
        this.dollarValue = value;
    }

}
