package Definitions;

import Tests.GoogleTests;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleDefinitions {

    GoogleTests googleTests;

    @Given("^User is in the Google main page (.*)$")
    public void userIsInTheGoogleMainPage(String url)  {
        googleTests.openGooglePage(url);
    }

    @When("^User searches for (.*)$")
    public void userSearchesForPetClothes(String textToSearch) {
        googleTests.searchForPetClothes(textToSearch);
    }

    @When("^User opens the first result$")
    public void userOpensTheFirstResult() {
        googleTests.clickOnFirstResult();
    }

    @Then("^User should be able to see (.*)$")
    public void userShouldBeAbleToSeeTheResults(String textToCheck) {
        googleTests.checkResult(textToCheck);
    }
}
