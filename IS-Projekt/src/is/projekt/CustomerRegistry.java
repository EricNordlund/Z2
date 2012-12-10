
package is.projekt;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class CustomerRegistry {

    private List<Customer> customerList;

    
    //Constructor
    public CustomerRegistry() {

        customerList = new ArrayList();

    }

    //Lagrar kundobjektet i databasen.
    public void addCustomer(Customer customerIn) {

        customerList.add(customerIn);

    }

    //Skapar kundobjektet.
    public Customer getNewCustomer() {

        Customer newCustomer = new Customer(createCustomerNumber());

        addCustomer(newCustomer);

        return newCustomer;

    }

    //Letar igenom kundregistret efter ett specefikt kundnr. 
    private Customer getCustomer(int customerNr) {

        Iterator<Customer> iter = customerList.iterator();
        
        Customer c;
        
        while (iter.hasNext()) {
            
            c = iter.next();

            if (c.getCustomerNumber() == customerNr) {

                return c;
            }

        }

        return null;

    }

    //Skapar ett nytt kundnummer genom att räkna antalet objekt i arraylist och sedan lägga till en siffra. 
    private int createCustomerNumber() {

        int newNumber = 1;

        Iterator<Customer> iter = customerList.iterator();

        while (iter.hasNext()) {

            Customer c = iter.next();

            if (c.getCustomerNumber() == newNumber) {

                newNumber = c.getCustomerNumber() + 1;
            }

        }

        return newNumber;
    }
    
 
    //Tar bort en kund ur registret. 
    public void deleteCustomer(int customerNumber) {
        
        customerList.remove(getCustomer(customerNumber));

 
    }
}