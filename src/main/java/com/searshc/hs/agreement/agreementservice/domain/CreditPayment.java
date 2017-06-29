package com.searshc.hs.agreement.agreementservice.domain;

import java.sql.Date;
import java.sql.Timestamp;

public class CreditPayment {
	private long custNo;
	private int locNo;
	private int leadNo;
	private long contactNo;
	private String initCreditAuthFl;
	private long creditCardNo;
	private String creditCardType;
	private String creditCardExpMthYr;
	private String batchNo;
	private String responseTimeStamp;
	private String salesAuthNo;
	private String authApprovedFl;
	private String authAttempts;
	private String onlineAuthAttempts;
	private String salesRefNo;
	private Timestamp initAuthTimeStampOnline;
	private double grossAmt;
	private double discAmt;
	private double assocDiscAmt;
	private double netAmt;
	private double taxAmt;
	private double totalAmt;
	private Timestamp endAuthTimeStamp;
	private String authCd;
	private String authResponseCd;
	private Date delayBillDate;
	private int deferInterestMonths;
	private String zeroPercInd;
	private int creditSeqNo ;
	private String creditCardTokenNo;
	private String maskedCreditCardNo;
	private String settlementKey;
	 
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CreditPayment [custNo=");
		builder.append(custNo);
		builder.append(", locNo=");
		builder.append(locNo);
		builder.append(", leadNo=");
		builder.append(leadNo);
		builder.append(", contactNo=");
		builder.append(contactNo);
		builder.append(", initCreditAuthFl=");
		builder.append(initCreditAuthFl);
		builder.append(", creditCardNo=");
		builder.append(creditCardNo);
		builder.append(", creditCardType=");
		builder.append(creditCardType);
		builder.append(", creditCardExpMthYr=");
		builder.append(creditCardExpMthYr);
		builder.append(", batchNo=");
		builder.append(batchNo);
		builder.append(", responseTimeStamp=");
		builder.append(responseTimeStamp);
		builder.append(", salesAuthNo=");
		builder.append(salesAuthNo);
		builder.append(", authApprovedFl=");
		builder.append(authApprovedFl);
		builder.append(", authAttempts=");
		builder.append(authAttempts);
		builder.append(", onlineAuthAttempts=");
		builder.append(onlineAuthAttempts);
		builder.append(", salesRefNo=");
		builder.append(salesRefNo);
		builder.append(", initAuthTimeStampOnline=");
		builder.append(initAuthTimeStampOnline);
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
		builder.append(", endAuthTimeStamp=");
		builder.append(endAuthTimeStamp);
		builder.append(", authCd=");
		builder.append(authCd);
		builder.append(", authResponseCd=");
		builder.append(authResponseCd);
		builder.append(", delayBillDate=");
		builder.append(delayBillDate);
		builder.append(", deferInterestMonths=");
		builder.append(deferInterestMonths);
		builder.append(", zeroPercInd=");
		builder.append(zeroPercInd);
		builder.append(", creditSeqNo=");
		builder.append(creditSeqNo);
		builder.append("]");
		return builder.toString();
	}

	public double getAssocDiscAmt() {
		return assocDiscAmt;
	}

	public void setAssocDiscAmt(double assocDiscAmt) {
		this.assocDiscAmt = assocDiscAmt;
	}

	public String getAuthApprovedFl() {
		return authApprovedFl;
	}

	public void setAuthApprovedFl(String authApprovedFl) {
		this.authApprovedFl = authApprovedFl;
	}

	public String getAuthAttempts() {
		return authAttempts;
	}

	public void setAuthAttempts(String authAttempts) {
		this.authAttempts = authAttempts;
	}

	public String getAuthCd() {
		return authCd;
	}

	public void setAuthCd(String authCd) {
		this.authCd = authCd;
	}

	public String getAuthResponseCd() {
		return authResponseCd;
	}

	public void setAuthResponseCd(String authResponseCd) {
		this.authResponseCd = authResponseCd;
	}

	public String getBatchNo() {
		return batchNo;
	}

	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	public String getCreditCardExpMthYr() {
		return creditCardExpMthYr;
	}

	public void setCreditCardExpMthYr(String creditCardExpYr) {
		this.creditCardExpMthYr = creditCardExpYr;
	}

	public long getCreditCardNo() {
		return creditCardNo;
	}

	public void setCreditCardNo(long creditCardNo) {
		this.creditCardNo = creditCardNo;
	}

	public String getCreditCardType() {
		return creditCardType;
	}

	public void setCreditCardType(String creditCardType) {
		this.creditCardType = creditCardType;
	}

	public long getCustNo() {
		return custNo;
	}

	public void setCustNo(long custNo) {
		this.custNo = custNo;
	}

	public int getDeferInterestMonths() {
		return deferInterestMonths;
	}

	public void setDeferInterestMonths(int deferInterestMonths) {
		this.deferInterestMonths = deferInterestMonths;
	}

	public Date getDelayBillDate() {
		return delayBillDate;
	}

	public void setDelayBillDate(Date delayBillDate) {
		this.delayBillDate = delayBillDate;
	}

	public double getDiscAmt() {
		return discAmt;
	}

	public void setDiscAmt(double discAmt) {
		this.discAmt = discAmt;
	}

	public Timestamp getEndAuthTimeStamp() {
		return endAuthTimeStamp;
	}

	public void setEndAuthTimeStamp(Timestamp endAuthTimeStamp) {
		this.endAuthTimeStamp = endAuthTimeStamp;
	}

	public double getGrossAmt() {
		return grossAmt;
	}

	public void setGrossAmt(double grossAmt) {
		this.grossAmt = grossAmt;
	}

	public Timestamp getInitAuthTimeStampOnline() {
		return initAuthTimeStampOnline;
	}

	public void setInitAuthTimeStampOnline(Timestamp initAuthTimeStampOnline) {
		this.initAuthTimeStampOnline = initAuthTimeStampOnline;
	}

	public String getInitCreditAuthFl() {
		return initCreditAuthFl;
	}

	public void setInitCreditAuthFl(String initCreditAuthFl) {
		this.initCreditAuthFl = initCreditAuthFl;
	}

	public int getLeadNo() {
		return leadNo;
	}

	public void setLeadNo(int leadNo) {
		this.leadNo = leadNo;
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

	public String getOnlineAuthAttempts() {
		return onlineAuthAttempts;
	}

	public void setOnlineAuthAttempts(String onlineAuthAttempts) {
		this.onlineAuthAttempts = onlineAuthAttempts;
	}

	public String getResponseTimeStamp() {
		return responseTimeStamp;
	}

	public void setResponseTimeStamp(String responseTimeStamp) {
		this.responseTimeStamp = responseTimeStamp;
	}

	public String getSalesAuthNo() {
		return salesAuthNo;
	}

	public void setSalesAuthNo(String salesAuthNo) {
		this.salesAuthNo = salesAuthNo;
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

	public String getZeroPercInd() {
		return zeroPercInd;
	}

	public void setZeroPercInd(String zeroPercInd) {
		this.zeroPercInd = zeroPercInd;
	}

	public int getCreditSeqNo() {
		return creditSeqNo;
	}

	public void setCreditSeqNo(int creditSeqNo) {
		this.creditSeqNo = creditSeqNo;
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
	
	

}
