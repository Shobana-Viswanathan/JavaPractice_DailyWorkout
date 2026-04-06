package com.expleo.javaSelenium.SeleniumBasics;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitPractice {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.selenium.dev/selenium/web/dynamic.html");
    driver.findElement(By.cssSelector("input#reveal")).click();
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("revealed")));
	driver.findElement(By.id("revealed")).sendKeys("Hello");
	  String text = driver.findElement(By.id("revealed")).getAttribute("value");
	  System.out.println("Typed text is: " + text);
	}}
      
    
    		


	