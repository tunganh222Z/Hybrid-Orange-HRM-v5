package pageObjects;

import commons.BasePage;
import org.openqa.selenium.WebDriver;

public class JobPageObject extends BasePage {
    WebDriver driver;
    public JobPageObject(WebDriver driver){
        this.driver = driver;
    }
}
