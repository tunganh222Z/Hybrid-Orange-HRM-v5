package pageObjects;

import commons.BasePage;
import org.openqa.selenium.WebDriver;

public class SalaryPageObject extends EmployeeNavigationSidebarPageObject {
    WebDriver driver;
    public SalaryPageObject(WebDriver driver){
        super(driver);
        this.driver = driver;
    }
}
