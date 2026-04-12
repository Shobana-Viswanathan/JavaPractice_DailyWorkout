package com.expleo.javaSelenium.SeleniumBasics;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Promt {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement prompt_alert=driver.findElement(By.xpath("//input[@id='prompt']"));
		prompt_alert.click();
		prompt_alert.sendKeys("Hello");
		Alert alert=driver.switchTo().alert();
		alert.accept();
       //  Thread.sleep(3000);

	}

}
