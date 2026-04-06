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
		
		//search.sendKeys("LastName",Keys.ENTER);
		WebElement LastName=driver.findElement(By.xpath("//h1[text()=\"Register\"]"));
		WebElement search=driver.findElement(with(By.tagName("input")).below(LastName));
		search.sendKeys("LastName");
		WebElement lastname=driver.findElement(By.xpath("//input[@maxlength=\"15\"]"));
		WebElement find=driver.findElement(with(By.tagName("input")).above(search));
		find.sendKeys("Shobana");

	}

}
