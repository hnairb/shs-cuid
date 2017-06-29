package com.searshc.cuid.cuidservice.java.serviceorderclient;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.UriBuilder;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.core.util.MultivaluedMapImpl;

@Service
public class ServiceOrderClient {

	public List<ServiceOrder> getServiceOrderDetails(String customerEmail) {
		List<ServiceOrder> serviceOrderList = new ArrayList<ServiceOrder>();
		String REST_URI = "http://notifications.searshomeservices.io/rest/v1.0/notifications/serviceOrder";
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			ClientConfig config = new DefaultClientConfig();
			Client client = Client.create(config);
			WebResource service = client.resource(UriBuilder.fromUri(REST_URI).build());
			MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
			queryParams.add("notificationIds", customerEmail);
			ClientResponse response = service.queryParams(queryParams)
			                        .header("Content-Type", "application/json;charset=UTF-8")
			    .header("Authorization", "Basic cGQtcHJvZDprM3J4SmNIUHl6")
			    .get(ClientResponse.class);
			
			if (response.getStatus() != 200) {
			   throw new RuntimeException("Failed : HTTP error code : "
				+ response.getStatus());
			}

			String output = response.getEntity(String.class);
			serviceOrderList = objectMapper.readValue(output, new TypeReference<List<ServiceOrder>>(){});
		} catch (Exception e) {
			System.out.println("in exception");
			e.printStackTrace();
		}

		return serviceOrderList;
	}
}
