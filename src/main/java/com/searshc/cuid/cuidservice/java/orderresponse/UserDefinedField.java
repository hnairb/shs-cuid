package com.searshc.cuid.cuidservice.java.orderresponse;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UserDefinedField {
	
	private String category;

	private int fieldId;

	private String fieldName;

	private String fieldValue;

	private int lineItemId;

	private String lineItemXref;

	private String profiledFlag;

	private int ruleId;

	private String userId;

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getFieldId() {
		return fieldId;
	}

	public void setFieldId(int fieldId) {
		this.fieldId = fieldId;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getFieldValue() {
		return fieldValue;
	}

	public void setFieldValue(String fieldValue) {
		this.fieldValue = fieldValue;
	}

	public int getLineItemId() {
		return lineItemId;
	}

	public void setLineItemId(int lineItemId) {
		this.lineItemId = lineItemId;
	}

	public String getLineItemXref() {
		return lineItemXref;
	}

	public void setLineItemXref(String lineItemXref) {
		this.lineItemXref = lineItemXref;
	}

	public String getProfiledFlag() {
		return profiledFlag;
	}

	public void setProfiledFlag(String profiledFlag) {
		this.profiledFlag = profiledFlag;
	}

	public int getRuleId() {
		return ruleId;
	}

	public void setRuleId(int ruleId) {
		this.ruleId = ruleId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}


}
