package is.projekt;

import java.io.Serializable;
import java.util.HashMap;

/**
 *
 * @author svalan
 */
public class Registry implements Serializable {

    private HashMap<Integer, Boat> boatRegistry = new HashMap<>();
    private HashMap<Integer, Customer> customerRegistry = new HashMap<>();
    private HashMap<Integer, Goods> goodsRegistry = new HashMap<>();
    private HashMap<Integer, Order> orderRegistry = new HashMap<>();
    private int boatKeyCount = 0;
    private int customerKeyCount = 0;
    private int goodsKeyCount = 0;
    private int orderKeyCount = 0;

    //Getters
    public HashMap<Integer, Boat> getBoatRegistry() {
        return boatRegistry;
    }

    public HashMap<Integer, Customer> getCustomerRegistry() {
        return customerRegistry;
    }

    public HashMap<Integer, Goods> getGoodsRegistry() {
        return goodsRegistry;
    }

    public HashMap<Integer, Order> getOrderRegistry() {
        return orderRegistry;
    }

    //Stadardiserade metoder för att få nya nyckar
    private int getNewBoatKey() {
        boatKeyCount++;
        return boatKeyCount;
    }

    private int getNewCustomerKey() {
        customerKeyCount++;
        return customerKeyCount;
    }

    private int getNewGoodsKey() {
        goodsKeyCount++;
        return goodsKeyCount;
    }

    public int getNewOrderKey() {
        orderKeyCount++;
        return orderKeyCount;
    }

    public void addCustomer(Customer c) {
        getCustomerRegistry().put(getNewCustomerKey(), c);
    }

    public void editCustomer(Integer customerID, Customer c) {
        getCustomerRegistry().put(customerID, c);


    }
    
    

    public void addGoods(Goods g) {

        getGoodsRegistry().put(this.getNewGoodsKey(), g);
    }
    
    public void addBuyOrder(Order o,Integer orderID) {
        getOrderRegistry().put(orderID, o);
    }

    public void removeCustomer(Integer customerID) {
        
        this.getCustomerRegistry().remove(customerID);
        
    }
}
