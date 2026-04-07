package com.expleo.javaSelenium.SeleniumBasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoqATask_MutlipleWindowHandle {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://demoqa.com/browser-windows");
    String parentwindow=driver.getWindowHandle();
    System.out.println(parentwindow);
    Set<String> allWindowHandles= driver.getWindowHandles();
    System.out.println("Count of Window :"+allWindowHandles.size());
    driver.findElement(By.id("windowButton")).click();
    Set<String> newAllWindowsHandles=driver.getWindowHandles();
    System.out.println("New count of Window: "+newAllWindowsHandles.size());
    String ParentHandle=driver.getWindowHandle();
    System.out.println("Parent Window : "+ParentHandle);
    Iterator<String> iterator=newAllWindowsHandles.iterator();
    String mainWindow=iterator.next();
    String ChildWindow=iterator.next();
    System.out.println("Parent Window: "+mainWindow);
    System.out.println("Child Window: "+ChildWindow);
    driver.switchTo().window(ChildWindow);
    WebElement text=driver.findElement(By.id("sampleHeading"));
    System.out.println("Child_title: "+text.getText());
    driver.close();
    driver.switchTo().window(ParentHandle);
    System.out.println("Parent Title: "+driver.getTitle());
    driver.quit();
}}
