package com.searshc.cuid.cuidservice.java.orderresponse;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Parts {
	private Coverage coverage;

	private String dateUsed;

	private String description;

	private String div;

	private String location;

	private String number;

	private Obligor obligor;

	private String originalPoNo;

	private String pls;

	private double price;

	private int quantity;

	private int sequence;

	private String status;

	private SubComponent subComponent;

	public Coverage getCoverage() {
		return coverage;
	}

	public void setCoverage(Coverage coverage) {
		this.coverage = coverage;
	}

	public String getDateUsed() {
		return dateUsed;
	}

	public void setDateUsed(String dateUsed) {
		this.dateUsed = dateUsed;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDiv() {
		return div;
	}

	public void setDiv(String div) {
		this.div = div;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Obligor getObligor() {
		return obligor;
	}

	public void setObligor(Obligor obligor) {
		this.obligor = obligor;
	}

	public String getOriginalPoNo() {
		return originalPoNo;
	}

	public void setOriginalPoNo(String originalPoNo) {
		this.originalPoNo = originalPoNo;
	}

	public String getPls() {
		return pls;
	}

	public void setPls(String pls) {
		this.pls = pls;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getSequence() {
		return sequence;
	}

	public void setSequence(int sequence) {
		this.sequence = sequence;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public SubComponent getSubComponent() {
		return subComponent;
	}

	public void setSubComponent(SubComponent subComponent) {
		this.subComponent = subComponent;
	}

}
