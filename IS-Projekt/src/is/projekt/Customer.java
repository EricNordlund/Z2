package is.projekt;

import java.util.ArrayList;

public class Customer {

    private final int customerNumber;
    private String name;
    private Address address;
    private String phoneNumber;
    private String eMail;
    private ArrayList<Order> orderList;

    public Customer(int customerNumber) {

        this.customerNumber = customerNumber;

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

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public String customerNumberString() {
        return Integer.toString(getCustomerNumber());
    }

    public void addOrder(Order order) {
        getOrderList().add(order);
    }

    public void removeOrder(Order order) {

        getOrderList().remove(order);
    }
}
