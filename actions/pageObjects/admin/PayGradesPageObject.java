package pageObjects.admin;

import org.openqa.selenium.WebDriver;
import pageObjects.MainMenuPageObject;

public class PayGradesPageObject extends MainMenuPageObject {
    WebDriver driver;

    public PayGradesPageObject (WebDriver driver){
        super(driver);
        this.driver = driver;
    }

}
