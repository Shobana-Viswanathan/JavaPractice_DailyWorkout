package com.stepdefinitions;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;

public class loginwithdatatableheader {
	WebDriverWait wait;
	WebDriver driver;
	@Before
    public void setup() {
        System.out.println("Launching browser...");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }
	 @Then("user enter invalid input and assert")
	    public void user_enter_invalid_input_and_assert(DataTable dataTable) {
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logInModal")));
		 
		 List<Map<String,String>> user = dataTable.asMaps(String.class, String.class);
		 
		 for(Map<String,String> form : user) {
			 driver.findElement(By.xpath("//a[@id='login2']"));
			 String username = form.get("username");
			 String password = form.get("password");
			 String expectedMessage = form.get("errormessage");
			 
			 driver.findElement(By.id("loginusername")).clear();
			 driver.findElement(By.id("loginusername")).sendKeys(username);
			 
			 driver.findElement(By.id("loginpassword")).clear();
			 driver.findElement(By.id("loginpassword")).sendKeys(password);
			 
			 driver.findElement(By.xpath("//button[text()='Log in']")).click();
			 
			 Alert alert = wait.until(ExpectedConditions.alertIsPresent());
			 String actualMessage = alert.getText();
			 
			 Assert.assertEquals(actualMessage, expectedMessage);
			 
			 alert.accept();
		 }

	       

	        
	        wait.until(ExpectedConditions.elementToBeClickable(By.id("login2"))).click();

	    }
	@After
    public void tearDown() {
        System.out.println("Closing browser...");
        driver.quit();
    }
	   
	}

