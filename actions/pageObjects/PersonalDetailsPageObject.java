package pageObjects;

import commons.BaseElements;
import commons.BasePage;
import org.openqa.selenium.WebDriver;

public class PersonalDetailsPageObject extends BaseElements {
    WebDriver driver;
    public PersonalDetailsPageObject(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    public int getFirstNameValue() {
    }

    public byte[] getLastNameValue() {
    }

    public byte[] getEmployeeValue() {
        return null;
    }
}
