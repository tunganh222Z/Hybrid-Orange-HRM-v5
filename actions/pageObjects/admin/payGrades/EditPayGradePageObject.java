package pageObjects.admin.payGrades;

import PageUIs.admin.payGrades.EditPayGradePageUI;
import org.openqa.selenium.WebDriver;

public class EditPayGradePageObject extends PayGradesPageObject {
    WebDriver driver;
    public EditPayGradePageObject (WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    public void selectCurrencyDropdown(String expectedOption) {
        selectItemInCustomDropdown(driver, EditPayGradePageUI.CURRENCY_DROPDOWN, EditPayGradePageUI.CURRENCY_DROPDOWN_OPTION, expectedOption);
    }

    public void enterToMinimumSalary(String s) {
        waitForElementVisible(driver, EditPayGradePageUI.MINIMUM_SALARY_TEXTBOX);
        sendkeyToElement(driver, EditPayGradePageUI.MINIMUM_SALARY_TEXTBOX, s);
    }

    public void enterToMaximumSalary(String s) {
        waitForElementVisible(driver, EditPayGradePageUI.MAXIMUM_SALARY_TEXTBOX);
        sendkeyToElement(driver, EditPayGradePageUI.MAXIMUM_SALARY_TEXTBOX, s);
    }

    public void clickToSaveButtonAddCurrency() {
        waitForElementVisible(driver, EditPayGradePageUI.ADD_CURRENCY_SAVE_BUTTON);
        clickToElement(driver, EditPayGradePageUI.ADD_CURRENCY_SAVE_BUTTON);
    }

    public void enterToPayGradeName(String keyToSend) {
        waitForElementVisible(driver, EditPayGradePageUI.EDIT_PAY_GRADE_NAME_TEXTBOX);
        getWebElement(driver, EditPayGradePageUI.EDIT_PAY_GRADE_NAME_TEXTBOX).clear();
        sendkeyToElement(driver, EditPayGradePageUI.EDIT_PAY_GRADE_NAME_TEXTBOX, keyToSend);
    }
}
