package pageObjects;

import PageUIs.MainMenuPageUI;
import commons.BaseElements;
import org.openqa.selenium.WebDriver;

public class MainMenuPageObject extends BaseElements {
    WebDriver driver;
    public MainMenuPageObject (WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    public void openModuleByText(String name){
        waitForElementClickable(driver, MainMenuPageUI.DYNAMIC_MODULE_BY_NAME,name);
        clickToElement(driver, MainMenuPageUI.DYNAMIC_MODULE_BY_NAME,name);
    }
}
