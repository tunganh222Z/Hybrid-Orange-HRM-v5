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
import pageObjects.admin.payGrades.AddPayGradePageObject;
import pageObjects.admin.payGrades.EditPayGradePageObject;
import pageObjects.admin.payGrades.PayGradesPageObject;
import pageObjects.admin.UserManagementPageObject;
import pageObjects.dashboard.DashboardPageObject;
import pageObjects.pim.EmployeeListPageObject;
import pageObjects.pim.PersonalDetailsPageObject;
import pageObjects.pim.SalaryPageObject;

public class Admin_02_Pay_Grade extends BaseTest {
    WebDriver driver;
    private LoginPageObject loginPage;
    private DashboardPageObject dashboardPage;
    private UserManagementPageObject userManagementPage;
    private PayGradesPageObject payGradesPage;
    private AddPayGradePageObject addPayGrade;
    private EmployeeListPageObject employeeListPage;
    private PersonalDetailsPageObject personalDetailsPage;
    private SalaryPageObject salaryPage;
    private EditPayGradePageObject editPayGradePage;
    private String minSalary, maximumSalary;

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

        Assert.assertEquals(addPayGrade.getErrorMsg("Name"), "Required");
    }

    @Test
    public void TC_02_Admin_Add_PayGrade_With_Valid_Data(){
        addPayGrade = PageGenerator.getAddPayGradePage(driver);

        addPayGrade.enterToNameTextbox("");

        addPayGrade.clickToButtonByText("Save");
        addPayGrade.isSucessMessageByText("Successfully Saved");
        addPayGrade.waitSpinnerIconInvisible();

        editPayGradePage = PageGenerator.getEditPayGradePage(driver);
        editPayGradePage.waitSpinnerIconInvisible();
    }

    @Test
    public void TC_03_Admin_Add_PayGrade_Add_Currencies(){
        editPayGradePage.clickToAddButtonByLabel("Currencies");

        editPayGradePage.selectCurrencyDropdown("");
        editPayGradePage.enterToMinimumSalary("");
        editPayGradePage.enterToMaximumSalary("");

        editPayGradePage.clickToSaveButtonAddCurrency();
        editPayGradePage.waitSpinnerIconInvisible();
        editPayGradePage.isSucessMessageByText("Successfully Saved");

        editPayGradePage.openModuleByText("PIM");
        employeeListPage = PageGenerator.getEmployeeListPageObject(driver);
        employeeListPage.waitSpinnerIconInvisible();
    }

    @Test
    public void TC_04_Admin_Select_PayGrade(){
        employeeListPage.entertoTextBoxToSearch("", "");

        employeeListPage.clickToButtonByText("");
        employeeListPage.waitSpinnerIconInvisible();

        employeeListPage.clickToEditButtonByEmployeeId("");
        personalDetailsPage = PageGenerator.getPersonalDetailsPageObject(driver);
        personalDetailsPage.waitSpinnerIconInvisible();

        personalDetailsPage.clickToEmployeeNavigationByLabel("Salary");
        salaryPage = PageGenerator.getSalaryPage(driver);
        salaryPage.waitSpinnerIconInvisible();

        salaryPage.clickToAddButtonByLabel("");

        salaryPage.selectPayGradeDropdown("");
        salaryPage.waitSpinnerIconInvisible();

        salaryPage.enterToSalaryComponentTextbox("");

        salaryPage.selectCurrencyDropdown("");
        Assert.assertEquals(salaryPage.getMinMaxAmountText(), "Min: " + minSalary +" - Max: " + maximumSalary);

        salaryPage.enterToAmountTextbox("");

        salaryPage.clickToButtonByText("Save");

        salaryPage.isSucessMessageByText("Successfully Saved");

        salaryPage.waitSpinnerIconInvisible();

        salaryPage.openModuleByText("Admin");
        userManagementPage = PageGenerator.getUserManagementPage(driver);
    }

    @Test
    public void TC_05_Admin_PayGrade_Edit_PayGrade(){
        userManagementPage.clickToTopBarDropdownByText("Job", "Pay Grades");
        payGradesPage.clickToEditButtonByName("");

        editPayGradePage.enterToPayGradeName("");

        editPayGradePage.clickToButtonByText("Save");
        editPayGradePage.isSucessMessageByText("Successfully Saved");
        editPayGradePage.waitSpinnerIconInvisible();

        editPayGradePage.clickToButtonByText("Cancel");
        payGradesPage = PageGenerator.getPayGradesPage(driver);
    }

    @Test
    public void TC_06_Admin_PayGrade_Delete_PayGrade(){
        payGradesPage.clickToDeleteButtonByName("");

        payGradesPage.clickToYesDeletePopUp();

        payGradesPage.isPayGradeDeleted("");
    }

    @AfterClass
    public void afterClass(){

    }
}
