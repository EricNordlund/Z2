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

    private Customer getCustomer(int customerNr) {

        Iterator<Customer> iter = customerList.iterator();

        while (iter.hasNext()) {

            if (iter.next().getCustomerNumber() == customerNr) {

                return iter.next();
            }

        }
        return null;

    }
}
