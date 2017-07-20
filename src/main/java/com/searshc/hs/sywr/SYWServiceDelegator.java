package com.searshc.hs.sywr;

import java.util.Arrays;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.searshc.hs.sywr.hs.searshc.com.request.LookupRequest;
import com.searshc.hs.sywr.hs.searshc.com.response.BalanceResponse;
import com.searshc.hs.sywr.hs.searshc.com.response.LookupResponse;

@Component
public class SYWServiceDelegator {

	@Value("${sywr.url}")
	private String sywMemberServiceUrl;
	
	@Bean
	public RestTemplate restTemplate() {
	    return new RestTemplate();
	}
	
	@Autowired
	private RestTemplate sywMemberServiceClient;
	
	
	public LookupResponse getMemberInformation(LookupRequest request){
		HttpEntity<LookupRequest> requestEntity = new HttpEntity<LookupRequest>(request, getHttpHeaders());
		String lookupUri = String.format("%slookup", sywMemberServiceUrl);
		LookupResponse response = sywMemberServiceClient.postForObject(lookupUri, requestEntity, LookupResponse.class);
		return response;
	}
	
	public String getBalancePoints(String memberId){
		try{
			String balanceUri = String.format("%sbalance/%s", sywMemberServiceUrl, memberId);
			BalanceResponse balanceResponse = sywMemberServiceClient.getForObject(balanceUri, BalanceResponse.class);
			if(balanceResponse != null && StringUtils.isNotBlank(balanceResponse.getAvailablePoints())){
				return balanceResponse.getAvailablePoints();
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
		return null;
	}
	
	private static HttpHeaders getHttpHeaders() {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		return headers;
	} 
	
}
