package com.searshc.hs.agreement.agreementservice.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "AddGiftCardStatus", namespace = "http://domain.agreementservice.agreement.hs.searshc.com")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddGiftCardStatus", propOrder = { "giftCardNo", "salesAuthNo",
		"giftCardErrorMsg", "giftCardApprovalFl", "giftCardBalance" })
public class AddGiftCardStatus {
	@XmlElement(required = true, nillable = true)
	private String giftCardNo;
	@XmlElement(required = true, nillable = true)
	private String salesAuthNo;
	@XmlElement(required = true, nillable = true)
	private String giftCardErrorMsg;
	@XmlElement(required = true, nillable = true)
	private String giftCardApprovalFl;
	@XmlElement(required = true, nillable = true)
	private String giftCardBalance;

	public String getGiftCardNo() {
		return giftCardNo;
	}

	public void setGiftCardNo(String giftCardNo) {
		this.giftCardNo = giftCardNo;
	}

	public String getSalesAuthNo() {
		return salesAuthNo;
	}

	public void setSalesAuthNo(String salesAuthNo) {
		this.salesAuthNo = salesAuthNo;
	}

	public String getGiftCardErrorMsg() {
		return giftCardErrorMsg;
	}

	public void setGiftCardErrorMsg(String giftCardErrorMsg) {
		this.giftCardErrorMsg = giftCardErrorMsg;
	}

	public String getGiftCardApprovalFl() {
		return giftCardApprovalFl;
	}

	public void setGiftCardApprovalFl(String giftCardApprovalFl) {
		this.giftCardApprovalFl = giftCardApprovalFl;
	}

	public String getGiftCardBalance() {
		return giftCardBalance;
	}

	public void setGiftCardBalance(String giftCardBalance) {
		this.giftCardBalance = giftCardBalance;
	}

	
}
