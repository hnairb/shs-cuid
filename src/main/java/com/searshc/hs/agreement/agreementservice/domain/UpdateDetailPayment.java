package com.searshc.hs.agreement.agreementservice.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "UpdateDetailPayment", namespace = "http://domain.agreementservice.agreement.hs.searshc.com")
public class UpdateDetailPayment {

	private String refundAcctNo;
	private String refundAcctType;
	private String refundDollarAmt;
	private String creditCardTokenNo;

	public String getRefundAcctNo() {
		return refundAcctNo;
	}

	public void setRefundAcctNo(String refundAcctNo) {
		this.refundAcctNo = refundAcctNo;
	}

	public String getRefundAcctType() {
		return refundAcctType;
	}

	public void setRefundAcctType(String refundAcctType) {
		this.refundAcctType = refundAcctType;
	}

	public String getRefundDollarAmt() {
		return refundDollarAmt;
	}

	public String getCreditCardTokenNo() {
   	return creditCardTokenNo;
   }

	public void setCreditCardTokenNo(String creditCardTokenNo) {
   	this.creditCardTokenNo = creditCardTokenNo;
   }

	public void setRefundDollarAmt(String refundDollarAmt) {
		this.refundDollarAmt = refundDollarAmt;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UpdateDetailPayment [refundAcctNo=");
		builder.append(refundAcctNo);
		builder.append(", refundAcctType=");
		builder.append(refundAcctType);
		builder.append(", refundDollarAmt=");
		builder.append(refundDollarAmt);
		builder.append("]");
		return builder.toString();
	}

}
