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
    
    private HashMap <Integer, Order>     orderRegistry    = new HashMap<>();
    private HashMap <Integer, Customer>  customerRegistry = new HashMap<>();
    private HashMap <Integer, Boat>      boatRegistry     = new HashMap<>();
    private HashMap <Integer, Goods>     goodsRegistry    = new HashMap<>();

    public HashMap<Integer, Order> getOrderRegistry() {
        return orderRegistry;
    }

    public HashMap<Integer, Customer> getCustomerRegistry() {
        return customerRegistry;
    }

    public HashMap<Integer, Boat> getBoatRegistry() {
        return boatRegistry;
    }

    public HashMap<Integer, Goods> getGoodsRegistry() {
        return goodsRegistry;
    }
 
}
