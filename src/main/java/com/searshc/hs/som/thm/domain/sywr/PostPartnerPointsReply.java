
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
 *         &lt;element name="BasePointsEarned" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BasePointsEarnedTxt" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "basePointsEarned",
    "basePointsEarnedTxt"
})
@XmlRootElement(name = "PostPartnerPointsReply")
public class PostPartnerPointsReply {

    @XmlElement(name = "MemberNumber", required = true)
    protected String memberNumber;
    @XmlElement(name = "BasePointsEarned", required = true)
    protected String basePointsEarned;
    @XmlElement(name = "BasePointsEarnedTxt", required = true)
    protected String basePointsEarnedTxt;

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
     * Gets the value of the basePointsEarned property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasePointsEarned() {
        return basePointsEarned;
    }

    /**
     * Sets the value of the basePointsEarned property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBasePointsEarned(String value) {
        this.basePointsEarned = value;
    }

    /**
     * Gets the value of the basePointsEarnedTxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasePointsEarnedTxt() {
        return basePointsEarnedTxt;
    }

    /**
     * Sets the value of the basePointsEarnedTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBasePointsEarnedTxt(String value) {
        this.basePointsEarnedTxt = value;
    }

}
