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
package com.searshc.hs.som.thm.writer;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.protocol.ExecutionContext;
import org.springframework.util.Assert;

import com.searshc.hs.som.thm.vo.THMCustomerVO;
import com.searshc.hs.som.thm.vo.THMCustomerWrapperVO;

/**
 * Composite writer to write to output and fallout file
 * @author Ranjit Bhakta
 * @version 1.0, Mar 03, 2014
 *
 */
public class THMCustomerCompositeItemWriter  {
	/*ItemWriter<THMCustomerWrapperVO> outputFileItemWriter;
	ItemWriter<THMCustomerVO> falloutFileItemWriter;
	
	*//**
	 * This method is doing delegation for actual writing.
	 * if the record is a fallout record then it is those records
	 * in fallout writer otherwise records are send to output writer
	 *//*
	@Override
	public void write(List<? extends THMCustomerVO> thmCustomerVOList) throws Exception {
		List<THMCustomerWrapperVO> outputList = null;
		List<THMCustomerVO> falloutList = null;
		
		for(THMCustomerVO thmCustomerVO : thmCustomerVOList){
			THMCustomerWrapperVO thmCustomerWrapperVO = (THMCustomerWrapperVO) thmCustomerVO;
			THMCustomerVO originalTHMCustomerVO = thmCustomerWrapperVO.getTHMCustomerVO();
			
			if(thmCustomerWrapperVO.isFalloutRecord()){
				if(falloutList == null){
					falloutList = new ArrayList<THMCustomerVO>();
				}
				
				falloutList.add(originalTHMCustomerVO);
			} else {
				if(outputList == null){
					outputList = new ArrayList<THMCustomerWrapperVO>();
				}
				
				outputList.add(thmCustomerWrapperVO);
			}
		}
		
		if(falloutList != null && !falloutList.isEmpty()){
			falloutFileItemWriter.write(falloutList);
		}
		
		if(outputList != null && !outputList.isEmpty()){
			outputFileItemWriter.write(outputList);
		}
	}
	
	@Override
	public void open(ExecutionContext executionContext) throws ItemStreamException {
		((ItemStream) outputFileItemWriter).open(executionContext);
		((ItemStream) falloutFileItemWriter).open(executionContext);
	}
	
	@Override
	public void update(ExecutionContext executionContext) throws ItemStreamException {
		((ItemStream) outputFileItemWriter).update(executionContext);
		((ItemStream) falloutFileItemWriter).update(executionContext);
	}
	
	@Override
	public void close() throws ItemStreamException {
		((ItemStream) outputFileItemWriter).close();
		((ItemStream) falloutFileItemWriter).close();
	}
	
	public void afterPropertiesSet() throws Exception {
		Assert.notNull(outputFileItemWriter, "The 'outputFileItemWriter' may not be null");
		Assert.notNull(falloutFileItemWriter, "The 'falloutFileItemWriter' may not be null");
	}

	public void setOutputFileItemWriter(ItemWriter<THMCustomerWrapperVO> outputFileItemWriter) {
		this.outputFileItemWriter = outputFileItemWriter;
	}

	public void setFalloutFileItemWriter(ItemWriter<THMCustomerVO> falloutFileItemWriter) {
		this.falloutFileItemWriter = falloutFileItemWriter;
	}*/
}