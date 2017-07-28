package com.searshc.cuid.cuidservice.java.dto;

public class CustomerAssociatedResponseDTO {
	
	public CustomerAssociatedDetailsDTO customerAssociatedDetailsDTO;
	public boolean correctResponse = true;
	public String errorMessage;
	
	public CustomerAssociatedDetailsDTO getCustomerAssociatedDetailsDTO() {
		return customerAssociatedDetailsDTO;
	}
	public void setCustomerAssociatedDetailsDTO(
			CustomerAssociatedDetailsDTO customerAssociatedDetailsDTO) {
		this.customerAssociatedDetailsDTO = customerAssociatedDetailsDTO;
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
