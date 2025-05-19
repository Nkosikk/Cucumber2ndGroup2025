@AddUser
Feature: User Table

  Scenario Outline: Add user to the table
    Given The user table is displayed
    And The user click add user
    And The user validates that the add user form is displayed
    When The user enters the firstName <firstName>
    And The user enters the lastName <lastName>
    And The user enters the userName <userName>
    And the user enters the password <password>
    And The user selects the customer <customer>
    And The user clicks dropdown button to select a role
    And The user selects the role <role>
    And The user enters the email <email>
    And The user enters the cellPhone <cellPhone>
    And The user clicks the save button
    Then The user validates that the user is added to the table



    Examples:
      | firstName | lastName | userName                 | password | customer    | role       | email                    | cellPhone |
      | John      | TestMan  | johntestman777@gmail.com | abc123   | company AAA | Sales Team | johntestman777@gmail.com | 206703033 |