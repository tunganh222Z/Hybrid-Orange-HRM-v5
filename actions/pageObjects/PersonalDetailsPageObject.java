package pageObjects;

import commons.BasePage;
import org.openqa.selenium.WebDriver;

public class PersonalDetailsPageObject extends BasePage {
    WebDriver driver;
    public PersonalDetailsPageObject(WebDriver driver){
        this.driver = driver;
    }
}
