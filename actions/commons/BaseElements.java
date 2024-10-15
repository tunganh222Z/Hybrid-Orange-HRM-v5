package commons;

import PageUIs.BaseElementsPageUI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BaseElements extends BasePage {
    WebDriver driver;
    public BaseElements(WebDriver driver){
        this.driver = driver;
    }

    public void enterToTextBoxByName(String name, String keyToSend) {
        waitForElementVisible(driver, BaseElementsPageUI.DYNAMIC_TEXTBOX_BY_NAME,name);
        sendkeyToElement(driver, BaseElementsPageUI.DYNAMIC_TEXTBOX_BY_NAME,keyToSend, name);
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

    public void enterToDatePickerByLabel(String label, String keyToSend) {
        waitForElementVisible(driver, BaseElementsPageUI.DYNAMIC_DATE_PICKER_BY_LABEL, label);
        sendkeyToElement(driver, BaseElementsPageUI.DYNAMIC_DATE_PICKER_BY_LABEL, keyToSend, label);
    }

    public void selectDropdownByLabel(String label, String expectedOption) {
        selectItemInCustomDropdown(driver,BaseElementsPageUI.DYNAMIC_DROPDOWN_BY_LABEL,BaseElementsPageUI.DYNAMIC_DROPDOWN_SELECT_OPTIONS_BY_LABEL, expectedOption, label);
//        waitForElementClickable(driver, BaseElementsPageUI.DYNAMIC_DROPDOWN_BY_LABEL, label);
//        clickToElement(driver, BaseElementsPageUI.DYNAMIC_DROPDOWN_BY_LABEL, label);
//
//        waitForListElementsVisible(driver, BaseElementsPageUI.DYNAMIC_DROPDOWN_SELECT_OPTIONS_BY_LABEL, label);
//        List<WebElement> selectOptions = getListWebElements(driver, BaseElementsPageUI.DYNAMIC_DROPDOWN_SELECT_OPTIONS_BY_LABEL, label);
//        for (WebElement option : selectOptions){
//            if (option.getText().equals(expectedOption)){
//                option.click();
//                break;
//            }
//        }

    }

    public void clickToRadioButtonByLabel(String label) {
        clickToElementByJS(driver, BaseElementsPageUI.DYNAMIC_RADIO_BUTTON_BY_LABEL, label);
    }


    public void clickToToggleButtonByText(String label) {
        clickToElementByJS(driver, BaseElementsPageUI.DYNAMIC_TOGGLE_BUTTON, label);
    }

    public void clickToAddButtonByLabel(String restParam) {
        waitForElementVisible(driver, BaseElementsPageUI.DYNAMIC_ADD_BUTTON_BY_LABEL, restParam);
        clickToElement(driver, BaseElementsPageUI.DYNAMIC_ADD_BUTTON_BY_LABEL, restParam);
    }
}
