package com.expleo.javaSelenium.SeleniumBasics;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class ExplicitDemo {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		//WebElement timerbutton=wait.until(ExpectedConditions.elementToBeClickable(By.id("timerButton")));
		//timerbutton.click();
		WebElement ClickAfterTextAppears=wait.until(ExpectedConditions.elementToBeClickable(By.id("alert2")));
		ClickAfterTextAppears.click();
		

		

		
		
	}

}
