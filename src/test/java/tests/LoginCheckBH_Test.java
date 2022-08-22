package tests;

import common.BasePage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page_objects.LoginCheckBH_PageObjects;

import java.io.IOException;
import java.lang.reflect.Method;

import static utils.extentreports.ExtentTestManager.startTest;

public class LoginCheckBH_Test extends BasePage {

    LoginCheckBH_PageObjects loginChk;

    @BeforeMethod
    public void setUp() throws IOException {
        initialization();
        loginChk = new LoginCheckBH_PageObjects();
    }

    @Test(priority = 1)
    public void InvalidLoginCredentialsTest(Method method){
        startTest(method.getName(), "This test is to verify invalid login credentials.");
        loginChk.clickOnFirstLogIn();
        loginChk.provideInvalidLoginCredentials();
    }

    @Test(priority = 2)
    public void loginAndLogoutTest(Method method){
        startTest(method.getName(), "This test is to view all of my information in the app and log out of the app.");
        loginChk.clickOnFirstLogIn();
        loginChk.provideValidLoginCredentials();
        loginChk.clickOnResources();
        loginChk.clickOnLogOut();
    }

    @Test(priority = 3)
    public void myInfoTest(Method method){
        startTest(method.getName(), "This test is to view all of my information in the app and log out of the app.");
        loginChk.clickOnFirstLogIn();
        loginChk.provideValidLoginCredentials();
        loginChk.clickOnResources();
        loginChk.verifyMyInfo();
        loginChk.clickOnResources();
        loginChk.clickOnLogOut();
    }

    @Test(priority = 4)
    public void exampleFailedTest(Method method){
        startTest(method.getName(), "This test is to verify invalid login credentials.");
        loginChk.clickOnFirstLogIn();
        loginChk.failForExample();
    }

    @AfterMethod
    public void tearDown()
    {
        closeDriver();
    }
}
