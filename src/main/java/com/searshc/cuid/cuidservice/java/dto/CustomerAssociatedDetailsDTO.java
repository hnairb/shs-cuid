package com.searshc.cuid.cuidservice.java.dto;

import java.util.List;

import com.searshc.cuid.cuidservice.java.model.CustomerDetails;
import com.searshc.cuid.cuidservice.java.model.OriginationDTO;
import com.searshc.cuid.cuidservice.java.serviceorderclient.ServiceOrder;
import com.searshc.hs.agreement.agreementservice.domain.response.AgreementResponse;
import com.searshc.hs.agreement.contract.service.domain.response.HwpDetailsResponse;
import com.searshc.hs.domi.service.merchandise.lookup.list.response.LookupMerchandiseListResponse;
import com.searshc.hs.psc.partorderdirectservice.ws.service.SearchPartOrderDirectResponseVO;
import com.searshc.hs.som.thm.domain.sywr.GetMemberLookupResponse.GetMemberLookupResult;

public class CustomerAssociatedDetailsDTO {
	
	public CustomerDetails customerDetails;
	public LookupMerchandiseListResponse merchandise;
	public List<ServiceOrder> serviceOrderList;
	public OriginationDTO originationDTO;
	public SearchPartOrderDirectResponseVO searchPartOrderDirectResponseVO;
	public AgreementResponse agreementResponse;
	public HwpDetailsResponse hwpDetailsResponse;
	public GetMemberLookupResult getMemberLookupResult;
	
	public CustomerDetails getCustomerDetails() {
		return customerDetails;
	}
	public void setCustomerDetails(CustomerDetails customerDetails) {
		this.customerDetails = customerDetails;
	}
	public LookupMerchandiseListResponse getMerchandise() {
		return merchandise;
	}
	public void setMerchandise(LookupMerchandiseListResponse merchandise) {
		this.merchandise = merchandise;
	}
	public GetMemberLookupResult getGetMemberLookupResult() {
		return getMemberLookupResult;
	}
	public void setGetMemberLookupResult(GetMemberLookupResult getMemberLookupResult) {
		this.getMemberLookupResult = getMemberLookupResult;
	}
	public List<ServiceOrder> getServiceOrderList() {
		return serviceOrderList;
	}
	public void setServiceOrderList(List<ServiceOrder> serviceOrderList) {
		this.serviceOrderList = serviceOrderList;
	}
	public OriginationDTO getOriginationDTO() {
		return originationDTO;
	}
	public void setOriginationDTO(OriginationDTO originationDTO) {
		this.originationDTO = originationDTO;
	}
	public SearchPartOrderDirectResponseVO getSearchPartOrderDirectResponseVO() {
		return searchPartOrderDirectResponseVO;
	}
	public void setSearchPartOrderDirectResponseVO(
			SearchPartOrderDirectResponseVO searchPartOrderDirectResponseVO) {
		this.searchPartOrderDirectResponseVO = searchPartOrderDirectResponseVO;
	}
	public AgreementResponse getAgreementResponse() {
		return agreementResponse;
	}
	public void setAgreementResponse(AgreementResponse agreementResponse) {
		this.agreementResponse = agreementResponse;
	}
	public HwpDetailsResponse getHwpDetailsResponse() {
		return hwpDetailsResponse;
	}
	public void setHwpDetailsResponse(HwpDetailsResponse hwpDetailsResponse) {
		this.hwpDetailsResponse = hwpDetailsResponse;
	}
}
