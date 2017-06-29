package com.searshc.hs.agreement.agreementservice.domain;

import java.sql.Date;

/**
 * @author nm0000
 *
 */
public class SettlementTotals {

	private String svcPrdPlanCd;
	private String svcPrdTypeCd;
	private int coverageMths;
	private Date startDate;
	private Date expireDate;
	private int itemCnt;
	private double grossAmt;
	private double discAmt;
	private double assocDiscAmt;
	private double otherDiscAmt;
	private double netAmt;
	private double taxAmt;
	private double totalAmt;
	private long	sywrPoints;
	private double	sywrDollars;


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SettlementTotals [svcPrdPlanCd=");
		builder.append(svcPrdPlanCd);
		builder.append(", svcPrdTypeCd=");
		builder.append(svcPrdTypeCd);
		builder.append(", coverageMths=");
		builder.append(coverageMths);
		builder.append(", startDate=");
		builder.append(startDate);
		builder.append(", expireDate=");
		builder.append(expireDate);
		builder.append(", itemCnt=");
		builder.append(itemCnt);
		builder.append(", grossAmt=");
		builder.append(grossAmt);
		builder.append(", discAmt=");
		builder.append(discAmt);
		builder.append(", assocDiscAmt=");
		builder.append(assocDiscAmt);
		builder.append(", otherDiscAmt=");
		builder.append(otherDiscAmt);
		builder.append(", netAmt=");
		builder.append(netAmt);
		builder.append(", taxAmt=");
		builder.append(taxAmt);
		builder.append(", totalAmt=");
		builder.append(totalAmt);
		builder.append(", sywrPoints=");
		builder.append(sywrPoints);
		builder.append(", sywrDollars=");
		builder.append(sywrDollars);
		builder.append("]");
		return builder.toString();
	}

	public int getItemCnt() {
		return itemCnt;
	}

	public void setItemCnt(int itemCnt) {
		this.itemCnt = itemCnt;
	}

	public Date getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public double getAssocDiscAmt() {
		return assocDiscAmt;
	}

	public void setAssocDiscAmt(double assocDiscAmt) {
		this.assocDiscAmt = assocDiscAmt;
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

	public double getNetAmt() {
		return netAmt;
	}

	public void setNetAmt(double netAmt) {
		this.netAmt = netAmt;
	}

	public double getOtherDiscAmt() {
		return otherDiscAmt;
	}

	public void setOtherDiscAmt(double otherDiscAmt) {
		this.otherDiscAmt = otherDiscAmt;
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

	public String getSvcPrdPlanCd() {
		return svcPrdPlanCd;
	}

	public void setSvcPrdPlanCd(String svcPrdPlanCd) {
		this.svcPrdPlanCd = svcPrdPlanCd;
	}

	public int getCoverageMths() {
		return coverageMths;
	}

	public void setCoverageMths(int coverageMths) {
		this.coverageMths = coverageMths;
	}

	public void addTotals(SettlementTotals totals) {
		grossAmt += totals.getGrossAmt();
		discAmt += totals.getDiscAmt();
		assocDiscAmt += totals.getAssocDiscAmt();
		otherDiscAmt += totals.getOtherDiscAmt();
		netAmt += totals.getNetAmt();
		taxAmt += totals.getTaxAmt();
		totalAmt += totals.getTotalAmt();
	}

	public void addGrossAmt(double d) {
		grossAmt += d;
	}

	public void addDiscAmt(double d) {
		discAmt += d;
	}

	public void addAssocDiscAmt(double d) {
		assocDiscAmt += d;
	}

	public void addOtherDiscAmt(double d) {
		otherDiscAmt += d;
	}

	public void addNetAmt(double d) {
		netAmt += d;
	}

	public void addTaxAmt(double d) {
		taxAmt += d;
	}

	public void addTotalAmt(double d) {
		totalAmt += d;
	}
	
	public void addSywrPoints(long value)
	{
		sywrPoints+=value;
	}
	public void addSywrDollars(double value)
	{
		sywrDollars+=value;
	}

	public String getSvcPrdTypeCd() {
		return svcPrdTypeCd;
	}

	public void setSvcPrdTypeCd(String svcPrdTypeCd) {
		this.svcPrdTypeCd = svcPrdTypeCd;
	}

	public long getSywrPoints() {
		return sywrPoints;
	}

	public void setSywrPoints(long sywrPoints) {
		this.sywrPoints = sywrPoints;
	}

	public double getSywrDollars() {
		return sywrDollars;
	}

	public void setSywrDollars(double sywrDollars) {
		this.sywrDollars = sywrDollars;
	}
	
	
}
