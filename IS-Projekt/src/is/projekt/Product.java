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
    
    public Product(double price, String description){
        
        this.price = price;
        this.description = description;
        
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
    
}
