package Orders;

import BasePackage.BaseClass;
import BasePackage.Selector;
import org.testng.annotations.Test;

import static Keywords.Command.*;
import static MainScreen.MainPage.*;

public class OrderGetData extends BaseClass {

    @Test
    public static void OrderGetDataButton() throws Exception {
        WaitElementToBeClickableMobileBy(Selector.ACCESSIBILITYID, MenuButton);
        Click(Selector.ACCESSIBILITYID, MenuButton);
        WaitElementToBeClickableMobileBy(Selector.ACCESSIBILITYID, OrdersMainMenu);
        Click(Selector.ACCESSIBILITYID, OrdersMainMenu);
        WaitElementToBeClickableMobileBy(Selector.ACCESSIBILITYID, ApprovedMenu);
        Click(Selector.ACCESSIBILITYID, ApprovedMenu);
        StartDateEndDateSet(2, 5, 0, 30, 5, 1, 11, 30);
    }

}
