@PhpTravels
Feature: Google Search.

  @PhpTravelsScenario
  Scenario Outline: Full fill the form.
    Given User is on the Php Travels main Page https://phptravels.com/demo/
    When User full fills the registration form <firstName>, <lastName>, <businessName>, <email>
    And Users types the sum result
    And User clicks on the submit button
    Then User should see the following message: Thank you!
    Examples:
      | firstName | lastName | businessName   | email            |
      | Alejandro | Londono  | CultureApparel | slondo@gmail.com |
      | Juan      | Gomez    | CultureApparel | slondo@gmail.com |
      | Monica    | Nose     | CultureApparel | slondo@gmail.com |
      | DONtEO    | Nose2    | CultureApparel | slondo@gmail.com |
      | Jaime     | Nose3    | CultureApparel | slondo@gmail.com |


