package is.projekt;

import is.controller.ListItem;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Viktor Voigt ^_^
 */
public abstract class Order {

    private int billingDate;
    private Address billingAddress;
    private List<OrderRow> orderRows = new ArrayList();
    private Integer customerID;
    private boolean isBuyOrder;
    private Integer orderID;

     /**
     *
     * @param billingDate The built in Date class.
     * @param billingAddress Our own address class.
     * 
     */
    public Order(int orderID, int billingDate, Address billingAddress, Integer customerID) {
        this.billingDate = billingDate;
        this.billingAddress = billingAddress;
        this.customerID = customerID;
        this.orderID = orderID;

    }

    public boolean getIsBuyOrder() {
        return isBuyOrder;
    }

    public void setIsBuyOrder(boolean isBuyOrder) {
        this.isBuyOrder = isBuyOrder;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    //Setsetset
    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public List<OrderRow> getOrderRows() {
        return orderRows;
    }

    public void setOrderRows(List<OrderRow> orderRows) {
        this.orderRows = orderRows;
    }

    public Integer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Integer customerID) {
        this.customerID = customerID;
    }

    public void setBillingDate(int billingDate) {
        this.billingDate = billingDate;
    }

    public int getBillingDate() {
        return billingDate;
    }

    public ArrayList<String> getDataAsList() {

        ArrayList<String> l = new ArrayList<>();

        l.add(Integer.toString(getBillingDate()));
        l.add(getBillingAddress().getStreetName());
        l.add(getCustomerID().toString());
        l.add(getBillingAddress().getPostCode());
        l.add(getBillingAddress().getCity());

        return l;

    }

    /**
     * Adds an OrderRow to the list.
     *
     * @param newOrderRow The order row to add.
     */
    public void addOrderRow(ListItem li) {
        
        int key = li.getKey();
        
        OrderRow or;
        
 
    }

    public int getOrderID() {
        return orderID;
    }

    ;
    @Override
    public String toString() {
        return "Order: " + orderID + " (Kund: " + customerID + ")";
    }
;
}
