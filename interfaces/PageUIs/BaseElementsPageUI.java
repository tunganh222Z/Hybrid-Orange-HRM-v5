package PageUIs;

public class BaseElementsPageUI {
    public static final String UPLOAD_FILE_TYPE = "";

    public static final String DYNAMIC_TEXTBOX_BY_NAME ="xpath=//input[@name='%s']";
    public static final String DYNAMIC_MODULE_BY_NAME = "xpath=//a[contains(@class,'oxd-main-menu-item')]//span[contains(string(),'%s')]";
    public static final String DYNAMIC_TOP_BAR_LINK_BY_NAME = "xpath=//li[contains(@class,'oxd-topbar-body-nav-tab')]//a[contains(string(),'%s')]";
    public static final String DYNAMIC_BUTTON_BY_NAME = "xpath=//button[contains(@class,'oxd-button') and contains(string(),'%s')]";
}
