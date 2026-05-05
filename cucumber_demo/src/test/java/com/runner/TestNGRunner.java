package com.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/resources/com/features/loginwithdatatableusingheader.feature",
    glue = "com.stepdefinitions",
    plugin = {
        "pretty",
        "html:target/cucumber-reports/TestNGReport.html"
    }
   
)
public class TestNGRunner extends AbstractTestNGCucumberTests {
}