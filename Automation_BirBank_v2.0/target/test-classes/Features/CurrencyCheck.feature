@test3
Feature: CurrencyCheck
  Scenario: Check currencies section
    Given Open BB
    When Log In
    Then Press Other Options
    And Go to currency converter
    Then Press Show all
    And Press Hide all
    Then Press on currency on right
    And Press selected currency