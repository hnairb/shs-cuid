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

import org.apache.commons.lang3.StringUtils;
import org.apache.http.protocol.ExecutionContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class is used to log the job execution time
 *
 * @author Ranjit Bhakta
 * @version 1.0, Mar 03, 2014
 */

public class JobLoggerListener {
	private static final Logger logger = LoggerFactory.getLogger(JobLoggerListener.class);

	private long startTime = 0l;
	private long endTime = 0l;

	/*@BeforeJob
	public void logStartJob(JobExecution exec) {
		startTime = System.nanoTime();
		
		logger.info("Starting job " + exec.getJobInstance().getJobName());
	}

	@AfterJob
	public void logEndJob(JobExecution exec) {
		ExecutionContext jobExecutionContext = exec.getExecutionContext();
		endTime = System.nanoTime();
		
		if (exec.getStatus() == BatchStatus.COMPLETED) {
			logger.info("Finished job " + exec.getJobInstance().getJobName() + " successfully in "
					+ (endTime - startTime) / 1E9 + " seconds.");
			
			String status = (String)jobExecutionContext.get(CommonConstants.JOB_STATUS);
			
			if(!StringUtils.isEmpty(status)){
				if(status.equals(JobStatusConstants.NO_FILE_CODE)){
					logger.info(JobStatusConstants.NO_FILE_CODE + " : Successful job completion; no file");
				} else if(status.equals(JobStatusConstants.EMPTY_FILE_CODE)){
					logger.info(JobStatusConstants.EMPTY_FILE_CODE + " : Successful job completion empty file");
				} else if(status.equals(JobStatusConstants.NO_SYWR_RECORDS_CODE)){
					logger.info(JobStatusConstants.NO_SYWR_RECORDS_CODE + " : Successful job completion no sywr records");
				} else {
					logger.info(JobStatusConstants.SUCCESS_CODE + " : Successful job completion");
				}
			} else {
				logger.info(JobStatusConstants.SUCCESS_CODE + " : Successful job completion");
			}
		} else if (exec.getStatus() == BatchStatus.FAILED) {
			logger.info("Finished job " + exec.getJobInstance().getJobName() + " with error in " + (endTime - startTime)
					/ 1E9 + " seconds.");
			logger.info(JobStatusConstants.SYSTEM_CODE + " : System type error where job cannot complete");
		} else {
			logger.info("Finished job " + exec.getJobInstance().getJobName() + " with unknown status in "
					+ (endTime - startTime) / 1E9 + " seconds.");
			logger.info(JobStatusConstants.SYSTEM_CODE + " : System type error where job cannot complete");
		}
	}*/
}