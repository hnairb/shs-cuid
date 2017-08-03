package com.searshc.cuid.cuidservice.java.orderresponse;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Estimate {

	//private ArrayList<String> discount;

	private int laborTaxPerc;

	private int partsTaxPerc;

	private int regionalPriceAmt;

	private int servProdSellPrice;

	private int spTaxPerc;

	private int tripCharge;

	/*public ArrayList<String> getDiscount() {
		return discount;
	}

	public void setDiscount(ArrayList<String> discount) {
		this.discount = discount;
	}*/

	public int getLaborTaxPerc() {
		return laborTaxPerc;
	}

	public void setLaborTaxPerc(int laborTaxPerc) {
		this.laborTaxPerc = laborTaxPerc;
	}

	public int getPartsTaxPerc() {
		return partsTaxPerc;
	}

	public void setPartsTaxPerc(int partsTaxPerc) {
		this.partsTaxPerc = partsTaxPerc;
	}

	public int getRegionalPriceAmt() {
		return regionalPriceAmt;
	}

	public void setRegionalPriceAmt(int regionalPriceAmt) {
		this.regionalPriceAmt = regionalPriceAmt;
	}

	public int getServProdSellPrice() {
		return servProdSellPrice;
	}

	public void setServProdSellPrice(int servProdSellPrice) {
		this.servProdSellPrice = servProdSellPrice;
	}

	public int getSpTaxPerc() {
		return spTaxPerc;
	}

	public void setSpTaxPerc(int spTaxPerc) {
		this.spTaxPerc = spTaxPerc;
	}

	public int getTripCharge() {
		return tripCharge;
	}

	public void setTripCharge(int tripCharge) {
		this.tripCharge = tripCharge;
	}


}
