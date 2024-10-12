package pageObjects;

import commons.BaseElements;
import org.openqa.selenium.WebDriver;

public class ContactDetailsPageObject extends BaseElements {
    WebDriver driver;
    public ContactDetailsPageObject(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
}
