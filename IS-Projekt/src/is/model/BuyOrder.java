package is.model;

/**
 * "Tom" klass som bara är till för att kategorisera ordrar.
 *
 *
 * @author Viktor Voigt
 * @author Anna Thernfrid
 * @author Eric Nordlund
 */
public class BuyOrder extends Order {

    public BuyOrder(int orderID, int billingDate, Address billingAddress, Customer customer) {

        super(orderID, billingDate, billingAddress, customer);

    }
}
