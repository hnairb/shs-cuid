package com.searshc.cuid.cuidservice.java.serviceorderclient;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ServiceOrderNew {
	public String correlationId;
	public List<String> messages;
	public List<OrderKeys> orderKeys;
	public String responseCode;
	public String responseMessage;	
	
	public String getCorrelationId() {
		return correlationId;
	}

	public void setCorrelationId(String correlationId) {
		this.correlationId = correlationId;
	}

	public List<String> getMessages() {
		return messages;
	}

	public void setMessages(List<String> messages) {
		this.messages = messages;
	}

	public List<OrderKeys> getOrderKeys() {
		return orderKeys;
	}

	public void setOrderKeys(List<OrderKeys> orderKeys) {
		this.orderKeys = orderKeys;
	}

	public String getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	public String getResponseMessage() {
		return responseMessage;
	}

	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}

}
