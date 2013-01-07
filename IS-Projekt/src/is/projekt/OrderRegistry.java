/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package is.projekt;

import is.controller.ListItem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;

/**
 *
 * @author anna_thernfrid
 */
public class OrderRegistry {

    private HashMap<Integer, Order> orderList = new HashMap<>();
    private int orderKeyCount = 0;
    private ReferenceHandler referenceHandler;

    public ReferenceHandler getReferenceHandler() {
        return referenceHandler;
    }

    private HashMap<Integer, Order> getOrderList() {
        return orderList;
    }

    private int getNewOrderKey() {
        orderKeyCount++;
        return orderKeyCount;
    }

    protected Order getOrder(int orderID) {
        return getOrderList().get(orderID);
    }

    public void editBuyOrder(int billingDate, String billingAddressStreet, String billingAddressPostCode,
            String billingAddressCity, int customerID, boolean isBuyOrder, int orderID) {

        Customer customer = this.getReferenceHandler().getCustomer(customerID);
        Address address = new Address(billingAddressStreet, billingAddressPostCode, billingAddressCity);
        Order o = new BuyOrder(orderID, billingDate, address, customer);
        this.getOrderList().put(orderID, o);


    }

    public void removeBuyOrder(int orderID) {

        Order o = this.getOrder(orderID);
        
        o.removeCustomer();
        
        getOrderList().remove(orderID);
    }

    public void addSellOrder(int customerID, int billingDate, String billingAdressStreet, 
            String billingAdressPostCode, String billingAdressCity, ListItem[] listItemArray) {

        Customer customer = this.getReferenceHandler().getCustomer(customerID);
        
        Address billingAddress = new Address(billingAdressStreet, billingAdressPostCode, billingAdressCity);

        SellOrder so = new SellOrder(getNewOrderKey(), billingDate, billingAddress, customer);

        for (ListItem li : listItemArray) {
        }

        getOrderList().put(so.getOrderID(), so);
    }

    void setReferenceHandler(ReferenceHandler aThis) {
        this.referenceHandler = aThis;
    }

    public int addBuyOrder(int customerID, int billingDate, String billingAddressStreet, 
            
        String billingAddressPostCode, String billingAddressCity) {

        Customer customer = this.getReferenceHandler().getCustomer(customerID);
        
        Address address = new Address(billingAddressStreet, billingAddressPostCode, billingAddressCity);

        int orderID = this.getNewOrderKey();

        Order o = new BuyOrder(orderID, billingDate, address, customer);

        this.getOrderList().put(orderID, o);
        

        return orderID;


    }

    public ArrayList<String> getDataArray(int orderID) {

        ArrayList<String> dataArray = this.getOrder(orderID).getDataAsList();

        return dataArray;
    }

    public ListModel getOrderListModel() {


        HashMap<Integer, Order> hm = this.getOrderList();

        DefaultListModel lm = new DefaultListModel();

        Iterator it = hm.entrySet().iterator();

        while (it.hasNext()) {

            Map.Entry e = (Map.Entry) it.next();

            int key = (Integer) e.getKey();

            String displayString = e.getValue().toString();

            ListItem item = new ListItem(key, displayString);

            lm.addElement(item);

        }

        return lm;
    }

    public void addGoodsOrderRow(int orderID, double price, int quantity, int productID) {

        Product p = this.getReferenceHandler().getGoods(productID);

        Order o = this.getOrder(orderID);

        o.addOrderRow(price, quantity, p);

    }

    public void clearOrderRows(int orderID) {
        this.getOrder(orderID).clearOrderRows();
    }

    public void addBoatOrderRow(int orderID, double price, int boatID) {

        Product p = this.getReferenceHandler().getBoat(boatID);

        this.getOrder(orderID).addOrderRow(price, 1, p);

    }

    public ListModel getOrderRowListModel(int orderID) {

        ListModel lm = this.getOrder(orderID).getOrderRowListModel();

        return lm;
    }
}
