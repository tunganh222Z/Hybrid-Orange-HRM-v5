package com.orangehrm.pim;

import commons.BaseTest;
import commons.GlobalConstant;
import commons.PageGenerator;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObjects.*;

public class PIM_01_Employee extends BaseTest {
    private static final Logger log = LoggerFactory.getLogger(PIM_01_Employee.class);
    private WebDriver driver;
    private LoginPageObject loginPage;
    private DashboardPageObject dashboardPage;
    private EmployeeListPageObject employeeListPage;
    private AddEmployeePageObject addEmployeePage;
    private PersonalDetailsPageObject personalDetailsPage;
    private String employeeID;

    @Parameters ({"url","browser"})
    @BeforeClass
    public void beforeClass(String url, String browserName){
        driver = getBrowserDriver(browserName, url);
        loginPage = PageGenerator.getLoginPage(driver);

        loginPage.enterToTextBoxByName("username", GlobalConstant.ADMIN_ID);
        loginPage.enterToTextBoxByName("password", GlobalConstant.ADMIN_PASSWORD);

        dashboardPage = loginPage.clickToLoginButton();

        dashboardPage.openModuleByText("PIM");
        addEmployeePage = PageGenerator.getAddEmployeePageObject(driver);
    }

    @Test
    public void Employee_01_Add_New(){

        addEmployeePage = employeeListPage.clickToAddEmployeeButton();

        addEmployeePage.enterToTextBoxByName("firstname", "vanAmy");
        addEmployeePage.enterToTextBoxByName("lastname", "tunganh");
        employeeID = addEmployeePage.getEmployeeID("value");

        addEmployeePage.clickToButtonByText("Save");
        addEmployeePage.isSucessSavedMessageDisplayed();
        ////p[contains(@class,'oxd-text--toast-message') and text()='Successfully Saved']
        personalDetailsPage = PageGenerator.getPersonalDetailsPageObject(driver);

        Assert.assertEquals(personalDetailsPage.getFirstNameValue(), "");
        Assert.assertEquals(personalDetailsPage.getLastNameValue(), "");
        Assert.assertEquals(personalDetailsPage.getEmployeeValue(), "");

        personalDetailsPage.clickToTopBarButtonByText();
        employeeListPage = PageGenerator.getEmployeeListPageObject(driver);

        Assert.assertTrue(employeeListPage.isValueDisplayedAtColumnName("Id", employeeID));
        Assert.assertTrue(employeeListPage.isValueDisplayedAtColumnName(("First (& Middle) Name"),""));
        Assert.assertTrue(employeeListPage.isValueDisplayedAtColumnName(("Last Name"),""));
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
