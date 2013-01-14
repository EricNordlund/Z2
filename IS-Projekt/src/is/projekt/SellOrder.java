package is.projekt;

/**
 *
 * @author Anna Thernfrid, Eric Nordlund, Viktor Voigt
 */
public class SellOrder extends Order {

    /**
     * Anropar kontruktorn i Order.
     */
    public SellOrder(int orderID, int billingDate, Address billingAddress, Customer customer) {

        super(orderID, billingDate, billingAddress, customer);

    }
}
