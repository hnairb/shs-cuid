package com.searshc.hs.agreement.agreementservice.domain;


public class AgreementDetailVO {

	private String prodPlan;	
	private String prodType;
	private String contactMethod;
	private String leadType;
	private String leadSubType;
	private String agreeMonths;
	private String purchaseDt;
    private double agreeNetAmt;
	private double agreeSywrAmt;
	private int    agreeSywrPoints;
	private String paymentType;
	private double netRefundAmt;

	
	public String getProdPlan() {
		return prodPlan;
	}
	public void setProdPlan(String prodPlan) {
		this.prodPlan = prodPlan;
	}
	public String getProdType() {
		return prodType;
	}
	public void setProdType(String prodType) {
		this.prodType = prodType;
	}
	public String getContactMethod() {
		return contactMethod;
	}
	public void setContactMethod(String contactMethod) {
		this.contactMethod = contactMethod;
	}
	public String getLeadType() {
		return leadType;
	}
	public void setLeadType(String leadType) {
		this.leadType = leadType;
	}
	public String getLeadSubType() {
		return leadSubType;
	}
	public void setLeadSubType(String leadSubType) {
		this.leadSubType = leadSubType;
	}
	public String getAgreeMonths() {
		return agreeMonths;
	}
	public void setAgreeMonths(String agreeMonths) {
		this.agreeMonths = agreeMonths;
	}
	public String getPurchaseDt() {
		return purchaseDt;
	}
	public void setPurchaseDt(String purchaseDt) {
		this.purchaseDt = purchaseDt;
	}
	
	public double getAgreeNetAmt() {
		return agreeNetAmt;
	}
	public void setAgreeNetAmt(double agreeNetAmt) {
		this.agreeNetAmt = agreeNetAmt;
	}
	public double getAgreeSywrAmt() {
		return agreeSywrAmt;
	}
	public void setAgreeSywrAmt(double agreeSywrAmt) {
		this.agreeSywrAmt = agreeSywrAmt;
	}
	public int getAgreeSywrPoints() {
		return agreeSywrPoints;
	}
	public void setAgreeSywrPoints(int agreeSywrPoints) {
		this.agreeSywrPoints = agreeSywrPoints;
	}
	public String getPaymentType() {
		return paymentType;
	}
	
	
	public double getNetRefundAmt() {
		return netRefundAmt;
	}
	public void setNetRefundAmt(double netRefundAmt) {
		this.netRefundAmt = netRefundAmt;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AgreementDetailVO [prodPlan=");
		builder.append(prodPlan);
		builder.append(", prodType=");
		builder.append(prodType);
		builder.append(", contactMethod=");
		builder.append(contactMethod);
		builder.append(", leadType=");
		builder.append(leadType);
		builder.append(", leadSubType=");
		builder.append(leadSubType);
		builder.append(", agreeMonths=");
		builder.append(agreeMonths);
		builder.append(", purchaseDt=");
		builder.append(purchaseDt);
		builder.append(", agreeNetAmt=");
		builder.append(agreeNetAmt);
		builder.append(", agreeSywrAmt=");
		builder.append(agreeSywrAmt);
		builder.append(", agreeSywrPoints=");
		builder.append(agreeSywrPoints);
		builder.append(", paymentType=");
		builder.append(paymentType);
		builder.append(", netRefundAmt=");
		builder.append(netRefundAmt);
		builder.append("]");
		return builder.toString();
	}
	
	
	
		
	

}
