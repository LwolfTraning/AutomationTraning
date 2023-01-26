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


  @PhpTravelsRegistrationProcess
  Scenario: As an user I want to register in Php Travels page
    Given User is on the Php Travels main Page https://phptravels.com/demo/
    And User clicks on Sign Up bottom
    And User moves to new tab 1
    When User full fills the personal information form
      | firstName   | Alejandro      |
      | lastName    | Vasquez        |
      | email       | 1234@gamil.com |
      | phoneNumber | 3004355561     |
    When User full fills the Billing Address form
      | companyName    | Lone Wolf          |
      | streetAddress  | Calle test 123     |
      | streetAddress2 | carrera prueba 456 |
      | city           | Medellin           |
      | state          | Antioquia          |
      | postcode       | 123456             |
      | country        | Colombia           |
    When User full fills the Account Security form
      | mobile | L3004355561 |
    When User full fills the Billing Address form
      | password         | Colombia1234+ |
      | confirm password | Colombia1234+ |
    And User clicks on captcha checkbox
    And User clicks on register bottom
    Then User should see the following message: Alejandro Vasquez
