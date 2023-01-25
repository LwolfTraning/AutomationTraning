@featureTag
Feature: Google Search.

  @scenarioTag
  Scenario: Search for pet clothes.
    Given User is in the Google main page https://www.google.com/
    When User searches for pet clothes
    And User opens the first result
    Then User should be able to see Ver recomendaciones personalizadas

