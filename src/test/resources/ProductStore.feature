Feature: Complete Product Purchase Flow on DemoBlaze

  Scenario: Complete Laptop Purchase Flow with Excel Data Input

    Given I should see the product store home page displayed
    When I click on "Laptops" under categories
    And I select any laptop from the list

    And I add the selected laptop to the cart
    Then I should see a popup message "Product added"
    When I navigate to the cart

    Then I should see the laptop is displayed in the cart
    When I click on Place Order

    Then I should see the place order form displayed
    And I click on Purchase without entering any data
    Then I should see an error alert displayed with the message "Please fill out Name and Credit card."

    When I complete the place order form with data from Excel
    And I click on Purchase
    Then I should see a confirmation that the order was successfully placed
