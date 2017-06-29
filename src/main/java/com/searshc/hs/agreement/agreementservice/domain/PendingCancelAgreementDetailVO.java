package com.searshc.hs.agreement.agreementservice.domain;


public class PendingCancelAgreementDetailVO {

	private String associateId;	
	private String refundNetAmt;
	private String refundTaxAmt;
	private String refundTotalAmt;
	
	public String getAssociateId() {
		return associateId;
	}
	public void setAssociateId(String associateId) {
		this.associateId = associateId;
	}
	public String getRefundNetAmt() {
		return refundNetAmt;
	}
	public void setRefundNetAmt(String refundNetAmt) {
		this.refundNetAmt = refundNetAmt;
	}
	public String getRefundTaxAmt() {
		return refundTaxAmt;
	}
	public void setRefundTaxAmt(String refundTaxAmt) {
		this.refundTaxAmt = refundTaxAmt;
	}
	public String getRefundTotalAmt() {
		return refundTotalAmt;
	}
	public void setRefundTotalAmt(String refundTotalAmt) {
		this.refundTotalAmt = refundTotalAmt;
	}
	
	@Override
	public String toString() {
		return "PendingCancelAgreementDetailVO [associateId=" + associateId
				+ ", refundNetAmt=" + refundNetAmt + ", refundTaxAmt="
				+ refundTaxAmt + ", refundTotalAmt=" + refundTotalAmt + "]";
	}

}
