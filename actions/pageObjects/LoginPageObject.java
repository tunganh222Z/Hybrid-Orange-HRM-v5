package pageObjects;

import PageUIs.LoginPageUI;
import commons.BasePage;
import commons.PageGenerator;
import org.openqa.selenium.WebDriver;

public class LoginPageObject extends BasePage {
    WebDriver driver;
    public LoginPageObject(WebDriver driver){
        this.driver = driver;
    }

    public DashboardPageObject clickToLoginButton() {
        waitForElementVisible(driver,LoginPageUI.LOGIN_BUTTON);
        clickToElement(driver, LoginPageUI.LOGIN_BUTTON);
        return PageGenerator.getDashboardPageObject(driver);
    }
}
