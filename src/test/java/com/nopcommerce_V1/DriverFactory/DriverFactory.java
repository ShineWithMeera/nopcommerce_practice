package com.nopcommerce_V1.DriverFactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.nopcommerce_V1.Utilities.LoggerLoad;

public class DriverFactory {
	public static WebDriver driver;

	public WebDriver initializeDrivers(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {
			LoggerLoad.info("Testing on chrome");
			
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("firefox")) {
			LoggerLoad.info("Testing on firefox");
			
			driver = new FirefoxDriver();

		} else if (browser.equalsIgnoreCase("safari")) {
			LoggerLoad.info("Testing on safari");
			
			driver = new SafariDriver();

		} else if (browser.equalsIgnoreCase("edge")) {
			LoggerLoad.info("Testing on Edge");
			
			driver = new EdgeDriver();

		}
		// Set Page load timeout
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

		driver.manage().window().maximize();

		return driver;
	}

	public static WebDriver getdriver() {
		return driver;

	}

	public void closeallDriver() {
		driver.close();
	}

}
