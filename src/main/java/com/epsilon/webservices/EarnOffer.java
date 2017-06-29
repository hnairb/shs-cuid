
package com.epsilon.webservices;

import java.math.BigDecimal;
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
 *         &lt;element name="EarnOfferCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EarnOfferName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EarnOfferReceiptDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EarnOfferType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProgramType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PointsEarned" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="ItemLevelOffer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PointsEarnedTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BonusRevenue" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="PointsExpiry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="QualifiedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ProgramSubType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OfferDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OfferTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OfferEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LegalCopy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "earnOfferCode",
    "earnOfferName",
    "earnOfferReceiptDesc",
    "earnOfferType",
    "programType",
    "pointsEarned",
    "itemLevelOffer",
    "pointsEarnedTxt",
    "bonusRevenue",
    "pointsExpiry",
    "qualifiedAmount",
    "programSubType",
    "offerDescription",
    "offerTitle",
    "offerEndDate",
    "legalCopy"
})
@XmlRootElement(name = "EarnOffer")
public class EarnOffer {

    @XmlElement(name = "EarnOfferCode")
    protected String earnOfferCode;
    @XmlElement(name = "EarnOfferName")
    protected String earnOfferName;
    @XmlElement(name = "EarnOfferReceiptDesc")
    protected String earnOfferReceiptDesc;
    @XmlElement(name = "EarnOfferType")
    protected String earnOfferType;
    @XmlElement(name = "ProgramType")
    protected String programType;
    @XmlElement(name = "PointsEarned")
    protected BigInteger pointsEarned;
    @XmlElement(name = "ItemLevelOffer")
    protected String itemLevelOffer;
    @XmlElement(name = "PointsEarnedTxt")
    protected String pointsEarnedTxt;
    @XmlElement(name = "BonusRevenue", required = true)
    protected BigDecimal bonusRevenue;
    @XmlElement(name = "PointsExpiry")
    protected String pointsExpiry;
    @XmlElement(name = "QualifiedAmount")
    protected BigDecimal qualifiedAmount;
    @XmlElement(name = "ProgramSubType")
    protected String programSubType;
    @XmlElement(name = "OfferDescription")
    protected String offerDescription;
    @XmlElement(name = "OfferTitle")
    protected String offerTitle;
    @XmlElement(name = "OfferEndDate")
    protected String offerEndDate;
    @XmlElement(name = "LegalCopy")
    protected String legalCopy;

    /**
     * Gets the value of the earnOfferCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEarnOfferCode() {
        return earnOfferCode;
    }

    /**
     * Sets the value of the earnOfferCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEarnOfferCode(String value) {
        this.earnOfferCode = value;
    }

    /**
     * Gets the value of the earnOfferName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEarnOfferName() {
        return earnOfferName;
    }

    /**
     * Sets the value of the earnOfferName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEarnOfferName(String value) {
        this.earnOfferName = value;
    }

    /**
     * Gets the value of the earnOfferReceiptDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEarnOfferReceiptDesc() {
        return earnOfferReceiptDesc;
    }

    /**
     * Sets the value of the earnOfferReceiptDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEarnOfferReceiptDesc(String value) {
        this.earnOfferReceiptDesc = value;
    }

    /**
     * Gets the value of the earnOfferType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEarnOfferType() {
        return earnOfferType;
    }

    /**
     * Sets the value of the earnOfferType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEarnOfferType(String value) {
        this.earnOfferType = value;
    }

    /**
     * Gets the value of the programType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramType() {
        return programType;
    }

    /**
     * Sets the value of the programType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramType(String value) {
        this.programType = value;
    }

    /**
     * Gets the value of the pointsEarned property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPointsEarned() {
        return pointsEarned;
    }

    /**
     * Sets the value of the pointsEarned property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPointsEarned(BigInteger value) {
        this.pointsEarned = value;
    }

    /**
     * Gets the value of the itemLevelOffer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemLevelOffer() {
        return itemLevelOffer;
    }

    /**
     * Sets the value of the itemLevelOffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemLevelOffer(String value) {
        this.itemLevelOffer = value;
    }

    /**
     * Gets the value of the pointsEarnedTxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPointsEarnedTxt() {
        return pointsEarnedTxt;
    }

    /**
     * Sets the value of the pointsEarnedTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPointsEarnedTxt(String value) {
        this.pointsEarnedTxt = value;
    }

    /**
     * Gets the value of the bonusRevenue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBonusRevenue() {
        return bonusRevenue;
    }

    /**
     * Sets the value of the bonusRevenue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBonusRevenue(BigDecimal value) {
        this.bonusRevenue = value;
    }

    /**
     * Gets the value of the pointsExpiry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPointsExpiry() {
        return pointsExpiry;
    }

    /**
     * Sets the value of the pointsExpiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPointsExpiry(String value) {
        this.pointsExpiry = value;
    }

    /**
     * Gets the value of the qualifiedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQualifiedAmount() {
        return qualifiedAmount;
    }

    /**
     * Sets the value of the qualifiedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQualifiedAmount(BigDecimal value) {
        this.qualifiedAmount = value;
    }

    /**
     * Gets the value of the programSubType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramSubType() {
        return programSubType;
    }

    /**
     * Sets the value of the programSubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramSubType(String value) {
        this.programSubType = value;
    }

    /**
     * Gets the value of the offerDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferDescription() {
        return offerDescription;
    }

    /**
     * Sets the value of the offerDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferDescription(String value) {
        this.offerDescription = value;
    }

    /**
     * Gets the value of the offerTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferTitle() {
        return offerTitle;
    }

    /**
     * Sets the value of the offerTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferTitle(String value) {
        this.offerTitle = value;
    }

    /**
     * Gets the value of the offerEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferEndDate() {
        return offerEndDate;
    }

    /**
     * Sets the value of the offerEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferEndDate(String value) {
        this.offerEndDate = value;
    }

    /**
     * Gets the value of the legalCopy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalCopy() {
        return legalCopy;
    }

    /**
     * Sets the value of the legalCopy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalCopy(String value) {
        this.legalCopy = value;
    }

}
