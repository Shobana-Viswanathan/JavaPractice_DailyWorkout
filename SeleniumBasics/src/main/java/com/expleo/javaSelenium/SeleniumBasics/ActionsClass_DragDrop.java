package com.expleo.javaSelenium.SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass_DragDrop {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/drag.xhtml;jsessionid=node0js2qtlqele0717mubk101vmzk14534122.node0");
		driver.findElement(By.xpath("//p[normalize-space()='Drag to target']"));
		Actions act=new Actions(driver);
		WebElement source=driver.findElement(By.cssSelector("div[id='form:drag_content']"));
		WebElement target=driver.findElement(By.cssSelector("div[id='form:drop_header']"));
		//act.clickAndHold(source).moveToElement(target).perform();
		act.dragAndDrop(source, target).perform();
		
        
	}

}
