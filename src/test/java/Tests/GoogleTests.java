package Tests;

import Locators.GoogleLocators;
import Utilities.Utils;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;

public class GoogleTests extends PageObject {

    GoogleLocators googleLocators;
    Utils utils;

    public void openGooglePage(String url){
        utils.openMainPage(url);
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
