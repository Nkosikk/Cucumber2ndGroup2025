Feature: Add user detail page

  Scenario Outline: Add a new user to the table
    Given The user table is displayed
    And The user enters the firstName <firstName>
    And The user enters the lastName <lastName>
    And The user enters the userName <userName>
    And The user enters the password <password>
    And The user selects the customer <customer>
    And The user selects the role <role>
    And The user enters the email <email>
    And The user enters the cell phone <cellPhone>
    When The user clicks the save button
    Then The user validates that the user is added successfully

    Examples:
      | firstName | lastName | userName   | password | customer     | role       | email              | cellPhone  |
      | John      | Doe      | john.doe   | pass123  | Company AAA  | Admin      | john.doe@test.com  | 1234567890 |
