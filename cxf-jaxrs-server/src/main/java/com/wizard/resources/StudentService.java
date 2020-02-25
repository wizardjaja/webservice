package com.wizard.resources;

import com.wizard.entity.Student;

import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@WebService
@Path("student")
public interface StudentService {

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_XML)
    Student getStudentById(@PathParam("id")Integer id);
}
