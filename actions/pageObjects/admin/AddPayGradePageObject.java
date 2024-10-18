package pageObjects.admin;

import org.openqa.selenium.WebDriver;

public class AddPayGradePageObject extends  PayGradesPageObject{
    WebDriver driver;

    public AddPayGradePageObject (WebDriver driver){
        super(driver);
        this.driver = driver;
    }
}
