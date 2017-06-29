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
package com.searshc.hs.som.thm.service;

import java.util.List;

import com.searshc.hs.som.thm.dao.NPJDAO;
import com.searshc.hs.som.thm.vo.THMSYWRVO;

/**
 * This class use to get information from NPJ DB
 * 
 * @author Ranjit Bhakta
 * @version 1.0, Apr 09, 2014
 *
 */
public class NPJService {
	private NPJDAO npjDAO;
	
	/**
	 * This method get customer infos for sywr
	 * 
	 * @return THMSYWRVO list list of customers for sywr
	 */
	public List<THMSYWRVO> getCustomerInfoForSYWR(){
		return npjDAO.getCustomerInfoForSYWR();
	}
	
	public void setNpjDAO(NPJDAO npjDAO) {
		this.npjDAO = npjDAO;
	}
}