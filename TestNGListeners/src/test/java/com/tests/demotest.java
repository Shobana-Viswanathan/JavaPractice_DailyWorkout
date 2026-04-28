package com.tests;

import org.testng.annotations.Test;


import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(demolistenerfail.class)
public class demotest {

        public WebDriver driver;
    	public static Logger logger=LogManager.getLogger(demotest.class);

	    @BeforeMethod
	    public void beforeTest() {
	    	  logger.info("Launching browser");
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.get("https://tutorialsninja.com/demo/index.php");
	    }
	   
	    @Test
	    public void loginTest() {
	        logger.info("Clicking My Account");
	        driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
	        logger.info("Clicking Login");
	        driver.findElement(By.xpath("//a[normalize-space()='Login']")).click();
	        logger.info("Entering credentials");
	        driver.findElement(By.id("input-email")).sendKeys("2k22ece089@kiot.ac.in");
	        driver.findElement(By.id("input-password")).sendKeys("shobi11");
	        driver.findElement(By.xpath("//input[@value='Login']")).click();

	        String title = driver.getTitle();
	        logger.info("Page title is: " + title);

	        Assert.assertTrue(title.contains("Account"));
	    }

	    @AfterMethod
	    public void afterTest() {
	        logger.info("Closing browser");
	        if (driver != null) {
	            driver.quit();
	        }
	    }
	}