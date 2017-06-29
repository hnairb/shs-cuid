package com.searshc.hs.agreement.agreementservice.domain;

import java.io.Serializable;
import java.sql.Timestamp;

public class GiftCardPayment implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6808003371438717548L;
	private long custNo;
	private int locNo;
	private int leadNo ;
	private long	contactNo;
	private int	giftCardSeqNo ;
	private String	giftCardNo;
	private String	 giftCardPin; 
	private double totalAmt;
	 private String	authCd ;
	private String	createId ;
	private Timestamp createTimeStamp ;
	
	public long getCustNo() {
		return custNo;
	}
	public void setCustNo(long custNo) {
		this.custNo = custNo;
	}
	public int getLocNo() {
		return locNo;
	}
	public void setLocNo(int locNo) {
		this.locNo = locNo;
	}
	public int getLeadNo() {
		return leadNo;
	}
	public void setLeadNo(int leadNo) {
		this.leadNo = leadNo;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	public int getGiftCardSeqNo() {
		return giftCardSeqNo;
	}
	public void setGiftCardSeqNo(int giftCardSeqNo) {
		this.giftCardSeqNo = giftCardSeqNo;
	}
	public String getGiftCardNo() {
		return giftCardNo;
	}
	public void setGiftCardNo(String giftCardNo) {
		this.giftCardNo = giftCardNo;
	}
	public String getGiftCardPin() {
		return giftCardPin;
	}
	public void setGiftCardPin(String giftCardPin) {
		this.giftCardPin = giftCardPin;
	}
	public double getTotalAmt() {
		return totalAmt;
	}
	public void setTotalAmt(double totalAmt) {
		this.totalAmt = totalAmt;
	}
	public String getAuthCd() {
		return authCd;
	}
	public void setAuthCd(String authCd) {
		this.authCd = authCd;
	}
	public String getCreateId() {
		return createId;
	}
	public void setCreateId(String createId) {
		this.createId = createId;
	}
	public Timestamp getCreateTimeStamp() {
		return createTimeStamp;
	}
	public void setCreateTimeStamp(Timestamp createTimeStamp) {
		this.createTimeStamp = createTimeStamp;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("GiftCardPayment [custNo=");
		builder.append(custNo);
		builder.append(", locNo=");
		builder.append(locNo);
		builder.append(", leadNo=");
		builder.append(leadNo);
		builder.append(", contactNo=");
		builder.append(contactNo);
		builder.append(", giftCardSeqNo=");
		builder.append(giftCardSeqNo);
		builder.append(", giftCardNo=");
		builder.append(giftCardNo);
		builder.append(", giftCardPin=");
		builder.append(giftCardPin);
		builder.append(", totalAmt=");
		builder.append(totalAmt);
		builder.append(", authCd=");
		builder.append(authCd);
		builder.append(", createId=");
		builder.append(createId);
		builder.append(", createTimeStamp=");
		builder.append(createTimeStamp);
		builder.append("]");
		return builder.toString();
	}
	
	
	


}
