package com.stepdefinitions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginwithdatatablestepdefinition {
	WebDriver driver;
    WebDriverWait wait;

    @Before
    public void setup() {
        System.out.println("Launching browser...");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }
	@Given("User should be on Home page of login")
	public void user_should_be_on_home_page_of_login() {
		System.out.println("Opening URL.");
        driver.get("https://demoblaze.com/");
	}
	@When("User clicks login link of application")
    public void user_clicks_login_link() {
        wait.until(ExpectedConditions.elementToBeClickable(By.id("login2"))).click();
    }
	@When("User enters the Valid Credentials to login")
	public void user_enters_the_valid_credentials_to_login(DataTable dataTable)throws InterruptedException {

	    List<List<String>> sign = dataTable.asLists(String.class);

	    String username = sign.get(0).get(0);
	    String password = sign.get(0).get(1);

	    
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logInModal")));
	    driver.findElement(By.id("loginusername")).clear();
	    driver.findElement(By.id("loginusername")).sendKeys(username);
	    
	    driver.findElement(By.id("loginpassword")).clear();
	    driver.findElement(By.id("loginpassword")).sendKeys(password);

	   
	   
	}

	@When("User clicks the Login button in the application to login")
	public void user_clicks_the_login_button_in_the_application_to_login() {
		wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[text()='Log in']"))).click();

	}

	@Then("User should be able to see Welcome message")
	public void user_should_be_able_to_see_welcome_message() {
		WebElement welcomeMsg = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("nameofuser")));

        if (welcomeMsg.getText().contains("Welcome")) {
            System.out.println("Login Successful");
        } else {
        	System.out.println("Login not successful");
        }
	}

    @After
    public void tearDown() {
        System.out.println("Closing browser...");
        driver.quit();
    }
}
