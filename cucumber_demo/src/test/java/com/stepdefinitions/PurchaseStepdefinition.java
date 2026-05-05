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

public class PurchaseStepdefinition {

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

    @Given("User launch the demoblaze application")
    public void open_application() {
        driver.get("https://demoblaze.com/");
    }

    @When("User clicks Phones button")
    public void click_phones() {
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//a[text()='Phones']")
        )).click();
    }

    @When("User selects product {string}")
    public void select_product(String product) {
        wait.until(ExpectedConditions.elementToBeClickable(
                By.linkText(product)
        )).click();
    }

    @When("User clicks Add to cart button")
    public void add_to_cart() {
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//a[text()='Add to cart']")
        )).click();

        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.accept();

        System.out.println("Product added to cart");
    }

    @Then("Product should be added to cart")
    public void verify_product_added() {
        
    }

    @When("User clicks Cart button")
    public void click_cart() {
        wait.until(ExpectedConditions.elementToBeClickable(
                By.id("cartur")
        )).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//button[text()='Place Order']")
        ));
    }

    @When("User clicks Place Order button")
    public void click_place_order() {
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[text()='Place Order']")
        )).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.id("orderModal")
        ));
    }

    // ---------------- ORDER DETAILS ----------------
    @When("User enters name {string}")
    public void enter_name(String name) {
        driver.findElement(By.id("name")).clear();
        driver.findElement(By.id("name")).sendKeys(name);
    }

    @When("User enters country {string}")
    public void enter_country(String country) {
        driver.findElement(By.id("country")).clear();
        driver.findElement(By.id("country")).sendKeys(country);
    }

    @When("User enters city {string}")
    public void enter_city(String city) {
        driver.findElement(By.id("city")).clear();
        driver.findElement(By.id("city")).sendKeys(city);
    }

    @When("User enters credit card {string}")
    public void enter_card(String card) {
        driver.findElement(By.id("card")).clear();
        driver.findElement(By.id("card")).sendKeys(card);
    }

    @When("User enters month {string}")
    public void enter_month(String month) {
        driver.findElement(By.id("month")).clear();
        driver.findElement(By.id("month")).sendKeys(month);
    }

    @When("User enters year {string}")
    public void enter_year(String year) {
        driver.findElement(By.id("year")).clear();
        driver.findElement(By.id("year")).sendKeys(year);
    }

    @When("User clicks Purchase button")
    public void click_purchase() {
        driver.findElement(By.xpath("//button[text()='Purchase']")).click();
    }

    @Then("Order should be placed successfully")
    public void verify_order_success() {

        WebElement successMsg = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//h2[contains(text(),'Thank you for your purchase')]")
                )
        );

        if (successMsg.isDisplayed()) {
            System.out.println("Order placed successfully");
        }
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
        System.out.println("Browser Closed");
    }
}