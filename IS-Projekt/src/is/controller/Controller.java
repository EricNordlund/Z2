package is.controller;

import is.gui.MainWindow;
import is.projekt.Address;
import is.projekt.Boat;
import is.projekt.BuyOrder;
import is.projekt.Customer;
import is.projekt.Goods;
import is.projekt.Order;
import is.projekt.Registry;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;

/**
 * This class handles input from the user interface to the model.
 *
 * @param mainWindow The user interface.
 * @param model The model.
 */
public class Controller implements ControllerInterface {

    private Registry model;

    public Controller(Registry model) {

        this.model = model;

    }

    private Registry getRegistry() {
        return model;
    }

    @Override
    public void addCustomer(String name, String addressStreet, String addressPostCode, String addressCity, String phoneNumber, String eMail) {

        Address address = new Address(addressStreet, addressPostCode, addressCity);
        Customer c = new Customer(name, eMail, phoneNumber, address);
        getRegistry().addCustomer(c);

        System.out.println("Adding customer " + c.toString() + ".");
    }

    @Override
    public void editCustomer(Integer customerID, String name, String addressStreet, String addressPostCode, String addressCity, String phoneNumber, String eMail) {

        Address address = new Address(addressStreet, addressPostCode, addressCity);
        Customer c = new Customer(name, eMail, phoneNumber, address);
        getRegistry().editCustomer(customerID, c);

        System.out.println("Editing customer " + c.toString() + ".");
    }

    @Override
    public ArrayList<String> getCustomerData(Integer customerID) {

        ArrayList<String> customerData = getRegistry().getCustomerRegistry().get(customerID).getDataAsList();

        return customerData;

    }

    @Override
    public void removeCustomer(Integer customerID) {
        getRegistry().removeCustomer(customerID);

        System.out.println("Removing customer " + customerID + ".");
    }

    /**
     * Denna metod returnerar en DefaultListModel som håller värden från den
     * HashMap som lagrar kunderna. En DefaultListModel kan användas av en
     * JList.
     *
     * @param it En iterator går igenom samtliga objekt i HashMap för kunderna.
     * @param e Ett objekt som plockas fram ur HashMap som innehåller nyckeln
     * och kundobjektet.
     *
     *
     */
    @Override
    public DefaultListModel getCustomerListModel() {

        HashMap<Integer, Customer> hm = getRegistry().getCustomerRegistry();

        DefaultListModel lm = this.createListModel(hm);

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
    public void editGoods(Double price, String description, String productNr) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void removeGoods(Integer goodsID) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<String> getGoodsData(Integer goodsID) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ListModel getGoodsListModel() {

        HashMap<Integer, Goods> hm = getRegistry().getGoodsRegistry();

        DefaultListModel lm = this.createListModel(hm);

        return lm;
    }

    @Override
    public void addGoods(String name, Double price, String description) {

        Goods g = new Goods(name, price, description);
        getRegistry().addGoods(g);
        System.out.println("Adding goods " + g.toString() + ".");
    }

    @Override
    public void addBuyOrder(Date billingDate, String billingAdressStreet, String billingAdressPostCode, String billingAdressCity, List orderRows, Integer customerID, boolean isBuyOrder, Integer orderID) {

        Address billingAdress = new Address(billingAdressStreet, billingAdressPostCode, billingAdressCity);
        Order o = new BuyOrder(billingDate, billingAdress, customerID, isBuyOrder, orderID);
        getRegistry().addBuyOrder(o);

        System.out.println("Adding order " + o.toString() + ".");
    }

    @Override
    public void editBuyOrder(Date billingDate, String billingAdressLn1, String billingAdressLn2, String billingAdressLn3, List orderRows, String customerID) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<String> getBuyOrderData(Integer orderID) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void removeBuyOrder(Integer orderID) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ListModel getBuyOrderRowsListModel(Integer orderID) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    
    private DefaultListModel createListModel(HashMap hm) {

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

    @Override
    public ListModel getBoatListModel() {
        
        HashMap<Integer, Boat> hm = getRegistry().getBoatRegistry();
        
        DefaultListModel lm = this.createListModel(hm);

        return lm;
    }
}
