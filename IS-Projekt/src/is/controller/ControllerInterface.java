package is.controller;

import java.util.ArrayList;
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

    //Orderhantering
    public abstract void addOrder(Date billingDate, String billingAdressStreet, String billingAdressPostCode, String billingAdressCity, List orderRows, String customerID);

    public abstract void editOrder(Date billingDate, String billingAdressLn1, String billingAdressLn2, String billingAdressLn3, List orderRows, String customerID);

    public abstract List<String> getOrderData(Integer orderID);

    public abstract void removeOrder(Integer orderID);

    public abstract ListModel getOrderRowsListModel(Integer orderID);

    //Båthantering
    public abstract void addBoat(String regnr, String model, String location, String priceInfo, String description);

    public abstract void editBoat(String regnr, String model, String location, String priceInfo, String description);

    public abstract List<String> getBoat(Integer boatID);

    public abstract void removeBoat(Integer boatID);

    //Varuahantering
    public abstract void addGoods(String name, Double price, String description);

    public abstract void editGoods(Double price, String description, String productNr);

    public abstract List<String> getGoodsData(Integer goodsID);

    public abstract void removeGoods(Integer goodsID);

    public abstract ListModel getGoodsListModel();
}