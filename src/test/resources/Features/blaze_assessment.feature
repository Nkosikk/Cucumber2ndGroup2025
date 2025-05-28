@Assessment
Feature: Demo blaze purchase process

  Scenario Outline: As a user I want to purchase a laptop from demo blaze
    Given I am on the demo blaze home page
    And I select a product category <category>
    When I select a product from the category
    And I validate the product details
    And I click on add to cart button
    And I verify the product is added to cart popup
    And click OK button on the popup
    And I click on cart button
    And verify that selected product is in the cart
    And I click on purchase button
    Then I should see error message to fill out the form
    And I click OK button on the error popup
    And I fill out the form with valid details
    And I click on purchase button again
    Then I should see the purchase confirmation message

    Examples:
      | category |
      | Laptops  |

