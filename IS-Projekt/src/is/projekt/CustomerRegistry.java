/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package is.projekt;

import is.controller.Controller;
import java.util.HashMap;

/**
 *
 * @author anna_thernfrid
 */
public class CustomerRegistry {

    private HashMap<Integer, Customer> customerRegistry = new HashMap<>();
    private int customerKeyCount = 0;
    private Controller controller;

    public HashMap<Integer, Customer> getCustomerRegistry() {
        return customerRegistry;
    }

    private int getNewCustomerKey() {
        customerKeyCount++;
        return customerKeyCount;
    }

    public void addCustomer(Customer c) {
        getCustomerRegistry().put(getNewCustomerKey(), c);
    }

    public void editCustomer(Integer customerID, Customer c) {
        getCustomerRegistry().put(customerID, c);
    }

    public void removeCustomer(Integer customerID) {

        this.getCustomerRegistry().remove(customerID);
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }
}
