/* 
 * Copyright 2014 (C) Sears Holdings Corp  
 *  
 * Created on : 21-Mar-14
 * Author     : Ranjit Bhakta   
 * 
 *----------------------------------------------------------------------------- 
 * Revision History (Release 1.0.0.0) 
 *----------------------------------------------------------------------------- 
 * VERSION     AUTHOR/      DESCRIPTION OF CHANGE 
 * OLD/NEW     DATE                RFC NO 
 *----------------------------------------------------------------------------- 
 * --/1.0  | Ranjit Bhakta  | Initial Create. 
 *         | 21-Mar-14      | 
 *---------|--------------- |--------------------------------------------------- 
 */
package com.searshc.hs.som.thm.common;

/**
 * Constants for batch job status
 * 
 * @author Ranjit Bhakta
 * @version 1.0, Mar 21, 2014
 */
public interface JobStatusConstants {
  public String SUCCESS_CODE = "00";
  public String NO_FILE_CODE = "01";
  public String EMPTY_FILE_CODE = "02";
  public String SYSTEM_CODE = "08";
  public String NO_SYWR_RECORDS_CODE = "10";
  
  public String NO_FILE_MESSAGE= "NO FILE";
  public String EMPTY_FILE_MESSAGE = "EMPTY FILE";
  public String NO_SYWR_RECORDS_MESSAGE = "NO SYWR RECORDS";
}