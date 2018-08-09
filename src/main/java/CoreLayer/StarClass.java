package CoreLayer;

import BasePackage.Selector;
import com.sun.org.apache.regexp.internal.RE;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class StarClass {

    public static AppiumDriver<MobileElement> driver;

    public static String ErrorMessage = "İşlem Başarısız. Hata alınan selector : ";

    public static MobileElement FindElement(Selector Type, String value) throws Exception {

        switch (Type) {

            case CLASS_NAME:
                return driver.findElement(By.className(value));

            case ID:
                return driver.findElement(By.id(value));

            case LINK_TEXT:
                return driver.findElement(By.linkText(value));

            case NAME:
                return driver.findElement(By.name(value));

            case PARTIAL_LINK_TEXT:
                return driver.findElement(By.partialLinkText(value));

            case TAG_NAME:
                return driver.findElement(By.tagName(value));

            case XPATH:
                return driver.findElement(By.xpath(value));

            default:
                throw new Exception(ErrorMessage + value);

        }
    }

    public static MobileElement FindElementMobileBy(Selector Type, String value) throws Exception {

        switch (Type) {

            case CLASS_NAME:
                return driver.findElement(MobileBy.className(value));

            case ID:
                return driver.findElement(MobileBy.id(value));

            case LINK_TEXT:
                return driver.findElement(MobileBy.linkText(value));

            case NAME:
                return driver.findElement(MobileBy.name(value));

            case PARTIAL_LINK_TEXT:
                return driver.findElement(MobileBy.partialLinkText(value));

            case TAG_NAME:
                return driver.findElement(MobileBy.tagName(value));

            case XPATH:
                return driver.findElement(MobileBy.xpath(value));

            case ACCESSIBILITYID:
                return driver.findElement(MobileBy.AccessibilityId(value));

            case ANDROIDUIAUTOMATOR:
                return driver.findElement(MobileBy.AndroidUIAutomator(value));

            default:
                throw new Exception(ErrorMessage + value);

        }
    }
}
