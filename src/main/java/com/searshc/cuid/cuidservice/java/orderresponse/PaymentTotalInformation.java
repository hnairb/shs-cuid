package com.searshc.cuid.cuidservice.java.orderresponse;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PaymentTotalInformation {

	private String primaryPaymentMethod;

	private String primaryAmountCollected;

	private String primaryAuthNumber;

	private String primaryToken;

	public String getPrimaryPaymentMethod() {
		return primaryPaymentMethod;
	}

	public void setPrimaryPaymentMethod(String primaryPaymentMethod) {
		this.primaryPaymentMethod = primaryPaymentMethod;
	}

	public String getPrimaryAmountCollected() {
		return primaryAmountCollected;
	}

	public void setPrimaryAmountCollected(String primaryAmountCollected) {
		this.primaryAmountCollected = primaryAmountCollected;
	}

	public String getPrimaryAuthNumber() {
		return primaryAuthNumber;
	}

	public void setPrimaryAuthNumber(String primaryAuthNumber) {
		this.primaryAuthNumber = primaryAuthNumber;
	}

	public String getPrimaryToken() {
		return primaryToken;
	}

	public void setPrimaryToken(String primaryToken) {
		this.primaryToken = primaryToken;
	}

}
