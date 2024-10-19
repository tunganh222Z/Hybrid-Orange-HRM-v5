package PageUIs.admin.payGrades;

import org.openqa.selenium.WebDriver;
import pageObjects.admin.payGrades.PayGradesPageObject;

public class AddPayGradePageUI extends PayGradesPageObject {
    WebDriver driver;

    public AddPayGradePageUI(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    public static final String NAME_TEXT_BOX = "xpath=//div[string()='Name']/parent::div//input";
}
