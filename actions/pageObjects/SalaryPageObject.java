package pageObjects;

import commons.BasePage;
import org.openqa.selenium.WebDriver;

public class SalaryPageObject extends BasePage {
    WebDriver driver;
    public SalaryPageObject(WebDriver driver){
        this.driver = driver;
    }
}
