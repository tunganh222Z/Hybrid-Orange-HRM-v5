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

    public void clickToTopBarButtonByText() {

    }

    public String getEmployeeID(String value) {
    }

    public void clickToButtonByText(String name) {
        waitForElementClickable(driver, BaseElementsPageUI.DYNAMIC_BUTTON_BY_NAME,name );
    }
}
