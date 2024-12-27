package com.cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
features="src/test/java/features", glue={"stepDefinitions"} , monochrome=true,
tags=("@Datadriven"), dryRun=false, plugin = {"pretty", "json:target/cucumber-report.json"}
)
public class TestNGRunnerClass extends AbstractTestNGCucumberTests {
	
	
	
	
	


}
