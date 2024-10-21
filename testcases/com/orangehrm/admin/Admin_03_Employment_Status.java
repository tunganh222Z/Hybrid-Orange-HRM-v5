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
import pageObjects.admin.UserManagementPageObject;
import pageObjects.admin.employmentStatus.AddEmploymentStatusPageObject;
import pageObjects.admin.employmentStatus.EditEmploymentStatusPageObject;
import pageObjects.admin.employmentStatus.EmploymentStatusPageObject;
import pageObjects.dashboard.DashboardPageObject;

public class Admin_03_Employment_Status extends BaseTest {
    WebDriver driver;
    private LoginPageObject loginPage;
    private DashboardPageObject dashboardPage;
    private UserManagementPageObject userManagementPage;
    private EmploymentStatusPageObject employmentStatusPage;
    private AddEmploymentStatusPageObject addEmploymentStatusPage;
    private EditEmploymentStatusPageObject editEmploymentStatusPage;


    @Parameters ({"browser","url"})
    @BeforeClass
    public void beforeClass(String browserName, String url){
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
        userManagementPage.clickToTopBarDropdownByText("Job", "Employment Status");

        employmentStatusPage = PageGenerator.getEmploymentStatusPage(driver);
        employmentStatusPage.waitSpinnerIconInvisible();

        employmentStatusPage.clickToAddButtonByLabel("");
        addEmploymentStatusPage = PageGenerator.getAddEmploymentStatusPage(driver);
    }

    @Test
    public void TC_01_Admin_Employment_Status_With_Empty_Data(){


        addEmploymentStatusPage.enterToNameTextbox("");

        addEmploymentStatusPage.clickToButtonByText("Save");

        Assert.assertEquals(addEmploymentStatusPage.getErrorMsg("Name"), "");
    }

    @Test
    public void TC_02_Admin_Employment_Status_With_Valid_Data(){
        addEmploymentStatusPage.enterToNameTextbox("");

        addEmploymentStatusPage.clickToButtonByText("Save");

        addEmploymentStatusPage.isSucessMessageByText("Successfully Saved");
        addEmploymentStatusPage.waitSpinnerIconInvisible();

        employmentStatusPage = PageGenerator.getEmploymentStatusPage(driver);
        employmentStatusPage.waitSpinnerIconInvisible();

    }

    @AfterClass
    public void afterClass(){

    }
}
