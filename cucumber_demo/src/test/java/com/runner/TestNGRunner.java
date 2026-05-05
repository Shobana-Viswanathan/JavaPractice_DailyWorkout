package com.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/resources/com/features/categories.feature",
    glue = "com.stepdefinitions",
    plugin = {
        "pretty",
        "html:target/cucumber-reports/TestNGReport.html"
    },
    monochrome = true
)
public class TestNGRunner extends AbstractTestNGCucumberTests {
}