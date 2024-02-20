package com.nopcommerce_V1.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.nopcommerce_V1.DriverFactory.DriverFactory;
import com.nopcommerce_V1.Utilities.ConfigReader;

public class BasePage {
	WebDriver driver = DriverFactory.driver;
	String loginpage = ConfigReader.getLoginPage();
	public BasePage() {
		PageFactory.initElements(driver, this);
	}

}
