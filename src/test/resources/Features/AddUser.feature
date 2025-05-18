@AddUser
Feature: User Table

  Scenario Outline: Add user to the table
    Given The user table is displayed
    And The user click add user
    And The user validates that the add user form is displayed
    When The user enters the firstName <firstName>
    And The user enters the lastName <lastName>
    And The user enters the username <username>
    And The user enters the password <password>
    And The user selects the customer type <customerType>
    And The user selects the role <role>
    And The user enters the email <email>
    And The user enters the phone number <phoneNumber>
    And The user click on the save button
    Then The user validates that the user is added to the table

    Examples:
      | firstName | lastName | username  | password | customerType | role  | email           | phoneNumber |
      | Mvelo     | Zulu     | mvelozulu | 12345678 | customer AAA | Admin | mvelo@gmail.com | 1234567890  |