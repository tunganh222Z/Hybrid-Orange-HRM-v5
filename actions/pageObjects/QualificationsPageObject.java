package pageObjects;

import commons.BasePage;
import org.openqa.selenium.WebDriver;

public class QualificationsPageObject extends EmployeeNavigationSidebarPageObject {
    WebDriver driver;
    public QualificationsPageObject(WebDriver driver){
        super(driver);
        this.driver = driver;
    }
}
