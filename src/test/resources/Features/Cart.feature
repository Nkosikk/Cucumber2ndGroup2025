Feature: Demoblaze cart

  Scenario Outline: As a user I want to verify cart page and proceed to checkout.
    Given I am on the Demoblaze cart page
    When I verify that the products cart page is displayed
    And I verify the total price label is displayed
    And I verify the correct total amount is displayed
    And I click on the place order button
    And I verify that the place order pop up is displayed
    And I fill in the order details with name <name>, country <country>, city <city>, credit card <credit card>, month <month>, year <year>

    Examples:

      | name     | country      | city      | credit card  | month  | year |
      | Precious | South Africa | Cape Town | 139955440052 | August | 2025 |

