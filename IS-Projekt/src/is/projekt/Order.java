package is.projekt;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author svalan
 */
public abstract class Order {

    private int orderID;
    private Date billingDate;
    private Address billingAddress;
    private List<OrderRow> orderRows = new ArrayList();
    private Customer customer;

    /**
     *
     * @param idNumber Unique number generated by the OrderRegistry.
     * @param billingDate The built in Date class.
     * @param billingAddress Our own address class.
     */
    public Order(int idNumber) {
        this.orderID = idNumber;

    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }


    public List<OrderRow> getOrderRows() {
        return orderRows;
    }

    public void setOrderRows(List<OrderRow> orderRows) {
        this.orderRows = orderRows;
    }


    public Customer getCustomer() {
        return customer;
    }


    public void setCustomer(Customer customer) {
        this.customer = customer;
    }


    public void setIdNumber(int idNumber) {
        this.orderID = idNumber;
    }

    public void setBillingDate(Date billingDate) {
        this.billingDate = billingDate;
    }

    public int getIdNumber() {
        return orderID;
    }

    public Date getBillingDate() {
        return billingDate;
    }

    /**
     * Adds an OrderRow to the list.
     * @param newOrderRow The order row to add.
     */
    public void addOrderRow(OrderRow newOrderRow) {
        getOrderRows().add(newOrderRow);
    }
}
