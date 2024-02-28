package com.nopcommerce_V1.TestRunner;
import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = { "pretty", "html:target/CucumberReport/nopcommerce.html",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}, // reporting purpose
		monochrome = false, // console output
		tags = "", // tags from feature file
		features = { "src/test/resources/Features/" }, // location of feature files
		glue = { "nopcommerce_V1.StepDefinitions", "com.nopcommerce_V1.Hooks" }) // location of step definition files
public class TestRunner extends AbstractTestNGCucumberTests {
	@DataProvider(parallel = false)
	public Object[][] scenarios() {

		return super.scenarios();
	}
}
