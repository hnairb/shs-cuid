package com.searshc.cuid.cuidservice.java.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.searshc.cuid.cuidservice.java.agreementclient.AgreementServiceConnector;
import com.searshc.cuid.cuidservice.java.dao.CuidServiceDao;
import com.searshc.cuid.cuidservice.java.mercserviceclient.MerchandiseServiceConnector;
import com.searshc.cuid.cuidservice.java.model.CustomerDetails;
import com.searshc.cuid.cuidservice.java.model.OriginationDTO;
import com.searshc.cuid.cuidservice.java.partsclient.PartsServiceConnector;
import com.searshc.cuid.cuidservice.java.service.CuidRestService;
import com.searshc.cuid.cuidservice.java.serviceorderclient.ServiceOrder;
import com.searshc.cuid.cuidservice.java.serviceorderclient.ServiceOrderClient;
import com.searshc.cuid.cuidservice.java.sywrserviceclient.SywrServiceConnector;
import com.searshc.hs.agreement.agreementservice.domain.request.AgreementListRequest;
import com.searshc.hs.agreement.agreementservice.domain.response.AgreementResponse;
import com.searshc.hs.agreement.contract.service.domain.request.HwpDetailsRequest;
import com.searshc.hs.agreement.contract.service.domain.response.HwpDetailsResponse;
import com.searshc.hs.domi.service.merchandise.lookup.details.response.LookupMerchandiseDetailsResponse;
import com.searshc.hs.domi.service.merchandise.lookup.list.response.LookupMerchandiseListResponse;
import com.searshc.hs.psc.partorderdirectservice.ws.service.SearchPartOrderDirectRequestVO;
import com.searshc.hs.psc.partorderdirectservice.ws.service.SearchPartOrderDirectResponseVO;
import com.searshc.hs.som.thm.domain.sywr.GetMemberLookupResponse.GetMemberLookupResult;

@Service
public class CuidRestServiceImpl implements CuidRestService {

	@Autowired
	CuidServiceDao cuidServiceDao;
	
	@Autowired
	private MerchandiseServiceConnector merchandiseServiceConnector;
	
	@Autowired
	private SywrServiceConnector sywrServiceConnector;
	
	@Autowired
	private ServiceOrderClient serviceOrderClient;
	
	@Autowired
	private PartsServiceConnector partsServiceConnector;
	
	@Autowired
	private AgreementServiceConnector agreementServiceConnector;
	
	@Override
	public List<CustomerDetails>  retrieveCustomerDetailsById(String customerId) throws Exception {
		List<CustomerDetails> customerDetailsList = cuidServiceDao
				.retrieveCustomerDetailsById(customerId);
		return customerDetailsList;
	}
	
	@Override
	public List<CustomerDetails> retrieveBulkCustomerDetails(
			List<String> customerIdList) throws Exception {
		List<CustomerDetails> customerDetailsList = cuidServiceDao
				.retrieveBulkCustomerDetails(customerIdList);
		return customerDetailsList;
	}

	@Override
	public List<CustomerDetails> retrieveAllHouseholdMembers(String customerId) throws Exception {
		List<CustomerDetails> customerDetailsList = cuidServiceDao
				.retrieveAllHouseholdMembers(customerId);
		return customerDetailsList;
	}
	
	@Override
	public List<CustomerDetails> retrieveCustomerAllAddresses(String customerId) throws Exception{
		List<CustomerDetails> customerDetailsList = cuidServiceDao
				.retrieveCustomerAllAddresses(customerId);
		return customerDetailsList;
	}
	
	@Override
	public LookupMerchandiseDetailsResponse getMerchandiseDetails(String customerId) throws Exception {
		return merchandiseServiceConnector.getMerchDetails(customerId);
	}
	
	@Override
	public LookupMerchandiseListResponse getMerchandiseList(String customerId) throws Exception {
		return merchandiseServiceConnector.getMerchList(customerId);
	}
	
	public List<CustomerDetails> retrieveByWildcardMatch(List<String> fieldName, List<String> values) throws Exception {
		return cuidServiceDao.retrieveByWildcardMatch(fieldName, values);
	}
	
	public GetMemberLookupResult getMemberLookup(String phoneNumber) throws Exception{
		/*GetMemberLookupResult resultObject = sywrServiceConnector.getMemberLookup(phoneNumber);
		for(Object obj :resultObject.getContent()){
			Epsilon mobj = Epsilon.class.cast(obj);
			Response res = mobj.getResponse();
			GetMemberLookupReply reply = res.getGetMemberLookupReply();
			List<MemberExtended> memberList = reply.getMembers().getMemberExtended();
		    for(Member mem:memberList){
		    	System.out.println(mem.getClubStatusChangeDate());
		    	System.out.println(mem.getDateIssued());
		    	System.out.println(mem.getMemberSinceDate());
		    }
		}*/
		
		return sywrServiceConnector.getMemberLookup(phoneNumber);
	}
	
	public List<ServiceOrder> getServiceOrderDetails(String emailAddress) throws Exception {
		return serviceOrderClient.getServiceOrderDetails(emailAddress);
	}
	
	public OriginationDTO fetchOriginationData(String customerId) throws Exception{
		return cuidServiceDao.fetchOriginationData(customerId);
	}
	
	public SearchPartOrderDirectResponseVO searchPartOrder(SearchPartOrderDirectRequestVO searchPartOrderDirectRequestVO) throws Exception {
		return partsServiceConnector.searchPartOrder(searchPartOrderDirectRequestVO);
	}
	
	public AgreementResponse retrieveAgreementList(AgreementListRequest agreementListRequest) throws Exception {
		return agreementServiceConnector.retrieveAgreementList(agreementListRequest);
	}
	
	public HwpDetailsResponse getContractDetail(HwpDetailsRequest hwpDetailsRequest) throws Exception {
		return agreementServiceConnector.getContractDetail(hwpDetailsRequest);
	}
	
}
