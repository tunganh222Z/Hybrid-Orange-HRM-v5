package commons;

import org.openqa.selenium.WebDriver;
import pageObjects.*;
import pageObjects.admin.jobTitles.EditJobPageObject;
import pageObjects.admin.jobTitles.JobTitlePageObject;
import pageObjects.admin.payGrades.AddPayGradePageObject;
import pageObjects.admin.payGrades.EditPayGradePageObject;
import pageObjects.admin.payGrades.PayGradesPageObject;
import pageObjects.admin.UserManagementPageObject;
import pageObjects.dashboard.DashboardPageObject;
import pageObjects.pim.*;

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
        return new EmployeeListPageObject(driver);
    }

    public static EmergencyContactsPageObject getEmergencyContactsPage(WebDriver driver) {
        return new EmergencyContactsPageObject(driver);
    }

    public static DependentsPageObject getDependentsPage(WebDriver driver) {
        return new DependentsPageObject(driver);
    }

    public static ImmigrationPageObject getImmigrationPage(WebDriver driver) {
        return new ImmigrationPageObject(driver);
    }

    public static JobPageObject getJobPage(WebDriver driver) {
        return new JobPageObject(driver);
    }

    public static SalaryPageObject getSalaryPage(WebDriver driver) {
        return new SalaryPageObject(driver);
    }

    public static ReportToPageObject getReportToPage(WebDriver driver) {
        return new ReportToPageObject(driver);
    }

    public static QualificationsPageObject getQualificationsPage(WebDriver driver) {
        return new QualificationsPageObject(driver);
    }

    public static EditJobPageObject getEditJobPage(WebDriver driver){
        return new EditJobPageObject(driver);
    }

    public static JobTitlePageObject getJobTitlePage(WebDriver driver){
        return new JobTitlePageObject(driver);
    }

    public static UserManagementPageObject getUserManagementPage(WebDriver driver) {
        return new UserManagementPageObject(driver);
    }

    public static PayGradesPageObject getPayGradesPage(WebDriver driver) {
        return new PayGradesPageObject(driver);
    }

    public static EditPayGradePageObject getEditPayGradePage(WebDriver driver) {
        return new EditPayGradePageObject(driver);
    }

    public static AddPayGradePageObject getAddPayGradePage(WebDriver driver) {
        return new AddPayGradePageObject(driver);
    }
}
