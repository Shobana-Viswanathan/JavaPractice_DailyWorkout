package com.stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class CartStepdefinition {

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

    @Given("User is navigates to demoblaze")
    public void user_is_on_home_page() {
        driver.get("https://demoblaze.com/");
    }

    @When("User clicks Phones button")
    public void user_clicks_phones_button() {
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Phones"))).click();
    }

    @When("User clicks Laptops button")
    public void user_clicks_laptops_button() {
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Laptops"))).click();
    }

    @When("User clicks Monitors button")
    public void user_clicks_monitors_button() {
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Monitors"))).click();
    }

    @When("User click on {string}")
    public void user_click_on_product(String product) {
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText(product))).click();
    }

    @When("User have to click button {string}")
    public void user_click_add_to_cart(String button) {
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText(button))).click();
    }

    @Then("User should add the product successfully to cart")
    public void user_should_add_product_to_cart() {
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        System.out.println("Product added: " + alert.getText());
        alert.accept();
    }

    @After
    public void tearDown() {
        driver.quit();
        System.out.println("Browser Closed");
    }
}