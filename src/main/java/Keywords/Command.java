package Keywords;

import CoreLayer.StarClass;
import BasePackage.Selector;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class Command extends StarClass {

    // Click
    public static void Click(Selector type, String value) throws Exception {
        FindElementMobileBy(type, value).click();
    }

    public static void SendKeys(Selector type, String value, String Text) throws Exception {
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
        FindElement(type, value).sendKeys(Text);
    }

    // SelectOptionIndex
    public static void SelectOptionIndex(Selector type, String value, int index) throws Exception {

        new Select(FindElement(type, value)).selectByIndex(index);
    }

    // SelectOptionValue
    public static void SelectOptionValue(Selector type, String value, String ItemValue) throws Exception {

        new Select(FindElement(type, value)).selectByValue(ItemValue);
    }

    // Element is Displayed
    public static void isDisplayed(Selector type, String value) throws Exception {

        FindElement(type, value).isDisplayed();
    }

    // Wait Element To Be Clickable
    public static void WaitElementToBeClickable(Selector type, String value) throws Exception {

        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(FindElement(type, value)));

    }

    // Wait Element To Be Clickable
    public static void WaitElementToBeClickableMobileBy(Selector type, String value) throws Exception {

        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(FindElementMobileBy(type, value)));

    }


    // Wait Element Not Visible
    public static void WaitElementNotVisible(Selector type, String value) throws Exception {

        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.invisibilityOf(FindElement(type, value)));
    }

    // ClearInput
    public static void ClearInput(Selector type, String value) throws Exception {

        FindElement(type, value).clear();
    }

    // Get Text
    public static String GetText(Selector type, String value) throws Exception {

        return FindElement(type, value).getText();
    }

    // GetAttribute
    public static String GetAttribute(Selector type, String value, String AttributeName) throws Exception {

        return FindElement(type, value).getAttribute(AttributeName);
    }

    // Dropdown Selected Option Get Text
    public static String SelectedOptionGetText(Selector type, String value) throws Exception {

        new Select(FindElement(type, value)).getFirstSelectedOption().getText();
        return value;
    }

    // Thread Sleep 1 Seconds
    public static void ThreadSleep1Seconds() throws Exception {

        Thread.sleep(1 * 1000);
    }

    // Thread Sleep 5 Seconds
    public static void ThreadSleep5Seconds() throws Exception {

        Thread.sleep(5 * 1000);
    }

    // Thread Sleep 10 Seconds
    public static void ThreadSleep10Seconds() throws Exception {

        Thread.sleep(10 * 1000);
    }

    // Wait Page Load
    public static void PageLoad() {

        driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.MINUTES);
    }

    // implicitly Wait
    public static void ImplicitlyWait() {

        driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
    }

    // Assert Equals
    public static void AssertEquals(String value1, String value2) {

        assertEquals(value1, value2);

    }

    // Page Refresh
    public static void PageRefresh() {

        driver.navigate().refresh();
    }

    // Keys.ENTER
    public static void KeysENTER(Selector type, String value) throws Exception {

        FindElement(type, value).sendKeys(Keys.ENTER);
    }

    // Delete Cookie
    public static void DeleteCookie() {

        driver.manage().deleteAllCookies();
    }

    // Scroll
    public static void Scroll(MobileElement ElementPress, MobileElement ElementMove) {
        TouchAction scroll = new TouchAction(driver);
        scroll.press(ElementPress).moveTo(ElementMove).release().perform();
    }

}
