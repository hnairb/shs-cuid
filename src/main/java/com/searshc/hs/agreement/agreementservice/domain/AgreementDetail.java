package com.searshc.hs.agreement.agreementservice.domain;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "AgreementDetail", namespace = "http://domain.agreementservice.agreement.hs.searshc.com")
public class AgreementDetail implements Serializable {

	private static final long serialVersionUID = 3832159842224778490L;
	private String itemCnt;
	private String productCd;
	private String leadType;
	private String campaignId;
	private String subLeadCat;
	private String productPlanCd;
	private String productType;
	private String cancelInd;
	private String startDate;
	private String expireDate;
	private String origExpireDate;
	private String chargeBackInd;
	private String empActSale;
	private String unitActSale;
	private String marketUnitActSale;
	private String unitAllocSale;
	private String unitPosSale;
	private String unitNps;
	private String empNps;
	private String apUpdateAuthInd;
	private String purchaseDate;
	private String sellingPrice;
	private String planDiscAmt;
	private String capDiscAmt;
	private String campaignDiscAmt;
	private String empDiscAmt;
	private String otherDiscInd;
	private String otherDiscAmt;
	private String purchaseAmt;
	private String purchaseTaxAmt;
	private String coverageMonths;
	private String monthAmt;
	private String monthTaxAmt;
	private String refundAmt;
	private String refundTaxAmt;
	private String contactMethodInd;
	private String purchaser;
	private String paymentMethodInd;
	private String paymentTypeInd;
	private String creditAmt;
	private String cashAmt;
	private String cashRcvdAmt;
	private String allowCd;
	private String allowAmt;
	private String couponCd;
	private String couponTaxInd;
	private String couponAmt;
	private String billAddrLocNo;
	private String billContactRecNo;
	private String taxRefundInd;
	private String priceOriginInd;
	private String addlCharge;
	private String coverCreditAmt;
	private String refundCoverCreditAmt;
	private String coverNoDollarInd;
	private String coverCreditTaxAmt;
	private String refundTaxCreditAmt;
	private String addlAmtAddItems;
	private String locNo;
	private String taxExemptData;
	private String taxGeoCd;
	private String jurisdCountryCd;
	private String jurisdCountrySpecCd;
	private String jurisdCityCd;
	private String jurisdCitySpecCd;
	private String jurisdTransitCd;
	private String jurisdSpecCd;
	private String jurisdOtherCd;
	private String taxCountyCd;
	private String contactName;
	private String comment1;
	private String comment2;
	private String comment3;
	private String posFl;
	private String transNo;
	private String transDate;
	private String registerNo;
	private String salesMarketUnitNo;

	// Added for SYW
	private String sywrMemID;

	private int updateCnt;
	private UpdateDetail[] updates = null;
	private List<SYWRTransDtls> sywrTrans;
	private List<AgreementAddPayDtls> agreePayment;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AgreementDetail [itemCnt=");
		builder.append(itemCnt);
		builder.append(", productCd=");
		builder.append(productCd);
		builder.append(", leadType=");
		builder.append(leadType);
		builder.append(", campaignId=");
		builder.append(campaignId);
		builder.append(", subLeadCat=");
		builder.append(subLeadCat);
		builder.append(", productPlanCd=");
		builder.append(productPlanCd);
		builder.append(", productType=");
		builder.append(productType);
		builder.append(", cancelInd=");
		builder.append(cancelInd);
		builder.append(", startDate=");
		builder.append(startDate);
		builder.append(", expireDate=");
		builder.append(expireDate);
		builder.append(", origExpireDate=");
		builder.append(origExpireDate);
		builder.append(", chargeBackInd=");
		builder.append(chargeBackInd);
		builder.append(", empActSale=");
		builder.append(empActSale);
		builder.append(", unitActSale=");
		builder.append(unitActSale);
		builder.append(", marketUnitActSale=");
		builder.append(marketUnitActSale);
		builder.append(", unitAllocSale=");
		builder.append(unitAllocSale);
		builder.append(", unitPosSale=");
		builder.append(unitPosSale);
		builder.append(", unitNps=");
		builder.append(unitNps);
		builder.append(", empNps=");
		builder.append(empNps);
		builder.append(", apUpdateAuthInd=");
		builder.append(apUpdateAuthInd);
		builder.append(", purchaseDate=");
		builder.append(purchaseDate);
		builder.append(", sellingPrice=");
		builder.append(sellingPrice);
		builder.append(", planDiscAmt=");
		builder.append(planDiscAmt);
		builder.append(", capDiscAmt=");
		builder.append(capDiscAmt);
		builder.append(", campaignDiscAmt=");
		builder.append(campaignDiscAmt);
		builder.append(", empDiscAmt=");
		builder.append(empDiscAmt);
		builder.append(", otherDiscInd=");
		builder.append(otherDiscInd);
		builder.append(", otherDiscAmt=");
		builder.append(otherDiscAmt);
		builder.append(", purchaseAmt=");
		builder.append(purchaseAmt);
		builder.append(", purchaseTaxAmt=");
		builder.append(purchaseTaxAmt);
		builder.append(", coverageMonths=");
		builder.append(coverageMonths);
		builder.append(", monthAmt=");
		builder.append(monthAmt);
		builder.append(", monthTaxAmt=");
		builder.append(monthTaxAmt);
		builder.append(", refundAmt=");
		builder.append(refundAmt);
		builder.append(", refundTaxAmt=");
		builder.append(refundTaxAmt);
		builder.append(", contactMethodInd=");
		builder.append(contactMethodInd);
		builder.append(", purchaser=");
		builder.append(purchaser);
		builder.append(", paymentMethodInd=");
		builder.append(paymentMethodInd);
		builder.append(", paymentTypeInd=");
		builder.append(paymentTypeInd);
		builder.append(", creditAmt=");
		builder.append(creditAmt);
		builder.append(", cashAmt=");
		builder.append(cashAmt);
		builder.append(", cashRcvdAmt=");
		builder.append(cashRcvdAmt);
		builder.append(", allowCd=");
		builder.append(allowCd);
		builder.append(", allowAmt=");
		builder.append(allowAmt);
		builder.append(", couponCd=");
		builder.append(couponCd);
		builder.append(", couponTaxInd=");
		builder.append(couponTaxInd);
		builder.append(", couponAmt=");
		builder.append(couponAmt);
		builder.append(", billAddrLocNo=");
		builder.append(billAddrLocNo);
		builder.append(", billContactRecNo=");
		builder.append(billContactRecNo);
		builder.append(", taxRefundInd=");
		builder.append(taxRefundInd);
		builder.append(", priceOriginInd=");
		builder.append(priceOriginInd);
		builder.append(", addlCharge=");
		builder.append(addlCharge);
		builder.append(", coverCreditAmt=");
		builder.append(coverCreditAmt);
		builder.append(", refundCoverCreditAmt=");
		builder.append(refundCoverCreditAmt);
		builder.append(", coverNoDollarInd=");
		builder.append(coverNoDollarInd);
		builder.append(", coverCreditTaxAmt=");
		builder.append(coverCreditTaxAmt);
		builder.append(", refundTaxCreditAmt=");
		builder.append(refundTaxCreditAmt);
		builder.append(", addlAmtAddItems=");
		builder.append(addlAmtAddItems);
		builder.append(", locNo=");
		builder.append(locNo);
		builder.append(", taxExemptData=");
		builder.append(taxExemptData);
		builder.append(", taxGeoCd=");
		builder.append(taxGeoCd);
		builder.append(", jurisdCountryCd=");
		builder.append(jurisdCountryCd);
		builder.append(", jurisdCountrySpecCd=");
		builder.append(jurisdCountrySpecCd);
		builder.append(", jurisdCityCd=");
		builder.append(jurisdCityCd);
		builder.append(", jurisdCitySpecCd=");
		builder.append(jurisdCitySpecCd);
		builder.append(", jurisdTransitCd=");
		builder.append(jurisdTransitCd);
		builder.append(", jurisdSpecCd=");
		builder.append(jurisdSpecCd);
		builder.append(", jurisdOtherCd=");
		builder.append(jurisdOtherCd);
		builder.append(", taxCountyCd=");
		builder.append(taxCountyCd);
		builder.append(", contactName=");
		builder.append(contactName);
		builder.append(", comment1=");
		builder.append(comment1);
		builder.append(", comment2=");
		builder.append(comment2);
		builder.append(", comment3=");
		builder.append(comment3);
		builder.append(", posFl=");
		builder.append(posFl);
		builder.append(", transNo=");
		builder.append(transNo);
		builder.append(", transDate=");
		builder.append(transDate);
		builder.append(", registerNo=");
		builder.append(registerNo);
		builder.append(", salesMarketUnitNo=");
		builder.append(salesMarketUnitNo);
		builder.append(", sywrMemID=");
		builder.append(sywrMemID);
		builder.append(", updateCnt=");
		builder.append(updateCnt);
		builder.append(", updates=");
		builder.append(Arrays.toString(updates));
		builder.append(", sywrTrans=");
		builder.append(sywrTrans);
		builder.append(", agreePayment=");
		builder.append(agreePayment);
		builder.append("]");
		return builder.toString();
	}

	public String getAddlCharge() {
		return addlCharge;
	}

	public void setAddlCharge(String addlCharge) {
		this.addlCharge = addlCharge;
	}

	public String getAddlAmtAddItems() {
		return addlAmtAddItems;
	}

	public void setAddlAmtAddItems(String addltAmtAddItems) {
		this.addlAmtAddItems = addltAmtAddItems;
	}

	public String getAllowAmt() {
		return allowAmt;
	}

	public void setAllowAmt(String allowAmt) {
		this.allowAmt = allowAmt;
	}

	public String getAllowCd() {
		return allowCd;
	}

	public void setAllowCd(String allowCd) {
		this.allowCd = allowCd;
	}

	public String getPurchaseTaxAmt() {
		return purchaseTaxAmt;
	}

	public void setPurchaseTaxAmt(String apPurchaseAmt) {
		this.purchaseTaxAmt = apPurchaseAmt;
	}

	public String getApUpdateAuthInd() {
		return apUpdateAuthInd;
	}

	public void setApUpdateAuthInd(String apUpdateAuthInd) {
		this.apUpdateAuthInd = apUpdateAuthInd;
	}

	public String getBillAddrLocNo() {
		return billAddrLocNo;
	}

	public void setBillAddrLocNo(String billAddrLocNo) {
		this.billAddrLocNo = billAddrLocNo;
	}

	public String getBillContactRecNo() {
		return billContactRecNo;
	}

	public void setBillContactRecNo(String billContactRecNo) {
		this.billContactRecNo = billContactRecNo;
	}

	public String getCampaignDiscAmt() {
		return campaignDiscAmt;
	}

	public void setCampaignDiscAmt(String campaignDiscAmt) {
		this.campaignDiscAmt = campaignDiscAmt;
	}

	public String getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(String campaignId) {
		this.campaignId = campaignId;
	}

	public String getCancelInd() {
		return cancelInd;
	}

	public void setCancelInd(String cancelInd) {
		this.cancelInd = cancelInd;
	}

	public String getCapDiscAmt() {
		return capDiscAmt;
	}

	public void setCapDiscAmt(String capDiscAmt) {
		this.capDiscAmt = capDiscAmt;
	}

	public String getCashAmt() {
		return cashAmt;
	}

	public void setCashAmt(String cashAmt) {
		this.cashAmt = cashAmt;
	}

	public String getCashRcvdAmt() {
		return cashRcvdAmt;
	}

	public void setCashRcvdAmt(String cashRcvdAmt) {
		this.cashRcvdAmt = cashRcvdAmt;
	}

	public String getChargeBackInd() {
		return chargeBackInd;
	}

	public void setChargeBackInd(String chargeBackInd) {
		this.chargeBackInd = chargeBackInd;
	}

	public String getComment1() {
		return comment1;
	}

	public void setComment1(String comment1) {
		this.comment1 = comment1;
	}

	public String getComment2() {
		return comment2;
	}

	public void setComment2(String comment2) {
		this.comment2 = comment2;
	}

	public String getComment3() {
		return comment3;
	}

	public void setComment3(String comment3) {
		this.comment3 = comment3;
	}

	public String getContactMethodInd() {
		return contactMethodInd;
	}

	public void setContactMethodInd(String contactMethodInd) {
		this.contactMethodInd = contactMethodInd;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getCouponAmt() {
		return couponAmt;
	}

	public void setCouponAmt(String couponAmt) {
		this.couponAmt = couponAmt;
	}

	public String getCouponCd() {
		return couponCd;
	}

	public void setCouponCd(String couponCd) {
		this.couponCd = couponCd;
	}

	public String getCouponTaxInd() {
		return couponTaxInd;
	}

	public void setCouponTaxInd(String couponTaxInd) {
		this.couponTaxInd = couponTaxInd;
	}

	public String getCoverageMonths() {
		return coverageMonths;
	}

	public void setCoverageMonths(String coverageMonths) {
		this.coverageMonths = coverageMonths;
	}

	public String getCoverCreditAmt() {
		return coverCreditAmt;
	}

	public void setCoverCreditAmt(String coverCreditAmt) {
		this.coverCreditAmt = coverCreditAmt;
	}

	public String getCoverNoDollarInd() {
		return coverNoDollarInd;
	}

	public void setCoverNoDollarInd(String coverNoDollarInd) {
		this.coverNoDollarInd = coverNoDollarInd;
	}

	public String getCoverCreditTaxAmt() {
		return coverCreditTaxAmt;
	}

	public void setCoverCreditTaxAmt(String coverTaxCreditAmt) {
		this.coverCreditTaxAmt = coverTaxCreditAmt;
	}

	public String getCreditAmt() {
		return creditAmt;
	}

	public void setCreditAmt(String creditAmt) {
		this.creditAmt = creditAmt;
	}

	public String getEmpActSale() {
		return empActSale;
	}

	public void setEmpActSale(String empActSale) {
		this.empActSale = empActSale;
	}

	public String getEmpDiscAmt() {
		return empDiscAmt;
	}

	public void setEmpDiscAmt(String empDiscAmt) {
		this.empDiscAmt = empDiscAmt;
	}

	public String getEmpNps() {
		return empNps;
	}

	public void setEmpNps(String empNps) {
		this.empNps = empNps;
	}

	public String getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}

	public String getItemCnt() {
		return itemCnt;
	}

	public void setItemCnt(String itemCnt) {
		this.itemCnt = itemCnt;
	}

	public String getJurisdCityCd() {
		return jurisdCityCd;
	}

	public void setJurisdCityCd(String jurisdCityCd) {
		this.jurisdCityCd = jurisdCityCd;
	}

	public String getJurisdCitySpecCd() {
		return jurisdCitySpecCd;
	}

	public void setJurisdCitySpecCd(String jurisdCitySpecCd) {
		this.jurisdCitySpecCd = jurisdCitySpecCd;
	}

	public String getJurisdCountryCd() {
		return jurisdCountryCd;
	}

	public void setJurisdCountryCd(String jurisdCountryCd) {
		this.jurisdCountryCd = jurisdCountryCd;
	}

	public String getJurisdCountrySpecCd() {
		return jurisdCountrySpecCd;
	}

	public void setJurisdCountrySpecCd(String jurisdCountrySpecCd) {
		this.jurisdCountrySpecCd = jurisdCountrySpecCd;
	}

	public String getJurisdOtherCd() {
		return jurisdOtherCd;
	}

	public void setJurisdOtherCd(String jurisdOtherCd) {
		this.jurisdOtherCd = jurisdOtherCd;
	}

	public String getJurisdSpecCd() {
		return jurisdSpecCd;
	}

	public void setJurisdSpecCd(String jurisdSpecCd) {
		this.jurisdSpecCd = jurisdSpecCd;
	}

	public String getJurisdTransitCd() {
		return jurisdTransitCd;
	}

	public void setJurisdTransitCd(String jurisdTransitCd) {
		this.jurisdTransitCd = jurisdTransitCd;
	}

	public String getLeadType() {
		return leadType;
	}

	public void setLeadType(String leadType) {
		this.leadType = leadType;
	}

	public String getMarketUnitActSale() {
		return marketUnitActSale;
	}

	public void setMarketUnitActSale(String marketUnitActSale) {
		this.marketUnitActSale = marketUnitActSale;
	}

	public String getMonthAmt() {
		return monthAmt;
	}

	public void setMonthAmt(String monthAmt) {
		this.monthAmt = monthAmt;
	}

	public String getMonthTaxAmt() {
		return monthTaxAmt;
	}

	public void setMonthTaxAmt(String monthTaxAmt) {
		this.monthTaxAmt = monthTaxAmt;
	}

	public String getOrigExpireDate() {
		return origExpireDate;
	}

	public void setOrigExpireDate(String origExpireDate) {
		this.origExpireDate = origExpireDate;
	}

	public String getOtherDiscAmt() {
		return otherDiscAmt;
	}

	public void setOtherDiscAmt(String otherDiscAmt) {
		this.otherDiscAmt = otherDiscAmt;
	}

	public String getOtherDiscInd() {
		return otherDiscInd;
	}

	public void setOtherDiscInd(String otherDiscInd) {
		this.otherDiscInd = otherDiscInd;
	}

	public String getPaymentMethodInd() {
		return paymentMethodInd;
	}

	public void setPaymentMethodInd(String paymentMethodInd) {
		this.paymentMethodInd = paymentMethodInd;
	}

	public String getPaymentTypeInd() {
		return paymentTypeInd;
	}

	public void setPaymentTypeInd(String paymentTypeInd) {
		this.paymentTypeInd = paymentTypeInd;
	}

	public String getPlanDiscAmt() {
		return planDiscAmt;
	}

	public void setPlanDiscAmt(String planDiscAmt) {
		this.planDiscAmt = planDiscAmt;
	}

	public String getPosFl() {
		return posFl;
	}

	public void setPosFl(String posFl) {
		this.posFl = posFl;
	}

	public String getPriceOriginInd() {
		return priceOriginInd;
	}

	public void setPriceOriginInd(String priceOriginInd) {
		this.priceOriginInd = priceOriginInd;
	}

	public String getProductCd() {
		return productCd;
	}

	public void setProductCd(String productCd) {
		this.productCd = productCd;
	}

	public String getProductPlanCd() {
		return productPlanCd;
	}

	public void setProductPlanCd(String productPlanCd) {
		this.productPlanCd = productPlanCd;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public String getPurchaseAmt() {
		return purchaseAmt;
	}

	public void setPurchaseAmt(String purchaseNetDollar) {
		this.purchaseAmt = purchaseNetDollar;
	}

	public String getPurchaser() {
		return purchaser;
	}

	public void setPurchaser(String purchaser) {
		this.purchaser = purchaser;
	}

	public String getRefundAmt() {
		return refundAmt;
	}

	public void setRefundAmt(String refundAmt) {
		this.refundAmt = refundAmt;
	}

	public String getRefundCoverCreditAmt() {
		return refundCoverCreditAmt;
	}

	public void setRefundCoverCreditAmt(String refundCoverCreditAmt) {
		this.refundCoverCreditAmt = refundCoverCreditAmt;
	}

	public String getRefundTaxAmt() {
		return refundTaxAmt;
	}

	public void setRefundTaxAmt(String refundTaxAmt) {
		this.refundTaxAmt = refundTaxAmt;
	}

	public String getRefundTaxCreditAmt() {
		return refundTaxCreditAmt;
	}

	public void setRefundTaxCreditAmt(String refundTaxCreditAmt) {
		this.refundTaxCreditAmt = refundTaxCreditAmt;
	}

	public String getRegisterNo() {
		return registerNo;
	}

	public void setRegisterNo(String registerNo) {
		this.registerNo = registerNo;
	}

	public String getSalesMarketUnitNo() {
		return salesMarketUnitNo;
	}

	public void setSalesMarketUnitNo(String salesMarketUntiNo) {
		this.salesMarketUnitNo = salesMarketUntiNo;
	}

	public String getSellingPrice() {
		return sellingPrice;
	}

	public void setSellingPrice(String sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getSubLeadCat() {
		return subLeadCat;
	}

	public void setSubLeadCat(String subLeadCat) {
		this.subLeadCat = subLeadCat;
	}

	public String getTaxCountyCd() {
		return taxCountyCd;
	}

	public void setTaxCountyCd(String taxCountyCd) {
		this.taxCountyCd = taxCountyCd;
	}

	public String getTaxExemptData() {
		return taxExemptData;
	}

	public void setTaxExemptData(String taxExemptData) {
		this.taxExemptData = taxExemptData;
	}

	public String getTaxGeoCd() {
		return taxGeoCd;
	}

	public void setTaxGeoCd(String taxGeoCd) {
		this.taxGeoCd = taxGeoCd;
	}

	public String getTaxRefundInd() {
		return taxRefundInd;
	}

	public void setTaxRefundInd(String taxRefundInd) {
		this.taxRefundInd = taxRefundInd;
	}

	public String getTransDate() {
		return transDate;
	}

	public void setTransDate(String transDate) {
		this.transDate = transDate;
	}

	public String getTransNo() {
		return transNo;
	}

	public void setTransNo(String transNo) {
		this.transNo = transNo;
	}

	public String getUnitActSale() {
		return unitActSale;
	}

	public void setUnitActSale(String unitActSale) {
		this.unitActSale = unitActSale;
	}

	public String getUnitNps() {
		return unitNps;
	}

	public void setUnitNps(String unitNps) {
		this.unitNps = unitNps;
	}

	public String getUnitPosSale() {
		return unitPosSale;
	}

	public void setUnitPosSale(String unitPosSale) {
		this.unitPosSale = unitPosSale;
	}

	public String getUnitAllocSale() {
		return unitAllocSale;
	}

	public void setUnitAllocSale(String unitSaleAlloc) {
		this.unitAllocSale = unitSaleAlloc;
	}

	public UpdateDetail[] getUpdates() {
		return updates;
	}

	public void setUpdates(UpdateDetail[] updates) {
		this.updates = updates;
	}

	public int getUpdateCnt() {
		return updateCnt;
	}

	public void setUpdateCnt(int updateCnt) {
		this.updateCnt = updateCnt;
	}

	public String getLocNo() {
		return locNo;
	}

	public void setLocNo(String locNo) {
		this.locNo = locNo;
	}

	/**
	 * @return the SywrMemID
	 */
	public String getSywrMemID() {
		return sywrMemID;
	}

	/**
	 * @param sywrMemID
	 *            the sywrMemID to set
	 */
	public void setSywrMemID(String sywrMemID) {
		this.sywrMemID = sywrMemID;
	}

	public List<SYWRTransDtls> getSywrTrans() {
		return sywrTrans;
	}

	public void setSywrTrans(List<SYWRTransDtls> sywrTrans) {
		this.sywrTrans = sywrTrans;
	}

	public List<AgreementAddPayDtls> getAgreePayment() {
		return agreePayment;
	}

	public void setAgreePayment(List<AgreementAddPayDtls> agreePayment) {
		this.agreePayment = agreePayment;
	}

}
