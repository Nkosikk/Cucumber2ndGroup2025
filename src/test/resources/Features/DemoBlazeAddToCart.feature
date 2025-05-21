Feature: Browse and Add Laptop to Cart

  Scenario: Browse laptops and add one to the cart
    Given I click "Laptops" under categories
    When I click on any laptop of my choice
    And I add the laptop to the cart
    Then I verify the message on the popup "Product added"
    And I click the OK button