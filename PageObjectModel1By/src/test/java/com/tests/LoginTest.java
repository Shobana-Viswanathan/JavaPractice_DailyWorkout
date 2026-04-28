package com.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.LoginPage;

public class LoginTest extends BaseTest {
  @Test(priority = 0)
  public void loginTest() {
	  objLogin = new LoginPage(driver);
	  String loginPageTitle = objLogin.getLoginTitle();
	  //verify login page text
	  Assert.assertTrue(loginPageTitle.contains("Login"));
  }
}
