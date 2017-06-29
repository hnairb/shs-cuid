package com.searshc.hs.agreement.agreementservice.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ItemDetail", namespace = "http://domain.agreementservice.agreement.hs.searshc.com")
public class ItemDetail implements Serializable {

	private static final long serialVersionUID = 4262194558115049546L;
	private String itemNo;
	private String productCd;
	private String startDate;
	private String expireDate;
	private String origExpireDate;
	private String productPlanCd;
	private String serviceLoc;
	private String deductDollarPerc;
	private String purchaseDollarGross;
	private String purchaseDollarDisc;
	private String purchaseDollarNet;
	private String purchaseDollarTax;
	private String coverageMonths;
	private String statusInd;
	private String cancelInd;
	private String cancelDate;
	private String cancelRefundDollar;
	private String cancelTaxDollar;
	private String cancelNo;
	private String employeeDiscAmt;
	private String lastPMCheckDate;
	private String obligorCd;
	private String serialNo;
	private String modelNo;
	private String deliveryRecDate;
	private String purchaseDate;
	private String mdseDesc;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ItemDetail [itemNo=");
		builder.append(itemNo);
		builder.append(", productCd=");
		builder.append(productCd);
		builder.append(", startDate=");
		builder.append(startDate);
		builder.append(", expireDate=");
		builder.append(expireDate);
		builder.append(", origExpireDate=");
		builder.append(origExpireDate);
		builder.append(", productPlanCd=");
		builder.append(productPlanCd);
		builder.append(", serviceLoc=");
		builder.append(serviceLoc);
		builder.append(", deductDollarPerc=");
		builder.append(deductDollarPerc);
		builder.append(", purchaseDollarGross=");
		builder.append(purchaseDollarGross);
		builder.append(", purchaseDollarDisc=");
		builder.append(purchaseDollarDisc);
		builder.append(", purchaseDollarNet=");
		builder.append(purchaseDollarNet);
		builder.append(", purchaseDollarTax=");
		builder.append(purchaseDollarTax);
		builder.append(", coverageMonths=");
		builder.append(coverageMonths);
		builder.append(", statusInd=");
		builder.append(statusInd);
		builder.append(", cancelInd=");
		builder.append(cancelInd);
		builder.append(", cancelDate=");
		builder.append(cancelDate);
		builder.append(", cancelRefundDollar=");
		builder.append(cancelRefundDollar);
		builder.append(", cancelTaxDollar=");
		builder.append(cancelTaxDollar);
		builder.append(", cancelNo=");
		builder.append(cancelNo);
		builder.append(", employeeDiscAmt=");
		builder.append(employeeDiscAmt);
		builder.append(", lastPMCheckDate=");
		builder.append(lastPMCheckDate);
		builder.append(", obligorCd=");
		builder.append(obligorCd);
		builder.append(", serialNo=");
		builder.append(serialNo);
		builder.append(", modelNo=");
		builder.append(modelNo);
		builder.append(", deliveryRecDate=");
		builder.append(deliveryRecDate);
		builder.append(", purchaseDate=");
		builder.append(purchaseDate);
		builder.append(", mdseDesc=");
		builder.append(mdseDesc);
		builder.append("]");
		return builder.toString();
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

	public String getCancelDate() {
		return cancelDate;
	}

	public void setCancelDate(String cancelDate) {
		this.cancelDate = cancelDate;
	}

	public String getCancelInd() {
		return cancelInd;
	}

	public void setCancelInd(String cancelInd) {
		this.cancelInd = cancelInd;
	}

	public String getCancelRefundDollar() {
		return cancelRefundDollar;
	}

	public void setCancelRefundDollar(String cancelRefundDollar) {
		this.cancelRefundDollar = cancelRefundDollar;
	}

	public String getCancelNo() {
		return cancelNo;
	}

	public void setCancelNo(String cancelSfx) {
		this.cancelNo = cancelSfx;
	}

	public String getCancelTaxDollar() {
		return cancelTaxDollar;
	}

	public void setCancelTaxDollar(String cancelTaxDollar) {
		this.cancelTaxDollar = cancelTaxDollar;
	}

	public String getCoverageMonths() {
		return coverageMonths;
	}

	public void setCoverageMonths(String coverageMonths) {
		this.coverageMonths = coverageMonths;
	}

	public String getDeductDollarPerc() {
		return deductDollarPerc;
	}

	public void setDeductDollarPerc(String dedDollarPercent) {
		this.deductDollarPerc = dedDollarPercent;
	}

	public String getDeliveryRecDate() {
		return deliveryRecDate;
	}

	public void setDeliveryRecDate(String deliveryRecDate) {
		this.deliveryRecDate = deliveryRecDate;
	}

	public String getEmployeeDiscAmt() {
		return employeeDiscAmt;
	}

	public void setEmployeeDiscAmt(String discDollarEmployee) {
		this.employeeDiscAmt = discDollarEmployee;
	}

	public String getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}

	public String getItemNo() {
		return itemNo;
	}

	public void setItemNo(String itemSfx) {
		this.itemNo = itemSfx;
	}

	public String getLastPMCheckDate() {
		return lastPMCheckDate;
	}

	public void setLastPMCheckDate(String lastPMCheckDate) {
		this.lastPMCheckDate = lastPMCheckDate;
	}

	public String getMdseDesc() {
		return mdseDesc;
	}

	public void setMdseDesc(String mdseDesc) {
		this.mdseDesc = mdseDesc;
	}

	public String getModelNo() {
		return modelNo;
	}

	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}

	public String getObligorCd() {
		return obligorCd;
	}

	public void setObligorCd(String obligorCd) {
		this.obligorCd = obligorCd;
	}

	public String getOrigExpireDate() {
		return origExpireDate;
	}

	public void setOrigExpireDate(String origExpireDate) {
		this.origExpireDate = origExpireDate;
	}

	public String getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public String getPurchaseDollarDisc() {
		return purchaseDollarDisc;
	}

	public void setPurchaseDollarDisc(String purchaseDollarDisc) {
		this.purchaseDollarDisc = purchaseDollarDisc;
	}

	public String getPurchaseDollarNet() {
		return purchaseDollarNet;
	}

	public void setPurchaseDollarNet(String purchaseDollarNet) {
		this.purchaseDollarNet = purchaseDollarNet;
	}

	public String getPurchaseDollarTax() {
		return purchaseDollarTax;
	}

	public void setPurchaseDollarTax(String purchaseDollarTax) {
		this.purchaseDollarTax = purchaseDollarTax;
	}

	public String getPurchaseDollarGross() {
		return purchaseDollarGross;
	}

	public void setPurchaseDollarGross(String purchaseDollarGross) {
		this.purchaseDollarGross = purchaseDollarGross;
	}

	public String getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public String getServiceLoc() {
		return serviceLoc;
	}

	public void setServiceLoc(String serviceLoc) {
		this.serviceLoc = serviceLoc;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getStatusInd() {
		return statusInd;
	}

	public void setStatusInd(String statusInd) {
		this.statusInd = statusInd;
	}
}
