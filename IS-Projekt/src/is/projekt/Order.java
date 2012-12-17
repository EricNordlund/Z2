package is.projekt;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Viktor Voigt
 */
public abstract class Order {

    private Date billingDate;
    private Address billingAddress;
    private List<OrderRow> orderRows = new ArrayList();
    private Customer customer;
    private boolean isBuyOrder;
    private Integer orderID;
    


    public Order(Date billingDate, Address billingAddress, Customer customer, boolean isBuyOrder, Integer orderID) {
        this.billingDate = billingDate;
        this.billingAddress = billingAddress;
        this.customer = customer;
        this.isBuyOrder = isBuyOrder;
        this.orderID = orderID;
    }

    public boolean getIsBuyOrder() {
        return isBuyOrder;
    }

    public void setIsBuyOrder(boolean isBuyOrder) {
        this.isBuyOrder = isBuyOrder;
    }

    /**
     *
     * @param billingDate The built in Date class.
     * @param billingAddress Our own address class.
     */
    
    
    public Order() {
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

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setBillingDate(Date billingDate) {
        this.billingDate = billingDate;
    }

    public Date getBillingDate() {
        return billingDate;
    }

    /**
     * Adds an OrderRow to the list.
     *
     * @param newOrderRow The order row to add.
     */
    public void addOrderRow(OrderRow newOrderRow) {
        getOrderRows().add(newOrderRow);
    }
}
