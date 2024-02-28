package com.nopcommerce_V1.TestRunner;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@Test
@CucumberOptions(
		
		monochrome = false, // console output

		tags = "", // tags from feature file
		
		features= "/src/test/resources/Features",
		glue = { "nopcommerce_V1.StepDefinitions","com.nopcommerce_V1.Hooks" }
		
		
		)



public class TestRunner extends AbstractTestNGCucumberTests{

	@DataProvider(parallel = true)

	public Object[][] scenarios() {

    return super.scenarios();

  }

}




	
	

