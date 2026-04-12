package com.expleo.javaSelenium.SeleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WithoutSelectClass_BySendKeys {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.leafground.com/select.xhtml;jsessionid=node0khs8ik5xi9in1odb14p9ym3lm14556593.node0");
		WebElement drop = driver.findElement(By.id("j_idt87:auto-complete_input"));
		drop.sendKeys("Selenium WebDriver");
		drop.sendKeys(Keys.ENTER);
		
	}

}
