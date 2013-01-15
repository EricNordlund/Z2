/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package is.model;

import is.model.listitems.ListItem;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;

/**
 *
 * @author Anna Thernfrid
 * @author Viktor Voigt
 * @author Eric Nordlund
 */
public class OrderRegistry {

    private HashMap<Integer, Order> orderList = new HashMap<>(100);
    private int orderKeyCount = 0;
    private ReferenceHandler referenceHandler;

    private ReferenceHandler getReferenceHandler() {
        return referenceHandler;
    }

    private HashMap<Integer, Order> getOrderList() {
        
        return this.orderList;
        
    }
    
    private Iterator<Entry<Integer, Order>> getOrderListIterator(){
        
        return this.orderList.entrySet().iterator();
        
    }

    private int getNewOrderKey() {
        orderKeyCount++;
        return orderKeyCount;
    }

    protected Order getOrder(int orderID) {
        return getOrderList().get(orderID);
    }

    public void editOrder(int billingDate, String billingAddressStreet, String billingAddressPostCode,
            String billingAddressCity, int customerID, boolean isBuyOrder, int orderID) {


        Customer customer = this.getReferenceHandler().getCustomer(customerID);
        Address address = new Address(billingAddressStreet, billingAddressPostCode, billingAddressCity);

        Order o;

        if (isBuyOrder) {
            o = new BuyOrder(orderID, billingDate, address, customer);
        } else {
            o = new SellOrder(orderID, billingDate, address, customer);
        }

        this.getOrderList().put(orderID, o);


    }

    public void removeBuyOrder(int orderID) {

        Order o = this.getOrder(orderID);

        o.removeCustomer();

        getOrderList().remove(orderID);
    }

    public int addSellOrder(int customerID, int billingDate, String billingAdressStreet,
            String billingAdressPostCode, String billingAdressCity) {

        Customer customer = this.getReferenceHandler().getCustomer(customerID);

        Address billingAddress = new Address(billingAdressStreet, billingAdressPostCode, billingAdressCity);

        SellOrder so = new SellOrder(getNewOrderKey(), billingDate, billingAddress, customer);

        getOrderList().put(so.getOrderID(), so);

        return so.getOrderID();

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

    public String[] getDataArray(int orderID) {

        String[] dataArray = this.getOrder(orderID).getDataArray();

        return dataArray;
    }

    public ListModel<ListItem> getOrderListModel() {

        DefaultListModel<ListItem> lm = new DefaultListModel<>();

        Iterator<Entry<Integer, Order>> it = this.getOrderListIterator();

        while (it.hasNext()) {

            Map.Entry<Integer, Order> e = it.next();

            int idNumber = e.getKey();

            ListItem item = this.createListItem(idNumber);

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

    public ListModel<ListItem> getOrderRowListModel(int orderID) {

        ListModel<ListItem> lm = this.getOrder(orderID).getOrderRowListModel();

        return lm;
    }

    public ListModel<ListItem> getOrderListByCustomer(int customerID) {

        DefaultListModel<ListItem> lm = new DefaultListModel<>();

        Iterator<Entry<Integer, Order>> it = this.getOrderListIterator();

        while (it.hasNext()) {

            Map.Entry<Integer, Order> e = it.next();

            Order o = e.getValue();

            if (o.getCustomerID() == customerID) {

                int orderID = o.getOrderID();

                ListItem item = this.createListItem(orderID);

                lm.addElement(item);
            }

        }

        return lm;

    }

    public boolean isBuyOrder(int orderID) {
        Order o;

        o = this.getOrder(orderID);

        if (o instanceof BuyOrder) {

            return true;
        } else {
            return false;
        }
    }

    public ListModel<ListItem> getBuyOrderListModel() {

        DefaultListModel<ListItem> lm = new DefaultListModel<>();

        Iterator<Entry<Integer, Order>> it = this.getOrderListIterator();

        while (it.hasNext()) {

            Map.Entry<Integer, Order> e = it.next();

            if (e.getValue() instanceof BuyOrder) {

                int key = e.getKey();

                ListItem item = this.createListItem(key);

                lm.addElement(item);
            }

        }

        return lm;
    }

    public ListModel<ListItem> getSellOrderListModel() {

        DefaultListModel<ListItem> lm = new DefaultListModel<>();

        Iterator<Entry<Integer, Order>> it = this.getOrderListIterator();

        while (it.hasNext()) {

            Map.Entry<Integer, Order> e = it.next();

            if (e.getValue() instanceof SellOrder) {

                int key = e.getKey();

                ListItem item = this.createListItem(key);

                lm.addElement(item);
            }

        }

        return lm;
    }

    private ListItem createListItem(int orderID) {

        Order o = this.getOrder(orderID);

        String displayString = o.getDisplayName();

        ListItem li = new ListItem(orderID, displayString);

        return li;

    }
}
