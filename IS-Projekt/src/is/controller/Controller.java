package is.controller;

import is.gui.MainWindow;
import is.projekt.Model;
import java.awt.event.ActionEvent;  
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.List;

/**
 * This class handles input from the user interface to the model.
 *
 * @param mainWindow The user interface.
 * @param model The model.
 */
public class Controller implements DataInterface {

    private MainWindow view;
    private Model model;

    public Controller(Model model, MainWindow view) {

        this.model = model;
        this.view = view;

    }

    private Model getModel() {
        return model;
    }

    private MainWindow getView() {
        return view;
    }

    @Override
    public void addCustomer(String name, String adressLn1, String adressLn2, String adressLn3, String phoneNumber, String eMail) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void editCustomer(String name, String adressLn1, String adressLn2, String adressLn3, String phoneNumber, String eMail) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List getCustomer(Integer customerID) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void removeCustomer(Integer customerID) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void addBoat(String regnr, String model, String location, String priceInfo, String description) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void editBoat(String regnr, String model, String location, String priceInfo, String description) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List getBoat(Integer boatID) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void removeBoat(Integer boatID) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void addOrder(Date billingDate, String billingAdressLn1, String billingAdressLn2, String billingAdressLn3, List orderRows, String customerID) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void editOrder(Date billingDate, String billingAdressLn1, String billingAdressLn2, String billingAdressLn3, List orderRows, String customerID) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List getOrder(Integer orderID) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void removeOrder(Integer orderID) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void addGoods(Double price, String description, String productNr) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void editGoods(Double price, String description, String productNr) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List getGoods(Integer goodsID) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void removeGoods(Integer goodsID) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

   
  


    }
