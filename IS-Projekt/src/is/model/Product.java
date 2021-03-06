package is.model;

import java.text.DecimalFormat;

/**
 * @author Viktor Voigt
 * @author Anna Thernfrid
 * @author Eric Nordlund
 */
public abstract class Product {

    private int productID;
    private double price;
    private String description;

    protected Product(int productID, double price, String description) {

        this.productID = productID;
        this.price = price;
        this.description = description;

    }

    protected double getPrice() {
        return price;
    }

    protected void setPrice(double price) {
        this.price = price;
    }

    protected String getDescription() {
        return description;
    }

    protected void setDescription(String description) {
        this.description = description;
    }

    protected int getProductID() {

        return this.productID;
    }

    protected String getProductIDString() {

        return Integer.toString(this.getProductID());
    }

    protected String getPriceString() {

        DecimalFormat df = new DecimalFormat("##.00");

        String priceString = df.format(this.getPrice());

        return priceString;

    }

    /**
     * Denna metod måste ha separata versioner i Boat och Goods då deras
     * visningsnamn konstrueras olika
     */
    protected abstract String getDisplayName();
}
