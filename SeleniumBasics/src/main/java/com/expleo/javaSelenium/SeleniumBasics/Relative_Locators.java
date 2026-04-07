package com.expleo.javaSelenium.SeleniumBasics;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Relative_Locators {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		
		WebElement firstName = driver.findElement(By.xpath("//label[text() = \"First Name \"]/following-sibling::input[@name = \"name\"]"));
		WebElement lastName = driver.findElement(with(By.tagName("input")).below(firstName));
		
		firstName.sendKeys("Shobana");
		lastName.sendKeys("Viswanathan");
	}

}
