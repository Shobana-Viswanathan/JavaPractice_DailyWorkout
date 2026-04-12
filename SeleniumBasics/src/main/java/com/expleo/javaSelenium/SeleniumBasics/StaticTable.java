package com.expleo.javaSelenium.SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		List<WebElement> find=driver.findElements(By.xpath("//table[@id=\"table1\"]"));
		//System.out.println(find.size());
		
		for(WebElement name:find) {
			System.out.println(name.getText());
		}
    driver.quit();

	}

}
