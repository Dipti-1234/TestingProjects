Feature: Login Functionality


Background: Successfully cancelled Initial Login window
When User launch "chrome" browser with exe as 
When User open URL as 
When User cancel initial Login window   
 
 @SmokeTest
 Scenario: Login functionality with valid credentials
   When User navigate on Login button
   When User click on MyProfile
   When User enter "dbdipty@gmail.com" as username
   When User enter "Dipti*123" as password
   When User click on Login button
   Then Application shows user profile to user
   Then browser close
  
 @RegressionTest
 Scenario Outline: Login functionality with invalid username in UC and valid password
   When User navigate on Login button
   When User click on MyProfile
   When User enters <uname> as username
   When User enters <password> as password
   When User click on Login button
   Then Application shows appropriate error message to user
   Then browser close
   
   Examples:
   
   |uname|password|
   |ABCDE|Dipti*123|
   |dbdipty@gmail.com|ABCDS|
 
 