
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
 *         &lt;element name="MessageVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="MemberNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="RequestorID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="OrderStoreNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="TenderStoreNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="PickUpStoreNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="RegisterNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="TransactionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="TransactionTotal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="TransactionTotalTax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="TransactionDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="TransactionTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="AssociateID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="EarnFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="PointDebit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="CurrencyDebit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="OrderDetails" type="{http://www.epsilon.com/webservices/}OrderDetails" minOccurs="0" form="qualified"/>
 *         &lt;element name="TenderList" type="{http://www.epsilon.com/webservices/}ArrayOfTender" minOccurs="0" form="qualified"/>
 *         &lt;element name="LineItems" type="{http://www.epsilon.com/webservices/}ArrayOfLineItem" minOccurs="0" form="qualified"/>
 *         &lt;element name="Source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="LayawayContractNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="LayawayOpeningDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="LayawayScheduledClosingDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="LayawayFinalPaymentDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="ReprocessOffers" type="{http://www.epsilon.com/webservices/}ArrayOfOffer" minOccurs="0" form="qualified"/>
 *         &lt;element name="TimeZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
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
    "messageVersion",
    "memberNumber",
    "requestorID",
    "orderStoreNumber",
    "tenderStoreNumber",
    "pickUpStoreNumber",
    "registerNumber",
    "transactionNumber",
    "transactionTotal",
    "transactionTotalTax",
    "transactionDate",
    "transactionTime",
    "associateID",
    "earnFlag",
    "pointDebit",
    "currencyDebit",
    "orderDetails",
    "tenderList",
    "lineItems",
    "source",
    "layawayContractNumber",
    "layawayOpeningDate",
    "layawayScheduledClosingDate",
    "layawayFinalPaymentDate",
    "reprocessOffers",
    "timeZone"
})
@XmlRootElement(name = "ProcessTransaction")
public class ProcessTransaction {

    @XmlElement(name = "MessageVersion")
    protected String messageVersion;
    @XmlElement(name = "MemberNumber")
    protected String memberNumber;
    @XmlElement(name = "RequestorID")
    protected String requestorID;
    @XmlElement(name = "OrderStoreNumber")
    protected String orderStoreNumber;
    @XmlElement(name = "TenderStoreNumber")
    protected String tenderStoreNumber;
    @XmlElement(name = "PickUpStoreNumber")
    protected String pickUpStoreNumber;
    @XmlElement(name = "RegisterNumber")
    protected String registerNumber;
    @XmlElement(name = "TransactionNumber")
    protected String transactionNumber;
    @XmlElement(name = "TransactionTotal")
    protected String transactionTotal;
    @XmlElement(name = "TransactionTotalTax")
    protected String transactionTotalTax;
    @XmlElement(name = "TransactionDate")
    protected String transactionDate;
    @XmlElement(name = "TransactionTime")
    protected String transactionTime;
    @XmlElement(name = "AssociateID")
    protected String associateID;
    @XmlElement(name = "EarnFlag")
    protected String earnFlag;
    @XmlElement(name = "PointDebit")
    protected String pointDebit;
    @XmlElement(name = "CurrencyDebit")
    protected String currencyDebit;
    @XmlElement(name = "OrderDetails")
    protected OrderDetails orderDetails;
    @XmlElement(name = "TenderList")
    protected ArrayOfTender tenderList;
    @XmlElement(name = "LineItems")
    protected ArrayOfLineItem lineItems;
    @XmlElement(name = "Source")
    protected String source;
    @XmlElement(name = "LayawayContractNumber")
    protected String layawayContractNumber;
    @XmlElement(name = "LayawayOpeningDate")
    protected String layawayOpeningDate;
    @XmlElement(name = "LayawayScheduledClosingDate")
    protected String layawayScheduledClosingDate;
    @XmlElement(name = "LayawayFinalPaymentDate")
    protected String layawayFinalPaymentDate;
    @XmlElement(name = "ReprocessOffers")
    protected ArrayOfOffer reprocessOffers;
    @XmlElement(name = "TimeZone")
    protected String timeZone;

    /**
     * Gets the value of the messageVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageVersion() {
        return messageVersion;
    }

    /**
     * Sets the value of the messageVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageVersion(String value) {
        this.messageVersion = value;
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
     * Gets the value of the requestorID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestorID() {
        return requestorID;
    }

    /**
     * Sets the value of the requestorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestorID(String value) {
        this.requestorID = value;
    }

    /**
     * Gets the value of the orderStoreNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderStoreNumber() {
        return orderStoreNumber;
    }

    /**
     * Sets the value of the orderStoreNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderStoreNumber(String value) {
        this.orderStoreNumber = value;
    }

    /**
     * Gets the value of the tenderStoreNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTenderStoreNumber() {
        return tenderStoreNumber;
    }

    /**
     * Sets the value of the tenderStoreNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTenderStoreNumber(String value) {
        this.tenderStoreNumber = value;
    }

    /**
     * Gets the value of the pickUpStoreNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickUpStoreNumber() {
        return pickUpStoreNumber;
    }

    /**
     * Sets the value of the pickUpStoreNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickUpStoreNumber(String value) {
        this.pickUpStoreNumber = value;
    }

    /**
     * Gets the value of the registerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisterNumber() {
        return registerNumber;
    }

    /**
     * Sets the value of the registerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisterNumber(String value) {
        this.registerNumber = value;
    }

    /**
     * Gets the value of the transactionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionNumber() {
        return transactionNumber;
    }

    /**
     * Sets the value of the transactionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionNumber(String value) {
        this.transactionNumber = value;
    }

    /**
     * Gets the value of the transactionTotal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionTotal() {
        return transactionTotal;
    }

    /**
     * Sets the value of the transactionTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionTotal(String value) {
        this.transactionTotal = value;
    }

    /**
     * Gets the value of the transactionTotalTax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionTotalTax() {
        return transactionTotalTax;
    }

    /**
     * Sets the value of the transactionTotalTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionTotalTax(String value) {
        this.transactionTotalTax = value;
    }

    /**
     * Gets the value of the transactionDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionDate() {
        return transactionDate;
    }

    /**
     * Sets the value of the transactionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionDate(String value) {
        this.transactionDate = value;
    }

    /**
     * Gets the value of the transactionTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionTime() {
        return transactionTime;
    }

    /**
     * Sets the value of the transactionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionTime(String value) {
        this.transactionTime = value;
    }

    /**
     * Gets the value of the associateID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssociateID() {
        return associateID;
    }

    /**
     * Sets the value of the associateID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssociateID(String value) {
        this.associateID = value;
    }

    /**
     * Gets the value of the earnFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEarnFlag() {
        return earnFlag;
    }

    /**
     * Sets the value of the earnFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEarnFlag(String value) {
        this.earnFlag = value;
    }

    /**
     * Gets the value of the pointDebit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPointDebit() {
        return pointDebit;
    }

    /**
     * Sets the value of the pointDebit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPointDebit(String value) {
        this.pointDebit = value;
    }

    /**
     * Gets the value of the currencyDebit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyDebit() {
        return currencyDebit;
    }

    /**
     * Sets the value of the currencyDebit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyDebit(String value) {
        this.currencyDebit = value;
    }

    /**
     * Gets the value of the orderDetails property.
     * 
     * @return
     *     possible object is
     *     {@link OrderDetails }
     *     
     */
    public OrderDetails getOrderDetails() {
        return orderDetails;
    }

    /**
     * Sets the value of the orderDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderDetails }
     *     
     */
    public void setOrderDetails(OrderDetails value) {
        this.orderDetails = value;
    }

    /**
     * Gets the value of the tenderList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTender }
     *     
     */
    public ArrayOfTender getTenderList() {
        return tenderList;
    }

    /**
     * Sets the value of the tenderList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTender }
     *     
     */
    public void setTenderList(ArrayOfTender value) {
        this.tenderList = value;
    }

    /**
     * Gets the value of the lineItems property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLineItem }
     *     
     */
    public ArrayOfLineItem getLineItems() {
        return lineItems;
    }

    /**
     * Sets the value of the lineItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLineItem }
     *     
     */
    public void setLineItems(ArrayOfLineItem value) {
        this.lineItems = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the layawayContractNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLayawayContractNumber() {
        return layawayContractNumber;
    }

    /**
     * Sets the value of the layawayContractNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLayawayContractNumber(String value) {
        this.layawayContractNumber = value;
    }

    /**
     * Gets the value of the layawayOpeningDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLayawayOpeningDate() {
        return layawayOpeningDate;
    }

    /**
     * Sets the value of the layawayOpeningDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLayawayOpeningDate(String value) {
        this.layawayOpeningDate = value;
    }

    /**
     * Gets the value of the layawayScheduledClosingDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLayawayScheduledClosingDate() {
        return layawayScheduledClosingDate;
    }

    /**
     * Sets the value of the layawayScheduledClosingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLayawayScheduledClosingDate(String value) {
        this.layawayScheduledClosingDate = value;
    }

    /**
     * Gets the value of the layawayFinalPaymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLayawayFinalPaymentDate() {
        return layawayFinalPaymentDate;
    }

    /**
     * Sets the value of the layawayFinalPaymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLayawayFinalPaymentDate(String value) {
        this.layawayFinalPaymentDate = value;
    }

    /**
     * Gets the value of the reprocessOffers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOffer }
     *     
     */
    public ArrayOfOffer getReprocessOffers() {
        return reprocessOffers;
    }

    /**
     * Sets the value of the reprocessOffers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOffer }
     *     
     */
    public void setReprocessOffers(ArrayOfOffer value) {
        this.reprocessOffers = value;
    }

    /**
     * Gets the value of the timeZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * Sets the value of the timeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZone(String value) {
        this.timeZone = value;
    }

}
