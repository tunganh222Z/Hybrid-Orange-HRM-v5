package pageObjects.pim;

import PageUIs.pim.JobPageUI;
import org.openqa.selenium.WebDriver;

public class JobPageObject extends EmployeeNavigationSidebarPageObject {
    WebDriver driver;
    public JobPageObject(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    public void enterToJoinedDateTextbox(String keyToSend) {
        waitForElementVisible(driver, JobPageUI.JOINED_DATE_TEXTBOX);
        sendkeyToElement(driver, JobPageUI.JOINED_DATE_TEXTBOX, keyToSend);
    }

    public void selectJobTitleDropdown(String expectedOption) {
        selectItemInCustomDropdown(driver, JobPageUI.JOB_TITLE_DROPDOWN, JobPageUI.JOB_TITLE_DROPDOWN_OPTIONS, expectedOption);
    }

    public void selectJobCategoryDropdown(String expectedOption) {
        selectItemInCustomDropdown(driver, JobPageUI.JOB_CATEGORY_DROPDOWN, JobPageUI.JOB_CATEGORY_DROPDOWN_OPTIONS, expectedOption);
    }

    public void selectEmploymentStatus(String expectedOption) {
        selectItemInCustomDropdown(driver, JobPageUI.EMPLOYMENT_STATUS, JobPageUI.EMPLOYMENT_STATUS_OPTIONS, expectedOption);
    }

    public void clickToButtonTerminate() {
        waitForElementVisible(driver, JobPageUI.TERMINATE_BUTTON);
        clickToElement(driver, JobPageUI.TERMINATE_BUTTON);
    }

    public void enterTerminateDateTextbox(String keyToSend) {
        waitForElementVisible(driver, JobPageUI.TERMINATE_DATE_TEXTBOX);
        sendkeyToElement(driver, JobPageUI.TERMINATE_DATE_TEXTBOX, keyToSend);
    }

    public void selectTerminateReasonDropdown(String expectedOption) {
        selectItemInCustomDropdown(driver, JobPageUI.TERMINATE_REASON_DROPDOWN, JobPageUI.TERMINATE_REASON_DROPDOWN_OPTIONS, expectedOption);
    }

    public void enterTerminateNoteTextArea(String keyToSend) {
        waitForElementVisible(driver, JobPageUI.TERMINATE_NOTE_TEXTAREA);
        sendkeyToElement(driver, JobPageUI.TERMINATE_NOTE_TEXTAREA, keyToSend);
    }

    public void clickToActiveEmploymentButton() {
        waitForElementVisible(driver, JobPageUI.ACTIVE_BUTTON);
        clickToElement(driver, JobPageUI.ACTIVE_BUTTON);
    }

    public void clickToTerminateSaveButton() {
        waitForElementVisible(driver, JobPageUI.TERMINATE_SAVE_BUTTON );
        clickToElement(driver, JobPageUI.TERMINATE_SAVE_BUTTON);
    }

    public String getSelectedJobInDropdown() {
        waitForElementVisible(driver, JobPageUI.FIRST_SELECTED_DROPDOWN_JOB);
        return getWebElementAttribute(driver, JobPageUI.FIRST_SELECTED_DROPDOWN_JOB, "value");
    }
}
