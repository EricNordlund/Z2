package is.controller;

import is.gui.MainWindow;
import is.projekt.BoatRegistry;
import is.projekt.CustomerRegistry;
import is.projekt.GoodsRegistry;
import is.projekt.OrderRegistry;

public class Main {

    public static void main(String[] args) {

        BoatRegistry br = new BoatRegistry();
        CustomerRegistry cr = new CustomerRegistry();
        GoodsRegistry gr = new GoodsRegistry();
        OrderRegistry or = new OrderRegistry();


        Controller controller = new Controller(br, cr, gr, or);
        
        br.setController(controller);
        cr.setController(controller);
        gr.setController(controller);
        or.setController(controller);
        
        ControllerTest.runTest(controller);

        MainWindow view = new MainWindow();
        view.setController(controller);
        view.updateLists();
        view.setVisible(true);




    }
}
