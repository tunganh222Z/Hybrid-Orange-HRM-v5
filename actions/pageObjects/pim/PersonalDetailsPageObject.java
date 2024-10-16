package pageObjects.pim;

import PageUIs.pim.PersonalDetailsPageUI;
import org.openqa.selenium.WebDriver;

public class PersonalDetailsPageObject extends EmployeeNavigationSidebarPageObject {
    WebDriver driver;
    public PersonalDetailsPageObject(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    public void enterToLicenseNumberTextbox(String keytToSend) {
        waitForElementVisible(driver, PersonalDetailsPageUI.LICENSE_TEXTBOX);
        sendkeyToElement(driver, PersonalDetailsPageUI.LICENSE_TEXTBOX, keytToSend);
    }


}
