package pageObjects.pim;

import PageUIs.pim.EmployeeNavigationSidebarPageUI;
import commons.PageGenerator;
import org.openqa.selenium.WebDriver;
import pageObjects.MainMenuPageObject;

public class EmployeeNavigationSidebarPageObject extends MainMenuPageObject {
    WebDriver driver;
    public EmployeeNavigationSidebarPageObject(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    public EmployeeNavigationSidebarPageObject clickToEmployeeNavigationByLabel(String label) {
        waitForElementVisible(driver, EmployeeNavigationSidebarPageUI.DYNAMIC_EMPLOYEE_NAVIGATION_BY_LABEL, label);
        clickToElement(driver, EmployeeNavigationSidebarPageUI.DYNAMIC_EMPLOYEE_NAVIGATION_BY_LABEL, label);
        switch(label){
            case "Personal Details" :
                return PageGenerator.getPersonalDetailsPageObject(driver);
            case "Contact Details":
                return PageGenerator.getContactDetailsPageObject(driver);
            case "Emergency Contacts":
                return PageGenerator.getEmergencyContactsPage(driver);
            case "Dependents":
                return PageGenerator.getDependentsPage(driver);
            case "Immigration":
                return PageGenerator.getImmigrationPage(driver);
            case "Job":
                return PageGenerator.getJobPage(driver);
            case "Salary":
                return PageGenerator.getSalaryPage(driver);
            case "Report-to":
                return PageGenerator.getReportToPage(driver);
            case "Qualifications":
                return PageGenerator.getQualificationsPage(driver);
            default :
                System.out.println("Error Sidebar " + label + "page" );
                return null;
        }
    }
}
