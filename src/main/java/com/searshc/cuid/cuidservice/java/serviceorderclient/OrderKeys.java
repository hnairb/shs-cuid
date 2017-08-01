package com.searshc.cuid.cuidservice.java.serviceorderclient;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderKeys {
	public String order;
	public String promiseDate;
	public String status;
	public String unit;
	
	public String getOrder() {
		return order;
	}
	public void setOrder(String order) {
		this.order = order;
	}
	public String getPromiseDate() {
		return promiseDate;
	}
	public void setPromiseDate(String promiseDate) {
		this.promiseDate = promiseDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	
}
