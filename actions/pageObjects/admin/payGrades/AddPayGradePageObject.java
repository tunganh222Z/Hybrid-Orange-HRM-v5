package pageObjects.admin.payGrades;

import PageUIs.admin.payGrades.AddPayGradePageUI;
import org.openqa.selenium.WebDriver;

public class AddPayGradePageObject extends  PayGradesPageObject{
    WebDriver driver;

    public AddPayGradePageObject (WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    public void enterToNameTextbox(String keyToSend) {
        waitForElementVisible(driver, AddPayGradePageUI.NAME_TEXT_BOX);
        sendkeyToElement(driver, AddPayGradePageUI.NAME_TEXT_BOX, keyToSend);
    }
}
