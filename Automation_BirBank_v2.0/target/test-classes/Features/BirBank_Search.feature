@test1
Feature: BirBank_Search
  Scenario Outline: Search with "<input>"
    Given Open BB
    When Log In
    Then Press Search
    And Fill search field with "<input>"
    Examples:
      |input|
      |cashback|
      |shares  |
      |partners|