package pageObjects;

import PageUIs.EmployeeListPageUI;
import commons.BaseElements;
import commons.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class EmployeeListPageObject extends BaseElements {
    WebDriver driver;
    public EmployeeListPageObject(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    public String isValueDisplayedAtColumnName(String columnName) {
        List<WebElement> ColumnByName = getListWebElements(driver, EmployeeListPageUI.DYNAMIC_COLUMN_HEADER_BY_NAME, columnName);
        int index = ColumnByName.size() + 1;
        System.out.println(index);
        return getWebElementText(driver, EmployeeListPageUI.DYNAMIC_CELL_BY_INDEX, String.valueOf(index));
        //div[@role='row']/div[@role='columnheader' and text()='Id']
        //div[@role='row']//div[@role='cell'][%s]
    }
}
