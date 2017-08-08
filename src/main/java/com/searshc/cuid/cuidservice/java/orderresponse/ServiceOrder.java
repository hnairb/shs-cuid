package com.searshc.cuid.cuidservice.java.orderresponse;

import java.sql.Date;
import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ServiceOrder {

	private String callCreated;

	private String callCreatedTime;

	private String createEmployee;

	private String createUnit;
	
	private Customer customer;

	private Estimate estimate;

	private ArrayList<Jobcode> jobCodes;

	private String lastUpdateBy;

	private Date lastUpdateDate;

	private Merchandise merchandise;

	private ArrayList<Message> messages;
	
	private String orderNumber;

	private String paymentMethod;
	
	private ArrayList<Parts> parts;

	private PaymentTotalInformation paymentTotalInformation;

	private ArrayList<PreferredContact> preferredContacts;

	private ArrayList<PreviousAttempts> previousAttempts;

	private ServiceInfo serviceInfo;

	private String serviceUnit;

	private String statusCode;
	
	private ArrayList<UserDefinedField> userDefinedFields;

	private String providerId;

	public String getCallCreated() {
		return callCreated;
	}

	public String getCallCreatedTime() {
		return callCreatedTime;
	}

	public String getCreateEmployee() {
		return createEmployee;
	}

	public String getCreateUnit() {
		return createUnit;
	}

	public Customer getCustomer() {
		return customer;
	}

	public Estimate getEstimate() {
		return estimate;
	}

	public ArrayList<Jobcode> getJobCodes() {
		return jobCodes;
	}

	public String getLastUpdateBy() {
		return lastUpdateBy;
	}

	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}

	public Merchandise getMerchandise() {
		return merchandise;
	}

	public ArrayList<Message> getMessages() {
		return messages;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public ArrayList<Parts> getParts() {
		return parts;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public PaymentTotalInformation getPaymentTotalInformation() {
		return paymentTotalInformation;
	}

	public ArrayList<PreferredContact> getPreferredContacts() {
		return preferredContacts;
	}

	public ArrayList<PreviousAttempts> getPreviousAttempts() {
		return previousAttempts;
	}

	public String getProviderId() {
		return providerId;
	}

	public ServiceInfo getServiceInfo() {
		return serviceInfo;
	}

	public String getServiceUnit() {
		return serviceUnit;
	}

/*	public ArrayList<String> getMessages() {
		return messages;
	}

	public void setMessages(ArrayList<String> messages) {
		this.messages = messages;
	}*/

	public String getStatusCode() {
		return statusCode;
	}

	public void setCallCreated(String callCreated) {
		this.callCreated = callCreated;
	}

	public void setCallCreatedTime(String callCreatedTime) {
		this.callCreatedTime = callCreatedTime;
	}

	public void setCreateEmployee(String createEmployee) {
		this.createEmployee = createEmployee;
	}
	
	public void setCreateUnit(String createUnit) {
		this.createUnit = createUnit;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public void setEstimate(Estimate estimate) {
		this.estimate = estimate;
	}

	public void setJobCodes(ArrayList<Jobcode> jobCodes) {
		this.jobCodes = jobCodes;
	}

	public void setLastUpdateBy(String lastUpdateBy) {
		this.lastUpdateBy = lastUpdateBy;
	}

	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	public void setMerchandise(Merchandise merchandise) {
		this.merchandise = merchandise;
	}

	public void setMessages(ArrayList<Message> messages) {
		this.messages = messages;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public void setParts(ArrayList<Parts> parts) {
		this.parts = parts;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public void setPaymentTotalInformation(
			PaymentTotalInformation paymentTotalInformation) {
		this.paymentTotalInformation = paymentTotalInformation;
	}

	public void setPreferredContacts(ArrayList<PreferredContact> preferredContacts) {
		this.preferredContacts = preferredContacts;
	}

	public void setPreviousAttempts(ArrayList<PreviousAttempts> previousAttempts) {
		this.previousAttempts = previousAttempts;
	}

	public void setProviderId(String providerId) {
		this.providerId = providerId;
	}

	public void setServiceInfo(ServiceInfo serviceInfo) {
		this.serviceInfo = serviceInfo;
	}
	
	public void setServiceUnit(String serviceUnit) {
		this.serviceUnit = serviceUnit;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public ArrayList<UserDefinedField> getUserDefinedFields() {
		return userDefinedFields;
	}

	public void setUserDefinedFields(ArrayList<UserDefinedField> userDefinedFields) {
		this.userDefinedFields = userDefinedFields;
	}

}
