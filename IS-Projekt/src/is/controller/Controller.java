package is.controller;

import is.gui.MainWindow;
import is.projekt.Address;
import is.projekt.Customer;
import is.projekt.Model;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.swing.DefaultListModel;


/**
 * This class handles input from the user interface to the model.
 *
 * @param mainWindow The user interface.
 * @param model The model.
 */
public class Controller implements DataInterface {

    private MainWindow view;
    private Model model;

    public Controller(Model model, MainWindow view) {

        this.model = model;
        this.view = view;

    }

    private Model getModel() {
        return model;
    }

    private MainWindow getView() {
        return view;
    }

    @Override
    public void addCustomer(String name, String addressStreet, String addressPostCode, String addressCity, String phoneNumber, String eMail) {
        System.out.println ("Creating customer " + name);
        Address address = new Address(addressStreet, addressPostCode, addressCity);
        Customer c = new Customer (name, eMail, phoneNumber, address);
        getModel().addCustomer(c);
        getView().UpdateLists();
    }

    @Override
    public void editCustomer(String name, String adressLn1, String adressLn2, String adressLn3, String phoneNumber, String eMail) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List getCustomer(Integer customerID) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void removeCustomer(Integer customerID) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public DefaultListModel getCustomerListModel() {
        
        DefaultListModel lm = new DefaultListModel();
        
        HashMap<Integer, Customer> hm = getModel().getCustomerRegistry();
        
        Iterator it = hm.entrySet().iterator();
        
        while (it.hasNext()) {
            
            Map.Entry<Integer, Customer> entry = (Map.Entry<Integer, Customer>) it.next();
            lm.addElement(entry.getValue().getName());       
        }
        
        return lm;
    }

    @Override
    public void addBoat(String regnr, String model, String location, String priceInfo, String description) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void editBoat(String regnr, String model, String location, String priceInfo, String description) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List getBoat(Integer boatID) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void removeBoat(Integer boatID) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void addOrder(Date billingDate, String billingAdressLn1, String billingAdressLn2, String billingAdressLn3, List orderRows, String customerID) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void editOrder(Date billingDate, String billingAdressLn1, String billingAdressLn2, String billingAdressLn3, List orderRows, String customerID) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List getOrder(Integer orderID) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void removeOrder(Integer orderID) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void addGoods(Double price, String description, String productNr) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void editGoods(Double price, String description, String productNr) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List getGoods(Integer goodsID) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void removeGoods(Integer goodsID) {
        throw new UnsupportedOperationException("Not supported yet.");
    }



    }
