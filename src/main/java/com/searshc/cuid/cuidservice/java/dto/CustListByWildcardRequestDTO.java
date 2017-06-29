package com.searshc.cuid.cuidservice.java.dto;

import java.util.List;

public class CustListByWildcardRequestDTO {
	private List<String> fieldList;

	private List<String> fieldValues;
	
	private String operator;

	public List<String> getFieldList() {
		return fieldList;
	}

	public void setFieldList(List<String> fieldList) {
		this.fieldList = fieldList;
	}

	public List<String> getFieldValues() {
		return fieldValues;
	}

	public void setFieldValues(List<String> fieldValues) {
		this.fieldValues = fieldValues;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}
}
