Feature: Login with invalid using header
Description:This feature file is used to login with invalid credentials with data table using header
@Multiple_InvalidCredentials
Scenario:
Login with invalid credentials data table with header and multiple
Given User should be on Home page of login
	Then user enter invalid input and assert 
	|username|password|errormessage				              |
	|shob	 |123	  |Wrong password.    					  |
	|sho@	 |123	  |User does not exist. 				  |


