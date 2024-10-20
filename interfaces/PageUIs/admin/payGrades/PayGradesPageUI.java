package PageUIs.admin.payGrades;

public class PayGradesPageUI {
    public static final String EDIT_BUTTON_BY_NAME = "XPATH=//div[@role='cell' and string()='%s']/following-sibling::div//button/i[@class='oxd-icon bi-pencil-fill']";
    public static final String DELETE_BUTTON_BY_NAME = "XPATH=//div[@role='cell' and string()='%s']/following-sibling::div//button/i[@class='oxd-icon bi-trash']";
    public static final String RECORD_PAY_GRADE_NAMES = "xpath=//div[@class='oxd-table-body']//div[@role='cell'][%s]/div";
    public static final String COLUMN_HEADER_BY_TEXT = "xpath=//div[@class='oxd-table-header']/div/div[string()='%s']/preceding-sibling::div";
}
