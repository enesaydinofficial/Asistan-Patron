package BasePackage;

import CoreLayer.StarClass;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import java.net.URL;

import static LoginScreen.LoginPage.AsistanPatronLoginAction;

public class BaseClass extends StarClass {

    @BeforeTest
    public static void StartUp() throws Exception {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "TestDevice");
        cap.setCapability("udid", "emulator-5556");
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.1.1");
        cap.setCapability("autoGrantPermissions", "true");
        cap.setCapability("noReset", "true");
        cap.setCapability("appPackage", "com.mikroasistan.patron");
        cap.setCapability("appActivity", "com.mikroasistan.patron.MainActivity");
        cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 1000);

        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        Thread.sleep(1 * 5000);
    }


    @Test
    public static void AsistanPatronLogin() throws Exception {
        String CompanyNameValue = "MIKRO ASISTAN";
        String SQLConnectName = "Data Source=88.248.108.107\\\\SQLEXPRES,1433;Initial Catalog=MikroDB_V15_ASISTAN;User ID=appuser1;Password=aaV?C94e37nj; Max Pool Size=120";

        // App Login Action
        AsistanPatronLoginAction(CompanyNameValue, SQLConnectName);
    }


    @AfterTest
    public void TearDown() {
        driver.closeApp();
        driver.quit();
    }
}
