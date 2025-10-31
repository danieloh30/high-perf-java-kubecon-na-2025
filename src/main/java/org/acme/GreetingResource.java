package org.acme;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from KubeCon NA 2025";
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("name")
    public String helloName() {
        return "Welcome Dan & Ryan at the Application Development Track!!!";
    }
}
