package com.searshc.hs.agreement.agreementservice.domain;


public class CustomerDO extends BaseLeadDO {

	private String lastName;
	private String firstName;
	private String premCustFlag;

	protected CustomerDO(LeadKeyDO key) {
		super(key);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @return the premCustFlag
	 */
	public String getPremCustFlag() {
		return premCustFlag;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	protected void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	protected void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @param premCustFlag
	 *            the premCustFlag to set
	 */
	protected void setPremCustFlag(String premCustFlag) {
		this.premCustFlag = premCustFlag;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CustomerDO [lastName=");
		builder.append(lastName);
		builder.append(", firstName=");
		builder.append(firstName);
		builder.append(", premCustFlag=");
		builder.append(premCustFlag);
		builder.append("]");
		return builder.toString();
	}

}
