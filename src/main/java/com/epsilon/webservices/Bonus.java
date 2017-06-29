
package com.epsilon.webservices;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Bonus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Bonus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BonusID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BonusName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BonusDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TotalAllocatedPoints" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="SpecialUsePointsEarned" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="BonusPoints" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="PointsRedeemed" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="DollarValueOfPointsRedeemed" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="SurprisePointsRedeemed" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="SpecialUsePointsRedeemed" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Bonus", propOrder = {
    "bonusID",
    "bonusName",
    "bonusDescription",
    "totalAllocatedPoints",
    "specialUsePointsEarned",
    "bonusPoints",
    "pointsRedeemed",
    "dollarValueOfPointsRedeemed",
    "surprisePointsRedeemed",
    "specialUsePointsRedeemed"
})
@XmlSeeAlso({
    BonusExtended.class
})
public class Bonus {

    @XmlElement(name = "BonusID", required = true)
    protected String bonusID;
    @XmlElement(name = "BonusName", required = true)
    protected String bonusName;
    @XmlElement(name = "BonusDescription", required = true)
    protected String bonusDescription;
    @XmlElement(name = "TotalAllocatedPoints", required = true)
    protected BigInteger totalAllocatedPoints;
    @XmlElement(name = "SpecialUsePointsEarned", required = true)
    protected BigInteger specialUsePointsEarned;
    @XmlElement(name = "BonusPoints", required = true)
    protected BigInteger bonusPoints;
    @XmlElement(name = "PointsRedeemed", required = true)
    protected BigInteger pointsRedeemed;
    @XmlElement(name = "DollarValueOfPointsRedeemed", required = true)
    protected BigDecimal dollarValueOfPointsRedeemed;
    @XmlElement(name = "SurprisePointsRedeemed", required = true)
    protected BigDecimal surprisePointsRedeemed;
    @XmlElement(name = "SpecialUsePointsRedeemed", required = true)
    protected BigDecimal specialUsePointsRedeemed;

    /**
     * Gets the value of the bonusID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBonusID() {
        return bonusID;
    }

    /**
     * Sets the value of the bonusID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBonusID(String value) {
        this.bonusID = value;
    }

    /**
     * Gets the value of the bonusName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBonusName() {
        return bonusName;
    }

    /**
     * Sets the value of the bonusName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBonusName(String value) {
        this.bonusName = value;
    }

    /**
     * Gets the value of the bonusDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBonusDescription() {
        return bonusDescription;
    }

    /**
     * Sets the value of the bonusDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBonusDescription(String value) {
        this.bonusDescription = value;
    }

    /**
     * Gets the value of the totalAllocatedPoints property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalAllocatedPoints() {
        return totalAllocatedPoints;
    }

    /**
     * Sets the value of the totalAllocatedPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalAllocatedPoints(BigInteger value) {
        this.totalAllocatedPoints = value;
    }

    /**
     * Gets the value of the specialUsePointsEarned property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSpecialUsePointsEarned() {
        return specialUsePointsEarned;
    }

    /**
     * Sets the value of the specialUsePointsEarned property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSpecialUsePointsEarned(BigInteger value) {
        this.specialUsePointsEarned = value;
    }

    /**
     * Gets the value of the bonusPoints property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBonusPoints() {
        return bonusPoints;
    }

    /**
     * Sets the value of the bonusPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBonusPoints(BigInteger value) {
        this.bonusPoints = value;
    }

    /**
     * Gets the value of the pointsRedeemed property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPointsRedeemed() {
        return pointsRedeemed;
    }

    /**
     * Sets the value of the pointsRedeemed property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPointsRedeemed(BigInteger value) {
        this.pointsRedeemed = value;
    }

    /**
     * Gets the value of the dollarValueOfPointsRedeemed property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDollarValueOfPointsRedeemed() {
        return dollarValueOfPointsRedeemed;
    }

    /**
     * Sets the value of the dollarValueOfPointsRedeemed property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDollarValueOfPointsRedeemed(BigDecimal value) {
        this.dollarValueOfPointsRedeemed = value;
    }

    /**
     * Gets the value of the surprisePointsRedeemed property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSurprisePointsRedeemed() {
        return surprisePointsRedeemed;
    }

    /**
     * Sets the value of the surprisePointsRedeemed property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSurprisePointsRedeemed(BigDecimal value) {
        this.surprisePointsRedeemed = value;
    }

    /**
     * Gets the value of the specialUsePointsRedeemed property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSpecialUsePointsRedeemed() {
        return specialUsePointsRedeemed;
    }

    /**
     * Sets the value of the specialUsePointsRedeemed property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSpecialUsePointsRedeemed(BigDecimal value) {
        this.specialUsePointsRedeemed = value;
    }

}
