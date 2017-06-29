/* 
 * Copyright 2014 (C) Sears Holdings Corp  
 *  
 * Created on : 04-Mar-14
 * Author     : Ranjit Bhakta   
 * 
 *----------------------------------------------------------------------------- 
 * Revision History (Release 1.0.0.0) 
 *----------------------------------------------------------------------------- 
 * VERSION     AUTHOR/      DESCRIPTION OF CHANGE 
 * OLD/NEW     DATE                RFC NO 
 *----------------------------------------------------------------------------- 
 * --/1.0  | Ranjit Bhakta  | Initial Create. 
 *         | 04-Mar-14      | 
 *---------|--------------- |--------------------------------------------------- 
 */
package com.searshc.hs.som.thm.client.npj;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import com.searshc.hs.som.thm.common.ServiceConstants;
import com.searshc.hs.som.thm.domain.npj.CustomerSearchCriteria;
import com.searshc.hs.som.thm.domain.npj.SearchCriteria;

/**
 * This is the client interface to the CustomerDelegateService
 * 
 * @author Ranjit Bhakta
 * @version 1.0, Mar 04, 2014
 */
@Path("/delegateservice")
@Produces( { "application/json", "application/xml" })
public interface CustomerDelegateClient {

	/**
	 * This method searches the Customer Details for the given
	 * search criteria
	 * 
	 * @param customerSearchCriteria
	 * @return response
	 */
	@POST
	@Path("/search")
	public Response searchCustomer(@HeaderParam(ServiceConstants.SERVICE_NAME_HEADER) String serviceName, CustomerSearchCriteria customerSearchCriteria);
	
	/**
	 * This method searches the Customer Details for the given
	 * search criteria
	 * this search is used when customer key is known
	 * 
	 * @param searchCriteria
	 * @return response
	 */
	@GET
	@Path("/customer")
	public Response getCustomerDetails(@HeaderParam(ServiceConstants.SERVICE_NAME_HEADER) String serviceName, @QueryParam("") SearchCriteria searchCriteria);
}