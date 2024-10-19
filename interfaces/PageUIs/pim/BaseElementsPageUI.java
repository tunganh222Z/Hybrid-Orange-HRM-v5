package PageUIs.pim;

public class BaseElementsPageUI {
    public static final String UPLOAD_FILE_TYPE = "";

    public static final String DYNAMIC_TEXTBOX_BY_NAME ="xpath=//input[@name='%s']";
    public static final String DYNAMIC_TOP_BAR_LINK_BY_NAME = "xpath=//li[contains(@class,'oxd-topbar-body-nav-tab')]//a[contains(string(),'%s')]";
    public static final String DYNAMIC_BUTTON_BY_NAME = "xpath=//button[contains(@class,'oxd-button') and contains(string(),'%s')]";
    public static final String DYNAMIC_TOAST_MESSAGE_BY_TEXT = "xpath=//p[contains(@class,'oxd-text--toast-message') and text()='%s']";
    public static final String EMPLOYEE_ID_TEXTBOX = "xpath=//label[text()='Employee Id']/parent::div/following-sibling::div/input";
    public static final String SPINNER_ICON = "xpath=//div[@class='oxd-loading-spinner-container']";
    public static final String DYNAMIC_TEXTBOX_TO_SEARCH_BY_NAME = "xpath=//label[text()='%s']/ancestor::div[contains(@class,'oxd-input-group')]//input";
    public static final String DYNAMIC_DATE_PICKER_BY_LABEL = "Xpath=//label[contains(text(),'%s')]/parent::div/following-sibling::div//input";
    public static final String DYNAMIC_DROPDOWN_BY_LABEL = "xpath=//label[text()='%s']/parent::div/following-sibling::div/div[@class='oxd-select-wrapper']";
    public static final String DYNAMIC_DROPDOWN_SELECT_OPTIONS_BY_LABEL = "xpath=//label[text()='%s']/parent::div/following-sibling::div//div[@role='option']";
    public static final String DYNAMIC_RADIO_BUTTON_BY_LABEL = "xpath=//label[contains(string(),'%s')]/span/preceding-sibling::input";
    public static final String YES_BUTTON_IN_POPUP = "xpath=//button[string()=' Yes, Delete ']";
    public static final String DYNAMIC_TOGGLE_BUTTON = "xpath=//div[string()='%s']//input";
    public static final String DYNAMIC_ADD_BUTTON_BY_LABEL = "xpath=//h6[text()='%s']//parent::div//button[contains(string(),'Add')]";
    public static final String DYNAMIC_TOP_BAR_DROPDOWN_BY_NAME = "xpath=//li[contains(string(),'%s')]";
    public static final String DYNAMIC_TOP_BAR_DROPDOWN_OPTIONS_BY_NAME = "xpath=//li[contains(string(),'%s')]//ul/li/a";
    public static final String REQUIRED_MESSAGE_BY_TEXTBOX_LABEL = "xpath=//div[string()='%s']/parent::div//span";
}
