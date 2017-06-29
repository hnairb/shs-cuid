
package com.epsilon.webservices;

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
 *         &lt;element name="RewardPotentialUnit" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RewardPotentialValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "rewardPotentialUnit",
    "rewardPotentialValue"
})
@XmlRootElement(name = "RewardPotential")
public class RewardPotential {

    @XmlElement(name = "RewardPotentialUnit", required = true)
    protected String rewardPotentialUnit;
    @XmlElement(name = "RewardPotentialValue", required = true)
    protected String rewardPotentialValue;

    /**
     * Gets the value of the rewardPotentialUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRewardPotentialUnit() {
        return rewardPotentialUnit;
    }

    /**
     * Sets the value of the rewardPotentialUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRewardPotentialUnit(String value) {
        this.rewardPotentialUnit = value;
    }

    /**
     * Gets the value of the rewardPotentialValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRewardPotentialValue() {
        return rewardPotentialValue;
    }

    /**
     * Sets the value of the rewardPotentialValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRewardPotentialValue(String value) {
        this.rewardPotentialValue = value;
    }

}
