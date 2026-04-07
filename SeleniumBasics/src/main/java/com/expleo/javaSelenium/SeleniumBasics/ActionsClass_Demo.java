package com.expleo.javaSelenium.SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		WebElement blogsMenuelement=driver.findElement(By.id("blogsmenu"));
		Actions act=new Actions(driver);
		act.moveToElement(blogsMenuelement).perform();
		WebElement option2=driver.findElement(By.xpath("//span[text()='SeleniumByArun']"));
		act.moveToElement(option2).click().build().perform();
        
	}

}
