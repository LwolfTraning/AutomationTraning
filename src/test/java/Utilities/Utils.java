package Utilities;

import net.serenitybdd.core.pages.PageObject;

public class Utils extends PageObject {

    public void openMainPage(String url){
        getDriver().get(url);
        System.out.println("URL OPENED: ".concat(url));
    }
}
