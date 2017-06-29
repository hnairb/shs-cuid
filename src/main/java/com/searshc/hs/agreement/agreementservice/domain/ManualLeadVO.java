package com.searshc.hs.agreement.agreementservice.domain;


public class ManualLeadVO {

	private LeadKeyDO key = new LeadKeyDO();

	private InboundLeadDO inboundLeadDO = new InboundLeadDO(key);
	private CustomerDO customerDO = new CustomerDO(key);
	private PhoneAddressDO phoneAddressDO = new PhoneAddressDO(key);
	private ProposalByTechDO proposalByTechDO = new ProposalByTechDO(key);

	public ManualLeadVO() {
		super();
	}

	// getters for retrieving data objects by DAO for stored procedures/sql
	// statements.
	/**
	 * @return the key
	 */
	public LeadKeyDO getKey() {
		return key;
	}

	/**
	 * @return the inboundLeadDO
	 */
	public InboundLeadDO getInboundLeadDO() {
		return inboundLeadDO;
	}

	/**
	 * @return the inboundOutcomeDO
	 */
	public CustomerDO getCustomerDO() {
		return customerDO;
	}

	/**
	 * @return the phoneAddressDO
	 */
	public PhoneAddressDO getPhoneAddressDO() {
		return phoneAddressDO;
	}

	/**
	 * @return the proposalByTechDO
	 */
	public ProposalByTechDO getProposalByTechDO() {
		return proposalByTechDO;
	}

	// Lead Key fields passed by reference to all DO and populated by web
	// service
	public int getLeadCustNo() {
		return key.getLeadCustNo();
	}

	public int getCustLocSuffix() {
		return key.getCustLocSuffix();
	}

	public int getLeadNo() {
		return key.getLeadNo();
	}

	public int getLeadContactNo() {
		return key.getLeadContactNo();
	}

	// setters for promotion in request to be populated by web service.

	/**
	 * @param custLocSuffix
	 * @see com.sears.hs.agreement.inbound.domain.LeadKeyDO#setCustLocSuffix(int)
	 */
	public void setCustLocSuffix(int custLocSuffix) {
		key.setCustLocSuffix(custLocSuffix);
	}

	/**
	 * @param leadContactNo
	 * @see com.sears.hs.agreement.inbound.domain.LeadKeyDO#setLeadContactNo(int)
	 */
	public void setLeadContactNo(int leadContactNo) {
		key.setLeadContactNo(leadContactNo);
	}

	/**
	 * @param leadCustNo
	 * @see com.sears.hs.agreement.inbound.domain.LeadKeyDO#setLeadCustNo(int)
	 */
	public void setLeadCustNo(int leadCustNo) {
		key.setLeadCustNo(leadCustNo);
	}

	/**
	 * @param leadNo
	 * @see com.sears.hs.agreement.inbound.domain.LeadKeyDO#setLeadNo(int)
	 */
	public void setLeadNo(int leadNo) {
		key.setLeadNo(leadNo);
	}

	/**
	 * @param callDate
	 *            the callDate to set
	 */
	public void setCallDate(String callDate) {
		proposalByTechDO.setCallDate(callDate);
	}

	/**
	 * @param serviceOrderNo
	 *            the serviceOrderNo to set
	 */
	public void setServiceOrderNo(String serviceOrderNo) {
		proposalByTechDO.setServiceOrderNo(serviceOrderNo);
	}

	/**
	 * @param techAssocNo
	 *            the techAssocNo to set
	 */
	public void setTechAssocNo(String techAssocNo) {
		proposalByTechDO.setTechAssocNo(techAssocNo);
	}

	/**
	 * @param unitNo
	 *            the unitNo to set
	 */
	public void setUnitNo(String unitNo) {
		proposalByTechDO.setUnitNo(unitNo);
	}

	/**
	 * @param cityName
	 *            the cityName to set
	 */
	public void setCityName(String cityName) {
		phoneAddressDO.setCityName(cityName);
	}

	/**
	 * @param phoneAreaCd
	 *            the phoneAreaCd to set
	 */
	public void setPhoneAreaCd(String phoneAreaCd) {
		phoneAddressDO.setPhoneAreaCd(phoneAreaCd);
	}

	/**
	 * @param phoneExchange
	 *            the phoneExchange to set
	 */
	public void setPhoneExchange(String phoneExchange) {
		phoneAddressDO.setPhoneExchange(phoneExchange);
	}

	/**
	 * @param phoneNumber
	 *            the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		phoneAddressDO.setPhoneNumber(phoneNumber);
	}

	/**
	 * @param serviceFacUnitNo
	 *            the serviceFacUnitNo to set
	 */
	public void setServiceFacUnitNo(String serviceFacUnitNo) {
		phoneAddressDO.setServiceFacUnitNo(serviceFacUnitNo);
	}

	/**
	 * @param stateCd
	 *            the stateCd to set
	 */
	public void setStateCd(String stateCd) {
		phoneAddressDO.setStateCd(stateCd);
	}

	/**
	 * @param streetAddress
	 *            the streetAddress to set
	 */
	public void setStreetAddress(String streetAddress) {
		phoneAddressDO.setStreetAddress(streetAddress);
	}

	/**
	 * @param zipCd
	 *            the zipCd to set
	 */
	public void setZipCd(String zipCd) {
		phoneAddressDO.setZipCd(zipCd);
	}

	/**
	 * @param zipExtCd
	 *            the zipExtCd to setSS
	 */
	public void setZipExtCd(String zipExtCd) {
		phoneAddressDO.setZipExtCd(zipExtCd);
	}

	/**
	 * @param autrhorizedContactDt
	 *            the autrhorizedContactDt to set
	 */
	public void setAutrhorizedContactDt(String autrhorizedContactDt) {
		inboundLeadDO.setAutrhorizedContactDt(autrhorizedContactDt);
	}

	/**
	 * @param contactMethodCd
	 *            the contactMethodCd to set
	 */
	public void setContactMethodCd(String contactMethodCd) {
		inboundLeadDO.setContactMethodCd(contactMethodCd);
	}

	/**
	 * @param contactReasonCd
	 *            the contactReasonCd to set
	 */
	public void setContactReasonCd(String contactReasonCd) {
		inboundLeadDO.setContactReasonCd(contactReasonCd);
	}

	/**
	 * @param contactReasonCd
	 *            the contactReasonCd to set
	 */
	public void setSubContactReasonCd(String subContactReasonCd) {
		inboundLeadDO.setSubContactReasonCd(subContactReasonCd);
	}

	/**
	 * @param earliestCoverageStartDt
	 *            the earliestCoverageStartDt to set
	 */
	public void setEarliestCoverageStartDt(String earliestCoverageStartDt) {
		inboundLeadDO.setEarliestCoverageStartDt(earliestCoverageStartDt);
	}

	/**
	 * @param leadScore
	 *            the leadScore to set
	 */
	public void setLeadScore(int leadScore) {
		inboundLeadDO.setLeadScore(leadScore);
	}

	/**
	 * @param numberApplicancesOwn
	 *            the numberApplicancesOwn to set
	 */
	public void setNumberApplicancesOwn(int numberApplicancesOwn) {
		inboundLeadDO.setNumberApplicancesOwn(numberApplicancesOwn);
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		customerDO.setFirstName(firstName);
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		customerDO.setLastName(lastName);
	}

	/**
	 * @param premCustFlag
	 *            the premCustFlag to set
	 */
	public void setPremCustFlag(String premCustFlag) {
		customerDO.setPremCustFlag(premCustFlag);
	}

	/**
	 * @param segmentNo
	 *            the segmentNo to set
	 */
	public void setSegmentNo(String segmentNo) {
		inboundLeadDO.setSegmentNo(segmentNo);
	}

	// getters for promotion in request to be populated by web service.
	/**
	 * @return
	 * @see com.sears.hs.agreement.inbound.domain.InboundLeadDO#getAutrhorizedContactDt()
	 */
	public String getAutrhorizedContactDt() {
		return inboundLeadDO.getAutrhorizedContactDt();
	}

	/**
	 * @return
	 * @see com.sears.hs.agreement.inbound.domain.InboundLeadDO#getContactMethodCd()
	 */
	public String getContactMethodCd() {
		return inboundLeadDO.getContactMethodCd();
	}

	/**
	 * @return
	 * @see com.sears.hs.agreement.inbound.domain.InboundLeadDO#getContactReasonCd()
	 */
	public String getContactReasonCd() {
		return inboundLeadDO.getContactReasonCd();
	}

	/**
	 * @return
	 * @see com.sears.hs.agreement.inbound.domain.InboundLeadDO#getContactReasonCd()
	 */
	public String getSubContactReasonCd() {
		return inboundLeadDO.getSubContactReasonCd();
	}

	/**
	 * @return
	 * @see com.sears.hs.agreement.inbound.domain.InboundLeadDO#getEarliestCoverageStartDt()
	 */
	public String getEarliestCoverageStartDt() {
		return inboundLeadDO.getEarliestCoverageStartDt();
	}

	/**
	 * @return
	 * @see com.sears.hs.agreement.inbound.domain.InboundLeadDO#getLeadScore()
	 */
	public int getLeadScore() {
		return inboundLeadDO.getLeadScore();
	}

	/**
	 * @return
	 * @see com.sears.hs.agreement.inbound.domain.InboundLeadDO#getNumberApplicancesOwn()
	 */
	public int getNumberApplicancesOwn() {
		return inboundLeadDO.getNumberApplicancesOwn();
	}

	/**
	 * @return
	 * @see com.sears.hs.agreement.inbound.domain.InboundLeadDO#getSegmentNo()
	 */
	public String getSegmentNo() {
		return inboundLeadDO.getSegmentNo();
	}

	/**
	 * @return
	 * @see com.sears.hs.agreement.inbound.domain.CustomerDO#getFirstName()
	 */
	public String getFirstName() {
		return customerDO.getFirstName();
	}

	/**
	 * @return
	 * @see com.sears.hs.agreement.inbound.domain.CustomerDO#getLastName()
	 */
	public String getLastName() {
		return customerDO.getLastName();
	}

	/**
	 * @return
	 * @see com.sears.hs.agreement.inbound.domain.CustomerDO#getPremCustFlag()
	 */
	public String getPremCustFlag() {
		return customerDO.getPremCustFlag();
	}

	/**
	 * @return
	 * @see com.sears.hs.agreement.inbound.domain.PhoneAddressDO#getCityName()
	 */
	public String getCityName() {
		return phoneAddressDO.getCityName();
	}

	/**
	 * @return
	 * @see com.sears.hs.agreement.inbound.domain.PhoneAddressDO#getPhoneAreaCd()
	 */
	public String getPhoneAreaCd() {
		return phoneAddressDO.getPhoneAreaCd();
	}

	/**
	 * @return
	 * @see com.sears.hs.agreement.inbound.domain.PhoneAddressDO#getPhoneExchange()
	 */
	public String getPhoneExchange() {
		return phoneAddressDO.getPhoneExchange();
	}

	/**
	 * @return
	 * @see com.sears.hs.agreement.inbound.domain.PhoneAddressDO#getPhoneNumber()
	 */
	public String getPhoneNumber() {
		return phoneAddressDO.getPhoneNumber();
	}

	/**
	 * @return
	 * @see com.sears.hs.agreement.inbound.domain.PhoneAddressDO#getServiceFacUnitNo()
	 */
	public String getServiceFacUnitNo() {
		return phoneAddressDO.getServiceFacUnitNo();
	}

	/**
	 * @return
	 * @see com.sears.hs.agreement.inbound.domain.PhoneAddressDO#getStateCd()
	 */
	public String getStateCd() {
		return phoneAddressDO.getStateCd();
	}

	/**
	 * @return
	 * @see com.sears.hs.agreement.inbound.domain.PhoneAddressDO#getStreetAddress()
	 */
	public String getStreetAddress() {
		return phoneAddressDO.getStreetAddress();
	}

	/**
	 * @return
	 * @see com.sears.hs.agreement.inbound.domain.PhoneAddressDO#getZipCd()
	 */
	public String getZipCd() {
		return phoneAddressDO.getZipCd();
	}

	/**
	 * @return
	 * @see com.sears.hs.agreement.inbound.domain.PhoneAddressDO#getZipExtCd()
	 */
	public String getZipExtCd() {
		return phoneAddressDO.getZipExtCd();
	}

	/**
	 * @return
	 * @see com.sears.hs.agreement.inbound.domain.ProposalByTechDO#getCallDate()
	 */
	public String getCallDate() {
		return proposalByTechDO.getCallDate();
	}

	/**
	 * @return
	 * @see com.sears.hs.agreement.inbound.domain.ProposalByTechDO#getServiceOrderNo()
	 */
	public String getServiceOrderNo() {
		return proposalByTechDO.getServiceOrderNo();
	}

	/**
	 * @return
	 * @see com.sears.hs.agreement.inbound.domain.ProposalByTechDO#getTechAssocNo()
	 */
	public String getTechAssocNo() {
		return proposalByTechDO.getTechAssocNo();
	}

	/**
	 * @return
	 * @see com.sears.hs.agreement.inbound.domain.ProposalByTechDO#getUnitNo()
	 */
	public String getUnitNo() {
		return proposalByTechDO.getUnitNo();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ManualLeadVO [key=");
		builder.append(key);
		builder.append(", inboundLeadDO=");
		builder.append(inboundLeadDO);
		builder.append(", customerDO=");
		builder.append(customerDO);
		builder.append(", phoneAddressDO=");
		builder.append(phoneAddressDO);
		builder.append(", proposalByTechDO=");
		builder.append(proposalByTechDO);
		builder.append("]");
		return builder.toString();
	}

	/**
	 * @return
	 * @see com.sears.hs.agreement.inbound.domain.InboundLeadDO#getMarketFactoryNo()
	 */
	public String getMarketFactoryNo() {
		return inboundLeadDO.getMarketFactoryNo();
	}

	/**
	 * @param marketFactoryNo
	 * @see com.sears.hs.agreement.inbound.domain.InboundLeadDO#setMarketFactoryNo(java.lang.String)
	 */
	public void setMarketFactoryNo(String marketFactoryNo) {
		inboundLeadDO.setMarketFactoryNo(marketFactoryNo);
	}

}
