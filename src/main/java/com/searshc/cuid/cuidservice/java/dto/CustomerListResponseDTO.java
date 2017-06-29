package com.searshc.cuid.cuidservice.java.dto;

import java.util.List;

import com.searshc.cuid.cuidservice.java.model.CustomerDetails;

public class CustomerListResponseDTO {
	public List<CustomerDetails> customerDetails;
	public boolean isCorrectResponse = true;
	public String errorMessage;
	
	public List<CustomerDetails> getCustomerDetails() {
		return customerDetails;
	}
	public void setCustomerDetails(List<CustomerDetails> customerDetails) {
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
