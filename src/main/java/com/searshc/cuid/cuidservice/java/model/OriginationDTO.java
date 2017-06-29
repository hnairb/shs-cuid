package com.searshc.cuid.cuidservice.java.model;

//This class holds data for gg.npjxtco in Greenplum
public class OriginationDTO {

	public String customerId;
	public String timestamp;
	public String optype;
	public String locationSuffix;
	public String originationCode;
	
	
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public String getOptype() {
		return optype;
	}
	public void setOptype(String optype) {
		this.optype = optype;
	}
	public String getLocationSuffix() {
		return locationSuffix;
	}
	public void setLocationSuffix(String locationSuffix) {
		this.locationSuffix = locationSuffix;
	}
	public String getOriginationCode() {
		return originationCode;
	}
	public void setOriginationCode(String originationCode) {
		this.originationCode = originationCode;
	}
}
