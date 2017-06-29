package com.searshc.hs.som.thm.domain.npj;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "customerEmail")
public class CustomerEmail implements java.io.Serializable{
	private static final long serialVersionUID = 861096589850799351L;
	private String customerKey;
	private EmailOptIn emailOptIn;
	private String emailActivationCode;
	private String emailSourceFunction;
	private String emailCaptureEmpNo;
	private String emailCaptureUnit;
	private String emailServiceCode;
	private String emailSourceCode;
	private String emailTypeCode;
	
	public CustomerEmail() {
		super();
	}

	/**
	 * @return the customerKey
	 */
	public String getCustomerKey() {
		return customerKey;
	}

	/**
	 * @param customerKey the customerKey to set
	 */
	public void setCustomerKey(String customerKey) {
		this.customerKey = customerKey;
	}

	/**
	 * @return the emailOptIn
	 */
	public EmailOptIn getEmailOptIn() {
		return emailOptIn;
	}

	/**
	 * @param emailOptIn the emailOptIn to set
	 */
	public void setEmailOptIn(EmailOptIn emailOptIn) {
		this.emailOptIn = emailOptIn;
	}

	/**
	 * @return the emailActivationCode
	 */
	public String getEmailActivationCode() {
		return emailActivationCode;
	}

	/**
	 * @param emailActivationCode the emailActivationCode to set
	 */
	public void setEmailActivationCode(String emailActivationCode) {
		this.emailActivationCode = emailActivationCode;
	}

	/**
	 * @return the emailSourceFunction
	 */
	public String getEmailSourceFunction() {
		return emailSourceFunction;
	}

	/**
	 * @param emailSourceFunction the emailSourceFunction to set
	 */
	public void setEmailSourceFunction(String emailSourceFunction) {
		this.emailSourceFunction = emailSourceFunction;
	}

	/**
	 * @return the emailCaptureEmpNo
	 */
	public String getEmailCaptureEmpNo() {
		return emailCaptureEmpNo;
	}

	/**
	 * @param emailCaptureEmpNo the emailCaptureEmpNo to set
	 */
	public void setEmailCaptureEmpNo(String emailCaptureEmpNo) {
		this.emailCaptureEmpNo = emailCaptureEmpNo;
	}

	/**
	 * @return the emailCaptureUnit
	 */
	public String getEmailCaptureUnit() {
		return emailCaptureUnit;
	}

	/**
	 * @param emailCaptureUnit the emailCaptureUnit to set
	 */
	public void setEmailCaptureUnit(String emailCaptureUnit) {
		this.emailCaptureUnit = emailCaptureUnit;
	}

	/**
	 * @return the emailServiceCode
	 */
	public String getEmailServiceCode() {
		return emailServiceCode;
	}

	/**
	 * @param emailServiceCode the emailServiceCode to set
	 */
	public void setEmailServiceCode(String emailServiceCode) {
		this.emailServiceCode = emailServiceCode;
	}

	/**
	 * @return the emailSourceCode
	 */
	public String getEmailSourceCode() {
		return emailSourceCode;
	}

	/**
	 * @param emailSourceCode the emailSourceCode to set
	 */
	public void setEmailSourceCode(String emailSourceCode) {
		this.emailSourceCode = emailSourceCode;
	}

	/**
	 * @return the emailTypeCode
	 */
	public String getEmailTypeCode() {
		return emailTypeCode;
	}

	/**
	 * @param emailTypeCode the emailTypeCode to set
	 */
	public void setEmailTypeCode(String emailTypeCode) {
		this.emailTypeCode = emailTypeCode;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CustomerEmail [customerKey=");
		builder.append(customerKey);
		builder.append(", emailActivationCode=");
		builder.append(emailActivationCode);
		builder.append(", emailCaptureEmpNo=");
		builder.append(emailCaptureEmpNo);
		builder.append(", emailCaptureUnit=");
		builder.append(emailCaptureUnit);
		builder.append(", emailOptIn=");
		builder.append(emailOptIn);
		builder.append(", emailServiceCode=");
		builder.append(emailServiceCode);
		builder.append(", emailSourceCode=");
		builder.append(emailSourceCode);
		builder.append(", emailSourceFunction=");
		builder.append(emailSourceFunction);
		builder.append(", emailTypeCode=");
		builder.append(emailTypeCode);
		builder.append("]");
		return builder.toString();
	}
}
