package com.ibm.br.hellodropwizard.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.WebApplicationException;

@Path("/")
public class CalculadoraResource {

	    @Path("/add")
	    @GET
	    public Double add(@QueryParam("a") Double a, @QueryParam("b") Double b) {
	        return a + b;
	    }

	    @Path("/multiply")
	    @GET
	    public Double multiply(@QueryParam("a") Double a, @QueryParam("b") Double b) {
	        return a * b;
	    }

	    @Path("/divide")
	    @GET
	    public Double divide(@QueryParam("a") Double a, @QueryParam("b") Double b) 
	    {
	        if (b == .0) {
	            throw new WebApplicationException("Não pode ser dividido por zero");
	        }
	        return a / b;
	}
}
