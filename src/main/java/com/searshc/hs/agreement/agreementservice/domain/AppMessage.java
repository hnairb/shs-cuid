package com.searshc.hs.agreement.agreementservice.domain;

import java.io.Serializable;

public class AppMessage implements Serializable {

	private static final long serialVersionUID = 5822628705037084728L;
	private String code;
	private String description;
	private String severity;

	public AppMessage() {
		super();
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSeverity() {
		return severity;
	}

	public void setSeverity(String severity) {
		this.severity = severity;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AppMessage [code=");
		builder.append(code);
		builder.append(", description=");
		builder.append(description);
		builder.append(", severity=");
		builder.append(severity);
		builder.append("]");
		return builder.toString();
	}

}
