package pageObjects;

import commons.BasePage;
import org.openqa.selenium.WebDriver;

public class ImmigrationPageObject extends EmployeeNavigationSidebarPageObject {
    WebDriver driver;
    public ImmigrationPageObject(WebDriver driver){
        super(driver);
        this.driver = driver;
    }
}
