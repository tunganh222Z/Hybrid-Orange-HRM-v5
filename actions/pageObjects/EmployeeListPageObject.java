package pageObjects;

import commons.BaseElements;
import commons.BasePage;
import org.openqa.selenium.WebDriver;

public class EmployeeListPageObject extends BaseElements {
    WebDriver driver;
    public EmployeeListPageObject(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    public boolean isValueDisplayedAtColumnName(String columnName, String value) {
        return false;
    }
}
