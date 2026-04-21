package com.testing;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;

public class NewTest_Demo {
	public WebDriver driver;
	WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(15));
	
  @BeforeMethod
  public void beforeTest() {
	  ChromeOptions options=new ChromeOptions();
	  options.addArguments("--start-maximized");
	//  options.addArguments("--headless");
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
 
  
  
  @Test(groups="regression")
  public void invalid() {
	  driver.findElement(By.xpath("//a[@id='login2']")).click();
	  driver.findElement(By.xpath("//input[@id=\"loginusername\"]")).sendKeys("Shob");
	  driver.findElement(By.xpath("//input[@id=\"loginpassword\"]")).sendKeys("shobi11");
	  driver.findElement(By.xpath("//button[@onclick=\"logIn()\"]")).click();
	  

  }
	  
  @Test(groups="regression")
  public void invalid2(){
	  driver.findElement(By.xpath("//a[@id='login2']")).click();
	  driver.findElement(By.xpath("//input[@id=\"loginusername\"]")).sendKeys("Shobs");
	  driver.findElement(By.xpath("//input[@id=\"loginpassword\"]")).sendKeys(" ");
	  driver.findElement(By.xpath("//button[@onclick=\"logIn()\"]")).click();
	 

  }
 
  @Test
  public void depentTest(){
	  System.out.println("Done");
  }
  
  
  @AfterMethod
  public void afterTest() {
	  driver.quit();
  }

}
