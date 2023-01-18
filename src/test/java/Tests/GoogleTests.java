package Tests;

import Locators.GoogleLocators;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;

public class GoogleTests extends PageObject {

    GoogleLocators googleLocators;

    public void openGooglePage(){
        getDriver().get("https://www.google.com/");
    }

    public void searchForPetClothes(String textToSearch){
        googleLocators.googleSearchBox.type(textToSearch);
    }

    public void clickOnFirstResult(){
        googleLocators.searchBtn.click();
        googleLocators.firstResult.click();
    }

    public void checkResult(String textToVerify){
        Assert.assertEquals(textToVerify, googleLocators.labelToCheck.getText().trim());
    }

}
