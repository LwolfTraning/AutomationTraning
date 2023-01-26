package Definitions;

import Tests.PhpTravelsTests;
import Utilities.Utils;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

public class PhpTravelsDefinitions {

    PhpTravelsTests phpTravelsTests;
    Utils utils;

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

    @And("^User clicks on Sign Up bottom$")
    public void userClicksOnSignUpBottom() {
        phpTravelsTests.clickOnSignUp();
    }

    @And("^User moves to new tab (.*)$")
    public void userMovesToNewTab(Integer tabNumber)  {
        utils.swichToTab(tabNumber);
    }

    @When("^User full fills the personal information form$")
    public void userFullFillsThePersonalInformationForm(DataTable personalInformation) {
        List<List<String>> rows = personalInformation.asLists(String.class);
        phpTravelsTests.fullFillPersonalInformationForm(rows);
    }

    @When("^User full fills the Billing Address form$")
    public void userFullFillsTheBillingAddressForm() {
    }

    @When("^User full fills the Account Security form$")
    public void userFullFillsTheAccountSecurityForm() {
    }

    @And("^User clicks on captcha checkbox$")
    public void userClicksOnCaptchaCheckbox() {
    }

    @And("^User clicks on register bottom$")
    public void userClicksOnRegisterBottom() {
    }
}
