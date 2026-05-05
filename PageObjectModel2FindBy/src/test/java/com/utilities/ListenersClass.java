package com.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import com.tests.LoginTest;

public class ListenersClass  implements ITestListener {
	 @Override
	    public void onTestStart(ITestResult result) {
	        System.out.println("Test Started: " + result.getName());
	    }
	    @Override
	    public void onTestSuccess(ITestResult result) {
	        System.out.println("Test Passed: " + result.getName());
	    }
	    @Override
	    public void onTestSkipped(ITestResult result) {
	        System.out.println("Test skipped: " + result.getName());
	    }
	    @Override
	    public void onTestFailure(ITestResult result) {
	        System.out.println("Test Failed: " + result.getName());
	        try {
	            captureScreenshot(result);
	        } catch (Exception e) {
	            System.out.println("Screenshot capture failed: " + e.getMessage());
	        }
	    }
	    public void captureScreenshot(ITestResult result) throws IOException {
	        Object currentClass = result.getInstance();
	        WebDriver driver = ((LoginTest) currentClass).driver.get();
	        if (driver == null) {
	            System.out.println("Driver is NULL → Screenshot skipped");
	            return;
	        }
	        if (!(driver instanceof TakesScreenshot)) {
	            System.out.println("Driver does not support screenshot");
	            return;
	        }
	        TakesScreenshot ts = (TakesScreenshot) driver;
	        File src = ts.getScreenshotAs(OutputType.FILE);
	        File dest = new File("screenshots/" + result.getName() + ".png");
	        dest.getParentFile().mkdirs();
	        FileUtils.copyFile(src, dest);
	        System.out.println("Screenshot captured: " + dest.getAbsolutePath());
	    }
}
