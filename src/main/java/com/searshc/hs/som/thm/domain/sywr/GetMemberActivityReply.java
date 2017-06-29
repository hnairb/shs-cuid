
package com.searshc.hs.som.thm.domain.sywr;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="StartDTTM" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EndDTTM" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="StartingBalance" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="EndingBalance" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="TotalEarned" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="TotalRedeemed" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="TotalExpired" type="{http://www.w3.org/2001/XMLSchema}integer"/>
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
    "startDTTM",
    "endDTTM",
    "startingBalance",
    "endingBalance",
    "totalEarned",
    "totalRedeemed",
    "totalExpired"
})
@XmlRootElement(name = "GetMemberActivityReply")
public class GetMemberActivityReply {

    @XmlElement(name = "MemberNumber", required = true)
    protected String memberNumber;
    @XmlElement(name = "StartDTTM", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDTTM;
    @XmlElement(name = "EndDTTM", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDTTM;
    @XmlElement(name = "StartingBalance", required = true)
    protected BigInteger startingBalance;
    @XmlElement(name = "EndingBalance", required = true)
    protected BigInteger endingBalance;
    @XmlElement(name = "TotalEarned", required = true)
    protected BigInteger totalEarned;
    @XmlElement(name = "TotalRedeemed", required = true)
    protected BigInteger totalRedeemed;
    @XmlElement(name = "TotalExpired", required = true)
    protected BigInteger totalExpired;

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
     * Gets the value of the startDTTM property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDTTM() {
        return startDTTM;
    }

    /**
     * Sets the value of the startDTTM property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDTTM(XMLGregorianCalendar value) {
        this.startDTTM = value;
    }

    /**
     * Gets the value of the endDTTM property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDTTM() {
        return endDTTM;
    }

    /**
     * Sets the value of the endDTTM property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDTTM(XMLGregorianCalendar value) {
        this.endDTTM = value;
    }

    /**
     * Gets the value of the startingBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStartingBalance() {
        return startingBalance;
    }

    /**
     * Sets the value of the startingBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStartingBalance(BigInteger value) {
        this.startingBalance = value;
    }

    /**
     * Gets the value of the endingBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEndingBalance() {
        return endingBalance;
    }

    /**
     * Sets the value of the endingBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEndingBalance(BigInteger value) {
        this.endingBalance = value;
    }

    /**
     * Gets the value of the totalEarned property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalEarned() {
        return totalEarned;
    }

    /**
     * Sets the value of the totalEarned property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalEarned(BigInteger value) {
        this.totalEarned = value;
    }

    /**
     * Gets the value of the totalRedeemed property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalRedeemed() {
        return totalRedeemed;
    }

    /**
     * Sets the value of the totalRedeemed property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalRedeemed(BigInteger value) {
        this.totalRedeemed = value;
    }

    /**
     * Gets the value of the totalExpired property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalExpired() {
        return totalExpired;
    }

    /**
     * Sets the value of the totalExpired property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalExpired(BigInteger value) {
        this.totalExpired = value;
    }

}
