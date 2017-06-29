package com.searshc.hs.agreement.agreementservice.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "AddPayment", namespace = "http://domain.agreementservice.agreement.hs.searshc.com")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddPayment", propOrder = { "creditCardExp", "creditCardNo",
		"creditCardType", "delayBillDate", "zeroPercInd", "paymentType",
		"salesAuthNo", "giftCardPin", "giftCardNo", "paymentAmount",
		"creditCardTokenNo", "maskedCreditCardNo", "settlementKey"
})
public class AddPayment {

	@XmlElement(required = true, nillable = true)
	protected String creditCardExp;
	@XmlElement(required = true, nillable = true)
	protected String creditCardNo;
	@XmlElement(required = true, nillable = true)
	protected String creditCardType;
	@XmlElement(required = true, nillable = true)
	protected String delayBillDate;
	@XmlElement(required = true, nillable = true)
	protected String zeroPercInd;
	@XmlElement(required = true, nillable = true)
	protected String paymentType;
	@XmlElement(required = true, nillable = true)
	protected String salesAuthNo;
	@XmlElement(required = true, nillable = true)
	protected String giftCardPin;
	@XmlElement(required = true, nillable = true)
	protected String giftCardNo;
	@XmlElement(required = true, nillable = true)
	protected String paymentAmount;
	@XmlElement(required = false)
	protected String creditCardTokenNo;
	@XmlElement(required = false)
	protected String maskedCreditCardNo;
	@XmlElement(required = false)
	protected String settlementKey;

	public String getCreditCardExp() {
		return creditCardExp;
	}

	public void setCreditCardExp(String creditCardExp) {
		this.creditCardExp = creditCardExp;
	}

	public String getCreditCardNo() {
		return creditCardNo;
	}

	public void setCreditCardNo(String creditCardNo) {
		this.creditCardNo = creditCardNo;
	}

	public String getCreditCardType() {
		return creditCardType;
	}

	public void setCreditCardType(String creditCardType) {
		this.creditCardType = creditCardType;
	}

	public String getDelayBillDate() {
		return delayBillDate;
	}

	public void setDelayBillDate(String delayBillDate) {
		this.delayBillDate = delayBillDate;
	}

	public String getZeroPercInd() {
		return zeroPercInd;
	}

	public void setZeroPercInd(String zeroPercInd) {
		this.zeroPercInd = zeroPercInd;
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

	public String getGiftCardPin() {
		return giftCardPin;
	}

	public void setGiftCardPin(String giftCardPin) {
		this.giftCardPin = giftCardPin;
	}

	public String getGiftCardNo() {
		return giftCardNo;
	}

	public void setGiftCardNo(String giftCardNo) {
		this.giftCardNo = giftCardNo;
	}

	public String getPaymentAmount() {
		return paymentAmount;
	}

	public void setPaymentAmount(String paymentAmount) {
		this.paymentAmount = paymentAmount;
	}
	public String getCreditCardTokenNo() {
   	return creditCardTokenNo;
   }
	public void setCreditCardTokenNo(String creditCardTokenNo) {
   	this.creditCardTokenNo = creditCardTokenNo;
   }
	public String getMaskedCreditCardNo() {
   	return maskedCreditCardNo;
   }
	public void setMaskedCreditCardNo(String maskedCreditCardNo) {
   	this.maskedCreditCardNo = maskedCreditCardNo;
   }
	public String getSettlementKey() {
   	return settlementKey;
   }
	public void setSettlementKey(String settlementKey) {
   	this.settlementKey = settlementKey;
   }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AddPayment [creditCardExp=");
		builder.append(creditCardExp);
		builder.append(", creditCardNo=");
		builder.append(creditCardNo);
		builder.append(", creditCardType=");
		builder.append(creditCardType);
		builder.append(", delayBillDate=");
		builder.append(delayBillDate);
		builder.append(", zeroPercInd=");
		builder.append(zeroPercInd);
		builder.append(", paymentType=");
		builder.append(paymentType);
		builder.append(", salesAuthNo=");
		builder.append(salesAuthNo);
		builder.append(", giftCardPin=");
		builder.append(giftCardPin);
		builder.append(", giftCardNo=");
		builder.append(giftCardNo);
		builder.append(", paymentAmount=");
		builder.append(paymentAmount);
		builder.append("]");
		return builder.toString();
	}

}
