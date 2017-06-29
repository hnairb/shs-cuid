package com.searshc.hs.agreement.agreementservice.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Agreement", namespace = "http://domain.agreementservice.agreement.hs.searshc.com")
public class Agreement implements Serializable {

	private static final long serialVersionUID = -112951696734866260L;
	private String agmtSfx;
	private String itemCnt;
	private String productCd;
	private String productPlanCd;
	private String productType;
	private String empId;
	private String cancelInd;
	private String expireDate;
	private String startDate;
	private String purchaseDate;
	private String coverageMonths;

	public String getAgmtSfx() {
		return agmtSfx;
	}

	public void setAgmtSfx(String agmtSfx) {
		this.agmtSfx = agmtSfx;
	}

	public String getProductCd() {
		return productCd;
	}

	public void setProductCd(String apSpPgmKey) {
		this.productCd = apSpPgmKey;
	}

	public String getProductPlanCd() {
		return productPlanCd;
	}

	public void setProductPlanCd(String apSppPgmKey) {
		this.productPlanCd = apSppPgmKey;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String apSptPgmKey) {
		this.productType = apSptPgmKey;
	}

	public String getCancelInd() {
		return cancelInd;
	}

	public void setCancelInd(String cancelInd) {
		this.cancelInd = cancelInd;
	}

	public String getCoverageMonths() {
		return coverageMonths;
	}

	public void setCoverageMonths(String coverageMonths) {
		this.coverageMonths = coverageMonths;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}

	public String getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getItemCnt() {
		return itemCnt;
	}

	public void setItemCnt(String itemCnt) {
		this.itemCnt = itemCnt;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Agreement [agmtSfx=");
		builder.append(agmtSfx);
		builder.append(", itemCnt=");
		builder.append(itemCnt);
		builder.append(", productCd=");
		builder.append(productCd);
		builder.append(", productPlanCd=");
		builder.append(productPlanCd);
		builder.append(", productType=");
		builder.append(productType);
		builder.append(", empId=");
		builder.append(empId);
		builder.append(", cancelInd=");
		builder.append(cancelInd);
		builder.append(", expireDate=");
		builder.append(expireDate);
		builder.append(", startDate=");
		builder.append(startDate);
		builder.append(", purchaseDate=");
		builder.append(purchaseDate);
		builder.append(", coverageMonths=");
		builder.append(coverageMonths);
		builder.append("]");
		return builder.toString();
	}

}
