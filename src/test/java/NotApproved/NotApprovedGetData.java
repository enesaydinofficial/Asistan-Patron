package NotApproved;

import BasePackage.BaseClass;
import BasePackage.Selector;
import org.testng.annotations.Test;

import static Keywords.Command.Click;
import static Keywords.Command.WaitElementToBeClickableMobileBy;
import static MainScreen.MainPage.*;

public class NotApprovedGetData extends BaseClass {

    @Test
    public static void notApproveGetDataButton() throws Exception {
        WaitElementToBeClickableMobileBy(Selector.ACCESSIBILITYID, MenuButton);
        Click(Selector.ACCESSIBILITYID, MenuButton);
        WaitElementToBeClickableMobileBy(Selector.ACCESSIBILITYID, OrdersMainMenu);
        Click(Selector.ACCESSIBILITYID, OrdersMainMenu);
        WaitElementToBeClickableMobileBy(Selector.ACCESSIBILITYID, NotApprovedMenu);
        Click(Selector.ACCESSIBILITYID, NotApprovedMenu);
        StartDateEndDateSet(2, 5, 0, 30, 5, 1, 11, 30);
    }
}
