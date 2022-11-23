package Definitions;

import Tests.GoogleTests;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleDefinitions {

    GoogleTests googleTests;

    @Given("^User is in the Google main page$")
    public void userIsInTheGoogleMainPage()  {
        googleTests.openGooglePage();
    }

    @When("^User searches for pet clothes$")
    public void userSearchesForPetClothes() {
        googleTests.searchForPetClothes();
    }

    @When("^User opens the first result$")
    public void userOpensTheFirstResult() {
    }

    @Then("^User should be able to see the results$")
    public void userShouldBeAbleToSeeTheResults() {
    }

}
