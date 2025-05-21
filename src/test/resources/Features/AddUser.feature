@AddUser
Feature: User Table

  Scenario: Add user to the table
    Given The user table is displayed
    And The user click add user
    And The user validates that the add user form is displayed
<<<<<<< HEAD
=======
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
>>>>>>> e945785aacf87fcd64888c8f0f63130116b80f56
