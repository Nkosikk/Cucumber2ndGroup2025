Feature: Product Store Purchasing a Laptop

  Scenario: Purchase a laptop from the product store
    Given I verify that I am in the product store
    When I click "Laptops" under categories
    And I select a laptop of my choice
    And I add the laptop to the cart
    Then I should see a popup message "Product added"
    And I click the "OK" button on the popup
    When I navigate to the cart
    Then I verify the added laptop is available in the cart
    When I place an order
    And I click "Purchase" without filling in the information
    Then I verify the error message is returned
    And I click the "OK" button on the error message
    ##fix
    When I complete the Place Order screen with data from the Excel file
    And I click "Purchase"
    Then I verify that the order was successfully purchased