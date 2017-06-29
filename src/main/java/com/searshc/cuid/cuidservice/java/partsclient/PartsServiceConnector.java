package com.searshc.cuid.cuidservice.java.partsclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.searshc.hs.psc.partorderdirectservice.ws.service.PartOrderDirectSoapService;
import com.searshc.hs.psc.partorderdirectservice.ws.service.SearchPartOrderDirectRequestVO;
import com.searshc.hs.psc.partorderdirectservice.ws.service.SearchPartOrderDirectResponseVO;

@Component
public class PartsServiceConnector {
	
	@Autowired
	private PartOrderDirectSoapService client;
	
	public SearchPartOrderDirectResponseVO searchPartOrder(SearchPartOrderDirectRequestVO searchPartOrderDirectRequestVO) throws Exception {
		return client.searchPartOrder(searchPartOrderDirectRequestVO);
	}

}
