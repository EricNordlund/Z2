/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package is.controller;

import is.gui.MainWindow;
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
    MainWindow mainWindow;

    public Controller(CustomerRegistry customerRegistry, MainWindow mainWindow) {

        this.customerRegistry = customerRegistry;
        this.mainWindow = mainWindow;
        
    }

    public void startMainWindow() {

        mainWindow.setController(this);
        mainWindow.setVisible(true);

    }
    
    public Customer getNewCustomer(){
        
        return customerRegistry.getNewCustomer();
        
    }

   
    
}
