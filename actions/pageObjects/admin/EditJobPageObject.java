package pageObjects.admin;

import org.openqa.selenium.WebDriver;

public class EditJobPageObject extends JobTitlePageObject{
    WebDriver driver;
    public EditJobPageObject (WebDriver driver){
        super(driver);
        this.driver = driver;
    }
}
