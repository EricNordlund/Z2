
package is.controller;


import java.util.Date;
import java.util.List;

/**
 * Interface som kontrollerar alla in och ut-metoder mellan controller och model.
 * @author Lärkan, Svalan och Thernan
 */
public interface DataInterface 
{
    
    public abstract void addCustomer(String name, String adressLn1, String adressLn2, String adressLn3, String phoneNumber, String eMail);
    public abstract void editCustomer(String name, String adressLn1, String adressLn2, String adressLn3, String phoneNumber, String eMail);
    public abstract List getCustomer(Integer customerID);
    public abstract void removeCustomer(Integer customerID);
    
    public abstract void addBoat(String regnr, String model, String location, String priceInfo, String description);
    public abstract void editBoat(String regnr, String model, String location, String priceInfo, String description);
    public abstract List getBoat(Integer boatID);
    public abstract void removeBoat(Integer boatID);
    
    public abstract void addOrder(Date billingDate, String billingAdressLn1, String billingAdressLn2, String billingAdressLn3, List orderRows, String customerID);
    public abstract void editOrder(Date billingDate, String billingAdressLn1, String billingAdressLn2, String billingAdressLn3, List orderRows, String customerID);
    public abstract List getOrder(Integer orderID);
    public abstract void removeOrder(Integer orderID);
    
    public abstract void addGoods(Double price, String description, String productNr);
    public abstract void editGoods(Double price, String description, String productNr);
    public abstract List getGoods(Integer goodsID);
    public abstract void removeGoods(Integer goodsID);
}
