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

public class DemoBlaze_Task {

	public static void main(String[] args) {
    WebDriver driver = new ChromeDriver();
    driver.get("https://demoblaze.com/");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    // Login to the Application 
    WebElement login=driver.findElement(By.xpath("//a[@id='login2']"));
    login.click();
    WebElement username=driver.findElement(By.xpath("//input[@id=\"loginusername\"]"));
    username.sendKeys("Shobs");
    WebElement password=driver.findElement(By.xpath("//input[@id=\"loginpassword\"]"));
    password.sendKeys("shobi11");
    WebElement submit=driver.findElement(By.xpath("//button[@onclick=\"logIn()\"]"));
    submit.click();
    WebElement welcomemsg=driver.findElement(By.linkText("Welcome Shobs"));
    String check= welcomemsg.getText();
    if(check.contains("Welcome Shobs")) {
    	System.out.println("Login Successful");
    }
    else {
    	System.out.println("Login failed");
    }
   
   
   // Category Navigation & Product Handling
   WebElement laptops=driver.findElement(By.linkText("Laptops"));
   Actions act=new Actions(driver);
   act.moveToElement(laptops).click().perform();
   List<WebElement> product=driver.findElements(By.xpath("//div[@id='tbodyid']//h4/a"));
   List<String> products=new ArrayList<>();
   for(WebElement p:product) {
	   products.add(p.getText());
   }
   Collections.sort(products);
   Set<String> sorted=new LinkedHashSet<>(products);  
   System.out.println("Sorted List");
   for(String name:sorted) {
	   System.out.println(name);
   }
   JavascriptExecutor js=(JavascriptExecutor) driver;
    WebElement macbook = driver.findElement(By.xpath("//a[text()='MacBook Pro']"));
	js.executeScript("arguments[0].scrollIntoView(true);", macbook);
	String productTit = macbook.getText();
	if (productTit.equals("MacBook Pro")) {
		System.out.println("Found Laptop: " + productTit);
	} else {
		System.out.println("Laptop not found");
	}
	

	// Add Product to Cart
	WebElement addToCart = driver.findElement(By.xpath("//a[text()='Add to cart']"));
	addToCart.click();
	driver.switchTo().alert().accept();
	WebElement cart = driver.findElement(By.id("cartur"));
	cart.click();
	WebElement productTitle = driver.findElement(By.xpath("//td[2]"));
	String title = productTitle.getText();
	WebElement productPrice = driver.findElement(By.xpath("//td[3]"));
	String price = productPrice.getText();
	if(title.equals("MacBook Pro")) {
	    System.out.println("Product added to cart");
	    System.out.println("MacBook Pro added to cart.");
	} else {
	    System.out.println("Product not added correctly");
	}
	System.out.println("Product Name: " + title);
	System.out.println("Product Price: " + price);
	
    driver.quit();
    
	}
}
