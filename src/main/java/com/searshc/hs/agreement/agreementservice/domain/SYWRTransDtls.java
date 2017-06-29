package com.searshc.hs.agreement.agreementservice.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "SYWRTransDtls", namespace = "http://domain.agreementservice.agreement.hs.searshc.com")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SYWRTransDtls", propOrder = { "sywrTransType", "sywrPoints",
		"sywrDollars", "sywrTransDate"

})
public class SYWRTransDtls {
	@XmlElement(required = false, nillable = true)
	private String sywrTransType;
	@XmlElement(required = false, nillable = true)
	private String sywrPoints;
	@XmlElement(required = false, nillable = true)
	private String sywrDollars;
	@XmlElement(required = false, nillable = true)
	private String sywrTransDate;

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

	public String getSywrTransDate() {
		return sywrTransDate;
	}

	public void setSywrTransDate(String sywrTransDate) {
		this.sywrTransDate = sywrTransDate;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SYWRTransDtls [sywrTransType=");
		builder.append(sywrTransType);
		builder.append(", sywrPoints=");
		builder.append(sywrPoints);
		builder.append(", sywrDollars=");
		builder.append(sywrDollars);
		builder.append(", sywrTransDate=");
		builder.append(sywrTransDate);
		builder.append("]");
		return builder.toString();
	}

}
