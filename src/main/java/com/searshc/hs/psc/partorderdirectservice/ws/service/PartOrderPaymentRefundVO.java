
package com.searshc.hs.psc.partorderdirectservice.ws.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartOrderPaymentRefundVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartOrderPaymentRefundVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="paymentSeqNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="refundSeqNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="refundPaymentMethod" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="refundPaymentAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartOrderPaymentRefundVO", propOrder = {
    "paymentSeqNo",
    "refundSeqNo",
    "refundPaymentMethod",
    "refundPaymentAmount"
})
public class PartOrderPaymentRefundVO {

    protected int paymentSeqNo;
    protected int refundSeqNo;
    @XmlElement(required = true, nillable = true)
    protected String refundPaymentMethod;
    protected double refundPaymentAmount;

    /**
     * Gets the value of the paymentSeqNo property.
     * 
     */
    public int getPaymentSeqNo() {
        return paymentSeqNo;
    }

    /**
     * Sets the value of the paymentSeqNo property.
     * 
     */
    public void setPaymentSeqNo(int value) {
        this.paymentSeqNo = value;
    }

    /**
     * Gets the value of the refundSeqNo property.
     * 
     */
    public int getRefundSeqNo() {
        return refundSeqNo;
    }

    /**
     * Sets the value of the refundSeqNo property.
     * 
     */
    public void setRefundSeqNo(int value) {
        this.refundSeqNo = value;
    }

    /**
     * Gets the value of the refundPaymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundPaymentMethod() {
        return refundPaymentMethod;
    }

    /**
     * Sets the value of the refundPaymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundPaymentMethod(String value) {
        this.refundPaymentMethod = value;
    }

    /**
     * Gets the value of the refundPaymentAmount property.
     * 
     */
    public double getRefundPaymentAmount() {
        return refundPaymentAmount;
    }

    /**
     * Sets the value of the refundPaymentAmount property.
     * 
     */
    public void setRefundPaymentAmount(double value) {
        this.refundPaymentAmount = value;
    }

}
