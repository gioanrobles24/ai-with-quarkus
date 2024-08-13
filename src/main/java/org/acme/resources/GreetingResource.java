package org.acme.resources;

import org.acme.services.MyAIService;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/chat")
public class GreetingResource {

  @Inject
  MyAIService myAIService;

  @POST
  @Produces(MediaType.TEXT_PLAIN)
  @Consumes(MediaType.TEXT_PLAIN)
  public String hello(String body) {
    return myAIService.chat(1, body);
  }

}
