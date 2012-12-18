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

    public void addBoat(Boat b) {
        getBoatRegistry().put(getNewBoatKey(), b);
    }

    public void editBoat(Integer boatID, Boat b) {
        getBoatRegistry().put(boatID, b);
    }

    public void removeBoat(Integer boatID) {
        this.getBoatRegistry().remove(boatID);
    }

    public void addCustomer(Customer c) {
        getCustomerRegistry().put(getNewCustomerKey(), c);
    }

    public void editCustomer(Integer customerID, Customer c) {
        getCustomerRegistry().put(customerID, c);
    }
    public void removeCustomer(Integer customerID) {

        this.getCustomerRegistry().remove(customerID);
    }
    
    public Order getOrder(Integer orderID) {
        return orderRegistry.get(orderID);
    }

    
    
    

    public void addGoods(Goods g) {

        getGoodsRegistry().put(this.getNewGoodsKey(), g);
    }
    
    public String[] getGoodsData(int goodsID){
        
        String [] goodsData = getGoods(goodsID).getDataArray();
        
        return goodsData;
  
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

    private Goods getGoods(int goodsID) {
        
        return getGoodsRegistry().get(goodsID);
        
    }
   
}
