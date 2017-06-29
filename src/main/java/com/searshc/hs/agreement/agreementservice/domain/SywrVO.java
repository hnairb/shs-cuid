package com.searshc.hs.agreement.agreementservice.domain;

import java.sql.Timestamp;
import java.util.Date;

public class SywrVO {
	private String orderNumber;
	private Date orderDate;
	private String orderRefNo;

	private int paymentSeqNo;

	private String transactionTypeCd;

	private double orderPaymentAmt;
	private String sywrMemberId;

	private String createUserId;
	private Timestamp createTimestamp;

	private String lastUpdUserId;
	private Timestamp lastUpdTimestamp;

	// Only used to pass synonymn in SQL map
	private String dbSynonym;

	public Timestamp getCreateTimestamp() {
		return createTimestamp;
	}

	public void setCreateTimestamp(Timestamp createTimestamp) {
		this.createTimestamp = createTimestamp;
	}

	public String getCreateUserId() {
		return createUserId;
	}

	public void setCreateUserId(String createUserId) {
		this.createUserId = createUserId;
	}

	public Timestamp getLastUpdTimestamp() {
		return lastUpdTimestamp;
	}

	public void setLastUpdTimestamp(Timestamp lastUpdTimestamp) {
		this.lastUpdTimestamp = lastUpdTimestamp;
	}

	public String getLastUpdUserId() {
		return lastUpdUserId;
	}

	public void setLastUpdUserId(String lastUpdUserId) {
		this.lastUpdUserId = lastUpdUserId;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public double getOrderPaymentAmt() {
		return orderPaymentAmt;
	}

	public void setOrderPaymentAmt(double orderPaymentAmt) {
		this.orderPaymentAmt = orderPaymentAmt;
	}

	public String getOrderRefNo() {
		return orderRefNo;
	}

	public void setOrderRefNo(String orderRefNo) {
		this.orderRefNo = orderRefNo;
	}

	public int getPaymentSeqNo() {
		return paymentSeqNo;
	}

	public void setPaymentSeqNo(int paymentSeqNo) {
		this.paymentSeqNo = paymentSeqNo;
	}

	public String getTransactionTypeCd() {
		return transactionTypeCd;
	}

	public void setTransactionTypeCd(String transactionTypeCd) {
		this.transactionTypeCd = transactionTypeCd;
	}

	public String getSywrMemberId() {
		return sywrMemberId;
	}

	public void setSywrMemberId(String sywrMemberId) {
		this.sywrMemberId = sywrMemberId;
	}

	public String getDbSynonym() {
		return dbSynonym;
	}

	public void setDbSynonym(String dbSynonym) {
		this.dbSynonym = dbSynonym;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SywrVO [orderNumber=");
		builder.append(orderNumber);
		builder.append(", orderDate=");
		builder.append(orderDate);
		builder.append(", orderRefNo=");
		builder.append(orderRefNo);
		builder.append(", paymentSeqNo=");
		builder.append(paymentSeqNo);
		builder.append(", transactionTypeCd=");
		builder.append(transactionTypeCd);
		builder.append(", orderPaymentAmt=");
		builder.append(orderPaymentAmt);
		builder.append(", sywrMemberId=");
		builder.append(sywrMemberId);
		builder.append(", createUserId=");
		builder.append(createUserId);
		builder.append(", createTimestamp=");
		builder.append(createTimestamp);
		builder.append(", lastUpdUserId=");
		builder.append(lastUpdUserId);
		builder.append(", lastUpdTimestamp=");
		builder.append(lastUpdTimestamp);
		builder.append(", dbSynonym=");
		builder.append(dbSynonym);
		builder.append("]");
		return builder.toString();
	}

}
