package Locators;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class GoogleLocators extends PageObject {

    @FindBy(xpath = "//input[@title='Buscar']")
    public WebElementFacade googleSearchBox;

    @FindBy(xpath = "(//input[@name='btnK'])[1]")
    public WebElementFacade searchBtn;

    @FindBy(xpath = "//h3[text()='Amazon.com: Dog Apparel & Accessories']")
    public WebElementFacade firstResult;

    @FindBy(xpath = "//div[@class='rhf-sign-in-title']")
    public WebElementFacade labelToCheck;
}
