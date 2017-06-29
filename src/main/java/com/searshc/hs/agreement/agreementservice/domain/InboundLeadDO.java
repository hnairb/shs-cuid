package com.searshc.hs.agreement.agreementservice.domain;


public class InboundLeadDO extends BaseLeadDO {

	private String segmentNo;
	private int leadScore;
	private String contactMethodCd;
	private String contactReasonCd;
	private String subContactReasonCd;
	private int numberApplicancesOwn;
	private String earliestCoverageStartDt;
	private String autrhorizedContactDt;
	private String marketFactoryNo;

	/*
	 * public InboundLeadDO(int leadCustNo, int custLocSuffix, int leadNo, int
	 * leadContactNo, String segmentNo, int leadScore, String contactMethodCd,
	 * String contactReasonCd, int numberApplicancesOwn, Date
	 * earliestCoverageStartDt, Date autrhorizedContactDt, String
	 * currentLeadStatusCd, String currentLeadQueueNamecd, Date posProcessDt,
	 * String salesAssocFacilityIdNo, String salesAssocIdNo, String
	 * lastPersonSpokenTo, String salePosFlag, String onlinePostSaleFlag, String
	 * ncoaIndicator) { this.leadNo = leadNo; this.leadContactNo =
	 * leadContactNo; this.segmentNo = segmentNo; this.leadScore = leadScore;
	 * this.contactMethodCd = contactMethodCd; this.contactReasonCd =
	 * contactReasonCd; this.numberApplicancesOwn = numberApplicancesOwn;
	 * this.earliestCoverageStartDt = earliestCoverageStartDt;
	 * this.autrhorizedContactDt = autrhorizedContactDt;
	 * this.currentLeadStatusCd = currentLeadStatusCd;
	 * this.currentLeadQueueNamecd = currentLeadQueueNamecd; this.posProcessDt =
	 * posProcessDt; this.salesAssocFacilityIdNo = salesAssocFacilityIdNo;
	 * this.salesAssocIdNo = salesAssocIdNo; this.lastPersonSpokenTo =
	 * lastPersonSpokenTo; this.salePosFlag = salePosFlag;
	 * this.onlinePostSaleFlag = onlinePostSaleFlag; this.ncoaIndicator =
	 * ncoaIndicator; }
	 */

	protected InboundLeadDO(LeadKeyDO key) {
		super(key);
	}

	/**
	 * @return the autrhorizedContactDt
	 */
	public String getAutrhorizedContactDt() {
		return autrhorizedContactDt;
	}

	/**
	 * @return the contactMethodCd
	 */
	public String getContactMethodCd() {
		return contactMethodCd;
	}

	/**
	 * @return the contactReasonCd
	 */
	public String getContactReasonCd() {
		return contactReasonCd;
	}

	/**
	 * @return the subContactReasonCd
	 */
	public String getSubContactReasonCd() {
		return subContactReasonCd;
	}

	/**
	 * @return the earliestCoverageStartDt
	 */
	public String getEarliestCoverageStartDt() {
		return earliestCoverageStartDt;
	}

	/**
	 * @return the leadScore
	 */
	public int getLeadScore() {
		return leadScore;
	}

	/**
	 * @return the numberApplicancesOwn
	 */
	public int getNumberApplicancesOwn() {
		return numberApplicancesOwn;
	}

	/**
	 * @return the segmentNo
	 */
	public String getSegmentNo() {
		return segmentNo;
	}

	/**
	 * @param autrhorizedContactDt
	 *            the autrhorizedContactDt to set
	 */
	protected void setAutrhorizedContactDt(String autrhorizedContactDt) {
		this.autrhorizedContactDt = autrhorizedContactDt;
	}

	/**
	 * @param contactMethodCd
	 *            the contactMethodCd to set
	 */
	protected void setContactMethodCd(String contactMethodCd) {
		this.contactMethodCd = contactMethodCd;
	}

	/**
	 * @param contactReasonCd
	 *            the contactReasonCd to set
	 */
	protected void setContactReasonCd(String contactReasonCd) {
		this.contactReasonCd = contactReasonCd;
	}

	/**
	 * @param contactReasonCd
	 *            the contactReasonCd to set
	 */
	protected void setSubContactReasonCd(String subContactReasonCd) {
		this.subContactReasonCd = subContactReasonCd;
	}

	/**
	 * @param earliestCoverageStartDt
	 *            the earliestCoverageStartDt to set
	 */
	protected void setEarliestCoverageStartDt(String earliestCoverageStartDt) {
		this.earliestCoverageStartDt = earliestCoverageStartDt;
	}

	/**
	 * @param leadScore
	 *            the leadScore to set
	 */
	protected void setLeadScore(int leadScore) {
		this.leadScore = leadScore;
	}

	/**
	 * @param numberApplicancesOwn
	 *            the numberApplicancesOwn to set
	 */
	protected void setNumberApplicancesOwn(int numberApplicancesOwn) {
		this.numberApplicancesOwn = numberApplicancesOwn;
	}

	/**
	 * @param segmentNo
	 *            the segmentNo to set
	 */
	protected void setSegmentNo(String segmentNo) {
		this.segmentNo = segmentNo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("InboundLeadDO [segmentNo=");
		builder.append(segmentNo);
		builder.append(", leadScore=");
		builder.append(leadScore);
		builder.append(", contactMethodCd=");
		builder.append(contactMethodCd);
		builder.append(", contactReasonCd=");
		builder.append(contactReasonCd);
		builder.append(", subContactReasonCd=");
		builder.append(subContactReasonCd);
		builder.append(", numberApplicancesOwn=");
		builder.append(numberApplicancesOwn);
		builder.append(", earliestCoverageStartDt=");
		builder.append(earliestCoverageStartDt);
		builder.append(", autrhorizedContactDt=");
		builder.append(autrhorizedContactDt);
		builder.append(", marketFactoryNo=");
		builder.append(marketFactoryNo);
		builder.append("]");
		return builder.toString();
	}

	/**
	 * @return the marketFactoryNo
	 */
	public String getMarketFactoryNo() {
		return marketFactoryNo;
	}

	/**
	 * @param marketFactoryNo
	 *            the marketFactoryNo to set
	 */
	public void setMarketFactoryNo(String marketFactoryNo) {
		this.marketFactoryNo = marketFactoryNo;
	}

}
