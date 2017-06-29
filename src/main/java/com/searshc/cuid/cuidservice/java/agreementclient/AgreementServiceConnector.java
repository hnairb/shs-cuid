package com.searshc.cuid.cuidservice.java.agreementclient;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.searshc.hs.agreement.agreementservice.domain.request.AgreementListRequest;
import com.searshc.hs.agreement.agreementservice.domain.response.AgreementResponse;
import com.searshc.hs.agreement.agreementservice.service.AgreementService;
import com.searshc.hs.agreement.contract.service.domain.request.HwpDetailsRequest;
import com.searshc.hs.agreement.contract.service.domain.response.HwpDetailsResponse;

@Component
public class AgreementServiceConnector {
	
	@Resource(name = "agreementServiceRestClient")
	public AgreementService agreementServiceClient;
	
	public AgreementResponse retrieveAgreementList(AgreementListRequest agreementListRequest) throws Exception {
		return agreementServiceClient.getAgreementList(agreementListRequest);
	}
	
	public HwpDetailsResponse getContractDetail(HwpDetailsRequest hwpDetailsRequest) throws Exception {
		return agreementServiceClient.getContractDetail(hwpDetailsRequest);
	}
}
