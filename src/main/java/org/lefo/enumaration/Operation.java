package org.lefo.enumaration;

import lombok.Getter;

@Getter
public enum Operation
{
  SUM(1,"SUM"),             //1-TOPLA 2-ÇIKARMA 3-ÇARPMA 4-BÖLME
  SUBTRACT(2,"SUBTRACT"),
  MULTIPLY(3,"MULTIPLY"),
  DIVIDE(4,"DIVIDE");

  private Integer kod;
  private String name;

  Operation(int i, String s)
  {
    this.kod=i;
    this.name=s;
  }
  public static Operation getEnumByKod(int kod)
  {
    for(Operation operation : Operation.values())
    {
      if(operation.getKod().equals(kod))
      {
        return operation;
      }
    }
    return null;
  }
  public static Operation getEnumByName(String s)
  {
    for(Operation operation : Operation.values())
    {
      if(operation.getName().equals(s))
      {
        return operation;
      }
    }
    return null;
  }
}
