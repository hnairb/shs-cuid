package com.searshc.cuid.cuidservice.java.dto;

import com.searshc.cuid.cuidservice.java.model.CustomerDetails;

public class CustomerResponseDTO {
	public CustomerDetails customerDetails;
	public boolean correctResponse = true;
	public String errorMessage;
	
	public CustomerDetails getCustomerDetails() {
		return customerDetails;
	}
	public void setCustomerDetails(CustomerDetails customerDetails) {
		this.customerDetails = customerDetails;
	}
	public boolean isCorrectResponse() {
		return correctResponse;
	}
	public void setCorrectResponse(boolean correctResponse) {
		this.correctResponse = correctResponse;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
}
