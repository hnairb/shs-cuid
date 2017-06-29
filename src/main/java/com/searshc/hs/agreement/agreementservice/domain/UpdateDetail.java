package com.searshc.hs.agreement.agreementservice.domain;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "UpdateDetail", namespace = "http://domain.agreementservice.agreement.hs.searshc.com")
public class UpdateDetail implements Serializable {

	private static final long serialVersionUID = 1911069404735292292L;
	private String adjustId;
	private String adjustTs;
	private String adjustType;
	private String refundType;
	private String refundMth;
	private String checkNo;
	private String nonRefundDollarAmt;
	private String refundTaxAmt;
	private String cancelReason;
	private String canceller;
	private String recordCancelEmp;
	private String recordCancelUnit;
	private String callCancelEmp;
	private String callCancelUnit;
	private String adjustNote;
	private String adjustReason;
	private String posTransNo;
	private String posTransDate;
	private String posRegisterNo;
	private String marketUnNo;
	private String totalRefundDollarAmt;
	private String totalRefundTaxAmt;
	private List<UpdateDetailPayment> updateDetailPayment;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UpdateDetail [adjustId=");
		builder.append(adjustId);
		builder.append(", adjustTs=");
		builder.append(adjustTs);
		builder.append(", adjustType=");
		builder.append(adjustType);
		builder.append(", refundType=");
		builder.append(refundType);
		builder.append(", refundMth=");
		builder.append(refundMth);
		builder.append(", checkNo=");
		builder.append(checkNo);
		builder.append(", nonRefundDollarAmt=");
		builder.append(nonRefundDollarAmt);
		builder.append(", refundTaxAmt=");
		builder.append(refundTaxAmt);
		builder.append(", cancelReason=");
		builder.append(cancelReason);
		builder.append(", canceller=");
		builder.append(canceller);
		builder.append(", recordCancelEmp=");
		builder.append(recordCancelEmp);
		builder.append(", recordCancelUnit=");
		builder.append(recordCancelUnit);
		builder.append(", callCancelEmp=");
		builder.append(callCancelEmp);
		builder.append(", callCancelUnit=");
		builder.append(callCancelUnit);
		builder.append(", adjustNote=");
		builder.append(adjustNote);
		builder.append(", adjustReason=");
		builder.append(adjustReason);
		builder.append(", posTransNo=");
		builder.append(posTransNo);
		builder.append(", posTransDate=");
		builder.append(posTransDate);
		builder.append(", posRegisterNo=");
		builder.append(posRegisterNo);
		builder.append(", marketUnNo=");
		builder.append(marketUnNo);
		builder.append(", totalRefundDollarAmt=");
		builder.append(totalRefundDollarAmt);
		builder.append(", totalRefundTaxAmt=");
		builder.append(totalRefundTaxAmt);
		builder.append(", updateDetailPayment=");
		builder.append(updateDetailPayment);
		builder.append("]");
		return builder.toString();
	}

	public String getAdjustId() {
		return adjustId;
	}

	public void setAdjustId(String adjustId) {
		this.adjustId = adjustId;
	}

	public String getAdjustNote() {
		return adjustNote;
	}

	public void setAdjustNote(String adjustNote) {
		this.adjustNote = adjustNote;
	}

	public String getAdjustReason() {
		return adjustReason;
	}

	public void setAdjustReason(String adjustReason) {
		this.adjustReason = adjustReason;
	}

	public String getAdjustTs() {
		return adjustTs;
	}

	public void setAdjustTs(String adjustTs) {
		this.adjustTs = adjustTs;
	}

	public String getAdjustType() {
		return adjustType;
	}

	public void setAdjustType(String adjustType) {
		this.adjustType = adjustType;
	}

	public String getCanceller() {
		return canceller;
	}

	public void setCanceller(String cancelCustNo) {
		this.canceller = cancelCustNo;
	}

	public String getCancelReason() {
		return cancelReason;
	}

	public void setCancelReason(String cancelReason) {
		this.cancelReason = cancelReason;
	}

	public String getCheckNo() {
		return checkNo;
	}

	public void setCheckNo(String checkNo) {
		this.checkNo = checkNo;
	}

	public String getCallCancelEmp() {
		return callCancelEmp;
	}

	public void setCallCancelEmp(String empCallCancel) {
		this.callCancelEmp = empCallCancel;
	}

	public String getRecordCancelEmp() {
		return recordCancelEmp;
	}

	public void setRecordCancelEmp(String empRecordCancel) {
		this.recordCancelEmp = empRecordCancel;
	}

	public String getMarketUnNo() {
		return marketUnNo;
	}

	public void setMarketUnNo(String marketUnNo) {
		this.marketUnNo = marketUnNo;
	}

	public String getNonRefundDollarAmt() {
		return nonRefundDollarAmt;
	}

	public void setNonRefundDollarAmt(String nonRefundDollarAmt) {
		this.nonRefundDollarAmt = nonRefundDollarAmt;
	}

	public String getPosRegisterNo() {
		return posRegisterNo;
	}

	public void setPosRegisterNo(String posRegisterNo) {
		this.posRegisterNo = posRegisterNo;
	}

	public String getPosTransDate() {
		return posTransDate;
	}

	public void setPosTransDate(String posTransDate) {
		this.posTransDate = posTransDate;
	}

	public String getPosTransNo() {
		return posTransNo;
	}

	public void setPosTransNo(String posTransNo) {
		this.posTransNo = posTransNo;
	}

	public String getRefundMth() {
		return refundMth;
	}

	public void setRefundMth(String refundMth) {
		this.refundMth = refundMth;
	}

	public String getRefundTaxAmt() {
		return refundTaxAmt;
	}

	public void setRefundTaxAmt(String refundTaxAmt) {
		this.refundTaxAmt = refundTaxAmt;
	}

	public String getRefundType() {
		return refundType;
	}

	public void setRefundType(String refundType) {
		this.refundType = refundType;
	}

	public String getCallCancelUnit() {
		return callCancelUnit;
	}

	public void setCallCancelUnit(String unitCallCancel) {
		this.callCancelUnit = unitCallCancel;
	}

	public String getRecordCancelUnit() {
		return recordCancelUnit;
	}

	public void setRecordCancelUnit(String unitRecordCancel) {
		this.recordCancelUnit = unitRecordCancel;
	}

	public String getTotalRefundDollarAmt() {
		return totalRefundDollarAmt;
	}

	public void setTotalRefundDollarAmt(String totalRefundDollarAmt) {
		this.totalRefundDollarAmt = totalRefundDollarAmt;
	}

	public String getTotalRefundTaxAmt() {
		return totalRefundTaxAmt;
	}

	public void setTotalRefundTaxAmt(String totalRefundTaxAmt) {
		this.totalRefundTaxAmt = totalRefundTaxAmt;
	}

	public List<UpdateDetailPayment> getUpdateDetailPayment() {
		return updateDetailPayment;
	}

	public void setUpdateDetailPayment(
			List<UpdateDetailPayment> updateDetailPayment) {
		this.updateDetailPayment = updateDetailPayment;
	}

}
