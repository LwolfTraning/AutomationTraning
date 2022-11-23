package Locators;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class GoogleLocators extends PageObject {
    @FindBy(xpath = "//input[@title='Buscar']")
    public WebElementFacade googleSearchBox;
}
