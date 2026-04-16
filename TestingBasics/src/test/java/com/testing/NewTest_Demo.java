package com.testing;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;

public class NewTest_Demo {
	public WebDriver driver;
	
  @BeforeTest
  public void beforeTest() {
	  ChromeOptions options=new ChromeOptions();
	  options.addArguments("--start-maximized");
	  options.addArguments("--headless");
	  driver = new ChromeDriver(options);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	  driver.get("https://www.demoblaze.com/");
  }
	  
	  
  
  @Test
  public void loginTest() {
	  driver.findElement(By.xpath("//a[@id='login2']")).click();
	  driver.findElement(By.xpath("//input[@id=\"loginusername\"]")).sendKeys("Shobs");
	  driver.findElement(By.xpath("//input[@id=\"loginpassword\"]")).sendKeys("shobi11");
	  driver.findElement(By.xpath("//button[@onclick=\"logIn()\"]")).click();
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
