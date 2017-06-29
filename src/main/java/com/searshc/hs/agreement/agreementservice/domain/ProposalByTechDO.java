
package com.searshc.hs.agreement.agreementservice.domain;


public class ProposalByTechDO extends BaseLeadDO {

	private String serviceOrderNo;
	private String unitNo;
	private String techAssocNo;
	private String callDate;

	protected ProposalByTechDO(LeadKeyDO key) {
		super(key);
		// TODO Auto-generated constructor stub
	}

	public ProposalByTechDO() {
		super();
	}

	/**
	 * @return the callDate
	 */
	public String getCallDate() {
		return callDate;
	}

	/**
	 * @return the serviceOrderNo
	 */
	public String getServiceOrderNo() {
		return serviceOrderNo;
	}

	/**
	 * @return the techAssocNo
	 */
	public String getTechAssocNo() {
		return techAssocNo;
	}

	/**
	 * @return the unitNo
	 */
	public String getUnitNo() {
		return unitNo;
	}

	/**
	 * @param callDate
	 *            the callDate to set
	 */
	public void setCallDate(String callDate) {
		this.callDate = callDate;
	}

	/**
	 * @param serviceOrderNo
	 *            the serviceOrderNo to set
	 */
	public void setServiceOrderNo(String serviceOrderNo) {
		this.serviceOrderNo = serviceOrderNo;
	}

	/**
	 * @param techAssocNo
	 *            the techAssocNo to set
	 */
	public void setTechAssocNo(String techAssocNo) {
		this.techAssocNo = techAssocNo;
	}

	/**
	 * @param unitNo
	 *            the unitNo to set
	 */
	public void setUnitNo(String unitNo) {
		this.unitNo = unitNo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ProposalByTechDO [serviceOrderNo=");
		builder.append(serviceOrderNo);
		builder.append(", unitNo=");
		builder.append(unitNo);
		builder.append(", techAssocNo=");
		builder.append(techAssocNo);
		builder.append(", callDate=");
		builder.append(callDate);
		builder.append("]");
		return builder.toString();
	}

}
