package common;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Utility extends BasePage {

    public static long implicitWait = 50;
    public static long webDriverWait = 2000;
//    public static WebDriverWait wait = new WebDriverWait(driver, 30);


    public static void ScrollUpToVersion() {
        MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".scrollIntoView(new UiSelector().text(\"" + prop.getProperty("appVersion") + "\"))"));
    }

    public static void Scroll(String Text) {
        MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".scrollIntoView(new UiSelector().text(\"" + Text + "\"))"));
    }

    public static void waitForElementVisible(WebElement webEle) {
        try {
            wait.until(ExpectedConditions.visibilityOf(webEle));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void clickElement(WebElement element) {
        try {
            element.click();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void doubleBackNavigation(WebElement element) {
        try {
            int i;
            for (i = 0; i <= 1; i++) {
                Thread.sleep(2000);
                waitForElementVisible(element);
                clickElement(element);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void singleBackNavigation(WebElement element) {
        try {
            waitForElementVisible(element);
            clickElement(element);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
