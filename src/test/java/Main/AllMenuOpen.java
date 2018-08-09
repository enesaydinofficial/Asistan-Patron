package Main;

import BasePackage.BaseClass;
import BasePackage.Selector;
import MainScreen.MainPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AllMenuOpen extends BaseClass {

    @Test
    public static void Main() throws Exception {
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.elementToBeClickable(FindElementMobileBy(Selector.ACCESSIBILITYID, MainPage.MenuButton)));
        MainPage.MenuButtonClick();
    }
}
