package pageObjects;

import commons.BaseElements;
import org.openqa.selenium.WebDriver;

public class EmergencyContactsPageObject extends EmployeeNavigationSidebarPageObject {
    WebDriver driver;
    public EmergencyContactsPageObject(WebDriver driver){
        super(driver);
        this.driver = driver;
    }
}
