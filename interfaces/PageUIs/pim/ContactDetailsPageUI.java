package PageUIs.pim;

public class ContactDetailsPageUI {
    public static final String STREET_1_TEXTBOX = "xpath=//div[string()='Street 1']//input";
    public static final String STREET_2_TEXTBOX = "xpath=//div[string()='Street 2']//input";
    public static final String CITY_TEXTBOX = "xpath=//div[string()='City']//input";
    public static final String STATE_PROVINCE_TEXTBOX = "xpath=//div[string()=\"State/Province\"]//input";
    public static final String ZIP_POSTAL_CODE_TEXTBOX = "xpath=//div[string()=\"Zip/Postal Code\"]//input";
    public static final String COUNTRY_DROPDOWN = "xpath=//div[string()='Country']/parent::div//div[contains(@class,'oxd-select-text')]";
    public static final String COUNTRY_DROPDOWN_OPTIONS = "xpath=//div[contains(@class,'oxd-select-dropdown')]/div[@role='option']";
    public static final String HOME_TEXTBOX = "xpath=//div[string()='Home']//input";
    public static final String MOBILE_TEXTBOX = "xpath=//div[string()='Mobile']//input";
    public static final String WORK_TEXTBOX = "xpath=//div[string()='Work']//input";
    public static final String EMAIL_WORK_TEXTBOX = "xpath=//div[string()='Work Email']//input";
    public static final String OTHER_EMAIL_TEXTBOX = "xpath=//div[string()='Other Email']//input";
}
