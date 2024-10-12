package pageObjects;

import commons.BasePage;
import org.openqa.selenium.WebDriver;

public class EmployeeListPageObject extends BasePage {
    WebDriver driver;
    public EmployeeListPageObject(WebDriver driver){
        this.driver = driver;
    }

    public AddEmployeePageObject clickToAddEmployeeButton() {
    }

    public boolean isValueDisplayedAtColumnName(String id, String employeeID) {
        return false;
    }
}
