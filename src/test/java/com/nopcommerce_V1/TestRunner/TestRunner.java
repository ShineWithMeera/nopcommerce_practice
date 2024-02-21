package com.nopcommerce_V1.TestRunner;

import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/Features"},
glue = {"StepDefinitions", "Hooks"})


public class TestRunner extends AbstractTestNGCucumberTests {
	   
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
    return super.scenarios();
  }
}  