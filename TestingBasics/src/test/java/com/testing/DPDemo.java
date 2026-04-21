package com.testing;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DPDemo {
	@DataProvider(name="testData")
	public Object[][] dataprovfunc(){
		return new Object[][] {{"Selenium"},{"TestNG"},{"Automation"} };
	}
  @Test
  public void f() {
  }
}
