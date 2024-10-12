package com.orangehrm.pim;

import commons.BaseTest;
import commons.GlobalConstant;
import commons.PageGenerator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v85.page.Page;
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
    private String employeeID, firstName, lastName;

    @Parameters ({"url","browser"})
    @BeforeClass
    public void beforeClass(String url, String browserName){
        driver = getBrowserDriver(browserName, url);
        loginPage = PageGenerator.getLoginPage(driver);

        loginPage.enterToTextBoxByName("username", GlobalConstant.ADMIN_ID);
        loginPage.enterToTextBoxByName("password", GlobalConstant.ADMIN_PASSWORD);

        loginPage.clickToButtonByText("Login");
        loginPage.waitSpinnerIconInvisible();
        dashboardPage = PageGenerator.getDashboardPageObject(driver);

        dashboardPage.openModuleByText("PIM");
        dashboardPage.waitSpinnerIconInvisible();
        employeeListPage = PageGenerator.getEmployeeListPageObject(driver);
    }

    @Test
    public void Employee_01_Add_New(){

        employeeListPage.clickToButtonByText("Add");
        employeeListPage.waitSpinnerIconInvisible();
        addEmployeePage = PageGenerator.getAddEmployeePageObject(driver);

        firstName = "Tung";
        lastName = "Anh";

        addEmployeePage.enterToTextBoxByName("firstName", firstName);
        addEmployeePage.enterToTextBoxByName("lastName", lastName);
        employeeID = addEmployeePage.getEmployeeID("value");
        System.out.println(employeeID);

        addEmployeePage.clickToButtonByText("Save");
        Assert.assertTrue(addEmployeePage.isSucessMessageByText("Successfully Saved"));
        addEmployeePage.waitSpinnerIconInvisible();

        personalDetailsPage = PageGenerator.getPersonalDetailsPageObject(driver);

        addEmployeePage.waitSpinnerIconInvisible();
        Assert.assertEquals(personalDetailsPage.getTextBoxValueByName("firstName", "value"), firstName);
        Assert.assertEquals(personalDetailsPage.getTextBoxValueByName("lastName", "value"), lastName);
        Assert.assertEquals(personalDetailsPage.getEmployeeID("value"), employeeID);

        personalDetailsPage.clickToTopBarButtonByText("Employee List");
        personalDetailsPage.waitSpinnerIconInvisible();
        employeeListPage = PageGenerator.getEmployeeListPageObject(driver);

        employeeListPage.entertoTextBoxToSearch("Employee Id", employeeID);
        employeeListPage.clickToButtonByText("Search");
        employeeListPage.waitSpinnerIconInvisible();

        Assert.assertEquals(employeeListPage.isValueDisplayedAtColumnName("Id"), employeeID);
        Assert.assertEquals(employeeListPage.isValueDisplayedAtColumnName("First (& Middle) Name"),firstName);
        Assert.assertEquals(employeeListPage.isValueDisplayedAtColumnName("Last Name"),lastName);
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
