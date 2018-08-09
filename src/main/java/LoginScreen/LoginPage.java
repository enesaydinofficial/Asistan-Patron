package LoginScreen;

import BasePackage.BaseClass;
import BasePackage.Selector;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Keywords.Command.*;

public class LoginPage extends BaseClass {

    public static String CompanyName = "//android.webkit.WebView[@content-desc='Mikro Asistan Patron']/android.view.View/android.view.View[5]/android.view.View[1]/android.view.View[2]/android.widget.EditText";
    public static String SQLConnectClause = "//android.webkit.WebView[@content-desc='Mikro Asistan Patron']/android.view.View/android.view.View[5]/android.view.View[2]/android.view.View[2]/android.widget.EditText";
    public static String ConnectButton = "//android.widget.Button[@content-desc='Bağlan']";

    public static void AsistanPatronLoginAction(String CompanyNameValue, String SQLConnectName) throws Exception {
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOf(FindElement(Selector.XPATH, CompanyName)));
        ThreadSleep1Seconds();
        SendKeys(Selector.XPATH, CompanyName, CompanyNameValue);
        SendKeys(Selector.XPATH, SQLConnectClause, SQLConnectName);
        Click(Selector.XPATH, ConnectButton);
    }
}
