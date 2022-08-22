package common;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.logs.Log;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

import static java.util.concurrent.TimeUnit.SECONDS;

public class BasePage {

    public static Properties prop;
    public static WebDriverWait wait;
    public static AndroidDriver<AndroidElement> driver;
    public static String realDevice;
    public static String flag;


    public BasePage(){ }

    public void initialization() throws IOException {
        prop = new Properties();
        FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "/src/test/resources" + "/android.properties");
        prop.load(ip);
        String device = prop.getProperty("whichDevice");

        if (device.equals("Android")) {
            flag = "Android";
            try {
                DesiredCapabilities cap = new DesiredCapabilities();
                cap.setCapability("deviceName", prop.getProperty("deviceName"));
                cap.setCapability("udid", prop.getProperty("udid"));
                cap.setCapability("platformName", prop.getProperty("platformName"));
                cap.setCapability("platformVersion", prop.getProperty("platformVersion"));
                cap.setCapability("appPackage", prop.getProperty("appPackage"));
                cap.setCapability("appActivity", prop.getProperty("appActivity"));
                cap.setCapability("autoGrantPermissions", true);
                cap.setCapability("automationName", "UiAutomator2");

                URL url = new URL("http://0.0.0.0:4723/wd/hub");
                driver = new AndroidDriver<AndroidElement>(url, cap);

                realDevice = prop.getProperty("realdevice");
                Log.info("Bicycle Health Application started.....");
                Thread.sleep(3000);
            } catch (Exception e) {
                System.out.println("Exception occurred.....");
                e.printStackTrace();
            }

            driver.manage().timeouts().implicitlyWait(Utility.implicitWait, SECONDS);
            wait = new WebDriverWait(driver, Utility.webDriverWait);

        }
    }

    protected void closeDriver(){
        if(driver!= null) {
            assert driver != null;
            driver.quit();
        }
    }
}
