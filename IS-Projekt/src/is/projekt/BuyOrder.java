package is.projekt;

/**
 *
 * @author svalan
 */
public class BuyOrder extends Order {

    public BuyOrder(int orderID, int billingDate, Address billingAddress, Integer customerID) {
        super(orderID, billingDate, billingAddress, customerID);
    }
}
