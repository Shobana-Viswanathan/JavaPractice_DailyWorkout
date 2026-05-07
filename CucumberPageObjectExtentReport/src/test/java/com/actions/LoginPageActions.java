package com.actions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.time.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.PageFactory;

import com.pages.LoginPageLocators;
import com.utilities.HelperClass;

public class LoginPageActions {
LoginPageLocators loginPageLocators=null;
String strUserName,strPassword;
   public LoginPageActions() {
	   this.loginPageLocators=new LoginPageLocators();
	   PageFactory.initElements(HelperClass.getDriver(), loginPageLocators);
   }
   public void setUserName(String strUserName) {

	    WebDriverWait wait = new WebDriverWait(
	            HelperClass.getDriver(),
	            Duration.ofSeconds(20));

	    wait.until(ExpectedConditions.visibilityOf(loginPageLocators.userName));

	    loginPageLocators.userName.sendKeys(strUserName);
	}
   public void setPassword(String strPassword) {

	    WebDriverWait wait = new WebDriverWait(
	            HelperClass.getDriver(),
	            Duration.ofSeconds(20));

	    wait.until(ExpectedConditions.visibilityOf(loginPageLocators.password));

	    loginPageLocators.password.sendKeys(strPassword);
	}
   public void clickLogin() {

	    WebDriverWait wait = new WebDriverWait(
	            HelperClass.getDriver(),
	            Duration.ofSeconds(20));

	    wait.until(ExpectedConditions.elementToBeClickable(loginPageLocators.login));

	    loginPageLocators.login.click();
	}
   public void login() {
	   File file=new File("C:\\Users\\Hp\\OneDrive\\Desktop\\Expleo Training\\CucumberPageObjectExtentReport\\src\\test\\resources\\testdata.properties");
	   FileInputStream fileInput=null;
	   try {
		   fileInput=new FileInputStream(file);
		   
	   }
	   catch(FileNotFoundException e) {
		   e.printStackTrace();
	   }
	   Properties prop=new Properties();
	   try {
		   prop.load(fileInput);
	   }
	   catch(IOException e) {
		   e.printStackTrace();
	   }
	   strUserName=prop.getProperty("username");
	   strPassword=prop.getProperty("password");
	   this.setUserName(strUserName);
	   this.setPassword(strPassword);
	   this.clickLogin();  
   }
}
