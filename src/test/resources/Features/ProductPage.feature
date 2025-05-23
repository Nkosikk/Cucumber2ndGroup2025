Feature: Demoblaze

  Scenario Outline: As a user I want to verify that I'm on the Demoblaze product page.
    Given I am on the Demoblaze product page
    When I verify that the product page is displayed
    And I verify that the categories are displayed
    And I click on laptops under categories <categories>
    And I click on the desired product <product type>
    Then I verify that the product details are displayed
    And I click on the add to cart button
#    Then I verify the product added pop up is displayed
 #   Then I click on cart to be redirected to the cart page

    Examples:
      | categories | product type |
      | Laptops    | MacBook air  |



