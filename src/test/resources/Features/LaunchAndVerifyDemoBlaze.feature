Feature: Launch and Verify Product Store

  Scenario: Launch the website and verify the product store
    Given I launch "https://www.demoblaze.com/index.html"
    Then I verify that I am in the product store