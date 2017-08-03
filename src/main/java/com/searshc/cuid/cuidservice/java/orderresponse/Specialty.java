package com.searshc.cuid.cuidservice.java.orderresponse;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Specialty {

	  private Industry industry;

	  private String specialtyCode;

	public Industry getIndustry() {
		return industry;
	}

	public void setIndustry(Industry industry) {
		this.industry = industry;
	}

	public String getSpecialtyCode() {
		return specialtyCode;
	}

	public void setSpecialtyCode(String specialtyCode) {
		this.specialtyCode = specialtyCode;
	}

}
