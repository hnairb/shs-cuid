package com.searshc.cuid.cuidservice.java.orderresponse;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PreviousAttempts {
	private String arriveTime;

	private String callCode;

	private String callDate;

	private String endTime;

	private String techComments;

	private Technician technician;

	private int transitTime;

	public String getArriveTime() {
		return arriveTime;
	}

	public void setArriveTime(String arriveTime) {
		this.arriveTime = arriveTime;
	}

	public String getCallCode() {
		return callCode;
	}

	public void setCallCode(String callCode) {
		this.callCode = callCode;
	}

	public String getCallDate() {
		return callDate;
	}

	public void setCallDate(String callDate) {
		this.callDate = callDate;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getTechComments() {
		return techComments;
	}

	public void setTechComments(String techComments) {
		this.techComments = techComments;
	}

	public Technician getTechnician() {
		return technician;
	}

	public void setTechnician(Technician technician) {
		this.technician = technician;
	}

	public int getTransitTime() {
		return transitTime;
	}

	public void setTransitTime(int transitTime) {
		this.transitTime = transitTime;
	}

}
