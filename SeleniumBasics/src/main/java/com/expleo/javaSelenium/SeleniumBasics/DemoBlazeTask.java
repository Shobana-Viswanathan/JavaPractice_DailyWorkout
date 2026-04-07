package com.expleo.javaSelenium.SeleniumBasics;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class DemoBlazeTask {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.demoblaze.com/");
		driver.findElement(By.cssSelector("#login2")).click();
		driver.findElement(By.cssSelector("input#loginusername")).sendKeys("Shobi11");
		driver.findElement(By.cssSelector("input#loginpassword")).sendKeys("12345");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		driver.findElement(By.xpath("//button[@onclick=\"logIn()\"]")).click();

		String welcomeText = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.id("nameofuser"))
		).getText();

		if (welcomeText.contains("Shobi11")) {
			System.out.println("Login Successful");
		} else {
			System.out.println("Login Failed");
		}}}

		
		
	
