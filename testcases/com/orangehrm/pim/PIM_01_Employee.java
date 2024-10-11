package com.orangehrm.pim;

import commons.BaseTest;
import commons.PageGenerator;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObjects.DashboardPageObject;
import pageObjects.LoginPageObject;

public class PIM_01_Employee extends BaseTest {
    private static final Logger log = LoggerFactory.getLogger(PIM_01_Employee.class);
    private WebDriver driver;
    private LoginPageObject loginPage;
    private DashboardPageObject dashboardPage;

    @Parameters ({"url","browser"})
    @BeforeClass
    public void beforeClass(String url, String browserName){
        driver = getBrowserDriver(browserName, url);
        loginPage = PageGenerator.getLoginPage(driver);
    }

    @Test
    public void Employee_01_Add_New(){
        dashboardPage = loginPage.clickToLoginButton();
    }

    @Test
    public void Employee_02_Personal_Details(){

    }

    @Test
    public void Employee_03_Contact_Details(){

    }

    @Test
    public void Employee_04_Emergency_Contacts(){

    }

    @Test
    public void Employee_05_Dependents(){

    }

    @Test
    public void Employee_06_Immigration(){

    }

    @Test
    public void Employee_07_Job(){

    }

    @Test
    public void Employee_08_Salary(){

    }

    @Test
    public void Employee_09_Report(){

    }

    @Test
    public void Employee_10_Qualification(){

    }

    @AfterClass
    public void afterClass(){

    }
}
