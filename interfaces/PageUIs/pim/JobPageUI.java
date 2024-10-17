package PageUIs.pim;

public class JobPageUI {
    public static final String JOINED_DATE_TEXTBOX = "xpath=//div[string()='Joined Date']//input";
    public static final String JOB_TITLE_DROPDOWN = "xpath=//div[string()='Job Title']/parent::div//div[@class='oxd-select-wrapper']";
    public static final String JOB_TITLE_DROPDOWN_OPTIONS = "xpath=//div[string()='Job Title']/parent::div//div[@role='option']";
    public static final String JOB_CATEGORY_DROPDOWN = "xpath=//div[string()='Job Category']/parent::div//div[@class='oxd-select-wrapper']";
    public static final String JOB_CATEGORY_DROPDOWN_OPTIONS = "xpath=//div[string()='Job Category']/parent::div//div[@role='option']";
    public static final String EMPLOYMENT_STATUS = "xpath=//div[string()='Employment Status']/parent::div//div[@class='oxd-select-wrapper']";
    public static final String EMPLOYMENT_STATUS_OPTIONS = "xpath=//div[string()='Employment Status']/parent::div//div[@role='option']";
    public static final String TERMINATE_DATE_TEXTBOX = "xpath=//div[string()='Termination Date']//input";
    public static final String TERMINATE_REASON_DROPDOWN = "xpath=//div[string()='Termination Reason']/parent::div//div[@class='oxd-select-wrapper']";
    public static final String TERMINATE_NOTE_TEXTAREA = "xpath=//div[string()='Note']//textarea";
    public static final String ACTIVE_BUTTON = "Xpath=//button[@title='Activate Employment']";
    public static final String TERMINATE_REASON_DROPDOWN_OPTIONS = "xpath=//div[string()='Termination Reason']/parent::div//div[@role='option']";
    public static final String TERMINATE_BUTTON = "Xpath=//button[@title='Terminate Employment']";
    public static final String TERMINATE_SAVE_BUTTON = "xpath=//div[@class='oxd-dialog-container-default--inner']//button[contains(string(),'Save')]";
    public static final String FIRST_SELECTED_DROPDOWN_JOB = "xpath=//div[string()='Job Title']/following-sibling::div//div[@class='oxd-select-text-input']";
}
