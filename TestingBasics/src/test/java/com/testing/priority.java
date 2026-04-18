package com.testing;

import org.testng.annotations.Test;

public class priority {
  @Test(priority=3)
  public void f() {
	  System.out.println("Hello");
  }
  @Test(priority=2)
  public void g() {
	  System.out.println("Hi");
  }
  @Test(priority=1)
  public void h() {
	  System.out.println("Shobana");
  }
}
