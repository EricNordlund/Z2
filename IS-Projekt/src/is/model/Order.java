package is.model;

import is.model.listitems.BoatListItem;
import is.model.listitems.GoodsListItem;
import is.model.listitems.ListItem;
import is.model.tools.StringFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;

/**
 *
 * Klassen ansvarar för att lagra företagets ordrar.
 *
 * @author Viktor Voigt
 */
public abstract class Order {

    private int orderID;
    private int billingDate;
    private Address billingAddress;
    private List<OrderRow> orderRows = new ArrayList<>();
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

    public String[] getDataArray() {

        String[] dataArray = new String[5];

        dataArray[0] = Integer.toString(getBillingDate());
        dataArray[1] = String.valueOf(getCustomerID());
        dataArray[2] = getBillingAddress().getStreetName();
        dataArray[3] = getBillingAddress().getPostCode();
        dataArray[4] = getBillingAddress().getCity();


        return dataArray;

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

    protected ListModel<ListItem> getOrderRowListModel() {


        List<OrderRow> rowList = this.getOrderRows();

        DefaultListModel<ListItem> lm = new DefaultListModel<>();

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

    protected String getDisplayName() {

        //Spapar och formaterar Sträng för ordernummer
        String displayNumber = Integer.toString(this.getOrderID());

        displayNumber = StringFormatter.leftPad(displayNumber, 7, "0");

        //Skapar sträng för ordertyp
        String displayOrderType;

        if (this instanceof BuyOrder) {

            displayOrderType = " (köp)  ";

        } else {

            displayOrderType = " (sälj) ";

        }

        //Skapar Sträng för kundens namn
        String displayCustomerName = this.getCustomer().getName();

        //Returnerar en kombination av strängarna
        return displayNumber + displayOrderType + displayCustomerName;

    }
}