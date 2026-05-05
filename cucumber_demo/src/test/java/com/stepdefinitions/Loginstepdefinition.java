package com.stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class Loginstepdefinition {

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

    @Given("User is on Home page")
    public void user_is_on_home_page() {
        System.out.println("Opening URL...");
        driver.get("https://demoblaze.com/");
    }

    @When("User have to click login link")
    public void user_have_to_click_login_link() {
        WebElement login = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("login2")));
        login.click();
    }

    @When("User enters valid username as {string}")
    public void user_enters_valid_username_as(String username) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginusername")))
                .sendKeys(username);
    }

    @When("User enters valid password as {string}")
    public void user_enters_valid_password_as(String password) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginpassword")))
                .sendKeys(password);
    }

    @When("User clicks login button")
    public void user_clicks_login_button() {
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[text()='Log in']"))).click();
    }

    @Then("User should be able to login successfully and have to verify the name of user")
    public void user_should_be_able_to_login_successfully() {
        WebElement welcomeMsg = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("nameofuser")));

        if (welcomeMsg.getText().contains("Welcome")) {
            System.out.println("Login Successful");
        } else {
        	System.out.println("Login not successful");
        }
    }

    @When("User enters invalid username as {string}")
    public void user_enters_invalid_username_as(String username) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginusername")))
                .sendKeys(username);
    }

    @When("User enters password as {string}")
    public void user_enters_password_as(String password) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginpassword")))
                .sendKeys(password);
    }

    @Then("User should not be able to login successfully and have the alert message as wrong username")
    public void user_invalid_username() {
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[text()='Log in']"))).click();

        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        System.out.println("Alert: " + alert.getText());
        alert.accept();
    }

    @When("User enters username as {string}")
    public void user_enters_username_as(String username) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginusername")))
                .sendKeys(username);
    }

    @When("User enters invalid password as {string}")
    public void user_enters_invalid_password_as(String password) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginpassword")))
                .sendKeys(password);
    }

    @Then("User should not be able to login into application successfully and have the alert message as wrong password")
    public void user_invalid_password() {
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[text()='Log in']"))).click();

        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        System.out.println("Alert: " + alert.getText());
        alert.accept();
    }

    @After
    public void tearDown() {
        System.out.println("Closing browser...");
        driver.quit();
    }
}