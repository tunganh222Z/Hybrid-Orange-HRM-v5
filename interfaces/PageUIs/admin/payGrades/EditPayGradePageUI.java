package PageUIs.admin.payGrades;

import org.openqa.selenium.WebDriver;
import pageObjects.admin.payGrades.PayGradesPageObject;

public class EditPayGradePageUI  {

    public static final String CURRENCY_DROPDOWN = "xpath=//div[string()='Currency']/parent::div//div[@class='oxd-select-wrapper']";
    public static final String CURRENCY_DROPDOWN_OPTION = "xpath=//div[string()='Currency']/parent::div//div[@role='option']/span";
    public static final String MINIMUM_SALARY_TEXTBOX = "xpath=//label[text()='Minimum Salary']/parent::div/following-sibling::div/input";
    public static final String MAXIMUM_SALARY_TEXTBOX = "xpath=//label[text()='Maximum Salary']/parent::div/following-sibling::div/input";
    public static final String ADD_CURRENCY_SAVE_BUTTON = "xpath=//h6[text()='Add Currency']/parent::div//button[contains(string(),'Save')]";
    public static final String EDIT_PAY_GRADE_NAME_TEXTBOX = "XPATH=//div[string()='Name']//input";
}
