package com.expleo.javaSelenium.SeleniumBasics;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToNewWindow {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://demoqa.com/browser-windows");
	    System.out.println("DemoQa Opened");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("https://thinking-tester-contact-list.herokuapp.com/");
		System.out.println("ThinkingTester opened");
		driver.quit();
	}

	

}
