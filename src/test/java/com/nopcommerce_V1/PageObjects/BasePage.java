package com.nopcommerce_V1.PageObjects;

import org.openqa.selenium.WebDriver;

import com.nopcommerce_V1.DriverFactory.DriverFactory;
import com.nopcommerce_V1.Utilities.ConfigReader;

	
	public class BasePage {
     WebDriver driver = DriverFactory.getdriver();
  
//Get URLS from Config
	String loginURL = ConfigReader.getLoginPageUrl();
			
}  

