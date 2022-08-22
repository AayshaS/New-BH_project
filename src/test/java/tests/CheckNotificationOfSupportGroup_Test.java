package tests;

import common.BasePage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page_objects.CheckNotificationOfSupportGroup_PageObjects;
import page_objects.LoginCheckBH_PageObjects;

import java.io.IOException;
import java.lang.reflect.Method;

import static utils.extentreports.ExtentTestManager.startTest;

public class CheckNotificationOfSupportGroup_Test extends BasePage {
    LoginCheckBH_PageObjects loginChk;
    CheckNotificationOfSupportGroup_PageObjects notificationChk;

    @BeforeMethod
    public void setUp() throws IOException {
        initialization();
        //loginChk =new LoginCheckBH_PageObjects();
        notificationChk = new CheckNotificationOfSupportGroup_PageObjects();
    }
    @Test(priority = 1)
    public void checkPermissionToggleOff(Method method) {
        startTest(method.getName(), "This test is to check Toggle option.");
        notificationChk.clickOnFirstLogIn();
        notificationChk.provideValidLoginCredentials();
        notificationChk.clickOnResources();
        notificationChk.clickOnpermissonAndSetting();
        notificationChk.clickOnResources();
        notificationChk.clickOnLogOut();

    }

    @AfterMethod
    public void tearDown()
    {
        closeDriver();
    }
}
