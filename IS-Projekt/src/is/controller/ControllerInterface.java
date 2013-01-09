package is.controller;

import is.projekt.Customer;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;

/**
 * Interface som kontrollerar alla in och ut-metoder mellan controller och
 * model.
 *
 * @author Lärkan, Svalan och Thernan och Tratten och Finken
 */
public interface ControllerInterface {

    //Kundhantering
    public abstract void addNewCustomer(String name, String addressStreet, String adressPostCode, String adressCity, String phoneNumber, String eMail);

    public abstract void editCustomer(int customerID, String name, String adressStreet, String adressPostCode, String adressCity, String phoneNumber, String eMail);

    public abstract List<String> getCustomerData(int customerID);

    public abstract void removeCustomer(int customerID);

    public abstract DefaultListModel getCustomerListModel();

    //Orderhantering
    public abstract int addBuyOrder(int customerID, int billingDate, String billingAdressStreet, String billingAdressPostCode, String billingAdressCity);

    public abstract void editBuyOrder(int billingDate, String billingAddressStreet, String billingAddressPostCode, String billingAddressCity, int customerID, boolean isBuyOrder, int orderID);

    public abstract List<String> getBuyOrderData(int orderID);

    public abstract List<String> getOrderData(int customerID);

    public abstract void removeBuyOrder(int orderID);

    public abstract ListModel getOrderListModel();

    public abstract ListModel getOrderRowListModel(int orderID);

    public abstract GoodsListItem getGoodsListItem(int orderID);

    public abstract void addSellOrder(int customerID, int billingDate, String billingAdressStreet, String billingAdressPostCode, String billingAdressCity, ListItem[] orderRows);

    public abstract void addGoodsOrderRow(int orderID, double price, int quantity, int goodsID);

    public abstract void addBoatOrderRow(int orderID, double price, int boatID);

    public abstract void clearOrderRows(int orderID);

    //Båthantering
    public abstract void addBoat(String regnr, String model, String location, String description, double price);

    public abstract void editBoat(int boatID, String regnr, String model, String location, String description, double price);

    public abstract void removeBoat(int boatID);

    public abstract ListModel getBoatListModel();

    public abstract BoatListItem getBoatListItem(int boatID);
    
    public abstract String[] getBoatData(int boatID);

    //Varuhantering
    public abstract void addGoods(String name, double price, String description);

    public abstract void editGoods(int goodsID, String name, double price, String description);

    public abstract String[] getGoodsData(int goodsID);

    public abstract void removeGoods(int goodsID);

    public abstract ListModel getGoodsListModel();
}
