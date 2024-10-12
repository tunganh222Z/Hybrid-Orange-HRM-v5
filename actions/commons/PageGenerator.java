package commons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v85.page.Page;
import pageObjects.*;

public class PageGenerator {
    WebDriver driver;
    public PageGenerator(WebDriver driver){
        this.driver = driver;
    }

    public static LoginPageObject getLoginPage(WebDriver driver) {
        return new LoginPageObject(driver);
    }

    public static DashboardPageObject getDashboardPageObject(WebDriver driver) {
        return new DashboardPageObject(driver);
    }

    public static AddEmployeePageObject getAddEmployeePageObject(WebDriver driver){
        return new AddEmployeePageObject(driver);
    }

    public static ContactDetailsPageObject getContactDetailsPageObject(WebDriver driver){
        return new ContactDetailsPageObject(driver);
    }

    public static PersonalDetailsPageObject getPersonalDetailsPageObject(WebDriver driver) {
        return new PersonalDetailsPageObject(driver);
    }

    public static EmployeeListPageObject getEmployeeListPageObject(WebDriver driver) {
    }
}
