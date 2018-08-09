package Main;

import BasePackage.BaseClass;
import BasePackage.Selector;
import Keywords.Command;
import MainScreen.MainPage;
import org.testng.annotations.Test;

import static Keywords.Command.*;
import static MainScreen.MainPage.*;

public class GetData extends BaseClass {

    @Test
    public static void GetDataButton() throws Exception {
        StartDateEndDateSet(2, 5, 0, 30, 5, 1, 11, 20);
        WaitElementToBeClickableMobileBy(Selector.ACCESSIBILITYID, MainPage.GetDataButton);
        Click(Selector.ACCESSIBILITYID, MainPage.GetDataButton);
    }
}
