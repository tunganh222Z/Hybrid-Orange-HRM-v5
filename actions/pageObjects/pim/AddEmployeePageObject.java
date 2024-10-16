package pageObjects.pim;

import commons.BaseElements;
import org.openqa.selenium.WebDriver;

public class AddEmployeePageObject extends BaseElements {
    WebDriver driver;

    public AddEmployeePageObject(WebDriver driver){
        super(driver);
        this.driver = driver;
    }


}
