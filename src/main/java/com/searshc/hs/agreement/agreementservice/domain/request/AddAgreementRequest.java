package com.searshc.hs.agreement.agreementservice.domain.request;

import java.util.Arrays;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.searshc.hs.agreement.agreementservice.domain.AddItem;
import com.searshc.hs.agreement.agreementservice.domain.AddPayment;

@XmlRootElement(name = "AddAgreementRequest")
public class AddAgreementRequest extends ABaseRequest {

	private String custNum;
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
	private String prtCertifInd;	//print certificate indicator
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
	
	private AddItem[] items;
	
//	Added for SYW
	private String sywrMemID;
	
	private String npjxtcdFlg;
	private String oriStrNo;
	private String oriRegNo;
	private String oriTranNo;
	private String oriTranDt;
	private String oriMscAcnNo;
	private String oriItmNo;
	private String oriFiller;
	private String capsywrUsePoints;
	private String capsywrUseDollars;

    
    private List<AddPayment> addPayment;
		
	public AddAgreementRequest() {
		super();
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AddAgreementRequest [custNum=");
		builder.append(custNum);
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
		builder.append(", items=");
		builder.append(Arrays.toString(items));
		builder.append(", sywrMemID=");
		builder.append(sywrMemID);
		builder.append(", npjxtcdFlg=");
		builder.append(npjxtcdFlg);
		builder.append(", oriStrNo=");
		builder.append(oriStrNo);
		builder.append(", oriRegNo=");
		builder.append(oriRegNo);
		builder.append(", oriTranNo=");
		builder.append(oriTranNo);
		builder.append(", oriTranDt=");
		builder.append(oriTranDt);
		builder.append(", oriMscAcnNo=");
		builder.append(oriMscAcnNo);
		builder.append(", oriItmNo=");
		builder.append(oriItmNo);
		builder.append(", oriFiller=");
		builder.append(oriFiller);
		builder.append(", capsywrUsePoints=");
		builder.append(capsywrUsePoints);
		builder.append(", capsywrUseDollars=");
		builder.append(capsywrUseDollars);
		builder.append(", addPayment=");
		builder.append(addPayment);
		builder.append("]");
		return builder.toString();
	}

	public String getAdjustNo() {
		return adjustNo;
	}

	public void setAdjustNo(String adjustNo) {
		this.adjustNo = adjustNo;
	}

	public String getBatchNo() {
		return batchNo;
	}

	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
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

	

	public String getDeleteFl() {
		return deleteFl;
	}

	public void setDeleteFl(String deleteFl) {
		this.deleteFl = deleteFl;
	}

	public String getHdrBatchNo() {
		return hdrBatchNo;
	}

	public void setHdrBatchNo(String headerBatchNo) {
		this.hdrBatchNo = headerBatchNo;
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

	public void setNaicb(String naicbInd) {
		this.naicb = naicbInd;
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

	public void setPrdCd(String productCd) {
		this.prdCd = productCd;
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

	public void setRecEmpNo(String recordEmpNo) {
		this.recEmpNo = recordEmpNo;
	}

	public String getRecUnitNo() {
		return recUnitNo;
	}

	public void setRecUnitNo(String recordUnitNo) {
		this.recUnitNo = recordUnitNo;
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

	public String getSvcUnit() {
		return svcUnit;
	}

	public void setSvcUnit(String serviceUnit) {
		this.svcUnit = serviceUnit;
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

	public String getTriggerCd() {
		return triggerCd;
	}

	public void setTriggerCd(String triggerCd) {
		this.triggerCd = triggerCd;
	}

	

	public AddItem[] getItems() {
		return items; 
	}

	public void setItems(AddItem[] items) {
		this.items = items;
	}

	
	
	/**
	 * @return the SywrMemID
	 */
	public String getSywrMemID() {
		return sywrMemID;
	}

	
	/**
	 * @param sywrMemID the sywrMemID to set
	 */
	public void setSywrMemID(
			String sywrMemID) {
		this.sywrMemID = sywrMemID;
	}

	public String getNpjxtcdFlg() {
		return npjxtcdFlg;
	}

	public void setNpjxtcdFlg(String npjxtcdFlg) {
		this.npjxtcdFlg = npjxtcdFlg;
	}

	public String getOriStrNo() {
		return oriStrNo;
	}

	public void setOriStrNo(String oriStrNo) {
		this.oriStrNo = oriStrNo;
	}

	public String getOriRegNo() {
		return oriRegNo;
	}

	public void setOriRegNo(String oriRegNo) {
		this.oriRegNo = oriRegNo;
	}

	public String getOriTranNo() {
		return oriTranNo;
	}

	public void setOriTranNo(String oriTranNo) {
		this.oriTranNo = oriTranNo;
	}

	public String getOriTranDt() {
		return oriTranDt;
	}

	public void setOriTranDt(String oriTranDt) {
		this.oriTranDt = oriTranDt;
	}

	public String getOriMscAcnNo() {
		return oriMscAcnNo;
	}

	public void setOriMscAcnNo(String oriMscAcnNo) {
		this.oriMscAcnNo = oriMscAcnNo;
	}

	public String getOriItmNo() {
		return oriItmNo;
	}

	public void setOriItmNo(String oriItmNo) {
		this.oriItmNo = oriItmNo;
	}

	public String getOriFiller() {
		return oriFiller;
	}

	public void setOriFiller(String oriFiller) {
		this.oriFiller = oriFiller;
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

	

	public List<AddPayment> getAddPayment() {
		return addPayment;
	}

	public void setAddPayment(List<AddPayment> addPayment) {
		this.addPayment = addPayment;
	}
	
	
	
	
	
}
