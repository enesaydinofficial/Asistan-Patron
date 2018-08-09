package Invoices;

import BasePackage.BaseClass;
import BasePackage.Selector;
import org.testng.annotations.Test;

import static Keywords.Command.*;
import static MainScreen.MainPage.*;

public class InvoiceGetData extends BaseClass {

    @Test
    public static void invoiceGetDataButton() throws Exception {
        WaitElementToBeClickableMobileBy(Selector.ACCESSIBILITYID, MenuButton);
        Click(Selector.ACCESSIBILITYID, MenuButton);
        WaitElementToBeClickableMobileBy(Selector.ACCESSIBILITYID, Invoices);
        Click(Selector.ACCESSIBILITYID, Invoices);
        StartDateEndDateSet(2, 5, 0, 30, 5, 1, 11, 30);
    }
}
