
package com.searshc.hs.som.thm.domain.telluride;

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
 * &lt;complexType name="Bonus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BonusID" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="BonusName" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="BonusDescription" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="TotalAllocatedPoints" type="{http://www.w3.org/2001/XMLSchema}integer" form="qualified"/>
 *         &lt;element name="BonusPoints" type="{http://www.w3.org/2001/XMLSchema}integer" form="qualified"/>
 *         &lt;element name="PointsRedeemed" type="{http://www.w3.org/2001/XMLSchema}integer" form="qualified"/>
 *         &lt;element name="DollarValueOfPointsRedeemed" type="{http://www.w3.org/2001/XMLSchema}decimal" form="qualified"/>
 *         &lt;element name="SurprisePointsRedeemed" type="{http://www.w3.org/2001/XMLSchema}decimal" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
    "bonusPoints",
    "pointsRedeemed",
    "dollarValueOfPointsRedeemed",
    "surprisePointsRedeemed"
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
    @XmlElement(name = "BonusPoints", required = true)
    protected BigInteger bonusPoints;
    @XmlElement(name = "PointsRedeemed", required = true)
    protected BigInteger pointsRedeemed;
    @XmlElement(name = "DollarValueOfPointsRedeemed", required = true)
    protected BigDecimal dollarValueOfPointsRedeemed;
    @XmlElement(name = "SurprisePointsRedeemed", required = true)
    protected BigDecimal surprisePointsRedeemed;

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

}
