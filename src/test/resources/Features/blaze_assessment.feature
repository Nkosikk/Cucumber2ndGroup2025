@Assessment
Feature: Demo blaze purchase process

  Scenario Outline: As a user I want to purchase a laptop from demo blaze
    Given I am on the demo blaze product page
    And I select a product category
    When I select a product from the category
    And I validate the product details
    And I click on add to cart button
    Then I should see a popup confirming the product has been added to the cart
    And I click on cart button
    And verify that selected product is in the cart
    And I click on place order button
    And I verify Place Order form is displayed
    And I click on purchase button
    Then I should see error message popup and click on OK button
    And I fill in name <Name>
    And I fill in country <Country>
    And I fill in city <City>
    And I fill in credit card <CreditCard>
    And I fill in month <Month>
    And I fill in year <Year>
    And I click on purchase button again
    Then I should see the purchase confirmation message

    Examples:
      | Name          | Country      | City    | CreditCard       | Month | Year |
      | John Matimela | South Africa | Yoville | 1234567890123456 | May   | 2025 |


