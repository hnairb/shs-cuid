/* 
 * Copyright 2014 (C) Sears Holdings Corp  
 *  
 * Created on : 09-Apr-14
 * Author     : Ranjit Bhakta   
 * 
 *----------------------------------------------------------------------------- 
 * Revision History (Release 1.0.0.0) 
 *----------------------------------------------------------------------------- 
 * VERSION     AUTHOR/      DESCRIPTION OF CHANGE 
 * OLD/NEW     DATE                RFC NO 
 *----------------------------------------------------------------------------- 
 * --/1.0  | Ranjit Bhakta  | Initial Create. 
 *         | 09-Apr-14      | 
 *---------|--------------- |--------------------------------------------------- 
 */
package com.searshc.hs.som.thm.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.searshc.hs.som.thm.vo.THMSYWRVO;

/**
 * This DAO is used to access NPJ tables
 * 
 * @author Ranjit Bhakta
 * @version 1.0, Apr 09, 2014
 */
public class NPJDAO {
	private static final Logger logger = LoggerFactory.getLogger(NPJDAO.class);

	private  String sywrCustomerQuery;

	private JdbcTemplate jdbcTemplate;

	/**
	 * Get customer data from NPJ database
	 * 
	 * @return THMSYWRVO list list of customers for sywr
	 */
	public List<THMSYWRVO> getCustomerInfoForSYWR() {
		logger.info("Fetching customer info from database for sywr started");

		List<THMSYWRVO> thmSYWRVOList = null;

		try {
			thmSYWRVOList = jdbcTemplate.query(sywrCustomerQuery, new RowMapper<THMSYWRVO>() {
		        
						@Override
						public THMSYWRVO mapRow(ResultSet rs, int rowNum) throws SQLException {
							THMSYWRVO thmSYWRVO = new THMSYWRVO();
							
							if(rs.getString(1) != null){
								thmSYWRVO.setCustomerKey(rs.getString(1).trim());
							}
							
							if(rs.getString(2) != null){
								thmSYWRVO.setCustomerFirstName(rs.getString(2).trim());
							}
							
							if(rs.getString(3) != null){
								thmSYWRVO.setCustomerLastName(rs.getString(3).trim());
							}
							
							if(rs.getString(4) != null){
								thmSYWRVO.setCustomerPhoneNumber(rs.getString(4).trim());
							}
							
							if(rs.getString(5) != null){
								thmSYWRVO.setCustomerPhoneType(rs.getString(5).trim());
							}
							
							if(rs.getString(6) != null){
								thmSYWRVO.setCustomerZip(rs.getString(6).trim());
							}
							
							if(rs.getString(7) != null){
								thmSYWRVO.setCustomerEmailAddress(rs.getString(7).trim());
							}
							
							if(rs.getString(8) != null){
								thmSYWRVO.setCustomerAuthData(rs.getString(8).trim());
							}
							
							if(rs.getString(9) != null){
								thmSYWRVO.setCustomerProductCode(rs.getString(9).trim());
							}
							
							if(rs.getString(10) != null){
								thmSYWRVO.setRegStartDate(rs.getString(10).trim());
							}
							
							return thmSYWRVO;
						}
					});
		} catch (DataAccessException excp) {
			logger.error("Could not fetch customer info from database for sywr");
		}

		logger.info("Fetching customer info from database for sywr finished");

		return thmSYWRVOList;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void setSywrCustomerQuery(String sywrCustomerQuery) {
		this.sywrCustomerQuery = sywrCustomerQuery;
	}
}