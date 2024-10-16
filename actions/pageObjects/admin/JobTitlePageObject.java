package pageObjects.admin;

import org.openqa.selenium.WebDriver;
import pageObjects.MainMenuPageObject;

public class JobTitlePageObject extends MainMenuPageObject {
    WebDriver driver;
    public JobTitlePageObject(WebDriver driver){
        super(driver);
        this.driver = driver;
    }


}
