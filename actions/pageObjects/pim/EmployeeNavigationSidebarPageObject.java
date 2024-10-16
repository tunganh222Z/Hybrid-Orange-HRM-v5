package pageObjects.pim;

import PageUIs.pim.EmployeeNavigationSidebarPageUI;
import org.openqa.selenium.WebDriver;
import pageObjects.MainMenuPageObject;

public class EmployeeNavigationSidebarPageObject extends MainMenuPageObject {
    WebDriver driver;
    public EmployeeNavigationSidebarPageObject(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    public void clickToEmployeeNavigationByLabel(String label) {
        waitForElementVisible(driver, EmployeeNavigationSidebarPageUI.DYNAMIC_EMPLOYEE_NAVIGATION_BY_LABEL, label);
        clickToElement(driver, EmployeeNavigationSidebarPageUI.DYNAMIC_EMPLOYEE_NAVIGATION_BY_LABEL, label);
    }
}
