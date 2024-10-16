package pageObjects.admin;

import org.openqa.selenium.WebDriver;
import pageObjects.MainMenuPageObject;

public class UserManagementPageObject extends MainMenuPageObject {
    WebDriver driver;
    public UserManagementPageObject (WebDriver driver){
        super(driver);
        this.driver = driver;
    }
}
