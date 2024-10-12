package pageObjects;

import PageUIs.BaseElementsPageUI;
import PageUIs.LoginPageUI;
import commons.BaseElements;
import commons.BasePage;
import commons.PageGenerator;
import org.openqa.selenium.WebDriver;

public class LoginPageObject extends BaseElements {
    WebDriver driver;

    public LoginPageObject(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    public DashboardPageObject clickToLoginButton() {
        waitForElementVisible(driver,LoginPageUI.LOGIN_BUTTON);
        clickToElement(driver, LoginPageUI.LOGIN_BUTTON);
        return PageGenerator.getDashboardPageObject(driver);
    }
}
