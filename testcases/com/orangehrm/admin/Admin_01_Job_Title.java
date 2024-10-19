package com.orangehrm.admin;

import commons.BaseTest;
import commons.GlobalConstant;
import commons.PageGenerator;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObjects.LoginPageObject;
import pageObjects.admin.jobTitles.EditJobPageObject;
import pageObjects.admin.jobTitles.JobTitlePageObject;
import pageObjects.admin.UserManagementPageObject;
import pageObjects.dashboard.DashboardPageObject;
import pageObjects.pim.EmployeeListPageObject;
import pageObjects.pim.JobPageObject;
import pageObjects.pim.PersonalDetailsPageObject;

public class Admin_01_Job_Title extends BaseTest {
    WebDriver driver;
    private LoginPageObject loginPage;
    private DashboardPageObject dashboardPage;
    private UserManagementPageObject userManagementPage;
    private JobTitlePageObject jobTitlePage;
    private EditJobPageObject editJobPage;
    private EmployeeListPageObject employeeListPage;
    private PersonalDetailsPageObject personalDetailsPage;
    private JobPageObject jobPage;
    private String jobTitle, employeeID;

    @Parameters ({"browser", "url"})
    @BeforeClass
    public void beforeClass(String browserName, String url){
        jobTitle = "Tester" + getRandom();
        employeeID = "0046";
        driver = getBrowserDriver(browserName, url);
        loginPage = PageGenerator.getLoginPage(driver);

        loginPage.enterToTextBoxByName("username", GlobalConstant.ADMIN_ID);
        loginPage.enterToTextBoxByName("password", GlobalConstant.ADMIN_PASSWORD);

        loginPage.clickToButtonByText("Login");
        loginPage.waitSpinnerIconInvisible();
        dashboardPage = PageGenerator.getDashboardPageObject(driver);

        dashboardPage.openModuleByText("Admin");
        dashboardPage.waitSpinnerIconInvisible();
        userManagementPage = PageGenerator.getUserManagementPage(driver);
        userManagementPage.clickToTopBarDropdownByText("Job", "Job Titles");
        jobTitlePage = PageGenerator.getJobTitlePage(driver);
        jobTitlePage.waitSpinnerIconInvisible();
    }

    @Test
    public void TC_01_Admin_Add_Job_Title_With_Empty_Data(){
        jobTitlePage.clickToAddButtonByLabel("Job Titles");
        editJobPage = PageGenerator.getEditJobPage(driver);

        editJobPage.clickToSaveButton();

        Assert.assertEquals(editJobPage.getErrorMsg("Job Title"), "Required");
    }


    @Test
    public void TC_02_Admin_Add_Job_Title(){
//        editJobPage = PageGenerator.getEditJobPage(driver);
//        editJobPage.clickToTopBarDropdownByText("Job", "Job Titles");
//        jobTitlePage.clickToAddButtonByLabel("Job Titles");
//        editJobPage = PageGenerator.getEditJobPage(driver);

        editJobPage.enterToJobTitleTextbox(jobTitle);

        editJobPage.clickToSaveButton();
        editJobPage.isSucessMessageByText("Successfully Saved");
        editJobPage.waitSpinnerIconInvisible();

        editJobPage.openModuleByText("PIM");
        employeeListPage = PageGenerator.getEmployeeListPageObject(driver);
        employeeListPage.waitSpinnerIconInvisible();

        employeeListPage.entertoTextBoxToSearch("Employee Id", employeeID);
        employeeListPage.clickToButtonByText("Search");
        employeeListPage.waitSpinnerIconInvisible();

        personalDetailsPage = employeeListPage.clickToEditButtonByEmployeeId(employeeID);

        personalDetailsPage.clickToEmployeeNavigationByLabel("Job");
        jobPage = PageGenerator.getJobPage(driver);
        jobPage.waitSpinnerIconInvisible();

        jobPage.selectJobTitleDropdown(jobTitle);

        jobPage.clickToButtonByText("Save");
        jobPage.isSucessMessageByText("Successfully Updated");
        jobPage.waitSpinnerIconInvisible();

        jobPage.openModuleByText("Admin");
        userManagementPage = PageGenerator.getUserManagementPage(driver);
        userManagementPage.waitSpinnerIconInvisible();

        userManagementPage.clickToTopBarDropdownByText("Job","Job Titles");
        jobTitlePage = PageGenerator.getJobTitlePage(driver);
        jobTitlePage.waitSpinnerIconInvisible();
    }

    @Test
    public void TC_03_Admin_Add_Job_Title_With_Existing_Data(){
        jobTitlePage.clickToAddButtonByLabel("Job Titles");
        editJobPage = PageGenerator.getEditJobPage(driver);

        editJobPage.enterToJobTitleTextbox(jobTitle);
        Assert.assertEquals(editJobPage.getErrorMsg("Job Title"), "Already exists");

        editJobPage.clickToButtonByText("Cancel");
        jobTitlePage = PageGenerator.getJobTitlePage(driver);
        jobTitlePage.waitSpinnerIconInvisible();
    }


    @Test
    public void TC_04_Admin_Edit_Job_Title(){
        editJobPage = jobTitlePage.clickToEditButtonByJobTitles(jobTitle);
        editJobPage.waitSpinnerIconInvisible();

        editJobPage.enterToJobDescriptionTextarea("Job is hard" + jobTitle);
        editJobPage.clickToSaveButton();
        editJobPage.waitSpinnerIconInvisible();

        jobTitlePage = PageGenerator.getJobTitlePage(driver);
        jobTitlePage.waitSpinnerIconInvisible();

        Assert.assertEquals(jobTitlePage.getDescriptionText(jobTitle), "Job is hard" + jobTitle);
    }

    @Test
    public void TC_05_Admin_Delete_Job_Title(){
        jobTitlePage.clicklToDeleteButtonByJobTitles(jobTitle);
        jobTitlePage.clickToYesDeletePopUp();

        jobTitlePage.isSucessMessageByText("Successfully Deleted");
        jobTitlePage.waitSpinnerIconInvisible();

        editJobPage.openModuleByText("PIM");
        employeeListPage = PageGenerator.getEmployeeListPageObject(driver);

        employeeListPage.entertoTextBoxToSearch("Employee Id", employeeID);
        employeeListPage.clickToButtonByText("Search");
        employeeListPage.waitSpinnerIconInvisible();

        personalDetailsPage = employeeListPage.clickToEditButtonByEmployeeId(employeeID);

        personalDetailsPage.clickToEmployeeNavigationByLabel("Job");
        jobPage = PageGenerator.getJobPage(driver);

        //Assert.assertEquals(jobPage.getSelectedJobInDropdown(), jobTitle + " (Deleted)");
    }

    @AfterClass
    public void afterClass(){
    }
}
