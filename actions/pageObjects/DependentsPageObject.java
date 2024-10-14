package pageObjects;

import commons.BasePage;
import org.openqa.selenium.WebDriver;

public class DependentsPageObject extends EmployeeNavigationSidebarPageObject {
    WebDriver driver;
    public DependentsPageObject(WebDriver driver){
        super(driver);
        this.driver = driver;
    }
}
