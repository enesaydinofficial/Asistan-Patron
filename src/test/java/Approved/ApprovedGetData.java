package Approved;

import BasePackage.BaseClass;
import BasePackage.Selector;
import org.testng.annotations.Test;

import static Keywords.Command.Click;
import static Keywords.Command.WaitElementToBeClickableMobileBy;
import static MainScreen.MainPage.*;

public class ApprovedGetData extends BaseClass {

    @Test
    public static void approveGetDataButton() throws Exception {
        WaitElementToBeClickableMobileBy(Selector.ACCESSIBILITYID, MenuButton);
        Click(Selector.ACCESSIBILITYID, MenuButton);
        WaitElementToBeClickableMobileBy(Selector.ACCESSIBILITYID, OrdersMainMenu);
        Click(Selector.ACCESSIBILITYID, OrdersMainMenu);
        WaitElementToBeClickableMobileBy(Selector.XPATH, OrdersMenu);
        Click(Selector.XPATH, OrdersMenu);
        StartDateEndDateSet(2, 5, 0, 30, 5, 1, 11, 30);
    }
}
