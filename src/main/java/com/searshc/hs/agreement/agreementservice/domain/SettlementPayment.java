package com.searshc.hs.agreement.agreementservice.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for SettlementPayment complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="SettlementPayment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addressTypeCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="authApprovedFl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="authCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="checkNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="creditCardExpMthYr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="creditCardNo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="creditCardType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="deferInterestMonths" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="delayBillDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="endAuthTimeStamp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="initAuthTimeStampOnline" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="initCreditAuthFl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="initLetterFl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="letterChannelTypeCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="letterTypeCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="onlineAuthAttempts" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="paymentType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="responseTimeStamp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="authResponseCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="salesRefNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="zeroPercInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="electricCheckApprovalCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="electricCheckTransIdNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="electricCheckRecNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="paymentAmt" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement(name = "SettlementPayment", namespace = "http://domain.agreementservice.agreement.hs.searshc.com")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementPayment", propOrder = { "addressTypeCd",
		"authApprovedFl", "authCd", "checkNo", "creditCardExpMthYr",
		"creditCardNo", "creditCardType", "deferInterestMonths",
		"delayBillDate", "endAuthTimeStamp", "initAuthTimeStampOnline",
		"initCreditAuthFl", "initLetterFl", "letterChannelTypeCd",
		"letterTypeCd", "onlineAuthAttempts", "paymentType",
		"responseTimeStamp", "authResponseCd", "salesRefNo", "zeroPercInd",
		"electricCheckApprovalCd", "electricCheckTransIdNo",
		"electricCheckRecNo", "paymentAmt", "giftCardNo", "giftCardPin",
		"creditCardTokenNo",  "maskedCreditCardNo", "settlementKey" })
public class SettlementPayment {

	@XmlElement(required = true, nillable = true)
	protected String addressTypeCd;
	@XmlElement(required = true, nillable = true)
	protected String authApprovedFl;
	@XmlElement(required = true, nillable = true)
	protected String authCd;
	protected int checkNo;
	@XmlElement(required = true, nillable = true)
	protected String creditCardExpMthYr;
	protected long creditCardNo;
	@XmlElement(required = true, nillable = true)
	protected String creditCardType;
	protected int deferInterestMonths;
	@XmlElement(required = true, nillable = true)
	protected String delayBillDate;
	@XmlElement(required = true, nillable = true)
	protected String endAuthTimeStamp;
	@XmlElement(required = true, nillable = true)
	protected String initAuthTimeStampOnline;
	@XmlElement(required = true, nillable = true)
	protected String initCreditAuthFl;
	@XmlElement(required = true, nillable = true)
	protected String initLetterFl;
	@XmlElement(required = true, nillable = true)
	protected String letterChannelTypeCd;
	@XmlElement(required = true, nillable = true)
	protected String letterTypeCd;
	@XmlElement(required = true, nillable = true)
	protected String onlineAuthAttempts;
	@XmlElement(required = true, nillable = true)
	protected String paymentType;
	@XmlElement(required = true, nillable = true)
	protected String responseTimeStamp;
	@XmlElement(required = true, nillable = true)
	protected String authResponseCd;
	@XmlElement(required = true, nillable = true)
	protected String salesRefNo;
	@XmlElement(required = true, nillable = true)
	protected String zeroPercInd;
	@XmlElement(required = true, nillable = true)
	protected String electricCheckApprovalCd;
	@XmlElement(required = true, nillable = true)
	protected String electricCheckTransIdNo;
	@XmlElement(required = true, nillable = true)
	protected String electricCheckRecNo;
	protected double paymentAmt;
	@XmlElement(required = true, nillable = true)
	protected String giftCardNo;
	@XmlElement(required = true, nillable = true)
	protected String giftCardPin;
 	 @XmlElement(required = false)
 	 protected String creditCardTokenNo;
 	 @XmlElement(required = false)
 	 protected String maskedCreditCardNo;
 	 @XmlElement(required = false)
 	 protected String settlementKey;
 	
	/**
	 * Gets the value of the addressTypeCd property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAddressTypeCd() {
		return addressTypeCd;
	}

	/**
	 * Sets the value of the addressTypeCd property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAddressTypeCd(String value) {
		this.addressTypeCd = value;
	}

	/**
	 * Gets the value of the authApprovedFl property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAuthApprovedFl() {
		return authApprovedFl;
	}

	/**
	 * Sets the value of the authApprovedFl property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAuthApprovedFl(String value) {
		this.authApprovedFl = value;
	}

	/**
	 * Gets the value of the authCd property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAuthCd() {
		return authCd;
	}

	/**
	 * Sets the value of the authCd property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAuthCd(String value) {
		this.authCd = value;
	}

	/**
	 * Gets the value of the checkNo property.
	 * 
	 */
	public int getCheckNo() {
		return checkNo;
	}

	/**
	 * Sets the value of the checkNo property.
	 * 
	 */
	public void setCheckNo(int value) {
		this.checkNo = value;
	}

	/**
	 * Gets the value of the creditCardExpMthYr property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCreditCardExpMthYr() {
		return creditCardExpMthYr;
	}

	/**
	 * Sets the value of the creditCardExpMthYr property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCreditCardExpMthYr(String value) {
		this.creditCardExpMthYr = value;
	}

	/**
	 * Gets the value of the creditCardNo property.
	 * 
	 */
	public long getCreditCardNo() {
		return creditCardNo;
	}

	/**
	 * Sets the value of the creditCardNo property.
	 * 
	 */
	public void setCreditCardNo(long value) {
		this.creditCardNo = value;
	}

    /**
     * Gets the value of the creditCardType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardType() {
        return creditCardType;
    }

	/**
	 * Sets the value of the creditCardType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCreditCardType(String value) {
		this.creditCardType = value;
	}

	/**
	 * Gets the value of the deferInterestMonths property.
	 * 
	 */
	public int getDeferInterestMonths() {
		return deferInterestMonths;
	}

	/**
	 * Sets the value of the deferInterestMonths property.
	 * 
	 */
	public void setDeferInterestMonths(int value) {
		this.deferInterestMonths = value;
	}

	/**
	 * Gets the value of the delayBillDate property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDelayBillDate() {
		return delayBillDate;
	}

	/**
	 * Sets the value of the delayBillDate property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDelayBillDate(String value) {
		this.delayBillDate = value;
	}

	/**
	 * Gets the value of the endAuthTimeStamp property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEndAuthTimeStamp() {
		return endAuthTimeStamp;
	}

	/**
	 * Sets the value of the endAuthTimeStamp property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setEndAuthTimeStamp(String value) {
		this.endAuthTimeStamp = value;
	}

	/**
	 * Gets the value of the initAuthTimeStampOnline property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getInitAuthTimeStampOnline() {
		return initAuthTimeStampOnline;
	}

	/**
	 * Sets the value of the initAuthTimeStampOnline property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setInitAuthTimeStampOnline(String value) {
		this.initAuthTimeStampOnline = value;
	}

	/**
	 * Gets the value of the initCreditAuthFl property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getInitCreditAuthFl() {
		return initCreditAuthFl;
	}

	/**
	 * Sets the value of the initCreditAuthFl property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setInitCreditAuthFl(String value) {
		this.initCreditAuthFl = value;
	}

	/**
	 * Gets the value of the initLetterFl property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getInitLetterFl() {
		return initLetterFl;
	}

	/**
	 * Sets the value of the initLetterFl property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setInitLetterFl(String value) {
		this.initLetterFl = value;
	}

	/**
	 * Gets the value of the letterChannelTypeCd property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLetterChannelTypeCd() {
		return letterChannelTypeCd;
	}

	/**
	 * Sets the value of the letterChannelTypeCd property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setLetterChannelTypeCd(String value) {
		this.letterChannelTypeCd = value;
	}

	/**
	 * Gets the value of the letterTypeCd property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLetterTypeCd() {
		return letterTypeCd;
	}

	/**
	 * Sets the value of the letterTypeCd property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setLetterTypeCd(String value) {
		this.letterTypeCd = value;
	}

	/**
	 * Gets the value of the onlineAuthAttempts property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getOnlineAuthAttempts() {
		return onlineAuthAttempts;
	}

	/**
	 * Sets the value of the onlineAuthAttempts property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setOnlineAuthAttempts(String value) {
		this.onlineAuthAttempts = value;
	}

	/**
	 * Gets the value of the paymentType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPaymentType() {
		return paymentType;
	}

	/**
	 * Sets the value of the paymentType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPaymentType(String value) {
		this.paymentType = value;
	}

	/**
	 * Gets the value of the responseTimeStamp property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getResponseTimeStamp() {
		return responseTimeStamp;
	}

	/**
	 * Sets the value of the responseTimeStamp property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setResponseTimeStamp(String value) {
		this.responseTimeStamp = value;
	}

	/**
	 * Gets the value of the authResponseCd property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAuthResponseCd() {
		return authResponseCd;
	}

	/**
	 * Sets the value of the authResponseCd property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAuthResponseCd(String value) {
		this.authResponseCd = value;
	}

	/**
	 * Gets the value of the salesRefNo property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSalesRefNo() {
		return salesRefNo;
	}

	/**
	 * Sets the value of the salesRefNo property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSalesRefNo(String value) {
		this.salesRefNo = value;
	}

	/**
	 * Gets the value of the zeroPercInd property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getZeroPercInd() {
		return zeroPercInd;
	}

	/**
	 * Sets the value of the zeroPercInd property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setZeroPercInd(String value) {
		this.zeroPercInd = value;
	}

	/**
	 * Gets the value of the electricCheckApprovalCd property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getElectricCheckApprovalCd() {
		return electricCheckApprovalCd;
	}

	/**
	 * Sets the value of the electricCheckApprovalCd property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setElectricCheckApprovalCd(String value) {
		this.electricCheckApprovalCd = value;
	}

	/**
	 * Gets the value of the electricCheckTransIdNo property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getElectricCheckTransIdNo() {
		return electricCheckTransIdNo;
	}

	/**
	 * Sets the value of the electricCheckTransIdNo property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setElectricCheckTransIdNo(String value) {
		this.electricCheckTransIdNo = value;
	}

	/**
	 * Gets the value of the electricCheckRecNo property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getElectricCheckRecNo() {
		return electricCheckRecNo;
	}

	/**
	 * Sets the value of the electricCheckRecNo property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setElectricCheckRecNo(String value) {
		this.electricCheckRecNo = value;
	}

	/**
	 * Gets the value of the paymentAmt property.
	 * 
	 */
	public double getPaymentAmt() {
		return paymentAmt;
	}

	/**
	 * Sets the value of the paymentAmt property.
	 * 
	 */
	public void setPaymentAmt(double value) {
		this.paymentAmt = value;
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

	public String getCreditCardTokenNo() {
   	return creditCardTokenNo;
   }

	public void setCreditCardTokenNo(String creditCardTokenNo) {
   	this.creditCardTokenNo = creditCardTokenNo;
   }

	public String getMaskedCreditCardNo() {
   	return maskedCreditCardNo;
   }

	public void setMaskedCreditCardNo(String maskedCreditCardNo) {
   	this.maskedCreditCardNo = maskedCreditCardNo;
   }

	public String getSettlementKey() {
   	return settlementKey;
   }

	public void setSettlementKey(String settlementKey) {
   	this.settlementKey = settlementKey;
   }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SettlementPayment [addressTypeCd=");
		builder.append(addressTypeCd);
		builder.append(", authApprovedFl=");
		builder.append(authApprovedFl);
		builder.append(", authCd=");
		builder.append(authCd);
		builder.append(", checkNo=");
		builder.append(checkNo);
		builder.append(", creditCardExpMthYr=");
		builder.append(creditCardExpMthYr);
		builder.append(", creditCardNo=");
		builder.append(creditCardNo);
		builder.append(", creditCardType=");
		builder.append(creditCardType);
		builder.append(", deferInterestMonths=");
		builder.append(deferInterestMonths);
		builder.append(", delayBillDate=");
		builder.append(delayBillDate);
		builder.append(", endAuthTimeStamp=");
		builder.append(endAuthTimeStamp);
		builder.append(", initAuthTimeStampOnline=");
		builder.append(initAuthTimeStampOnline);
		builder.append(", initCreditAuthFl=");
		builder.append(initCreditAuthFl);
		builder.append(", initLetterFl=");
		builder.append(initLetterFl);
		builder.append(", letterChannelTypeCd=");
		builder.append(letterChannelTypeCd);
		builder.append(", letterTypeCd=");
		builder.append(letterTypeCd);
		builder.append(", onlineAuthAttempts=");
		builder.append(onlineAuthAttempts);
		builder.append(", paymentType=");
		builder.append(paymentType);
		builder.append(", responseTimeStamp=");
		builder.append(responseTimeStamp);
		builder.append(", authResponseCd=");
		builder.append(authResponseCd);
		builder.append(", salesRefNo=");
		builder.append(salesRefNo);
		builder.append(", zeroPercInd=");
		builder.append(zeroPercInd);
		builder.append(", electricCheckApprovalCd=");
		builder.append(electricCheckApprovalCd);
		builder.append(", electricCheckTransIdNo=");
		builder.append(electricCheckTransIdNo);
		builder.append(", electricCheckRecNo=");
		builder.append(electricCheckRecNo);
		builder.append(", paymentAmt=");
		builder.append(paymentAmt);
		builder.append(", giftCardNo=");
		builder.append(giftCardNo);
		builder.append(", giftCardPin=");
		builder.append(giftCardPin);
		builder.append("]");
		return builder.toString();
	}

}
