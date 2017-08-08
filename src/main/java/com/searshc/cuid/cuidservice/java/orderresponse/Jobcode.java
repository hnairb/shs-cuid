package com.searshc.cuid.cuidservice.java.orderresponse;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Jobcode {
	private int chargeAmount;

	private String chargeCode;

	private Coverage coverage;

	private String description;

	private String jobCode;

	private Obligor obligor;

	private String relatedFl;

	private int sequence;

	private SubComp subComp;

	public int getChargeAmount() {
		return chargeAmount;
	}

	public void setChargeAmount(int chargeAmount) {
		this.chargeAmount = chargeAmount;
	}

	public String getChargeCode() {
		return chargeCode;
	}

	public void setChargeCode(String chargeCode) {
		this.chargeCode = chargeCode;
	}

	public Coverage getCoverage() {
		return coverage;
	}

	public void setCoverage(Coverage coverage) {
		this.coverage = coverage;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getJobCode() {
		return jobCode;
	}

	public void setJobCode(String jobCode) {
		this.jobCode = jobCode;
	}

	public Obligor getObligor() {
		return obligor;
	}

	public void setObligor(Obligor obligor) {
		this.obligor = obligor;
	}

	public String getRelatedFl() {
		return relatedFl;
	}

	public void setRelatedFl(String relatedFl) {
		this.relatedFl = relatedFl;
	}

	public int getSequence() {
		return sequence;
	}

	public void setSequence(int sequence) {
		this.sequence = sequence;
	}

	public SubComp getSubComp() {
		return subComp;
	}

	public void setSubComp(SubComp subComp) {
		this.subComp = subComp;
	}

}
