Feature: Sauce Demo

  Scenario Outline: As a user i want to login to sauce demo
    Given Iam on the login page
    And i enter username <username>
    And I enter password <password>
    When i click login button
    Then I should be on the home page

    Examples:
      | username                | password     |
      | standard_user           | secret_sauce |
      | performance_glitch_user | secret_sauce |
      | visual_user             | secret_sauce |
