/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package is.projekt;

import java.io.Serializable;
import java.util.HashMap;

/**
 *
 * @author svalan
 */
public class Model implements Serializable {

    private HashMap<Integer, Boat> boatRegistry = new HashMap<>();
    private HashMap<Integer, Customer> customerRegistry = new HashMap<>();
    private HashMap<Integer, Goods> goodsRegistry = new HashMap<>();
    private HashMap<Integer, Order> orderRegistry = new HashMap<>();
    private int boatKeyCount = 0;
    private int customerKeyCount = 0;
    private int goodsKeyCount = 0;
    private int orderKeyCount = 0;

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

    private int getNewOrderKey() {
        orderKeyCount++;
        return orderKeyCount;
    }

    public void addCustomer(Customer c) {
        getCustomerRegistry().put(getNewCustomerKey(), c);
    }
}
