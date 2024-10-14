package pageObjects;

import commons.BaseElements;
import commons.BasePage;
import org.openqa.selenium.WebDriver;

public class DashboardPageObject extends MainMenuPageObject {
    WebDriver driver;
    public DashboardPageObject(WebDriver driver){
        super(driver);
        this.driver = driver;
    }



}
