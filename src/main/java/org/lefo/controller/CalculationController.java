package org.lefo.controller;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.lefo.dto.CalculateDTO;

@Path("/calculate")
public class CalculationController
{
  @POST
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  public double calculate(CalculateDTO dto)
  {
    String name = dto.getOperation();
    switch (name)
    {
      case "SUM" :
        return  dto.getNumber1() + dto.getNumber2();
      case "SUBTRACT" :
        return  dto.getNumber1() - dto.getNumber2();
      case "MULTIPLY" :
        return  dto.getNumber1() * dto.getNumber2();
      case "DIVIDE" :
        if(dto.getNumber2() == 0) throw new IllegalArgumentException("Cannot divide by zero !");
        return  dto.getNumber1() / dto.getNumber2();
      default:
        throw  new IllegalArgumentException("Unkown Opeataion .");
    }
  }

  @POST
  @Path("/test")
  public String test() {
    return "API is working!";
  }

}
