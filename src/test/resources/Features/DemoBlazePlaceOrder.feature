Feature: Place an Order

  Scenario: Attempt to place an order without filling information
    Given I click Purchase without filling information
    Then I verify the error message returned

  Scenario: Complete the place order screen and purchase
    Given I complete the Place Order screen with data from excel
    When I click Purchase
    Then I verify that the order was successfully purchased