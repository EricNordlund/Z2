package is.controller;

import is.projekt.BoatRegistry;
import is.projekt.CustomerRegistry;
import is.projekt.GoodsRegistry;
import is.projekt.OrderRegistry;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;

/**
 * This class handles input from the user interface to the model.
 *
 * @param mainWindow The user interface.
 * @param model The model.
 */
public class Controller implements ControllerInterface {

    private BoatRegistry boatRegistry;
    private OrderRegistry orderRegistry;
    private CustomerRegistry customerRegistry;
    private GoodsRegistry goodsRegistry;

    public Controller(BoatRegistry br, CustomerRegistry cr, GoodsRegistry gr, OrderRegistry or) {

        this.boatRegistry = br;
        this.customerRegistry = cr;
        this.goodsRegistry = gr;
        this.orderRegistry = or;

    }

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

    @Override
    public void addNewCustomer(String name, String addressStreet, String addressPostCode, String addressCity, String phoneNumber, String eMail) {


        this.getCustomerRegistry().addCustomer(name, addressStreet, addressPostCode, addressCity, phoneNumber, eMail);

    }

    //
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

    public ArrayList<String> getBoatData(Integer boatID) {

        ArrayList<String> boatData = getBoatRegistry().getBoatData(boatID);

        return boatData;
    }

    @Override
    public void editCustomer(Integer customerID, String name, String addressStreet,
            String addressPostCode, String addressCity, String phoneNumber, String eMail) {


        getCustomerRegistry().editCustomer(customerID, name, addressStreet,
                addressPostCode, addressCity, phoneNumber, eMail);

    }

    @Override
    public ArrayList<String> getCustomerData(Integer customerID) {

        ArrayList<String> customerData = getCustomerRegistry().getCustomerData(customerID);

        return customerData;

    }

    @Override
    public void removeCustomer(Integer customerID) {
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
    public DefaultListModel getCustomerListModel() {


        return this.getCustomerRegistry().getListModel();




    }

    @Override
    public void editGoods(int goodsID, String name, double price, String description) {
        this.goodsRegistry.editGoods(goodsID, name, price, description);
    }

    @Override
    public void removeGoods(Integer goodsID) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String[] getGoodsData(Integer goodsID) {
        return this.goodsRegistry.getGoodsData(goodsID);
    }

    @Override
    public ListModel getGoodsListModel() {

        return this.getGoodsRegistry().getGoodsListModel();
    }

    @Override
    public int addBuyOrder(int customerID, int billingDate, String billingAdressStreet, String billingAdressPostCode, String billingAdressCity) {

        return this.getOrderRegistry().addBuyOrder(customerID, billingDate, billingAdressStreet, billingAdressPostCode, billingAdressCity);

    }

    @Override
    public void editBuyOrder(int billingDate, String billingAddressStreet, String billingAddressPostCode,
            String billingAddressCity, Integer customerID, boolean isBuyOrder, Integer orderID) {


        getOrderRegistry().editBuyOrder(billingDate, billingAddressStreet, billingAddressPostCode,
                billingAddressCity, customerID, isBuyOrder, orderID);
    }

    @Override
    public List<String> getBuyOrderData(Integer orderID) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void removeBuyOrder(Integer orderID) {
        getOrderRegistry().removeBuyOrder(orderID);
    }

    @Override
    public ListModel getOrderRowListModel(int orderID) {

        return this.getOrderRegistry().getOrderRowListModel(orderID);
    }

    @Override
    public ListModel getBoatListModel() {

        return this.getBoatRegistry().getListModel();
    }

    @Override
    public ListModel getOrderListModel() {

        return this.getOrderRegistry().getOrderListModel();
    }

    @Override
    public ArrayList<String> getOrderData(Integer orderID) {

        ArrayList<String> orderData = getOrderRegistry().getDataArray(orderID);

        return orderData;
    }

    @Override
    public GoodsListItem getGoodsListItem(Integer goodsID) {

        GoodsListItem gli;

        String[] goodsData = getGoodsRegistry().getGoodsData(goodsID);

        String displayName = goodsData[0];
        double price = Double.valueOf(goodsData[1]);

        gli = new GoodsListItem(goodsID, displayName, price, 1);

        return gli;

    }

    @Override
    public BoatListItem getBoatListItem(int boatID) {

        BoatListItem bli;

        ArrayList<String> a = this.getBoatData(boatID);

        String displayName = a.get(1) + " " + a.get(2);

        double price = Double.valueOf(a.get(5));

        bli = new BoatListItem(boatID, displayName, price);

        return bli;

    }

    @Override
    public void addSellOrder(int customerID, int billingDate, String billingAdressStreet, String billingAdressPostCode, String billingAdressCity, ListItem[] orderRows) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void addGoods(String name, double price, String description) {
        goodsRegistry.addGoods(name, price, description);
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
}
