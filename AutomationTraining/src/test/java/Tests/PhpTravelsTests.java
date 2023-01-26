package Tests;

import Locators.PhpTravelsLocators;
import Utilities.Utils;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;

import java.util.List;

public class PhpTravelsTests extends PageObject {

    Utils utils;
    PhpTravelsLocators phpTravelsLocators;

    public void openPhpTravels(String url){
        utils.openMainPage(url);
    }

    public void fullFillTheForm(List<String> data){
        phpTravelsLocators.firstName.type(data.get(0));
        phpTravelsLocators.lastName.type(data.get(1));
        phpTravelsLocators.businessName.type(data.get(2));
        phpTravelsLocators.email.type(data.get(3));
    }

    public void typeTheSumResult(){
        Integer result = Integer.parseInt(phpTravelsLocators.numb1.getText()) + Integer.parseInt(phpTravelsLocators.numb2.getText());
        phpTravelsLocators.result.type(String.valueOf(result));
    }

    public void clickOnSubmitButton(){
        phpTravelsLocators.submit.click();
    }

    public void CheckSuccessMessage(String textToVerify){
        phpTravelsLocators.userInfo(textToVerify).shouldBeCurrentlyVisible();
    }

    public void clickOnSignUp(){
        phpTravelsLocators.signUpBottom.click();
    }

    public void fullFillPersonalInformationForm(List<List<String>> personalInformationData){
        phpTravelsLocators.firstNamePersonalInformationForm.type(personalInformationData.get(0).get(1));

    }

}
