package pageObjects;

import PageUIs.PersonalDetailsPageUI;
import commons.BaseElements;
import commons.BasePage;
import org.openqa.selenium.WebDriver;

public class PersonalDetailsPageObject extends BaseElements {
    WebDriver driver;
    public PersonalDetailsPageObject(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    public void enterToLicenseNumberTextbox(String keytToSend) {
        waitForElementVisible(driver, PersonalDetailsPageUI.LICENSE_TEXTBOX);
        sendkeyToElement(driver, PersonalDetailsPageUI.LICENSE_TEXTBOX, keytToSend);
    }

    public void selectToNationalityDropdown(String s) {
    }

    public void selectToMarialStatusDropdown(String s) {
    }

    public void clickToMaleRadioButton(String s) {
    }

    public void clickToSmockerCheckButton() {
    }
}
