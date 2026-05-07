package com.utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import com.tests.BaseTest;

public class ListenerClass2  implements ITestListener {

	    @Override
	    public void onTestSuccess(ITestResult result) {
	        System.out.println("PASS : " + result.getName());
	    }

	    @Override
	    public void onTestFailure(ITestResult result) {

	        System.out.println("FAIL : " + result.getName());

	        WebDriver driver = BaseTest.driver.get();

	        TakesScreenshot ts = (TakesScreenshot) driver;

	        File src = ts.getScreenshotAs(OutputType.FILE);

	        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());

	        File dest = new File("screenshots/" + result.getName() + "_" + timeStamp + ".png");

	        try {
	            FileUtils.copyFile(src, dest);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	    @Override
	    public void onTestSkipped(ITestResult result) {
	        System.out.println("SKIP : " + result.getName());
	    }

	    @Override
	    public void onStart(ITestContext context) {
	    }

	    @Override
	    public void onFinish(ITestContext context) {
	    }
	}

