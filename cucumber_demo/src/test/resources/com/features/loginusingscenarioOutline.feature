Feature: Example of Scenario Outline
Description: This feature is used to login using scenario outline

@InvalidCredentials
Scenario Outline: Login with Invalid Credentials

Given User should be on Home page
When User clicks login link
And User enters username as "<username>" and password as "<password>"
And User clicks the Login button in the application
Then User should be able to see an "<errMsg>"

Examples:
| username | password | errMsg |
| Admin123 | admin1   | Wrong password. |
|          |          | Please fill out Username and Password. |
| Adm@i  | admin123 | User does not exist. |