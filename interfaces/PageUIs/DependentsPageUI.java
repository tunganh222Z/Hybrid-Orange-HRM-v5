package PageUIs;

public class DependentsPageUI {
    public static final String NAME_TEXTBOX = "xpath=//div[string()='Name']//input";
    public static final String RELATIONSHIP_DROPDOWN = "xpath=//div[string()='Relationship']/parent::div//div[@class='oxd-select-wrapper']";
    public static final String RELATIONSHIP_DROPDOWN_OPTIONS = "xpath=//div[contains(@class,'oxd-select-dropdown')]//div[@role='option']";
    public static final String DATE_OF_BIRTH_TEXTBOX = "xpath=//div[string()='Date of Birth']//input";
}
