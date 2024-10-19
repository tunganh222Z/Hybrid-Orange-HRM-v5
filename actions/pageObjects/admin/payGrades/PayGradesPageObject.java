package pageObjects.admin.payGrades;

import PageUIs.admin.payGrades.PayGradesPageUI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pageObjects.MainMenuPageObject;

import java.util.List;

public class PayGradesPageObject extends MainMenuPageObject {
    WebDriver driver;

    public PayGradesPageObject (WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    public boolean isPayGradeDeleted(String expectedName) {
        boolean isOptionDeleted = true;
        List<WebElement> listPayGradesName = getListWebElements(driver, PayGradesPageUI.RECORD_PAY_GRADE_NAMES);
        for (WebElement name : listPayGradesName){
            if (name.getText().equals(expectedName)){
                isOptionDeleted = false;
            }
        }
        return isOptionDeleted;
    }

    public void clickToEditButtonByName(String name) {
        waitForElementVisible(driver,PayGradesPageUI.EDIT_BUTTON_BY_NAME, name);
        clickToElement(driver,PayGradesPageUI.EDIT_BUTTON_BY_NAME, name);
    }

    public void clickToDeleteButtonByName(String name) {
        waitForElementVisible(driver,PayGradesPageUI.DELETE_BUTTON_BY_NAME, name);
        clickToElement(driver,PayGradesPageUI.DELETE_BUTTON_BY_NAME, name);
    }
}
