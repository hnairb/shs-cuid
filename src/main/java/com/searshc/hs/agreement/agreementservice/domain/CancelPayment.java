package com.searshc.hs.agreement.agreementservice.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "CancelPayment", namespace = "http://domain.agreementservice.agreement.hs.searshc.com")
public class CancelPayment {

	private String acctExp;
	private String acctNo;
	private String paymentType;
	private String netRefundAmt;
	private String netTaxAmt;
	private String creditCardTokenNo;
	
	public String getAcctExp() {
		return acctExp;
	}

	public void setAcctExp(String acctExp) {
		this.acctExp = acctExp;
	}

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

	public String getNetRefundAmt() {
		return netRefundAmt;
	}

	public void setNetRefundAmt(String netRefundAmt) {
		this.netRefundAmt = netRefundAmt;
	}

	public String getNetTaxAmt() {
		return netTaxAmt;
	}

	public void setNetTaxAmt(String netTaxAmt) {
		this.netTaxAmt = netTaxAmt;
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
		builder.append("CancelPayment [acctExp=");
		builder.append(acctExp);
		builder.append(", acctNo=");
		builder.append(acctNo);
		builder.append(", paymentType=");
		builder.append(paymentType);
		builder.append(", netRefundAmt=");
		builder.append(netRefundAmt);
		builder.append(", netTaxAmt=");
		builder.append(netTaxAmt);
		builder.append("]");
		return builder.toString();
	}

}
