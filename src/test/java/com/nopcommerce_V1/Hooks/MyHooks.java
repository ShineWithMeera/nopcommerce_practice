package com.nopcommerce_V1.Hooks;

import org.openqa.selenium.WebDriver;

import com.nopcommerce_V1.DriverFactory.DriverFactory;
import com.nopcommerce_V1.Utilities.ConfigReader;
import com.nopcommerce_V1.Utilities.LoggerLoad;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;



public class MyHooks {

	   public static DriverFactory driverfactory;
	   public static WebDriver driver;
	
	@BeforeAll
	public static void before() throws Throwable {
		
		//Get browser Type from config file
		LoggerLoad.info("Loading config file");
	    ConfigReader.loadConfig();

		 String browser=  ConfigReader.getBrowserType();

	    
	  //Initialize driver from driver factory
	    driverfactory = new DriverFactory ();
		driver = driverfactory.initializeDrivers(browser);
	    LoggerLoad.info("Initializing driver for : "+browser);
	    
	}
	
	@AfterAll
	
	public static void after() {
		LoggerLoad.info("Closing Driver");
	    
	}	
	
	
	
}
