package pageObjects.pim;

import PageUIs.pim.DependentsPageUI;
import org.openqa.selenium.WebDriver;

public class DependentsPageObject extends EmployeeNavigationSidebarPageObject {
    WebDriver driver;
    public DependentsPageObject(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    public void enterToNameTextBox(String keyToSend) {
        waitForElementVisible(driver, DependentsPageUI.NAME_TEXTBOX);
        sendkeyToElement(driver, DependentsPageUI.NAME_TEXTBOX, keyToSend);
    }

    public void selectRelationShipDropdown(String expectedOption) {
        selectItemInCustomDropdown(driver, DependentsPageUI.RELATIONSHIP_DROPDOWN, DependentsPageUI.RELATIONSHIP_DROPDOWN_OPTIONS, expectedOption);
    }

    public void enterToDoBTextbox(String keyToSend) {
        waitForElementVisible(driver, DependentsPageUI.DATE_OF_BIRTH_TEXTBOX);
        sendkeyToElement(driver, DependentsPageUI.DATE_OF_BIRTH_TEXTBOX, keyToSend);
    }
}
