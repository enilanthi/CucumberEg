package com.qa.test.auto.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/com/qa/test/auto/features"},
        glue = "com.qa.test.auto.stepdefs",
        format = { "pretty", "json:target/cucumber.json" },
//        format = {"pretty", "json:target/cucumber.json", "html:target/tempReport/site/cucumber-pretty"},
        monochrome = true
)
public class TestRunner {
}
