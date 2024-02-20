package nopcommerce_V1.StepDefinitions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import com.nopcommerce_V1.PageObjects.LoginPage;
import com.nopcommerce_V1.Utilities.ConfigReader;
import com.nopcommerce_V1.Utilities.LoggerLoad;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSD {
	
	LoginPage login = new LoginPage();
	String excelfilepath = ConfigReader.getExcelFilePath();
	static String email;
	static String password;
	static String expectedMsg;
	Boolean isRequired;
	
	@Given("User launch the Login page")
	public void user_launch_the_login_page() {
		login.getLoginPage();
		LoggerLoad.info("User launch the Login page");
	   
	}

	@When("User enters valid email {string} and password {string}")
	public void user_enters_valid_email_and_password(String string, String string2) {
		LoggerLoad.info("User Enter email as \" " + email + " \" and Password as \" " + password + "\" ");
		isRequired = login.doLogin(email, password);
		assertTrue(isRequired);
		LoggerLoad.info("User enters valid email  and password");
	}

	@When("User check the remember me checkbox")
	public void user_check_the_remember_me_checkbox() {
	   login.rememberme(); 
	   LoggerLoad.info("User check the remember me checkbox");
	}

	@When("User clicks on login button")
	public void user_clicks_on_login_button() {
		login.loginbutton();
		 LoggerLoad.info("User clicks on login button");
	}

	@Then("User is able to navigate to admin page")
	public void user_is_able_to_navigate_to_admin_page() {
		String Title = login.verifyPageTitle();
		LoggerLoad.info("Title of current page is" + Title);
		assertEquals(Title, "NumpyNinja", "Title do not match");
	}

	@When("User enters  email {string} and password {string}")
	public void user_enters_email_and_password(String string, String string2) {
	 
	}

	@Then("User verify error {string} and should not allow user to navigate to admin page")
	public void user_verify_error_and_should_not_allow_user_to_navigate_to_admin_page(String string) {
	    

	}

}
