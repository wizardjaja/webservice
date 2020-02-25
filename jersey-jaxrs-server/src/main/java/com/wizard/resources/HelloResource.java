package com.wizard.resources;

import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Component
@Path("hello")
public class HelloResource {

    @GET
    @Path("/sayHello")
    @Produces({MediaType.TEXT_HTML,MediaType.APPLICATION_JSON})
    public String sayHello() {
        return "Hello Sir,Welcome to Spring Boot ! 欢迎光临！";
    }
}
