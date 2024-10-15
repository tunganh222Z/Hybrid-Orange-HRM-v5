package pageObjects;

import PageUIs.ImmigrationPageUI;
import org.openqa.selenium.WebDriver;

public class ImmigrationPageObject extends EmployeeNavigationSidebarPageObject {
    WebDriver driver;
    public ImmigrationPageObject(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    public void enterToNumberTextbox(String keyToSend) {
        waitForElementVisible(driver, ImmigrationPageUI.NUMBER_TEXTBOX);
        sendkeyToElement(driver, ImmigrationPageUI.NUMBER_TEXTBOX, keyToSend);
    }

    public void enterToIssuedDateTextbox(String keyToSend) {
        waitForElementVisible(driver, ImmigrationPageUI.ISSUEDDATE_TEXTBOX);
        sendkeyToElement(driver, ImmigrationPageUI.ISSUEDDATE_TEXTBOX, keyToSend);
    }

    public void enterToExpiryDateTextbox(String keyToSend) {
        waitForElementVisible(driver, ImmigrationPageUI.EXPIRYDATE_TEXTBOX);
        sendkeyToElement(driver, ImmigrationPageUI.EXPIRYDATE_TEXTBOX, keyToSend);
    }

    public void enterToEligibleStatusTextbox(String keyToSend) {
        waitForElementVisible(driver, ImmigrationPageUI.ELIGIBLE_STATUS_TEXTBOX);
        sendkeyToElement(driver, ImmigrationPageUI.ELIGIBLE_STATUS_TEXTBOX, keyToSend);
    }

    public void selectIssuedByDropdown(String expectedOption) {
        selectItemInCustomDropdown(driver, ImmigrationPageUI.ISSUED_DROPDOWN, ImmigrationPageUI.ISSUED_DROPDOWN_OPTIONS, expectedOption);
    }

    public void selectEligibleReviewDateDropdown(String keyToSend) {
        waitForElementVisible(driver, ImmigrationPageUI.ELIGIBLE_REVIEW_DATE_TEXTBOX);
        sendkeyToElement(driver, ImmigrationPageUI.ELIGIBLE_REVIEW_DATE_TEXTBOX, keyToSend);
    }

    public void enterToCommentsTextArea(String keyToSend) {
        waitForElementVisible(driver, ImmigrationPageUI.COMMENTS_TEXT_AREA);
        sendkeyToElement(driver, ImmigrationPageUI.COMMENTS_TEXT_AREA, keyToSend);
    }
}
