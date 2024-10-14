package pageObjects;

import PageUIs.EmployeeListPageUI;
import commons.BaseElements;
import commons.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class EmployeeListPageObject extends MainMenuPageObject {
    WebDriver driver;
    public EmployeeListPageObject(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    public String isValueDisplayedAtColumnName(String columnName) {
        List<WebElement> ColumnByName = getListWebElements(driver, EmployeeListPageUI.DYNAMIC_COLUMN_HEADER_BY_NAME, columnName);
        int index = ColumnByName.size() + 1;
        return getWebElementText(driver, EmployeeListPageUI.DYNAMIC_CELL_BY_INDEX, String.valueOf(index));
        //div[@role='row']/div[@role='columnheader' and text()='Id']
        //div[@role='row']//div[@role='cell'][%s]
    }

    public PersonalDetailsPageObject clickToEditButtonByEmployeeId(String employeeId) {
        waitForElementVisible(driver, EmployeeListPageUI.EDIT_BUTTON_BY_EMPLOYEE_ID, employeeId);
        clickToElement(driver, EmployeeListPageUI.EDIT_BUTTON_BY_EMPLOYEE_ID, employeeId);
        waitSpinnerIconInvisible();
        return new PersonalDetailsPageObject(driver);
    }
}
