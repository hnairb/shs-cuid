
package com.epsilon.webservices;

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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TxnEarnOfferCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TxnEarnOfferName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TxnEarnOfferReceiptDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TxnEarnOfferType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TxnPointsEarned" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="TxnItemLevelOffer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TxnPointsEarnedTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OfferDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OfferTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OfferEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LegalCopy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProgramType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "txnEarnOfferCode",
    "txnEarnOfferName",
    "txnEarnOfferReceiptDesc",
    "txnEarnOfferType",
    "txnPointsEarned",
    "txnItemLevelOffer",
    "txnPointsEarnedTxt",
    "offerDescription",
    "offerTitle",
    "offerEndDate",
    "legalCopy",
    "programType"
})
@XmlRootElement(name = "TxnEarnOffer")
public class TxnEarnOffer {

    @XmlElement(name = "TxnEarnOfferCode")
    protected String txnEarnOfferCode;
    @XmlElement(name = "TxnEarnOfferName")
    protected String txnEarnOfferName;
    @XmlElement(name = "TxnEarnOfferReceiptDesc")
    protected String txnEarnOfferReceiptDesc;
    @XmlElement(name = "TxnEarnOfferType")
    protected String txnEarnOfferType;
    @XmlElement(name = "TxnPointsEarned")
    protected BigInteger txnPointsEarned;
    @XmlElement(name = "TxnItemLevelOffer")
    protected String txnItemLevelOffer;
    @XmlElement(name = "TxnPointsEarnedTxt")
    protected String txnPointsEarnedTxt;
    @XmlElement(name = "OfferDescription")
    protected String offerDescription;
    @XmlElement(name = "OfferTitle")
    protected String offerTitle;
    @XmlElement(name = "OfferEndDate")
    protected String offerEndDate;
    @XmlElement(name = "LegalCopy")
    protected String legalCopy;
    @XmlElement(name = "ProgramType")
    protected String programType;

    /**
     * Gets the value of the txnEarnOfferCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxnEarnOfferCode() {
        return txnEarnOfferCode;
    }

    /**
     * Sets the value of the txnEarnOfferCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxnEarnOfferCode(String value) {
        this.txnEarnOfferCode = value;
    }

    /**
     * Gets the value of the txnEarnOfferName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxnEarnOfferName() {
        return txnEarnOfferName;
    }

    /**
     * Sets the value of the txnEarnOfferName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxnEarnOfferName(String value) {
        this.txnEarnOfferName = value;
    }

    /**
     * Gets the value of the txnEarnOfferReceiptDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxnEarnOfferReceiptDesc() {
        return txnEarnOfferReceiptDesc;
    }

    /**
     * Sets the value of the txnEarnOfferReceiptDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxnEarnOfferReceiptDesc(String value) {
        this.txnEarnOfferReceiptDesc = value;
    }

    /**
     * Gets the value of the txnEarnOfferType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxnEarnOfferType() {
        return txnEarnOfferType;
    }

    /**
     * Sets the value of the txnEarnOfferType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxnEarnOfferType(String value) {
        this.txnEarnOfferType = value;
    }

    /**
     * Gets the value of the txnPointsEarned property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTxnPointsEarned() {
        return txnPointsEarned;
    }

    /**
     * Sets the value of the txnPointsEarned property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTxnPointsEarned(BigInteger value) {
        this.txnPointsEarned = value;
    }

    /**
     * Gets the value of the txnItemLevelOffer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxnItemLevelOffer() {
        return txnItemLevelOffer;
    }

    /**
     * Sets the value of the txnItemLevelOffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxnItemLevelOffer(String value) {
        this.txnItemLevelOffer = value;
    }

    /**
     * Gets the value of the txnPointsEarnedTxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxnPointsEarnedTxt() {
        return txnPointsEarnedTxt;
    }

    /**
     * Sets the value of the txnPointsEarnedTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxnPointsEarnedTxt(String value) {
        this.txnPointsEarnedTxt = value;
    }

    /**
     * Gets the value of the offerDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferDescription() {
        return offerDescription;
    }

    /**
     * Sets the value of the offerDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferDescription(String value) {
        this.offerDescription = value;
    }

    /**
     * Gets the value of the offerTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferTitle() {
        return offerTitle;
    }

    /**
     * Sets the value of the offerTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferTitle(String value) {
        this.offerTitle = value;
    }

    /**
     * Gets the value of the offerEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferEndDate() {
        return offerEndDate;
    }

    /**
     * Sets the value of the offerEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferEndDate(String value) {
        this.offerEndDate = value;
    }

    /**
     * Gets the value of the legalCopy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalCopy() {
        return legalCopy;
    }

    /**
     * Sets the value of the legalCopy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalCopy(String value) {
        this.legalCopy = value;
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

}
