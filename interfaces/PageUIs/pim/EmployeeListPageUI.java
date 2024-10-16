package PageUIs.pim;

public class EmployeeListPageUI {
    public static final String DYNAMIC_COLUMN_HEADER_BY_NAME = "xpath=//div[@role='row']/div[@role='columnheader' and text()='%s']/preceding-sibling::div";
    public static final String DYNAMIC_CELL_BY_INDEX = "xpath=//div[@role='row']//div[@role='cell'][%s]/div";
    public static final String EDIT_BUTTON_BY_EMPLOYEE_ID = "XPATH=//div[contains(text(),'%s')]/parent::div/parent::div//button/i[@class='oxd-icon bi-pencil-fill']";
    public static final String DELETE_BUTTON_BY_EMPLOYEE_ID = "XPATH=//div[contains(text(),'%s')]/parent::div/parent::div//button/i[@class='oxd-icon bi-trash']";
}
