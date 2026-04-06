package com.expleo.javaSelenium.SeleniumBasics;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Linkedin {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.linkedin.com/checkpoint/lg/sign-in-another-account");
		WebElement email=driver.findElement(By.cssSelector("input#username"));
		email.sendKeys("shobanav112@gmail.com");
		Thread.sleep(5000);
		WebElement password=driver.findElement(By.cssSelector("input#password"));
		password.sendKeys("shobanav543!");
		Thread.sleep(5000);
		WebElement signin=driver.findElement(By.cssSelector("button[type=\"submit\"]"));
		signin.click();
		String currentUrl = driver.getCurrentUrl();

        if (currentUrl.contains("feed")) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Login Failed");
        }

	}

}
