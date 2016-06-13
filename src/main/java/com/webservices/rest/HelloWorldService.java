package com.webservices.rest;
 
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
 
@Path("/hello")
public class HelloWorldService {

	private Log log = LogFactory.getLog(HelloWorldService.class);
 
	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String msg) {
		log.debug("using log4j xml config");
		log.info("using log4j xml config");
		log.warn("using log4j xml config");
		log.error("using log4j xml config");

		String output = "Jersey say : " + msg;
 
		return Response.status(200).entity(output).build();
 
	}
 
}