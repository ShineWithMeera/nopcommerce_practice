@LoginPage
      Feature: Login Page verification
  Background:
   Given User launch the Login page
  
   @TC_LoginPage_01
     Scenario Outline: User is able to navigate to admin page with valid credentials
     When User enters valid email "<email>" and password "<password>"
     And User check the remember me checkbox
     And  User clicks on login button
     Then User is able to navigate to admin page
      Examples:
      |email               |password |
      |admin@yourstore.com |admin  |
   

  