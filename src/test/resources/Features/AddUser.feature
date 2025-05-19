@AddUser
Feature: User Table

  Scenario Outline: Add user to the table
    Given The user table is displayed
    And The user click add user
    And The user validates that the add user form is displayed
    When The user enters the firstName <firstName>
    And The user enters the lastName <lastName>
    And The user enter the userName which comes from <firstName> and <lastName>
#    And The user enters the password <password>
#    And The user select the customerType <customerType>
#    And The user select the role <role>
#



    Examples:
        | firstName | lastName |
        | John      | Cele     |