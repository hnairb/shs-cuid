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

import org.springframework.beans.BeanUtils;


/**
 * VO class for Customer wrapper object
 * Mutable operations are performed on this wrapper bean which 
 * wrapper THMCustomer VO object
 * 
 * @author Ranjit Bhakta
 * @version 1.0, Mar 03, 2014
 *
 */
public class THMCustomerWrapperVO extends THMCustomerVO {
	private THMCustomerVO thmCustomerVO = null;
	
	public THMCustomerWrapperVO(THMCustomerVO thmCustomerVO){
		this.thmCustomerVO = thmCustomerVO;
		
		BeanUtils.copyProperties(thmCustomerVO, this);
	}
	
	public THMCustomerVO getTHMCustomerVO() {
		return thmCustomerVO;
	}
}