
package is.controller;

import is.gui.MainWindow;
import is.projekt.Boat;
import is.projekt.BoatRegistry;
import is.projekt.Customer;
import is.projekt.CustomerRegistry;

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

    public Controller(CustomerRegistry customerRegistry,BoatRegistry boatRegistry, MainWindow mainWindow) {

        this.customerRegistry = customerRegistry;
        this.boatRegistry = boatRegistry;
        this.mainWindow = mainWindow;
        
    }

    public void startMainWindow() {

        mainWindow.setController(this);
        mainWindow.setVisible(true);

    }
    
    public Customer getNewCustomer(){
        
        return customerRegistry.getNewCustomer();
        
    }

    public void deleteCustomer(int customerNumber) {
        customerRegistry.deleteCustomer(customerNumber);
    }

   
    
}
