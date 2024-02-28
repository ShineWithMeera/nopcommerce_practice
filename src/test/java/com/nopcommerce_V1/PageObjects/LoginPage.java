package com.nopcommerce_V1.PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nopcommerce_V1.DriverFactory.DriverFactory;
import com.nopcommerce_V1.Utilities.ConfigReader;

public class LoginPage extends BasePage {
	
	//public static WebDriver driver = DriverFactory.getdriver();
	//String loginpage = ConfigReader.getLoginPage();
	Boolean isRequired;
	
// initializes all the annotated elements (such as @FindBy) in the current class (this) using the given WebDriver instance (driver).	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="//*[@id='Email']")static WebElement Email;
	@FindBy (xpath="//*[@id='Password']")static WebElement Password;
	@FindBy (xpath="//button[@type='submit']")WebElement loginButton;
	@FindBy (xpath="//input[@type='checkbox']")WebElement RememberMe;
	
	public void getLoginPage() {
		driver.get(loginpage);
	}
	
	// Verify the title of the page
				public String verifyPageTitle() {
					String pageTitle = driver.getTitle();
					return pageTitle;

				}
				
				//validate the username and password for empty fields
			
				public Boolean doLogin(String email, String password) {

					Email.clear();
					Email.sendKeys(email);
					Password.clear();
					Password.sendKeys(password);

					
					// To check empty fields , we need to check "required" field is on an attribute
					if (email.isBlank()) {
						JavascriptExecutor js_email = (JavascriptExecutor) driver;
						isRequired = (Boolean) js_email.executeScript("return arguments[0].required;", Email);
						return isRequired;
					} else if (password.isBlank()) {
						JavascriptExecutor js_password = (JavascriptExecutor) driver;
						isRequired = (Boolean) js_password.executeScript("return arguments[0].required;", Password);
						return isRequired;

					}
					return isRequired;
				}
				
	public void rememberme() {
		RememberMe.click();
		
	}
	public void loginbutton() {
		loginButton.click();
		
	}
	
	
	
}
