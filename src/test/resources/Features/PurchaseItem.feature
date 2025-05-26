@PurchaseItem
Feature: Purchase Item

  Scenario Outline: Purchase a laptop
    Given I am in the product store
    When I select a laptop from the product list
    And  I select a laptop of my choice the laptop list
    And I add the laptop to the cart
    #And The user validates that the add user form is displayed
   # When The user enters the firstName <firstName>
   # And The user enters the lastName <lastName>
    #And The user enter the userName which comes from <firstName> and <lastName>
#    And The user enters the password <password>
#    And The user select the customerType <customerType>
#    And The user select the role <role>
#



    Examples:
        | firstName | lastName |
        | John      | Cele     |