package is.model;

import is.model.listitems.ListItem;
import is.model.tools.ArraySearcher;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;

/**
 *
 * @author Viktor Voigt
 * @author Anna Thernfrid
 * @author Eric Nordlund
 */
public class CustomerRegistry {

    private HashMap<Integer, Customer> customerList = new HashMap<>();
    private int customerKeyCount = 0;
    private ReferenceHandler referenceHandler;

    protected Customer getCustomer(int customerID) {

        return getCustomerList().get(customerID);

    }

    private HashMap<Integer, Customer> getCustomerList() {
        return customerList;
    }

    /*
     * Räknar upp kundnyckeln och returnerar det nya värdet.
     */
    private int getNewCustomerKey() {
        customerKeyCount++;
        return customerKeyCount;
    }

    public void addCustomer(String name, String addressStreet, String addressPostCode, String addressCity, String phoneNumber, String eMail) {

        int customerID = this.getNewCustomerKey();

        this.editCustomer(customerID, name, addressStreet,
                addressPostCode, addressCity, phoneNumber, eMail);


    }

    public void editCustomer(int customerID, String name, String addressStreet,
            String addressPostCode, String addressCity, String phoneNumber, String eMail) {

        Address address = new Address(addressStreet, addressPostCode, addressCity);
        Customer c = new Customer(customerID, name, eMail, phoneNumber, address);

        getCustomerList().put(customerID, c);
    }

    public void removeCustomer(int customerID) {

        this.getCustomerList().remove(customerID);
    }

    protected void setReferenceHandler(ReferenceHandler aThis) {
        this.referenceHandler = aThis;
    }

    public String[] getCustomerData(int customerID) {

        String[] customerData = this.getCustomerList().get(customerID).getDataArray();

        return customerData;
    }

    public ListModel<ListItem> getListModel() {

        HashMap<Integer, Customer> hm = this.getCustomerList();

        DefaultListModel<ListItem> lm = new DefaultListModel<>();

        Iterator<Entry<Integer, Customer>> it = hm.entrySet().iterator();

        while (it.hasNext()) {

            Map.Entry<Integer, Customer> e = it.next();

            Customer c = e.getValue();

            ListItem item = c.getListItem();

            lm.addElement(item);

        }

        return lm;

    }

    public ListModel<ListItem> getListModel(String searchString) {

        HashMap<Integer, Customer> hm = this.getCustomerList();

        DefaultListModel<ListItem> lm = new DefaultListModel<>();

        Iterator<Entry<Integer, Customer>> it = hm.entrySet().iterator();

        while (it.hasNext()) {

            Map.Entry<Integer, Customer> e = it.next();

            Customer c = e.getValue();

            String[] customerData = c.getDataArray();

            boolean found = ArraySearcher.searchStringArray(customerData, searchString);

            if (found) {

                ListItem li = c.getListItem();

                lm.addElement(li);
            }

        }

        return lm;

    }
}
