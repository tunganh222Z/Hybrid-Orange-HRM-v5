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
    private ContactDetailsPageObject contactDetailsPage;
    private String employeeID, firstName, lastName, driverLicenseNumber, licenseEXPDate, dateOfBirth, maritalStatus, nationality, gender;
    private String street1, street2, city, stateProvince, zipPostalCode, home, mobile, work, workEmail, otherEmail, country;

    @Parameters ({"url","browser"})
    @BeforeClass
    public void beforeClass(String url, String browserName){
        driver = getBrowserDriver(browserName, url);
        firstName = "Tung";
        lastName = "Anh";
        driverLicenseNumber ="DL123486784";
        licenseEXPDate ="2025-10-20";
        dateOfBirth ="1997-09-09";
        maritalStatus ="Married";
        nationality ="Vietnamese";
        gender ="Male";
        street1 ="Ha Dong island";
        street2 ="Xa la Ha Dong";
        city ="Ha Dong";
        stateProvince ="Ha Noi";
        zipPostalCode ="PS0198387";
        home = "Mau luong provip";
        mobile = "07373294902";
        work = "timecity central";
        workEmail = "workEmail@gmail.com";
        otherEmail = "otherEmail@gmail.com";
        country = "Viet Nam";

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

        addEmployeePage.enterToTextBoxByName("firstName", firstName);
        addEmployeePage.enterToTextBoxByName("lastName", lastName);
        employeeID = addEmployeePage.getEmployeeID("value");

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
        personalDetailsPage = employeeListPage.clickToEditButtonByEmployeeId(employeeID);

        Assert.assertEquals(personalDetailsPage.getTextBoxValueByName("firstName", "value"), firstName);
        Assert.assertEquals(personalDetailsPage.getTextBoxValueByName("lastName", "value"), lastName);
        Assert.assertEquals(personalDetailsPage.getEmployeeID("value"), employeeID);


        personalDetailsPage.enterToLicenseNumberTextbox(driverLicenseNumber);

        personalDetailsPage.enterToDatePickerByLabel("License Expiry Date", licenseEXPDate);

        personalDetailsPage.selectDropdownByLabel("Nationality", nationality);

        personalDetailsPage.selectDropdownByLabel("Marital Status",maritalStatus);

        personalDetailsPage.enterToDatePickerByLabel("Date of Birth", dateOfBirth);

        personalDetailsPage.clickToRadioButtonByLabel(gender);

        personalDetailsPage.clickToButtonByText("Save");

        Assert.assertTrue(addEmployeePage.isSucessMessageByText("Successfully Updated"));
        personalDetailsPage.waitSpinnerIconInvisible();
        personalDetailsPage.clickToEmployeeNavigationByLabel("Contact Details");
        contactDetailsPage = PageGenerator.getContactDetailsPageObject(driver);
        contactDetailsPage.waitSpinnerIconInvisible();

    }

    @Test
    public void Employee_03_Contact_Details(){

        contactDetailsPage.enterToStreet1Textbox(street1);

        contactDetailsPage.enterToStreet2Textbox(street2);

        contactDetailsPage.enterToCityTextbox(city);

        contactDetailsPage.enterToStateProvinceTextbox(stateProvince);

        contactDetailsPage.enterToZipPostalCodeTextbox(zipPostalCode);

        contactDetailsPage.selectCountryDropdown(nationality);

        contactDetailsPage.enterToHomeTextbox(home);

        contactDetailsPage.enterToMobileTextbox(mobile);

        contactDetailsPage.enterToWorkTextbox(work);

        contactDetailsPage.enterToEmailWorkTextbox(workEmail);

        contactDetailsPage.enterToOtherEmailTextbox(otherEmail);

        contactDetailsPage.clickToButtonByText("Save");
        Assert.assertTrue(addEmployeePage.isSucessMessageByText("Successfully Updated"));
        addEmployeePage.waitSpinnerIconInvisible();

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
