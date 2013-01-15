package is.model;

import is.model.listitems.ListItem;
import is.model.tools.StringFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Klassen ansvarar för att lagra information om företagets kunder.
 *
 * @author Viktor Voigt
 * @author Anna Thernfrid
 * @author Eric Nordlund
 */
public class Customer {

    private String name;
    private Address address;
    private String phone;
    private String mail;
    private int customerID;
    private HashMap<Integer, Order> orderList;

    protected Customer(int customerID, String name, String eMail, String phone, Address address) {

        this.name = name;
        this.mail = eMail;
        this.phone = phone;
        this.address = address;
        this.customerID = customerID;
        this.orderList = new HashMap<>();
    }

    //Getters
    protected HashMap<Integer, Order> getOrderList() {
        return orderList;
    }

    protected String getName() {
        return name;
    }

    protected Address getAddress() {
        return address;
    }

    protected int getID() {

        return this.customerID;

    }

    protected String getPhone() {
        return phone;
    }

    protected String getMail() {
        return mail;
    }

    //Setters
    protected void setName(String name) {
        this.name = name;
    }

    protected void setAddress(Address address) {
        this.address = address;
    }

    protected void setPhone(String phone) {
        this.phone = phone;
    }

    protected void setMail(String mail) {
        this.mail = mail;
    }

    protected void addOrder(Order order) {
        int orderID = order.getOrderID();

        this.getOrderList().put(orderID, order);
    }

    protected void removeOrder(Order order) {

        int orderID = order.getOrderID();

        this.getOrderList().remove(orderID);
    }

    protected String[] getDataArray() {

        String[] dataArray = new String[6];

        dataArray[0] = this.getName();
        dataArray[1] = this.getPhone();
        dataArray[2] = this.getMail();

        dataArray[3] = this.getAddress().getStreetName();
        dataArray[4] = this.getAddress().getPostCode();
        dataArray[5] = this.getAddress().getCity();

        return dataArray;

    }

    protected String getDisplayString() {

        String nameString = StringFormatter.rightPad(this.getName(), 25);

        String displayString = nameString + " (" + this.getMail() + ")";

        return displayString;


    }

    protected boolean hasOrders() {

        if (this.getOrderList().size() > 0) {

            return true;
        } else {

            return false;
        }

    }

    protected ListItem getListItem() {

        ListItem li = new ListItem(this.getID(), this.getDisplayString());

        return li;

    }
}
