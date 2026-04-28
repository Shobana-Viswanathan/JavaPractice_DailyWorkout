package com.tests;

import org.testng.annotations.Test;

import com.pages.DashboardPage;
import com.pages.LoginPage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class BaseTest {
	public static WebDriver driver;
	LoginPage objLogin;
	DashboardPage objDashboardPage;
 
  @BeforeMethod
  public void setup() {
	  ChromeOptions options=new ChromeOptions();
	  options.addArguments("--remote-allow-origins=*");
	  driver = new ChromeDriver(options);
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com/");

	  
  }

  @AfterMethod
  public void close() {
	  driver.close();
  }

}
