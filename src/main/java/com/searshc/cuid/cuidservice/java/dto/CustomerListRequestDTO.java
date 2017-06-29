package com.searshc.cuid.cuidservice.java.dto;

import java.util.List;

public class CustomerListRequestDTO {
	private List<String> customerIdList;

	public List<String> getCustomerIdList() {
		return customerIdList;
	}

	public void setCustomerIdList(List<String> customerIdList) {
		this.customerIdList = customerIdList;
	}
}
