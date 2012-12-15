package is.projekt;

import java.util.ArrayList;

public class Customer {

    private String name;
    private Address address;
    private String phoneNumber;
    private String eMail;
    private ArrayList<Order> orderList;

    public Customer(String name, String eMail, String phoneNumber, Address address) {

        this.name = name;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }

    public String getName() {
        return name;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public void addOrder(Order order) {
        getOrderList().add(order);
    }

    public void removeOrder(Order order) {

        getOrderList().remove(order);
    }
}
