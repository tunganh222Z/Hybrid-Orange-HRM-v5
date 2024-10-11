package pageObjects;

import commons.BasePage;
import org.openqa.selenium.WebDriver;

public class QualificationsPageObject extends BasePage {
    WebDriver driver;
    public QualificationsPageObject(WebDriver driver){
        this.driver = driver;
    }
}
