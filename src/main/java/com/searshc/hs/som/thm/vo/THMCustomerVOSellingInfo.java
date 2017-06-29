/* 
 * Copyright 2014 (C) Sears Holdings Corp  
 *  
 * Created on : 03-Mar-14
 * Author     : Ranjit Bhakta   
 * 
 *----------------------------------------------------------------------------- 
 * Revision History (Release 1.0.0.0) 
 *----------------------------------------------------------------------------- 
 * VERSION     AUTHOR/      DESCRIPTION OF CHANGE 
 * OLD/NEW     DATE                RFC NO 
 *----------------------------------------------------------------------------- 
 * --/1.0  | Ranjit Bhakta  | Initial Create. 
 *         | 03-Mar-14      | 
 *---------|--------------- |--------------------------------------------------- 
 */
package com.searshc.hs.som.thm.vo;

import java.util.Date;


/**
 * This VO class contains THM selling information
 * like agent id, agent unit no, service order no etc.
 * 
 * @author Ranjit Bhakta
 * @version 1.0, Mar 03, 2014
 *
 */
public class THMCustomerVOSellingInfo {
	private String sellingAgentId = "";
	private String sellingAgentUnitNumber = "";
	private String recordingAgentId = "";
	private String recordingAgentUnitNumber = "";
	private String serviceOrderNumber = "";
	private String serviceOrderDate = "";
	private Date serviceOrderDateAsDateForm;
	
	public String getSellingAgentId() {
		return sellingAgentId;
	}

	public void setSellingAgentId(String sellingAgentId) {
		this.sellingAgentId = sellingAgentId;
	}

	public String getSellingAgentUnitNumber() {
		return sellingAgentUnitNumber;
	}

	public void setSellingAgentUnitNumber(String sellingAgentUnitNumber) {
		this.sellingAgentUnitNumber = sellingAgentUnitNumber;
	}

	public String getRecordingAgentId() {
		return recordingAgentId;
	}

	public void setRecordingAgentId(String recordingAgentId) {
		this.recordingAgentId = recordingAgentId;
	}

	public String getRecordingAgentUnitNumber() {
		return recordingAgentUnitNumber;
	}

	public void setRecordingAgentUnitNumber(String recordingAgentUnitNumber) {
		this.recordingAgentUnitNumber = recordingAgentUnitNumber;
	}

	public String getServiceOrderNumber() {
		return serviceOrderNumber;
	}

	public void setServiceOrderNumber(String serviceOrderNumber) {
		this.serviceOrderNumber = serviceOrderNumber;
	}

	public String getServiceOrderDate() {
		return serviceOrderDate;
	}

	public void setServiceOrderDate(String serviceOrderDate) {
		this.serviceOrderDate = serviceOrderDate;
	}

	public Date getServiceOrderDateAsDateForm() {
		return serviceOrderDateAsDateForm;
	}

	public void setServiceOrderDateAsDateForm(Date serviceOrderDateAsDateForm) {
		this.serviceOrderDateAsDateForm = serviceOrderDateAsDateForm;
	}
}