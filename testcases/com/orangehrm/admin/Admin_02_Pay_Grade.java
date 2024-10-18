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
import pageObjects.admin.AddPayGradePageObject;
import pageObjects.admin.PayGradesPageObject;
import pageObjects.admin.UserManagementPageObject;
import pageObjects.dashboard.DashboardPageObject;

public class Admin_02_Pay_Grade extends BaseTest {
    WebDriver driver;
    private LoginPageObject loginPage;
    private DashboardPageObject dashboardPage;
    private UserManagementPageObject userManagementPage;
    private PayGradesPageObject payGradesPage;
    private AddPayGradePageObject addPayGrade;

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
        userManagementPage.clickToTopBarDropdownByText("Job", "Pay Grades");
        payGradesPage = PageGenerator.getPayGradesPage(driver);
    }

    @Test
    public void TC_01_Admin_Add_PayGrade_With_Empty_Data(){

        payGradesPage.waitSpinnerIconInvisible();

        payGradesPage.clickToAddButtonByLabel("Pay Grades");

        addPayGrade = PageGenerator.getAddPayGradePage(driver);
        addPayGrade.clickToButtonByText("Save");

        Assert.assertEquals(addPayGrade.getErrorMsg(), "");
    }

    @Test
    public void TC_02_Admin_Add_PayGrade_With_Empty_Data(){
        addPayGrade = PageGenerator.getAddPayGradePage(driver);

        addPayGrade.enterToNameTextbox();

        addPayGrade.clickToButtonByText("Save");

        addPayGrade.isSucessMessageByText("Successfully Saved");
        addPayGrade.waitSpinnerIconInvisible();

        addPayGrade.clickToAddButtonByLabel("Currencies");

        addPayGrade.selectCurrencyDropdown("");
        addPayGrade.enterToMiniSalary("");
        addPayGrade.enterToMaximumSalary("");

        addPayGrade.clickToSaveButtonAddCurrency();
        addPayGrade.waitSpinnerIconInvisible();
        addPayGrade.isSucessMessageByText("Successfully Saved");



    }

    @AfterClass
    public void afterClass(){

    }
}
