package pageObjects;

import commons.BasePage;
import org.openqa.selenium.WebDriver;

public class DependentsPageObject extends BasePage {
    WebDriver driver;
    public DependentsPageObject(WebDriver driver){
        this.driver = driver;
    }
}
