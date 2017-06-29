
package com.searshc.hs.agreement.agreementservice.domain;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for QueueCancel complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="QueueCancel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="agmtSfx" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="agreeItemCnt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="agreementDollarAmt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cancelEmpNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cancelItemCnt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="canceller" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cancelReqTs" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cancelUnitNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="acctNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="acctType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="custName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="custNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="effDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="locNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="newExpireDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="phoneNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="posFl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="purchaseDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="reasonCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="refundDollarAmt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="refundMethodCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="refundTypeCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="requestDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="requestEmpNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="requestUnitNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement(name = "QueueCancel", namespace = "http://domain.agreementservice.agreement.hs.searshc.com")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueueCancel", propOrder = { "agmtSfx", "agreeItemCnt",
		"agreementDollarAmt", "cancelEmpNo", "cancelItemCnt", "canceller",
		"cancelReqTs", "cancelUnitNo", "comments", "custName", "custNo",
		"effDate", "locNo", "newExpireDate", "phoneNo", "posFl",
		"purchaseDate", "reasonCd", "refundMethodCd", "refundTypeCd",
		"requestDate", "requestEmpNo", "requestUnitNo", "sywrMemberId",
		"refundSYWRDetail", "queueCancelPayment" })
public class QueueCancel {

	@XmlElement(required = true, nillable = true)
	protected String agmtSfx;
	@XmlElement(required = true, nillable = true)
	protected String agreeItemCnt;
	@XmlElement(required = true, nillable = true)
	protected String agreementDollarAmt;
	@XmlElement(required = true, nillable = true)
	protected String cancelEmpNo;
	@XmlElement(required = true, nillable = true)
	protected String cancelItemCnt;
	@XmlElement(required = true, nillable = true)
	protected String canceller;
	@XmlElement(required = true, nillable = true)
	protected String cancelReqTs;
	@XmlElement(required = true, nillable = true)
	protected String cancelUnitNo;
	@XmlElement(required = true, nillable = true)
	protected String comments;

	@XmlElement(required = true, nillable = true)
	protected String custName;
	@XmlElement(required = true, nillable = true)
	protected String custNo;
	@XmlElement(required = true, nillable = true)
	protected String effDate;
	@XmlElement(required = true, nillable = true)
	protected String locNo;
	@XmlElement(required = true, nillable = true)
	protected String newExpireDate;
	@XmlElement(required = true, nillable = true)
	protected String phoneNo;
	@XmlElement(required = true, nillable = true)
	protected String posFl;
	@XmlElement(required = true, nillable = true)
	protected String purchaseDate;
	@XmlElement(required = true, nillable = true)
	protected String reasonCd;
	@XmlElement(required = true, nillable = true)
	protected String refundMethodCd;
	@XmlElement(required = true, nillable = true)
	protected String refundTypeCd;
	@XmlElement(required = true, nillable = true)
	protected String requestDate;
	@XmlElement(required = true, nillable = true)
	protected String requestEmpNo;
	@XmlElement(required = true, nillable = true)
	protected String requestUnitNo;
	@XmlElement(required = false, nillable = true)
	protected String sywrMemberId;
	@XmlElement(required = false, nillable = true)
	protected List<RefundSYWRDetail> refundSYWRDetail;
	@XmlElement(required = false, nillable = true)
	protected List<QueueCancelPayment> queueCancelPayment;

	/**
	 * Gets the value of the agmtSfx property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAgmtSfx() {
		return agmtSfx;
	}

	/**
	 * Sets the value of the agmtSfx property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAgmtSfx(String value) {
		this.agmtSfx = value;
	}

	/**
	 * Gets the value of the agreeItemCnt property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAgreeItemCnt() {
		return agreeItemCnt;
	}

	/**
	 * Sets the value of the agreeItemCnt property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAgreeItemCnt(String value) {
		this.agreeItemCnt = value;
	}

	/**
	 * Gets the value of the agreementDollarAmt property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAgreementDollarAmt() {
		return agreementDollarAmt;
	}

	/**
	 * Sets the value of the agreementDollarAmt property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAgreementDollarAmt(String value) {
		this.agreementDollarAmt = value;
	}

	/**
	 * Gets the value of the cancelEmpNo property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCancelEmpNo() {
		return cancelEmpNo;
	}

	/**
	 * Sets the value of the cancelEmpNo property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCancelEmpNo(String value) {
		this.cancelEmpNo = value;
	}

	/**
	 * Gets the value of the cancelItemCnt property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCancelItemCnt() {
		return cancelItemCnt;
	}

	/**
	 * Sets the value of the cancelItemCnt property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCancelItemCnt(String value) {
		this.cancelItemCnt = value;
	}

	/**
	 * Gets the value of the canceller property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCanceller() {
		return canceller;
	}

	/**
	 * Sets the value of the canceller property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCanceller(String value) {
		this.canceller = value;
	}

	/**
	 * Gets the value of the cancelReqTs property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCancelReqTs() {
		return cancelReqTs;
	}

	/**
	 * Sets the value of the cancelReqTs property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCancelReqTs(String value) {
		this.cancelReqTs = value;
	}

	/**
	 * Gets the value of the cancelUnitNo property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCancelUnitNo() {
		return cancelUnitNo;
	}

	/**
	 * Sets the value of the cancelUnitNo property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCancelUnitNo(String value) {
		this.cancelUnitNo = value;
	}

	/**
	 * Gets the value of the comments property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getComments() {
		return comments;
	}

	/**
	 * Sets the value of the comments property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setComments(String value) {
		this.comments = value;
	}

	/**
	 * Gets the value of the custName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCustName() {
		return custName;
	}

	/**
	 * Sets the value of the custName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCustName(String value) {
		this.custName = value;
	}

	/**
	 * Gets the value of the custNo property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCustNo() {
		return custNo;
	}

	/**
	 * Sets the value of the custNo property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCustNo(String value) {
		this.custNo = value;
	}

	/**
	 * Gets the value of the effDate property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEffDate() {
		return effDate;
	}

	/**
	 * Sets the value of the effDate property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setEffDate(String value) {
		this.effDate = value;
	}

	/**
	 * Gets the value of the locNo property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLocNo() {
		return locNo;
	}

	/**
	 * Sets the value of the locNo property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setLocNo(String value) {
		this.locNo = value;
	}

	/**
	 * Gets the value of the newExpireDate property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNewExpireDate() {
		return newExpireDate;
	}

	/**
	 * Sets the value of the newExpireDate property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setNewExpireDate(String value) {
		this.newExpireDate = value;
	}

	/**
	 * Gets the value of the phoneNo property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPhoneNo() {
		return phoneNo;
	}

	/**
	 * Sets the value of the phoneNo property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPhoneNo(String value) {
		this.phoneNo = value;
	}

	/**
	 * Gets the value of the posFl property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPosFl() {
		return posFl;
	}

	/**
	 * Sets the value of the posFl property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPosFl(String value) {
		this.posFl = value;
	}

	/**
	 * Gets the value of the purchaseDate property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPurchaseDate() {
		return purchaseDate;
	}

	/**
	 * Sets the value of the purchaseDate property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPurchaseDate(String value) {
		this.purchaseDate = value;
	}

	/**
	 * Gets the value of the reasonCd property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getReasonCd() {
		return reasonCd;
	}

	/**
	 * Sets the value of the reasonCd property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setReasonCd(String value) {
		this.reasonCd = value;
	}

	/**
	 * Gets the value of the refundMethodCd property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRefundMethodCd() {
		return refundMethodCd;
	}

	/**
	 * Sets the value of the refundMethodCd property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRefundMethodCd(String value) {
		this.refundMethodCd = value;
	}

	/**
	 * Gets the value of the refundTypeCd property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRefundTypeCd() {
		return refundTypeCd;
	}

	/**
	 * Sets the value of the refundTypeCd property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRefundTypeCd(String value) {
		this.refundTypeCd = value;
	}

	/**
	 * Gets the value of the requestDate property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRequestDate() {
		return requestDate;
	}

	/**
	 * Sets the value of the requestDate property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRequestDate(String value) {
		this.requestDate = value;
	}

	/**
	 * Gets the value of the requestEmpNo property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRequestEmpNo() {
		return requestEmpNo;
	}

	/**
	 * Sets the value of the requestEmpNo property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRequestEmpNo(String value) {
		this.requestEmpNo = value;
	}

	/**
	 * Gets the value of the requestUnitNo property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRequestUnitNo() {
		return requestUnitNo;
	}

	/**
	 * Sets the value of the requestUnitNo property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRequestUnitNo(String value) {
		this.requestUnitNo = value;
	}

	public String getSywrMemberId() {
		return sywrMemberId;
	}

	public void setSywrMemberId(String sywrMemberId) {
		this.sywrMemberId = sywrMemberId;
	}

	public List<RefundSYWRDetail> getRefundSYWRDetail() {
		return refundSYWRDetail;
	}

	public void setRefundSYWRDetail(List<RefundSYWRDetail> refundSYWRDetail) {
		this.refundSYWRDetail = refundSYWRDetail;
	}

	public List<QueueCancelPayment> getQueueCancelPayment() {
		return queueCancelPayment;
	}

	public void setQueueCancelPayment(
			List<QueueCancelPayment> queueCancelPayment) {
		this.queueCancelPayment = queueCancelPayment;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("QueueCancel [agmtSfx=");
		builder.append(agmtSfx);
		builder.append(", agreeItemCnt=");
		builder.append(agreeItemCnt);
		builder.append(", agreementDollarAmt=");
		builder.append(agreementDollarAmt);
		builder.append(", cancelEmpNo=");
		builder.append(cancelEmpNo);
		builder.append(", cancelItemCnt=");
		builder.append(cancelItemCnt);
		builder.append(", canceller=");
		builder.append(canceller);
		builder.append(", cancelReqTs=");
		builder.append(cancelReqTs);
		builder.append(", cancelUnitNo=");
		builder.append(cancelUnitNo);
		builder.append(", comments=");
		builder.append(comments);
		builder.append(", custName=");
		builder.append(custName);
		builder.append(", custNo=");
		builder.append(custNo);
		builder.append(", effDate=");
		builder.append(effDate);
		builder.append(", locNo=");
		builder.append(locNo);
		builder.append(", newExpireDate=");
		builder.append(newExpireDate);
		builder.append(", phoneNo=");
		builder.append(phoneNo);
		builder.append(", posFl=");
		builder.append(posFl);
		builder.append(", purchaseDate=");
		builder.append(purchaseDate);
		builder.append(", reasonCd=");
		builder.append(reasonCd);
		builder.append(", refundMethodCd=");
		builder.append(refundMethodCd);
		builder.append(", refundTypeCd=");
		builder.append(refundTypeCd);
		builder.append(", requestDate=");
		builder.append(requestDate);
		builder.append(", requestEmpNo=");
		builder.append(requestEmpNo);
		builder.append(", requestUnitNo=");
		builder.append(requestUnitNo);
		builder.append(", sywrMemberId=");
		builder.append(sywrMemberId);
		builder.append(", refundSYWRDetail=");
		builder.append(refundSYWRDetail);
		builder.append(", queueCancelPayment=");
		builder.append(queueCancelPayment);
		builder.append("]");
		return builder.toString();
	}

}
