package com.searshc.hs.agreement.agreementservice.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "AgreementAddPayDtls", namespace = "http://domain.agreementservice.agreement.hs.searshc.com")
public class AgreementAddPayDtls {

	private String accountNo;
	private String paymentType;
	private String salesAuthNo;
	private String paymentAmount;
	private String totalRefundAmount;
	private String creditCardExp;
	private String giftCardNo;
	private String creditCardTokenNo;
	
	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getSalesAuthNo() {
		return salesAuthNo;
	}

	public void setSalesAuthNo(String salesAuthNo) {
		this.salesAuthNo = salesAuthNo;
	}

	public String getPaymentAmount() {
		return paymentAmount;
	}

	public void setPaymentAmount(String paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	public String getTotalRefundAmount() {
		return totalRefundAmount;
	}

	public void setTotalRefundAmount(String totalRefundAmount) {
		this.totalRefundAmount = totalRefundAmount;
	}

	public String getCreditCardExp() {
		return creditCardExp;
	}

	public void setCreditCardExp(String creditCardExp) {
		this.creditCardExp = creditCardExp;
	}

	public String getGiftCardNo() {
		return giftCardNo;
	}

	public void setGiftCardNo(String giftCardNo) {
		this.giftCardNo = giftCardNo;
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
		builder.append("AgreementAddPayDtls [accountNo=");
		builder.append(accountNo);
		builder.append(", paymentType=");
		builder.append(paymentType);
		builder.append(", salesAuthNo=");
		builder.append(salesAuthNo);
		builder.append(", paymentAmount=");
		builder.append(paymentAmount);
		builder.append(", totalRefundAmount=");
		builder.append(totalRefundAmount);
		builder.append(", creditCardExp=");
		builder.append(creditCardExp);
		builder.append(", giftCardNo=");
		builder.append(giftCardNo);
		builder.append("]");
		return builder.toString();
	}

}
