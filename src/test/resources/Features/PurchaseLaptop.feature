@PurchaseLaptop
Feature: Purchase Journey on DemoBlaze

  Scenario: Verify the purchase journey
    Given I launch the DemoBlaze website
    Then I verify that I am in the product store
    When I click on "Laptops" under categories
    And I select a laptop and add it to the cart
    Then I verify the popup message "Product added"
    And I navigate to the cart
    Then I verify the added laptop is available
    When I place an order without filling information
    Then I verify the error message is displayed
    When I complete the place order form with data from Excel
    And I click on purchase
    Then I verify the order was successfully purchased


