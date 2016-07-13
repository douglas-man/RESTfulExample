package com.webservices.rest;
 
//import org.apache.commons.logging.Log;
//import org.apache.commons.logging.LogFactory;

import org.apache.log4j.Logger;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

//import java.util.logging.Level;
//import java.util.logging.LogRecord;
//import java.util.logging.Logger;
 
@Path("/hello")
public class HelloWorldService {
	private static final Logger LOG = Logger.getLogger(HelloWorldService.class);

//	private Log log = LogFactory.getLog(HelloWorldService.class);
 
	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String msg) {

		LOG.debug("getMsg() is executed!");
		LOG.info("getMsg() is executed!");
		LOG.warn("getMsg() is executed!");
		LOG.error("getMsg() is executed!");

//		LOG.log(new LogRecord(PlatformLogger.Level.INFO, "Jersey say"));

		String output = "Jersey say : " + msg;
 
		return Response.status(200).entity(output).build();
 
	}
 
}