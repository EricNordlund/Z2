package is.projekt;

import java.util.Date;

/**
 *
 * @author Anna Thernfrid, Eric Nordlund, Viktor Voigt
 */
public class SellOrder extends Order {

    /**
     * Anropar kontruktorn i Order.
     */
    public SellOrder(int orderID, Date billingDate, Address billingAddress, Integer customerID) {
        
        super(orderID, billingDate, billingAddress, customerID);
        
    }
}
