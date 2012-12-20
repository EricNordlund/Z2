/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package is.projekt;

import is.controller.Controller;
import is.controller.ListItem;
import java.util.HashMap;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author anna_thernfrid
 */
public class OrderRegistry {

    private HashMap<Integer, Order> orderRegistry = new HashMap<>();
    private int orderKeyCount = 0;
    private Controller controller;

    public HashMap<Integer, Order> getOrderList() {
        return orderRegistry;
    }

    public int getNewOrderKey() {
        orderKeyCount++;
        return orderKeyCount;
    }

    public Order getOrder(Integer orderID) {
        return orderRegistry.get(orderID);
    }

    public void addBuyOrder(Order o, Integer orderID) {
        getOrderList().put(orderID, o);
    }

    public void editBuyOrder(Order o, Integer orderID) {
        getOrderList().put(orderID, o);
    }

    public void removeBuyOrder(Integer orderID) {

        getOrderList().remove(orderID);
    }

    
    
    public void addSellOrder(int customerID, int billingDate, String billingAdressStreet, String billingAdressPostCode, String billingAdressCity, ListItem[] listItemArray){
        
        Address billingAddress = new Address(billingAdressStreet, billingAdressPostCode, billingAdressCity);
        
        SellOrder so = new SellOrder(getNewOrderKey(), billingDate, billingAddress, customerID);
        
        for (ListItem li : listItemArray){
            
            so.addOrderRow(li); 
        }
        
        getOrderList().put(so.getOrderID(), so);
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }
}
