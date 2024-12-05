package org.lefo.controller;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class HelloController
{

    @GET
    @Path("/1")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello1()
    {
        return "Hello from Quarkus REST";
    }


    @GET
    @Path("/2")
    public String hello2()
    {
        return "Selamlarrrr Quarkusss , SpringBoot'u bitiriyorr muyuzzzz ?? ";
    }
}
