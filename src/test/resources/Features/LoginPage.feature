Feature: Login

Scenario: Successfull Login with Valid credentials

Given User launch chrome browser
When User opens URL "https://admin-demo.nopcommerce.com/login"
And User enters Email as "admin@yourstore.com" and Password as "admin"
And User checks the check box of the remeber password
And Click on Login
Then page title should be "Dashboard / nopCommerce administration"

Scenario: Verify 

Scenario Outline: Login with invalid credentials 

Given User launch chrome browser
When User opens URL "https://admin-demo.nopcommerce.com/login"
And User enters Email as "<email>" and Password as "<password>"
And User checks the check box of the remeber password
And Click on Login
Then User should see "<message>" 


Examples:
	| email | password | message |
	| invalid | invalid |Login was unsuccessful. Please correct the errors and try again.No customer account found|
  | empty  |invalid/valid |Please enter your email|
  |empty|empty|Please enter your email|
  |without@|valid|wrong email|
  

   