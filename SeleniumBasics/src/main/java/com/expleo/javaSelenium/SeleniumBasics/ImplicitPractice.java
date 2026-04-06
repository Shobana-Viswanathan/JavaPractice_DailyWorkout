package com.expleo.javaSelenium.SeleniumBasics;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ImplicitPractice {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.selenium.dev/selenium/web/dynamic.html");
		driver.findElement(By.cssSelector("input#adder")).click();
		WebElement id=driver.findElement(By.cssSelector("div#box0"));
		System.out.println(id.getCssValue("background-color"));
		//WebElement box=driver.findElement(By.cssSelector("div.redbox"));
        
		
		

	}

}
