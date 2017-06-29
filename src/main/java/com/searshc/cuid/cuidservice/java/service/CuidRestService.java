package com.searshc.cuid.cuidservice.java.service;

import java.util.List;

import com.searshc.cuid.cuidservice.java.model.CustomerDetails;
import com.searshc.cuid.cuidservice.java.model.OriginationDTO;
import com.searshc.cuid.cuidservice.java.serviceorderclient.ServiceOrder;
import com.searshc.hs.agreement.agreementservice.domain.request.AgreementListRequest;
import com.searshc.hs.agreement.agreementservice.domain.response.AgreementResponse;
import com.searshc.hs.agreement.contract.service.domain.request.HwpDetailsRequest;
import com.searshc.hs.agreement.contract.service.domain.response.HwpDetailsResponse;
import com.searshc.hs.domi.service.merchandise.lookup.details.response.LookupMerchandiseDetailsResponse;
import com.searshc.hs.domi.service.merchandise.lookup.list.response.LookupMerchandiseListResponse;
import com.searshc.hs.psc.partorderdirectservice.ws.service.SearchPartOrderDirectRequestVO;
import com.searshc.hs.psc.partorderdirectservice.ws.service.SearchPartOrderDirectResponseVO;
import com.searshc.hs.som.thm.domain.sywr.GetMemberLookupResponse.GetMemberLookupResult;

public interface CuidRestService {
	
	public List<CustomerDetails>  retrieveCustomerDetailsById(String customerId) throws Exception;
	
	public List<CustomerDetails> retrieveBulkCustomerDetails(List<String> customerIdList) throws Exception;
	
	public List<CustomerDetails> retrieveAllHouseholdMembers(String customerId) throws Exception;
	
	public List<CustomerDetails> retrieveCustomerAllAddresses(String customerId) throws Exception;
	
	public List<CustomerDetails> retrieveByWildcardMatch(List<String> fieldName, List<String> values) throws Exception;
	
	public LookupMerchandiseDetailsResponse getMerchandiseDetails ( String customerId) throws Exception;
	
	public LookupMerchandiseListResponse getMerchandiseList(String customerId) throws Exception;
	
	public GetMemberLookupResult getMemberLookup(String emailAddress) throws Exception;
	
	public List<ServiceOrder> getServiceOrderDetails(String emailAddress) throws Exception;
	
	public OriginationDTO fetchOriginationData(String customerId) throws Exception;
	
	public SearchPartOrderDirectResponseVO searchPartOrder(SearchPartOrderDirectRequestVO searchPartOrderDirectRequestVO) throws Exception;
	
	public AgreementResponse retrieveAgreementList(AgreementListRequest agreementListRequest) throws Exception;
	
	public HwpDetailsResponse getContractDetail(HwpDetailsRequest hwpDetailsRequest) throws Exception;
}
