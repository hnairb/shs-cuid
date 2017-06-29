
package com.searshc.hs.som.thm.domain.sywr;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="TransactionID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TransactionDTTM" type="{http://www.w3.org/2001/XMLSchema}anySimpleType"/>
 *         &lt;element name="TotalPoints" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="tenderDetailList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.epsilon.com/webservices/}TenderDetail" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}Coupons" minOccurs="0"/>
 *         &lt;element ref="{http://www.epsilon.com/webservices/}LineItems"/>
 *         &lt;element name="PointsRedeemedOnBaseOffer" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="PointsRedeemedOnBonusOffer" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="TotalDollarSaving" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
    "transactionID",
    "transactionDTTM",
    "totalPoints",
    "tenderDetailList",
    "coupons",
    "lineItems",
    "pointsRedeemedOnBaseOffer",
    "pointsRedeemedOnBonusOffer",
    "totalDollarSaving"
})
@XmlRootElement(name = "GetLineItemDetailReply")
public class GetLineItemDetailReply {

    @XmlElement(name = "TransactionID", required = true)
    protected String transactionID;
    @XmlElement(name = "TransactionDTTM", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected Object transactionDTTM;
    @XmlElement(name = "TotalPoints", required = true)
    protected BigInteger totalPoints;
    @XmlElement(required = true)
    protected GetLineItemDetailReply.TenderDetailList tenderDetailList;
    @XmlElement(name = "Coupons")
    protected Coupons coupons;
    @XmlElement(name = "LineItems", required = true, nillable = true)
    protected Object lineItems;
    @XmlElement(name = "PointsRedeemedOnBaseOffer", required = true)
    protected BigInteger pointsRedeemedOnBaseOffer;
    @XmlElement(name = "PointsRedeemedOnBonusOffer", required = true)
    protected BigInteger pointsRedeemedOnBonusOffer;
    @XmlElement(name = "TotalDollarSaving", required = true)
    protected BigDecimal totalDollarSaving;

    /**
     * Gets the value of the transactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionID() {
        return transactionID;
    }

    /**
     * Sets the value of the transactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionID(String value) {
        this.transactionID = value;
    }

    /**
     * Gets the value of the transactionDTTM property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTransactionDTTM() {
        return transactionDTTM;
    }

    /**
     * Sets the value of the transactionDTTM property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTransactionDTTM(Object value) {
        this.transactionDTTM = value;
    }

    /**
     * Gets the value of the totalPoints property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalPoints() {
        return totalPoints;
    }

    /**
     * Sets the value of the totalPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalPoints(BigInteger value) {
        this.totalPoints = value;
    }

    /**
     * Gets the value of the tenderDetailList property.
     * 
     * @return
     *     possible object is
     *     {@link GetLineItemDetailReply.TenderDetailList }
     *     
     */
    public GetLineItemDetailReply.TenderDetailList getTenderDetailList() {
        return tenderDetailList;
    }

    /**
     * Sets the value of the tenderDetailList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetLineItemDetailReply.TenderDetailList }
     *     
     */
    public void setTenderDetailList(GetLineItemDetailReply.TenderDetailList value) {
        this.tenderDetailList = value;
    }

    /**
     * Gets the value of the coupons property.
     * 
     * @return
     *     possible object is
     *     {@link Coupons }
     *     
     */
    public Coupons getCoupons() {
        return coupons;
    }

    /**
     * Sets the value of the coupons property.
     * 
     * @param value
     *     allowed object is
     *     {@link Coupons }
     *     
     */
    public void setCoupons(Coupons value) {
        this.coupons = value;
    }

    /**
     * Gets the value of the lineItems property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLineItems() {
        return lineItems;
    }

    /**
     * Sets the value of the lineItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLineItems(Object value) {
        this.lineItems = value;
    }

    /**
     * Gets the value of the pointsRedeemedOnBaseOffer property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPointsRedeemedOnBaseOffer() {
        return pointsRedeemedOnBaseOffer;
    }

    /**
     * Sets the value of the pointsRedeemedOnBaseOffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPointsRedeemedOnBaseOffer(BigInteger value) {
        this.pointsRedeemedOnBaseOffer = value;
    }

    /**
     * Gets the value of the pointsRedeemedOnBonusOffer property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPointsRedeemedOnBonusOffer() {
        return pointsRedeemedOnBonusOffer;
    }

    /**
     * Sets the value of the pointsRedeemedOnBonusOffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPointsRedeemedOnBonusOffer(BigInteger value) {
        this.pointsRedeemedOnBonusOffer = value;
    }

    /**
     * Gets the value of the totalDollarSaving property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalDollarSaving() {
        return totalDollarSaving;
    }

    /**
     * Sets the value of the totalDollarSaving property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalDollarSaving(BigDecimal value) {
        this.totalDollarSaving = value;
    }


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
     *         &lt;element ref="{http://www.epsilon.com/webservices/}TenderDetail" maxOccurs="unbounded"/>
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
        "tenderDetail"
    })
    public static class TenderDetailList {

        @XmlElement(name = "TenderDetail", required = true)
        protected List<TenderDetail> tenderDetail;

        /**
         * Gets the value of the tenderDetail property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the tenderDetail property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTenderDetail().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TenderDetail }
         * 
         * 
         */
        public List<TenderDetail> getTenderDetail() {
            if (tenderDetail == null) {
                tenderDetail = new ArrayList<TenderDetail>();
            }
            return this.tenderDetail;
        }

    }

}
