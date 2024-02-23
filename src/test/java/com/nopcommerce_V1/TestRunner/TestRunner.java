package com.nopcommerce_V1.TestRunner;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@Test
@CucumberOptions(
		
		features= "/src/test/resources/Features",
		glue = "StepDefinitions"
		
		
		)



public class TestRunner extends AbstractTestNGCucumberTests{

	
	
	
}
