
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
 *         &lt;element name="OfferTimes" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OfferPoints" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MemberTimes" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MemberPoints" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "offerTimes",
    "offerPoints",
    "memberTimes",
    "memberPoints"
})
@XmlRootElement(name = "Caps")
public class Caps {

    @XmlElement(name = "OfferTimes", required = true)
    protected String offerTimes;
    @XmlElement(name = "OfferPoints", required = true)
    protected String offerPoints;
    @XmlElement(name = "MemberTimes", required = true)
    protected String memberTimes;
    @XmlElement(name = "MemberPoints", required = true)
    protected String memberPoints;

    /**
     * Gets the value of the offerTimes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferTimes() {
        return offerTimes;
    }

    /**
     * Sets the value of the offerTimes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferTimes(String value) {
        this.offerTimes = value;
    }

    /**
     * Gets the value of the offerPoints property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferPoints() {
        return offerPoints;
    }

    /**
     * Sets the value of the offerPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferPoints(String value) {
        this.offerPoints = value;
    }

    /**
     * Gets the value of the memberTimes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberTimes() {
        return memberTimes;
    }

    /**
     * Sets the value of the memberTimes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberTimes(String value) {
        this.memberTimes = value;
    }

    /**
     * Gets the value of the memberPoints property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberPoints() {
        return memberPoints;
    }

    /**
     * Sets the value of the memberPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberPoints(String value) {
        this.memberPoints = value;
    }

}
