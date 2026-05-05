Feature: Place Order
  Description: Verify user can add product to cart and place order successfully in DemoBlaze application

  Background:
    Given User launch the demoblaze application

  Scenario: User places order successfully

    When User clicks phones button
    And User selects product "Samsung galaxy s6"
    And User clicks Add to cart button
    Then Product should be added to cart

    When User clicks Cart button
    And User clicks Place Order button

    And User enters name "Shobs"
    And User enters country "India"
    And User enters city "Salem"
    And User enters credit card "1234567890"
    And User enters month "May"
    And User enters year "2026"

    And User clicks Purchase button
    Then Order should be placed successfully