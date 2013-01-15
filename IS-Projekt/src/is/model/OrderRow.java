package is.model;

/**
 *
 * Klassen saknar setters. Vill man ändra en order row skapar man en ny och
 * skriver över.
 *
 * @author Viktor Voigt
 */
public class OrderRow {

    private double price;
    private int quantity;
    private Product product;

    public OrderRow(double price, int quantity, Product product) {
        this.product = product;
        this.price = price;
        this.quantity = quantity;
    }

    protected double getPrice() {
        return price;
    }

    protected int getQuantity() {
        return quantity;
    }

    protected Product getProduct() {
        return product;
    }

    protected boolean holdsBoat() {

        if (getProduct() instanceof Boat) {

            return true;
        } else {
            return false;
        }
    }

    protected boolean holdsGoods() {

        if (getProduct() instanceof Goods) {

            return true;
        } else {
            return false;
        }

    }

    protected int getProductID() {

        return getProduct().getProductID();

    }

    protected String getProductName() {
        return getProduct().getDisplayName();
    }
}