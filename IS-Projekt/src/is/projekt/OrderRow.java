package is.projekt;

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

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public Product getProduct() {
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

    int getProductID() {
        
        return getProduct().getProductID();

    }
    
    protected String getProductName()
            
    {
        return getProduct().getDisplayName();
    }
}