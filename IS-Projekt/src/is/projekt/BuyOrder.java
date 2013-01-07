package is.projekt;

/**
 *
 * @author svalan
 */
public class BuyOrder extends Order {

    public BuyOrder(int orderID, int billingDate, Address billingAddress,Customer customer) {
        super(orderID, billingDate, billingAddress, customer);
    }
}
