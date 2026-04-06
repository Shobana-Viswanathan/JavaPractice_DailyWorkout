package com.expleo.javaSelenium.SeleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LeafGroundPracticeWaitPractice {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/waits.xhtml");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[id='j_idt87:j_idt89']"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[id='j_idt87:j_idt92']"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[id='j_idt87:j_idt95']"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[id='j_idt87:j_idt96']"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[id='j_idt87:j_idt98']"))).click();
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector("button[id='j_idt87:j_idt99'] span"),"Did you notice?"));
		System.out.println("All actions completed!");
		driver.quit();}}












    