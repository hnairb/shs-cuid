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

import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.searshc.hs.som.thm.common.ServiceConstants;
import com.searshc.hs.som.thm.domain.npj.CustomerDetails;

/**
 * This is the client interface to the NPJProfile Service
 * 
 * @author Ranjit Bhakta
 * @version 1.0, Mar 04, 2014
 */
@Path("/profileservice")
@Produces( { "application/json", "application/xml" })
public interface ProfileDelegateClient {

	/**
	 * This method updates the Customer Details in the NPJ System
	 * 
	 * @param serviceName
	 * @param customerDetails
	 * @return response
	 */
	@POST
	@Path("/add")
	public Response addNPJProfile(@HeaderParam(ServiceConstants.SERVICE_NAME_HEADER) String serviceName, CustomerDetails customerDetails);
	
	/**
	 * This method adds the Customer Details in the NPJ System
	 * 
	 * @param serviceName
	 * @param customerDetails
	 * @return response
	 */
	@PUT
	@Path("/update")
	public Response updateNPJProfile(@HeaderParam(ServiceConstants.SERVICE_NAME_HEADER) String serviceName, CustomerDetails customerDetails);
}