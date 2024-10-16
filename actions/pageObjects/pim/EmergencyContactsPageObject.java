package pageObjects.pim;

import PageUIs.pim.EmergencyContactsPageUI;
import org.openqa.selenium.WebDriver;

public class EmergencyContactsPageObject extends EmployeeNavigationSidebarPageObject {
    WebDriver driver;
    public EmergencyContactsPageObject(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    public void enterToNameTextbox(String keyToSend) {
        waitForElementVisible(driver, EmergencyContactsPageUI.NAME_TEXTBOX);
        sendkeyToElement(driver, EmergencyContactsPageUI.NAME_TEXTBOX, keyToSend);
    }

    public void enterToRelationshipTextbox(String keyToSend) {
        waitForElementVisible(driver, EmergencyContactsPageUI.RELATIONSHIP_TEXTBOX);
        sendkeyToElement(driver, EmergencyContactsPageUI.RELATIONSHIP_TEXTBOX, keyToSend);
    }

    public void enterToHomeTelephoneTextbox(String keyToSend) {
        waitForElementVisible(driver, EmergencyContactsPageUI.HOME_TELEPHONE_TEXTBOX);
        sendkeyToElement(driver, EmergencyContactsPageUI.HOME_TELEPHONE_TEXTBOX, keyToSend);
    }

    public void enterToMobileTextbox(String keyToSend) {
        waitForElementVisible(driver, EmergencyContactsPageUI.MOBILE_TEXTBOX);
        sendkeyToElement(driver, EmergencyContactsPageUI.MOBILE_TEXTBOX, keyToSend);
    }

    public void enterToWorkTelephoneTextbox(String keyToSend) {
        waitForElementVisible(driver, EmergencyContactsPageUI.WORK_TELEPHONE_TEXTBOX);
        sendkeyToElement(driver, EmergencyContactsPageUI.WORK_TELEPHONE_TEXTBOX, keyToSend);
    }
}
