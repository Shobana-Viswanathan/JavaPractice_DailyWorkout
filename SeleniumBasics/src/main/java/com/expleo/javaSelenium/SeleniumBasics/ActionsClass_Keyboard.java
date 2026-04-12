package com.expleo.javaSelenium.SeleniumBasics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass_Keyboard {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		Actions act=new Actions(driver);
		WebElement compendiumDevlink=driver.findElement(By.xpath("//a[normalize-space()='compendiumdev']"));
		act.keyDown(Keys.CONTROL).moveToElement(compendiumDevlink).click().keyUp(Keys.CONTROL).build().perform();
		Set<String> WindowHandle=driver.getWindowHandles();
		String parentwindow=driver.getWindowHandle();
		for(String handles:WindowHandle) {
			driver.switchTo().window(handles);
		}
		Thread.sleep(3000);
		System.out.println("Child Window : "+ WindowHandle );
		driver.switchTo().window(parentwindow);
		System.out.println("New Count of Window:"+WindowHandle.size());
        
	}

}
