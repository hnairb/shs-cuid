
package com.searshc.hs.som.thm.domain.sywr;

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
 *         &lt;element name="MemberNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}RewardsSummary"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}OffersSet" minOccurs="0"/>
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
    "rewardsSummary",
    "offersSet"
})
@XmlRootElement(name = "GetApplicableOffersReply")
public class GetApplicableOffersReply {

    @XmlElement(name = "MemberNumber", required = true)
    protected String memberNumber;
    @XmlElement(name = "RewardsSummary", required = true)
    protected RewardsSummary rewardsSummary;
    @XmlElement(name = "OffersSet")
    protected OffersSet offersSet;

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
     * Gets the value of the rewardsSummary property.
     * 
     * @return
     *     possible object is
     *     {@link RewardsSummary }
     *     
     */
    public RewardsSummary getRewardsSummary() {
        return rewardsSummary;
    }

    /**
     * Sets the value of the rewardsSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link RewardsSummary }
     *     
     */
    public void setRewardsSummary(RewardsSummary value) {
        this.rewardsSummary = value;
    }

    /**
     * Gets the value of the offersSet property.
     * 
     * @return
     *     possible object is
     *     {@link OffersSet }
     *     
     */
    public OffersSet getOffersSet() {
        return offersSet;
    }

    /**
     * Sets the value of the offersSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link OffersSet }
     *     
     */
    public void setOffersSet(OffersSet value) {
        this.offersSet = value;
    }

}
