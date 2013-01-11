package is.controller;

import is.gui.MainWindow;
import is.projekt.BoatRegistry;
import is.projekt.CustomerRegistry;
import is.projekt.GoodsRegistry;
import is.projekt.OrderRegistry;
import is.projekt.ReferenceHandler;

public class Main {

    public static void main(String[] args) {

        BoatRegistry br = new BoatRegistry();
        CustomerRegistry cr = new CustomerRegistry();
        GoodsRegistry gr = new GoodsRegistry();
        OrderRegistry or = new OrderRegistry();

        ReferenceHandler rh = new ReferenceHandler();

        rh.setBoatRegistry(br);
        rh.setCustomerRegistry(cr);
        rh.setGoodsRegistry(gr);
        rh.setOrderRegistry(or);

        Controller controller = new Controller(br, cr, gr, or);

        ControllerTest.runTest(controller);

        MainWindow view = new MainWindow();
        view.setController(controller);
        view.updateLists();
        view.setVisible(true);




    }
}
