
package com.epsilon.webservices;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element ref="{http://www.epsilon.com/webservices/}TransactionDetails"/&gt;
 *         &lt;element name="PartnerTransactionDetails"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.epsilon.com/webservices/}TransactionDetail" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
    "transactionDetails",
    "partnerTransactionDetails"
})
@XmlRootElement(name = "GetMemberActivityDetailReply")
public class GetMemberActivityDetailReply {

    @XmlElement(name = "TransactionDetails", required = true)
    protected TransactionDetails transactionDetails;
    @XmlElement(name = "PartnerTransactionDetails", required = true)
    protected GetMemberActivityDetailReply.PartnerTransactionDetails partnerTransactionDetails;

    /**
     * Gets the value of the transactionDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionDetails }
     *     
     */
    public TransactionDetails getTransactionDetails() {
        return transactionDetails;
    }

    /**
     * Sets the value of the transactionDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionDetails }
     *     
     */
    public void setTransactionDetails(TransactionDetails value) {
        this.transactionDetails = value;
    }

    /**
     * Gets the value of the partnerTransactionDetails property.
     * 
     * @return
     *     possible object is
     *     {@link GetMemberActivityDetailReply.PartnerTransactionDetails }
     *     
     */
    public GetMemberActivityDetailReply.PartnerTransactionDetails getPartnerTransactionDetails() {
        return partnerTransactionDetails;
    }

    /**
     * Sets the value of the partnerTransactionDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetMemberActivityDetailReply.PartnerTransactionDetails }
     *     
     */
    public void setPartnerTransactionDetails(GetMemberActivityDetailReply.PartnerTransactionDetails value) {
        this.partnerTransactionDetails = value;
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
     *         &lt;element ref="{http://www.epsilon.com/webservices/}TransactionDetail" maxOccurs="unbounded"/&gt;
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
        "transactionDetail"
    })
    public static class PartnerTransactionDetails {

        @XmlElement(name = "TransactionDetail", required = true)
        protected List<TransactionDetail> transactionDetail;

        /**
         * Gets the value of the transactionDetail property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the transactionDetail property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTransactionDetail().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TransactionDetail }
         * 
         * 
         */
        public List<TransactionDetail> getTransactionDetail() {
            if (transactionDetail == null) {
                transactionDetail = new ArrayList<TransactionDetail>();
            }
            return this.transactionDetail;
        }

    }

}
