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
 * This class is providing the custom implementation for JobParametersIncrementer getNext method
 * 
 * @author Ranjit Bhakta
 * @version 1.0, Mar 03, 2014
 */
public class SimpleIncrementer  {
	private static final Logger logger = LoggerFactory.getLogger(SimpleIncrementer.class);

	/**
	 *Increment the provided parameters.e
	 * 
	 * @param parameters
	 */
	/*@Override
	public JobParameters getNext(JobParameters parameters) {
		if (parameters == null || parameters.isEmpty()) {
			return new JobParametersBuilder().addLong("run.id", 1L).toJobParameters();
		}
		
		long id = parameters.getLong("run.id", 1L) + 1;
		
		logger.info("Job Instance ID is" + id);
		
		return new JobParametersBuilder().addLong("run.id", id).toJobParameters();
	}*/
}
