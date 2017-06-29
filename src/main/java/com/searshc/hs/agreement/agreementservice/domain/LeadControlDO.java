package com.searshc.hs.agreement.agreementservice.domain;


public class LeadControlDO extends LeadControl {

	private String ncoaIndFlag;
	private String postSaleFlag;
	private String posFlag;

	/**
	 * @return the ncoaIndFlag
	 */
	public String getNcoaIndFlag() {
		return ncoaIndFlag;
	}

	/**
	 * @param ncoaIndFlag
	 *            the ncoaIndFlag to set
	 */
	public void setNcoaIndFlag(String ncoaIndFlag) {
		this.ncoaIndFlag = ncoaIndFlag;
	}

	/**
	 * @return the posFlag
	 */
	public String getPosFlag() {
		return posFlag;
	}

	/**
	 * @param posFlag
	 *            the posFlag to set
	 */
	public void setPosFlag(String posFlag) {
		this.posFlag = posFlag;
	}

	/**
	 * @return the postSaleFlag
	 */
	public String getPostSaleFlag() {
		return postSaleFlag;
	}

	/**
	 * @param postSaleFlag
	 *            the postSaleFlag to set
	 */
	public void setPostSaleFlag(String postSaleFlag) {
		this.postSaleFlag = postSaleFlag;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LeadControlDO [ncoaIndFlag=");
		builder.append(ncoaIndFlag);
		builder.append(", postSaleFlag=");
		builder.append(postSaleFlag);
		builder.append(", posFlag=");
		builder.append(posFlag);
		builder.append("]");
		return builder.toString();
	}

}
