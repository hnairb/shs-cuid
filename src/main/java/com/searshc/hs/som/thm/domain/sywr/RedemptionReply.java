
package com.searshc.hs.som.thm.domain.sywr;

import java.math.BigInteger;
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
 *         &lt;element name="PointBalance" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="AuthorizationCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RedeemedPoints" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="RedeemedDollarValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "pointBalance",
    "authorizationCode",
    "redeemedPoints",
    "redeemedDollarValue"
})
@XmlRootElement(name = "RedemptionReply")
public class RedemptionReply {

    @XmlElement(name = "MemberNumber", required = true)
    protected String memberNumber;
    @XmlElement(name = "PointBalance", required = true)
    protected BigInteger pointBalance;
    @XmlElement(name = "AuthorizationCode", required = true)
    protected String authorizationCode;
    @XmlElement(name = "RedeemedPoints", required = true)
    protected BigInteger redeemedPoints;
    @XmlElement(name = "RedeemedDollarValue", required = true)
    protected String redeemedDollarValue;

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
     * Gets the value of the pointBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPointBalance() {
        return pointBalance;
    }

    /**
     * Sets the value of the pointBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPointBalance(BigInteger value) {
        this.pointBalance = value;
    }

    /**
     * Gets the value of the authorizationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizationCode() {
        return authorizationCode;
    }

    /**
     * Sets the value of the authorizationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationCode(String value) {
        this.authorizationCode = value;
    }

    /**
     * Gets the value of the redeemedPoints property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRedeemedPoints() {
        return redeemedPoints;
    }

    /**
     * Sets the value of the redeemedPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRedeemedPoints(BigInteger value) {
        this.redeemedPoints = value;
    }

    /**
     * Gets the value of the redeemedDollarValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedeemedDollarValue() {
        return redeemedDollarValue;
    }

    /**
     * Sets the value of the redeemedDollarValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedeemedDollarValue(String value) {
        this.redeemedDollarValue = value;
    }

}
