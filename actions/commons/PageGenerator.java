package commons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v85.page.Page;
import pageObjects.LoginPageObject;

public class PageGenerator {
    WebDriver driver;
    public PageGenerator(WebDriver driver){
        this.driver = driver;
    }

    public static LoginPageObject getLoginPage(WebDriver driver) {
        return new LoginPageObject(driver);
    }

}
