package com.searshc.cuid.cuidservice.java.orderresponse;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ServiceInfo {
	
	private String svcRequestedText;

	private String serviceSpecialInstructions;

	private String recallFlag;

	private String svcProvidedCode;

	private ThirdPartyInfo thirdPartyInfo;

	private String emergencyFlag;

	private String orderType;

	private String routeType;

	private SiteRepairInfo siteRepairInfo;

	private String scheduledStartTime;

	private String scheduledEndTime;

	//private ArrayList<String> helpers;

	private ServiceOrg serviceOrg;

	private Coverage coverage;

	private PartsCoverage partsCoverage;

	private String promiseDate;

	private String originationCode;

	private String helperType;

	public String getSvcRequestedText() {
		return svcRequestedText;
	}

	public void setSvcRequestedText(String svcRequestedText) {
		this.svcRequestedText = svcRequestedText;
	}

	public String getServiceSpecialInstructions() {
		return serviceSpecialInstructions;
	}

	public void setServiceSpecialInstructions(String serviceSpecialInstructions) {
		this.serviceSpecialInstructions = serviceSpecialInstructions;
	}

	public String getRecallFlag() {
		return recallFlag;
	}

	public void setRecallFlag(String recallFlag) {
		this.recallFlag = recallFlag;
	}

	public String getSvcProvidedCode() {
		return svcProvidedCode;
	}

	public void setSvcProvidedCode(String svcProvidedCode) {
		this.svcProvidedCode = svcProvidedCode;
	}

	public ThirdPartyInfo getThirdPartyInfo() {
		return thirdPartyInfo;
	}

	public void setThirdPartyInfo(ThirdPartyInfo thirdPartyInfo) {
		this.thirdPartyInfo = thirdPartyInfo;
	}

	public String getEmergencyFlag() {
		return emergencyFlag;
	}

	public void setEmergencyFlag(String emergencyFlag) {
		this.emergencyFlag = emergencyFlag;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getRouteType() {
		return routeType;
	}

	public void setRouteType(String routeType) {
		this.routeType = routeType;
	}

	public SiteRepairInfo getSiteRepairInfo() {
		return siteRepairInfo;
	}

	public void setSiteRepairInfo(SiteRepairInfo siteRepairInfo) {
		this.siteRepairInfo = siteRepairInfo;
	}

	public String getScheduledStartTime() {
		return scheduledStartTime;
	}

	public void setScheduledStartTime(String scheduledStartTime) {
		this.scheduledStartTime = scheduledStartTime;
	}

	public String getScheduledEndTime() {
		return scheduledEndTime;
	}

	public void setScheduledEndTime(String scheduledEndTime) {
		this.scheduledEndTime = scheduledEndTime;
	}

	/*public ArrayList<String> getHelpers() {
		return helpers;
	}

	public void setHelpers(ArrayList<String> helpers) {
		this.helpers = helpers;
	}*/

	public ServiceOrg getServiceOrg() {
		return serviceOrg;
	}

	public void setServiceOrg(ServiceOrg serviceOrg) {
		this.serviceOrg = serviceOrg;
	}

	public Coverage getCoverage() {
		return coverage;
	}

	public void setCoverage(Coverage coverage) {
		this.coverage = coverage;
	}

	public PartsCoverage getPartsCoverage() {
		return partsCoverage;
	}

	public void setPartsCoverage(PartsCoverage partsCoverage) {
		this.partsCoverage = partsCoverage;
	}

	public String getPromiseDate() {
		return promiseDate;
	}

	public void setPromiseDate(String promiseDate) {
		this.promiseDate = promiseDate;
	}

	public String getOriginationCode() {
		return originationCode;
	}

	public void setOriginationCode(String originationCode) {
		this.originationCode = originationCode;
	}

	public String getHelperType() {
		return helperType;
	}

	public void setHelperType(String helperType) {
		this.helperType = helperType;
	}

}
