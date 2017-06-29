package com.searshc.hs.agreement.agreementservice.domain;

import java.io.Serializable;

public class TenderTypeVO  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 745839940755463693L;
	private String tenderTypeCode;
	private String tenderType;

	public String getTenderTypeCode() {
		return tenderTypeCode;
	}

	public void setTenderTypeCode(String tenderTypeCode) {
		this.tenderTypeCode = tenderTypeCode;
	}

	public String getTenderType() {
		return tenderType;
	}

	public void setTenderType(String tenderType) {
		this.tenderType = tenderType;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TenderTypeVO [tenderTypeCode=");
		builder.append(tenderTypeCode);
		builder.append(", tenderType=");
		builder.append(tenderType);
		builder.append("]");
		return builder.toString();
	}
	
}
