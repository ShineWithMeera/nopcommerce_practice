package com.nopcommerce_V1.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nopcommerce_V1.DriverFactory.DriverFactory;
import com.nopcommerce_V1.Utilities.ConfigReader;

public class LoginPage {
	
	public static WebDriver driver = DriverFactory.getdriver();
	String loginpage = ConfigReader.getLoginPage();
	Boolean isRequired;
	
// initializes all the annotated elements (such as @FindBy) in the current class (this) using the given WebDriver instance (driver).	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="//*[@id='Email']")static WebElement Email;
	@FindBy (xpath="//*[@id='Password']")static WebElement Password;
	@FindBy (xpath="//button[@type='submit']")WebElement loginButton;
	@FindBy (xpath="//input[@type='checkbox']")WebElement RememberMe;
	
	
}
