/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package is.projekt;

import is.controller.Controller;
import is.controller.ListItem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.swing.DefaultListModel;

/**
 *
 * @author anna_thernfrid
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

    private int getNewCustomerKey() {
        customerKeyCount++;
        return customerKeyCount;
    }

    public void addCustomer(Customer c) {
        getCustomerList().put(getNewCustomerKey(), c);
    }

    public void editCustomer(Integer customerID, Customer c) {
        getCustomerList().put(customerID, c);
    }

    public void removeCustomer(Integer customerID) {

        this.getCustomerList().remove(customerID);
    }

    protected void setReferenceHandler(ReferenceHandler aThis) {
        this.referenceHandler = aThis;
    }

    public ArrayList<String> getCustomerData(int customerID) {

        ArrayList<String> customerData = this.getCustomerList().get(customerID).getDataAsList();

        return customerData;
    }

    public DefaultListModel getListModel() {

        HashMap<Integer, Customer> hm = this.getCustomerList();

        DefaultListModel lm = new DefaultListModel();

        Iterator it = hm.entrySet().iterator();

        while (it.hasNext()) {

            Map.Entry e = (Map.Entry) it.next();

            Integer key = (Integer) e.getKey();

            String displayString = e.getValue().toString();

            ListItem item = new ListItem(key, displayString);

            lm.addElement(item);

        }

        return lm;

    }
}
