@LoginPage
Feature: Login Page verification

  Background:
   Given User launch the Login page
   
  
   @TC_LoginPage_01
       
    Scenario Outline: Verify User is not able to navigate to admin page with Invalid credentials
     When User enters  email "<email>" and password "<password>"
     And  User clicks on login button
     Then User verify error "<message>" and should not allow user to navigate to admin page
     
      Examples: 
      |email              |password|message|
      |admin              |admin   |Wrong email| 
      |                   |admin   |Please enter your email|
      |                   |        |Please enter your email|
      |admin@yourstore.com|adm     |Login was unsuccessful|
      |admin@yourstore.com|        |Login was unsuccessful|
      
     
   @TC_LoginPage_02
     
       Scenario Outline: User is able to navigate to admin page with valid credentials
     When User enters valid email "<email>" and password "<password>"
     And User check the remember me checkbox
     And  User clicks on login button
     Then User is able to navigate to admin page with pop up message
     And User Clicks the ok button in the pop up
     Then pop up message closed and admin page is displayed
     
      Examples: 
      |email               |password |
      |admin@yourstore.com |admin  |
     