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
 * Klassen ansvarar för att lagra företagets ordrar.
 * @author Viktor Voigt
 */
public abstract class Order {

    private int orderID;
    private int billingDate;
    private Address billingAddress;
    private List<OrderRow> orderRows = new ArrayList();
    private Customer customer;

    protected Order(int orderID, int billingDate, Address billingAddress, Customer customer) {
        this.billingDate = billingDate;
        this.billingAddress = billingAddress;
        this.orderID = orderID;

        this.setCustomer(customer);

    }

    private Customer getCustomer() {

        return this.customer;
    }

    private void setCustomer(Customer customer) {

        this.customer = customer;
        this.getCustomer().addOrder(this);
    }

    protected void removeCustomer() {

        this.getCustomer().removeOrder(this);

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

    protected int getCustomerID() {
        return this.getCustomer().getID();
    }

    public void setBillingDate(int billingDate) {
        this.billingDate = billingDate;
    }

    public int getBillingDate() {
        return billingDate;
    }

    //TODO: Ändra till String[]
    public ArrayList<String> getDataAsList() {

        ArrayList<String> l = new ArrayList<>();

        l.add(Integer.toString(getBillingDate()));
        l.add(getBillingAddress().getStreetName());
        l.add(String.valueOf(getCustomerID()));
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
    
    @Override
    public String toString() {
        return "Order: " + orderID + " (Kund: " + this.getCustomer().getID() + ")";
    }

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

    @SuppressWarnings("empty-statement")
    protected String getDisplayName() {
        
        String displayName = Integer.toString(this.getOrderID());
        
        String padding;
        
        //TODO: Lägg flytta till StringFormatter
        //Tom for-loop skapar nollorna i strängen
        for (padding = ""; padding.length() + displayName.length() < 6; padding = padding + "0");

        displayName = padding.concat(displayName);
        
        if (this instanceof BuyOrder){
            
            displayName = displayName.concat(" (köp)  ");
            
        }
        
        else {
            
            displayName = displayName.concat(" (sälj) ");
            
        }
        
        displayName = displayName.concat(this.getCustomer().getName());
        
        return displayName;
        
    }
}
