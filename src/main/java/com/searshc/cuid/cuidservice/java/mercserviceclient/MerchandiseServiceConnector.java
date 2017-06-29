package com.searshc.cuid.cuidservice.java.mercserviceclient;

import java.time.LocalDateTime;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.ws.rs.core.Response;

import org.apache.cxf.jaxrs.client.Client;
import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.apache.cxf.jaxrs.client.WebClient;
import org.springframework.stereotype.Component;

import com.searshc.hs.domi.merchandise.client.MerchandiseServiceClient;
import com.searshc.hs.domi.service.merchandise.lookup.details.request.LookupMerchandiseDetailsRequest;
import com.searshc.hs.domi.service.merchandise.lookup.details.response.LookupMerchandiseDetailsResponse;
import com.searshc.hs.domi.service.merchandise.lookup.list.response.LookupMerchandiseListResponse;


@Component
public class MerchandiseServiceConnector {

	@Resource(name = "MerchandiseServiceClient")
	public MerchandiseServiceClient proxy;
	
	private Client templateClient;

	@PostConstruct
	public void initTemplateClient() {
		this.templateClient = WebClient.client(proxy);
	}

	public LookupMerchandiseDetailsResponse getMerchDetails(String custId) {
		Response response = null;
		LookupMerchandiseDetailsResponse obj = null;
		try {
			LookupMerchandiseDetailsRequest request = new LookupMerchandiseDetailsRequest();
			request.setCustNum(custId);
			proxy = JAXRSClientFactory.fromClient(templateClient,
					MerchandiseServiceClient.class, true);
			WebClient.client(proxy).header("currentdatetime",
					LocalDateTime.now());

			response = proxy.getMerchandiseDetails(request);

			if (response != null) {
				obj = response
						.readEntity(LookupMerchandiseDetailsResponse.class);
			} else {
				throw new Exception("Problemo.");
			}
		} catch (Exception e) {

		}
		return obj;
	}
	
	public LookupMerchandiseListResponse getMerchList(String custId) {
		Response response = null;
		LookupMerchandiseListResponse obj = null;
		try {
			proxy = JAXRSClientFactory.fromClient(templateClient,
					MerchandiseServiceClient.class, true);
			WebClient.client(proxy).header("currentdatetime",
					LocalDateTime.now());

			response = proxy.getMerchandiseList(custId, "H", "0000", "0000");

			if (response != null) {
				obj = response.readEntity(LookupMerchandiseListResponse.class);
			} else {
				throw new Exception("Problemo.");
			}
		} catch (Exception e) {

		}
		return obj;
	}

}
