package com.searshc.hs.agreement.agreementservice.domain;

import java.sql.Timestamp;

public class CashPayment {
	private long custNo;
	private int locNo;
	private int leadNo;
	private long contactNo;
	private Timestamp letterSentDate;
	private int checkNo;
	private double cashAmt;
	private String letterTypeCd;
	private String salesRefNo;
	private double grossAmt;
	private double discAmt;
	private double assocDiscAmt;
	private double netAmt;
	private double taxAmt;
	private double totalAmt;
	private String letterChannelTypeCd;
	private String initLetterFl;
	private String addressTypeCd;
	private String electricCheckNo;
	private String electricCheckApprovalCd;
	private String electricCheckRecNo;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CashPayment [custNo=");
		builder.append(custNo);
		builder.append(", locNo=");
		builder.append(locNo);
		builder.append(", leadNo=");
		builder.append(leadNo);
		builder.append(", contactNo=");
		builder.append(contactNo);
		builder.append(", letterSentDate=");
		builder.append(letterSentDate);
		builder.append(", checkNo=");
		builder.append(checkNo);
		builder.append(", cashAmt=");
		builder.append(cashAmt);
		builder.append(", letterTypeCd=");
		builder.append(letterTypeCd);
		builder.append(", salesRefNo=");
		builder.append(salesRefNo);
		builder.append(", grossAmt=");
		builder.append(grossAmt);
		builder.append(", discAmt=");
		builder.append(discAmt);
		builder.append(", assocDiscAmt=");
		builder.append(assocDiscAmt);
		builder.append(", netAmt=");
		builder.append(netAmt);
		builder.append(", taxAmt=");
		builder.append(taxAmt);
		builder.append(", totalAmt=");
		builder.append(totalAmt);
		builder.append(", letterChannelTypeCd=");
		builder.append(letterChannelTypeCd);
		builder.append(", initLetterFl=");
		builder.append(initLetterFl);
		builder.append(", addressTypeCd=");
		builder.append(addressTypeCd);
		builder.append(", electricCheckNo=");
		builder.append(electricCheckNo);
		builder.append(", electricCheckApprovalCd=");
		builder.append(electricCheckApprovalCd);
		builder.append(", electricCheckRecNo=");
		builder.append(electricCheckRecNo);
		builder.append("]");
		return builder.toString();
	}

	public String getAddressTypeCd() {
		return addressTypeCd;
	}

	public void setAddressTypeCd(String addressTypeCd) {
		this.addressTypeCd = addressTypeCd;
	}

	public double getAssocDiscAmt() {
		return assocDiscAmt;
	}

	public void setAssocDiscAmt(double assocDiscAmt) {
		this.assocDiscAmt = assocDiscAmt;
	}

	public double getCashAmt() {
		return cashAmt;
	}

	public void setCashAmt(double cashAmt) {
		this.cashAmt = cashAmt;
	}

	public int getCheckNo() {
		return checkNo;
	}

	public void setCheckNo(int checkNo) {
		this.checkNo = checkNo;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	public long getCustNo() {
		return custNo;
	}

	public void setCustNo(long custNo) {
		this.custNo = custNo;
	}

	public double getDiscAmt() {
		return discAmt;
	}

	public void setDiscAmt(double discAmt) {
		this.discAmt = discAmt;
	}

	public double getGrossAmt() {
		return grossAmt;
	}

	public void setGrossAmt(double grossAmt) {
		this.grossAmt = grossAmt;
	}

	public String getInitLetterFl() {
		return initLetterFl;
	}

	public void setInitLetterFl(String initLetterFl) {
		this.initLetterFl = initLetterFl;
	}

	public int getLeadNo() {
		return leadNo;
	}

	public void setLeadNo(int leadNo) {
		this.leadNo = leadNo;
	}

	public String getLetterChannelTypeCd() {
		return letterChannelTypeCd;
	}

	public void setLetterChannelTypeCd(String letterChannelTypeCd) {
		this.letterChannelTypeCd = letterChannelTypeCd;
	}

	public Timestamp getLetterSentDate() {
		return letterSentDate;
	}

	public void setLetterSentDate(Timestamp letterSentDate) {
		this.letterSentDate = letterSentDate;
	}

	public String getLetterTypeCd() {
		return letterTypeCd;
	}

	public void setLetterTypeCd(String letterTypeCd) {
		this.letterTypeCd = letterTypeCd;
	}

	public int getLocNo() {
		return locNo;
	}

	public void setLocNo(int locNo) {
		this.locNo = locNo;
	}

	public double getNetAmt() {
		return netAmt;
	}

	public void setNetAmt(double netAmt) {
		this.netAmt = netAmt;
	}

	public String getSalesRefNo() {
		return salesRefNo;
	}

	public void setSalesRefNo(String salesRefNo) {
		this.salesRefNo = salesRefNo;
	}

	public double getTaxAmt() {
		return taxAmt;
	}

	public void setTaxAmt(double taxAmt) {
		this.taxAmt = taxAmt;
	}

	public double getTotalAmt() {
		return totalAmt;
	}

	public void setTotalAmt(double totalAmt) {
		this.totalAmt = totalAmt;
	}

	public String getElectricCheckApprovalCd() {
		return electricCheckApprovalCd;
	}

	public void setElectricCheckApprovalCd(String electricCheckApprovalCd) {
		this.electricCheckApprovalCd = electricCheckApprovalCd;
	}

	public String getElectricCheckNo() {
		return electricCheckNo;
	}

	public void setElectricCheckNo(String electricCheckNo) {
		this.electricCheckNo = electricCheckNo;
	}

	public String getElectricCheckRecNo() {
		return electricCheckRecNo;
	}

	public void setElectricCheckRecNo(String electricCheckRecNo) {
		this.electricCheckRecNo = electricCheckRecNo;
	}

}
