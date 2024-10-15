package pageObjects;

import PageUIs.SalaryPageUI;
import org.openqa.selenium.WebDriver;

public class SalaryPageObject extends EmployeeNavigationSidebarPageObject {
    WebDriver driver;
    public SalaryPageObject(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    public void enterToSalaryComponentTextbox(String keyToSend) {
        waitForElementVisible(driver, SalaryPageUI.SALARY_COMPONENT_TEXTBOX);
        sendkeyToElement(driver, SalaryPageUI.SALARY_COMPONENT_TEXTBOX, keyToSend);
    }

    public void selectPayGradeDropdown(String expectedOptions) {
        selectItemInCustomDropdown(driver, SalaryPageUI.PAY_GRADE_DROPDOWN, SalaryPageUI.PAY_GRADE_DROPDOWN_OPTIONS, expectedOptions);
    }

    public void selectPayFrequencyDropdown(String expectedOptions) {
        selectItemInCustomDropdown(driver, SalaryPageUI.PAY_FREQUENCY_DROPDOWN, SalaryPageUI.PAY_FREQUENCY_DROPDOWN_OPTIONS, expectedOptions);
    }

    public void selectCurrencyDropdown(String expectedOptions) {
        selectItemInCustomDropdown(driver, SalaryPageUI.CURRENCY_DROPDOWN, SalaryPageUI.CURRENCY_DROPDOWN_OPTIONS, expectedOptions);
    }

    public void enterToAmountTextbox(String keyToSend) {
        waitForElementVisible(driver, SalaryPageUI.AMOUNT_TEXTBOX);
        sendkeyToElement(driver, SalaryPageUI.AMOUNT_TEXTBOX, keyToSend);
    }

    public void enterToAccountNumberTextbox(String keyToSend) {
        waitForElementVisible(driver, SalaryPageUI.ACCOUNT_NUMBER_TEXTBOX);
        sendkeyToElement(driver, SalaryPageUI.ACCOUNT_NUMBER_TEXTBOX, keyToSend);
    }

    public void selectAccountTypeDropdown(String expectedOptions) {
        selectItemInCustomDropdown(driver, SalaryPageUI.ACCOUNT_TYPE_DROPDOWN, SalaryPageUI.ACCOUNT_TYPE_DROPDOWN_OPTIONS, expectedOptions);
    }

    public void enterToRoutingNumberTextbox(String keyToSend) {
        waitForElementVisible(driver, SalaryPageUI.ROUTING_NUMBER_TEXTBOX);
        sendkeyToElement(driver, SalaryPageUI.ROUTING_NUMBER_TEXTBOX, keyToSend);
    }

    public void enterToDirectDepositAmountTextbox(String keyToSend) {
        waitForElementVisible(driver, SalaryPageUI.DIRECT_DEPOSIT_AMOUNT_TEXTBOX);
        sendkeyToElement(driver, SalaryPageUI.DIRECT_DEPOSIT_AMOUNT_TEXTBOX, keyToSend);
    }
}
