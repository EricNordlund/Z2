/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package is.model;

/**
 * Det här klassen låter det olika registen få referenser från varandra.
 *
 * @author Viktor
 */
public class ReferenceHandler {

    private BoatRegistry boatRegistry;
    private CustomerRegistry customerRegistry;
    private GoodsRegistry goodsRegistry;
    private OrderRegistry orderRegistry;

    public void setBoatRegistry(BoatRegistry boatRegistry) {
        this.boatRegistry = boatRegistry;
        this.getBoatRegistry().setReferenceHandler(this);
    }

    public void setCustomerRegistry(CustomerRegistry customerRegistry) {
        this.customerRegistry = customerRegistry;
        customerRegistry.setReferenceHandler(this);
    }

    public void setGoodsRegistry(GoodsRegistry goodsRegistry) {
        this.goodsRegistry = goodsRegistry;
        goodsRegistry.setReferenceHandler(this);
    }

    public void setOrderRegistry(OrderRegistry orderRegistry) {
        this.orderRegistry = orderRegistry;
        orderRegistry.setReferenceHandler(this);
    }

    private BoatRegistry getBoatRegistry() {
        return boatRegistry;
    }

    private CustomerRegistry getCustomerRegistry() {
        return customerRegistry;
    }

    private GoodsRegistry getGoodsRegistry() {
        return goodsRegistry;
    }

    private OrderRegistry getOrderRegistry() {
        return orderRegistry;
    }

    protected Boat getBoat(int boatID) {

        return getBoatRegistry().getBoat(boatID);
    }

    protected Customer getCustomer(int customerID) {

        return this.getCustomerRegistry().getCustomer(customerID);

    }

    protected Goods getGoods(int goodsID) {

        return this.getGoodsRegistry().getGoods(goodsID);
    }

    protected Order getOrder(int orderID) {

        return this.getOrderRegistry().getOrder(orderID);

    }
}
