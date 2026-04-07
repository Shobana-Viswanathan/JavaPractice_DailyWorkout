package com.expleo.javaSelenium.SeleniumBasics;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConfigureSeleniumTask {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://configureselenium.blogspot.com");
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
    	driver.findElement(By.linkText("SELENIUM")).click();
    	WebElement totalViews = driver.findElement(By.id("Stats1_totalCount"));
    	String views = totalViews.getText();
    	System.out.println("Total Views: " + views);
    	driver.quit();}}