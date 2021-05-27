package com.cg.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "feature", glue = "com.cg.stepdef", monochrome = true, plugin = {"pretty", "json:target/cucumber.json","html:target/index.html"}, dryRun = false, tags = "@login or @positive")
public class TestRunner {

}
