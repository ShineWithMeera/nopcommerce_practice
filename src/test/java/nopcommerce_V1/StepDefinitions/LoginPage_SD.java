package nopcommerce_V1.StepDefinitions;



import com.nopcommerce_V1.PageObjects.LoginPage;
import com.nopcommerce_V1.Utilities.LoggerLoad;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage_SD{

	   //LoginPage login = new LoginPage(null);
	LoginPage login = new LoginPage();
	
	@Given("User launch the Login page")
	public void user_launch_the_login_page() {
	   
		
		login.getLoginPage();
		LoggerLoad.info("Loginpage has opened");

	}

	@When("User enters  email {string} and password {string}")
	public void user_enters_email_and_password(String email_id, String pwd) {
	   login.login_entry(email_id, pwd);;
         
	}

	@When("User clicks on login button")
	public void user_clicks_on_login_button() {
	   login.login_submit();

	}

	@Then("User verify error {string} and should not allow user to navigate to admin page")
	public void user_verify_error_and_should_not_allow_user_to_navigate_to_admin_page(String string) {
	    login.login_click();

	}

	@When("User enters valid email {string} and password {string}")
	public void user_enters_valid_email_and_password(String email_id, String pwd) {
	    login.login_entry(email_id, pwd);
      
	}

	@When("User check the remember me checkbox")
	public void user_check_the_remember_me_checkbox() {
	   login.remember_check();

	}

	@Then("User is able to navigate to admin page with pop up message")
	public void user_is_able_to_navigate_to_admin_page_with_pop_up_message() {
        	   

	}

	@Then("User Clicks the ok button in the pop up")
	public void user_clicks_the_ok_button_in_the_pop_up() {
	    

	}

	@Then("pop up message closed and admin page is displayed")
	public void pop_up_message_closed_and_admin_page_is_displayed() {
	   

	}



}
