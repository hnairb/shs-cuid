
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
 *         &lt;element name="MemberEarnType" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
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
    "memberEarnType"
})
@XmlRootElement(name = "MemberEarnTypes")
public class MemberEarnTypes {

    @XmlElement(name = "MemberEarnType", required = true)
    protected String memberEarnType;

    /**
     * Gets the value of the memberEarnType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberEarnType() {
        return memberEarnType;
    }

    /**
     * Sets the value of the memberEarnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberEarnType(String value) {
        this.memberEarnType = value;
    }

}
