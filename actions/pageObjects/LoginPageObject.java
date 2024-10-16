package pageObjects;

import PageUIs.LoginPageUI;
import commons.BaseElements;
import commons.PageGenerator;
import org.openqa.selenium.WebDriver;
import pageObjects.dashboard.DashboardPageObject;

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
