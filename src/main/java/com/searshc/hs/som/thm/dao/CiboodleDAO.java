/* 
 * Copyright 2014 (C) Sears Holdings Corp  
 *  
 * Created on : 04-Mar-14
 * Author     : Ranjit Bhakta   
 * 
 *----------------------------------------------------------------------------- 
 * Revision History (Release 1.0.0.0) 
 *----------------------------------------------------------------------------- 
 * VERSION     AUTHOR/      DESCRIPTION OF CHANGE 
 * OLD/NEW     DATE                RFC NO 
 *----------------------------------------------------------------------------- 
 * --/1.0  | Ranjit Bhakta  | Initial Create. 
 *         | 04-Mar-14      | 
 *---------|--------------- |--------------------------------------------------- 
 */
package com.searshc.hs.som.thm.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.searshc.hs.som.thm.vo.THMCustomerVOSellingInfo;

/**
 * This DAO is used to access Ciboodle tables
 * 
 * @author Ranjit Bhakta
 * @version 1.0, Mar 04, 2014
 */
public class CiboodleDAO {
	private static final Logger logger = LoggerFactory.getLogger(CiboodleDAO.class);
	
	private String hwpSalesQuery;
	
	private String hwpProductCodeQuery;
	
	private String hwpProductIdQuery;

	private JdbcTemplate jdbcTemplate;
	
	/**
	 * Get sells info from SEARS_HWP_SALE table
	 * 
	 * @param customerKey customer key of the customer
	 * @param contractNumber customer contract no
	 * @return sells info
	 */
	public THMCustomerVOSellingInfo getSelliingInfo(int customerKey, String contractNumber) {
		logger.info("Fetching selling info from database started for customer " +
				"with customer key " + customerKey);
		
		THMCustomerVOSellingInfo thmCustomerVOSellingInfo = null;
		
		try{      
			thmCustomerVOSellingInfo = jdbcTemplate.queryForObject(hwpSalesQuery, new Object[] { customerKey, contractNumber },
		         new RowMapper<THMCustomerVOSellingInfo>() {

			         @Override
			         public THMCustomerVOSellingInfo mapRow(ResultSet rs, int rowNum) throws SQLException {
			         	THMCustomerVOSellingInfo thmCustomerVOSellingInfo = new THMCustomerVOSellingInfo();
			         	
			         	String sellingAgentId = rs.getString(1);
			         	String sellingAgentUnitNumber = rs.getString(2);
			         	String recordingAgentId = rs.getString(3);
			         	String recordingAgentUnitNumber = rs.getString(4);
			         	String serviceOrderNumber = rs.getString(5);
			         	Date serviceOrderDateAsDateForm = rs.getDate(6);
			         	
			         	if(!StringUtils.isEmpty(StringUtils.trim(sellingAgentId))){
			         		thmCustomerVOSellingInfo.setSellingAgentId(sellingAgentId);
			         	}
			         	if(!StringUtils.isEmpty(StringUtils.trim(sellingAgentUnitNumber))){
			         		thmCustomerVOSellingInfo.setSellingAgentUnitNumber(sellingAgentUnitNumber);
			         	}
			         	if(!StringUtils.isEmpty(StringUtils.trim(recordingAgentId))){
			         		thmCustomerVOSellingInfo.setRecordingAgentId(recordingAgentId);
			         	}
			         	if(!StringUtils.isEmpty(StringUtils.trim(recordingAgentUnitNumber))){
			         		thmCustomerVOSellingInfo.setRecordingAgentUnitNumber(recordingAgentUnitNumber);
			         	}
			         	if(!StringUtils.isEmpty(StringUtils.trim(serviceOrderNumber))){
			         		thmCustomerVOSellingInfo.setServiceOrderNumber(serviceOrderNumber);
			         	}
			         	if(serviceOrderDateAsDateForm != null){
			         		thmCustomerVOSellingInfo.setServiceOrderDateAsDateForm(serviceOrderDateAsDateForm);
			         	}
			         	
			         	return thmCustomerVOSellingInfo;
			         }

		         });
		}catch(DataAccessException excp){
			logger.error("Could not fetch selling information for customer");
		}
		
		logger.info("Fetching selling info from database completed for " +
				"customer with customer key " + customerKey);

		return thmCustomerVOSellingInfo;
	}
	
	/**
	 * Get product code for the customer
	 * 
	 * @param productId product id of the  customer
	 * @return product code
	 */
	public String getProductCode(String productId){
		logger.info("Fetching product code from database started for productId " + productId);
		
		String productCode = null;
		
		try{
			List<String> productCodeList = jdbcTemplate.queryForList(hwpProductCodeQuery, String.class, productId);
			
			if(productCodeList != null && !productCodeList.isEmpty()){
				productCode = productCodeList.get(0);
			}
		}catch(DataAccessException excp){
			logger.error("Could not fetch product code for productId " + productId);
		}
		
		logger.info("Fetching product code from database completed for productId " + productId);
		
		return productCode;
	}
	
	/**
	 * Get product id for the customer
	 * 
	 * @param productId product id of the  customer
	 * @return product id
	 */
	public String getProductId(String productCode){
		logger.info("Fetching product id from database started for productCode " + productCode);
		
		String productId = null;
		
		try{
			List<String> productIdList = jdbcTemplate.queryForList(hwpProductIdQuery, String.class, productCode);
			
			if(productIdList != null && !productIdList.isEmpty()){
				productId = productIdList.get(0);
			}
		}catch(DataAccessException excp){
			logger.error("Could not fetch product id for productCode " + productCode);
		}
		
		logger.info("Fetching product product id from database completed for productCode " + productCode);
		
		return productId;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void setHwpSalesQuery(String hwpSalesQuery) {
		this.hwpSalesQuery = hwpSalesQuery;
	}

	public void setHwpProductCodeQuery(String hwpProductCodeQuery) {
		this.hwpProductCodeQuery = hwpProductCodeQuery;
	}

	public void setHwpProductIdQuery(String hwpProductIdQuery) {
		this.hwpProductIdQuery = hwpProductIdQuery;
	}
}