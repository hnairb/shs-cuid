package com.searshc.cuid.cuidservice.java.dto;

import com.searshc.cuid.cuidservice.java.model.CustomerDetails;

public class CustomerResponseDTO {
	public CustomerDetails customerDetails;
	public boolean isCorrectResponse = true;
	public String errorMessage;
	
	public CustomerDetails getCustomerDetails() {
		return customerDetails;
	}
	public void setCustomerDetails(CustomerDetails customerDetails) {
		this.customerDetails = customerDetails;
	}
	public boolean isCorrectResponse() {
		return isCorrectResponse;
	}
	public void setCorrectResponse(boolean isCorrectResponse) {
		this.isCorrectResponse = isCorrectResponse;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
}
