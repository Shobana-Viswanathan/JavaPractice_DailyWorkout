package com.tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.pages.LoginPage;
import com.utilities.Data_Provider;

@Listeners(com.utilities.ListenerClass.class)
public class LoginTest extends BaseTest {

    @Test(priority = 3, dataProvider = "ValidLogin", dataProviderClass = Data_Provider.class)
    public void validLogin(String email, String password) {

        LoginPage login = new LoginPage(getDriver());

        login.clicksignup();
        login.login(email, password);

        String actual = login.getLoggedUser();
        Assert.assertTrue(actual.contains("Logged in as"));
    }

    @Test(priority = 4, dataProvider = "InvalidLogin", dataProviderClass = Data_Provider.class)
    public void invalidLogin(String email, String password) {

        LoginPage login = new LoginPage(getDriver());

        login.clicksignup();
        login.login(email, password);

        String actual = login.getErrorMessage();
        Assert.assertTrue(actual.contains("incorrect"));    }
}