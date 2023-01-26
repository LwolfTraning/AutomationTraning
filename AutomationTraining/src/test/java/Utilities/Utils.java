package Utilities;

import net.serenitybdd.core.pages.PageObject;

import java.util.ArrayList;

public class Utils extends PageObject {

    public void openMainPage(String url){
        getDriver().get(url);
        System.out.println("URL OPENED: ".concat(url));
    }

    public void swichToTab(Integer tabNumber){
        ArrayList<String> newTb = new ArrayList<String>(getDriver().getWindowHandles());
        getDriver().switchTo().window(newTb.get(tabNumber));
    }
}
