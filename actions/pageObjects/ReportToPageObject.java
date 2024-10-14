package pageObjects;

import commons.BasePage;
import org.openqa.selenium.WebDriver;

public class ReportToPageObject extends EmployeeNavigationSidebarPageObject {
    WebDriver driver;
    public ReportToPageObject(WebDriver driver){
        super(driver);
        this.driver = driver;
    }
}
