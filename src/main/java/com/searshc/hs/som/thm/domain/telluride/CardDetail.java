
package com.searshc.hs.som.thm.domain.telluride;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MemberUniqueId" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="RegistrationUniqueId" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="ServiceRegistrationNumber" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="LastUpdatedTime" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardDetail", propOrder = {
    "memberUniqueId",
    "registrationUniqueId",
    "serviceRegistrationNumber",
    "lastUpdatedTime"
})
public class CardDetail {

    @XmlElement(name = "MemberUniqueId", required = true)
    protected String memberUniqueId;
    @XmlElement(name = "RegistrationUniqueId", required = true)
    protected String registrationUniqueId;
    @XmlElement(name = "ServiceRegistrationNumber", required = true)
    protected String serviceRegistrationNumber;
    @XmlElement(name = "LastUpdatedTime", required = true)
    protected String lastUpdatedTime;

    /**
     * Gets the value of the memberUniqueId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberUniqueId() {
        return memberUniqueId;
    }

    /**
     * Sets the value of the memberUniqueId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberUniqueId(String value) {
        this.memberUniqueId = value;
    }

    /**
     * Gets the value of the registrationUniqueId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationUniqueId() {
        return registrationUniqueId;
    }

    /**
     * Sets the value of the registrationUniqueId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationUniqueId(String value) {
        this.registrationUniqueId = value;
    }

    /**
     * Gets the value of the serviceRegistrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceRegistrationNumber() {
        return serviceRegistrationNumber;
    }

    /**
     * Sets the value of the serviceRegistrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceRegistrationNumber(String value) {
        this.serviceRegistrationNumber = value;
    }

    /**
     * Gets the value of the lastUpdatedTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    /**
     * Sets the value of the lastUpdatedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUpdatedTime(String value) {
        this.lastUpdatedTime = value;
    }

}
