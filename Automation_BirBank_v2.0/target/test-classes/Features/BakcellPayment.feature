@test2
Feature: BakcellPayment
  Scenario Outline: Pay bakcell using "<typeOfPayment>"
    Given Open BB
    When Log In
    Then Press Payments
    And Go to mobile operators
    Then Insert phone number
    And Check provider button
    Then Choose different provider
    And Click payment option
    Then Choose Payment Option according to "<typeOfPayment>"
    And Enter sum of payment
    Then Cancel payment
    And Press Home


    Examples:
    |typeOfPayment|
    |Cards        |
    |Accounts     |
    |Bonuses      |