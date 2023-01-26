package Locators;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

public class PhpTravelsLocators extends PageObject {

    @FindBy(xpath = "//input[@name= 'first_name']")
    public WebElementFacade firstName;

    @FindBy(xpath = "//input[@name= 'last_name']")
    public WebElementFacade lastName;

    @FindBy(xpath = "//input[@name='business_name']")
    public WebElementFacade businessName;

    @FindBy(xpath = "//input[@name='email']")
    public WebElementFacade email;

    @FindBy(xpath = "//span[@id='numb1']")
    public WebElementFacade numb1;

    @FindBy(xpath = "//span[@id='numb2']")
    public WebElementFacade numb2;

    @FindBy(xpath = "//input[@id='number']")
    public WebElementFacade result;

    @FindBy(xpath = "//button[@id='demo']")
    public WebElementFacade submit;

    @FindBy(xpath = "//div[@class='completed']//child::strong")
    public WebElementFacade successMessage;

    public WebElementFacade userInfo(String userName){
        return getDriver().findElement(By.xpath("//*[text()='"+userName+"']"));
    }

    @FindBy(xpath = "//ul[@id='loginSignup']//a[@data-name='signup']")
    public WebElementFacade signUpBottom;

    @FindBy(xpath = "//input[@name='firstname']")
    public WebElementFacade firstNamePersonalInformationForm;
}

//input[@name='firstname']