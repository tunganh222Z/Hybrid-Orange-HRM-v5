package pageObjects.admin.employmentStatus;

import org.openqa.selenium.WebDriver;

public class AddEmploymentStatusPageObject extends EmploymentStatusPageObject{
    WebDriver driver;
    public AddEmploymentStatusPageObject (WebDriver driver){
        super(driver);
        this.driver = driver;
    }
}
