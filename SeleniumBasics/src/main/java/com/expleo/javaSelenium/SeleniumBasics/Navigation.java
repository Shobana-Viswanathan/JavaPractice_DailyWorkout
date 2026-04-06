package com.expleo.javaSelenium.SeleniumBasics;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("http://www.google.com");
    Thread.sleep(5000);
    driver.navigate().to("http://www.smartcliff.in");
    Thread.sleep(5000);
    driver.navigate().back();
    Thread.sleep(5000);
    driver.navigate().forward();
    Thread.sleep(5000);
    driver.navigate().refresh();
    Thread.sleep(5000);
    driver.close();
	}
	
}




