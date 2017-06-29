
package com.epsilon.webservices;

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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TransactionID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TransactionDTTM" type="{http://www.w3.org/2001/XMLSchema}anySimpleType"/&gt;
 *         &lt;element name="TotalPoints" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="tenderDetailList"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.epsilon.com/webservices/}TenderDetail" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://www.epsilon.com/webservices/}Coupons" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.epsilon.com/webservices/}LineItems"/&gt;
 *         &lt;element name="PointsRedeemedOnBaseOffer" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="PointsRedeemedOnBonusOffer" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="TotalDollarSaving" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="MemberNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SalesCheckNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.epsilon.com/webservices/}TransactionList" minOccurs="0"/&gt;
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
    "transactionID",
    "transactionDTTM",
    "totalPoints",
    "tenderDetailList",
    "coupons",
    "lineItems",
    "pointsRedeemedOnBaseOffer",
    "pointsRedeemedOnBonusOffer",
    "totalDollarSaving",
    "memberNumber",
    "orderID",
    "orderSource",
    "salesCheckNumber",
    "transactionList"
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
    @XmlElement(name = "MemberNumber")
    protected String memberNumber;
    @XmlElement(name = "OrderID")
    protected String orderID;
    @XmlElement(name = "OrderSource")
    protected String orderSource;
    @XmlElement(name = "SalesCheckNumber")
    protected String salesCheckNumber;
    @XmlElement(name = "TransactionList")
    protected TransactionList transactionList;

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
     * Gets the value of the orderID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderID() {
        return orderID;
    }

    /**
     * Sets the value of the orderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderID(String value) {
        this.orderID = value;
    }

    /**
     * Gets the value of the orderSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderSource() {
        return orderSource;
    }

    /**
     * Sets the value of the orderSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderSource(String value) {
        this.orderSource = value;
    }

    /**
     * Gets the value of the salesCheckNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesCheckNumber() {
        return salesCheckNumber;
    }

    /**
     * Sets the value of the salesCheckNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesCheckNumber(String value) {
        this.salesCheckNumber = value;
    }

    /**
     * Gets the value of the transactionList property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionList }
     *     
     */
    public TransactionList getTransactionList() {
        return transactionList;
    }

    /**
     * Sets the value of the transactionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionList }
     *     
     */
    public void setTransactionList(TransactionList value) {
        this.transactionList = value;
    }


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
     *         &lt;element ref="{http://www.epsilon.com/webservices/}TenderDetail" maxOccurs="unbounded"/&gt;
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
