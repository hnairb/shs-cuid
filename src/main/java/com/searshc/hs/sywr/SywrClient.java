/**
 * Created by Apache CXF WadlToJava code generator
**/
package com.searshc.hs.sywr;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.searshc.hs.sywr.hs.searshc.com.request.LookupRequest;

@Path("/sywr")
public interface SywrClient {

    @GET
    @Produces("application/json")
    @Path("/balance/{memberNo}")
    public Response getBalancememberNo(@PathParam("memberNo") String memberNo);

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/lookup")
    public Response postLookup(LookupRequest request);

}