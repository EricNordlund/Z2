/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package is.projekt;

/**
 * En klass som representerar likformiga varor som tillbehör och reservdelar.
 */
public class Goods extends Product {

    private String name;

    public Goods(String name, double price, String description) {

        super(price, description);
        this.name = name;



    }

    @Override
    public String toString() {
        return name;
    }
}
