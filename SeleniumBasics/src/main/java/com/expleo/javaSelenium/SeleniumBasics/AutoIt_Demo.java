package com.expleo.javaSelenium.SeleniumBasics;

import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class AutoIt_Demo {

	public static void main(String[] args) throws IOException, InterruptedException {
		
    WebDriver driver=new ChromeDriver();
    driver.get("https://pdf2doc.com/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    WebElement file=driver.findElement(By.xpath("//span[text()='UPLOAD FILES']"));
    file.click();
   
    Runtime.getRuntime().exec("\"C:\\Users\\Hp\\OneDrive\\Documents\\autoit1demo.exe\"");
    
   
	}

}
