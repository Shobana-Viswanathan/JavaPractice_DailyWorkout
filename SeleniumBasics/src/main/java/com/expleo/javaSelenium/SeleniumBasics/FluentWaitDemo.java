package com.expleo.javaSelenium.SeleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class FluentWaitDemo {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://omayo.blogspot.com/");
		driver.findElement(By.className("dropbtn")).click();
		driver.findElement(By.linkText("Facebook")).click();
		Wait<WebDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(2))
				.pollingEvery(Duration.ofMillis(300)).ignoring(ElementNotInteractableException.class);
		WebElement fb=wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver d) {
				return d.findElement(By.cssSelector("a[href='http://facebook.com']"));
			}
		});
		fb.click();


}}