package com.tests;

import org.testng.Assert;
import org.testng.annotations.*;

import com.pages.RegistrationPage;
import com.utilities.Data_Provider;

@Listeners(com.utilities.ListenerClass.class)
public class RegistrationTest extends BaseTest {

	@Test(priority = 1, dataProvider = "RegisterData", dataProviderClass = Data_Provider.class)
	public void registerUser(String name, String email, String password, String fName, String lName, String addr,
			String state, String city, String zip, String mobile) {

		RegistrationPage reg = new RegistrationPage(getDriver());

		reg.clicksignup();
		reg.signUp(name, email);

		reg.fillDetails(password, fName, lName, addr, state, city, zip, mobile);
		reg.clickcreatebtn();

		String actual = reg.createdacc().trim();
		String expected = "Account Created!";

		Assert.assertTrue(actual.equalsIgnoreCase(expected));
	}

	@Test(priority = 2, dataProvider = "ExistingUser", dataProviderClass = Data_Provider.class)
	public void registerWithExistingEmail(String name, String email) {

		RegistrationPage reg = new RegistrationPage(getDriver());

		reg.clicksignup();
		reg.signUp(name, email);

		String actual = reg.errMessage();
		Assert.assertTrue(actual.contains("Email Address already exist"));
	}
}