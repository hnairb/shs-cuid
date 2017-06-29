package com.searshc.cuid.cuidservice.java.sywrserviceclient;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.searshc.hs.som.thm.client.adapter.sywr.SYWRProfileAdapter;
import com.searshc.hs.som.thm.domain.sywr.GetMemberLookupResponse.GetMemberLookupResult;


@Component
public class SywrServiceConnector {

	@Resource(name = "SYWRProfileAdapter")
	public SYWRProfileAdapter sywrProfileAdapter;
	
	public GetMemberLookupResult getMemberLookup(String phoneNumber) throws Exception {
		return sywrProfileAdapter.getMemberLookup("", "", "", phoneNumber , "", "", "", "", "", "", "", "");
	}
	
	
}
