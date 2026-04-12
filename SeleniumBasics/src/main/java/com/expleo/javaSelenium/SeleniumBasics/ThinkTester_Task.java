package com.expleo.javaSelenium.SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThinkTester_Task {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://thinking-tester-contact-list.herokuapp.com/");
		WebElement name=driver.findElement(By.xpath("//input[@id='email']"));
		name.sendKeys("shobanav1102@gmail.com");
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("shobi11");
		WebElement submit=driver.findElement(By.xpath("//button[@id='submit']"));
		submit.click();
		List<WebElement> table=driver.findElements(By.xpath("//table[@id='myTable']/tr/td[2]"));
		   String expectedname="Arjun K";
		   int tablesize=table.size();
		   System.out.println("Table size:"+tablesize);
			for(WebElement data:table) {
			System.out.println(data.getText());
			}
			int i=1;
			for(WebElement data:table) {
				if(data.getText().equals(expectedname)) {
					List<WebElement> Rowdata=driver.findElements(By.xpath("//table[@id='myTable']/tr["+i+"]"));
					for(WebElement row:Rowdata) {
						System.out.println(row.getText());
					}
				}
				i++;
			}
		driver.quit();
	}

}
