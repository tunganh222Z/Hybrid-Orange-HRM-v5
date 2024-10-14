package pageObjects;

import PageUIs.BaseElementsPageUI;
import PageUIs.EmployeeNavigationSidebarPageUI;
import commons.BaseElements;
import commons.BasePage;
import org.openqa.selenium.WebDriver;

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
