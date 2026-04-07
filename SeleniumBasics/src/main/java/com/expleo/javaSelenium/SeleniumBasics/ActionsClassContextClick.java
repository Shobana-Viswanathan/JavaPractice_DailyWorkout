package com.expleo.javaSelenium.SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassContextClick {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		WebElement blogsMenuelement=driver.findElement(By.id("blogsmenu"));
		Actions act=new Actions(driver);
		WebElement search=driver.findElement(By.xpath("//input[@name='q']"));
		act.contextClick(search).perform();
	}

}
