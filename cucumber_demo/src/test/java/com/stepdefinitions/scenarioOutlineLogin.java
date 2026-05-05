package com.stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class scenarioOutlineLogin {

    WebDriver driver;
    WebDriverWait wait;

    @Before
    public void setup() {
        System.out.println("Launching browser.");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");

        driver = new ChromeDriver(options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    @Given("User should be on Home page")
    public void user_should_be_on_home_page() {
        System.out.println("Opening URL.");
        driver.get("https://demoblaze.com/");
    }

    @When("User clicks login link")
    public void user_clicks_login_link() {
        wait.until(ExpectedConditions.elementToBeClickable(By.id("login2"))).click();
    }

    @When("User enters username as {string} and password as {string}")
    public void user_enters_username_as_and_password_as(String username, String password) {

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logInModal")));

        driver.findElement(By.id("loginusername")).clear();
        driver.findElement(By.id("loginusername")).sendKeys(username);

        driver.findElement(By.id("loginpassword")).clear();
        driver.findElement(By.id("loginpassword")).sendKeys(password);
    }

    @When("User clicks the Login button in the application")
    public void user_clicks_the_login_button_in_the_application() {
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[text()='Log in']"))).click();
    }

    @Then("User should be able to see an {string}")
    public void user_should_be_able_to_see_an(String expectedMsg) {
    	Alert alert = wait.until(ExpectedConditions.alertIsPresent());
	     String alertText = alert.getText();
	     
	     if(alertText.equals("Wrong password.")) {
	    	 String exp ="Wrong password.";
	    	 Assert.assertEquals(exp, alertText);
	    	 System.out.println("Alert: " + alertText);
	         alert.accept();
	     }
	     else if(alertText.equals("User does not exist.")) {
	    	 String exp ="User does not exist.";
	    	 Assert.assertEquals(exp, alertText);
	    	 System.out.println("Alert: " + alertText);
	         alert.accept();
	    	 
	     }
	     else {
	    	 String exp ="Please fill out Username and Password.";
	    	 Assert.assertEquals(exp, alertText);
	    	 System.out.println("Alert: " + alertText);
	         alert.accept();
	     }
       
    }

    @After
    public void tearDown() {
        System.out.println("Closing browser.");
        if (driver != null) {
            driver.quit();
        }
    }
}