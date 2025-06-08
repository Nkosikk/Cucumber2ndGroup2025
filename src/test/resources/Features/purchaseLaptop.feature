Feature: Order iterm

  Scenario Outline: As a user, I want to be able to order an item online
    Given Verify that you are in the product store
    When Click category name under categories <category>
    And Click on any item of your choice <itemName>
    And Add the selected item to cart
    Then Verify the message on the popup <confirmationMessage>
    When click OK button
    And Click on Cart button
    Then Verify the added laptop is available <itemName>
    When Click button to place an order
    And Click Purchase without filling information
    Then Verify error message returned
    When Enter the name <name>
    And Enter the country <country>
    And Enter the city <city>
    And Enter credit card <creditCard>
    And Enter month <month>
    And Enter year <year>
    And Click purchase button
    Then Verify that the order was successfully purchased

    Examples:
      | name      | country        | city      | creditCard | month | year | itemName     | confirmationMessage | category |
      | Phil      | United Kingdom | Harrogate | 0123456789 | 12    | 25   | Sony vaio i5 | Product added       | Laptops  |
