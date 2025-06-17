@PurchaseOnline
Feature: Purchase Online

  Scenario Outline: Purchase a Laptop
#    Given I am on the DemoBlaze homepage
 #   Given I verify I am in the product store
    And I click on laptop under categories"
    And I click any laptop name "<LaptopName>"
    And I add the laptop to cart
    Then I verify popup message "<Popup message>"
    And I click OK button on popup
    When I click the cart
    Then I verify that <LaptopName> in cart
#    And I click on place order
#    And I click purchase without filling details
#    Then I verify the error message displayed
#    And I enter the name "<Name>"
#    And I enter the country "<Country>"
#    And I enter the city "<City>"
#    And I enter the credit card "<Card>"
#    And I enter the month "<Month>"
#    And I enter the year "<Year>"
#    And I click Purchase
#    Then I verify that the order was successfully placed

    Examples:
      | LaptopName   | Name | Country | City      | Card         | Month    | Year | Popup message |
      | Sony vaio i5 | John | SA      | Cape Town | 123478987651 | November | 2025 | Product added |
