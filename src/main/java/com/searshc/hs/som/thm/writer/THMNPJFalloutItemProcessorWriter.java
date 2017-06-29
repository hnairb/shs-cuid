package com.searshc.hs.som.thm.writer;


public class THMNPJFalloutItemProcessorWriter {
	
	/*private ItemWriter<THMNPJVO> npjAdd2FileWriter;
	private ItemWriter<THMNPJVO> falloutFileItemWriter;
	private String retry;
	private String client;
	
	@Override
	public void write(List<? extends THMNPJVO> items) throws Exception {
		List<THMNPJVO> dailyFallOutFileList = new ArrayList<THMNPJVO>();
		List<THMNPJVO> npjAdd2InputFileList = new ArrayList<THMNPJVO>();
		System.out.println("#####  ENTRY INTO THMNPJFalloutItemProcessorWriter ####");
		for(THMNPJVO thmNPJVO : items) {
			
			if(!CommonConstants.TP_CLIENT.equals(client) && !CommonConstants.RETRY_FL.equals(retry) && thmNPJVO.getErrorMessage() != null && thmNPJVO.getErrorMessage().startsWith(CommonConstants.THM_NPJ_FALLOUT_REASON))
			{
				npjAdd2InputFileList.add(thmNPJVO);
			}
			else{
				dailyFallOutFileList.add(thmNPJVO);
			}
		}
		System.out.println("####  EXIT FROM  THMNPJFalloutItemProcessorWriter ###");
		
		if(npjAdd2InputFileList != null && npjAdd2InputFileList.size() > 0)
		npjAdd2FileWriter.write(npjAdd2InputFileList);
		
		if(dailyFallOutFileList != null && dailyFallOutFileList.size() > 0)
		falloutFileItemWriter.write(dailyFallOutFileList);
		
	}
	@Override
	public void open(ExecutionContext executionContext) throws ItemStreamException {
		((ItemStream) npjAdd2FileWriter).open(executionContext);
		((ItemStream) falloutFileItemWriter).open(executionContext);
	}
	
	@Override
	public void update(ExecutionContext executionContext) throws ItemStreamException {
		((ItemStream) npjAdd2FileWriter).update(executionContext);
		((ItemStream) falloutFileItemWriter).update(executionContext);
	}
	
	@Override
	public void close() throws ItemStreamException {
		((ItemStream) npjAdd2FileWriter).close();
		((ItemStream) falloutFileItemWriter).close();
	}
	public void afterPropertiesSet() throws Exception {
		Assert.notNull(npjAdd2FileWriter, "The 'npjAdd2FileWriter' may not be null");
		Assert.notNull(falloutFileItemWriter, "The 'falloutFileItemWriter' may not be null");
	}

	public void setNpjAdd2FileWriter(ItemWriter<THMNPJVO> npjAdd2FileWriter) {
		this.npjAdd2FileWriter = npjAdd2FileWriter;
	}

	public void setFalloutFileItemWriter(ItemWriter<THMNPJVO> falloutFileItemWriter) {
		this.falloutFileItemWriter = falloutFileItemWriter;
	}
	
	public void setRetry(String retry) {
		this.retry = retry;
	}
	public void setClient(String client) {
		this.client = client;
	}*/
	
}
