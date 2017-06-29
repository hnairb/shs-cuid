
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
 *         &lt;element ref="{http://www.epsilon.com/webservices/}SystemRewards" minOccurs="0"/&gt;
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
    "systemRewards"
})
@XmlRootElement(name = "GetSystemRewardsReply")
public class GetSystemRewardsReply {

    @XmlElement(name = "SystemRewards")
    protected SystemRewards systemRewards;

    /**
     * Gets the value of the systemRewards property.
     * 
     * @return
     *     possible object is
     *     {@link SystemRewards }
     *     
     */
    public SystemRewards getSystemRewards() {
        return systemRewards;
    }

    /**
     * Sets the value of the systemRewards property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemRewards }
     *     
     */
    public void setSystemRewards(SystemRewards value) {
        this.systemRewards = value;
    }

}
