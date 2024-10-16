package PageUIs.admin;

import org.openqa.selenium.WebDriver;
import pageObjects.MainMenuPageObject;

public class UserManagementPageUI extends MainMenuPageObject {
    WebDriver driver;
    public UserManagementPageUI (WebDriver driver){
        super(driver);
        this.driver = driver;
    }
}
