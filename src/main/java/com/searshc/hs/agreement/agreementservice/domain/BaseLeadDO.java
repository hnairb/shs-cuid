package com.searshc.hs.agreement.agreementservice.domain;


public abstract class BaseLeadDO {
	protected LeadKeyDO key = null;

	public BaseLeadDO() {
		super();
	}

	protected BaseLeadDO(LeadKeyDO key) {
		super();
		this.key = key;
	}

	/**
	 * @return
	 * @see com.sears.hs.agreement.inbound.domain.LeadKeyDO#getCustLocSuffix()
	 */
	public int getCustLocSuffix() {
		return key.getCustLocSuffix();
	}

	/**
	 * @return
	 * @see com.sears.hs.agreement.inbound.domain.LeadKeyDO#getLeadCustNo()
	 */
	public int getLeadCustNo() {
		return key.getLeadCustNo();
	}

	/**
	 * @return
	 * @see com.sears.hs.agreement.inbound.domain.LeadKeyDO#getCustLocSuffix()
	 */
	public int getLeadNo() {
		return key.getLeadNo();
	}

	/**
	 * @return
	 * @see com.sears.hs.agreement.inbound.domain.LeadKeyDO#getLeadCustNo()
	 */
	public int getLeadContactNo() {
		return key.getLeadContactNo();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BaseLeadDO [key=");
		builder.append(key);
		builder.append("]");
		return builder.toString();
	}

}
