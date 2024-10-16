package pageObjects.dashboard;

import org.openqa.selenium.WebDriver;
import pageObjects.MainMenuPageObject;

public class DashboardPageObject extends MainMenuPageObject {
    WebDriver driver;
    public DashboardPageObject(WebDriver driver){
        super(driver);
        this.driver = driver;
    }



}
