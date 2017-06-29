package com.searshc.hs.agreement.agreementservice.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ErrorDetails", namespace = "http://domain.agreementservice.agreement.hs.searshc.com")
public class ErrorDetails implements Serializable {

	private static final long serialVersionUID = 480043157080944409L;

	private String errorCode = "";
	private String errorCodeDescription = "";
	private String serviceTypeCode = "";

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorCodeDescription() {
		return errorCodeDescription;
	}

	public void setErrorCodeDescription(String errorCodeDescription) {
		this.errorCodeDescription = errorCodeDescription;
	}

	public String getServiceTypeCode() {
		return serviceTypeCode;
	}

	public void setServiceTypeCode(String serviceTypeCode) {
		this.serviceTypeCode = serviceTypeCode;
	}

	public ErrorDetails() {
		super();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ErrorDetails [errorCode=");
		builder.append(errorCode);
		builder.append(", errorCodeDescription=");
		builder.append(errorCodeDescription);
		builder.append(", serviceTypeCode=");
		builder.append(serviceTypeCode);
		builder.append("]");
		return builder.toString();
	}

}
