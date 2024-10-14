package pageObjects;

import commons.BasePage;
import org.openqa.selenium.WebDriver;

public class JobPageObject extends EmployeeNavigationSidebarPageObject {
    WebDriver driver;
    public JobPageObject(WebDriver driver){
        super(driver);
        this.driver = driver;
    }
}
