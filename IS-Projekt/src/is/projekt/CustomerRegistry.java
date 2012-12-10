/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package is.projekt;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author svalan
 */
public class CustomerRegistry {

    private List<Customer> customerList;

    public CustomerRegistry() {

        customerList = new ArrayList();

    }

    public void addCustomer(Customer customerIn) {

        customerList.add(customerIn);

    }
    
    public Customer getNewCustomer(){
        
        Customer newCustomer = new Customer(createCustomerNumber());
        
        addCustomer(newCustomer);
        
        return newCustomer;
        
    }

    private Customer getCustomer(int customerNr) {

        Iterator<Customer> iter = customerList.iterator();
        

        while (iter.hasNext()) {

            if (iter.next().getCustomerNumber() == customerNr) {

                return iter.next();
            }

        }
        
        return null;

    }

    private int createCustomerNumber() {
        
        int newNumber = 1;
        
        Iterator<Customer> iter = customerList.iterator();       

        while (iter.hasNext()) {
            
            Customer c = iter.next();

            if (c.getCustomerNumber() > newNumber) {
                
                newNumber = iter.next().getCustomerNumber() + 1;
            }

        }
        
        return newNumber;
    }
}
