package pageObjects.pim;

import PageUIs.pim.QualificationsPageUI;
import org.openqa.selenium.WebDriver;

public class QualificationsPageObject extends EmployeeNavigationSidebarPageObject {
    WebDriver driver;
    public QualificationsPageObject(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    public void enterToCompanyTextbox(String keyToSend) {
        waitForElementVisible(driver, QualificationsPageUI.COMPANY_TEXTBOX);
        sendkeyToElement(driver, QualificationsPageUI.COMPANY_TEXTBOX, keyToSend);
    }

    public void enterToJobTitle(String keyToSend) {
        waitForElementVisible(driver, QualificationsPageUI.JOB_TITLE);
        sendkeyToElement(driver, QualificationsPageUI.JOB_TITLE, keyToSend);
    }

    public void enterToWorkExperienceFromDateTextbox(String keyToSend) {
        waitForElementVisible(driver, QualificationsPageUI.WORK_EXPERIENCE_FROM_DATE_TEXTBOX);
        sendkeyToElement(driver, QualificationsPageUI.WORK_EXPERIENCE_FROM_DATE_TEXTBOX, keyToSend);
    }

    public void enterToWorkExperienceToDateTextbox(String keyToSend) {
        waitForElementVisible(driver, QualificationsPageUI.WORK_EXPERIENCE_TO_DATE_TEXTBOX);
        sendkeyToElement(driver, QualificationsPageUI.WORK_EXPERIENCE_TO_DATE_TEXTBOX, keyToSend);
    }

    public void selectLevelDropdown(String expectedOption) {
        selectItemInCustomDropdown(driver, QualificationsPageUI.LEVEL_DROPDOWN, QualificationsPageUI.LEVEL_DROPDOWN_OPTIONS, expectedOption);
    }

    public void enterToInstituteTextbox(String keyToSend) {
        waitForElementVisible(driver, QualificationsPageUI.INSTITUTE_TEXTBOX);
        sendkeyToElement(driver, QualificationsPageUI.INSTITUTE_TEXTBOX, keyToSend);
    }

    public void enterToMajorSpecializationTextbox(String keyToSend) {
        waitForElementVisible(driver, QualificationsPageUI.MAJOR_SPECIALIZATION_TEXTBOX);
        sendkeyToElement(driver, QualificationsPageUI.MAJOR_SPECIALIZATION_TEXTBOX, keyToSend);
    }

    public void enterToYearTextbox(String keyToSend) {
        waitForElementVisible(driver, QualificationsPageUI.YEAR_TEXTBOX);
        sendkeyToElement(driver, QualificationsPageUI.YEAR_TEXTBOX, keyToSend);
    }

    public void enterToGPAScoreTextbox(String keyToSend) {
        waitForElementVisible(driver, QualificationsPageUI.GPA_SCORE_TEXTBOX);
        sendkeyToElement(driver, QualificationsPageUI.GPA_SCORE_TEXTBOX, keyToSend);
    }

    public void enterToStartDateTextbox(String keyToSend) {
        waitForElementVisible(driver, QualificationsPageUI.START_DATE_TEXTBOX);
        sendkeyToElement(driver, QualificationsPageUI.START_DATE_TEXTBOX, keyToSend);
    }

    public void enterToEndDateTextbox(String keyToSend) {
        waitForElementVisible(driver, QualificationsPageUI.END_DATE_TEXTBOX);
        sendkeyToElement(driver, QualificationsPageUI.END_DATE_TEXTBOX, keyToSend);
    }
}
