package com.searshc.hs.agreement.agreementservice.domain;

import java.sql.Date;

public class ItemFulFillment {

	private long custNo;
	private int locNo;
	private int leadNo;
	private long contactNo;
	private int itemSfx;
	private String prdPlanCd;
	private String mdseCd;
	private String svcLoc;
	private String taxFl;
	private double grossAmt;
	private double discAmt;
	private double assocDiscAmt;
	private double netAmt;
	private double taxAmt;
	private double totalAmt;
	private double otherDiscAmt;
	private double deductAmt;
	private String coverageType;
	private String divisionNo;
	private String obligorCd;
	private Date expireDate;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ItemFulFillment [custNo=");
		builder.append(custNo);
		builder.append(", locNo=");
		builder.append(locNo);
		builder.append(", leadNo=");
		builder.append(leadNo);
		builder.append(", contactNo=");
		builder.append(contactNo);
		builder.append(", itemSfx=");
		builder.append(itemSfx);
		builder.append(", prdPlanCd=");
		builder.append(prdPlanCd);
		builder.append(", mdseCd=");
		builder.append(mdseCd);
		builder.append(", svcLoc=");
		builder.append(svcLoc);
		builder.append(", taxFl=");
		builder.append(taxFl);
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
		builder.append(", deductAmt=");
		builder.append(deductAmt);
		builder.append(", coverageType=");
		builder.append(coverageType);
		builder.append(", divisionNo=");
		builder.append(divisionNo);
		builder.append(", obligorCd=");
		builder.append(obligorCd);
		builder.append(", expireDate=");
		builder.append(expireDate);
		builder.append("]");
		return builder.toString();
	}

	public double getDeductAmt() {
		return deductAmt;
	}

	public void setDeductAmt(double deductAmt) {
		this.deductAmt = deductAmt;
	}

	public double getAssocDiscAmt() {
		return assocDiscAmt;
	}

	public void setAssocDiscAmt(double assocDiscAmt) {
		this.assocDiscAmt = assocDiscAmt;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	public String getCoverageType() {
		return coverageType;
	}

	public void setCoverageType(String coverageType) {
		this.coverageType = coverageType;
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

	public String getDivisionNo() {
		return divisionNo;
	}

	public void setDivisionNo(String divisionNo) {
		this.divisionNo = divisionNo;
	}

	public double getGrossAmt() {
		return grossAmt;
	}

	public void setGrossAmt(double grossAmt) {
		this.grossAmt = grossAmt;
	}

	public int getItemSfx() {
		return itemSfx;
	}

	public void setItemSfx(int itemSfx) {
		this.itemSfx = itemSfx;
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

	public String getMdseCd() {
		return mdseCd;
	}

	public void setMdseCd(String mdseCd) {
		this.mdseCd = mdseCd;
	}

	public double getNetAmt() {
		return netAmt;
	}

	public void setNetAmt(double netAmt) {
		this.netAmt = netAmt;
	}

	public String getObligorCd() {
		return obligorCd;
	}

	public void setObligorCd(String obligorCd) {
		this.obligorCd = obligorCd;
	}

	public double getOtherDiscAmt() {
		return otherDiscAmt;
	}

	public void setOtherDiscAmt(double otherDiscAmt) {
		this.otherDiscAmt = otherDiscAmt;
	}

	public String getPrdPlanCd() {
		return prdPlanCd;
	}

	public void setPrdPlanCd(String prdPlanCd) {
		this.prdPlanCd = prdPlanCd;
	}

	public String getSvcLoc() {
		return svcLoc;
	}

	public void setSvcLoc(String svcLoc) {
		this.svcLoc = svcLoc;
	}

	public double getTaxAmt() {
		return taxAmt;
	}

	public void setTaxAmt(double taxAmt) {
		this.taxAmt = taxAmt;
	}

	public String getTaxFl() {
		return taxFl;
	}

	public void setTaxFl(String taxFl) {
		this.taxFl = taxFl;
	}

	public double getTotalAmt() {
		return totalAmt;
	}

	public void setTotalAmt(double totalAmt) {
		this.totalAmt = totalAmt;
	}

	public Date getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}

}
