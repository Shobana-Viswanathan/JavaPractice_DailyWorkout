package com.utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.tests.BaseTest;

public class ListenersClass implements ITestListener {
	 public void onTestStart(ITestResult result) {
	        System.out.println("Test Started: " + result.getName());
	    }
	    public void onTestSuccess(ITestResult result) {
	        System.out.println("Test Passed: " + result.getName());
	    }
    public void onTestFailure(ITestResult result) {

        WebDriver driver = BaseTest.driver.get();

        TakesScreenshot screenshot = (TakesScreenshot)driver;
        		File source = screenshot.getScreenshotAs(OutputType.FILE);
        		try {
					FileUtils.copyFile(source, new File("./SeleniumScreenshots/Screen.png"));
				} catch (IOException e) {
					e.printStackTrace();
				}
        		System.out.println("Screenshot is captured");
        

        
       
}}