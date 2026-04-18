package com.testing;

import org.testng.annotations.Test;

public class dependsOngroups {
  @Test(groups="groupA")
  public void testMethod1() {
	  System.out.println("Running test 1");
  }
  @Test(groups="groupA")
  public void testMethod2() {
	  System.out.println("Running test 2");
  }
  @Test(groups="groupB")
  public void testMethod3() {
	  System.out.println("Running test 2");
  }
}
