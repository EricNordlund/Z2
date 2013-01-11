package is.controller;

import is.projekt.BoatRegistry;
import is.projekt.CustomerRegistry;
import is.projekt.GoodsRegistry;
import is.projekt.InputCheck;
import is.projekt.OrderRegistry;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ListModel;

/**
 * This class handles input from the user interface to the model.
 *
 * @param mainWindow The user interface.
 * @param model The model.
 * 
 */
public class Controller implements ControllerInterface {

    private BoatRegistry boatRegistry;
    private OrderRegistry orderRegistry;
    private CustomerRegistry customerRegistry;
    private GoodsRegistry goodsRegistry;
    public InputCheck inputCheck = new InputCheck();

    public Controller(BoatRegistry br, CustomerRegistry cr, GoodsRegistry gr, OrderRegistry or) {

        this.boatRegistry = br;
        this.customerRegistry = cr;
        this.goodsRegistry = gr;
        this.orderRegistry = or;

    }
    
    //Getters för registren

    public BoatRegistry getBoatRegistry() {
        return boatRegistry;
    }

    public OrderRegistry getOrderRegistry() {
        return orderRegistry;
    }

    public CustomerRegistry getCustomerRegistry() {
        return customerRegistry;
    }

    public GoodsRegistry getGoodsRegistry() {
        return goodsRegistry;
    }
    
    //#######################################################################
    //############## CUSTOMER ###############################################
    //#######################################################################
    
    @Override
    public void addNewCustomer(String name, String addressStreet, String addressPostCode, String addressCity, String phoneNumber, String eMail) {


        this.getCustomerRegistry().addCustomer(name, addressStreet, addressPostCode, addressCity, phoneNumber, eMail);

    }

    @Override
    public void editCustomer(int customerID, String name, String addressStreet,
            String addressPostCode, String addressCity, String phoneNumber, String eMail) {


        getCustomerRegistry().editCustomer(customerID, name, addressStreet,
                addressPostCode, addressCity, phoneNumber, eMail);

    }

    @Override
    public ArrayList<String> getCustomerData(int customerID) {

        ArrayList<String> customerData = getCustomerRegistry().getCustomerData(customerID);

        return customerData;

    }

    @Override
    public void removeCustomer(int customerID) {
        getCustomerRegistry().removeCustomer(customerID);

        System.out.println("Removing customer " + customerID + ".");
    }

    /**
     * Denna metod returnerar en DefaultListModel som håller värden från den
     * HashMap som lagrar kunderna. En DefaultListModel kan användas av en
     * JList.
     *
     * @param it En iterator går igenom samtliga objekt i HashMap för kunderna.
     * @param e Ett objekt som plockas fram ur HashMap som innehåller nyckeln
     * och kundobjektet.
     *
     *
     */
    @Override
    public ListModel<ListItem> getCustomerListModel() {

        return this.getCustomerRegistry().getListModel();

    }
    //########################################################################
    //################### ORDERS #############################################
    //########################################################################

    @Override
    public int addBuyOrder(int customerID, int billingDate, String billingAdressStreet, String billingAdressPostCode, String billingAdressCity) {

        return this.getOrderRegistry().addBuyOrder(customerID, billingDate, billingAdressStreet, billingAdressPostCode, billingAdressCity);

    }

    @Override
    public void editBuyOrder(int billingDate, String billingAddressStreet, String billingAddressPostCode,
            String billingAddressCity, int customerID, boolean isBuyOrder, int orderID) {


        getOrderRegistry().editBuyOrder(billingDate, billingAddressStreet, billingAddressPostCode,
                billingAddressCity, customerID, isBuyOrder, orderID);
    }

    @Override
    public List<String> getBuyOrderData(int orderID) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void removeBuyOrder(int orderID) {
        getOrderRegistry().removeBuyOrder(orderID);
    }

    @Override
    public ListModel<ListItem> getOrderRowListModel(int orderID) {

        return this.getOrderRegistry().getOrderRowListModel(orderID);
    }

    @Override
    public ListModel<ListItem> getOrderListModel() {

        return this.getOrderRegistry().getOrderListModel();
        
        
    }

    @Override
    public ListModel<ListItem> getBuyOrderListModel() {
        return this.getOrderRegistry().getBuyOrderListModel();
    }

    @Override
    public ListModel<ListItem> getSellOrderListModel() {
       return this.getOrderRegistry().getSellOrderListModel();
    }
    
    
    @Override
    public ArrayList<String> getOrderData(int orderID) {

        ArrayList<String> orderData = getOrderRegistry().getDataArray(orderID);

        return orderData;
    }

    @Override
    public int addSellOrder(int customerID, int billingDate, String billingAdressStreet, String billingAdressPostCode, String billingAdressCity) {
        
        return this.getOrderRegistry().addSellOrder(customerID, billingDate, billingAdressStreet, billingAdressPostCode, billingAdressCity);
        
    }

    @Override
    public boolean isBuyorder(int orderID) {
        
        boolean b;

        b = this.getOrderRegistry().isBuyOrder(orderID);

        return b;
    }

    @Override
    public void addGoodsOrderRow(int orderID, double price, int quantity, int productID) {

        this.getOrderRegistry().addGoodsOrderRow(orderID, price, quantity, productID);

    }

    @Override
    public void clearOrderRows(int orderID) {
        this.getOrderRegistry().clearOrderRows(orderID);
    }

    @Override
    public void addBoatOrderRow(int orderID, double price, int boatID) {
        this.getOrderRegistry().addBoatOrderRow(orderID, price, boatID);
    }

    //######################################################################
    //########## BOAT ######################################################
    //######################################################################
    @Override
    public void addBoat(String regnr, String model, String location, String description, double price) {

        this.getBoatRegistry().addBoat(regnr, model, location, description, price);

    }

    @Override
    public void editBoat(int boatID, String regnr, String model, String location, String description, double price) {




        getBoatRegistry().editBoat(boatID, regnr, model, location, description, price);

    }

    @Override
    public void removeBoat(int boatID) {
        getBoatRegistry().removeBoat(boatID);

        System.out.println("Removing boat " + boatID + ".");
    }

    @Override
    public String[] getBoatData(int boatID) {

        String[] boatData = getBoatRegistry().getBoatData(boatID);

        return boatData;
    }

    @Override
    public ListModel<ListItem> getBoatListModel() {

        return this.getBoatRegistry().getListModel();
    }

    @Override
    public BoatListItem getBoatListItem(int boatID) {

        
        //Hämtar nödvändig data
        String[] boatDataArray = this.getBoatData(boatID);

        String displayName = boatDataArray[1] + " " + boatDataArray[2];
        
        String priceString = boatDataArray[5];

        double price = Double.valueOf(priceString);

        //Skapar ett BoatListItem
        BoatListItem bli = new BoatListItem(boatID, displayName, price);

        return bli;

    }

    //########################################################################
    //############## GOODS ###################################################
    //########################################################################
    @Override
    public void editGoods(int goodsID, String name, double price, String description) {
        this.goodsRegistry.editGoods(goodsID, name, price, description);
    }

    @Override
    public void removeGoods(int goodsID) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String[] getGoodsData(int goodsID) {
        return this.goodsRegistry.getGoodsData(goodsID);
    }

    @Override
    public ListModel<ListItem> getGoodsListModel() {

        return this.getGoodsRegistry().getGoodsListModel();
    }

    @Override
    public GoodsListItem getGoodsListItem(int goodsID) {

        //Hämtar nödvändig data
        String[] goodsDataArray = getGoodsRegistry().getGoodsData(goodsID);

        String displayName = goodsDataArray[0];
             
        double price = Double.valueOf(goodsDataArray[1]);

        //Skapar ett GoodsListItem
        GoodsListItem gli = new GoodsListItem(goodsID, displayName, price, 1);

        return gli;

    }

    @Override
    public void addGoods(String name, double price, String description) {
        goodsRegistry.addGoods(name, price, description);
    }

    //#######################################################################
    //################# INPUT CHECKING ######################################
    //#######################################################################
    @Override
    public boolean inputCheckString(String s) {
        return this.inputCheck.chekString(s);
    }

    @Override
    public boolean inputCheckDate(String s) {
        return this.inputCheck.checkDate(s);
    }
    
    
}
