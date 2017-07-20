package com.searshc.cuid.cuidservice.java.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.searshc.cuid.cuidservice.java.dto.CustListByWildcardRequestDTO;
import com.searshc.cuid.cuidservice.java.dto.CustomerAssociatedDetailsDTO;
import com.searshc.cuid.cuidservice.java.dto.CustomerAssociatedResponseDTO;
import com.searshc.cuid.cuidservice.java.dto.CustomerDetailsRequestDTO;
import com.searshc.cuid.cuidservice.java.dto.CustomerListRequestDTO;
import com.searshc.cuid.cuidservice.java.dto.CustomerListResponseDTO;
import com.searshc.cuid.cuidservice.java.dto.CustomerResponseDTO;
import com.searshc.cuid.cuidservice.java.model.CustomerDetails;
import com.searshc.cuid.cuidservice.java.model.OriginationDTO;
import com.searshc.cuid.cuidservice.java.service.CuidRestService;
import com.searshc.cuid.cuidservice.java.serviceorderclient.ServiceOrder;
import com.searshc.hs.agreement.agreementservice.domain.request.AgreementListRequest;
import com.searshc.hs.agreement.agreementservice.domain.response.AgreementResponse;
import com.searshc.hs.agreement.contract.service.domain.request.HwpDetailsRequest;
import com.searshc.hs.agreement.contract.service.domain.response.HwpDetailsResponse;
import com.searshc.hs.domi.service.merchandise.lookup.list.response.LookupMerchandiseListResponse;
import com.searshc.hs.psc.partorderdirectservice.ws.service.SearchPartOrderDirectRequestVO;
import com.searshc.hs.psc.partorderdirectservice.ws.service.SearchPartOrderDirectResponseVO;
import com.searshc.hs.sywr.Type;
import com.searshc.hs.sywr.hs.searshc.com.request.LookupRequest;
import com.searshc.hs.sywr.hs.searshc.com.response.BalanceResponse;
import com.searshc.hs.sywr.hs.searshc.com.response.LookupResponse;

@RestController
@RequestMapping("/allservices")
public class CuidCustomerController {
	
	private static final Logger logger = LoggerFactory.getLogger(CuidCustomerController.class);
	
	@Autowired
	CuidRestService cuidRestService;
	
	@RequestMapping(value = "/retrieveCustomerDetailsById", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CustomerResponseDTO> retrieveCustomerDetailsById(@RequestBody(required = true) CustomerDetailsRequestDTO request) {
		CustomerResponseDTO customerResponseDTO = new CustomerResponseDTO();
		String customerId = null;
		ResponseEntity<CustomerResponseDTO> response;
			try {
				if(request != null & request.getCustomerId() != null & !(request.getCustomerId().equalsIgnoreCase("")) & (request.getCustomerId().matches("[0-9]+"))){
					customerId = request.getCustomerId();
				} else {
					logger.info("Entering retrieveCustomerDetailsById with incorrect format in request");
					customerResponseDTO.setCorrectResponse(false);
					customerResponseDTO.setErrorMessage("Please send Customer Id in proper format!");
					response = new ResponseEntity<CustomerResponseDTO>(customerResponseDTO, HttpStatus.BAD_REQUEST);
					return response; 
				}
				logger.info("Entering retrieveCustomerDetailsById for customer Id : ",customerId);
				List<CustomerDetails> customerDetailsList = cuidRestService.retrieveCustomerDetailsById(customerId);
				if(customerDetailsList.size() == 0) {
					customerResponseDTO.setCorrectResponse(false);
					customerResponseDTO.setErrorMessage("Customer not found with the Id !" + customerId);
					response = new ResponseEntity<CustomerResponseDTO>(customerResponseDTO, HttpStatus.BAD_REQUEST);
					return response; 
				} else if (customerDetailsList.size() > 1) {
					customerResponseDTO.setCorrectResponse(false);
					customerResponseDTO.setErrorMessage("More than one customer not found with the Id !" + customerId);
					response = new ResponseEntity<CustomerResponseDTO>(customerResponseDTO, HttpStatus.BAD_REQUEST);
					return response; 
				}
				customerResponseDTO.setCustomerDetails(customerDetailsList.get(0));
				response = new ResponseEntity<CustomerResponseDTO>(customerResponseDTO, HttpStatus.OK);
			} catch (Exception e) {
				e.printStackTrace();
				logger.error("Exception CuidRestController retrieveCustomerDetailsById method",e);
				customerResponseDTO.setCorrectResponse(false);
				customerResponseDTO.setErrorMessage("Some problem occured with the request! Please try again.");
				response = new ResponseEntity<CustomerResponseDTO>(customerResponseDTO, HttpStatus.BAD_REQUEST);
			}
		return response;
	}
	
	@RequestMapping(value = "/retrieveAllHouseholdMembers", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CustomerListResponseDTO> retrieveAllHouseholdMembers(@RequestBody(required = true) CustomerDetailsRequestDTO request) {
		CustomerListResponseDTO customerListResponseDTO = new CustomerListResponseDTO();
		List<CustomerDetails> customerDetailsList = new ArrayList<CustomerDetails>();
		String customerId = null;
		ResponseEntity<CustomerListResponseDTO> response;
		try{
			if(request != null & request.getCustomerId() != null & !(request.getCustomerId().equalsIgnoreCase("")) & (request.getCustomerId().matches("[0-9]+"))){
				customerId = request.getCustomerId();
			} else {
				logger.info("Entering retrieveAllHouseholdMembers with incorrect format in request");
				customerListResponseDTO.setCorrectResponse(false);
				customerListResponseDTO.setErrorMessage("Please send Customer Id in proper format!");
				response = new ResponseEntity<CustomerListResponseDTO>(customerListResponseDTO, HttpStatus.BAD_REQUEST);
				return response; 
			}
			customerDetailsList = cuidRestService.retrieveAllHouseholdMembers(customerId);
			if(customerDetailsList.size() == 0 ) {
				customerListResponseDTO.setCorrectResponse(false);
				customerListResponseDTO.setErrorMessage("Customer not found with the Id !" + customerId);
				response = new ResponseEntity<CustomerListResponseDTO>(customerListResponseDTO, HttpStatus.BAD_REQUEST);
				return response; 
			}
			customerListResponseDTO.setCustomerDetails(customerDetailsList);
			response = new ResponseEntity<CustomerListResponseDTO>(customerListResponseDTO, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("Exception CuidRestController retrieveAllHouseholdMembers method",e);
			customerListResponseDTO.setCorrectResponse(false);
			customerListResponseDTO.setErrorMessage("Some problem occured with the request! Please try again.");
			response = new ResponseEntity<CustomerListResponseDTO>(customerListResponseDTO, HttpStatus.BAD_REQUEST);
		}
		return response;
	}
	
	
	@RequestMapping(value = "/retrieveBulkCustDetailsById", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CustomerListResponseDTO> retrievBulkCustDetailsById(@RequestBody(required = true) CustomerListRequestDTO request) {
		CustomerListResponseDTO customerListResponseDTO = new CustomerListResponseDTO();
		List<CustomerDetails> customerDetailsList = new ArrayList<CustomerDetails>();
		List<String> customerIdList = null;
		ResponseEntity<CustomerListResponseDTO> response;
		try{
		if(request != null & request.getCustomerIdList() != null & request.getCustomerIdList().size() > 0){
			customerIdList = request.getCustomerIdList();
		} else {
			logger.info("Entering retrieveBulkCustDetailsById with incorrect format in request");
			customerListResponseDTO.setCorrectResponse(false);
			customerListResponseDTO.setErrorMessage("Please send Customer Id in proper format!");
			response = new ResponseEntity<CustomerListResponseDTO>(customerListResponseDTO, HttpStatus.BAD_REQUEST);
			return response;
		}
		customerDetailsList = cuidRestService.retrieveBulkCustomerDetails(customerIdList);
		if(customerDetailsList.size() == 0 ) {
			customerListResponseDTO.setCorrectResponse(false);
			customerListResponseDTO.setErrorMessage("No Customers found with the given Ids !");
			response = new ResponseEntity<CustomerListResponseDTO>(customerListResponseDTO, HttpStatus.BAD_REQUEST);
			return response;
		}
		customerListResponseDTO.setCustomerDetails(customerDetailsList);
		response = new ResponseEntity<CustomerListResponseDTO>(customerListResponseDTO, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("Exception CuidRestController retrievBulkCustDetailsById method",e);
			customerListResponseDTO.setCorrectResponse(false);
			customerListResponseDTO.setErrorMessage("Some problem occured with the request! Please try again.");
			response = new ResponseEntity<CustomerListResponseDTO>(customerListResponseDTO, HttpStatus.BAD_REQUEST);
		}
		return response;
	}
	
	@RequestMapping(value = "/retrieveCustomerAllAddresses", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CustomerListResponseDTO> retrieveCustomerAllAddresses(@RequestBody(required = true) CustomerDetailsRequestDTO request) {
		CustomerListResponseDTO customerListResponseDTO = new CustomerListResponseDTO();
		List<CustomerDetails> customerAllAddressList = new ArrayList<CustomerDetails>();
		String customerId = null;
		ResponseEntity<CustomerListResponseDTO> response;
		try {
			if(request != null & request.getCustomerId() != null & !(request.getCustomerId().equalsIgnoreCase("")) & (request.getCustomerId().matches("[0-9]+"))){
				customerId = request.getCustomerId();
			} else {
				logger.info("Entering retrieveCustomerAllAddresses with incorrect format in request");
				customerListResponseDTO.setCorrectResponse(false);
				customerListResponseDTO.setErrorMessage("Please send Customer Id in proper format!");
				response = new ResponseEntity<CustomerListResponseDTO>(customerListResponseDTO, HttpStatus.BAD_REQUEST);
				return response;
			}
			customerAllAddressList = cuidRestService.retrieveCustomerAllAddresses(customerId);
			if(customerAllAddressList.size() == 0 ) {
				customerListResponseDTO.setCorrectResponse(false);
				customerListResponseDTO.setErrorMessage("No Customers found with the given Ids !");
				response = new ResponseEntity<CustomerListResponseDTO>(customerListResponseDTO, HttpStatus.BAD_REQUEST);
				return response;
			}
			customerListResponseDTO.setCustomerDetails(customerAllAddressList);
			response = new ResponseEntity<CustomerListResponseDTO>(customerListResponseDTO, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("Exception CuidRestController retrieveCustomerAllAddresses method",e);
			customerListResponseDTO.setCorrectResponse(false);
			customerListResponseDTO.setErrorMessage("Some problem occured with the request! Please try again.");
			response = new ResponseEntity<CustomerListResponseDTO>(customerListResponseDTO, HttpStatus.BAD_REQUEST);
		}
		return response;
	}
	
	@RequestMapping(value = "/retrieveByWildcardMatch", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CustomerListResponseDTO> retrieveByWildcardMatch(@RequestBody(required = true) CustListByWildcardRequestDTO request) {
		CustomerListResponseDTO customerListResponseDTO = new CustomerListResponseDTO();
		List<CustomerDetails> customerDetailsList = new ArrayList<CustomerDetails>();
		ResponseEntity<CustomerListResponseDTO> response;
		List<String> fieldNames=null;
		List<String> values=null;
		try{
			if(request != null){
				fieldNames = request.getFieldList();
				values = request.getFieldValues();
			} else {
				logger.info("Entering retrieveByWildcardMatch without any value in request");
				customerListResponseDTO.setCorrectResponse(false);
				customerListResponseDTO.setErrorMessage("Please send Customer Id in proper format!");
				response = new ResponseEntity<CustomerListResponseDTO>(customerListResponseDTO, HttpStatus.BAD_REQUEST);
				return response;
			}
			customerDetailsList = cuidRestService.retrieveByWildcardMatch(fieldNames, values);
			customerListResponseDTO.setCustomerDetails(customerDetailsList);
			response = new ResponseEntity<CustomerListResponseDTO>(customerListResponseDTO, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("Exception CuidRestController retrievBulkCustDetailsById method",e);
			customerListResponseDTO.setCorrectResponse(false);
			customerListResponseDTO.setErrorMessage("Some problem occured with the request! Please try again.");
			response = new ResponseEntity<CustomerListResponseDTO>(customerListResponseDTO, HttpStatus.BAD_REQUEST);
		}
		return response;
	}
	
	
	@RequestMapping(value = "/retrieveAssociatedData", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CustomerAssociatedResponseDTO> retrieveAssociatedData(@RequestBody(required = true) CustomerDetailsRequestDTO request) {
		CustomerAssociatedResponseDTO customerAssociatedResponseDTO = new CustomerAssociatedResponseDTO();
		CustomerAssociatedDetailsDTO customerAssociatedDetailsDTO = new CustomerAssociatedDetailsDTO();
		CustomerDetails customerDetails = new CustomerDetails();
		ResponseEntity<CustomerAssociatedResponseDTO> response;
		String customerId = null;
		try {
			if(request != null & request.getCustomerId() != null & !(request.getCustomerId().equalsIgnoreCase("")) & (request.getCustomerId().matches("[0-9]+"))){
				customerId = request.getCustomerId();
			} else {
				logger.info("Entering retrieveAssociatedData without any value in request");
				customerAssociatedResponseDTO.setCorrectResponse(false);
				customerAssociatedResponseDTO.setErrorMessage("Please send Customer Id in proper format!");
				response = new ResponseEntity<CustomerAssociatedResponseDTO>(customerAssociatedResponseDTO, HttpStatus.BAD_REQUEST);
				return response;
			}
			List<CustomerDetails> customerDetailsList = cuidRestService.retrieveCustomerDetailsById(customerId);
			if(customerDetailsList.size() == 0) {
				customerAssociatedResponseDTO.setCorrectResponse(false);
				customerAssociatedResponseDTO.setErrorMessage("Customer not found with the Id !" + customerId);
				response = new ResponseEntity<CustomerAssociatedResponseDTO>(customerAssociatedResponseDTO, HttpStatus.BAD_REQUEST);
				return response; 
			} else if (customerDetailsList.size() > 1) {
				customerAssociatedResponseDTO.setCorrectResponse(false);
				customerAssociatedResponseDTO.setErrorMessage("More than one customer not found with the Id !" + customerId);
				response = new ResponseEntity<CustomerAssociatedResponseDTO>(customerAssociatedResponseDTO, HttpStatus.BAD_REQUEST);
				return response; 
			}
			customerDetails = customerDetailsList.get(0);
			LookupMerchandiseListResponse merchObject=null;
			List<ServiceOrder> serviceOrderList=null;
			OriginationDTO originationDTO=null;
			SearchPartOrderDirectResponseVO partsResponseVO=null;
			AgreementResponse agreementResponse=null;
			HwpDetailsResponse hwpDetailsResponse = null;
			try{
				merchObject = cuidRestService.getMerchandiseList(customerId);
			} catch (Exception e){
				e.printStackTrace();
				logger.error("Exception is getting data from Merchandise API for customer Id {}.",customerId,e);
			}
			LookupRequest lookupRequest = new LookupRequest();
			LookupResponse lookupResponse = new LookupResponse();
			BalanceResponse balanceResponse = new BalanceResponse();
			try{
				lookupRequest.setValue(customerDetails.getEmailPrimary());
				lookupRequest.setType(Type.EMAIL);
				lookupResponse = cuidRestService.getMemberLookup(lookupRequest);
				if(lookupResponse == null ){
					lookupRequest.setValue(customerDetails.getPhonePrimary());
					lookupRequest.setType(Type.PHONE);
					lookupResponse = cuidRestService.getMemberLookup(lookupRequest);
				}
			} catch (Exception e){
				e.printStackTrace();
				logger.error("Exception is getting data from New SYW API getMemberLookup for customer Id {}. ",customerId,e);
			}
			try {
				if(null == lookupResponse){
					balanceResponse = null;
				} else {
					balanceResponse = cuidRestService.getMemberBalance(lookupResponse.getMembers().get(0).getMemberNo());
				}
			} catch (Exception e) {
				e.printStackTrace();
				logger.error("Exception is getting data from New SYW API getMemberLookup for customer Id {}. ",customerId,e);
			}
			try{
//						String phoneNum = "%2B12062901009";
				String phoneNum = "%2B"+customerDetails.getPhonePrimary();
				serviceOrderList = cuidRestService.getServiceOrderDetails(phoneNum);
			} catch (Exception e){
				e.printStackTrace();
				logger.error("Exception is getting data from SO API for customer Id {}.",customerId,e);
			}
			try{
				originationDTO = cuidRestService.fetchOriginationData(customerId);
//						originationDTO = cuidRestService.fetchOriginationData("18206581");
			} catch (Exception e) {
				e.printStackTrace();
				logger.error("Exception is getting data from origination details for customer Id {}.",customerId,e);
			}
			try{
				SearchPartOrderDirectRequestVO obj = new SearchPartOrderDirectRequestVO();
				obj.setClientId("CUID");
//						obj.setCustomerNo("1260052725");
				obj.setCustomerNo(customerId);
				partsResponseVO = cuidRestService.searchPartOrder(obj);
			} catch (Exception e){
				e.printStackTrace();
				logger.error("Exception is getting data from Parts API for customer Id {}.",customerId,e);
			}
			try{
				AgreementListRequest agreementListRequest= new AgreementListRequest();
//						agreementListRequest.setCustomerNumber("202054132");
				agreementListRequest.setCustomerNumber(customerId);
				agreementListRequest.setClient("CUID");
				agreementResponse = cuidRestService.retrieveAgreementList(agreementListRequest);
			} catch (Exception e){
				e.printStackTrace();
				logger.error("Exception is getting data from Agreement API for customer Id {}.",customerId,e);
			}
			try{
				HwpDetailsRequest hwpDetailsRequest = new HwpDetailsRequest();
//						hwpDetailsRequest.setCustNum("1259523985");
				hwpDetailsRequest.setCustNum(customerId);
				hwpDetailsRequest.setClient("CUID");
				hwpDetailsResponse = cuidRestService.getContractDetail(hwpDetailsRequest);
			} catch (Exception e){
				e.printStackTrace();
				logger.error("Exception is getting data from Contract call for customer Id {}.",customerId,e);
			}
			customerAssociatedDetailsDTO.setCustomerDetails(customerDetails);
			customerAssociatedDetailsDTO.setMerchandise(merchObject);
			customerAssociatedDetailsDTO.setServiceOrderList(serviceOrderList);
			customerAssociatedDetailsDTO.setOriginationDTO(originationDTO);
			customerAssociatedDetailsDTO.setSearchPartOrderDirectResponseVO(partsResponseVO);
			customerAssociatedDetailsDTO.setAgreementResponse(agreementResponse);
			customerAssociatedDetailsDTO.setHwpDetailsResponse(hwpDetailsResponse);
			customerAssociatedDetailsDTO.setLookupResponse(lookupResponse);
			customerAssociatedDetailsDTO.setBalanceResponse(balanceResponse);
			customerAssociatedResponseDTO.setCustomerAssociatedDetailsDTO(customerAssociatedDetailsDTO);
			response = new ResponseEntity<CustomerAssociatedResponseDTO>(customerAssociatedResponseDTO, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("Exception CuidRestController retrieveCustomerAllAddresses method",e);
			customerAssociatedResponseDTO.setCorrectResponse(false);
			customerAssociatedResponseDTO.setErrorMessage("Some problem occured with the request! Please try again.");
			response = new ResponseEntity<CustomerAssociatedResponseDTO>(customerAssociatedResponseDTO, HttpStatus.BAD_REQUEST);
		}
		return response;
	}
	
	@RequestMapping(value = "/retrieveAssociatedDataFixed", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CustomerAssociatedResponseDTO> retrieveAssociatedDataFixed(@RequestBody(required = true) CustomerDetailsRequestDTO request) {
		CustomerAssociatedResponseDTO customerAssociatedResponseDTO = new CustomerAssociatedResponseDTO();
		CustomerAssociatedDetailsDTO customerAssociatedDetailsDTO = new CustomerAssociatedDetailsDTO();
		CustomerDetails customerDetails = new CustomerDetails();
		ResponseEntity<CustomerAssociatedResponseDTO> response;
		String customerId = null;
		try {
			/*if(request != null & request.getCustomerId() != null & !(request.getCustomerId().equalsIgnoreCase("")) & (request.getCustomerId().matches("[0-9]+"))){
				customerId = request.getCustomerId();
			} else {
				logger.info("Entering retrieveAssociatedData without any value in request");
				customerAssociatedResponseDTO.setCorrectResponse(false);
				customerAssociatedResponseDTO.setErrorMessage("Please send Customer Id in proper format!");
				response = new ResponseEntity<CustomerAssociatedResponseDTO>(customerAssociatedResponseDTO, HttpStatus.BAD_REQUEST);
				return response;
			}
			List<CustomerDetails> customerDetailsList = cuidRestService.retrieveCustomerDetailsById(customerId);
			if(customerDetailsList.size() == 0) {
				customerAssociatedResponseDTO.setCorrectResponse(false);
				customerAssociatedResponseDTO.setErrorMessage("Customer not found with the Id !" + customerId);
				response = new ResponseEntity<CustomerAssociatedResponseDTO>(customerAssociatedResponseDTO, HttpStatus.BAD_REQUEST);
				return response; 
			} else if (customerDetailsList.size() > 1) {
				customerAssociatedResponseDTO.setCorrectResponse(false);
				customerAssociatedResponseDTO.setErrorMessage("More than one customer not found with the Id !" + customerId);
				response = new ResponseEntity<CustomerAssociatedResponseDTO>(customerAssociatedResponseDTO, HttpStatus.BAD_REQUEST);
				return response; 
			}
			customerDetails = customerDetailsList.get(0);*/
			LookupMerchandiseListResponse merchObject=null;
			List<ServiceOrder> serviceOrderList=null;
			OriginationDTO originationDTO=null;
			SearchPartOrderDirectResponseVO partsResponseVO=null;
			AgreementResponse agreementResponse=null;
			HwpDetailsResponse hwpDetailsResponse = null;
			try{
//						merchObject = cuidRestService.getMerchandiseList(customerId);
				merchObject = cuidRestService.getMerchandiseList("74859293");//("1260052725")
			} catch (Exception e){
				e.printStackTrace();
				logger.error("Exception is getting data from Merchandise API for customer Id {}.",customerId,e);
			}
			LookupRequest lookupRequest = new LookupRequest();
			LookupResponse lookupResponse = new LookupResponse();
			BalanceResponse balanceResponse = new BalanceResponse();
			try{
				lookupRequest.setValue("WDAILEY@CENTURYTEL.NET");
				lookupRequest.setType(Type.EMAIL);
				lookupResponse = cuidRestService.getMemberLookup(lookupRequest);
			} catch (Exception e){
				e.printStackTrace();
				logger.error("Exception is getting data from New SYW API getMemberLookup for customer Id {}. ",customerId,e);
			}
			try {
				balanceResponse = cuidRestService.getMemberBalance("7081103574785670");
//				balanceResponse.getAvailablePoints();
			} catch (Exception e) {
				e.printStackTrace();
				logger.error("Exception is getting data from New SYW API getMemberLookup for customer Id {}. ",customerId,e);
			}
			try{
				String phoneNum = "%2B12062901009";
				serviceOrderList = cuidRestService.getServiceOrderDetails(phoneNum);
			} catch (Exception e){
				e.printStackTrace();
				logger.error("Exception is getting data from SO API for customer Id {}.",customerId,e);
			}
			try{
				originationDTO = cuidRestService.fetchOriginationData("18206581");
			} catch (Exception e) {
				e.printStackTrace();
				logger.error("Exception is getting data from origination details for customer Id {}.",customerId,e);
			}
			try{
				SearchPartOrderDirectRequestVO obj = new SearchPartOrderDirectRequestVO();
				obj.setClientId("CASE");
//				obj.setCustomerNo("1260052725");
				obj.setCustomerNo("1260248363");
				partsResponseVO = cuidRestService.searchPartOrder(obj);
			} catch (Exception e){
				e.printStackTrace();
				logger.error("Exception is getting data from Parts API for customer Id {}.",customerId,e);
			}
			try{
				AgreementListRequest agreementListRequest= new AgreementListRequest();
//				agreementListRequest.setCustomerNumber("202054132");
				agreementListRequest.setCustomerNumber("19475874");
				agreementListRequest.setClient("CUID");
				agreementResponse = cuidRestService.retrieveAgreementList(agreementListRequest);
			} catch (Exception e){
				e.printStackTrace();
				logger.error("Exception is getting data from Agreement API for customer Id {}.",customerId,e);
			}
			try{
				HwpDetailsRequest hwpDetailsRequest = new HwpDetailsRequest();
//				hwpDetailsRequest.setCustNum("1259523985");
				hwpDetailsRequest.setCustNum("19475874");
				hwpDetailsRequest.setClient("CUID");
				hwpDetailsResponse = cuidRestService.getContractDetail(hwpDetailsRequest);
			} catch (Exception e){
				e.printStackTrace();
				logger.error("Exception is getting data from Contract call for customer Id {}.",customerId,e);
			}
			customerAssociatedDetailsDTO.setCustomerDetails(customerDetails);
			customerAssociatedDetailsDTO.setMerchandise(merchObject);
			customerAssociatedDetailsDTO.setServiceOrderList(serviceOrderList);
			customerAssociatedDetailsDTO.setOriginationDTO(originationDTO);
			customerAssociatedDetailsDTO.setSearchPartOrderDirectResponseVO(partsResponseVO);
			customerAssociatedDetailsDTO.setAgreementResponse(agreementResponse);
			customerAssociatedDetailsDTO.setHwpDetailsResponse(hwpDetailsResponse);
			customerAssociatedDetailsDTO.setLookupResponse(lookupResponse);
			customerAssociatedDetailsDTO.setBalanceResponse(balanceResponse);
			customerAssociatedResponseDTO.setCustomerAssociatedDetailsDTO(customerAssociatedDetailsDTO);
			response = new ResponseEntity<CustomerAssociatedResponseDTO>(customerAssociatedResponseDTO, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("Exception CuidRestController retrieveCustomerAllAddresses method",e);
			customerAssociatedResponseDTO.setCorrectResponse(false);
			customerAssociatedResponseDTO.setErrorMessage("Some problem occured with the request! Please try again.");
			response = new ResponseEntity<CustomerAssociatedResponseDTO>(customerAssociatedResponseDTO, HttpStatus.BAD_REQUEST);
		}
		return response;
	}
}
