package com.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.DashboardPage;
import com.pages.LoginPage;

public class DashboardTest extends BaseTest {
  @Test(priority=0)
  public void dashboardTest() {
	  objLogin=new LoginPage(driver);
	  objLogin.login("Admin", "admin123");
	  objDashboardPage=new DashboardPage(driver);
	  String dashboardTitle=objDashboardPage.getHomePageText();
	  Assert.assertTrue(dashboardTitle.contains("Dashboard"));
	  
  }
}
