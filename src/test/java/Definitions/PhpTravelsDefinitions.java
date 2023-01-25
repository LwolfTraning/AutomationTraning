package Definitions;

import Tests.PhpTravelsTests;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

public class PhpTravelsDefinitions {

    PhpTravelsTests phpTravelsTests;

    @Given("^User is on the Php Travels main Page (.*)$")
    public void userIsOnThePhpTravelsMainPage(String url) {
        phpTravelsTests.openPhpTravels(url);
    }

    @When("^User full fills the registration form (.*)$")
    public void userFullFillsTheRegistrationForm(List<String> data) {
        phpTravelsTests.fullFillTheForm(data);
    }

    @And("^Users types the sum result$")
    public void usersTypesTheSumResult() {
        phpTravelsTests.typeTheSumResult();
    }

    @And("^User clicks on the submit button$")
    public void userClicksOnTheSubmitButton() {
        phpTravelsTests.clickOnSubmitButton();
    }

    @Then("^User should see the following message: (.*)$")
    public void userShouldSeeTheFollowingMessage(String textToVerify){
        phpTravelsTests.CheckSuccessMessage(textToVerify);
    }
}
