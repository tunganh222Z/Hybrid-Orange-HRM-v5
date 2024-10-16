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
        waitForElementVisible();
        sendkeyToElement();
    }

    public void enterToJobDescriptionTextarea(String s) {
        waitForElementVisible(driver, EditJobPageUI.JOB_DESCRIPTION_TEXTAREA);
        sendkeyToElement(driver, EditJobPageUI.JOB_DESCRIPTION_TEXTAREA, );
    }
}
