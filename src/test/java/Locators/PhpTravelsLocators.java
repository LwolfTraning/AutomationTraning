package Locators;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
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
}