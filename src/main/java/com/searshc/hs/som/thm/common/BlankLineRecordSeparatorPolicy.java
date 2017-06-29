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


/**
 * This class used to ignore empty lines in input file
 *
 * @author Ranjit Bhakta
 * @version 1.0, Mar 03, 2014
 */
public class BlankLineRecordSeparatorPolicy {
  
	/*@Override
   public boolean isEndOfRecord(String line) {
       if (line.trim().length() == 0) {
           return false;
       }
       
       return super.isEndOfRecord(line);
   }

   @Override
   public String postProcess(String record) {
       if (record == null || record.trim().length()==0 ) {
           return null;
       }
       
       return super.postProcess(record);
   }*/
}