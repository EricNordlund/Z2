package is.projekt;

/**
 * 
 * Klassen saknar setters. Vill man ändra en order row skapar man en ny och skriver över.
 * @author Viktor Voigt
 */
public class OrderRow {

    private double price;
    private int quantity;
    private Product product;

    public OrderRow(Product product, float price, int quantity) {
        this.product = product;
        this.price = price;
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public Product getProduct() {
        return product;
    }
}