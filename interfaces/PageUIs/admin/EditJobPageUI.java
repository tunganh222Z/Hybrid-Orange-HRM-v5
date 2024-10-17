package PageUIs.admin;

public class EditJobPageUI {
    public static final String REQUIRED_MESSAGE = "xpath=//label[string()='Job Title']/parent::div/following-sibling::span";
    public static final String JOB_DESCRIPTION_TEXTAREA = "xpath=//div[string()='Job Description']//textarea";
    public static final String JOB_TITLE_TEXTBOX = "xpath=//div[string()='Job Title']/parent::div//input";
    public static final String SAVE_BUTTON = "xpath=//div[@class='oxd-form-actions']//button[contains(string(),'Save')]";
}
