package com.expleo.javaSelenium.SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames_Demo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demoqa.com/frames");
	    WebElement iframeele=driver.findElement(By.id("frame1"));
	    driver.switchTo().frame(iframeele);
	    String Frame_1=driver.findElement(By.id("sampleHeading")).getText();
	    System.out.println("Switch by locator: "+Frame_1);
        driver.switchTo().defaultContent();
        String mainPage=driver.findElement(By.xpath("//*[@id='framesWrapper']/h1")).getText();
        System.out.println("Back to main Page: "+mainPage);
        driver.switchTo().frame(1);
        String Frame_2=driver.findElement(By.id("sampleHeading")).getText();
        System.out.println("Switch by index: "+Frame_2);
        driver.quit();
	}

}
