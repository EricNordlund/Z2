
package is.controller;

import is.gui.MainWindow;
import is.projekt.BoatRegistry;
import is.projekt.CustomerRegistry;
import is.projekt.OrderRegistry;


public class Main {
    
    public static void main(String[] args){
        
        Controller controller = new Controller();
        
        controller.setBoatRegistry(new BoatRegistry());
        controller.setCustomerRegistry(new CustomerRegistry());
        controller.setOrderRegistry(new OrderRegistry());
        controller.setMainWindow(new MainWindow());
        controller.getMainWindow().setVisible(true);
    }
    
}
