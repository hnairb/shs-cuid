
package com.searshc.hs.som.thm.domain.telluride;

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
 *         &lt;element name="RewardID" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="RewardDescription" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
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
    "rewardID",
    "rewardDescription"
})
@XmlRootElement(name = "SystemReward")
public class SystemReward {

    @XmlElement(name = "RewardID", required = true)
    protected String rewardID;
    @XmlElement(name = "RewardDescription", required = true)
    protected String rewardDescription;

    /**
     * Gets the value of the rewardID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRewardID() {
        return rewardID;
    }

    /**
     * Sets the value of the rewardID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRewardID(String value) {
        this.rewardID = value;
    }

    /**
     * Gets the value of the rewardDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRewardDescription() {
        return rewardDescription;
    }

    /**
     * Sets the value of the rewardDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRewardDescription(String value) {
        this.rewardDescription = value;
    }

}
