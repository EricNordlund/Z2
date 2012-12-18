package is.projekt;

import java.util.Date;

/**
 *
 * @author svalan
 */
public class BuyOrder extends Order {
    
    public BuyOrder(int orderID, Date billingDate, Address billingAddress, Integer customerID) {
        super(orderID, billingDate, billingAddress, customerID);
    }
}
