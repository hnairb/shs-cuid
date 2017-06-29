
package com.searshc.hs.agreement.agreementservice.domain;

import java.sql.Date;

public class ProductSold {

	private long custNo;
	private int locNo;
	private int leadNo;
	private long contactNo;
	private String svcPrdPlanCd;
	private String prdNameCd;
	private String svcPrdTypeCd;
	private String sellUnitNo;
	private Date purchaseDate;
	private String recEmpNo;
	private String sellEmpNo;
	private int coverageMths;
	private Date startDate;
	private Date expireDate;
	private double grossAmt;
	private double discAmt;
	private double assocDiscAmt;
	private double netAmt;
	private double taxAmt;
	private double totalAmt;
	private double otherDiscAmt;
	private String printCertificateFl;
	private String contactMethodCd;
	private String triggerCd;
	private String recUnitNo;
	private String taxGeoCd;
	private String jurCd;
	private String taxCountyCd;
	private double taxRate;
	private String taxExemptFl;
	private String taxExemptNo;
	private int sessionId;
	private String sywrMemberId;
	private double sywrMemberDollars;
	private long sywrMemberPoints;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ProductSold [custNo=");
		builder.append(custNo);
		builder.append(", locNo=");
		builder.append(locNo);
		builder.append(", leadNo=");
		builder.append(leadNo);
		builder.append(", contactNo=");
		builder.append(contactNo);
		builder.append(", svcPrdPlanCd=");
		builder.append(svcPrdPlanCd);
		builder.append(", prdNameCd=");
		builder.append(prdNameCd);
		builder.append(", svcPrdTypeCd=");
		builder.append(svcPrdTypeCd);
		builder.append(", sellUnitNo=");
		builder.append(sellUnitNo);
		builder.append(", purchaseDate=");
		builder.append(purchaseDate);
		builder.append(", recEmpNo=");
		builder.append(recEmpNo);
		builder.append(", sellEmpNo=");
		builder.append(sellEmpNo);
		builder.append(", coverageMths=");
		builder.append(coverageMths);
		builder.append(", startDate=");
		builder.append(startDate);
		builder.append(", expireDate=");
		builder.append(expireDate);
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
		builder.append(", otherDiscAmt=");
		builder.append(otherDiscAmt);
		builder.append(", printCertificateFl=");
		builder.append(printCertificateFl);
		builder.append(", contactMethodCd=");
		builder.append(contactMethodCd);
		builder.append(", triggerCd=");
		builder.append(triggerCd);
		builder.append(", recUnitNo=");
		builder.append(recUnitNo);
		builder.append(", taxGeoCd=");
		builder.append(taxGeoCd);
		builder.append(", jurCd=");
		builder.append(jurCd);
		builder.append(", taxCountyCd=");
		builder.append(taxCountyCd);
		builder.append(", taxRate=");
		builder.append(taxRate);
		builder.append(", taxExemptFl=");
		builder.append(taxExemptFl);
		builder.append(", taxExemptNo=");
		builder.append(taxExemptNo);
		builder.append(", sessionId=");
		builder.append(sessionId);
		builder.append(", sywrMemberId=");
		builder.append(sywrMemberId);
		builder.append(", sywrMemberDollars=");
		builder.append(sywrMemberDollars);
		builder.append(", sywrMemberPoints=");
		builder.append(sywrMemberPoints);
		builder.append("]");
		return builder.toString();
	}

	public double getAssocDiscAmt() {
		return assocDiscAmt;
	}

	public void setAssocDiscAmt(double assocDiscAmt) {
		this.assocDiscAmt = assocDiscAmt;
	}

	public String getContactMethodCd() {
		return contactMethodCd;
	}

	public void setContactMethodCd(String contactMethodCd) {
		this.contactMethodCd = contactMethodCd;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	public int getCoverageMths() {
		return coverageMths;
	}

	public void setCoverageMths(int coverageMths) {
		this.coverageMths = coverageMths;
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

	public Date getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}

	public double getGrossAmt() {
		return grossAmt;
	}

	public void setGrossAmt(double grossAmt) {
		this.grossAmt = grossAmt;
	}

	public String getJurCd() {
		return jurCd;
	}

	public void setJurCd(String jurCd) {
		this.jurCd = jurCd;
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

	public String getPrdNameCd() {
		return prdNameCd;
	}

	public void setPrdNameCd(String prdNameCd) {
		this.prdNameCd = prdNameCd;
	}

	public String getPrintCertificateFl() {
		return printCertificateFl;
	}

	public void setPrintCertificateFl(String prn_cr_fl) {
		this.printCertificateFl = prn_cr_fl;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public String getRecEmpNo() {
		return recEmpNo;
	}

	public void setRecEmpNo(String recEmpNo) {
		this.recEmpNo = recEmpNo;
	}

	public String getRecUnitNo() {
		return recUnitNo;
	}

	public void setRecUnitNo(String recUnitNo) {
		this.recUnitNo = recUnitNo;
	}

	public String getSellEmpNo() {
		return sellEmpNo;
	}

	public void setSellEmpNo(String sellEmpNo) {
		this.sellEmpNo = sellEmpNo;
	}

	public String getSellUnitNo() {
		return sellUnitNo;
	}

	public void setSellUnitNo(String sellUnitNo) {
		this.sellUnitNo = sellUnitNo;
	}

	public int getSessionId() {
		return sessionId;
	}

	public void setSessionId(int sessionId) {
		this.sessionId = sessionId;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getSvcPrdPlanCd() {
		return svcPrdPlanCd;
	}

	public void setSvcPrdPlanCd(String svcPrdPlanCd) {
		this.svcPrdPlanCd = svcPrdPlanCd;
	}

	public String getSvcPrdTypeCd() {
		return svcPrdTypeCd;
	}

	public void setSvcPrdTypeCd(String svcPrdTypeCd) {
		this.svcPrdTypeCd = svcPrdTypeCd;
	}

	public double getTaxAmt() {
		return taxAmt;
	}

	public void setTaxAmt(double taxAmt) {
		this.taxAmt = taxAmt;
	}

	public String getTaxCountyCd() {
		return taxCountyCd;
	}

	public void setTaxCountyCd(String taxCountyCd) {
		this.taxCountyCd = taxCountyCd;
	}

	public String getTaxExemptFl() {
		return taxExemptFl;
	}

	public void setTaxExemptFl(String taxExemptFl) {
		this.taxExemptFl = taxExemptFl;
	}

	public String getTaxExemptNo() {
		return taxExemptNo;
	}

	public void setTaxExemptNo(String taxExemptNo) {
		this.taxExemptNo = taxExemptNo;
	}

	public String getTaxGeoCd() {
		return taxGeoCd;
	}

	public void setTaxGeoCd(String taxGeoCd) {
		this.taxGeoCd = taxGeoCd;
	}

	public double getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(double taxRate) {
		this.taxRate = taxRate;
	}

	public double getTotalAmt() {
		return totalAmt;
	}

	public void setTotalAmt(double totalAmt) {
		this.totalAmt = totalAmt;
	}

	public String getTriggerCd() {
		return triggerCd;
	}

	public void setTriggerCd(String triggerCd) {
		this.triggerCd = triggerCd;
	}

	public double getOtherDiscAmt() {
		return otherDiscAmt;
	}

	public void setOtherDiscAmt(double otherDiscAmt) {
		this.otherDiscAmt = otherDiscAmt;
	}

	public String getSywrMemberId() {
		return sywrMemberId;
	}

	public void setSywrMemberId(String sywrMemberId) {
		this.sywrMemberId = sywrMemberId;
	}

	public double getSywrMemberDollars() {
		return sywrMemberDollars;
	}

	public void setSywrMemberDollars(double sywrMemberDollars) {
		this.sywrMemberDollars = sywrMemberDollars;
	}

	public long getSywrMemberPoints() {
		return sywrMemberPoints;
	}

	public void setSywrMemberPoints(long sywrMemberPoints) {
		this.sywrMemberPoints = sywrMemberPoints;
	}
	
}
