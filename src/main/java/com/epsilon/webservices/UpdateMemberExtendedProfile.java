
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
 *         &lt;element name="MemberNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExtendedProfilePreferences" type="{http://www.epsilon.com/webservices/}ArrayOfExtendedProfilePreference" minOccurs="0"/&gt;
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
    "memberNumber",
    "extendedProfilePreferences"
})
@XmlRootElement(name = "UpdateMemberExtendedProfile")
public class UpdateMemberExtendedProfile {

    @XmlElement(name = "MemberNumber")
    protected String memberNumber;
    @XmlElement(name = "ExtendedProfilePreferences")
    protected ArrayOfExtendedProfilePreference extendedProfilePreferences;

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
     * Gets the value of the extendedProfilePreferences property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfExtendedProfilePreference }
     *     
     */
    public ArrayOfExtendedProfilePreference getExtendedProfilePreferences() {
        return extendedProfilePreferences;
    }

    /**
     * Sets the value of the extendedProfilePreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfExtendedProfilePreference }
     *     
     */
    public void setExtendedProfilePreferences(ArrayOfExtendedProfilePreference value) {
        this.extendedProfilePreferences = value;
    }

}
