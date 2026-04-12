package com.expleo.javaSelenium.SeleniumBasics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class LeafGroundWindowHandle_Task {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.leafground.com/window.xhtml;jsessionid=node01mm88nujbfg22187q58f2kmnne14530920.node0");
	    String parentwindow=driver.getWindowHandle();
	    driver.findElement(By.xpath("//span[normalize-space()='Close Windows']")).click();

	   
        driver.findElement(By.id("j_idt88:j_idt93")).click();
		Set<String> newallWindowid=driver.getWindowHandles();
		System.out.println("New Count of Window:"+newallWindowid.size());
        
		for(String id:newallWindowid) {
			driver.switchTo().window(id);
			if(driver.getTitle().equals("Alert")){

				driver.close();
				
			}
			if(driver.getTitle().equals("Input Components")){

				driver.close();
				
			}
			if(driver.getTitle().equals("Dashboard")){

				driver.close();
				
			}
		}}}
		


