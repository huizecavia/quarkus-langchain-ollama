package io.matthijs;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/hello")
public class GreetingResource {

    @Inject
    Assistant assistant;

    @GET
    public String hello() {
        return assistant.greeting();
    }
}
