
package is.controller;

import is.gui.MainWindow;
import is.projekt.Boat;
import is.projekt.BoatRegistry;
import is.projekt.Customer;
import is.projekt.CustomerRegistry;
import is.projekt.OrderRegistry;
import java.util.List;

/**
 * Detta är en klass som kör gui samt applikation och samordnar dessa.
 *
 *
 *
 *
 */
public class Controller {

    CustomerRegistry customerRegistry;
    BoatRegistry boatRegistry;
    MainWindow mainWindow;
    OrderRegistry orderRegistry;

    public Controller() {
        
    }

    public CustomerRegistry getCustomerRegistry() {
        return customerRegistry;
    }

    public void setCustomerRegistry(CustomerRegistry customerRegistry) {
        this.customerRegistry = customerRegistry;
    }

    public BoatRegistry getBoatRegistry() {
        return boatRegistry;
    }

    public void setBoatRegistry(BoatRegistry boatRegistry) {
        this.boatRegistry = boatRegistry;
    }

    public MainWindow getMainWindow() {
        return mainWindow;
    }

    public void setMainWindow(MainWindow mainWindow) {
        this.mainWindow = mainWindow;
    }

    public OrderRegistry getOrderRegistry() {
        return orderRegistry;
    }

    public void setOrderRegistry(OrderRegistry orderRegistry) {
        this.orderRegistry = orderRegistry;
    }
    
    


   
    
}
