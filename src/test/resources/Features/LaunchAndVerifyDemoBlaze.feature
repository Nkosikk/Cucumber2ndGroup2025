Feature: Launch and Verify Product Store

  Scenario: Launch the website and verify the product store
    Given I launch website
    And I click on the "Product Store" link
    Then I verify that I am in the product store
