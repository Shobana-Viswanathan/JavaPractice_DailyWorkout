package com.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pages.DashboardPage;
import com.pages.LoginPage;
import com.utilities.Data_Provider;

public class LoginTest extends BaseTest {

    LoginPage objLogin;
    DashboardPage objDashboardPage;

    @BeforeMethod
    public void initPage() {
        objLogin = new LoginPage(getDriver()); 
    }

    @Test
    public void loginTest() {
        String loginPageTitle = objLogin.getLoginTitle();
        Assert.assertTrue(loginPageTitle.contains("Login"));
    }

    @Test(dataProvider = "ValidData", dataProviderClass = Data_Provider.class)
    public void validLogin(String username, String password) {

        objLogin.login(username, password);

        objDashboardPage = new DashboardPage(getDriver());
        String dashboardTitle = objDashboardPage.getHomePageText();

        Assert.assertTrue(dashboardTitle.contains("Dashboard"));
    }

    @Test(dataProvider = "InValidData", dataProviderClass = Data_Provider.class)
    public void invalidLogin(String username, String password) {

        objLogin.login(username, password);

        String actual = objLogin.getErrText();
        Assert.assertTrue(actual.contains("Invalid"));
    }
}