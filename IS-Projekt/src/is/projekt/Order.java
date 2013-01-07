package is.projekt;

import is.controller.BoatListItem;
import is.controller.GoodsListItem;
import is.controller.ListItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;

/**
 *
 * @author Viktor Voigt ^_^
 */
public abstract class Order {

    private int billingDate;
    private Address billingAddress;
    private List<OrderRow> orderRows = new ArrayList();
    private int customerID;
    private boolean isBuyOrder;
    private int orderID;

    protected Order(int orderID, int billingDate, Address billingAddress, int customerID) {
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
    protected void addOrderRow(double price, int quantity, Product product) {

        OrderRow or = new OrderRow(price, quantity, product);

        this.getOrderRows().add(or);

        System.out.println("Sparar OrderRow för " + product.toString());

    }

    protected int getOrderID() {
        return orderID;
    }

    ;
    @Override
    public String toString() {
        return "Order: " + orderID + " (Kund: " + customerID + ")";
    }

    ;

    protected void clearOrderRows() {

        this.getOrderRows().clear();

    }

    protected ListModel getOrderRowListModel() {


        List<OrderRow> rowList = this.getOrderRows();

        DefaultListModel lm = new DefaultListModel();

        Iterator it = rowList.iterator();

        while (it.hasNext()) {

            OrderRow orderRow = (OrderRow) it.next();
            ListItem item;

            double price = orderRow.getPrice();
            int productID = orderRow.getProductID();
            int quantity = orderRow.getQuantity();
            String displayString = orderRow.getProductName();

            if (orderRow.holdsBoat()) {

                item = new BoatListItem(productID, displayString, price);

            } else {

                item = new GoodsListItem(productID, displayString, price, quantity);

            }

            System.out.println("Lägger till " + item.toString() + " till ListModel.");

            lm.addElement(item);

        }

        return lm;



    }
}
