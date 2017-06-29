package com.searshc.hs.agreement.agreementservice.domain;


public class AddTotals {

	private int grossAmt;
	private int discAmt;
	private int assocDiscAmt;
	private int netAmt;
	private int taxAmt;
	private int totalAmt;
	private int cvrCreditAmt;
	private int cvrCreditTaxAmt;
	private int sywrPoints;
	private int sywrDollars;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AddTotals [grossAmt=");
		builder.append(grossAmt);
		builder.append(", discAmt=");
		builder.append(discAmt);
		builder.append(", assocDiscAmt=");
		builder.append(assocDiscAmt);
		builder.append(", netAmt=");
		builder.append(netAmt);
		builder.append(", taxAmt=");
		builder.append(taxAmt);
		builder.append(", totalAmt=");
		builder.append(totalAmt);
		builder.append(", cvrCreditAmt=");
		builder.append(cvrCreditAmt);
		builder.append(", cvrCreditTaxAmt=");
		builder.append(cvrCreditTaxAmt);
		builder.append(", sywrPoints=");
		builder.append(sywrPoints);
		builder.append(", sywrDollars=");
		builder.append(sywrDollars);
		builder.append("]");
		return builder.toString();
	}

	public int getAssocDiscAmt() {
		return assocDiscAmt;
	}

	public void setAssocDiscAmt(int assocDiscAmt) {
		this.assocDiscAmt = assocDiscAmt;
	}

	public int getDiscAmt() {
		return discAmt;
	}

	public void setDiscAmt(int discAmt) {
		this.discAmt = discAmt;
	}

	public int getGrossAmt() {
		return grossAmt;
	}

	public void setGrossAmt(int grossAmt) {
		this.grossAmt = grossAmt;
	}

	public int getNetAmt() {
		return netAmt;
	}

	public void setNetAmt(int netAmt) {
		this.netAmt = netAmt;
	}

	public int getTaxAmt() {
		return taxAmt;
	}

	public void setTaxAmt(int taxAmt) {
		this.taxAmt = taxAmt;
	}

	public int getTotalAmt() {
		return totalAmt;
	}

	public void setTotalAmt(int totalAmt) {
		this.totalAmt = totalAmt;
	}

	public int getCvrCreditAmt() {
		return cvrCreditAmt;
	}

	public void setCvrCreditAmt(int cvrCreditAmt) {
		this.cvrCreditAmt = cvrCreditAmt;
	}

	public int getCvrCreditTaxAmt() {
		return cvrCreditTaxAmt;
	}

	public void setCvrCreditTaxAmt(int cvrCreditTaxAmt) {
		this.cvrCreditTaxAmt = cvrCreditTaxAmt;
	}

	public int getSywrPoints() {
		return sywrPoints;
	}

	public void setSywrPoints(int sywrPoints) {
		this.sywrPoints = sywrPoints;
	}

	public int getSywrDollars() {
		return sywrDollars;
	}

	public void setSywrDollars(int sywrDollars) {
		this.sywrDollars = sywrDollars;
	}

	public int addGrossAmt(String val) {
		try {
			grossAmt += Integer.parseInt(val);
		} catch (Exception e) {
		}
		return grossAmt;
	}

	public int addDiscAmt(String val) {
		try {
			discAmt += Integer.parseInt(val);
		} catch (Exception e) {
		}
		return discAmt;
	}

	public int addAssocDiscAmt(String val) {
		try {
			assocDiscAmt += Integer.parseInt(val);
		} catch (Exception e) {
		}
		return assocDiscAmt;
	}

	public int addNetAmt(String val) {
		try {
			netAmt += Integer.parseInt(val);
		} catch (Exception e) {
		}
		return netAmt;
	}

	public int addTaxAmt(String val) {
		try {
			taxAmt += Integer.parseInt(val);
		} catch (Exception e) {
		}
		return taxAmt;
	}

	public int addTotalAmt(String val) {
		try {
			totalAmt += Integer.parseInt(val);
		} catch (Exception e) {
		}
		return totalAmt;
	}

	public int addCvrCreditAmt(String val) {
		try {
			cvrCreditAmt += Integer.parseInt(val);
		} catch (Exception e) {
		}
		return cvrCreditAmt;
	}

	public int addCvrCreditTaxAmt(String val) {
		try {
			cvrCreditTaxAmt += Integer.parseInt(val);
		} catch (Exception e) {
		}
		return cvrCreditTaxAmt;
	}

	public int addSywrPoints(String val) {
		try {
			sywrPoints += Integer.parseInt(val);
		} catch (Exception e) {
		}
		return sywrPoints;
	}

	public int addSywrDollars(String val) {
		try {
			sywrDollars += Integer.parseInt(val);
		} catch (Exception e) {
		}
		return sywrDollars;
	}

}
