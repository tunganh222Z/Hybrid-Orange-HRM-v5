package PageUIs.pim;

public class SalaryPageUI {

    public static final String SALARY_COMPONENT_TEXTBOX = "xpath=//div[string()='Salary Component']//input";
    public static final String AMOUNT_TEXTBOX = "xpath=//div[string()='Amount']//input";
    public static final String ROUTING_NUMBER_TEXTBOX = "xpath=//div[string()='Routing Number']//input";
    public static final String DIRECT_DEPOSIT_AMOUNT_TEXTBOX = "xpath=//div[string()='Include Direct Deposit Details']//following-sibling::div//div[string()='Amount']//input";
    public static final String ACCOUNT_NUMBER_TEXTBOX = "xpath=//div[string()='Account Number']//input";
    public static final String PAY_GRADE_DROPDOWN = "xpath=//div[string()='Pay Grade']/parent::div//div[@class='oxd-select-wrapper']";
    public static final String PAY_GRADE_DROPDOWN_OPTIONS = "xpath=//div[string()='Pay Grade']/parent::div//div[@role='option']";
    public static final String PAY_FREQUENCY_DROPDOWN = "xpath=//div[string()='Pay Frequency']/parent::div//div[@class='oxd-select-wrapper']";
    public static final String PAY_FREQUENCY_DROPDOWN_OPTIONS = "xpath=//div[string()='Pay Frequency']/parent::div//div[@role='option']";
    public static final String CURRENCY_DROPDOWN = "xpath=//div[string()='Currency']/parent::div//div[@class='oxd-select-wrapper']";
    public static final String CURRENCY_DROPDOWN_OPTIONS = "xpath=//div[string()='Currency']/parent::div//div[@role='option']";
    public static final String ACCOUNT_TYPE_DROPDOWN = "xpath=//div[string()='Account Type']/parent::div//div[@class='oxd-select-wrapper']";
    public static final String ACCOUNT_TYPE_DROPDOWN_OPTIONS = "xpath=//div[string()='Account Type']/parent::div//div[@role='option']";
    public static final String HINT_MIN_MAX_AMOUNT_TEXT = "xpath=//p[@class='oxd-text oxd-text--p orangehrm-input-hint']";
}
