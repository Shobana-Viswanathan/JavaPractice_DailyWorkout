package com.assessment5.Assessment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoBlaze_Task {

	public static void main(String[] args) {
    WebDriver driver = new ChromeDriver();
    driver.get("https://demoblaze.com/");
    WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
     // Login to the Application 
    WebElement login = wait.until(ExpectedConditions.elementToBeClickable(By.id("login2")));
    login.click();    
    WebElement username=wait.until(ExpectedConditions.elementToBeClickable(By.id("loginusername")));
    username.sendKeys("Shobs");
    WebElement password=wait.until(ExpectedConditions.elementToBeClickable(By.id("loginpassword")));
    password.sendKeys("shobi11");
    WebElement submit=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@onclick=\"logIn()\"]")));
    submit.click();
    WebElement welcomemsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nameofuser")));    
    String check= welcomemsg.getText();
    if(check.contains("Welcome")) {
    	System.out.println("Login Successful");
    }
    else {
    	System.out.println("Login failed");
    }
   
   
   // Category Navigation & Product Handling
   WebElement lap=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@onclick=\"byCat('notebook')\"]")));
   Actions act=new Actions(driver);
   act.moveToElement(lap).click().perform();
   List<WebElement> productList=driver.findElements(By.xpath("//div[@id='tbodyid']//h4/a"));
   List<String> productNames=new ArrayList<>(); 
   for(WebElement p:productList) {
	   productNames.add(p.getText());
	   
   }
   Collections.sort(productNames);
   Set<String> sorted=new LinkedHashSet<>(productNames);
   for(String name:sorted) {
	   System.out.println(name);
   }
   
   JavascriptExecutor js = (JavascriptExecutor) driver;
   WebElement macbook = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='MacBook Pro']")));
   js.executeScript("window.scrollBy(0,500)");
   String productTitle = macbook.getText();
   System.out.println("Found Laptop: " + productTitle);   
  
   //Add product to cart
   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='MacBook Pro']"))).click();
   wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Add to cart"))).click();
   wait.until(ExpectedConditions.alertIsPresent());
   driver.switchTo().alert().accept();
   System.out.println("Product added to cart");
   wait.until(ExpectedConditions.elementToBeClickable(By.id("cartur"))).click();
   wait.until(ExpectedConditions.visibilityOfElementLocated( By.xpath("//tbody[@id='tbodyid']/tr")));
   WebElement cartProduct = driver.findElement( By.xpath("//tbody[@id='tbodyid']/tr/td[2]"));
	String cartTitle = cartProduct.getText();
	WebElement cartPrice = driver.findElement(By.xpath("//tbody[@id='tbodyid']/tr/td[3]"));
	String cartProductPrice = cartPrice.getText();
	System.out.println("Cart Product: " + cartTitle);
	System.out.println("Cart Price: " + cartProductPrice);
	if(cartTitle.equals("MacBook Pro")) {
		System.out.println("Validation Successful");
	}
	else {
		System.out.println("Validation Failed");
	}
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Place Order']"))).click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name"))).sendKeys("Shobana");
	driver.findElement(By.id("country")).sendKeys("India");
	driver.findElement(By.id("city")).sendKeys("Chennai");
	driver.findElement(By.id("card")).sendKeys("123456789");
	driver.findElement(By.id("month")).sendKeys("04");
	driver.findElement(By.id("year")).sendKeys("2026");
	wait.until(ExpectedConditions.elementToBeClickable( By.xpath("//button[text()='Purchase']"))).click();
	WebElement confirmation = wait.until(ExpectedConditions.visibilityOfElementLocated( By.xpath("//div[@class='sweet-alert  showSweetAlert visible']")));
	String purchase = confirmation.getText();
	if (purchase.contains("Thank you for your purchase")) {
		System.out.println("Order is placed successfully");
		System.out.println("Order Details:\n" + purchase);
	} else {
		System.out.println("Order is Unsuccessful");
	}
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='OK']"))).click();
	
	System.out.println("Alert handled successfully.");
	driver.quit();
	}
}











