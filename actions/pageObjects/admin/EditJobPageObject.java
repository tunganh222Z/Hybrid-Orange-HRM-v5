package pageObjects.admin;

import PageUIs.admin.EditJobPageUI;
import org.openqa.selenium.WebDriver;

public class EditJobPageObject extends JobTitlePageObject{
    WebDriver driver;
    public EditJobPageObject (WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    public String getErrorMsg() {
        waitForElementVisible(driver, EditJobPageUI.REQUIRED_MESSAGE);
        return getWebElementText(driver, EditJobPageUI.REQUIRED_MESSAGE);
    }

    public void enterToJobTitleTextbox(String jobTitle) {
//        sendkeyToElementByJS(driver, EditJobPageUI.JOB_TITLE_TEXTBOX, jobTitle);
        waitForElementVisible(driver, EditJobPageUI.JOB_TITLE_TEXTBOX);
        sendkeyToElement(driver, EditJobPageUI.JOB_TITLE_TEXTBOX, jobTitle);
    }

    public void enterToJobDescriptionTextarea(String description) {
        waitForElementVisible(driver, EditJobPageUI.JOB_DESCRIPTION_TEXTAREA);
        sendkeyToElement(driver, EditJobPageUI.JOB_DESCRIPTION_TEXTAREA, description);
    }

    public void clickToSaveButton() {
        waitForElementVisible(driver, EditJobPageUI.SAVE_BUTTON);
        clickToElement(driver, EditJobPageUI.SAVE_BUTTON);
    }
}
