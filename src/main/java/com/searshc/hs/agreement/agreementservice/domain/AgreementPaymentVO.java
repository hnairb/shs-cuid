
package com.searshc.hs.agreement.agreementservice.domain;


public class AgreementPaymentVO {
	
    protected String paymentMethod;
    protected double payAmount;
    protected String sywrUsePoints;
    protected String accountNumber;
    protected String accountExpireDt;
    protected String authNumber;
    protected double refundAmount;
    protected int sywrRefundPoints;
    protected String sywrDate;
 	 protected String creditCardTokenNo;

	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public double getPayAmount() {
		return payAmount;
	}
	public void setPayAmount(double payAmount) {
		this.payAmount = payAmount;
	}
	public String getSywrUsePoints() {
		return sywrUsePoints;
	}
	public void setSywrUsePoints(String sywrUsePoints) {
		this.sywrUsePoints = sywrUsePoints;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountExpireDt() {
		return accountExpireDt;
	}
	public void setAccountExpireDt(String accountExpireDt) {
		this.accountExpireDt = accountExpireDt;
	}
	public String getAuthNumber() {
		return authNumber;
	}
	public void setAuthNumber(String authNumber) {
		this.authNumber = authNumber;
	}
	public double getRefundAmount() {
		return refundAmount;
	}
	public void setRefundAmount(double refundAmount) {
		this.refundAmount = refundAmount;
	}
	public int getSywrRefundPoints() {
		return sywrRefundPoints;
	}
	public void setSywrRefundPoints(int sywrRefundPoints) {
		this.sywrRefundPoints = sywrRefundPoints;
	}
	public String getSywrDate() {
		return sywrDate;
	}
	public void setSywrDate(String sywrDate) {
		this.sywrDate = sywrDate;
	}
	public String getCreditCardTokenNo() {
   	return creditCardTokenNo;
   }
	public void setCreditCardTokenNo(String creditCardTokenNo) {
   	this.creditCardTokenNo = creditCardTokenNo;
   }
	@Override
	public String toString() {
		return "AgreementPaymentVO [accountExpireDt=" + accountExpireDt
				+ ", accountNumber=" + accountNumber + ", authNumber="
				+ authNumber + ", payAmount=" + payAmount + ", paymentMethod="
				+ paymentMethod + ", refundAmount=" + refundAmount
				+ ", sywrDate=" + sywrDate + ", sywrRefundPoints="
				+ sywrRefundPoints + ", sywrUsePoints=" + sywrUsePoints 
				+ ", creditCardTokenNo=" + creditCardTokenNo + "]";
	}
    
}
