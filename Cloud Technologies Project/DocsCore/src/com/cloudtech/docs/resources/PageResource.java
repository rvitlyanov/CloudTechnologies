package com.cloudtech.docs.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.Encoded;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.cloudtech.docs.core.Document;
import com.cloudtech.docs.core.Page;

@Path("docs")
public class PageResource {
	
	private final Document doc = new Document();
	
	@GET
	@Path("get/{page}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response update(@PathParam("page") int page) {
		doc.addPage();
		doc.updatePage(1, "alabala Nice, turska panica");
		return Response.ok(doc.getPage(page)).build();
	}
	
	@POST
	@Path("append/{page}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response appendContent(@Encoded @PathParam("page") int pageNumber, String text) {
		Page p = doc.getPage(pageNumber);
		p.append(text);
		return Response.ok().entity(doc.getPage(pageNumber)).build();
	}
	
	@POST
	@Path("update/{page}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response deleteContent(@Encoded @PathParam("page") int pageNumber, String text) {
		doc.updatePage(pageNumber, text);
		return Response.ok().entity(doc.getPage(pageNumber)).build();
	}
}
