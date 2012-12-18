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
    public abstract void addCustomer(String name, String addressStreet, String adressPostCode, String adressCity, String phoneNumber, String eMail);

    public abstract void editCustomer(Integer customerID, String name, String adressStreet, String adressPostCode, String adressCity, String phoneNumber, String eMail);

    public abstract List<String> getCustomerData(Integer customerID);

    public abstract void removeCustomer(Integer customerID);

    public abstract DefaultListModel getCustomerListModel();

    //Köporderhantering
    public abstract void addBuyOrder(Date billingDate, String billingAdressStreet, String billingAdressPostCode, String billingAdressCity, List orderRows, Integer customerID, boolean isBuyOrder, Customer customerOjbect);

    public abstract void editBuyOrder(Date billingDate, String billingAddressStreet, String billingAddressPostCode, String billingAddressCity, Integer customerID, boolean isBuyOrder, Integer orderID);

    public abstract List<String> getBuyOrderData(Integer orderID);

    public abstract List<String> getOrderData(Integer customerID);

    public abstract void removeBuyOrder(Integer orderID);

    public abstract ListModel getOrderListModel();

    public abstract ListModel getBuyOrderRowsListModel(Integer orderID);

    public abstract GoodsListItem getGoodsListItem(Integer orderID);

    //Säljorderhantering
    public abstract void addSellOrder(int customerID, Date billingDate, String billingAdressStreet, String billingAdressPostCode, String billingAdressCity, ListItem[] orderRows);

    //Båthantering
    public abstract void addBoat(String regnr, String model, String location, String description, double price);

    public abstract void editBoat(int boatID, String regnr, String model, String location, String description, double price);

    public abstract void removeBoat(int boatID);

    public abstract ListModel getBoatListModel();

    public abstract BoatListItem getBoatListItem(int boatID);

    //Varuhantering
    public abstract void addGoods(String name, Double price, String description);

    public abstract void editGoods(Double price, String description, String productNr);

    public abstract List<String> getGoodsData(Integer goodsID);

    public abstract void removeGoods(Integer goodsID);

    public abstract ListModel getGoodsListModel();
}
