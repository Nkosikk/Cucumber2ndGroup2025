Feature: Demoblaze

  Scenario Outline: As a user I want to verify that I'm on the Demoblaze product page.
    Given I am on the Demoblaze product page
 #   When I verify that the product page is displayed
    And I verify that the categories are displayed
    And I click on laptops under categories <categories>
    And I click on the desired product <product type>
    Then I verify that the product details are displayed
    And I click on the add to cart button
    Then I verify the product added pop up is displayed
    Then I click on cart to be redirected to the cart page
    When I verify that the products cart page is displayed
 #   And I verify the total price label is displayed
#    And I verify the correct total amount is displayed
#    And I click on the place order button
#    And I verify that the place order pop up is displayed
#    And I fill in the order details with name "<name>", country "<country>", city "<city>", credit card "<credit card>", month "<month>", year "<year>"

    Examples:

      | categories | product type |  | name     | country      | city      | credit card  | month  | year |
      | Laptops    | MacBook air  |  | Precious | South Africa | Cape Town | 139955440052 | August | 2025 |






