package is.projekt;

import java.util.Date;

/**
 *
 * @author svalan
 */
public class BuyOrder extends Order {

    /**
     * Calls constructor in superclass. Read documentation there.
     */
    public BuyOrder() {
    }

    
    
    public BuyOrder(Date billingDate, Address billingAddress, Integer customerID, boolean isBuyOrder, Integer orderID) {
        super(billingDate, billingAddress, customerID, isBuyOrder, orderID);
    }
}
