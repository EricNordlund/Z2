/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package is.projekt;

import java.util.HashMap;
import java.io.Serializable;

/**
 *
 * @author anna_thernfrid
 */
public class OrderRegistry {
    
    private HashMap<Integer, Order> orderRegistry = new HashMap<>();
    private int orderKeyCount = 0;
    
    public HashMap<Integer, Order> getOrderRegistry() {
        return orderRegistry;
    }
     public int getNewOrderKey() {
        orderKeyCount++;
        return orderKeyCount;
    }
      public Order getOrder(Integer orderID) {
        return orderRegistry.get(orderID);
    }
      public void addBuyOrder(Order o,Integer orderID) {
        getOrderRegistry().put(orderID, o);
    }
    
    public void editBuyOrder(Order o,Integer orderID) {
        getOrderRegistry().put(orderID, o);
    }
    
      public void removeBuyOrder(Integer orderID) {

        getOrderRegistry().remove(orderID);
    }   
    
}
