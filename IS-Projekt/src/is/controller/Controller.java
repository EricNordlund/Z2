package is.controller;

import is.model.BoatRegistry;
import is.model.CustomerRegistry;
import is.model.GoodsRegistry;
import is.model.OrderRegistry;
import is.model.listitems.BoatListItem;
import is.model.listitems.GoodsListItem;
import is.model.listitems.ListItem;
import is.model.tools.InputChecker;
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
    private InputChecker inputChecker;

    public Controller(BoatRegistry br, CustomerRegistry cr, GoodsRegistry gr, OrderRegistry or) {

        this.boatRegistry = br;
        this.customerRegistry = cr;
        this.goodsRegistry = gr;
        this.orderRegistry = or;

        this.inputChecker = new InputChecker();

    }

    //Getters för registren
    private BoatRegistry getBoatRegistry() {

        return this.boatRegistry;

    }

    private OrderRegistry getOrderRegistry() {

        return this.orderRegistry;

    }

    private CustomerRegistry getCustomerRegistry() {

        return this.customerRegistry;

    }

    private GoodsRegistry getGoodsRegistry() {

        return this.goodsRegistry;

    }

    private InputChecker getInputChecker() {

        return this.inputChecker;

    }

    //#######################################################################
    //############## CUSTOMER ###############################################
    //#######################################################################
    @Override
    public void addNewCustomer(String name, String addressStreet, String addressPostCode,
            String addressCity, String phoneNumber, String eMail) {

        this.getCustomerRegistry().addCustomer(name, addressStreet, addressPostCode, addressCity, phoneNumber, eMail);

    }

    @Override
    public void editCustomer(int customerID, String name, String addressStreet,
            String addressPostCode, String addressCity, String phoneNumber, String eMail) {

        getCustomerRegistry().editCustomer(customerID, name, addressStreet,
                addressPostCode, addressCity, phoneNumber, eMail);

    }

    @Override
    public String[] getCustomerData(int customerID) {

        String[] customerData = getCustomerRegistry().getCustomerData(customerID);

        return customerData;

    }

    @Override
    public void removeCustomer(int customerID) {

        getCustomerRegistry().removeCustomer(customerID);

    }

    @Override
    public ListModel<ListItem> getCustomerListModel(String searchString) {

        return this.getCustomerRegistry().getListModel(searchString);

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
    public void editOrder(int billingDate, String billingAddressStreet, String billingAddressPostCode,
            String billingAddressCity, int customerID, boolean isBuyOrder, int orderID) {

        getOrderRegistry().editOrder(billingDate, billingAddressStreet, billingAddressPostCode,
                billingAddressCity, customerID, isBuyOrder, orderID);

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
    public ListModel<ListItem> getOrderListByCustomer(int customerID) {

        return this.getOrderRegistry().getOrderListByCustomer(customerID);

    }

    @Override
    public String[] getOrderData(int orderID) {

        String[] orderData = getOrderRegistry().getDataArray(orderID);

        return orderData;
    }

    @Override
    public int addSellOrder(int customerID, int billingDate, String billingAdressStreet,
            String billingAdressPostCode, String billingAdressCity) {

        return this.getOrderRegistry().addSellOrder(customerID, billingDate, billingAdressStreet, billingAdressPostCode, billingAdressCity);

    }

    @Override
    public boolean isBuyorder(int orderID) {

        return this.getOrderRegistry().isBuyOrder(orderID);

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

        return this.getBoatRegistry().getBoatListItem(boatID);

    }

    //########################################################################
    //############## GOODS ###################################################
    //########################################################################
    @Override
    public void editGoods(int goodsID, String name, double price, String description) {

        this.getGoodsRegistry().editGoods(goodsID, name, price, description);

    }

    @Override
    public void removeGoods(int goodsID) {

        this.getGoodsRegistry().removeGoods(goodsID);

    }

    @Override
    public String[] getGoodsData(int goodsID) {

        return this.getGoodsRegistry().getGoodsData(goodsID);
    }

    @Override
    public ListModel<ListItem> getGoodsListModel() {

        return this.getGoodsRegistry().getSimpleGoodsListModel();
    }

    @Override
    public GoodsListItem getGoodsListItem(int goodsID) {

        return this.getGoodsRegistry().getGoodsListItem(goodsID);

    }

    @Override
    public void addGoods(String name, double price, String description) {

        this.getGoodsRegistry().addGoods(name, price, description);

    }

    //#######################################################################
    //################# INPUT CHECKING ######################################
    //#######################################################################
    @Override
    public boolean inputCheckString(String s) {

        return this.getInputChecker().checkString(s);

    }

    @Override
    public boolean inputCheckDate(String s) {

        return this.getInputChecker().checkDate(s);

    }

    @Override
    public boolean inputCheckPrice(String s) {

        return this.getInputChecker().checkStringToDouble(s);

    }

    @Override
    public double getDouble(String s) {

        return this.getInputChecker().parseStringToDouble(s);

    }
}
