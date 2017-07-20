package com.searshc.cuid.cuidservice.java.sywrserviceclient;

import javax.ws.rs.core.UriBuilder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.searshc.hs.sywr.SYWServiceDelegator;
import com.searshc.hs.sywr.hs.searshc.com.request.LookupRequest;
import com.searshc.hs.sywr.hs.searshc.com.response.BalanceResponse;
import com.searshc.hs.sywr.hs.searshc.com.response.LookupResponse;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

@Component
public class SywrServiceConnector {
	
	@Autowired
	private SYWServiceDelegator sywServiceDelegator;
	
	public LookupResponse postLookup(LookupRequest request) {
		LookupResponse response = null;
		try {
			response = sywServiceDelegator.getMemberInformation(request);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return response;
	}
	/*
	public BalanceResponse getBalancememberNo(String memberNo) {
		BalanceResponse response = new BalanceResponse();
		String points=null;
		try {
			points = sywServiceDelegator.getBalancePoints(memberNo);
		} catch (Exception e) {

		}
		response.setAvailablePoints(points);
		return response;
	}
	
	public LookupResponse postLookup(LookupRequest request) {
		LookupResponse lookupResponse = null;
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			String REST_URI = "https://hspscs.syw.intra.searshc.com/HSPRTSYWService/services/sywr/lookup";
			ClientConfig config = new DefaultClientConfig();
//			config.getClasses().add(JacksonJsonProvider.class);
			Client client = Client.create(config);
			WebResource service = client.resource(UriBuilder.fromUri(REST_URI).build());
			ClientResponse response = service.header("Content-Type", "application/json").post(ClientResponse.class,request);
			String output = response.getEntity(String.class);
			lookupResponse = objectMapper.readValue(output, new TypeReference<LookupResponse>(){});
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lookupResponse;
	}*/
	
	public BalanceResponse getBalancememberNo(String memberNo) throws Exception {
		BalanceResponse obj = null;
		String REST_URI = "https://hspscs.syw.intra.searshc.com/HSPRTSYWService/services/sywr/balance/"
				+ memberNo;
		ObjectMapper objectMapper = new ObjectMapper();
		ClientConfig config = new DefaultClientConfig();
		Client client = Client.create(config);
		WebResource service = client.resource(UriBuilder.fromUri(REST_URI)
				.build());

		ClientResponse response = service.get(ClientResponse.class);

		if (response.getStatus() != 200) {
			throw new RuntimeException("Failed : HTTP error code : "
					+ response.getStatus());
		}
		String output = response.getEntity(String.class);
		obj = objectMapper.readValue(output, new TypeReference<BalanceResponse>(){});
		return obj;
	}
	
}
