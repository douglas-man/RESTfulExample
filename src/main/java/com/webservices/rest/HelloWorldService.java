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

		log.debug("getMsg() is executed!");
		log.info("getMsg() is executed!");
		log.warn("getMsg() is executed!");
		log.error("getMsg() is executed!");

		String output = "Jersey say : " + msg;
 
		return Response.status(200).entity(output).build();
 
	}
 
}