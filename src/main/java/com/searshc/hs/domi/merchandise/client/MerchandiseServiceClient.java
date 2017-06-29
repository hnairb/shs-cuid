/**
 * Created by Apache CXF WadlToJava code generator
**/
package com.searshc.hs.domi.merchandise.client;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import com.searshc.hs.domi.service.merchandise.lookup.details.request.LookupMerchandiseDetailsRequest;

@Path("/merchandiseservice")
public interface MerchandiseServiceClient {

    @GET
    @Consumes({"application/json", "application/xml" })
    @Produces({"application/json", "application/xml" })
    @Path("/details")
    Response getMerchandiseDetails(LookupMerchandiseDetailsRequest lookupMerchandiseDetailsRequest);

    @GET
    @Consumes({"application/json", "application/xml"})
    @Produces({"application/json", "application/xml" })
    @Path("/list")
    Response getMerchandiseList(@QueryParam("custnum") String custnum,@QueryParam("custtype") String custtype, 
    		@QueryParam("lastitemsuffix") String lastitemsuffix, 
            @QueryParam("leadkey") String leadkey);

}