Feature: Categories of products
Description: This feature file verifies product categories in the application

Background:
  Given User opens the demoblaze application

@categories
Scenario: Phone category should display
  When User clicks on phones button
  Then User should be able to view the Phone category

@categories
Scenario: Laptop category should display
  When User clicks on Laptops button
  Then User should be able to view the Laptop category

@categories
Scenario: Monitor category should display
  When User clicks on Monitors button
  Then User should be able to view the Monitor category