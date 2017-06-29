package com.searshc.hs.agreement.agreementservice.domain;


public class LeadKeyDO {

	private int leadCustNo;
	private int custLocSuffix;
	private int leadNo;
	private int leadContactNo;

	public LeadKeyDO() {
		super();
	}

	/**
	 * @return the custLocSuffix
	 */
	public int getCustLocSuffix() {
		return custLocSuffix;
	}

	/**
	 * @param custLocSuffix
	 *            the custLocSuffix to set
	 */
	public void setCustLocSuffix(int custLocSuffix) {
		this.custLocSuffix = custLocSuffix;
	}

	/**
	 * @return the leadCustNo
	 */
	public int getLeadCustNo() {
		return leadCustNo;
	}

	/**
	 * @param leadCustNo
	 *            the leadCustNo to set
	 */
	public void setLeadCustNo(int leadCustNo) {
		this.leadCustNo = leadCustNo;
	}

	/**
	 * @return the leadContactNo
	 */
	public int getLeadContactNo() {
		return leadContactNo;
	}

	/**
	 * @param leadContactNo
	 *            the leadContactNo to set
	 */
	public void setLeadContactNo(int leadContactNo) {
		this.leadContactNo = leadContactNo;
	}

	/**
	 * @return the leadNo
	 */
	public int getLeadNo() {
		return leadNo;
	}

	/**
	 * @param leadNo
	 *            the leadNo to set
	 */
	public void setLeadNo(int leadNo) {
		this.leadNo = leadNo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LeadKeyDO [leadCustNo=");
		builder.append(leadCustNo);
		builder.append(", custLocSuffix=");
		builder.append(custLocSuffix);
		builder.append(", leadNo=");
		builder.append(leadNo);
		builder.append(", leadContactNo=");
		builder.append(leadContactNo);
		builder.append("]");
		return builder.toString();
	}
}
