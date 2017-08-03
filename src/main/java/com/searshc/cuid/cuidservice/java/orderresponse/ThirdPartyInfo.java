package com.searshc.cuid.cuidservice.java.orderresponse;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ThirdPartyInfo {
	
	private String thirdPartyId;

	private String thirdPartyAuthNumber;

	private String contractNumber;

	public String getThirdPartyId() {
		return thirdPartyId;
	}

	public void setThirdPartyId(String thirdPartyId) {
		this.thirdPartyId = thirdPartyId;
	}

	public String getThirdPartyAuthNumber() {
		return thirdPartyAuthNumber;
	}

	public void setThirdPartyAuthNumber(String thirdPartyAuthNumber) {
		this.thirdPartyAuthNumber = thirdPartyAuthNumber;
	}

	public String getContractNumber() {
		return contractNumber;
	}

	public void setContractNumber(String contractNumber) {
		this.contractNumber = contractNumber;
	}
}
