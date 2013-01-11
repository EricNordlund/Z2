package is.projekt;

import java.util.ArrayList;
import java.util.HashMap;

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
    private HashMap<Integer,Order> orderList;

    protected Customer(int customerID, String name, String eMail, String phone, Address address) {

        this.name = name;
        this.mail = eMail;
        this.phone = phone;
        this.address = address;
        this.customerID = customerID;
        orderList = new HashMap<>();
    }

    //Getters
    protected HashMap<Integer, Order> getOrderList() {
        return orderList;
    }

    public String getName() {
        return name;
    }
    
     public Address getAddress() {
        return address;
    }
    
    protected int getID(){
        
        return this.customerID;
        
    }
    
    public String getPhone() {
        return phone;
    }

    public String getMail() {
        return mail;
    }
    

    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    
    public void setMail(String mail) {
        this.mail = mail;
    }
    

    public void addOrder(Order order) {
        int orderID = order.getOrderID();
        
        this.getOrderList().put(orderID, order);
    }

    public void removeOrder(Order order) {
        
        int orderID = order.getOrderID();

        this.getOrderList().remove(orderID);
    }

    //TODO: ändra till String[]
    public ArrayList<String> getDataAsList() {

        ArrayList<String> l = new ArrayList<>();

        l.add(getName());
        l.add(getPhone());
        l.add(getMail());
        l.add(getAddress().getStreetName());
        l.add(getAddress().getPostCode());
        l.add(getAddress().getCity());


        return l;

    }

    @Override
    public String toString() {

        return getName() + " (" + getMail() + ")";


    }
}
