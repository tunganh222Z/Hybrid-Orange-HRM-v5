package commons;

import PageUIs.BaseElementsPageUI;
import org.openqa.selenium.WebDriver;

public class BaseElements extends BasePage {
    WebDriver driver;
    public BaseElements(WebDriver driver){
        this.driver = driver;
    }

    public void enterToTextBoxByName(String name, String keyToSend) {
        waitForElementVisible(driver, BaseElementsPageUI.DYNAMIC_TEXTBOX_BY_NAME,name);
        sendkeyToElement(driver, BaseElementsPageUI.DYNAMIC_TEXTBOX_BY_NAME,keyToSend, name);
    }

    public void openModuleByText(String name){
        waitForElementClickable(driver, BaseElementsPageUI.DYNAMIC_MODULE_BY_NAME,name);
        clickToElement(driver, BaseElementsPageUI.DYNAMIC_MODULE_BY_NAME,name);
    }

    public void clickToTopBarButtonByText(String name) {
        waitForElementClickable(driver, BaseElementsPageUI.DYNAMIC_TOP_BAR_LINK_BY_NAME,name );
        clickToElement(driver, BaseElementsPageUI.DYNAMIC_TOP_BAR_LINK_BY_NAME,name);

    }

    public void clickToButtonByText(String name) {
        waitForElementClickable(driver, BaseElementsPageUI.DYNAMIC_BUTTON_BY_NAME,name );
        clickToElement(driver, BaseElementsPageUI.DYNAMIC_BUTTON_BY_NAME,name );
    }

    public boolean isSucessMessageByText(String textMessage) {
        waitForElementVisible(driver, BaseElementsPageUI.DYNAMIC_TOAST_MESSAGE_BY_TEXT, textMessage);
        return getWebElement(driver, BaseElementsPageUI.DYNAMIC_TOAST_MESSAGE_BY_TEXT, textMessage).isDisplayed();
    }

    public String getTextBoxValueByName(String name, String attributeName) {
        waitForElementVisible(driver, BaseElementsPageUI.DYNAMIC_TEXTBOX_BY_NAME, name);
        return getWebElementAttribute(driver, BaseElementsPageUI.DYNAMIC_TEXTBOX_BY_NAME, attributeName, name);
    }

    public String getEmployeeID(String attributeName) {
        waitForElementVisible(driver, BaseElementsPageUI.EMPLOYEE_ID_TEXTBOX);
        return getWebElementAttribute(driver, BaseElementsPageUI.EMPLOYEE_ID_TEXTBOX, attributeName);
    }

    public void waitSpinnerIconInvisible(){
        waitForListElementsInvisible(driver, BaseElementsPageUI.SPINNER_ICON);
    }

    public void entertoTextBoxToSearch(String name, String keyToSend) {
        waitForElementVisible(driver, BaseElementsPageUI.DYNAMIC_TEXTBOX_TO_SEARCH_BY_NAME,name);
        sendkeyToElement(driver, BaseElementsPageUI.DYNAMIC_TEXTBOX_TO_SEARCH_BY_NAME, keyToSend, name);
    }
}
