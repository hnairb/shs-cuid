package com.searshc.hs.agreement.agreementservice.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "RefundSYWRDetail", namespace = "http://domain.agreementservice.agreement.hs.searshc.com")
public class RefundSYWRDetail {

	private String sywrTransType;
	private String sywrPoints;
	private String sywrDollars;

	public String getSywrTransType() {
		return sywrTransType;
	}

	public void setSywrTransType(String sywrTransType) {
		this.sywrTransType = sywrTransType;
	}

	public String getSywrPoints() {
		return sywrPoints;
	}

	public void setSywrPoints(String sywrPoints) {
		this.sywrPoints = sywrPoints;
	}

	public String getSywrDollars() {
		return sywrDollars;
	}

	public void setSywrDollars(String sywrDollars) {
		this.sywrDollars = sywrDollars;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RefundSYWRDetail [sywrTransType=");
		builder.append(sywrTransType);
		builder.append(", sywrPoints=");
		builder.append(sywrPoints);
		builder.append(", sywrDollars=");
		builder.append(sywrDollars);
		builder.append("]");
		return builder.toString();
	}

}
