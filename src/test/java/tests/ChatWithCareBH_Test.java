package tests;

import common.BasePage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page_objects.ChatWithCareBH_PageObjects;
import page_objects.LoginCheckBH_PageObjects;

import java.io.IOException;
import java.lang.reflect.Method;

import static utils.extentreports.ExtentTestManager.startTest;

public class ChatWithCareBH_Test extends BasePage {
    ChatWithCareBH_PageObjects chatChk;
    LoginCheckBH_PageObjects loginChk;

    @BeforeMethod
    public void setUp() throws IOException {
        initialization();
       // loginChk = new LoginCheckBH_PageObjects();
        chatChk = new ChatWithCareBH_PageObjects();
    }

   @Test(priority = 1)
    public void chatEnableFieldTest(Method method) {
        startTest(method.getName(), "This test is for Chat option is enabled.");
        chatChk.clickOnFirstLogIn();
        chatChk.provideValidLoginCredentials();
        chatChk.clickOnChatBubbleandGotoTechSupport();
        chatChk.checkChatFieldEnable();
        chatChk.clickOnResources();
        chatChk.clickOnLogOut();
    }

    @Test(priority = 2)
    public void chatTextSendFieldTest(Method method){
        startTest(method.getName(), "This test is for Chat option and send text.");
        chatChk.clickOnFirstLogIn();
        chatChk.provideValidLoginCredentials();
        chatChk.clickOnChatBubbleandGotoTechSupport();
        chatChk.checkChatTextSend();
        chatChk.clickOnResources();
        chatChk.clickOnLogOut();
    }
    @AfterMethod
    public void tearDown() {
        closeDriver();
    }
}



