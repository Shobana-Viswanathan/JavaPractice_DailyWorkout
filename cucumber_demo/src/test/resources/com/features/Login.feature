Feature: Login into Demoblaze application

Background:
  Given User is on Home page
  When User have to click login link

@ValidCredentials
Scenario: Login with valid credentials
  When User enters valid username as "Shobs"
  And User enters valid password as "shobi11"
  And User clicks login button
  Then User should be able to login successfully and have to verify the name of user

@InvalidCredentials
Scenario: Login with invalid username
  When User enters invalid username as "Shobi"
  And User enters password as "shobi11"
  And User clicks login button
  Then User should not be able to login successfully and have the alert message as wrong username

@InvalidCredentials
Scenario: Login with invalid password
  When User enters username as "Shobs"
  And User enters invalid password as "shobi1"
  And User clicks login button
  Then User should not be able to login into application successfully and have the alert message as wrong password