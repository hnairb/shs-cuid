
package com.searshc.hs.som.thm.domain.telluride;

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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MemberNumber" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="CurrentBalance" type="{http://www.w3.org/2001/XMLSchema}integer" form="qualified"/>
 *         &lt;element name="CurrentTier" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="TotalSpentYTD" type="{http://www.w3.org/2001/XMLSchema}decimal" form="qualified"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}Tiers"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}FasttrackChallenges"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}TierHistory"/>
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
    "currentBalance",
    "currentTier",
    "totalSpentYTD",
    "tiers",
    "fasttrackChallenges",
    "tierHistory"
})
@XmlRootElement(name = "GetMemberLevelReply")
public class GetMemberLevelReply {

    @XmlElement(name = "MemberNumber", required = true)
    protected String memberNumber;
    @XmlElement(name = "CurrentBalance", required = true)
    protected BigInteger currentBalance;
    @XmlElement(name = "CurrentTier", required = true)
    protected String currentTier;
    @XmlElement(name = "TotalSpentYTD", required = true)
    protected BigDecimal totalSpentYTD;
    @XmlElement(name = "Tiers", required = true)
    protected Tiers tiers;
    @XmlElement(name = "FasttrackChallenges", required = true)
    protected FasttrackChallenges fasttrackChallenges;
    @XmlElement(name = "TierHistory", required = true)
    protected TierHistory tierHistory;

    /**
     * Gets the value of the memberNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberNumber() {
        return memberNumber;
    }

    /**
     * Sets the value of the memberNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberNumber(String value) {
        this.memberNumber = value;
    }

    /**
     * Gets the value of the currentBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCurrentBalance() {
        return currentBalance;
    }

    /**
     * Sets the value of the currentBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCurrentBalance(BigInteger value) {
        this.currentBalance = value;
    }

    /**
     * Gets the value of the currentTier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentTier() {
        return currentTier;
    }

    /**
     * Sets the value of the currentTier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentTier(String value) {
        this.currentTier = value;
    }

    /**
     * Gets the value of the totalSpentYTD property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalSpentYTD() {
        return totalSpentYTD;
    }

    /**
     * Sets the value of the totalSpentYTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalSpentYTD(BigDecimal value) {
        this.totalSpentYTD = value;
    }

    /**
     * Gets the value of the tiers property.
     * 
     * @return
     *     possible object is
     *     {@link Tiers }
     *     
     */
    public Tiers getTiers() {
        return tiers;
    }

    /**
     * Sets the value of the tiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tiers }
     *     
     */
    public void setTiers(Tiers value) {
        this.tiers = value;
    }

    /**
     * Gets the value of the fasttrackChallenges property.
     * 
     * @return
     *     possible object is
     *     {@link FasttrackChallenges }
     *     
     */
    public FasttrackChallenges getFasttrackChallenges() {
        return fasttrackChallenges;
    }

    /**
     * Sets the value of the fasttrackChallenges property.
     * 
     * @param value
     *     allowed object is
     *     {@link FasttrackChallenges }
     *     
     */
    public void setFasttrackChallenges(FasttrackChallenges value) {
        this.fasttrackChallenges = value;
    }

    /**
     * Gets the value of the tierHistory property.
     * 
     * @return
     *     possible object is
     *     {@link TierHistory }
     *     
     */
    public TierHistory getTierHistory() {
        return tierHistory;
    }

    /**
     * Sets the value of the tierHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link TierHistory }
     *     
     */
    public void setTierHistory(TierHistory value) {
        this.tierHistory = value;
    }

}
