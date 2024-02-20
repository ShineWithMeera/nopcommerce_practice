package com.nopcommerce_V1.Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	public static Properties prop;
	public final static String propertyFilePath = "./src/test/resources/Config/config.properties";
	
	// method to find and load the config.properties file
			public static void loadConfig() {

				try {

					FileInputStream Fis = new FileInputStream(propertyFilePath);
					prop = new Properties();
					try {
						prop.load(Fis);
						Fis.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				} catch (FileNotFoundException e) {
					e.printStackTrace();
					throw new RuntimeException("config.properties not found at " + propertyFilePath);
				}
			}
			// method to get the browser type(chrome,firefox,etc.,)
			public static String getBrowserType() {
				String browser = prop.getProperty("browser");
				if (browser != null) {
					return browser;
				} else {
					throw new RuntimeException("browser not specified in config.properties file");
				}
			}
			
			// method to get the login page url
						public static String getLoginPage() {
							String loginURL = prop.getProperty("loginpage");
							if (loginURL != null) {
								return loginURL;
							} else {
								throw new RuntimeException("loginpage not specified in the config.properties file.");
							}
						}
						// method to get the excel file path
						public static String getExcelFilePath() {
							String excelfilepath = prop.getProperty("excelfilepath");
							if (excelfilepath != null) {
								return excelfilepath;
							} else {
								throw new RuntimeException("excelfilepath not specified in the config.properties file.");
							}
						}
			
}
