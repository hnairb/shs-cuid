package com.searshc.hs.agreement.agreementservice.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.searshc.hs.agreement.agreementservice.domain.request.AddRequest;
import com.searshc.hs.agreement.agreementservice.domain.request.AgreementDetailsRequest;
import com.searshc.hs.agreement.agreementservice.domain.request.AgreementListRequest;
import com.searshc.hs.agreement.agreementservice.domain.request.CancelRequest;
import com.searshc.hs.agreement.agreementservice.domain.request.DetailsRequest;
import com.searshc.hs.agreement.agreementservice.domain.request.LeadDetailsRequest;
import com.searshc.hs.agreement.agreementservice.domain.request.ManualLeadRequestVO;
import com.searshc.hs.agreement.agreementservice.domain.request.QueueCancelListRequest;
import com.searshc.hs.agreement.agreementservice.domain.request.QueueCancelRequest;
import com.searshc.hs.agreement.agreementservice.domain.request.ReprintRequest;
import com.searshc.hs.agreement.agreementservice.domain.request.SettlementRequest;
import com.searshc.hs.agreement.agreementservice.domain.request.TechPASalesRequest;
import com.searshc.hs.agreement.agreementservice.domain.response.AddResponse;
import com.searshc.hs.agreement.agreementservice.domain.response.AgreementDetailResponse;
import com.searshc.hs.agreement.agreementservice.domain.response.AgreementResponse;
import com.searshc.hs.agreement.agreementservice.domain.response.CancelResponse;
import com.searshc.hs.agreement.agreementservice.domain.response.ItemDetailsResponse;
import com.searshc.hs.agreement.agreementservice.domain.response.LeadDetailsResponse;
import com.searshc.hs.agreement.agreementservice.domain.response.ManualLeadResponseVO;
import com.searshc.hs.agreement.agreementservice.domain.response.QueueCancelListResponse;
import com.searshc.hs.agreement.agreementservice.domain.response.QueueCancelResponse;
import com.searshc.hs.agreement.agreementservice.domain.response.ReprintResponse;
import com.searshc.hs.agreement.agreementservice.domain.response.SettlementResponse;
import com.searshc.hs.agreement.agreementservice.domain.response.TechPASalesResponse;
import com.searshc.hs.agreement.contract.service.domain.request.HwpDetailsRequest;
import com.searshc.hs.agreement.contract.service.domain.response.HwpDetailsResponse;

@Path("/agreementservice")
@Produces({"application/xml"})
@Consumes({"application/xml"})
public interface AgreementService {
	
	@POST
	@Path("/agreement/hwpdetails")
	public HwpDetailsResponse getContractDetail(
			HwpDetailsRequest hwpDetailsRequest);
	
	@POST
	@Path("/agreement/list")
	public AgreementResponse getAgreementList(AgreementListRequest agreementListRequest);
	
	@POST
	@Path("/agreement/details")
	public AgreementDetailResponse getAgreementDetails(AgreementDetailsRequest agreementDetailsRequest);
	
	@POST
	@Path("/agreement/item/details")
	public ItemDetailsResponse getItemDetails(DetailsRequest request);
	 
	@POST
	@Path("/agreement/addagreement")
	public AddResponse addAgreement(AddRequest addRequest);
	
	@POST
	@Path("/agreement/leaddetails")
	public LeadDetailsResponse getLeadDetails(LeadDetailsRequest leadDetailsRequest);
	
	@POST
	@Path("/agreement/queuecancel")
	public QueueCancelResponse queueCancel(QueueCancelRequest queueCancelRequest);
	
	@POST
	@Path("/agreement/queuecancellist")
	public QueueCancelListResponse queueCancelList(QueueCancelListRequest queueCancelListRequest);
	
	@GET
	@Path("/agreement/ping")
	public String ping();
	
	@POST
	@Path("/agreement/cancelagreement")
	public CancelResponse cancelAgreement(CancelRequest cancelRequest);
	
	@POST
	@Path("/agreement/createtechpa")
	public TechPASalesResponse createTechPA(TechPASalesRequest techPASalesRequest);
	
	@POST
	@Path("/agreement/reprint")
	public ReprintResponse reprint(ReprintRequest reprintRequest);

	@POST
	@Path("/agreement/settlement")
	public SettlementResponse settlement(SettlementRequest settlementRequest);
	
	@POST
	@Path("/agreement/addmanualleadpending")
	public ManualLeadResponseVO addManualLeadPending(ManualLeadRequestVO manualLeadRequestVO);
	
	@POST
	@Path("/agreement/addmanuallead")
	public ManualLeadResponseVO addManualLead(ManualLeadRequestVO manualLeadRequestVO);


}