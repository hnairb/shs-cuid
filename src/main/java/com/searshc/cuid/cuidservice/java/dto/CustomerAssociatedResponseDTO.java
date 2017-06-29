package com.searshc.cuid.cuidservice.java.dto;

public class CustomerAssociatedResponseDTO {
	
	public CustomerAssociatedDetailsDTO customerAssociatedDetailsDTO;
	public boolean isCorrectResponse = true;
	public String errorMessage;
	
	public CustomerAssociatedDetailsDTO getCustomerAssociatedDetailsDTO() {
		return customerAssociatedDetailsDTO;
	}
	public void setCustomerAssociatedDetailsDTO(
			CustomerAssociatedDetailsDTO customerAssociatedDetailsDTO) {
		this.customerAssociatedDetailsDTO = customerAssociatedDetailsDTO;
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
