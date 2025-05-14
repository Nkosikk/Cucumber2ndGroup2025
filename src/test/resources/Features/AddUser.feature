@AddUser
Feature: User Table

  Scenario Outline: Add user to the table
    Given The user table is displayed
    And The user click add user
    And The user validates that the add user form is displayed
    When The user enters the firstName <firstName>


    Examples:
        | firstName |
        | John      |