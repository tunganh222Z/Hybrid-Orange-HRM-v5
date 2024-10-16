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
}
