package com.testing;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Params {
  @Test
  @Parameters({"val1","val2"})
  public void sum( int v1, int v2) {
	  int finalsum=v1+v2;
	  System.out.println("Sum:"+finalsum);
  }
  @Test
  @Parameters({"val1","val2"})
  public void Sum1( int v1,  int v2) {
	  int finaldiff=v1-v2;
	  System.out.println("Difference:"+finaldiff);
  }
  
  
}
