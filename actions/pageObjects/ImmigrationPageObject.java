package pageObjects;

import commons.BasePage;
import org.openqa.selenium.WebDriver;

public class ImmigrationPageObject extends BasePage {
    WebDriver driver;
    public ImmigrationPageObject(WebDriver driver){
        this.driver = driver;
    }
}
