/* 
 * Copyright 2014 (C) Sears Holdings Corp  
 *  
 * Created on : 05-Mar-14
 * Author     : Ranjit Bhakta   
 * 
 *----------------------------------------------------------------------------- 
 * Revision History (Release 1.0.0.0) 
 *----------------------------------------------------------------------------- 
 * VERSION     AUTHOR/      DESCRIPTION OF CHANGE 
 * OLD/NEW     DATE                RFC NO 
 *----------------------------------------------------------------------------- 
 * --/1.0  | Ranjit Bhakta  | Initial Create. 
 *         | 06-Mar-14      | 
 *---------|--------------- |--------------------------------------------------- 
 */
package com.searshc.hs.som.thm.service;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;

import com.searshc.hs.som.thm.common.CommonConstants;
import com.searshc.hs.som.thm.dao.CiboodleDAO;
import com.searshc.hs.som.thm.utils.CommonUtils;
import com.searshc.hs.som.thm.vo.THMCustomerVOSellingInfo;
import com.searshc.hs.som.thm.vo.THMCustomerWrapperVO;
import com.searshc.hs.som.thm.vo.THMNPJVO;

/**
 * This file use to get information from Ciboodle DB
 * 
 * @author Ranjit Bhakta
 * @version 1.0, Mar 06, 2014
 *
 */
public class CiboodleService {
	private static final Logger logger = LoggerFactory.getLogger(CiboodleService.class); 
	
	private CiboodleDAO ciboodleDAO;
	
	/**
	 * This method get selling infos and
	 * update these selling infos to thmCustomerWrapperVO
	 * 
	 * @param thmCustomerWrapperVO customer vo wrapper object
	 */
	public void getAndSetSelliingInfo(THMCustomerWrapperVO thmCustomerWrapperVO){
		int customerKey;
		
		if(!StringUtils.isEmpty(thmCustomerWrapperVO.getCustomerKey())
				&& !StringUtils.isEmpty(thmCustomerWrapperVO.getContractNumber())){
			try{
				customerKey = Integer.parseInt(thmCustomerWrapperVO.getCustomerKey());
			}catch(Exception excp){
				logger.error("Not a valid customer key", excp);
				return;
			}
			
			THMCustomerVOSellingInfo addTHMCustomerVOSellingInfo = ciboodleDAO.getSelliingInfo(customerKey,
				thmCustomerWrapperVO.getContractNumber());
			
			//set info
			if(addTHMCustomerVOSellingInfo != null){
				BeanUtils.copyProperties(addTHMCustomerVOSellingInfo, thmCustomerWrapperVO);
				
				//set date
				if(addTHMCustomerVOSellingInfo.getServiceOrderDateAsDateForm() != null){
					String date = CommonUtils.getDateAsString(addTHMCustomerVOSellingInfo.getServiceOrderDateAsDateForm(),
							CommonConstants.DATE_FORMAT);
					
					if(!StringUtils.isEmpty(date)){
						thmCustomerWrapperVO.setServiceOrderDate(date);
					}
				}
			}
		}
	}
	
	/**
	 * This method get product code from table and
	 * update product code to thmCustomerWrapperVO
	 * 
	 * @param thmCustomerWrapperVO customer vo wrapper object
	 * @return productCode productCode of the product
	 */
	public String getAndSetProductCode(THMCustomerWrapperVO thmCustomerWrapperVO){
		String productCode = null;
		
		if(!StringUtils.isEmpty(thmCustomerWrapperVO.getProductId())){
			productCode = ciboodleDAO.getProductCode(thmCustomerWrapperVO.getProductId());
			
			if(!StringUtils.isEmpty(productCode)){
				thmCustomerWrapperVO.setProductCode(productCode);
			}
		}
		
		return productCode;
	}
	
	/**
	 * This method get product id from table and
	 * update product id to thmCustomerWrapperVO
	 * 
	 * @param thmNPJVO npj customer vo object
	 * @return productCode productCode of the product
	 */
	public String getAndSetProductId(THMNPJVO thmNPJVO){
		String productId = null;
		
		if(!StringUtils.isEmpty(thmNPJVO.getProductCode())){
			productId = ciboodleDAO.getProductId(thmNPJVO.getProductCode());
			
			if(!StringUtils.isEmpty(productId)){
				thmNPJVO.setProductId(productId);
			}
		}
		
		return productId;
	}
	
	public void setCiboodleDAO(CiboodleDAO ciboodleDAO) {
		this.ciboodleDAO = ciboodleDAO;
	}
}