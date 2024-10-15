package PageUIs;

import commons.BaseElements;
import org.openqa.selenium.WebDriver;

public class EmergencyContactsPageUI extends BaseElements {
    WebDriver driver;
    public EmergencyContactsPageUI(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    public static final String NAME_TEXTBOX = "xpath=//div[string()='Name']//input";
    public static final String RELATIONSHIP_TEXTBOX = "xpath=//div[string()='Relationship']//input";
    public static final String HOME_TELEPHONE_TEXTBOX = "xpath=//div[string()='Home Telephone']//input";
    public static final String MOBILE_TEXTBOX = "xpath=//div[string()='Mobile']//input";
    public static final String WORK_TELEPHONE_TEXTBOX = "xpath=//div[string()='Work Telephone']//input";
}
