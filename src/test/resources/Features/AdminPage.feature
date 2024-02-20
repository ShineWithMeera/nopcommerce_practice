@AdminPage
     Feature: Admin Dashboard Page verification
   @TC_AdminPage_01
     Scenario Outline: User is able to navigate to admin page with change password pop up
     Given User is on the login page
     When User enters valid email "<email>" and password "<password>"
     And  User check the remember me checkbox
     And  User clicks the login button
     Then User  navigates to admin page with displaying a change password pop up
     And  User clicks ok button on the pop up
     Then change password pop up closed
     Examples:
      |email               |password |
      |admin@yourstore.com |admin  |

  

   