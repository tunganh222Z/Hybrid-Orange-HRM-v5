package pageObjects.admin.employmentStatus;

import org.openqa.selenium.WebDriver;
import pageObjects.admin.UserManagementPageObject;

public class EditEmploymentStatusPageObject extends EmploymentStatusPageObject {
    WebDriver driver;
    public EditEmploymentStatusPageObject (WebDriver driver){
        super(driver);
        this.driver = driver;
    }
}
