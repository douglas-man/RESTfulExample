package com.webservices.rest;
 
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
 
@Path("/hello")
public class HelloWorldService {
	private static final Logger LOG = LogUtils.getLogger(HelloWorldService.class);

	private Log log = LogFactory.getLog(HelloWorldService.class);
 
	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String msg) {

		log.debug("getMsg() is executed!");
		log.info("getMsg() is executed!");
		log.warn("getMsg() is executed!");
		log.error("getMsg() is executed!");

		LOG.log(new LogRecord(Level.INFO, "Jersey say"));

		String output = "Jersey say : " + msg;
 
		return Response.status(200).entity(output).build();
 
	}
 
}