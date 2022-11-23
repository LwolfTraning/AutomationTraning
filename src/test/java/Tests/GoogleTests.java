package Tests;

import Locators.GoogleLocators;
import net.serenitybdd.core.pages.PageObject;

public class GoogleTests extends PageObject {

    GoogleLocators googleLocators;

    public void openGooglePage(){
        getDriver().get("https://www.google.com/");
    }

    public void searchForPetClothes(){
        googleLocators.googleSearchBox.type("Pet Clothes");
    }

}
