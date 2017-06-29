package com.searshc.hs.agreement.agreementservice.domain;

import java.sql.Date;

public class LeadControl {

	private long custNo;
	private int locNo;
	private int leadNo;
	private long contactNo;
	private String leadStatusCd;
	private String leadQueueNameCd;
	private String leadPriceFl;
	private String lockFl;
	private String sellUnitNo;
	private Date posPassedDate;
	private String leadAssignFl;
	private String comment;
	private String spokeTo;
	private Date lastContactRecallDate;
	private String spokeToFl;
	private String queueUnitNo;
	private String sellEmpNo;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LeadControl [custNo=");
		builder.append(custNo);
		builder.append(", locNo=");
		builder.append(locNo);
		builder.append(", leadNo=");
		builder.append(leadNo);
		builder.append(", contactNo=");
		builder.append(contactNo);
		builder.append(", leadStatusCd=");
		builder.append(leadStatusCd);
		builder.append(", leadQueueNameCd=");
		builder.append(leadQueueNameCd);
		builder.append(", leadPriceFl=");
		builder.append(leadPriceFl);
		builder.append(", lockFl=");
		builder.append(lockFl);
		builder.append(", sellUnitNo=");
		builder.append(sellUnitNo);
		builder.append(", posPassedDate=");
		builder.append(posPassedDate);
		builder.append(", leadAssignFl=");
		builder.append(leadAssignFl);
		builder.append(", comment=");
		builder.append(comment);
		builder.append(", spokeTo=");
		builder.append(spokeTo);
		builder.append(", lastContactRecallDate=");
		builder.append(lastContactRecallDate);
		builder.append(", spokeToFl=");
		builder.append(spokeToFl);
		builder.append(", queueUnitNo=");
		builder.append(queueUnitNo);
		builder.append(", sellEmpNo=");
		builder.append(sellEmpNo);
		builder.append("]");
		return builder.toString();
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	public long getCustNo() {
		return custNo;
	}

	public void setCustNo(long custNo) {
		this.custNo = custNo;
	}

	public Date getLastContactRecallDate() {
		return lastContactRecallDate;
	}

	public void setLastContactRecallDate(Date lastContactRecallDate) {
		this.lastContactRecallDate = lastContactRecallDate;
	}

	public String getLeadAssignFl() {
		return leadAssignFl;
	}

	public void setLeadAssignFl(String leadAssignFl) {
		this.leadAssignFl = leadAssignFl;
	}

	public int getLeadNo() {
		return leadNo;
	}

	public void setLeadNo(int leadNo) {
		this.leadNo = leadNo;
	}

	public String getLeadPriceFl() {
		return leadPriceFl;
	}

	public void setLeadPriceFl(String leadPriceFl) {
		this.leadPriceFl = leadPriceFl;
	}

	public String getLeadQueueNameCd() {
		return leadQueueNameCd;
	}

	public void setLeadQueueNameCd(String leadQueueNameCd) {
		this.leadQueueNameCd = leadQueueNameCd;
	}

	public String getLeadStatusCd() {
		return leadStatusCd;
	}

	public void setLeadStatusCd(String leadStatusCd) {
		this.leadStatusCd = leadStatusCd;
	}

	public String getLockFl() {
		return lockFl;
	}

	public void setLockFl(String lockFl) {
		this.lockFl = lockFl;
	}

	public int getLocNo() {
		return locNo;
	}

	public void setLocNo(int locNo) {
		this.locNo = locNo;
	}

	public Date getPosPassedDate() {
		return posPassedDate;
	}

	public void setPosPassedDate(Date posPassedDate) {
		this.posPassedDate = posPassedDate;
	}

	public String getQueueUnitNo() {
		return queueUnitNo;
	}

	public void setQueueUnitNo(String queueUnitNo) {
		this.queueUnitNo = queueUnitNo;
	}

	public String getSellEmpNo() {
		return sellEmpNo;
	}

	public void setSellEmpNo(String sellEmpNo) {
		this.sellEmpNo = sellEmpNo;
	}

	public String getSellUnitNo() {
		return sellUnitNo;
	}

	public void setSellUnitNo(String sellUnitNo) {
		this.sellUnitNo = sellUnitNo;
	}

	public String getSpokeTo() {
		return spokeTo;
	}

	public void setSpokeTo(String spokeTo) {
		this.spokeTo = spokeTo;
	}

	public String getSpokeToFl() {
		return spokeToFl;
	}

	public void setSpokeToFl(String spokeToFl) {
		this.spokeToFl = spokeToFl;
	}
}
