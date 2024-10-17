package pageObjects.admin;

import PageUIs.admin.JobTitlePageUI;
import org.openqa.selenium.WebDriver;
import pageObjects.MainMenuPageObject;

public class JobTitlePageObject extends MainMenuPageObject {
    WebDriver driver;
    public JobTitlePageObject(WebDriver driver){
        super(driver);
        this.driver = driver;
    }


    public EditJobPageObject clickToEditButtonByJobTitles(String jobTitles) {
        waitForElementVisible(driver, JobTitlePageUI.EDIT_BUTTON_BY_JOB_TITLE, jobTitles);
        clickToElement(driver, JobTitlePageUI.EDIT_BUTTON_BY_JOB_TITLE, jobTitles);
        return new EditJobPageObject(driver);
    }

    public String getDescriptionText(String jobTitles) {
        waitForElementVisible(driver, JobTitlePageUI.DESCRIPTION_BY_JOB_TITLE, jobTitles);
        return getWebElementText(driver, JobTitlePageUI.DESCRIPTION_BY_JOB_TITLE, jobTitles);
    }

    public void clicklToDeleteButtonByJobTitles(String jobTitle) {
        waitForElementVisible(driver, JobTitlePageUI.DELETE_BUTTON_BY_JOB_TITLES, jobTitle);
        clickToElement(driver, JobTitlePageUI.DELETE_BUTTON_BY_JOB_TITLES, jobTitle);
    }

    public void clickToYesDeletePopUp() {
        waitForElementVisible(driver, JobTitlePageUI.YES_BUTTON_IN_POPUP);
        clickToElement(driver, JobTitlePageUI.YES_BUTTON_IN_POPUP);
    }
}
