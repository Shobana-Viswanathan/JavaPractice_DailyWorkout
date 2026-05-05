Feature: Login using DataTable

@ValidLogin
Scenario: Login with Valid Credentials

Given User should be on Home page of login
When User clicks login link of application
And User enters the Valid Credentials to login
  | Shobs | shobi11 |
And User clicks the Login button in the application to login
Then User should be able to see Welcome message