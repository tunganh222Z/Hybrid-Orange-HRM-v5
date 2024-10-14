package pageObjects;

import PageUIs.ContactDetailsPageUI;
import commons.BaseElements;
import org.openqa.selenium.WebDriver;

public class ContactDetailsPageObject extends BaseElements {
    WebDriver driver;
    public ContactDetailsPageObject(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void enterToStreet1Textbox(String keyToSend) {
        waitForElementVisible(driver, ContactDetailsPageUI.STREET_1_TEXTBOX);
        sendkeyToElement(driver, ContactDetailsPageUI.STREET_1_TEXTBOX, keyToSend);
    }

    public void enterToStreet2Textbox(String keyToSend) {
        waitForElementVisible(driver, ContactDetailsPageUI.STREET_2_TEXTBOX);
        sendkeyToElement(driver, ContactDetailsPageUI.STREET_2_TEXTBOX, keyToSend);
    }

    public void enterToCityTextbox(String keyToSend) {
        waitForElementVisible(driver, ContactDetailsPageUI.CITY_TEXTBOX);
        sendkeyToElement(driver, ContactDetailsPageUI.CITY_TEXTBOX, keyToSend);
    }

    public void enterToStateProvinceTextbox(String keyToSend) {
        waitForElementVisible(driver, ContactDetailsPageUI.STATE_PROVINCE_TEXTBOX);
        sendkeyToElement(driver, ContactDetailsPageUI.STATE_PROVINCE_TEXTBOX, keyToSend);
    }

    public void enterToZipPostalCodeTextbox(String keyToSend) {
        waitForElementVisible(driver, ContactDetailsPageUI.ZIP_POSTAL_CODE_TEXTBOX);
        sendkeyToElement(driver, ContactDetailsPageUI.ZIP_POSTAL_CODE_TEXTBOX, keyToSend);
    }

    public void selectCountryDropdown(String expectedOption) {
        selectItemInCustomDropdown(driver, ContactDetailsPageUI.COUNTRY_DROPDOWN, ContactDetailsPageUI.COUNTRY_DROPDOWN_OPTIONS, expectedOption);
    }

    public void enterToHomeTextbox(String keyToSend) {
        waitForElementVisible(driver, ContactDetailsPageUI.HOME_TEXTBOX);
        sendkeyToElement(driver, ContactDetailsPageUI.HOME_TEXTBOX, keyToSend);
    }

    public void enterToMobileTextbox(String keyToSend) {
        waitForElementVisible(driver, ContactDetailsPageUI.MOBILE_TEXTBOX);
        sendkeyToElement(driver, ContactDetailsPageUI.MOBILE_TEXTBOX, keyToSend);
    }

    public void enterToWorkTextbox(String keyToSend) {
        waitForElementVisible(driver, ContactDetailsPageUI.WORK_TEXTBOX);
        sendkeyToElement(driver, ContactDetailsPageUI.WORK_TEXTBOX, keyToSend);
    }

    public void enterToEmailWorkTextbox(String keyToSend) {
        waitForElementVisible(driver, ContactDetailsPageUI.EMAIL_WORK_TEXTBOX);
        sendkeyToElement(driver, ContactDetailsPageUI.EMAIL_WORK_TEXTBOX, keyToSend);
    }

    public void enterToOtherEmailTextbox(String keyToSend) {
        waitForElementVisible(driver, ContactDetailsPageUI.OTHER_EMAIL_TEXTBOX);
        sendkeyToElement(driver, ContactDetailsPageUI.OTHER_EMAIL_TEXTBOX, keyToSend);
    }
}
