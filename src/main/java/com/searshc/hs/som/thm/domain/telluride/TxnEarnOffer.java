
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
 *         &lt;element name="TxnEarnOfferCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="TxnEarnOfferName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="TxnEarnOfferReceiptDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="TxnEarnOfferType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="TxnPointsEarned" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0" form="qualified"/>
 *         &lt;element name="TxnItemLevelOffer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="TxnPointsEarnedTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
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
    "txnEarnOfferCode",
    "txnEarnOfferName",
    "txnEarnOfferReceiptDesc",
    "txnEarnOfferType",
    "txnPointsEarned",
    "txnItemLevelOffer",
    "txnPointsEarnedTxt"
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

}
