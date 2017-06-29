
package com.searshc.hs.som.thm.domain.telluride;

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
 *         &lt;element name="EarnOfferCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="EarnOfferName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="EarnOfferReceiptDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="EarnOfferType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="ProgramType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="PointsEarned" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0" form="qualified"/>
 *         &lt;element name="ItemLevelOffer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="PointsEarnedTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
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
    "earnOfferCode",
    "earnOfferName",
    "earnOfferReceiptDesc",
    "earnOfferType",
    "programType",
    "pointsEarned",
    "itemLevelOffer",
    "pointsEarnedTxt"
})
@XmlRootElement(name = "EarnOffer")
public class EarnOffer {

    @XmlElement(name = "EarnOfferCode")
    protected String earnOfferCode;
    @XmlElement(name = "EarnOfferName")
    protected String earnOfferName;
    @XmlElement(name = "EarnOfferReceiptDesc")
    protected String earnOfferReceiptDesc;
    @XmlElement(name = "EarnOfferType")
    protected String earnOfferType;
    @XmlElement(name = "ProgramType")
    protected String programType;
    @XmlElement(name = "PointsEarned")
    protected BigInteger pointsEarned;
    @XmlElement(name = "ItemLevelOffer")
    protected String itemLevelOffer;
    @XmlElement(name = "PointsEarnedTxt")
    protected String pointsEarnedTxt;

    /**
     * Gets the value of the earnOfferCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEarnOfferCode() {
        return earnOfferCode;
    }

    /**
     * Sets the value of the earnOfferCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEarnOfferCode(String value) {
        this.earnOfferCode = value;
    }

    /**
     * Gets the value of the earnOfferName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEarnOfferName() {
        return earnOfferName;
    }

    /**
     * Sets the value of the earnOfferName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEarnOfferName(String value) {
        this.earnOfferName = value;
    }

    /**
     * Gets the value of the earnOfferReceiptDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEarnOfferReceiptDesc() {
        return earnOfferReceiptDesc;
    }

    /**
     * Sets the value of the earnOfferReceiptDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEarnOfferReceiptDesc(String value) {
        this.earnOfferReceiptDesc = value;
    }

    /**
     * Gets the value of the earnOfferType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEarnOfferType() {
        return earnOfferType;
    }

    /**
     * Sets the value of the earnOfferType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEarnOfferType(String value) {
        this.earnOfferType = value;
    }

    /**
     * Gets the value of the programType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramType() {
        return programType;
    }

    /**
     * Sets the value of the programType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramType(String value) {
        this.programType = value;
    }

    /**
     * Gets the value of the pointsEarned property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPointsEarned() {
        return pointsEarned;
    }

    /**
     * Sets the value of the pointsEarned property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPointsEarned(BigInteger value) {
        this.pointsEarned = value;
    }

    /**
     * Gets the value of the itemLevelOffer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemLevelOffer() {
        return itemLevelOffer;
    }

    /**
     * Sets the value of the itemLevelOffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemLevelOffer(String value) {
        this.itemLevelOffer = value;
    }

    /**
     * Gets the value of the pointsEarnedTxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPointsEarnedTxt() {
        return pointsEarnedTxt;
    }

    /**
     * Sets the value of the pointsEarnedTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPointsEarnedTxt(String value) {
        this.pointsEarnedTxt = value;
    }

}
