package page_objects;

import common.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.logs.Log;

import static common.Utility.*;

public class ChatWithCareBH_PageObjects extends BasePage {

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.TextView")
    public WebElement logInBTN_01;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText[1]")
    public WebElement phoneInputTextField;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText[2]")
    public WebElement passwordInputTextField;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]")
    public WebElement logInBTN_02;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.Button[4]/android.view.ViewGroup")
    public WebElement resourcesBTN;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView")
    public WebElement logOutBTN;

    //    @FindBy(className = "android.widget.ScrollView")
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView")
    public WebElement chatBubble;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.TextView[1]")
    public WebElement techSupport;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout[5]/android.widget.RelativeLayout/android.widget.TextView[1]")
    public WebElement suppportGroup;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.EditText")
    public WebElement chatEnableField;

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc='Navigate up']")
    public WebElement backArrow;

    // xpath //android.widget.ImageView[@content-desc="Send message"]
      @FindBy(id = "com.bicyclehealth.patient.app:id/freshchat_conv_detail_send_reply_button")
      public WebElement sendBtn;

    public ChatWithCareBH_PageObjects() {
        PageFactory.initElements(driver, this);
    }

    public void clickOnFirstLogIn() {
        try {
            waitForElementVisible(logInBTN_01);
            clickElement(logInBTN_01);
            Log.info("Clicked on first Login button.");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public void provideValidLoginCredentials() {
        try {
            waitForElementVisible(phoneInputTextField);
            phoneInputTextField.sendKeys(prop.getProperty("correctPhone"));
            waitForElementVisible(passwordInputTextField);
            passwordInputTextField.sendKeys(prop.getProperty("correctPassword"));
            waitForElementVisible(logInBTN_02);
            clickElement(logInBTN_02);
            Log.info("Provided valid login credentials and clicked on Login.");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public void clickOnChatBubbleandGotoTechSupport() {
        try {
            waitForElementVisible(chatBubble);
            clickElement(chatBubble);
            Log.info("Clicked on Chat Bubble.");
            waitForElementVisible(techSupport);
            clickElement(techSupport);
            Log.info("Clicked on Tech Support button.");
//            Thread.sleep(3000);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void checkChatFieldEnable() {
        try {
            waitForElementVisible(chatEnableField);
            clickElement(chatEnableField);
            chatEnableField.sendKeys("Hello, this is test chat....");
            Thread.sleep(3000);
            chatEnableField.clear();
            Thread.sleep(2000);
            Log.info("Clicked and entered data in to chat field and clear.");
            doubleBackNavigation(backArrow);
            Log.info("Clicked on back arrow.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
     public void checkChatTextSend(){
        try{
            waitForElementVisible(chatEnableField);
            clickElement(chatEnableField);
            chatEnableField.sendKeys("Hello, this is test chat....");
            waitForElementVisible(sendBtn);
            clickElement(sendBtn);
            Thread.sleep(2000);
            Log.info("Clicked and entered data in to chat field ");
            doubleBackNavigation(backArrow);
            Log.info("Clicked on back arrow.");
        }catch (Exception e){
            e.printStackTrace();
     }

}

    public void clickOnResources() {
        try {
            waitForElementVisible(resourcesBTN);
            clickElement(resourcesBTN);
            Log.info("Clicked on Resources.");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public void clickOnLogOut() {
        try {
            waitForElementVisible(logOutBTN);
            clickElement(logOutBTN);
            Log.info("Clicked on Logout.");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

}