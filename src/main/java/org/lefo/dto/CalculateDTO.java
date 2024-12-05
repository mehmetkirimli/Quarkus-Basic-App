package org.lefo.dto;

import lombok.Getter;
import org.lefo.enumaration.Operation;

@Getter
public class CalculateDTO
{
  public double number1;
  public double number2;
  public String operation;
}
