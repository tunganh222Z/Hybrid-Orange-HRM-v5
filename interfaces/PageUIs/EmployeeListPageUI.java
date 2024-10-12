package PageUIs;

public class EmployeeListPageUI {
    public static final String DYNAMIC_COLUMN_HEADER_BY_NAME = "xpath=//div[@role='row']/div[@role='columnheader' and text()='%s']/preceding-sibling::div";
    public static final String DYNAMIC_CELL_BY_INDEX = "xpath=//div[@role='row']//div[@role='cell'][%s]/div";
}
