Feature: Buying a laptop

  Scenario Outline: As a user I want to purchase a laptop
    Given I launch the DemoBlaze website
    Then I should see "PRODUCT STORE" on the homepage
    When I click on Laptops category
    And I select a laptop of my choice
    Then I should see the laptop description
    When I click on Add to Cart button
    Then I should see a popup message "Product added"
    When I click on OK in the popup
    And I navigate to the cart
    Then I should see the laptop listed
    When I click on Place Order
    And I click Purchase without filling form
    Then I should see a popup message "Please fill out Name and Creditcard."
    When I click OK in the popup
    And I fill in my name <name>
    And i fill in my country <country>
    And I fill in my city <city>
    And I fill in my credit card number <creditCard>
    And I fill in my month <month>
    And I fill in my year <year>
    When I click on Purchase
    Then I should see the purchase confirmation message
    And I should see "Thank you for your purchase!" on the confirmation page
    When I click OK in the confirmation popup
    Then I should be redirected to the homepage

    Examples:
      | name         | country | city     | creditCard | month | year |
      | Sifiso Qwabe | RSA     | New York | 1234567890 | 03    | 2025 |
