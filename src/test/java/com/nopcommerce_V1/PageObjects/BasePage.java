package com.nopcommerce_V1.PageObjects;

import org.openqa.selenium.WebDriver;

import com.nopcommerce_V1.DriverFactory.DriverFactory;
import com.nopcommerce_V1.Utilities.ConfigReader;

//import com.nopcommerce_V1.DriverFactory.DriverFactory;

public class BasePage {

  WebDriver driver = DriverFactory.driver ;
  
//Get URLS from Config
	String loginURL = ConfigReader.getLoginPage();
			//getProperty("loginPageUrl");
    
}
