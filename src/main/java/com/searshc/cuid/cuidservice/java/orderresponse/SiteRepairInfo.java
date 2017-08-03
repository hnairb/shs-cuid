package com.searshc.cuid.cuidservice.java.orderresponse;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SiteRepairInfo {
	
	private String workAreaCode;

	public String getWorkAreaCode() {
		return workAreaCode;
	}

	public void setWorkAreaCode(String workAreaCode) {
		this.workAreaCode = workAreaCode;
	}
	
}
