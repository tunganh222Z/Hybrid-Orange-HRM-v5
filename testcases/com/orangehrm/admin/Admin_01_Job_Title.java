package com.orangehrm.admin;

import commons.BaseTest;
import commons.GlobalConstant;
import commons.PageGenerator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObjects.LoginPageObject;
import pageObjects.admin.EditJobPageObject;
import pageObjects.admin.JobTitlePageObject;
import pageObjects.admin.UserManagementPageObject;
import pageObjects.dashboard.DashboardPageObject;

public class Admin_01_Job_Title extends BaseTest {
    WebDriver driver;
    private LoginPageObject loginPage;
    private DashboardPageObject dashboardPage;
    private UserManagementPageObject userManagementPage;
    private JobTitlePageObject jobTitlePage;
    private EditJobPageObject editJobPage;

    @Parameters ({"browser", "url"})
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

    }

    @Test
    public void Admin_Job_Title_(){
        userManagementPage.clickToTopBarDropdownByText();
        jobTitlePage = PageGenerator.getJobTitlePage(driver);
        jobTitlePage.waitSpinnerIconInvisible();
    }

    @Test
    public void Admin_Job_Title_(){

    }

    @Test
    public void Admin_Job_Title_(){

    }

    @Test
    public void Admin_Job_Title_(){

    }

    @AfterClass
    public void afterClass(){

    }
}
