package is.controller;

import java.util.List;
import javax.swing.ListModel;

/**
 * Interface som kontrollerar alla in och ut-metoder mellan controller och
 * model.
 *
 * @author Viktor Voigt
 * @author Anna Thernfrid
 * @author Eric Nordlund
 */
public interface ControllerInterface {

    //Kundhantering
    public abstract void addNewCustomer(String name, String addressStreet, String adressPostCode, String adressCity, String phoneNumber, String eMail);

    public abstract void editCustomer(int customerID, String name, String adressStreet, String adressPostCode, String adressCity, String phoneNumber, String eMail);

    public abstract String[] getCustomerData(int customerID);

    public abstract void removeCustomer(int customerID);

    public abstract ListModel<ListItem> getCustomerListModel();
    
    public abstract ListModel<ListItem> getCustomerListModel(String searchString);

    //Orderhantering
    public abstract int addBuyOrder(int customerID, int billingDate, String billingAdressStreet, String billingAdressPostCode, String billingAdressCity);

    public abstract void editOrder(int billingDate, String billingAddressStreet, String billingAddressPostCode, String billingAddressCity, int customerID, boolean isBuyOrder, int orderID);

    public abstract String[] getOrderData(int orderID);

    public abstract void removeBuyOrder(int orderID);

    public abstract ListModel<ListItem> getOrderListModel();

    public abstract ListModel<ListItem> getBuyOrderListModel();

    public abstract ListModel<ListItem> getSellOrderListModel();

    public abstract ListModel<ListItem> getOrderRowListModel(int orderID);
    
    public abstract ListModel<ListItem> getOrderListByCustomer(int CustomerID);

    public abstract GoodsListItem getGoodsListItem(int orderID);

    public abstract int addSellOrder(int customerID, int billingDate, String billingAdressStreet, String billingAdressPostCode, String billingAdressCity);

    public abstract void addGoodsOrderRow(int orderID, double price, int quantity, int goodsID);

    public abstract void addBoatOrderRow(int orderID, double price, int boatID);

    public abstract void clearOrderRows(int orderID);

    public abstract boolean isBuyorder(int orderID);

    //Båthantering
    public abstract void addBoat(String regnr, String model, String location, String description, double price);

    public abstract void editBoat(int boatID, String regnr, String model, String location, String description, double price);

    public abstract void removeBoat(int boatID);

    public abstract ListModel<ListItem> getBoatListModel();

    public abstract BoatListItem getBoatListItem(int boatID);

    public abstract String[] getBoatData(int boatID);

    //Varuhantering
    public abstract void addGoods(String name, double price, String description);

    public abstract void editGoods(int goodsID, String name, double price, String description);

    public abstract String[] getGoodsData(int goodsID);

    public abstract void removeGoods(int goodsID);

    public abstract ListModel<ListItem> getGoodsListModel();

    //Input-kontroll
    public abstract boolean inputCheckString(String s);

    public abstract boolean inputCheckDate(String s);
    
    public abstract boolean inputCheckPrice(String s);
}
