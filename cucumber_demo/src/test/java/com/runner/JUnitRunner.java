package com.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/com/features/Login.feature",
    glue = "com.stepdefinitions",
    plugin = {
        "pretty",
        "html:target/cucumber-reports/JUnitReport.html"
    },
    monochrome = true
)
public class JUnitRunner {
}