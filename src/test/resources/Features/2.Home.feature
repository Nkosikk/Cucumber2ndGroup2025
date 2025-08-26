@Regression
Feature: Home page

  @Home
  Scenario: As a user I want to verify the home page title
    Given I am logged in with valid credentials
    When User click add to cart button
    Then User verify the cart icon has item