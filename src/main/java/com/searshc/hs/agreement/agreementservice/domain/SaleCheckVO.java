package com.searshc.hs.agreement.agreementservice.domain;


public class SaleCheckVO {

	private String saleUnit;	
	private String saleRegNo;
	private String posTransNo;
	
	public String getSaleUnit() {
		return saleUnit;
	}
	public void setSaleUnit(String saleUnit) {
		this.saleUnit = saleUnit;
	}
	public String getSaleRegNo() {
		return saleRegNo;
	}
	public void setSaleRegNo(String saleRegNo) {
		this.saleRegNo = saleRegNo;
	}
	public String getPosTransNo() {
		return posTransNo;
	}
	public void setPosTransNo(String posTransNo) {
		this.posTransNo = posTransNo;
	}
	
	@Override
	public String toString() {
		return "SaleCheckVO [posTransNo=" + posTransNo + ", saleRegNo="
				+ saleRegNo + ", saleUnit=" + saleUnit + "]";
	}

}
