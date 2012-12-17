package is.projekt;

import java.util.ArrayList;

public class Customer {

    private String name;
    private Address address;
    private String phone;
    private String mail;
    private ArrayList<Order> orderList;

    public Customer(String name, String eMail, String phone, Address address) {

        this.name = name;
        this.mail = eMail;
        this.phone = phone;
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

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void addOrder(Order order) {
        getOrderList().add(order);
    }

    public void removeOrder(Order order) {

        getOrderList().remove(order);
    }

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
