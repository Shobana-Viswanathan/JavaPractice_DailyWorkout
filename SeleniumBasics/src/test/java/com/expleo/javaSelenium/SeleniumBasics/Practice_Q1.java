package com.expleo.javaSelenium.SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_Q1 {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		//WebElement search=driver.findElement(By.name("q"));
		//search.sendKeys("TV Appilances",Keys.ENTER);
		System.out.println("Page title is: "+driver.getTitle());
		System.out.println("Length of the title: "+driver.getTitle().length());
		String curl=driver.getCurrentUrl();
		String url="https://www.flipkart.com/";
		if(url.equals(curl)) {
			System.out.println("Correct");
		}
		else {
			System.out.println("Not correct");
		}
		String page=driver.getPageSource();
		System.out.println(page.length());
		
		
		
	    
		
		
	}

}
