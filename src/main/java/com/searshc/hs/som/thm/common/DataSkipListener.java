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
package com.searshc.hs.som.thm.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.searshc.hs.som.thm.vo.THMCustomerVO;
import com.searshc.hs.som.thm.vo.THMNPJVO;
import com.searshc.hs.som.thm.vo.THMSYWRVO;

/**
 * This class used to log the reason for Skippable exception
 *
 * @author Ranjit Bhakta
 * @version 1.0, Mar 03, 2014
 */
public class DataSkipListener {
    private static final Logger logger = LoggerFactory.getLogger(DataSkipListener.class);
    
    /**
     * This method will execute and log the error when there is an exception while reading the flat file
     * 
     * @param throwable t is instance of Throwable
     * @throws Exception
     */
    /*@OnSkipInRead
    public void onSkipInRead(Throwable throwable) throws Exception {
		if (throwable instanceof FlatFileParseException) {
			FlatFileParseException f = (FlatFileParseException) throwable;
			
			logger.error("Error reading input line: " + f.getLineNumber() + " Cause: " + f.getCause() + " Item: "
			      + f.getInput());
		}
    }*/
    
    /**
     * This method will execute and log the error when there is an exception while writing in the flat file
     * 
     * @param throwable t is instance of Throwable
     * @throws Exception
     */
//    @OnSkipInWrite
    public void onSkipInWrite(Object o, Throwable throwable) throws Exception {
    	if (o instanceof THMCustomerVO) {
    		THMCustomerVO thmCustomerVO = (THMCustomerVO) o;
    		
    		logger.error("Error writing THMCustomerVO record. Cause: " + throwable.getClass() + " Record: Customer contract no - " + thmCustomerVO.getCustomerKey());
    	}
    	
    	if (o instanceof THMNPJVO) {
    		THMNPJVO thmNPJVO = (THMNPJVO) o;
    		
    		logger.error("Error writing THMNPJVO record. Cause: " + throwable.getClass() + " Record: Customer contract no - " + thmNPJVO.getCustomerKey());
    	}
    	
    	if (o instanceof THMSYWRVO) {
    		THMSYWRVO thmSYWRVO = (THMSYWRVO) o;
    		
    		logger.error("Error writing THMSYWRVO record. Cause: " + throwable.getClass() + " Record: Customer key no - " + thmSYWRVO.getCustomerKey());
    	}
    }
    
    /**
     * This method will execute and log the error when there is an exception while processing the flat file
     * 
     * @param throwable t is instance of Throwable
     * @throws Exception
     */
//    @OnSkipInProcess
    public void onSkipInProcess(Object o, Throwable throwable) throws Exception {
    	if (o instanceof THMCustomerVO) {
    		THMCustomerVO thmCustomerVO = (THMCustomerVO) o;
    		
    		logger.error("Error processing THMCustomerVO record. Cause: " + throwable.getClass() + " Record: Customer contract no - " + thmCustomerVO.getCustomerKey());
    	}
    	
    	if (o instanceof THMNPJVO) {
    		THMNPJVO thmNPJVO = (THMNPJVO) o;
    		
    		logger.error("Error processing THMNPJVO record. Cause: " + throwable.getClass() + " Record: Customer contract no - " + thmNPJVO.getCustomerKey());
    	}
    	
    	if (o instanceof THMSYWRVO) {
    		THMSYWRVO thmSYWRVO = (THMSYWRVO) o;
    		
    		logger.error("Error processing THMSYWRVO record. Cause: " + throwable.getClass() + " Record: Customer key no - " + thmSYWRVO.getCustomerKey());
    	}
    }
}