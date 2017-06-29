package com.searshc.hs.agreement.agreementservice.domain.request;

import java.util.Arrays;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.searshc.hs.agreement.agreementservice.domain.AddPayment;

@XmlRootElement(name = "AddCapRequest")
public class AddCapRequest extends ABaseRequest {

	private String custNum;
	private String agmtSfx = "";
	private String cvrMths = "";
	private String startDate = "";
	private String expireDate = "";
	private String cashDepAmt = "";
	private String grossAmt = "";
	private String discAmt = "";
	private String assocDiscAmt = "";
	private String netAmt = "";
	private String taxAmt = "";
	private String totalAmt = "";
	private String cvrCreditAmt = "";
	private String cvrCreditTaxAmt = "";
	private String deductAmt = "";
	private String prdPlanCd = "";
	private String teleMarketNo;
	private String batchNo;
	private String svcUnit;
	private String purchaseDate;
	private String recEmpNo;
	private String sellEmpNo;
	private String prdCd;
	private String leadType;
	private String leadNo;
	private String locNo;
	private String prtCertifInd; // print certificate indicator
	private String cvgNoDollarInd;
	private String taxExemptInfo;
	private String taxExemptNo;
	private String recUnitNo;
	private String taxGeoCd;
	private String jurisdCountryCd;
	private String jurisdCountrySpecCd;
	private String jurisdCityCd;
	private String jurisdCitySpecCd;
	private String jurisdTransitCd;
	private String jurisdSpecCd;
	private String jurisdOtherCd;
	private String taxCountyCd;
	private String hdrBatchNo;
	private String contactMethodCd;
	private String contactName;
	private String comment1;
	private String comment2;
	private String deleteFl;
	private String adjustNo;
	private String registerNo;
	private String naicb;
	private String contactDate;
	private String triggerCd;
	private String itemsOwned;
	private String leadSubType;
	private String contactNo;
	private String posFl;
	private String prdTypeCd;
	private AddCapItem[] items;
	private List<AddPayment> addPayment;
	protected String capsywrUsePoints;
	protected String capsywrUseDollars;
	// Added for SYW
	private String sywrMemID;

	public AddCapRequest() {
		super();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AddCapRequest [custNum=");
		builder.append(custNum);
		builder.append(", agmtSfx=");
		builder.append(agmtSfx);
		builder.append(", cvrMths=");
		builder.append(cvrMths);
		builder.append(", startDate=");
		builder.append(startDate);
		builder.append(", expireDate=");
		builder.append(expireDate);
		builder.append(", cashDepAmt=");
		builder.append(cashDepAmt);
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
		builder.append(", cvrCreditAmt=");
		builder.append(cvrCreditAmt);
		builder.append(", cvrCreditTaxAmt=");
		builder.append(cvrCreditTaxAmt);
		builder.append(", deductAmt=");
		builder.append(deductAmt);
		builder.append(", prdPlanCd=");
		builder.append(prdPlanCd);
		builder.append(", teleMarketNo=");
		builder.append(teleMarketNo);
		builder.append(", batchNo=");
		builder.append(batchNo);
		builder.append(", svcUnit=");
		builder.append(svcUnit);
		builder.append(", purchaseDate=");
		builder.append(purchaseDate);
		builder.append(", recEmpNo=");
		builder.append(recEmpNo);
		builder.append(", sellEmpNo=");
		builder.append(sellEmpNo);
		builder.append(", prdCd=");
		builder.append(prdCd);
		builder.append(", leadType=");
		builder.append(leadType);
		builder.append(", leadNo=");
		builder.append(leadNo);
		builder.append(", locNo=");
		builder.append(locNo);
		builder.append(", prtCertifInd=");
		builder.append(prtCertifInd);
		builder.append(", cvgNoDollarInd=");
		builder.append(cvgNoDollarInd);
		builder.append(", taxExemptInfo=");
		builder.append(taxExemptInfo);
		builder.append(", taxExemptNo=");
		builder.append(taxExemptNo);
		builder.append(", recUnitNo=");
		builder.append(recUnitNo);
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
		builder.append(", hdrBatchNo=");
		builder.append(hdrBatchNo);
		builder.append(", contactMethodCd=");
		builder.append(contactMethodCd);
		builder.append(", contactName=");
		builder.append(contactName);
		builder.append(", comment1=");
		builder.append(comment1);
		builder.append(", comment2=");
		builder.append(comment2);
		builder.append(", deleteFl=");
		builder.append(deleteFl);
		builder.append(", adjustNo=");
		builder.append(adjustNo);
		builder.append(", registerNo=");
		builder.append(registerNo);
		builder.append(", naicb=");
		builder.append(naicb);
		builder.append(", contactDate=");
		builder.append(contactDate);
		builder.append(", triggerCd=");
		builder.append(triggerCd);
		builder.append(", itemsOwned=");
		builder.append(itemsOwned);
		builder.append(", leadSubType=");
		builder.append(leadSubType);
		builder.append(", contactNo=");
		builder.append(contactNo);
		builder.append(", posFl=");
		builder.append(posFl);
		builder.append(", prdTypeCd=");
		builder.append(prdTypeCd);
		builder.append(", items=");
		builder.append(Arrays.toString(items));
		builder.append(", addPayment=");
		builder.append(addPayment);
		builder.append(", capsywrUsePoints=");
		builder.append(capsywrUsePoints);
		builder.append(", capsywrUseDollars=");
		builder.append(capsywrUseDollars);
		builder.append(", sywrMemID=");
		builder.append(sywrMemID);
		builder.append("]");
		return builder.toString();
	}

	public String getAdjustNo() {
		return adjustNo;
	}

	public void setAdjustNo(String adjustNo) {
		this.adjustNo = adjustNo;
	}

	public String getAgmtSfx() {
		return agmtSfx;
	}

	public void setAgmtSfx(String agmtSfx) {
		this.agmtSfx = agmtSfx;
	}

	public String getAssocDiscAmt() {
		return assocDiscAmt;
	}

	public void setAssocDiscAmt(String assocDiscAmt) {
		this.assocDiscAmt = assocDiscAmt;
	}

	public String getBatchNo() {
		return batchNo;
	}

	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	public String getCashDepAmt() {
		return cashDepAmt;
	}

	public void setCashDepAmt(String cashDepAmt) {
		this.cashDepAmt = cashDepAmt;
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

	public String getContactDate() {
		return contactDate;
	}

	public void setContactDate(String contactDate) {
		this.contactDate = contactDate;
	}

	public String getContactMethodCd() {
		return contactMethodCd;
	}

	public void setContactMethodCd(String contactMethodCd) {
		this.contactMethodCd = contactMethodCd;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getCustNum() {
		return custNum;
	}

	public void setCustNum(String custNum) {
		this.custNum = custNum;
	}

	public String getCvgNoDollarInd() {
		return cvgNoDollarInd;
	}

	public void setCvgNoDollarInd(String cvgNoDollarInd) {
		this.cvgNoDollarInd = cvgNoDollarInd;
	}

	public String getCvrCreditAmt() {
		return cvrCreditAmt;
	}

	public void setCvrCreditAmt(String cvrCreditAmt) {
		this.cvrCreditAmt = cvrCreditAmt;
	}

	public String getCvrCreditTaxAmt() {
		return cvrCreditTaxAmt;
	}

	public void setCvrCreditTaxAmt(String cvrCreditTaxAmt) {
		this.cvrCreditTaxAmt = cvrCreditTaxAmt;
	}

	public String getCvrMths() {
		return cvrMths;
	}

	public void setCvrMths(String cvrMths) {
		this.cvrMths = cvrMths;
	}

	public String getDeductAmt() {
		return deductAmt;
	}

	public void setDeductAmt(String deductAmt) {
		this.deductAmt = deductAmt;
	}

	public String getDeleteFl() {
		return deleteFl;
	}

	public void setDeleteFl(String deleteFl) {
		this.deleteFl = deleteFl;
	}

	public String getDiscAmt() {
		return discAmt;
	}

	public void setDiscAmt(String discAmt) {
		this.discAmt = discAmt;
	}

	public String getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}

	public String getGrossAmt() {
		return grossAmt;
	}

	public void setGrossAmt(String grossAmt) {
		this.grossAmt = grossAmt;
	}

	public String getHdrBatchNo() {
		return hdrBatchNo;
	}

	public void setHdrBatchNo(String hdrBatchNo) {
		this.hdrBatchNo = hdrBatchNo;
	}

	public AddCapItem[] getItems() {
		return items;
	}

	public void setItems(AddCapItem[] items) {
		this.items = items;
	}

	public String getItemsOwned() {
		return itemsOwned;
	}

	public void setItemsOwned(String itemsOwned) {
		this.itemsOwned = itemsOwned;
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

	public String getLeadNo() {
		return leadNo;
	}

	public void setLeadNo(String leadNo) {
		this.leadNo = leadNo;
	}

	public String getLeadSubType() {
		return leadSubType;
	}

	public void setLeadSubType(String leadSubType) {
		this.leadSubType = leadSubType;
	}

	public String getLeadType() {
		return leadType;
	}

	public void setLeadType(String leadType) {
		this.leadType = leadType;
	}

	public String getLocNo() {
		return locNo;
	}

	public void setLocNo(String locNo) {
		this.locNo = locNo;
	}

	public String getNaicb() {
		return naicb;
	}

	public void setNaicb(String naicb) {
		this.naicb = naicb;
	}

	public String getNetAmt() {
		return netAmt;
	}

	public void setNetAmt(String netAmt) {
		this.netAmt = netAmt;
	}

	public String getPosFl() {
		return posFl;
	}

	public void setPosFl(String posFl) {
		this.posFl = posFl;
	}

	public String getPrdCd() {
		return prdCd;
	}

	public void setPrdCd(String prdCd) {
		this.prdCd = prdCd;
	}

	public String getPrdPlanCd() {
		return prdPlanCd;
	}

	public void setPrdPlanCd(String prdPlanCd) {
		this.prdPlanCd = prdPlanCd;
	}

	public String getPrtCertifInd() {
		return prtCertifInd;
	}

	public void setPrtCertifInd(String prtCertifInd) {
		this.prtCertifInd = prtCertifInd;
	}

	public String getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(String purchaseDate) {
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

	public String getRegisterNo() {
		return registerNo;
	}

	public void setRegisterNo(String registerNo) {
		this.registerNo = registerNo;
	}


	public String getSellEmpNo() {
		return sellEmpNo;
	}

	public void setSellEmpNo(String sellEmpNo) {
		this.sellEmpNo = sellEmpNo;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getSvcUnit() {
		return svcUnit;
	}

	public void setSvcUnit(String svcUnit) {
		this.svcUnit = svcUnit;
	}

	public String getTaxAmt() {
		return taxAmt;
	}

	public void setTaxAmt(String taxAmt) {
		this.taxAmt = taxAmt;
	}

	public String getTaxCountyCd() {
		return taxCountyCd;
	}

	public void setTaxCountyCd(String taxCountyCd) {
		this.taxCountyCd = taxCountyCd;
	}

	public String getTaxExemptInfo() {
		return taxExemptInfo;
	}

	public void setTaxExemptInfo(String taxExemptInfo) {
		this.taxExemptInfo = taxExemptInfo;
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

	public String getTeleMarketNo() {
		return teleMarketNo;
	}

	public void setTeleMarketNo(String teleMarketNo) {
		this.teleMarketNo = teleMarketNo;
	}

	public String getTotalAmt() {
		return totalAmt;
	}

	public void setTotalAmt(String totalAmt) {
		this.totalAmt = totalAmt;
	}

	public String getTriggerCd() {
		return triggerCd;
	}

	public void setTriggerCd(String triggerCd) {
		this.triggerCd = triggerCd;
	}

	public String getPrdTypeCd() {
		return prdTypeCd;
	}

	public void setPrdTypeCd(String prdTypeCd) {
		this.prdTypeCd = prdTypeCd;
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

	public List<AddPayment> getAddPayment() {
		return addPayment;
	}

	public void setAddPayment(List<AddPayment> addPayment) {
		this.addPayment = addPayment;
	}

	public String getCapsywrUsePoints() {
		return capsywrUsePoints;
	}

	public void setCapsywrUsePoints(String capsywrUsePoints) {
		this.capsywrUsePoints = capsywrUsePoints;
	}

	public String getCapsywrUseDollars() {
		return capsywrUseDollars;
	}

	public void setCapsywrUseDollars(String capsywrUseDollars) {
		this.capsywrUseDollars = capsywrUseDollars;
	}
	
	

}
