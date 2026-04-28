package com.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.DashboardPage;
import com.pages.LoginPage;

public class DashboardTest extends BaseTest {

    @Test
    public void dashboardTest() {

        LoginPage objLogin = new LoginPage(getDriver());
        objLogin.login("Admin", "admin123");

        DashboardPage objDashboardPage = new DashboardPage(getDriver());
        String dashboardTitle = objDashboardPage.getHomePageText();

        Assert.assertTrue(dashboardTitle.contains("Dashboard"));
    }
}