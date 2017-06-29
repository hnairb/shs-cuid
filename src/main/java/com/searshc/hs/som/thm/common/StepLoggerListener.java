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

/**
 * This class used to log the step names before and after each step execution
 * 
 * @author Ranjit Bhakta
 * @version 1.0, Mar 03, 2014
 */

public class StepLoggerListener {
	private static final Logger logger = LoggerFactory.getLogger(StepLoggerListener.class);

	/*@BeforeStep
	public void beforeStep(StepExecution exec) {
		logger.info("Starting step " + exec.getStepName());
	}

	@AfterStep
	public ExitStatus afterStep(StepExecution exec) {
		logger.info("Total number of records read : " + exec.getReadCount());
		logger.info("Total number of records skipped during read : " + exec.getReadSkipCount());
		logger.info("Total number of records skipped during write : " + exec.getWriteSkipCount());
		logger.info("Total number of records written : " + exec.getWriteCount());
		logger.info("Finished step " + exec.getStepName());
		
		return exec.getExitStatus();
	}*/
}