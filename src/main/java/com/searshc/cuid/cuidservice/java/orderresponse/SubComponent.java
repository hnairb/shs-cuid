package com.searshc.cuid.cuidservice.java.orderresponse;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SubComponent {
	private String subComp;

	public String getSubComp() {
		return subComp;
	}

	public void setSubComp(String subComp) {
		this.subComp = subComp;
	}

}
