package com.tests;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(demolistener.class)
public class demotest {

    public WebDriver driver;
    public WebDriverWait wait;
    public static Logger logger = LogManager.getLogger(demotest.class);

    @BeforeMethod
    public void beforeTest() {
        logger.info("Launching browser");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://tutorialsninja.com/demo/index.php");
    }

    @Test
    public void loginTest() {

        logger.info("Clicking My Account");
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//span[normalize-space()='My Account']"))).click();

        logger.info("Clicking Login");
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//a[normalize-space()='Login']"))).click();

        logger.info("Entering credentials");
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.id("input-email"))).sendKeys("2k22ece089@kiot.ac.in");

        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.id("input-password"))).sendKeys("shobi11");

        logger.info("Clicking Login button");
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//input[@value='Login']"))).click();

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