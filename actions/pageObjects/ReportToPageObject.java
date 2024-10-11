package pageObjects;

import commons.BasePage;
import org.openqa.selenium.WebDriver;

public class ReportToPageObject extends BasePage {
    WebDriver driver;
    public ReportToPageObject(WebDriver driver){
        this.driver = driver;
    }
}
