package pageObjects.admin.employmentStatus;

import org.openqa.selenium.WebDriver;
import pageObjects.MainMenuPageObject;

public class EmploymentStatusPageObject extends MainMenuPageObject {
    WebDriver driver;
    public EmploymentStatusPageObject (WebDriver driver){
        super(driver);
        this.driver = driver;
    }
}
