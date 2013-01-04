/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package is.projekt;

/**
 * @author Viktor Voigt
 */
public abstract class Product {

    private double price;
    private String description;
    private int productID;

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
    
    protected int getProductID(){
        
        return this.productID;
    }
    
    
}
