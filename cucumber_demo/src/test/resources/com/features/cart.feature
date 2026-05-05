Feature: Add to cart
Description: This feature file is used to add the product into the cart

Background:
  Given User is navigates to demoblaze

@phone
Scenario: Product of phone
  When User clicks Phones button
  And User click on "Samsung galaxy s6"
  And User have to click button "Add to cart"
  Then User should add the product successfully to cart

@laptops
Scenario: Product of laptops
  When User clicks Laptops button
  And User click on "Sony vaio i5"
  And User have to click button "Add to cart"
  Then User should add the product successfully to cart

@monitors
Scenario: Product of monitors
  When User clicks Monitors button
  And User click on "Apple monitor 24"
  And User have to click button "Add to cart"
  Then User should add the product successfully to cart