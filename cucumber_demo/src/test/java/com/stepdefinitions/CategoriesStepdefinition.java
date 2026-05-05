package com.stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class CategoriesStepdefinition {

    WebDriver driver;
    WebDriverWait wait;

    @Before
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");

        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        System.out.println("Browser Launched");
    }

    @Given("User opens the demoblaze application")
    public void user_navigates_to_homepage() {
        driver.get("https://demoblaze.com/");
    }

    @When("User clicks on Phones button")
    public void user_clicks_phones_button() {
        wait.until(ExpectedConditions.elementToBeClickable(
                By.linkText("Phones"))).click();
    }

    @When("User clicks on Laptops button")
    public void user_clicks_laptops_button() {
        wait.until(ExpectedConditions.elementToBeClickable(
                By.linkText("Laptops"))).click();
    }

    @When("User clicks on Monitors button")
    public void user_clicks_monitors_button() {
        wait.until(ExpectedConditions.elementToBeClickable(
                By.linkText("Monitors"))).click();
    }

    @Then("User should be able to view the Phone category")
    public void verify_phone_category() {
        System.out.println("Phone category displayed");
    }

    @Then("User should be able to view the Laptop category")
    public void verify_laptop_category() {
        System.out.println("Laptop category displayed");
    }

    @Then("User should be able to view the Monitor category")
    public void verify_monitor_category() {
        System.out.println("Monitor category displayed");
    }

    @After
    public void tearDown() {
        driver.quit();
        System.out.println("Browser Closed");
    }
}