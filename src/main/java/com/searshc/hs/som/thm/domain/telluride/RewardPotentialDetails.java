
package com.searshc.hs.som.thm.domain.telluride;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="Conditional" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="BasePoints" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0" form="qualified"/>
 *         &lt;element name="BonusPoints" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0" form="qualified"/>
 *         &lt;element name="EarliestExpiringOfferDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0" form="qualified"/>
 *         &lt;element name="RewardType" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}RewardPotential" maxOccurs="unbounded"/>
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
    "conditional",
    "basePoints",
    "bonusPoints",
    "earliestExpiringOfferDate",
    "rewardType",
    "rewardPotential"
})
@XmlRootElement(name = "RewardPotentialDetails")
public class RewardPotentialDetails {

    @XmlElement(name = "Conditional", required = true)
    protected String conditional;
    @XmlElement(name = "BasePoints")
    protected BigInteger basePoints;
    @XmlElement(name = "BonusPoints")
    protected BigInteger bonusPoints;
    @XmlElement(name = "EarliestExpiringOfferDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar earliestExpiringOfferDate;
    @XmlElement(name = "RewardType", required = true)
    protected String rewardType;
    @XmlElement(name = "RewardPotential", required = true)
    protected List<RewardPotential> rewardPotential;

    /**
     * Gets the value of the conditional property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConditional() {
        return conditional;
    }

    /**
     * Sets the value of the conditional property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConditional(String value) {
        this.conditional = value;
    }

    /**
     * Gets the value of the basePoints property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBasePoints() {
        return basePoints;
    }

    /**
     * Sets the value of the basePoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBasePoints(BigInteger value) {
        this.basePoints = value;
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
     * Gets the value of the earliestExpiringOfferDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEarliestExpiringOfferDate() {
        return earliestExpiringOfferDate;
    }

    /**
     * Sets the value of the earliestExpiringOfferDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEarliestExpiringOfferDate(XMLGregorianCalendar value) {
        this.earliestExpiringOfferDate = value;
    }

    /**
     * Gets the value of the rewardType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRewardType() {
        return rewardType;
    }

    /**
     * Sets the value of the rewardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRewardType(String value) {
        this.rewardType = value;
    }

    /**
     * Gets the value of the rewardPotential property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rewardPotential property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRewardPotential().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RewardPotential }
     * 
     * 
     */
    public List<RewardPotential> getRewardPotential() {
        if (rewardPotential == null) {
            rewardPotential = new ArrayList<RewardPotential>();
        }
        return this.rewardPotential;
    }

}
