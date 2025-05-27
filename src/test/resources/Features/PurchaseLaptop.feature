Feature: Laptop purchase on Demoblaze

  Scenario: Complete purchase journey
    Given I launch the Demoblaze application
    And I verify I am on the product store page
    When I click on "Laptops" category
    And I select any laptop
    And I add the laptop to the cart
    And I accept the product added alert
    And I go to the cart
    And I verify the laptop is listed in the cart
    And I click Place Order
    And I click Purchase without filling any information
    Then I should see an error message
    When I place the order with the following details:
      | name     | country | city | card     | month | year |
      | John Doe | SA      | CPT  | 12345678 | May   | 2025 |
    And I click Purchase
    Then I should see that the order was successfully purchased
