package MainScreen;

import BasePackage.Selector;
import io.appium.java_client.MobileElement;

import java.util.ArrayList;
import java.util.List;

import static Keywords.Command.*;

public class MainPage {

    public static String MenuButton = "Menu"; // Accessibility ID
    public static String Invoices = "Faturalar"; // Accessibility ID
    public static String OrdersMainMenu = "Siparişler"; // Accessibility ID
    public static String OrdersMenu = "(//android.view.View[@content-desc='Siparişler'])[2]"; // XPATH
    public static String ApprovedMenu = "Onaylananlar"; // Accessibility ID
    public static String NotApprovedMenu = "Onaylanmayanlar"; // Accessibility ID
    public static String StartDate = "//android.webkit.WebView[@content-desc='Mikro Asistan Patron']/android.view.View/android.view.View[5]/android.view.View[1]";
    public static String EndDate = "//android.webkit.WebView[@content-desc='Mikro Asistan Patron']/android.view.View/android.view.View[5]/android.view.View[2]";
    public static String CurrentSelectMonth = "//android.webkit.WebView/android.view.View[2]/android.view.View/android.view.View[2]";
    public static String SetButton = "Ayarla";
    public static String GetDataButton = "Verileri Getir"; // Accessibility ID


    public static void MenuButtonClick() throws Exception {
        Click(Selector.ID, MenuButton);
    }

    public static void StartDateEndDateSet(int StartDatePressMonth, int StartDateMoveMonth, int StartDateMonth, int StartDay, int EndDatePressMonth, int EndDateMoveMonth, int EndDateMonth, int EndDay) throws Exception {

        List<String> Months = new ArrayList();
        Months.add("Ocak");
        Months.add("Şubat");
        Months.add("Mart");
        Months.add("Nisan");
        Months.add("Mayıs");
        Months.add("Haziran");
        Months.add("Temmuz");
        Months.add("Ağustos");
        Months.add("Eylül");
        Months.add("Ekim");
        Months.add("Kasım");
        Months.add("Aralık");

        // START DATE
        WaitElementToBeClickableMobileBy(Selector.XPATH, StartDate);
        Click(Selector.XPATH, StartDate);

        // Month Select

        WaitElementToBeClickableMobileBy(Selector.XPATH, CurrentSelectMonth);
        Click(Selector.XPATH, CurrentSelectMonth);
        WaitElementToBeClickableMobileBy(Selector.XPATH, "//android.widget.Button[@content-desc='" + Months.get(StartDatePressMonth) + "']");
        MobileElement ElementPress = FindElement(Selector.XPATH, "//android.widget.Button[@content-desc='" + Months.get(StartDatePressMonth) + "']");
        MobileElement ElementMove = FindElement(Selector.XPATH, "//android.widget.Button[@content-desc='" + Months.get(StartDateMoveMonth) + "']");
        Scroll(ElementPress, ElementMove);

        String SelectStartDate = "//android.widget.Button[@content-desc='" + Months.get(StartDateMonth) + "']";

        WaitElementToBeClickable(Selector.XPATH, SelectStartDate);
        Click(Selector.XPATH, SelectStartDate);

        // Day Select
        String StartDateDay = "//android.view.View[@content-desc='" + StartDay + "']";

        WaitElementToBeClickable(Selector.XPATH, StartDateDay);
        Click(Selector.XPATH, StartDateDay);
        Click(Selector.ACCESSIBILITYID, SetButton);


        // END DATE
        WaitElementToBeClickableMobileBy(Selector.XPATH, EndDate);
        Click(Selector.XPATH, EndDate);

        // Month Select
        WaitElementToBeClickableMobileBy(Selector.XPATH, CurrentSelectMonth);
        Click(Selector.XPATH, CurrentSelectMonth);
        WaitElementToBeClickableMobileBy(Selector.XPATH, "//android.widget.Button[@content-desc='" + Months.get(EndDatePressMonth) + "']");
        MobileElement ElementPress1 = FindElement(Selector.XPATH, "//android.widget.Button[@content-desc='" + Months.get(EndDatePressMonth) + "']");
        MobileElement ElementMove1 = FindElement(Selector.XPATH, "//android.widget.Button[@content-desc='" + Months.get(EndDateMoveMonth) + "']");
        Scroll(ElementPress1, ElementMove1);

        String SelectEndDate = "//android.widget.Button[@content-desc='" + Months.get(EndDateMonth) + "']";

        WaitElementToBeClickable(Selector.XPATH, SelectEndDate);
        Click(Selector.XPATH, SelectEndDate);

        // Day Select
        String EndDateDay = "//android.view.View[@content-desc='" + EndDay + "']";

        WaitElementToBeClickable(Selector.XPATH, EndDateDay);
        Click(Selector.XPATH, EndDateDay);
        Click(Selector.ACCESSIBILITYID, SetButton);
    }

}
