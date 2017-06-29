
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
 *         &lt;element name="NewMemberNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "newMemberNumber"
})
@XmlRootElement(name = "MemberMergeReplaceReply")
public class MemberMergeReplaceReply {

    @XmlElement(name = "MemberNumber", required = true)
    protected String memberNumber;
    @XmlElement(name = "NewMemberNumber", required = true)
    protected String newMemberNumber;

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
     * Gets the value of the newMemberNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewMemberNumber() {
        return newMemberNumber;
    }

    /**
     * Sets the value of the newMemberNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewMemberNumber(String value) {
        this.newMemberNumber = value;
    }

}
