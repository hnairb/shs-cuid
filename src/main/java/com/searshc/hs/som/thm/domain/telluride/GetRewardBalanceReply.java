
package com.searshc.hs.som.thm.domain.telluride;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="MemberNumber" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" form="qualified"/>
 *         &lt;element name="EmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="AvailablePoints" type="{http://www.w3.org/2001/XMLSchema}integer" form="qualified"/>
 *         &lt;element name="AvailableDollars" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="Multiplier" type="{http://www.w3.org/2001/XMLSchema}decimal" form="qualified"/>
 *         &lt;element name="PointsToExpire" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="PointExpirationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="ExpiryPointsList" type="{http://www.epsilon.com/webservices/}PointsDetails" minOccurs="0" form="qualified"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}TotalAvailablePointsSummary" minOccurs="0"/>
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
    "memberNumber",
    "emailAddress",
    "availablePoints",
    "availableDollars",
    "multiplier",
    "pointsToExpire",
    "pointExpirationDate",
    "expiryPointsList",
    "totalAvailablePointsSummary"
})
@XmlRootElement(name = "GetRewardBalanceReply")
public class GetRewardBalanceReply {

    @XmlElement(name = "MemberNumber", required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger memberNumber;
    @XmlElement(name = "EmailAddress", required = true)
    protected String emailAddress;
    @XmlElement(name = "AvailablePoints", required = true)
    protected BigInteger availablePoints;
    @XmlElement(name = "AvailableDollars", required = true)
    protected String availableDollars;
    @XmlElement(name = "Multiplier", required = true)
    protected BigDecimal multiplier;
    @XmlElement(name = "PointsToExpire")
    protected String pointsToExpire;
    @XmlElement(name = "PointExpirationDate")
    protected String pointExpirationDate;
    @XmlElement(name = "ExpiryPointsList")
    protected PointsDetails expiryPointsList;
    @XmlElement(name = "TotalAvailablePointsSummary")
    protected TotalAvailablePointsSummary totalAvailablePointsSummary;

    /**
     * Gets the value of the memberNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMemberNumber() {
        return memberNumber;
    }

    /**
     * Sets the value of the memberNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMemberNumber(BigInteger value) {
        this.memberNumber = value;
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * Gets the value of the availablePoints property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAvailablePoints() {
        return availablePoints;
    }

    /**
     * Sets the value of the availablePoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAvailablePoints(BigInteger value) {
        this.availablePoints = value;
    }

    /**
     * Gets the value of the availableDollars property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvailableDollars() {
        return availableDollars;
    }

    /**
     * Sets the value of the availableDollars property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvailableDollars(String value) {
        this.availableDollars = value;
    }

    /**
     * Gets the value of the multiplier property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMultiplier() {
        return multiplier;
    }

    /**
     * Sets the value of the multiplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMultiplier(BigDecimal value) {
        this.multiplier = value;
    }

    /**
     * Gets the value of the pointsToExpire property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPointsToExpire() {
        return pointsToExpire;
    }

    /**
     * Sets the value of the pointsToExpire property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPointsToExpire(String value) {
        this.pointsToExpire = value;
    }

    /**
     * Gets the value of the pointExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPointExpirationDate() {
        return pointExpirationDate;
    }

    /**
     * Sets the value of the pointExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPointExpirationDate(String value) {
        this.pointExpirationDate = value;
    }

    /**
     * Gets the value of the expiryPointsList property.
     * 
     * @return
     *     possible object is
     *     {@link PointsDetails }
     *     
     */
    public PointsDetails getExpiryPointsList() {
        return expiryPointsList;
    }

    /**
     * Sets the value of the expiryPointsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointsDetails }
     *     
     */
    public void setExpiryPointsList(PointsDetails value) {
        this.expiryPointsList = value;
    }

    /**
     * Gets the value of the totalAvailablePointsSummary property.
     * 
     * @return
     *     possible object is
     *     {@link TotalAvailablePointsSummary }
     *     
     */
    public TotalAvailablePointsSummary getTotalAvailablePointsSummary() {
        return totalAvailablePointsSummary;
    }

    /**
     * Sets the value of the totalAvailablePointsSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalAvailablePointsSummary }
     *     
     */
    public void setTotalAvailablePointsSummary(TotalAvailablePointsSummary value) {
        this.totalAvailablePointsSummary = value;
    }

}
