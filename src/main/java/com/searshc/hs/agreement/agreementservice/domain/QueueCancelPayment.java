package com.searshc.hs.agreement.agreementservice.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "QueueCancelPayment", namespace = "http://domain.agreementservice.agreement.hs.searshc.com")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueueCancelPayment", propOrder = { "acctNo", "paymentType",
		"refundDollarAmt", "creditCardTokenNo" })
public class QueueCancelPayment {

	@XmlElement(required = true, nillable = true)
	protected String acctNo;
	@XmlElement(required = true, nillable = true)
	protected String paymentType;
	@XmlElement(required = true, nillable = true)
	protected String refundDollarAmt;
	@XmlElement(required = false)
	protected String creditCardTokenNo;
	
	public String getAcctNo() {
		return acctNo;
	}

	public void setAcctNo(String acctNo) {
		this.acctNo = acctNo;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getRefundDollarAmt() {
		return refundDollarAmt;
	}

	public void setRefundDollarAmt(String refundDollarAmt) {
		this.refundDollarAmt = refundDollarAmt;
	}
	public String getCreditCardTokenNo() {
   	return creditCardTokenNo;
   }
	public void setCreditCardTokenNo(String creditCardTokenNo) {
   	this.creditCardTokenNo = creditCardTokenNo;
   }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("QueueCancelPayment [acctNo=");
		builder.append(acctNo);
		builder.append(", paymentType=");
		builder.append(paymentType);
		builder.append(", refundDollarAmt=");
		builder.append(refundDollarAmt);
		builder.append("]");
		return builder.toString();
	}

}
